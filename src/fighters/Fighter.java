package fighters;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                '}';
    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;

    }
}
