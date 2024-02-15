package HW4;

public class HW_4_7 {
    public static void main(String[] args) {
        int[] array = {1, 12, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum * 1.0/ array.length);
    }
}
