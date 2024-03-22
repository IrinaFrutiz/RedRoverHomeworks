package HW_12_extra;


import java.util.List;

public class HW_1 {

    public static void main(String[] args) {
        List<String> words = new java.util.ArrayList<>(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));
        words.removeIf(n -> n.contains("l"));
        System.out.println(words);
    }

}
