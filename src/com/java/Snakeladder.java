package com.java;

import java.util.Random;

public class Snakeladder {

	static int position = 0; 
	
	public static int diceroll() {
	    Random random = new Random();
		int dice = random.nextInt(6)+1;
		return dice;
	}
	

	public static void main(String[] args) {
	System.out.println("dice= " +diceroll());
	}

}
