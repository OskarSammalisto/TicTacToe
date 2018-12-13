package com.company;

import java.util.Scanner;

public class Player {

    String name;
    int score;
    String marker;

    Player(String name, String marker){
        this.name = name;
        this.marker = marker;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }


    public String getMarker() {
        return marker;
    }

    public void increaseScore(){
        this.score++;
    }

    public void playTurn(Player currentPlayer, Board board) {
        // Board board = new Board();

        // System.out.println(player1.name + " plays first and s/he plays with: " +player1.marker);
        //System.out.println(player2.name + " plays second and s/he plays with: " +player2.marker);
        Scanner sc = new Scanner(System.in);
        System.out.println(); //explanation of grid, which field is what!!!!!!!!!

        int row = 0;
        int col = 0;
        boolean winCheck = false;
        int fieldCheck = 0;

        //player 1's round
        while (fieldCheck == 0) {
            board.printBoard();


            while (row != 1 && row != 2 && row != 3) { //works but a statement where there is no need to constantly set row and col to 0 would be better

                System.out.println(currentPlayer.name + " It's your turn, and you play with an " + currentPlayer.marker + ". Make your move.");
                System.out.println("select which row you want to play, 1, 2 or 3: ");

                try {
                    row = sc.nextInt();

                } catch (Exception e) {
                    //System.out.println("Du kan bara mata in heltal!");
                    sc.nextLine();
                }
                if (row != 1 && row != 2 && row != 3) {
                    System.out.println("You can only select 1, 2 or 3!");
                    System.out.println();
                }
            }

            while (col != 1 && col != 2 && col != 3) {

                System.out.println("select which column you want to play. 1, 2 or 3: ");

                try {

                    col = sc.nextInt();
                } catch (Exception e) {
                    sc.nextLine();
                }

                if (col != 1 && col != 2 && col != 3) {
                    System.out.println("You can only select 1, 2 or 3!");
                    System.out.println();
                }


            }

            if (board.getGameBoard(row - 1, col - 1).equals(" ")) {

                board.setGameBoard(row, col, currentPlayer.getMarker());
                fieldCheck = 1;
                // roundCounter++;
               // break;  //seems a bit barbaric.
            } else {
                System.out.println("This space has already been chosen");
                System.out.println("Try again, and please choose an empty field!");
                sc.nextLine();
                row = 0;
                col = 0;
            }
        }

        //winCheck = board.winCondition(currentPlayer.marker);
        //if (winCheck == true) {
        //    currentPlayer.increaseScore();
         //   System.out.println("Congratulations " + currentPlayer.name + "! You have won this round and you have: " + currentPlayer.score + " points.");
        //    System.out.println("Get ready for the next round!");
           // row = 0;
           // col = 0;
            // break;
       // }


        row = 0;
        col = 0;

        /* if(roundCounter >= 8){
                board.printBoard();
                break;
            }*/
    }
}
