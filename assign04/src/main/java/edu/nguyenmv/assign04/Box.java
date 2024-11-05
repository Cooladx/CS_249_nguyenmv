package edu.nguyenmv.assign04;

public class Box {
private int startRow;
private int endRow;
private int startCol;
private int endCol;
private boolean filled;
private char drawChar;
    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar) {
this.startRow = sr;
this.startCol = sc;
this.endRow = er;
this.endCol = ec;
this.filled = filled;
this.drawChar = drawChar;
    }

    public String toString() {
        if (filled) {
            return "Filled Box from (" + startRow + "," + startCol + ") to (" + endRow + "," + endCol + ") with char " + "'" + drawChar + "'";
        }
        else {
            return "Box from (" + startRow + "," + startCol + ") to (" + endRow + "," + endCol + ") with char " + "'" + drawChar + "'";

        }
    }

    public void draw(GameBoard s) {
        if (filled) {
            for (int row = startRow; row <= endRow;  row++) {
                for (int col = startCol; col <= endCol; col++) {
                    s.setPos(row, col, drawChar);
                }
            }
        }
        else {
            for (int row = startRow; row <= endRow;  row++) {
                s.setPos(row, startCol, drawChar);
                s.setPos(row, endCol, drawChar);
                }
            for (int col = startCol; col <= endCol;  col++) {
                s.setPos(startRow, col, drawChar);
                s.setPos(endRow, col, drawChar);
            }
        }
    }
}
