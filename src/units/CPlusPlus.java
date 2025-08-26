package units;

import game.GameEngine;

public class CPlusPlus extends Unit {
    // C++: High damage, medium health, ranged, single target
    public CPlusPlus() {
        this.name = "C++";
        this.health = 300;
        this.damage = 40;
        this.range = 3;
        this.areaOfEffect = 0; // Single target
    }

    // Copy constructor
    public CPlusPlus(CPlusPlus source) {
        super(source);
    }

    @Override
    public void dealDamage(Unit target) {
        // TODO: Single target attack
    }

    @Override
    public Unit copy() {
        return new CPlusPlus(this);
    }
}