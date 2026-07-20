package threads;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "{id:" + id + ", name:'" + name + "', email:'" + email + "'}";
    }
}

class UserNotFoundException extends RuntimeException {
    private int userId;

    public UserNotFoundException(String message, int userId) {
        super(message);
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }
}

class InvalidUserInputException extends RuntimeException {
    public InvalidUserInputException(String message) {
        super(message);
    }
}

class UserRepository {
    private static final Map<Integer, User> DATABASE = new ConcurrentHashMap<>();

    static {
        DATABASE.put(1, new User(1, "Ram Sharma", "ram@mail.com"));
        DATABASE.put(2, new User(2, "Sita Thapa", "sita@mail.com"));
        DATABASE.put(3, new User(3, "Hari Gurung", "hari@mail.com"));
        System.out.println("[Database] Initialized. 3 Users pre-loaded.");
    }

    public static User findById(int id) {
        return DATABASE.get(id);
    }

    public static void save(User user) {
        DATABASE.put(user.getId(), user);
    }
}

class UserService {
    public static User getUserById(int id) {
        if (id <= 0) {
            throw new InvalidUserInputException(
                    " Input Error: User ID " + id + " is invalid. ID must be a positive number."
            );
        }

        User user = UserRepository.findById(id);

        if (user == null) {
            throw new UserNotFoundException(
                    " Business Error: User ID " + id + " not found.",
                    id
            );
        }

        return user;
    }
}

class GlobalExceptionHandler {
    public static String handleException(Throwable throwable, String requestURI) {
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("timestamp", System.currentTimeMillis());
        errorResponse.put("path", requestURI);

        if (throwable instanceof UserNotFoundException) {
            UserNotFoundException ex = (UserNotFoundException) throwable;
            errorResponse.put("status", 404);
            errorResponse.put("error", "User Not Found");
            errorResponse.put("message", ex.getMessage());
            errorResponse.put("requested_id", ex.getUserId());
        } else if (throwable instanceof InvalidUserInputException) {
            errorResponse.put("status", 400);
            errorResponse.put("error", "Bad Request");
            errorResponse.put("message", throwable.getMessage());
        } else {
            errorResponse.put("status", 500);
            errorResponse.put("error", "Internal Server Error");
            errorResponse.put("message", throwable.getMessage());
        }

        errorResponse.put("trace", throwable.getClass().getSimpleName());
        return errorResponse.toString();
    }
}

class UserController {
    public static String getUser(int id) {
        String requestPath = "/user/" + id;
        System.out.println(" [Controller] Request received: " + requestPath);

        try {
            User user = UserService.getUserById(id);
            return " [SUCCESS] " + requestPath + " -> " + user.toString();
        } catch (Exception e) {
            throw e;
        }
    }
}

public class WebAppSimulation {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            String simulatedPath = thread.getName().contains("Request")
                    ? thread.getName().substring(thread.getName().indexOf("/"))
                    : "/unknown";

            String jsonError = GlobalExceptionHandler.handleException(throwable, simulatedPath);

            System.out.println("[GLOBAL HANDLER] Exception caught! Sending Error Response:");
            System.out.println("   " + jsonError);
            System.out.println("--------------------------------------------------");
        });

        System.out.println("========== WEB APPLICATION STARTED ==========");
        System.out.println("Thread-safe DB has 3 users: ID 1, 2, 3");
        System.out.println(" Sending multiple concurrent requests...\n");

        new Thread(() -> {
            String response = UserController.getUser(1);
            System.out.println("[Client 1] Response: " + response);
        }, "Client-Thread-1 /user/1").start();

        new Thread(() -> {
            String response = UserController.getUser(3);
            System.out.println(" [Client 2] Response: " + response);
        }, "Client-Thread-2 /user/3").start();

        new Thread(() -> {
            String response = UserController.getUser(5);
            System.out.println(" [Client 3] Response: " + response);
        }, "Client-Thread-3 /user/5").start();

        new Thread(() -> {
            String response = UserController.getUser(-10);
            System.out.println(" [Client 4] Response: " + response);
        }, "Client-Thread-4 /user/-10").start();

        new Thread(() -> {
            String response = UserController.getUser(2);
            System.out.println(" [Client 5] Response: " + response);
        }, "Client-Thread-5 /user/2").start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n ========== WEB APPLICATION SHUTDOWN ==========");
        System.out.println(" No thread crashed the Server.");
        System.out.println("All errors were gracefully handled.");
    }
}