package edu.nguyenmv.oregon;
import java.util.*;
import edu.nguyenmv.exercises03.Supplies;
public class OregonTrail
{
    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);
            // Set the starting supplies
            Supplies supplies = new Supplies();

            System.out.println("Enter starting food:");
            int food = input.nextInt();
            supplies.addFood(food);
            System.out.println(supplies);

        // TODO: set who is in the party
            Party party = new Party();
            int milesTraveled = 0;
            double rations = 7;
            int pace = 5;
            int dayCnt = 0;
        // While we're not dead and not there yet
            while(!isGameOver(party, supplies, milesTraveled ))
            {
                // Eat food
                boolean fed = eatFoodForDay(party, supplies, rations);
                // Add to distance
                milesTraveled += pace;
                // add to day count
                dayCnt++;

                // Check if we ran out of food
                // If yes, we instanty perish
                if(!fed)
                {
                    party.killEveryone();
                }
                // print status
                printStatus(dayCnt, milesTraveled, party, supplies);
                // Are ya winning son?


            }

       public static boolean eatFoodForDay( Party party, Supplies supplies, double rations)
        {
        double foodPerday = rations *party.getPartyCnt();

        final double EPS = 1e-7;

        return (Math.abs(foodPerday - foodEaten) < EPS);

        double foodEaten = supplies.removeFood(foodPerday);
        }


    }
    public static boolean isGameOver(Party party, Supplies supplies, int milesTraveled )
    {
        // TODO
        return false;
    }
    public static void printStatus(int dayCnt, int milesTraveled, Party party, Supplies supplies)
    {
        String boundary = "*************"
        System.out.println("**************");
        System.out.println("****************");
        System.out.println(boundary);
        System.out.println("Day " + dayCnt);
        System.out.println("***************");
        System.out.println("Traveled " + milesTraveled);
        System.out.println(supplies);
        System.out.println();
    }
}
