package edu.nguyenmv.assign06;
import edu.nguyenmv.assign04.GameBoard;
public class Rat extends Creature{
    public Rat() {};

    public Rat(int row, int col) {
        super(row, col);
    }

    public String toString() {
        return "Rat at " + getRow() + "," + getCol();
    }

    public void draw(GameBoard map) {
        map.setPos(getRow(), getCol(), 'R');
    }
}
