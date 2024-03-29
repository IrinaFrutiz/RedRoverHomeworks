package CW;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.*;

public class CW_55c6126177c9441a570000cc {
    public static String orderWeight(String strng) {
        String result = "";
        if (strng.equals(""))return result;
        String[] numbers = strng.trim().split(" ");
        Map<Long, String> d = new TreeMap<>();
        for (String num : numbers){
            long i = Long.parseLong(num);
            Long sum = 0L;
            while (i > 0){
                sum += i % 10;
                i /= 10;
            }
            if (d.containsKey(sum)){
                String[] ns = (d.get(sum) + " " + num).split(" ");
                Arrays.sort(ns);
                d.put(sum, Arrays.toString(ns).replaceAll("[\\[\\],]", ""));
            }else{
                d.put(sum, num);
            }
        }
        for (String nums : d.values()){
            result += nums + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("56345678456789"));
//        System.out.println(orderWeight("56 65 74 100 99 68 86 180 90"));
//        System.out.println(orderWeight("11 11 2000 10003 22 123 1234000 44444444 9999"));
    }
}
