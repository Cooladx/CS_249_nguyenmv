package edu.nguyenmv.assign04;

public class GameBoard {
private int rowCnt;
private int colCnt;
private char fillChar;
private char [][] board;

    public GameBoard(int rowCnt, int colCnt, char fillChar){
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        board = new char[rowCnt][colCnt];
        for (int i = 0; i < rowCnt ; i++) {
            for (int j = 0; j < colCnt ; j++) {
                board[i][j] = fillChar;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt ; j++) {
                board[i][j] = fillChar;
            }
        }
    }
    public int getRowCnt() {
        return rowCnt;
    }

    public int getColCnt() {
    return colCnt;
    }

    public boolean isValidPosition(int row, int col) {
        return (row >= 0 && row < rowCnt) && (col >= 0 && col < colCnt);
    }

    public char getPos(int row, int col) {
        if (isValidPosition(row, col)) {
            return board[row][col];
        }
            return ' ';
    }


    public boolean setPos(int row, int col, char c) {
        if (isValidPosition(row, col)) {
            board[row][col] = c;
            return true;
        }
       return false;
    }

    public String toString() {
        return rowCnt + " x " + colCnt + " GameBoard (default: " + fillChar + ")";

    }

    public String getBoardString() {
        StringBuilder boardString = new StringBuilder();
        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                boardString.append(board[i][j]);
            }
            boardString.append("\n");
        }
        return boardString.toString();
    }

}
