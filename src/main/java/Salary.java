public class Salary {
    static int getSum(Employee[] employeeArray){
        int result = 0;
        for (Employee employee : employeeArray){
            result += employee.salary;
        }
        return result;
    }
}
