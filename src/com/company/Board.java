package com.company;

public class Board {

    int size = 3; //board size = size*size
    private String empty = " "; //empty marker

    private String gameBoard[][] = new String[size][size];

    public Board(/*int size*/){
        //this.size = size;
            emptyBoard();


    }

    public void emptyBoard(){
        for (int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[i].length; j++){
                gameBoard[i][j] = empty;
            }
        }
    }

    public void setGameBoard(int i, int j, String gameBoard) {
        this.gameBoard[i-1][j-1] = gameBoard;
    }

    public String getGameBoard(int i, int j) {
        return gameBoard[i][j];
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

    public boolean winCondition(String a){ //Should this be boolean or is there a better variable? Boolean is good.


        //three horizontal wins
        if (gameBoard[0][0].equals(a) && gameBoard[0][1].equals(a) && gameBoard[0][2].equals(a)){
                return true;
            }
        if (gameBoard[1][0].equals(a) && gameBoard[1][1].equals(a) && gameBoard[1][2].equals(a)){
            return true;
        }
        if (gameBoard[2][0].equals(a) && gameBoard[2][1].equals(a) && gameBoard[2][2].equals(a)){
            return true;
        }

        //two diagonal wins
        if (gameBoard[0][0].equals(a) && gameBoard[1][1].equals(a) && gameBoard[2][2].equals(a)){
            return true;
        }
        if (gameBoard[0][2].equals(a) && gameBoard[1][1].equals(a) && gameBoard[2][0].equals(a)){
            return true;
        }

        //three vertical wins
        if (gameBoard[0][0].equals(a) && gameBoard[1][0].equals(a) && gameBoard[2][0].equals(a)){
            return true;
        }
        if (gameBoard[0][1].equals(a) && gameBoard[1][1].equals(a) && gameBoard[2][1].equals(a)){
            return true;
        }
        if (gameBoard[0][2].equals(a) && gameBoard[1][2].equals(a) && gameBoard[2][2].equals(a)){
            return true;
        }



        return false;
    }


}
