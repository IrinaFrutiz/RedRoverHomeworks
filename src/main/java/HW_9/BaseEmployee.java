package HW_9;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private String sex;
    private int daysSalary;

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

    public abstract int getSalary(Month[] monthArray);

    ;
}
