public class HW_4_9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }
}
