package CW;

public class CW_5412509bd436bd33920011bc {
    public static String maskify(String str) {
        if (str.length() < 5) return str;
        int num = str.length() - 4;
        String result = "" ;
        for (int i = 0; i < num; i++) result += "#";
        result += str.substring(num);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maskify("64607935616"));
    }

}
