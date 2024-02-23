package HW_9.HW_9_4;

//import HW_9.HW_9_4.LicensePlate;

public class LicensePlateMaker extends LicensePlate {
    final String prefix = "CA";


    public LicensePlate makeNextPlate(){
        String numbers = this.prefix + "-" + this.getLastNumber();
        LicensePlate result = new LicensePlate();
        result.setPlate(numbers);
        return result;
    }
}
