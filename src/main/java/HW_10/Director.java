package HW_10;

public class Director extends Manager{

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary(){
        if (this.getNumberOfSubordinates() == 0){
            return this.baseSalary;
        }
        return this.baseSalary * (((double) this.getNumberOfSubordinates() / 100) * 9);
    }
}
