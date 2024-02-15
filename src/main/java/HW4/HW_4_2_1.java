package HW4;

public class HW_4_2_1 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i=0; i<array.length;i++){
            if(array[i]%2 != 0){
                System.out.println(array[i]);
            }
        }
    }
}
