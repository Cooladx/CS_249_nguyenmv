package edu.nguyenmv.exercises03;

public class Oregon_trail {
    public static void main(String[] args)
    {
        System.out.println("Hello, traveler!");

        int totalFood = 200;
        int numPeople = 5;
        int ration = 2;

        int totalDays =  totalFood / (numPeople*ration);
        System.out.println("TOTAL DAYS: " + totalDays);
        
    }


}
