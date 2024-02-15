public class Person {
    String name;
    int age;
    String sex;
    public Person (String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getName(){
        return (sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("M") ) ?
                "Mr." + this.name :
                (sex.equalsIgnoreCase("Female") || sex.equalsIgnoreCase("F") ?
                        "Mrs." + this.name : this.name);
    }
}
