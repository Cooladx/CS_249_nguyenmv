package edu.nguyenmv.assign04;

public class GameBoard {
private int rowCnt;
private int colCnt;
private char fillChar;
private char [][] board;

    public GameBoard(int rowCnt, int colCnt, char fillChar){
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        for (int i = 0; i < colCnt ; i++) {
            for (int j = 0; j < rowCnt ; j++) {
                board[i][j] = fillChar;

            }
        }
        return;
    }

    public void clear() {
f
    }
    public int getRowCnt(int colCnt) {
        return colCnt;
    }

    public int getColCnt(int rowCnt) {
    return rowCnt;
    }

    public boolean isValidPosition(int row, int col) {
        return false;

    }

    public char getPos(int row, int col) {

    }


    public boolean setPos(int row, int col, char c) {
        return false;
    }

    public String toString() {
        return null;

    }

    public String getBoardString() {
        return null;
    }

}
