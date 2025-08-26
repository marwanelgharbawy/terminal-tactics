package units;

public class CPlusPlus extends Unit {
    // C++: High damage, medium health, ranged, single target
    public CPlusPlus() {
        this.name = "C++";
        this.health = 800;
        this.damage = 40;
        this.range = 3;
    }

    @Override
    public void dealDamage(Unit target) {
        target.takeDamage(damage);
    }
}