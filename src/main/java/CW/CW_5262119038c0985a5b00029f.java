package CW;

public class CW_5262119038c0985a5b00029f {
    public static boolean isPrime(int num) {
        if (num <=0 || num==1) return false;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(-5));
    }
}
