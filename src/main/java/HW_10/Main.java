package HW_10;

public class Main {
    public static void main(String[] args) {
        Manager dima = new Manager("Dima", 10000, 10);
        Manager m_1 = new Manager("one", 1000, 1);
        Manager m_2 = new Manager("Two", 2000, 2);
        Manager m_3 = new Manager("Three", 3000, 3);
        Manager m_4 = new Manager("Four", 4000, 4);
        Manager m_5 = new Manager("Five", 5000, 5);
        Director ira = new Director("Six", 10000, 3);
        Worker ioda = new Worker("Seven", 10000);

        System.out.println(ioda.getSalary());
        System.out.println(ira.getSalary());
        System.out.println(m_5.getSalary());

//        Manager[] managers = new Manager[]{dima, m_3, m_2, m_1, m_4, m_5};
//        Employee[] all = new Employee[]{dima, m_3, m_2, m_1, m_4, m_5, ioda, ira};
//
//        System.out.println(EmployeeUtil.getHigherSubordinates(managers).getName());
//        System.out.println(EmployeeUtil.getLowerIncrease(managers).getName());
//        System.out.println(EmployeeUtil.getHigherIncrease(managers).getName());
//        System.out.println(EmployeeUtil.getLowerSubordinates(managers).getName());
//        System.out.println(EmployeeUtil.getHigherSalary(all));
//        System.out.println(EmployeeUtil.getLowerSalary(all));
//        System.out.println(EmployeeUtil.getBudgetForAMonth(all));
//        System.out.println(EmployeeUtil.getEmployeeByPartOfName(all, "Se").getName());
//        System.out.println(EmployeeUtil.getEmployeeByName(all, "six").getName());
//        ira.setName("Ira");
//        System.out.println(EmployeeUtil.getEmployeeByName(all, "six"));

//        System.out.println(ira.getSalary());
    }
}
