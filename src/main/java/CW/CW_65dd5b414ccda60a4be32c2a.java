package CW;

import java.util.Arrays;

public class CW_65dd5b414ccda60a4be32c2a {

    public static boolean gaslighting(String shirtWord, String yourWord, char[] friendsLetters) {
        if (!shirtWord.equals(yourWord)) {
                for (int i = 0; i < shirtWord.length(); i++) {
                    if(shirtWord.charAt(i) != yourWord.charAt(i)){
                        for (char knownLetter: friendsLetters){
                            if(knownLetter == shirtWord.charAt(i) || knownLetter == yourWord.charAt(i)) {
                                return true;
                            }
                        }
                    }
                }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(gaslighting("snack", "snake", new char[]{'c'}));
        System.out.println(gaslighting("snack", "snack", new char[]{'s', 'n', 'a', 'c', 'k'}));
        System.out.println(gaslighting("ping", "pong", new char[]{'p', 'n', 'g'}));
//        System.out.println(Arrays.binarySearch(new char[]{}, 'y'));
    }
}
