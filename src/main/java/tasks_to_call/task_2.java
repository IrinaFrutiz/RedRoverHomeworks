package tasks_to_call;

public class task_2 {
    public static String weight(double num){
        String result = "" + (int)Math.floor(num) + " кг ";
        num -= Math.floor(num);
        num *= 100;
        result += (int)num + " гр";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(weight(10.75));
        System.out.println(weight(0.0));
        System.out.println(weight(1.0));
        System.out.println(weight(0.75));
        System.out.println(weight(2.5));

    }
}
