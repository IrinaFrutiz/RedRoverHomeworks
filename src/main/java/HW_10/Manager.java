package HW_10;

public class Manager extends Employee{
    int numberOfSubordinates;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(){
        if (this.getNumberOfSubordinates() == 0){
            return this.baseSalary;
        }
        return this.baseSalary * ((double) this.getNumberOfSubordinates() / 100 * 3);
    }
}
