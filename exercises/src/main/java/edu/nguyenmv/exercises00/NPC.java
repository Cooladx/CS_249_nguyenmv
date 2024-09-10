package edu.nguyenmv.exercises00;

public class NPC {
private int health = 100;
private String name = ""; //null
    public int getHealth()
    {
        return health;
    }

    public NPC(){}

  public NPC(String n)
  {
      String name;

  }
    public boolean setHealth(int h)
    {
        if (h >=0 && h <=100)
        {
            health = h;
            return true;
        }
        else
        {
            System.out.println("ERROR: BAD HEALTH");
            return false;
        }
    }
    public String getName()
    {
        return name;

    }
}
