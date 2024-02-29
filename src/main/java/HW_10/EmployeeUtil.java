package HW_10;

public class EmployeeUtil {

//    поиск сотрудника в массиве по его имени
    public static Employee getEmployeeByName(Employee[] employees, String name){
        for (Employee emp: employees){
            if (name.equalsIgnoreCase(emp.getName())){
                return emp;
            }
        }
        return null;
    }

//    поиск сотрудника в массиве по вхождению указанной строки в его имени
    public  static Employee getEmployeeByPartOfName(Employee[] employees, String name){
        for (Employee emp: employees){
            if (emp.getName().contains(name)){
                return emp;
            }
        }
        return null;
    }

//    подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double getBudgetForAMonth(Employee[] employees) {
        double result = 0;
        for (Employee emp: employees){
            result += emp.getBaseSalary();
        }
        return result;
    }
//    поиск наименьшей зарплаты в массиве
    public static Employee getLowerSalary(Employee[] employees) {
        Employee result = employees[0];
        for (Employee emp: employees){
            if (result.getSalary() > emp.getSalary()){
                result = emp;
            }
        }
        return result;
    }
//    поиск наибольшей зарплаты в массиве
    public static Employee getHigherSalary(Employee[] employees) {
        Employee result = employees[0];
        for (Employee emp: employees){
            if (result.getSalary() < emp.getSalary()){
                result = emp;
            }
        }
        return result;
    }

//    поиск наименьшего количества подчиненных в массиве менеджеров
    public static Manager getLowerSubordinates(Manager[] managers){
        int count = managers[0].getNumberOfSubordinates();
        Manager result = managers[0];
        for (Manager mg : managers){
            if (count > mg.getNumberOfSubordinates()){
                count = mg.getNumberOfSubordinates();
                result = mg;
            }
        }
        return result;
    }

//    поиск наибольшего количества подчиненных в массиве менеджеров
    public static Manager getHigherSubordinates(Manager[] managers){
        int count = managers[0].getNumberOfSubordinates();
        Manager result = managers[0];
        for (Manager mg : managers){
            if (count < mg.getNumberOfSubordinates()){
                count = mg.getNumberOfSubordinates();
                result = mg;
            }
        }
        return result;
    }

//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static Manager getHigherIncrease(Manager[] managers){
        Manager result = managers[0];
        double count = managers[0].getSalary() - managers[0].getBaseSalary();
        for (Manager mg: managers){
            if (count > mg.getSalary() - mg.getBaseSalary()){
                count = mg.getSalary() - mg.getBaseSalary();
                result = mg;
            }
        }
        return result;
    }
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static Manager getLowerIncrease(Manager[] managers){
        Manager result = managers[0];
        double count = managers[0].getSalary() - managers[0].getBaseSalary();
        for (Manager mg: managers){
            if (count < mg.getSalary() - mg.getBaseSalary()){
                count = mg.getSalary() - mg.getBaseSalary();
                result = mg;
            }
        }
        return result;
    }
}
