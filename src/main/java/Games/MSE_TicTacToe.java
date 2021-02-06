package Games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MSE_TicTacToe {
	
	public static String board[] = new String[9];
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Arrays.fill(board, " ");
		printGameDetails();
		printTicTAcToeBoard();
		boolean isGameOn = true;
		while(isGameOn)
		{
			playGameFor("X");
			if(checkBoardStatus())
				playGameFor("O");
		}
		
		
	}
	
	
	public static void printTicTAcToeBoard()
	{
		System.out.println(" --------------");
		for(int i = 0 ; i<board.length ; i = i+3)
		{
			System.out.println(" | "+board[i]+" | "+board[i+1]+" | "+board[i+2]+" |");
			System.out.println(" --------------");
		}
		
	}
	
	
	public static void playGameFor(String player)
	{
		boolean keepPlaying = true;
		while(keepPlaying)
		{
			System.out.println("Player "+player+" Turn. Enter box number in between 1-9 : ");
			int pos = sc.nextInt();
			if(board[pos-1].equals(" "))
			{
				board[pos-1]=player;
				keepPlaying = false;
				printTicTAcToeBoard();
			}
			else
			{
				System.out.println("Place is already taken. Please re enter index");
			}
				
		}
	}
	
	public static boolean checkBoardStatus()
	{
		List<String> result = new ArrayList<>();
		result.add(board[0]+board[1]+board[2]);
		result.add(board[3]+board[4]+board[5]);
		result.add(board[6]+board[7]+board[8]);
		result.add(board[0]+board[3]+board[6]);
		result.add(board[1]+board[4]+board[7]);
		result.add(board[2]+board[5]+board[8]);
		result.add(board[0]+board[4]+board[8]);
		result.add(board[2]+board[4]+board[6]);
		System.out.println(result);
		if(result.contains("XXX"))
		{
			System.out.println("Winner is X");
			System.exit(0);
		}
		else if(result.contains("OOO"))
		{
			System.out.println("Winner is O");
			System.exit(0);
		}
		if(!Arrays.asList(board).contains(" "))
		{
			System.out.println("Draw");
			System.exit(0);
		}
		return true;
				
		
	}
	
	public static void printGameDetails()
	{
		System.out.println("Welcome to Tic Tac Toe Game.");
		System.out.println("Player 1 = \"X\" ");
		System.out.println("Player 1 = \"O\" ");
		System.out.println("Game Starts.......");
	}

}
