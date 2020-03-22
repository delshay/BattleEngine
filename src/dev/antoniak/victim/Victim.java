package dev.antoniak.victim;

import dev.antoniak.randomnumbergenerator.RandomNumberGenerator;

public class Victim {

    private String name;
    private double deffence;
    RandomNumberGenerator randomGen;

    public Victim(String name, double deffence, RandomNumberGenerator randomGen) {
        this.name = name;
        this.deffence = deffence;
        this.randomGen = randomGen;
    }

    public String name() {
        return this.name;
    }

    public double deffence() {
        return this.deffence;
    }

    public double escapeChance() {
        return randomGen.fromRange(0,1);
    }
}