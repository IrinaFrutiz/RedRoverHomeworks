package HW_12_extra;

import java.util.List;
import java.util.ArrayList;

public class HW_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);
    }
}
