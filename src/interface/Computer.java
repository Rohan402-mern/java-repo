package Interface;

public class Computer {
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private String brand;
    @SuppressWarnings("FieldMayBeFinal")
    private String model;
    @SuppressWarnings("FieldMayBeFinal")
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
        @SuppressWarnings("FieldMayBeFinal")
        private String Type;

        public USB(String Type){
            this.Type = Type;
        }

        
        public void getUSB(){
            System.out.println("USB Type: " + Type);
        }
    }

    public class OperatingSystem{

        @SuppressWarnings("FieldMayBeFinal")
        private String osName;

        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model: " + model + ", OS:" + osName);
        }

    } 

}
