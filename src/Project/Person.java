package Project;

public class Person {
     final String name ;
    private final int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayinfo(){
        System.out.println("name:" + name + " age: " + age);
    }

}
