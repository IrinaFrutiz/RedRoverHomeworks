package HW_10;

public class Manager extends Worker{
    private int numberOfSubordinates;
    final int k = 3;

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
            return super.getSalary();
        }
        return this.getBaseSalary() * ((double) this.getNumberOfSubordinates() / 100 * k);
    }
}
