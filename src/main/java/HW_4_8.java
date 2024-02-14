public class HW_4_8 {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, 5, -6, 7, 8, 99, 2, 6, -4, 5, -12, 7, 8, 6};
        int counter_positives = 0;
        int counter_negatives = 0;
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            if (val > 0) {
                counter_positives++;
            }else if (val < 0){
                counter_negatives++;
            }
        }
        System.out.print("количество положительных чисел: ");
        System.out.println(counter_positives);
        System.out.print("количество отрицательных чисел: ");
        System.out.println(counter_negatives);
    }
}
