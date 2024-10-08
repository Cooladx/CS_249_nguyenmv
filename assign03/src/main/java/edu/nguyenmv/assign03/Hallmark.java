package edu.nguyenmv.assign03;
import java.util.Scanner;
public class Hallmark

{
    public static GreetingCard generateCard(Scanner input)
    {

         System.out.println("Enter boundary character:");
         char boundaryChar = input.nextLine().charAt(0);
         System.out.println("Enter number of lines:");
         int numOfLines = Integer.parseInt(input.nextLine());

         String [] allLines = new String[numOfLines];
         System.out.println("Enter lines:");

        for (int i = 0; i < numOfLines; i++)
        {
            allLines [i] = input.nextLine();
        }


        return new GreetingCard(allLines, boundaryChar);

    }

    public static void main(String[] args)
    {
        Scanner greet = new Scanner(System.in);
        GreetingCard n = generateCard(greet);
        System.out.println("For any occasion:");
        System.out.println(n);
    }



}
