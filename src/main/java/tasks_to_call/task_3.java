package tasks_to_call;

public class task_3 {

    public static void from12To13(){
        for(double i = 12.0; i <= 13.0; i+=0.1){
            System.out.format("%.1f",i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        from12To13();
    }
}
