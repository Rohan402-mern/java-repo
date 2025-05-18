package Interface;

public class Computer {
    private String brand;
    private String model;
    private OperatingSystem os;

    public Computer(String brand,String model,String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOs(){
        return os;
    }

    public static class USB{
        private String Type;

        public USB(String Type){
            this.Type = Type;
        }

        
        public void getUSB(){
            System.out.println("USB Type: " + Type);
        }
    }

    public class OperatingSystem{

        private String osName;

        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model: " + model + ", OS:" + osName);
        }

    } 

}
