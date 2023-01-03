package com.game;

import java.util.Scanner;

public class Uc2_chooseletter {
	public static void main(String[] args) {
		char [][] gameBoard ={{' ','|',' ','|',' '},
			{'-','+','-','+', '-'},
			{' ','|',' ','|',' '},
			{'-','+','-','+', '-'},
			{' ','|',' ','|',' '}};
		
		printGameBoard(gameBoard);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your placements(1-9)::");
		int pos=sc.nextInt();
		System.out.println(pos);
		switch(pos){
			case 1:
				  gameBoard[0][0]='x';
				  break;
			case 2:
				 gameBoard[0][2]='x';
            
            case3:
	              gameBoard[0][4]='x';
	              break;
			case 4:
				 gameBoard[2][0]='x';
			     break;
            case 5:
	              gameBoard[2][2]='x';
	              break;
        
            case 6:
	              gameBoard[2][4]='x';
	              break;
        
            case 7:
	              gameBoard[4][0]='x';
	              break;
            case 8:
	              gameBoard[4][2]='x';
	              break;
            case 9:
	              gameBoard[4][4]='x';
	              break;
       }
             printGameBoard(gameBoard);
       }
		public static void printGameBoard(char[][] gameBoard) {	
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
			}
			}
		}

	 


