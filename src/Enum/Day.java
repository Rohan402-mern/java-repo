package Enum;

public enum Day {

    Sunday("sunday"),
    monday("monday"),
    tuesday("tuesday");

    private Day(String lower){
        System.out.println("construtor called");
        this.lower = lower;
    }

    private final String lower;

    public void getLower(){
        System.out.println(lower);
    }

}
