package CW;

public class CW_5264d2b162488dc400000001 {
    public static String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 5) {
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
        }
        String result = "";
        for (String word : arr){
            result += word + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("Welcome"));
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("Hey fellow warriors"));

    }
}
