package HW_9;

public class MonthUtils {

    public final static Month JAN = new Month("January", 31, 21);
    public final static Month FEB = new Month("February", 28, 20);
    public final static Month MAR = new Month("March", 31, 22);
    public final static Month APR = new Month("April", 30, 22);
    public final static Month MAY = new Month("May", 31, 18);
    public final static Month JUN = new Month("June", 30, 21);
    public final static Month JUL = new Month("July", 31, 20);
    public final static Month AUG = new Month("August", 31, 20);
    public final static Month SEP = new Month("September", 30, 19);
    public final static Month OCT = new Month("October", 31, 22);
    public final static Month NOV = new Month("November", 30, 19);
    public final static Month DES = new Month("December", 31, 21);


    public static Month[] ALL_MONTHS = {
            JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DES
    };

    public static Month[] FIRST_HALF_YEAR = {
            JAN, FEB, MAR, APR, MAY, JUN
    };
    public static Month[] SECOND_HALF_YEAR = {
            JUL, AUG, SEP, OCT, NOV, DES
    };

    public static Month[] FIRST_QUARTER = {
            JAN, FEB, MAR
    };

    public static Month[] SECOND_QUARTER = {
            APR, MAY, JUN
    };

    public static Month[] THIRD_QUARTER = {
            JUL, AUG, SEP
    };

    public static Month[] FOURTH_QUARTER = {
            OCT, NOV, DES
    };


//    public static Month[] SUMMER = {
//            JUN, JUL, AUG
//    };


}
