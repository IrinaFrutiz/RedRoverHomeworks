package CW;
import java.util.Random;

public class CW_5875b200d520904a04000003 {
    public static String enough(int cap, int on, int wait){
        return String.format("Should return %d.", cap - on - wait >= 0 ? 0 : wait + on - cap);
    }

    public static void main(String[] args) {
        String[] colors = {"white", "yellow", "purple", "red"};
        Random rand = new Random();
        System.out.println(colors[rand.nextInt(4)]);
    }
}
