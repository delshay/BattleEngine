package dev.antoniak.monster;

public class Monster {

    private String name;
    private double damage;

    public Monster(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public String name() {
        return this.name;
    }

    public double attack() {
        return this.damage;
    }
}