package HW_9;

public class Month extends MonthUtils{
    static String name;
    static int days;
    static int workDays;


    public Month(String name, int days, int workDays) {
        this.name = name;
        this.days = days;
        this.workDays = workDays;
    }


    public Month(String name, int days) {
        this.name = name;
        this.days = days;
        this.workDays = this.setWorkDays(name);
    }


    public Month(String name){
        this.name = name;
        this.days = this.setDays(name);
        this.workDays = this.setWorkDays(name);
    }

    public int getDays() {
        return days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
}

