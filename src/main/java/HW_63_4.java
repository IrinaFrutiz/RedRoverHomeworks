public class HW_63_4 {
   /* public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++){
            int num = args[i];
            if (min > num) {
                min = num;
            }
        }

    }*/
   public static void main(String[] args) {
       System.out.println(squareSum(new int[] {1,2,2}));
   }
    public static int squareSum(int[] n)
    {
        int s = 0;
        for (int i = 0; i < n.length; i++){
            s += n[i] * n[i];
        }
        return s;
    }
}
