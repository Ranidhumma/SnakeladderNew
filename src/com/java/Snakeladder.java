package com.java;

import java.util.Random;

public class Snakeladder {
	
	static int position = 0; 
	static final int NO_PLAY = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	
	public static int diceroll() {
	    Random random = new Random();
		int dice = random.nextInt(6)+1;
		return dice;
	}
	public static void checkOption(int dice) {
		Random random = new Random();
		int option = random.nextInt(3);
		if (option == LADDER) {
			  position += dice;
		}
		else if (option == SNAKE) {
			   position -= dice;
		}
		else {
			   position = position;
		}
	}
			public static void main(String[] args) {
				while(position<100) {
					int dice = diceroll();
	System.out.println("dice= " +dice);
	 checkOption(dice);
	System.out.println("Position= " +position);
	}

}
}
