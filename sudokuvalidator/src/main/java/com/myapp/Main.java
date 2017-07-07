package com.myapp;

//Assignment 2
public class Main {
    public static void main(String[] args){

        char[][] board = new char[][]{
                "316578492".toCharArray(),
                "529134768".toCharArray(),
                "487629531".toCharArray(),
                "263415987".toCharArray(),
                "974863125".toCharArray(),
                "851792643".toCharArray(),
                "138947256".toCharArray(),
                "692351874".toCharArray(),
                "745286319".toCharArray()};

        SudokuChecker sudokuChecker = new SudokuChecker();

        if(sudokuChecker.isBoardComplete(board)) {
            System.out.println(sudokuChecker.isValidSudoku(board) ? "Valid Sudoku" : "Not Valid Sudoku");
        } else{
            System.out.println("Not Valid");
        }
    }
}

