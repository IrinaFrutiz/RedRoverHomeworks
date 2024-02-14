public class HW_2_2 {
    public static void main(String[] args) {
        int production = 10000;
        int count_pirates = 15;

        int owner = production / 2;
        int capitan = (production - owner) / 2;
        int pirates = (production - owner - capitan) / count_pirates;
        int ostatok = production - owner - capitan - (pirates * count_pirates);

        System.out.print("Владельцу корабля: ");
        System.out.println(owner);
        System.out.print("Капитану: ");
        System.out.println(capitan + pirates);
        System.out.print("Пиратам корабля: ");
        System.out.println(pirates);
        System.out.print("остаток: ");
        System.out.println(ostatok);
        System.out.print("Check - ");
        System.out.print((ostatok < count_pirates) + " ");
        System.out.print(ostatok + owner + capitan + pirates * count_pirates == production);


    }
}
