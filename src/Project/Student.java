package Project;

public class Student extends Person {
    
    private final String courses;

    public static String country = "INDIA";

    public Student(String name, int age, String courses){
        super(name, age);
        this.courses = courses;
    }


    public void study(){
        System.out.println(name + " is Studying " + courses);
    }
    public static void getcount(){
        System.out.println("get count");
    } 
}
