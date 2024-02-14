public class HW_3_2 {
    public static void main(String[] args) {
        int number = 41;
        if (number > 10) {
            System.out.println("больше 10");
        }
        if (number < 100) {
            System.out.println("меньше 100");
        }
        if (number / 2.0 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (number >= 5 && number <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        }else{
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
