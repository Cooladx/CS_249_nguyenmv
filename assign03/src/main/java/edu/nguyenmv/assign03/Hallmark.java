package edu.nguyenmv.assign03;
import java.util.Scanner;
public class Hallmark

{
    public static GreetingCard generateCard(Scanner input)
    {

         System.out.println("Enter boundary character:");
         char bCharacter = input.nextLine().charAt(0);
         System.out.println("Enter number of lines");
         int numOfLines = Integer.parseInt(input.nextLine());

         // TODO
        return null;

    }




    public static void main(String[] args)
    {
        Scanner greet = new Scanner(System.in);
        GreetingCard n = generateCard(greet);
        System.out.println("For any occasion");
        System.out.println(n);
    }



}
