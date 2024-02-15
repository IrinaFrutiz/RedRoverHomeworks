package HW5;

public class HW_5_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                counter++;
            }
        }
        System.out.println("Количество букв “е” в строке " + counter);
    }
}
