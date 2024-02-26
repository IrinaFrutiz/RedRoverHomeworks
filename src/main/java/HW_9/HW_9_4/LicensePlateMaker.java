package HW_9.HW_9_4;

public class LicensePlateMaker{
    private String prefix = "CA";

    private int lastUseNumber;

    public LicensePlateMaker(String prefix, int lastUseNumber) {
        this.prefix = prefix;
        this.lastUseNumber = lastUseNumber;
    }

    public LicensePlate makeNextPlate(){
        lastUseNumber++;
        return new LicensePlate(prefix + "-" + lastUseNumber);
    }
}
