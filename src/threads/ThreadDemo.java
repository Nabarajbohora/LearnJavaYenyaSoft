package threads;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                // 3. RUNNING: Code executes here
                System.out.println("Thread is running...");

                // 4. TIMED_WAITING: Thread pauses for 2 seconds
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }); // 1. NEW: Object is created

        // 2. RUNNABLE: Thread is registered with the OS scheduler
        thread.start();
        thread.getPriority();

        // Wait for the thread to finish
        thread.join();

        // 5. TERMINATED: Thread is dead
        System.out.println("Thread state: " + thread.getState());
    }
}
