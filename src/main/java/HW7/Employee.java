package HW7;

public class Employee extends Person {
    int salary;

    public Employee (String name, int age, String sex, int selary) {
        super(name, age, sex);
        this.salary = selary;
    }


    public boolean isSameName(Employee otherEmployee){
        return this.name.equalsIgnoreCase(otherEmployee.name);
    }
}
