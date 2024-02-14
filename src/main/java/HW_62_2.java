public class HW_62_2 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--){
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            for (int j = 0; j < 10 - i; j++){
                System.out.print("  ");
            }
        }
    }
}
