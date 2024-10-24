package edu.nguyenmv.test;

public class Toilet {
    private double gpf = 3.7;

    public Toilet() {
    }
    public Toilet(double userInput)
    {
 this.gpf = userInput;
    }

    public double flush(int cnt)
    {

        return gpf * cnt;
    }

    public static double computeGallons (int iter, double gallons)
    {
        return iter * gallons;
    }

}

// Brightspace text editor is the best /s
