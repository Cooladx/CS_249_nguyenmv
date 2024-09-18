package edu.nguyenmv.assign02;

import java.util.Scanner;

public class Armada
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         SpaceVessel vessel = new SpaceVessel();
         System.out.println("Enter vessel name:");
         String name = input.nextLine();

         System.out.println("Enter length and weight:");
         String line = input.nextLine(); // Read the length and weight as a single line
         Scanner parseLine = new Scanner(line);
         int feet = parseLine.nextInt();
         int pounds = parseLine.nextInt();


         vessel.setName(name);
         vessel.setLength(feet);
         vessel.setWeight(pounds);


         System.out.println(vessel);

         parseLine.close(); // Close the second scanner
         input.close(); // Close the first scanner


     }


 }
