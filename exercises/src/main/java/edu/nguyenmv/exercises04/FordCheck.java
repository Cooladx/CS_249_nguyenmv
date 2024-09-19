package edu.nguyenmv.exercises04;
import java.util.*;
public class FordCheck {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seed:");
        // Expected long, could still take int but put long
        long seed = input.nextLong();
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            boolean result = r.nextBoolean();
            if (result) {
                System.out.println("Got across safely.");

            } else {
                System.out.println("dead.");
            }
        }
    }

}
