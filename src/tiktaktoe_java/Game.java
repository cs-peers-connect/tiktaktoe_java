package tiktaktoe_java;
import java.util.*;

public class Game {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int[][] position=new int[3][3];
		
		System.out.println("Welcome to the tic tak toe game!");
		
		System.out.println("Please choose your symbol from O or X:");
		String symbolA = kb.next();
		String symbolB = null;
		
		if(symbolA.equals("X"))
			symbolB = "O";
		else
			symbolB = "X";
		
		boolean win=false;
		do 
		{
			System.out.println("Please choose your move");
			System.out.println("Please choose your row");
			int row=kb.nextInt();
			System.out.println("Please choose your column");
			int column=kb.nextInt();
			
			if(symbolA.equals("X"))
				position[row][column]=+1;
			else if(symbolA.equals("O"))
				position[row][column]=-1;
			
			//check if win
			//example method call: win = isWin();
			//if win, end the game, or continue a new round
			//if not win, continue below
			
		}
		while(!win);
		
		
		

		
		
		
		


		
		
	}

}
