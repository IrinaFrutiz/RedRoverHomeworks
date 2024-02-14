public class HW_62_3 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--){
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            for (int j = 0; j < 10 - i; j++){
                System.out.print("  ");
            }
        }
    }
}
