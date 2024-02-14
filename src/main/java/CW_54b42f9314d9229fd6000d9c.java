public class CW_54b42f9314d9229fd6000d9c {
    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
    }
    static String encode(String word){
        String small = word.toLowerCase();
        String result = "";
        for (int i =0; i< small.length(); i++){
            char letter = small.charAt(i);
            int counter = 0;
            for (int j =0; j< small.length(); j++){
                if (letter == small.charAt(j)) counter++;
            }
            if (counter > 1){
                result += ")";
            }else{
                result += "(";
            }
        }
        return result;
    }
}
