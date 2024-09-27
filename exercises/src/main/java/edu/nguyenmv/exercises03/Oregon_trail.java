package edu.nguyenmv.exercises03;

import java.util.Scanner;

public class Oregon_trail {
    public static void main(String [] args) {
        System.out.println("WELCOME!");

        Supplies supplies = new Supplies();
        System.out.println(supplies);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter food:");
        int totalFood = input.nextInt();
        System.out.println("Enter num of people:");

        int numPeople = input.nextInt();
        System.out.println("Enter rations:");

        int ration = input.nextInt();

        int totalDays = totalFood/(numPeople*ration);

        System.out.println("TOTAL DAYS: " + totalDays);
    }
}
