package com.game;

import java.util.Random;
import java.util.Scanner;

public class Uc5_positionmove {
	  public static void main(String[] args) {
	        System.out.println("Welcome to game board of Tic Tac Toe ");
	        char[][] gameboard = {{' ', '|', ' ', '|', ' '},
	                {'_', '+', '_', '+', '_'},
	                {' ', '|', ' ', '|', ' '},
	                {'_', '+', '_', '+', '_'},
	                {' ', '|', ' ', '|', ' '}};
	        showboard(gameboard);
	        playermove(gameboard);
	        computermove(gameboard);

	    }
	    public static void showboard(char[][] gameboard) {

	        for (char[] row : gameboard) {
	            for (char c : row){
	                System.out.print("  " + c);
	            }
	            System.out.println("  ");
	        }
	    }
	    public static void placepiece( char[][] gameboard, int pos, String user){

	        char symbol = ' ';
	        if(user.equals("player")){
	            symbol='X';
	        } else if (user.equals("computer")){
	            symbol='O';
	        }
	        switch (pos) {
	            case 1: gameboard[0][0] = symbol;
	            case 2: gameboard[0][2] = symbol;
	            case 3: gameboard[0][4] = symbol;
	            case 4: gameboard[2][0] = symbol;
	            case 5: gameboard[2][2] = symbol;
	            case 6: gameboard[2][4] = symbol;
	            case 7: gameboard[4][0] = symbol;
	            case 8: gameboard[4][2] = symbol;
	            case 9: gameboard[4][4] = symbol;
	            default: {
	            }
	        }
	        showboard(gameboard);
	    }
	    public static void playermove(char[][] gameboard){
	        System.out.println("player chance");
	        System.out.println("Enter your selected position from 1 to 9 for gameboard ");
	        Scanner select = new Scanner(System.in);
	        int playerpos = select.nextInt();
	        boolean result = isvalidmove(gameboard,playerpos);
	        while (!result){
	            System.out.println("Sorry invalid move try again");
	            playerpos = select.nextInt();
	            result = isvalidmove(gameboard,playerpos);
	        }
	        placepiece( gameboard, playerpos, "player" );

	    }
	    public static void computermove(char[][] gameboard){
	        Random run = new Random();
	        int computerpos = run.nextInt(9)+1;
	        System.out.println("computer chance");
	        boolean r = isvalidmove(gameboard,computerpos);
	        while (!r){
	            System.out.println("computer invalid try again");
	            r = isvalidmove(gameboard,computerpos);
	            computerpos = run.nextInt(9)+1;
	        }
	        placepiece( gameboard, computerpos, "computer" );
	    }

	    public static boolean isvalidmove(char[][] gameboard, int move){
	        switch (move){
	            case 1:
	                if (gameboard[0][0] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }
	            case 2:
	                if (gameboard[0][2] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }
	            case 3:
	                if (gameboard[0][4] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }

	            case 4:
	                if (gameboard[2][0] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }
	            case 5:
	                if (gameboard[2][2] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }
	            case 6:
	                if (gameboard[2][4] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }
	            case 7:
	                if (gameboard[4][0] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }
	            case 8:
	                if (gameboard[4][2] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }
	            case 9:
	                if (gameboard[4][4] == ' '){
	                    return true;
	                }else {
	                    return false;
	                }
	            default:
	                return false;
	        }
	    }

	}


