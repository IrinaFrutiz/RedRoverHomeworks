package HW_9;

public class MonthUtils{
    static String[] monthNames = { "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь" };
    static int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int[] monthWorkDays = {20, 20, 22, 22, 18, 21, 20, 20, 19, 22, 20, 21};


    int setDays(String month){
        for (int i =0; i < this.monthNames.length; i++){
            if(this.monthNames[i].equalsIgnoreCase(month)){
                return this.monthDays[i];
            }
        }
        return 30;
    }
    int setWorkDays(String month){
        for (int i =0; i < this.monthNames.length; i++){
            if(this.monthNames[i].equalsIgnoreCase(month)){
                return this.monthWorkDays[i];
            }
        }
        return 20;
    }

}
