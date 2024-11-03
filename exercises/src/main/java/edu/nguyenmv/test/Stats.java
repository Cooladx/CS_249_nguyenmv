package edu.nguyenmv.test;

public class Stats {
    private int charisma = 10;
    private int strength = 10;
    private int agility = 10;

    public Stats() {}
    public Stats(int c, int s, int a) {
        charisma = c;
        strength = s;
        agility = a;
    }

    public int getCharisma() { return charisma; }
    public int getStrength() { return strength; }
    public int getAgility() { return agility; }
}