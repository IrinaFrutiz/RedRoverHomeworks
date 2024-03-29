package CW;

public class CW_5f7c38eb54307c002a2b8cc8 {
    public static String removeParentheses(final String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String letter = "" + str.charAt(i);
            if (letter.contains("(")) {
                count++;
            }
            if (count == 0 && !letter.contains(")")) {
                result += letter;
            }
            if (letter.contains(")")) {
                count--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(removeParentheses("hello example (words(more words) here) something"));
//        System.out.println(removeParentheses("example(unwanted thing)example"));
        String s = "Ssss";
        s.toLowerCase();
        System.out.println(s);

    }
}
