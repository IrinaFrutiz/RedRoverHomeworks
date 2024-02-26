package HW_9;

public class MonthUtils{

    public static Month JAN = new Month("January", 31, 21);
    public static Month FEB = new Month("February", 28, 20);
    public static Month MAR = new Month("March", 31, 22);
    public static Month APR = new Month("April", 30, 22);
    public static Month MAY = new Month("May", 31, 18);
    public static Month JUN = new Month("June", 30, 21);
    public static Month JUL = new Month("July", 31, 20);
    public static Month AUG = new Month("August", 31, 20);
    public static Month SEP = new Month("September", 30, 19);
    public static Month OCT = new Month("October", 31, 22);
    public static Month NOV = new Month("November", 30, 19);
    public static Month DES = new Month("December", 31, 21);


    public static Month[] ALL_MOUNTHS = {
            JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DES
    };

    public static Month[] SUMMER = {
            JUN, JUL, AUG
    };



//    static String[] MOUNTH_NAME = { "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь" };
//    static int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//    int[] monthWorkDays = {20, 20, 22, 22, 18, 21, 20, 20, 19, 22, 20, 21};
//
//
//    int setDays(String month){
//        for (int i = 0; i < this.MOUNTH_NAME.length; i++){
//            if(this.MOUNTH_NAME[i].equalsIgnoreCase(month)){
//                return this.monthDays[i];
//            }
//        }
//        return 30;
//    }
//    int setWorkDays(String month){
//        for (int i = 0; i < this.MOUNTH_NAME.length; i++){
//            if(this.MOUNTH_NAME[i].equalsIgnoreCase(month)){
//                return this.monthWorkDays[i];
//            }
//        }
//        return 20;
//    }

}
