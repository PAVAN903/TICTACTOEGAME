package com.game;

import java.util.Random;
import java.util.Scanner;

public class Uc4_game {
	public static void main(String[] args) {
		System.out.println("welcome to tic tac toe game");
		char [][] gameBoard ={{' ','|',' ','|',' '},
			{'-','+','-','+', '-'},
			{' ','|',' ','|',' '},
			{'-','+','-','+', '-'},
			{' ','|',' ','|',' '}};
		printgameboard(gameBoard);
		while(true) {

			Scanner sc=new Scanner(System.in);
			System.out.println("enter your placements(1-9)::");
			int pos=sc.nextInt();
			
			placepiece(gameBoard,pos,"player");
			
			Random run=new Random();
			int computerpos=run.nextInt(9)+1;
			
			placepiece(gameBoard,computerpos,"computer");
		}
		}
      public static void printgameboard(char[][] gameBoard) {
    	  for(char[] row : gameBoard) {
  			for(char c : row) {
  				System.out.print(c);
  			}
  			System.out.println();
  			}
            }
      public static void placepiece(char[][]gameBoard,int pos,String user) {
    	char symbol=' ';
    	if(user.equals("player")) {
    		symbol='x';
    	}else if(user.equals("computer")) {
    		symbol='o';
    	}
    	switch(pos) {
    	 case 1:
			  gameBoard[0][0]=symbol;
			  break;
			  
		  case 2:
			  gameBoard[0][2]=symbol;
			  break;
			  
		  case 3:
			  gameBoard[0][4]=symbol;
			  break;
			  
		  case 4:
			  gameBoard[2][0]=symbol;
			  break;
			  
		  case 5:
			  gameBoard[2][2]=symbol;
			  break;
			  
		  case 6:
			  gameBoard[2][4]=symbol;
			  break;
			  
		  case 7:
			  gameBoard[4][0]=symbol;
			  break;
			  
		  case 8:
			  gameBoard[4][2]=symbol;
			  break;
			  
		  case 9:
			  gameBoard[4][4]=symbol;
			  break;
			       default:
			  break;
    	}
    	  printgameboard(gameBoard);
    		
    	}
      }
	        
