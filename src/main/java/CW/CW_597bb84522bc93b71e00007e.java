package CW;

public class CW_597bb84522bc93b71e00007e {
    public static String stringMerge(String s1, String s2, char letter) {
//        int letter1 = s1.indexOf(letter);
//        int letter2 = s2.indexOf(letter);

        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }

    public static void main(String[] args) {
        System.out.println(stringMerge("person","here", 'e'));
    }
}
