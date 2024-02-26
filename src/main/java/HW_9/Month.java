package HW_9;

public class Month{
    private String name;
    private int days;
    private int workDays;


    public Month(String name, int days, int workDays) {
        this.name = name;
        this.days = days;
        this.workDays = workDays;
    }


    public int getDays() {
        return days;
    }

    public String getName() {
        return name;
    }

    public int getWorkDays() {
        return workDays;
    }
}

