package dev.antoniak;

import dev.antoniak.monster.Monster;
import dev.antoniak.monster.OrdinaryMonster;
import dev.antoniak.monster.RandomMonster;
import dev.antoniak.randomnumbergenerator.RandomNumberGenerator;
import dev.antoniak.victim.OrdinaryVictim;
import dev.antoniak.victim.RandomVictim;
import dev.antoniak.victim.Victim;
import dev.antoniak.engine.Word;

public class Main {

    public static void main(String[] args) {
        RandomNumberGenerator randomGen = new RandomNumberGenerator();

        Monster wasp = new OrdinaryMonster("wild wasp", 1.2);
        Monster karmic = new RandomMonster("karmic koala", 2.1, randomGen);
        Victim uncleBen = new OrdinaryVictim("uncle Ben", 1.1, randomGen);
        Victim uncleSam = new RandomVictim("uncle Sam", 2.3, randomGen);

        Word battleWord = new Word(new Victim[]{uncleBen, uncleSam}, new Monster[]{wasp, karmic}, randomGen);
        battleWord.run(10);
    }
}