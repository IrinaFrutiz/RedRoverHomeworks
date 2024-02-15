package HW7;

import HW7.Person;

public class HW_7_1 {
    public static void main(String[] args) {

        Person petia = new Person("Petia", 20, "Male");
        System.out.println(petia.getName());
        Person ira = new Person("Ira", 30, "Female");
        System.out.println(ira.getName());
        Person lalala = new Person("La", 1, "incognito");
        System.out.println(lalala.getName());

    }
}
