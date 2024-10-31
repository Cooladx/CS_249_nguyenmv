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
    }

    public void clear() {
        for (int i = 0; i < colCnt; i++) {
            for (int j = 0; j < rowCnt; j++) {
                board[i][j] = fillChar;
            }
        }
    }
    public int getRowCnt() {
        return colCnt;
    }

    public int getColCnt() {
    return rowCnt;
    }

    public boolean isValidPosition(int row, int col) {
        return (row >= 0 && row < rowCnt) && (col >= 0 && col < colCnt);
    }

    public char getPos(int row, int col) {
        if ((row >= 0 && row <  rowCnt) && (col >= 0 && col < colCnt)) {
             board[row][col] = fillChar;
        }
            return ' ';
    }


    public boolean setPos(int row, int col, char c) {
        if ((row >= 0 && row <  rowCnt) && (col >= 0 && col < colCnt)) {
            board[row][col] = c;
        }
        return true;
    }

    public String toString() {
        return rowCnt + "x" + colCnt + "GameBoard(default: " + fillChar +")";

    }

    public String getBoardString() {
        return null;
    }

}
