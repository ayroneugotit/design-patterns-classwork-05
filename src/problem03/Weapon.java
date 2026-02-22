package problem03;

public class Weapon implements ICloneable<Weapon> {
    private double damage;

    public Weapon(double damage) {
        this.damage = damage;
    }

    public Weapon myClone() {
        return new Weapon(damage);
    }
}
