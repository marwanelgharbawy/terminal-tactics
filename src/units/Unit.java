package units;

public abstract class Unit {
    // For current design, all units attack with the same speed
    protected String name;
    protected int health;
    protected int damage;
    protected int range;
    protected int areaOfEffect; // 0 for single target

    // Abstract, depending on each unit's behavior
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
}