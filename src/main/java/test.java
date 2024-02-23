import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
//        System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
//        System.out.println(hasBad("hbfdf"));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    public static boolean hasBad(String str){
        return str.indexOf("bad") == 0 || str.indexOf("bad") == 1;
    }

    public static int[] makeLast(int[] nums){
        int[] result = new int[nums.length * 2];
        result[result.length-1] = nums[nums.length -1];
        return result;
    }
}
