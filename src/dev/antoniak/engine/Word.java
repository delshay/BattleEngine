package dev.antoniak.engine;

import dev.antoniak.monster.Monster;
import dev.antoniak.randomnumbergenerator.RandomNumberGenerator;
import dev.antoniak.victim.Victim;

public class Word {

    private Victim[] victims;
    private Monster[] monsters;
    private RandomNumberGenerator randomGen;

    public Word(Victim[] victims, Monster[] monsters, RandomNumberGenerator randomGen) {
        this.victims = victims;
        this.monsters = monsters;
        this.randomGen = randomGen;
    }

    public void run(int rounds) {
        System.out.println("Battle game - start!");

        double monsterAttack;
        double victimDeffence;

        for (int i = 1; i <= rounds; i++) {
            System.out.println("ROUND_NO " + i);

            for (Monster m : this.monsters) {
                for (Victim v : this.victims) {

                    if (randomGen.fromRange(0, 1) < v.escapeChance()) {
                        System.out.printf("Victim '%s' runaway from monster '%s'.\n",
                                v.name(), m.name());
                        continue;
                    }

                    monsterAttack = m.attack();
                    victimDeffence = v.deffence();
                    if (victimDeffence - monsterAttack >= 0) {
                        System.out.printf("Monster '%s' attacked (damage: %f) victim '%s' (deffence: %f). Victim survived.\n",
                                m.name(), monsterAttack, v.name(), victimDeffence);
                    }
                    else {
                        System.out.printf("Monster '%s' attacked (damage: %f) victim '%s' (deffence: %f). Victim id dead.\n",
                                m.name(), monsterAttack, v.name(), victimDeffence);
                    }
                }
            }
        }
    }
}