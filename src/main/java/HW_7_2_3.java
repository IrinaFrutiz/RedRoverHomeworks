public class HW_7_2_3 {
    public static void main(String[] args) {
        Employee ira = new Employee("Iryna", 30, "Female", 100_000);
        Employee ira1 = new Employee("Ira", 20, "Female", 20000);
        Employee[] employees = new Employee[4];
        employees[0] = ira1;
        employees[1] = ira;
        employees[2] = new Employee("Kate", 20, "F", 200);
        employees[3] = new Employee("Anna", 40, "F", 30000);
        Employee toto = new Employee("Toto", 3, "no", 25000);
        Employee ira2 = new Employee("Iryna", 21, "F", 15000);
        System.out.println(toto.isSameName(ira));
        System.out.println(toto.getName());
        System.out.println(ira.isSameName(ira2));
        System.out.println(Salary.getSum(employees));
    }
}
