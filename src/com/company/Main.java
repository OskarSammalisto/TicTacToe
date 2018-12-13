package com.company;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int roundCounter = 0; //counts rounds in the game
        int row = 0;
        int col = 0;
        Boolean winCheck = false;



        //create player one and two
        System.out.println("Select player one's name: ");
        String player1Name = sc.nextLine();

        Player player1 = new Player(player1Name, "X");


        System.out.println("Select player two's name: ");
        String player2Name = sc.nextLine();

        Player player2 = new Player(player2Name, "O");

        //create board

        Board board = new Board();

        System.out.println(player1.name + " plays first and s/he plays with: " +player1.marker);
        System.out.println(player2.name + " plays second and s/he plays with: " +player2.marker);
        System.out.println("how to play!"); //explanation of grid, which field is what!!!!!!!!!
        System.out.println("First you select which row you want to play in.");
        System.out.println("Then you select which column you want to play in.");
        System.out.println("       ↓ COLUMN ↓    ");
        System.out.println("     1     2     3   ");
        System.out.println("  +-----+-----+-----+");
        System.out.println("  |     +     +     + 1 ←");
        System.out.println("  +-----+-----+-----+   R");
        System.out.println("  |     +     +     + 2 O");
        System.out.println("  +-----+-----+-----+   W");
        System.out.println("  |     +     +     + 3 ←");
        System.out.println("  +-----+-----+-----+");


        while(true){
            int victory = 0;
            System.out.println("********************************************");
            System.out.println("Scoreboard:");
            System.out.println(player1.name +": " +player1.score +" points!");
            System.out.println(player2.name +": " +player2.score +" points!");
            System.out.println("********************************************");
            System.out.println("");
            System.out.println("'''''Lets play tic tac toe'''''");

                for (int i = 0; i <= 4; i++) {
                    if(victory == 0) {
                        player1.playTurn(player1, board);

                        winCheck = board.winCondition(player1.marker);
                        if (winCheck == true) {

                            player1.increaseScore();
                            System.out.println("Congratulations " + player1.name + "! You have won this round and you have: " + player1.score + " points.");
                            System.out.println("Get ready for the next round!");
                            victory = 1;

                        }
                    }

                    if(victory == 0 && i < 4) {
                        player2.playTurn(player2, board);

                        winCheck = board.winCondition(player2.marker);
                        if (winCheck == true) {

                            player2.increaseScore();
                            System.out.println("Congratulations " + player2.name + "! You have won this round and you have: " + player2.score + " points.");
                            System.out.println("Get ready for the next round!");
                            victory = 1;

                        }
                    }
                    else if(victory == 0) {
                        board.printBoard();
                        System.out.println("This game has ended as a draw");
                        System.out.println("Get ready for the next round!");

                    }

                }

            board.emptyBoard();

        }


        /*

        System.out.println(); //explanation of grid, which field is what!!!!!!!!!

        while (roundCounter <= 8){

            //player 1's round
            while(true) {
                board.printBoard();


                while (row != 1 && row != 2 && row != 3) { //works but a statement where there is no need to constantly set row and col to 0 would be better

                    System.out.println(player1.name + " It's your turn. Make your move.");
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

                if (board.getGameBoard(row -1, col -1).equals(" ")) {

                    board.setGameBoard(row, col, player1.getMarker());
                    roundCounter++;
                    break;  //seems a bit barbaric.
                } else {
                    System.out.println("This space has already been chosen");
                    System.out.println("Try again, and please choose an empty field!");
                    sc.nextLine();
                    row = 0;
                    col = 0;
                }
            }

            winCheck = board.winCondition(player1.marker);
            if(winCheck == true){
                player1.increaseScore();
                System.out.println("Congratulations " +player1.name +"! You have won this round and you have: " +player1.score + " points.");
                System.out.println("Get ready for the next round!");
                row = 0;
                col = 0;
                break;
            }



            row = 0;
            col = 0;

            if(roundCounter >= 8){
                board.printBoard();
                break;
            }

            //player 2's round
            while (true) {

                board.printBoard();

                while (row != 1 && row != 2 && row != 3) {

                    System.out.println(player2.name + " It's your turn. Make your move.");
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

                    board.setGameBoard(row, col, player2.getMarker());
                    roundCounter ++;
                    break;  //seems a bit barbaric.
                } else {
                    System.out.println("This space has already been chosen");
                    System.out.println("Try again, and please choose an empty field!");
                    sc.nextLine();
                    row = 0;
                    col = 0;
                }
            }

            winCheck = board.winCondition(player2.marker);
            if(winCheck == true){
                player2.increaseScore();
                System.out.println("Congratulations " +player2.name +"! You have won this round and you have: " +player2.score + " points.");
                System.out.println("Get ready for the next round!");
                row = 0;
                col = 0;
                break;
            }

            //board.setGameBoard(row, col, player2.getMarker());
            row = 0;
            col = 0;



           // System.out.println(player2.name + " It's your turn. Make your move.");
           // System.out.println("select which row you want to play, 1, 2 or 3: ");
           // row = sc.nextInt();
           // System.out.println("select which column you want to play. 1, 2 or 3: ");
           // col = sc.nextInt();

           // board.setGameBoard(row, col, player2.getMarker());


           // roundCounter++;
        }





       // System.out.println(Arrays.toString(board.getGameBoard()));



        */

    }


}
