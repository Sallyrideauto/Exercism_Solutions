class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false; // Warrior는 항상 취약하지 않음
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}

class Wizard extends Fighter {
    boolean hasPreparedSpell = false;

    void prepareSpell() {
        this.hasPreparedSpell = true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !hasPreparedSpell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (hasPreparedSpell) {
            return 12;
        } else {
            return 3;
        }
    }
}