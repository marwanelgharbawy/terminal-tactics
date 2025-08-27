package units;

public abstract class Unit {
    // For current design, all units attack with the same speed
    protected String name;
    protected int health;
    protected int damage;
    protected int range;
    protected int areaOfEffect; // 0 for single target, probably won't be used as

    // Empty constructor
    public Unit() {

    }

    // Copy constructor
    public Unit(Unit source) {
        this.name = source.name;
        this.health = source.health;
        this.damage = source.damage;
        this.range = source.range;
        this.areaOfEffect = source.areaOfEffect;
    }

    // Each unit will have different behavior of dealing damage
    public abstract void dealDamage(Unit target);

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0; // Health should not be negative
        }
        this.die();
    }

    public void die() {
        if (this.health <= 0) {
            System.out.println(this.name + " has failed to run.");
        }
    }

    // Each unit must implement its own copy method to for correct types
    public abstract Unit copy();

    // Getters
    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getAOE() {
        return this.areaOfEffect;
    }
}