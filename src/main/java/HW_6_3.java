public class HW_6_3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                int number = array[i][j];
                if (min > number){
                    min = number;
                }
            }
        }
        System.out.println(min);
    }
}
