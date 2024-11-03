package edu.nguyenmv.test;

public class MethodArray {
    public static void swapCoords(double [] coords) {
        double tmp = coords[0];
        coords[0] = coords[1];
        coords[1] = tmp;
    }
    public static void main(String [] args) {
        double [] point = { 3.5, 8.9 };
        swapCoords(point);
        System.out.println(Arrays.toString(point));
    }
}
