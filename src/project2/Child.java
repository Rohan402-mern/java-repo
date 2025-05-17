package project2;

public class Child extends Parent {
    public Child(int age,String name){
        super(age, name);
        System.out.println("Child Constructor Called");
    }

     public void ChildMethod(){
       
        System.out.println("Child Method Called");
         super.ParentMethod();
        System.out.println( super.getAge());
    }

}
