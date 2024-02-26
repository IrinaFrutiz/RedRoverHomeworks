package HW_9;

import HW_9.HW_9_4.LicensePlateMaker;
import HW_9.HW_9_4.LicensePlate;

import static HW_9.MonthUtils.*;

public class Main {
    public static void main(String[] args) {



//        Employee dima = new Employee("Dima", 230, "Male", 35);
//        System.out.println(dima.getSalary(ALL_MOUNTHS));
//
//        Manager ira = new Manager("Ira", 131, "Female", 35, 6);
//        System.out.println(ira.getSalary(ALL_MOUNTHS));

        LicensePlateMaker novaNum = new LicensePlateMaker("CA", 100);
        System.out.println(novaNum.makeNextPlate().getPlate());
        System.out.println(novaNum.makeNextPlate().getPlate());
        System.out.println(novaNum.makeNextPlate().getPlate());
        LicensePlateMaker nyLM = new LicensePlateMaker("NY", 0);
        System.out.println(novaNum.makeNextPlate().getPlate());
        System.out.println(nyLM.makeNextPlate().getPlate());
        System.out.println(nyLM.makeNextPlate().getPlate());
        System.out.println(novaNum.makeNextPlate().getPlate());
        System.out.println(nyLM.makeNextPlate().getPlate());
        System.out.println(nyLM.makeNextPlate().getPlate());
        System.out.println(novaNum.makeNextPlate().getPlate());

    }
}
