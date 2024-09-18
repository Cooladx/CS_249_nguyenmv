package edu.nguyenmv.assign02;

public class SpaceVessel
{
    private String vesselName = "";
    private int length = 0;
    private int weight = 0;


    public String getName()
    {
        return vesselName;
    }

    public int getLength()
    {
        return length;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setName (String name)
    {
        vesselName = name;
    }
    public void setLength(int feet)
    {
        length = feet;
    }
    public void setWeight(int pounds)
    {
        weight = pounds;
    }

    public String getLengthString()
    {

        double meters = 0.3048 * length;
       //String lengthedString = String.format("%.2f", meters);
       return length + "ft" + "(" + String.format("%.2f", meters)  + ")";
    }

    public String getWeightString()
    {

         double kilograms = 0.4536 * weight;
        // String weighttedString = String.format("%.2f", kilograms);
         return weight + "lbs.(" + String.format("%.2f", kilograms) + "kg)";

    }

    public String toString()
    {
        return  "NAME: " + vesselName + "\n" +
                "LENGTH: " + getLengthString() + "\n" +
                "WEIGHT: " + getWeightString() + "\n";

    }



}
