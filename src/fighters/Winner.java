package fighters;

public class Winner {
    public String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacer) {

        Fighter a = fighter1, b = fighter2;
        if (firstAttacer.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }
        while (true) {

            if ((b.health = b.health - a.damagePerAttack) <= 0) {
            return a.name;
            }
            if ((a.health = a.health - b.damagePerAttack) <= 0) {
                return b.name;
            }
        }
    }

}

