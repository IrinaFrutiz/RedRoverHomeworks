public class HW_5_1_2 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for(int num:array){
            if (max<num){
                max=num;
            }
        }
        System.out.println(max);
    }
}
