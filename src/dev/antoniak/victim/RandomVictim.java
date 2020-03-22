package dev.antoniak.victim;

import dev.antoniak.randomnumbergenerator.RandomNumberGenerator;

public class RandomVictim extends Victim {

    public RandomVictim(String name, double deffence, RandomNumberGenerator randomGen) {
        super(name, deffence, randomGen);
    }

    @Override
    public double deffence() {
        return super.deffence() + modifyDeffence();
    }

    private double modifyDeffence() {
        return super.randomGen.fromRange(0,1);
    }
}