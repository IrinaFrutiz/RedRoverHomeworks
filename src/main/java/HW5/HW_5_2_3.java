package HW5;

public class HW_5_2_3 {
    public static void main(String[] args) {
        for(int i = 9; i >=0; i--) {
            for(int k = i; k>0; k--){
                System.out.print(k + " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            for (int z = 10-i; z>0;z--){
                System.out.print("  ");
            }
        }
    }
}
