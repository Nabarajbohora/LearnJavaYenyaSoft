package Variable;


public class School {
    String StudentName;//that is instance variable
    static String SchoolName = "Shahid Smarak college ";
    static int TotalStudent =0;

//    constructor
    School (String name){
        StudentName = name; //instance calling assign
        TotalStudent++;  //calling Static

    }
    public void displayInfo(){
        String greeting ="Nameste";
        System.out.println(greeting +" ! my name is "+StudentName);
        System.out.println("Iam Studying at  "+SchoolName);

    }
    public static void main(String[]args){
        School s1 = new School("Ram");
        s1.displayInfo();
        School s2 = new School("Nabaraj");
        s2.displayInfo();
        School s3 = new School("bikalp");
        s3.displayInfo();
        System.out.println("total number of students:"+TotalStudent);
    }
}