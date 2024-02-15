package HW6;

public class HW_6_1 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int all_sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                all_sum = sum(all_sum, array[i][j]);
            }
        }
        System.out.println(all_sum);
    }

    public static int sum(int s, int a) {
        return s + a;
    }
}
