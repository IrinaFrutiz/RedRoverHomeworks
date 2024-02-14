public class CW_5296455e4fe0cdf2e000059f {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(calculate(-3,"*", 0));
        System.out.println(calculate(2,"+", 4));
        System.out.println(calculate(6,"-", 1.5));
        System.out.println(calculate(-4,"*", 8));
        System.out.println(calculate(49,"/", -7));
        System.out.println(calculate(8,"m", 2));
        System.out.println(calculate(4,"/",0) );
    }
    public static Double calculate(final double numberOne, final String operation, final double numberTwo)
    {
        switch (operation){
            case "+": return numberOne + numberTwo + 0.0;
            case "-": return numberOne - numberTwo + 0.0;
            case "*": return numberOne * numberTwo + 0.0;
            case "/": return numberTwo==0 ? null : numberOne/numberTwo + 0.0;
//                if (numberTwo==0) return null;
//                return numberOne / numberTwo;
        }
        return null;
    }
}
