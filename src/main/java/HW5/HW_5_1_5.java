package HW5;

public class HW_5_1_5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int counter = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length;j++){
                sum += array[i][j];
                if(max<array[i][j]){
                    max = array[i][j];
                }
                counter++;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(counter);
    }
}
