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
       String formattedString = String.format("%.2f", meters);
       return feet + "ft" + "(" + formattedString + ")";
    }

    public String getWeightString()
    {

        double kilograms = 0.4536 * weight;


    }

    public String toString()
    {

        return  "NAME:" + vesselName + "\n" +
                "LENGTH:" + getLengthString() +
                "\n"  "NAME:" + getWeightString() + "\n"
    }

}
