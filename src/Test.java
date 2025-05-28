

enum Operation {
    ADD,SUBSTRACT,MULTIPY,DIVIDE;

    public <T extends Number> double apply(T a,T b){
       switch(this){
        case ADD -> {
            return a.doubleValue() + b.doubleValue();
            }
        case MULTIPY ->{
            return  a.doubleValue() * b.doubleValue();
            }
        case SUBSTRACT ->{
            return  a.doubleValue() - b.doubleValue();
            }
        case DIVIDE ->{
            return  a.doubleValue() / b.doubleValue();
            }      
        default -> throw new AssertionError("Unknown operation " + this);    
       }

    }
}

public class Test{
    public static void main(String[] args) {

       double res3 = Operation.DIVIDE.apply(10,2);
       System.out.println(res3); 
       
    }
}