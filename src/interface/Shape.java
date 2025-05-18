package Interface;

public interface Shape {

     double getArea();
     double getPerimeter();
     
     public default void info(){
          System.out.println("shape is info");
     }
}
