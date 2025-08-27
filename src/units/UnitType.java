package units;

import units.*;

public enum UnitType {
    JAVA {
        @Override
        public Unit createUnit() {
            return new Java();
        }
    },
    CPLUSPLUS {
        @Override
        public Unit createUnit() {
            return new CPlusPlus();
        }
    };
    public abstract Unit createUnit();
}