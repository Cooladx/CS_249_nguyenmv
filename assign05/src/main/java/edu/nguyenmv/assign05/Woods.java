package edu.nguyenmv.assign05;
import java.util.*;
public class Woods {
    ArrayList<Giant> giants = new ArrayList<>();
    public Giant createGiant (String name, String typeName) {
        if (name.isEmpty()) {
            return null;
        }
        return switch (typeName.toUpperCase()) {
            case "GIANT" -> new Giant(name);
            case "TROLL" -> new Troll(name);
            case "TREE" -> new Tree(name);
            case "ENT" -> new Ent(name);
            case "HUORN" -> new Huorn(name);
            default -> null;
        };


    }
    public boolean addGiant (String name, String typeName) {
        Giant giant = createGiant(name, typeName);
        if (giant != null) {
            giants.add(giant);
            return true;
        }
        return false;
    }

    public Giant getGiant (int index) {
        if (index >= 0 && index < giants.size()) {
            return giants.get(index);
        }
        return null;
    }

    public void printAllGiants () {
        System.out.println("ALL GIANTS:");
        for(Giant giant: giants) {
            System.out.println("- " + (giant.toString()));
        }
    }


    public void printAllTrees() {
        System.out.println("ALL TREES:");
        for(Giant giant: giants) {
            if (giant instanceof Tree tree) {
                System.out.println("- " + tree.toString() + ": " + tree.speak());
            }
        }
    }
    public void printAllTrolls() {
        System.out.println("ALL TROLLS:");
        for(Giant giant: giants) {
            if(giant instanceof Troll troll) {
                System.out.println("- " + troll.toString() + ": " + troll.cook());
            }
        }
    }
}
