package HW8;

public class CW_577bd8d4ae2807c64b00045b {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equalsIgnoreCase(fighter1.name)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) return fighter1.name;
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) return fighter2.name;
            }
        }else{
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) return fighter2.name;
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) return fighter1.name;
            }
        }
        return firstAttacker;
    }

    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
    }

    public static String declareWinner_recursion(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if(firstAttacker.equals(fighter1.name)) {
            while(true) {
                fighter2.health -= fighter1.damagePerAttack;
                if(fighter2.health < 1)
                    return fighter1.name;
                fighter1.health -= fighter2.damagePerAttack;
                if(fighter1.health < 1)
                    return fighter2.name;
            }
        }
        else {
            return declareWinner(fighter2, fighter1, firstAttacker);
        }
        //if you are a 9.5 milf, message me so we can Java together LOL
    }
}
