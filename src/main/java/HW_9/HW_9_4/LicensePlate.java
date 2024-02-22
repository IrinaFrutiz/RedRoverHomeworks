package HW_9.HW_9_4;

class LicensePlate {
    static String plate;

    static int lastnum=10;


    protected LicensePlate() {
        lastnum += 1;
    }

    protected static void setPlate(String plate) {
        LicensePlate.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    int getLastNumber(){
        return lastnum;
    }

}
