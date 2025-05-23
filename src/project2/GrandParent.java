package project2;

public class GrandParent {

    private final boolean hasSuperpowers;
    private int age ;
    @SuppressWarnings("unused")
    private final String name;
    public GrandParent(int age, String name){
        this.age = age;
        this.name = name;
        hasSuperpowers = true;
        System.out.println("GrandParent Construtor Called");
    }
    public void hasSuper(){
        System.out.println(hasSuperpowers);
    }

    public int getAge(){
        return age;
    }

    public void setage(int age){
        this.age = age;
    }

}
