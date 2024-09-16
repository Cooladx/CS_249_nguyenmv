package edu.nguyenmv.exercises03;

public class Supplies
{
    private double totalFood = 0.0;

    public double getTotalFood()
    {
        return totalFood;
    }
   public double addFood(int foodInc)
   {
       if (foodInc >= 0)
       {
           totalFood += foodInc;
           return foodInc;
       }
       return 0;
   }
    public double removeFood(double foodDec)
    {
     if (foodDec >= 0)
      {
       foodDec = Math.min(totalFood, foodDec);
       totalFood -= foodDec;

      }
        return foodDec;

    }
 public String toString()
 {
     String s = "";
     s += "** SUPPLIES *********\n";
             s += "* FOOD:" + getTotalFood() + "\n";
     s += "***************************\n";
     return s;

 }


}
