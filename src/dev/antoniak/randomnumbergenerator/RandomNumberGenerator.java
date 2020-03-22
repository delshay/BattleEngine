package dev.antoniak.randomnumbergenerator;

import java.util.Random;

public class RandomNumberGenerator {

    private Random random;

    public RandomNumberGenerator() {
        this.random = new Random();
    }

    public double fromRange(int min, int max) {
        return min + (max - min) * this.random.nextDouble();
    }
}