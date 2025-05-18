package Interface;

public class Circle implements Shape {
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }

@Override
public double getArea(){
    return Math.PI*radius*radius;
}

@Override
public double getPerimeter(){
    return 2*Math.PI*radius;
}

@Override
 public void info(){
          System.out.println("circle is info");
     }

}
