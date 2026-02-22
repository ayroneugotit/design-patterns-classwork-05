package problem03;

public class Skill implements ICloneable<Skill> {
    private String name;

    public Skill(String name) {
        this.name = name;
    }

    public Skill myClone() {
        return new Skill(name);
    }
}
