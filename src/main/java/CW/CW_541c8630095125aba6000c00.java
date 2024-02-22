package CW;

public class CW_541c8630095125aba6000c00 {
    public static int digital_root(int n) {
        String st = String.valueOf(n);
        int result = n;
        while (result > 9){
            if (result < 10){
                return result;
            }
            result = 0;
            for (int i = 0; i < st.length(); i++){
                System.out.println(Character.getNumericValue(st.charAt(i)));
                result += Character.getNumericValue(st.charAt(i));
            }
            st = String.valueOf(result);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(16));
    }
}
