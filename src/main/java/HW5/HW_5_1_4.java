package HW5;

public class HW_5_1_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        System.out.println((double)sum/array.length);
    }
}
