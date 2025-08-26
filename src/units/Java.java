package units;

public class Java extends Unit {
    // Java: Medium damage, high health, melee, single target
    public Java() {
        this.name = "Java";
        this.health = 1000;
        this.damage = 25;
        this.range = 1;
        this.areaOfEffect = 0; // Single target
    }

    // Copy constructor
    public Java(Java source) {
        super(source);
    }

    @Override
    public void dealDamage(Unit target) {
        target.takeDamage(damage);
    }

    @Override
    public Unit copy() {
        return new Java(this);
    }
}