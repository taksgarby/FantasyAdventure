package players;

import behaviour.IAttack;
import behaviour.IDefend;
import enums.Race;
import tools.MythicalCreature;
import tools.Spell;
import tools.Staff;

public class Caster extends Player implements IAttack, IDefend  {

    private Staff staff;

    private Spell spell;

    private MythicalCreature protector;

    private int damage;

    private IDefend defender;

    public Caster(String name, Race race, int health, int level, Staff staff, Spell spell, MythicalCreature protector) {
        super(name, race, health, level);
        this.staff = staff;
        this.spell= spell;
        this.protector = protector;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

     public void setProtector(MythicalCreature protector) {
        this.protector = protector;
     }

    public void takeDamage(int newDamage) {
        this.damage += newDamage;
    }

    public Boolean isAlive(){
        return true;
    }

    public void attack(IDefend defender) {

    }
}
