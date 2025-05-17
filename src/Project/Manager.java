package Project;

public class Manager extends Employee {

    double bonus = 10000;
    
    @Override
    public double CalculateSalary(){
        return baseSalary + bonus;
    }
    
}
