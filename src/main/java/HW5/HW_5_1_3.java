package HW5;

public class HW_5_1_3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int m = Integer.MAX_VALUE;
        for(int n:array){
            if(m>n){
                m=n;
            }
        }
        System.out.println(m);
    }
}
