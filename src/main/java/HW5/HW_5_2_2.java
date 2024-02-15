package HW5;

public class HW_5_2_2 {
    public static void main(String[] args) {
        for(int i = 9; i >=0; i--){
            for(int j =0; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            for (int k = 10-i; k>0;k--){
                System.out.print("  ");
            }
        }
    }
}
