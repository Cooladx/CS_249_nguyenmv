package edu.nguyenmv.exercises00;
public class Nothing {
    public static void main(String [] args)
    {
        int x = 5;
        NPC bob = new NPC();
        NPC susan = new NPC("Susan");
        System.out.println("Bob's health: " + bob.getHealth());
        bob.setHealth(50);
        System.out.println("Bob's health again: " + bob.getHealth());
        System.out.println("Susan's health: " + susan.getHealth());
        bob.setHealth(800);
        System.out.println("Bob's health again for the 3rd TIME!: " + bob.getHealth());




    }
}
