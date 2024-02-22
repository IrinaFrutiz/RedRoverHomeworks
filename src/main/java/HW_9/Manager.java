package HW_9;

public class Manager extends Employee{

    private int subordinate;

    public Manager(String name, int age, String sex, int daysSalary, int subordinate) {
        super(name, age, sex, daysSalary);
        this.subordinate = subordinate;
    }

    public int getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(int subordinate) {
        this.subordinate = subordinate;
    }

    @Override
    int getSalary(Month[] monthArray){
        int result = 0;
        for (Month month: monthArray){
            result += (int) (month.getWorkDays() * this.getDaysSalary() +
                    (month.getWorkDays() * this.getDaysSalary() * 0.01) * this.subordinate);
        }
        return result;
    }
}
