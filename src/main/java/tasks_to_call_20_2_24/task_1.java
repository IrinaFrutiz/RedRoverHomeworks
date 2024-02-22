package tasks_to_call_20_2_24;


public class task_1 {
    public static String money(double num){
        int rub = (int) num;
        int kop = (int)Math.round((num - rub) * 100);
        if (kop >= 100){
            rub += (kop/100);
            kop = kop % 100;
        }
//        String result = "" + (int)Math.floor(num) + " руб ";
//        num -= Math.floor(num);
//        num *= 100;
//        result += (int)num + " коп";
        return rub + " руб " + kop +" коп";
    }


    public static void main(String[] args) {
        System.out.println(money(10.75));
        System.out.println(money(0.0));
        System.out.println(money(1.0));
        System.out.println(money(0.75));
        System.out.println(money(2.5));
        System.out.println(money(1112.5));
        System.out.println(money(2.5555555555));
        System.out.println(money(2.999));

    }
}
