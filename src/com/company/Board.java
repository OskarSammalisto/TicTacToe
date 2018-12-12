package com.company;

public class Board {

    int size = 3; //board size = size*size
    private String empty = " "; //empty marker


    private String gameBoard[][] = new String[size][size];

    public Board(/*int size*/){
        //this.size = size;

        for (int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[i].length; j++){
                gameBoard[i][j] = empty;
            }
        }

    }

    public void setGameBoard(int i, int j, String gameBoard) {
        this.gameBoard[i-1][j-1] = gameBoard;
    }

    public String[][] getGameBoard() {
        return gameBoard;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printBoard(){


        System.out.println("+---+---+---+");
        System.out.println("| " + gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2] + " |");
        System.out.println("+---+---+---+");
    }


}
