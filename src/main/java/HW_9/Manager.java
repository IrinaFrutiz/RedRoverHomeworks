package HW_9;

public final class Manager extends BaseEmployee{

    private int subordinate;

    public Manager(String name, int age, String sex, int daysSalary, int subordinate) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.setDaysSalary(daysSalary);
        this.subordinate = subordinate;
    }

    public int getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(int subordinate) {
        this.subordinate = subordinate;
    }


    @Override
    public int getSalary(Month[] monthArray){
        int result = 0;
        for (Month month: monthArray){
            result += (int) ((int) ((month.getWorkDays() * this.getDaysSalary())) * (1 + 0.01 * this.getSubordinate()));
        }
        return result;
    }
}
