package HW6;

public class HW_6_4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i = 0; i < array.length; i++){
            count += array[i].length;
//            for (int j = 0; j < array[i].length; j++){
//                count++;
//            }
        }
        System.out.println(count);
    }
}
