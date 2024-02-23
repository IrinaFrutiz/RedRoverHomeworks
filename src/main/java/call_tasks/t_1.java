package call_tasks;

public class t_1 {

    public static boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday ? (true) : (vacation);
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println(sleepIn(true, true));
    }
}
