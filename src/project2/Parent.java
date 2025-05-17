package project2;

public class Parent extends GrandParent{
    public Parent(int age, String name){
        super(age,name);
        System.out.println("Parent Constructor Called");
    }

     public void ParentMethod(){
        
        System.out.println("Parent Method Called");
    }
    
}
