package HW5;

import java.util.Locale;

public class HW_5_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i - 2) == 'р' && s.charAt(i - 1) == 'и' && s.charAt(i) == 'т') {
                System.out.println(i - 2);
            }
        }
        s = "Посмотрите как Рите нравится ритм";
        for (int i = 0; i < s.length() - 3; i++) {
            if (s.substring(i, i + 3).equalsIgnoreCase("рит")) {
                System.out.println(i);
            }
        }
    }
}
