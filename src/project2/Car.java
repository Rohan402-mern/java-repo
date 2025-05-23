package project2;

public class Car {
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private  String brand;
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
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
