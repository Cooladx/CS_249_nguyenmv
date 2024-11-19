package edu.nguyenmv.assign06;

public class Item implements Loadable {
    private int value = 0;
    private String ID = "";
    public Item() {}

    public Item(String ID, int value) {
        this.ID = ID;
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return ID + "with value " + value;
    }
    public void load(Scanner input) throws GameFileException {
        try {
        input.next(ID);
        input.nextInt(value);
        } catch (Exception e) {
            ID = "";
            value = 0;
            throw new GameFileException("Error loading Item", e);
        }
        }
    }