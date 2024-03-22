package HW_12_extra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW_4 {
    public static void main(String[] args) {
        List<String> words = List.of(
                "impress", "routine", "bean", "clash", "member", "sea", "length", "dedicate",
                "divorce", "enter", "path", "swell", "directory", "language", "regular",
                "extinct", "doctor", "recycle", "benefit", "threaten", "graze", "era",
                "astonishing", "recommendation", "responsibility", "vat", "owl", "stall",
                "marketing", "tempt", "jacket", "ash", "disposition", "priority", "rank",
                "behave", "powder", "sting", "dangerous", "bedroom", "failure", "offset",
                "reliable", "main", "first", "mechanism", "abandon", "gravity", "ear",
                "partner", "bulletin", "season", "favor", "zone", "process", "eat", "test", "dialect",
                "poll", "organize", "develop", "square", "comment", "warm", "broadcast",
                "history", "active", "swear", "right", "reporter", "vegetarian", "name",
                "church", "modernize", "tempt", "colon", "deadly", "impress", "gutter",
                "recognize", "appreciate", "brainstorm", "liberty", "constant", "principle",
                "list", "rational", "compact", "escape", "lick", "compose", "shape",
                "headline", "problem", "wrestle", "command", "beard", "embarrassment", "colony",
                "fast"
        );

        for (char c = 'a'; c <= 'z'; c++) {
            getListOfWord(c, words);
        }
    }

    public static String getListOfWord(char letter, List<String> ListWords) {
        List<String> newList = new ArrayList<String>();
        for (String word : ListWords) {
            if (word.charAt(0) == letter) {
                newList.add(word);
            }
        }
        if (newList.isEmpty()) {
            return null;
        }
        return getLongerWord(newList);
    }

    public static String getLongerWord(List<String> ListWords) {
        int n = 0;
        String result = "";
        for (String word : ListWords) {
            if (word.length() > n) {
                n = word.length();
                result = word;
            }
        }
        System.out.println(result);
        return result;
    }
}
