package project2;

public class Car {
    private  String brand;
    private String model;
    private float speed ;

     public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void acclerate(){
        speed+=10;
        System.out.println("Speed is " + speed);
    }
}
