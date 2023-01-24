package fighters;

public class Game {
    public static void main(String[] args) {
        Winner winner = new Winner();

        Double shortdouble = 45.5;
        System.out.println(winner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));

    }
}

