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
		if ((option == LADDER) && (position+dice <= 100)) {
			  position += dice;
		}
		else if (option == SNAKE) {
			   position -= dice;
		}
		else {
			   position = position;
	     if (position < 0) {
	    	 position =0;
	     }
		}
	}
			public static void main(String[] args) {
				int diceCount = 0;
				while(position<100) {
				int dice = diceroll();
	            System.out.println("dice= " +dice);
	            diceCount++;
	            checkOption(dice);
	            System.out.println("Position= " +position);
				}
				System.out.println("diceCount= " +diceCount);
				
			
			}

}

