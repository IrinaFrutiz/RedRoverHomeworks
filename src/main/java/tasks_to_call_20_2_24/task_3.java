package tasks_to_call_20_2_24;

public class task_3 {

    public static void from12To13(int start, int end){
        for(double i = start; i <= end; i+=0.1){
            System.out.printf("%.1f",i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        from12To13(12, 13);
    }
}
