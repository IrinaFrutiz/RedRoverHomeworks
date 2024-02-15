package HW5;

public class HW_5_4 {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        char letter = 'е';
        int counter = 0;
        for (String[] ar : array){
            for (String word : ar){
                boolean inWord = false;
                for (int i =0; i< word.length(); i++){
                    if(letter == word.charAt(i)){
                        inWord = true;
                        break;
                    }
                }
                if(!inWord){
                    counter++;
                }
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                boolean inWord = false;
//                for (int k = 0; k < array[i][j].length(); k++){
//                    if (letter == array[i][j].charAt(k)) {
//                        inWord = true;
//                        break;
//                    }
//                }
//                if (!inWord) {
//                    counter++;
//                }
//            }
//        }
        System.out.println(counter);
    }
}
