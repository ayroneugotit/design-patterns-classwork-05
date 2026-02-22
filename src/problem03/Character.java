package problem03;

import java.util.ArrayList;
import java.util.List;

public class Character implements ICloneable<Character> {
    private double health;
    private double strength;
    private double agility;
    private double intelligence;

    private Weapon weapon;
    private Armor armor;

    private List<Skill> skills;

    public Character(double health, double strength, double agility, double intelligence, Weapon weapon, Armor armor) {
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.weapon = weapon;
        this.armor = armor;
        this.skills = new ArrayList<>();
    }

    public Character(double health, double strength, double agility, double intelligence, Weapon weapon, Armor armor, List<Skill> skills) {
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.weapon = weapon;
        this.armor = armor;
        this.skills = skills;
    }

    public Character myClone() {
        Weapon clonedWeapon = weapon.myClone();
        Armor clonedArmor = armor.myClone();

        List<Skill> clonedSkills = new ArrayList<>();
        for (Skill skill : skills) {
            clonedSkills.add(skill.myClone());
        }

        return new Character(health, strength, agility, intelligence, clonedWeapon, clonedArmor, clonedSkills);
    }
}
