package CW;

public class CW_5f7c38eb54307c002a2b8cc8 {
    public static String removeParentheses(final String str) {
        String result = str;
        while (result.contains("(") && result.contains(")")){
            result = result.substring(0, result.indexOf('(')) + result.substring(result.indexOf(')') + 1);
        }
        if (result.contains(")")) result = result.substring(0, result.lastIndexOf(')'));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeParentheses("hello example (words(more words) here) something"));
        System.out.println(removeParentheses("example(unwanted thing)example"));

    }
}
