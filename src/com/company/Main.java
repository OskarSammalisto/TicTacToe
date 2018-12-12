package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int roundCounter = 0; //counts rounds in the game
        int row;
        int col;



        //create player one and two
        System.out.println("Select player one's name: ");
        String player1Name = sc.nextLine();

        Player player1 = new Player(player1Name, "X");


        System.out.println("Select player two's name: ");
        String player2Name = sc.nextLine();

        Player player2 = new Player(player2Name, "Y");

        //create board

        Board board = new Board();

        System.out.println(player1.name + " plays first and s/he plays with: " +player1.marker);
        System.out.println(player2.name + " plays second and s/he plays with: " +player2.marker);

        System.out.println(); //explanation of grid, which field is what!!!!!!!!!

        while (roundCounter < 9){



            board.printBoard();

            System.out.println(player1.name + " It's your turn. Make your move.");
            System.out.println("select which row you want to play, 1, 2 or 3: ");
            row = sc.nextInt();
            System.out.println("select which column you want to play. 1, 2 or 3: ");
            col = sc.nextInt();

            board.setGameBoard(row, col, player1.getMarker());

            board.printBoard();

            System.out.println(player2.name + " It's your turn. Make your move.");
            System.out.println("select which row you want to play, 1, 2 or 3: ");
            row = sc.nextInt();
            System.out.println("select which column you want to play. 1, 2 or 3: ");
            col = sc.nextInt();

            board.setGameBoard(row, col, player2.getMarker());







            roundCounter++;
        }





       // System.out.println(Arrays.toString(board.getGameBoard()));





    }


}
