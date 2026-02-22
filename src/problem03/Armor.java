package problem03;

public class Armor implements ICloneable<Armor> {
    private double protection;

    public Armor(double protection) {
        this.protection = protection;
    }

    public Armor myClone() {
        return new Armor(protection);
    }
}
