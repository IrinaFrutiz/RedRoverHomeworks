package CW;

public class CW_5875b200d520904a04000003 {
    public static String enough(int cap, int on, int wait){
        return String.format("Should return %d.", cap - on - wait >= 0 ? 0 : wait + on - cap);
    }
}
