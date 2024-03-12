package HW_12;

public class CW_5a2be17aee1aaefe2a000151 {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int result = 0;
        for (int i = 0; i < arr1.length; i++){
            result += arr1[i] + arr2[i];
        }
        return result;

//        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
