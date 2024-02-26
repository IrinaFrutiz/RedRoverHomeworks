package HW_10;

public class Main {
    public static void main(String[] args) {
        Manager dima = new Manager("Dima", 10000, 1);
        Director ira = new Director("Ira", 10000, 3);
        Worker ioda = new Worker("Ioda", 10000);

        System.out.println(dima.getNumberOfSubordinates());
        System.out.println(ira.getName());
        System.out.println(ira.getBaseSalary());
        System.out.println(ira.getSalary());
        ira.setBaseSalary(1000);
        System.out.println(ira.getSalary());
        System.out.println(ira.getName());
        Employee[] employees = new Employee[] {ira, dima, ioda};
        System.out.println(employees[0].getName());
        System.out.println();
        System.out.println(dima.getSalary());
        System.out.println(ira.getSalary());
        System.out.println(EmployeeUtil.getLowerSalary(employees));
        System.out.println(EmployeeUtil.getEmployeeByPartOfName(employees, "ma"));
    }
}
