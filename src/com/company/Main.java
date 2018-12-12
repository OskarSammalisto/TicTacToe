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

        System.out.println(); //explanation of grid, which field is what!!!!!!!!!

        while (roundCounter < 4){



            board.printBoard();


            while(row != 1 && row != 2 && row !=3) {

                System.out.println(player1.name + " It's your turn. Make your move.");
                System.out.println("select which row you want to play, 1, 2 or 3: ");

                try {
                    row = sc.nextInt();

                }
                catch (Exception e) {
                    //System.out.println("Du kan bara mata in heltal!");
                    sc.nextLine();
                }
                if(row != 1 && row != 2 && row !=3){
                    System.out.println("You can only select 1, 2 or 3!");
                    System.out.println();
                }
            }

            while(col != 1 && col != 2 && col !=3) {

                System.out.println("select which column you want to play. 1, 2 or 3: ");

                try{

                    col = sc.nextInt();
                }
                catch (Exception e){
                    sc.nextLine();
                }

                if(col != 1 && col != 2 && col != 3){
                    System.out.println("You can only select 1, 2 or 3!");
                    System.out.println();
                }



            }

            board.setGameBoard(row, col, player1.getMarker());
            row = 0;
            col = 0;

            board.printBoard();

            while(row != 1 && row != 2 && row !=3) {

                System.out.println(player2.name + " It's your turn. Make your move.");
                System.out.println("select which row you want to play, 1, 2 or 3: ");

                try {
                    row = sc.nextInt();

                }
                catch (Exception e) {
                    //System.out.println("Du kan bara mata in heltal!");
                    sc.nextLine();
                }
                if(row != 1 && row != 2 && row !=3){
                    System.out.println("You can only select 1, 2 or 3!");
                    System.out.println();
                }
            }

            while(col != 1 && col != 2 && col !=3) {

                System.out.println("select which column you want to play. 1, 2 or 3: ");

                try{

                    col = sc.nextInt();
                }
                catch (Exception e){
                    sc.nextLine();
                }

                if(col != 1 && col != 2 && col != 3){
                    System.out.println("You can only select 1, 2 or 3!");
                    System.out.println();
                }



            }

            board.setGameBoard(row, col, player2.getMarker());
            row = 0;
            col = 0;



           /* System.out.println(player2.name + " It's your turn. Make your move.");
            System.out.println("select which row you want to play, 1, 2 or 3: ");
            row = sc.nextInt();
            System.out.println("select which column you want to play. 1, 2 or 3: ");
            col = sc.nextInt();

            board.setGameBoard(row, col, player2.getMarker()); */







            roundCounter++;
        }





       // System.out.println(Arrays.toString(board.getGameBoard()));





    }


}
