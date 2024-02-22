package CW;

public class CW_5831c204a31721e2ae000294 {
    public static String swap(String st){
        char[] arr = new char[] {'a', 'e', 'o', 'i', 'u'};

        for (char el : arr){
            String rep = "" + el;
            st = st.replace(rep, rep.toUpperCase());
        }

        return st;
    }

    public static void main(String[] args) {
        System.out.println(swap("HelloWorld!"));
    }
}
