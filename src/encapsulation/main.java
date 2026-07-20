package encapsulation;

class Employee {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else{
            throw new IllegalArgumentException("name could not be empity");

        }

        }
    public int getAge() {
        return age;
    }
        public void setAge(int age){
        if(age>= 18 && age<= 65){
            this.age= age;

        }else{
            throw new IllegalArgumentException("Age most be between 18 to 65");
        }

    }
}
public class main{
    public static void main(String[]args){

        Employee emp = new Employee();
        System.out.println("----Testing valid  inputs----");
        try{
            emp.setName("nabaraj");
            emp.setAge(20);
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee Age: " + emp.getAge());
        }catch(IllegalArgumentException e){
            System.out.println("errors:"+e.getMessage());

        }
        System.out.println("\n--- Testing Invalid Inputs (Name) ---");
        try {
            emp.setName("   "); // Only spaces
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("\n--- Testing Invalid Inputs (Age) ---");

        try {
            emp.setAge(16); // Below 18
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            emp.setAge(70); // Above 65
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }


    }

}
