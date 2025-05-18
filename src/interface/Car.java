package Interface;

public class Car {
    private final String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    public class Engine{
        public void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + " engine is started");
            }
            else{
                System.out.println(model + " engine is Already On");
            }
        }

       public void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + " engine stopped");
            }
            else{
                System.out.println(model + " engine is Already Off");
            }
        }

    }

     public class NamePlate{
        private String nameplate;

        public NamePlate(String nameplate){
            this.nameplate = nameplate;
        }

        public void getNamePlate(){
            System.out.println("nameplate of " + model + ": " + nameplate);
        }
    }

}
