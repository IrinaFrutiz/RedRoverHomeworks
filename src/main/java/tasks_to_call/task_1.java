package tasks_to_call;

public class task_1 {
    public static String money(double num){
        String result = "" + (int)Math.floor(num) + " руб ";
        num -= Math.floor(num);
        num *= 100;
        result += (int)num + " коп";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(money(10.75));
        System.out.println(money(0.0));
        System.out.println(money(1.0));
        System.out.println(money(0.75));
        System.out.println(money(2.5));

    }
}
