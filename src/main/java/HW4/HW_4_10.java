package HW4;

public class HW_4_10 {
    public static void main(String[] args) {
        int n = 15;
        int a = 1;
        int b = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i + 1 < n) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
            c = a;
            a = a + b;
            b = c;
        }
    }
}
