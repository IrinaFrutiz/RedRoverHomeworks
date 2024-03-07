package HW_10;

public abstract class Supervisor extends Employee{
    final static int K = 1;

    private int numberOfSubordinates;

    Supervisor(String name, double baseSalary, int numberOfSubordinates) {
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
            return super.getBaseSalary();
        }
        return this.getBaseSalary() * ((double) this.getNumberOfSubordinates() / 100 * K);
    }
}
