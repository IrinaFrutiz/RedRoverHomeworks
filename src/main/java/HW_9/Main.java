package HW_9;

import HW_9.HW_9_4.LicensePlateMaker;

public class Main {
    public static void main(String[] args) {
//        Month January = new Month("Январь");
//        Month Feb = new Month("Февраль");
//        Month March = new Month("Март");
//
//        System.out.println(January.getDays());
//        System.out.println(January.getName());
//        System.out.println(January.getWorkDays());
//
//        Employee dima = new Employee("Dima", 30, "Male", 35);
//        System.out.println(dima.getSalary(new Month[]{January, Feb, March, new Month("Июль")}));
//
//        Manager ira = new Manager("Ira", 31, "Female", 35, 6);
//        System.out.println(ira.getSalary(new Month[]{January, Feb, March, new Month("Июль")}));

        LicensePlateMaker novaNum = new LicensePlateMaker();
        novaNum.makeNextPlate();
        System.out.println(novaNum.getPlate());
        novaNum.makeNextPlate();
        System.out.println(novaNum.getPlate());
        novaNum.makeNextPlate();
        System.out.println(novaNum.getPlate());

        LicensePlateMaker novaNum1 = new LicensePlateMaker();
        novaNum1.makeNextPlate();
        System.out.println(novaNum1.getPlate());
        novaNum1.makeNextPlate();
        System.out.println(novaNum1.getPlate());

        LicensePlateMaker novaNum2 = new LicensePlateMaker();
        novaNum2.makeNextPlate();
        System.out.println(novaNum2.getPlate());
        novaNum2.makeNextPlate();
        System.out.println(novaNum2.getPlate());

        novaNum.makeNextPlate();
        System.out.println(novaNum.getPlate());
        System.out.println(novaNum.makeNextPlate());
        System.out.println(novaNum.getPlate());
    }
}
