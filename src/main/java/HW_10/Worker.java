package HW_10;

public class Worker extends Employee{

    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public final double getSalary(){
        return getBaseSalary();
    }
}
