package dev.antoniak.monster;

import dev.antoniak.randomnumbergenerator.RandomNumberGenerator;

public class RandomMonster extends Monster {

    private RandomNumberGenerator randomGen;

    public RandomMonster(String name, double damage, RandomNumberGenerator randomGen) {
        super(name, damage);
        this.randomGen = randomGen;
    }

    @Override
    public double attack() {
        return super.attack() + modifyDamage();
    }

    private double modifyDamage() {
        return randomGen.fromRange(-2,2);
    }
}