package HW_12;

public class CW_5704aea738428f4d30000914 {
    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i =0; i < one.length(); i++){
            result = result + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return result;
    }
}
