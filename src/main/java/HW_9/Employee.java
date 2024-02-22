package HW_9;

public class Employee{
    private String name;
    private int age;
    private String sex;
    private int daysSalary;

    public Employee(String name, int age, String sex, int daysSalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.daysSalary = daysSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDaysSalary() {
        return daysSalary;
    }

    public void setDaysSalary(int daysSalary) {
        this.daysSalary = daysSalary;
    }

    int getSalary(Month[] monthArray){
        int result = 0;
        for (Month month: monthArray){
            result += month.getWorkDays() * this.daysSalary;
        }
        return result;
    }
}
