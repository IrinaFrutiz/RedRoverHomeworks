package HW_9;

public final class Employee extends BaseEmployee{

    public Employee(String name, int age, String sex, int daysSalary) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.setDaysSalary(daysSalary);
    }

    @Override
    public int getSalary(Month[] monthArray){
        int result = 0;
        for (Month month: monthArray){
            result += month.getWorkDays() * this.getDaysSalary();
        }
        return result;
    }

}
