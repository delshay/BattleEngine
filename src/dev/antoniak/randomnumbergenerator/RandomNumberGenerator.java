package dev.antoniak.randomnumbergenerator;

import java.util.Random;

public class RandomNumberGenerator {

    /**
     * This is my attempt to generate correct random double in given range.
     *
     * @param min
     * @param max
     * @returnm
     */
    public double fromRange(int min, int max) {
        return min + (max - min) * new Random().nextDouble();
    }
}