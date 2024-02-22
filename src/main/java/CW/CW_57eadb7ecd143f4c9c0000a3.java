package CW;

public class CW_57eadb7ecd143f4c9c0000a3 {
    public static String abbrevName(String name) {
        name = name.toUpperCase();
        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }
}
