package com.myapp;

public class SudokuChecker {
    public boolean isValidSudoku(char[][] board) {

        int rows = board.length;
        if(rows == 0) return true;
        int cols = board[0].length;
        char[] tmp = new char[cols];
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                tmp[j] = board[i][j];
            }
            if(!check(tmp)) {
                return false;
            }
        }
        
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                tmp[j] = board[j][i];
            }
            if(!check(tmp)) {
                return false;
            }
        }
        
        for(int i = 0; i < rows; i+=3) {
            for(int j = 0; j < cols; j+=3) {
                getSquare(board, i, j, tmp);
                if(!check(tmp)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean check(char[] ary) {
        boolean[] check = {false,false,false,false,false,false,false,false,false};
        for(int i = 0; i < ary.length; i++) {
            if(ary[i] == '.') {
                continue;
            } else if(check[ary[i] - '1']) {
                return false;
            } else {
                check[ary[i] - '1'] = true;
            }
        }
        
        return true;
    }
    
    public void getSquare(char[][] board, int rowStart, int colStart, char[] tmp) {
        int endRow = rowStart + 3;
        int endCol = colStart + 3;
        int index = 0;
        for(int i = rowStart; i < endRow; i++) {
            for(int j = colStart; j < endCol; j++) {
                tmp[index] = board[i][j];
                index++;
            }
        }
        return;
    }

    public boolean isBoardComplete(char[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            for(int j =0; j < board.length; j++)
            {
                if (board[i][j] == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}