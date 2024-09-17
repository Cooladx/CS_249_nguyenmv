package edu.nguyenmv.assign02;

import java.util.Scanner;

public class Armada
 {
     public static void main(String[] args)
     {
         int pounds = 0;
         int feet = 0;
         double meters = 0;
         Scanner scanner = new Scanner(System.in);
         SpaceVessel vessel = new SpaceVessel();
         System.out.println("Enter vessel name:");
         String vesselName = scanner.nextLine();

         Scanner parseLine = new Scanner(vesselName);
         pounds = parseLine.nextInt();
         feet = parseLine.nextInt();


         vessel.setName(vesselName);
         vessel.setLength(feet);
         vessel.setWeight(pounds);


        // System.out.println(vessel.toString());



     }


 }
