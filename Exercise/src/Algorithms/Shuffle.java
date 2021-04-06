package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		int[] input = {3,2,1,5};
		
		mixThem(input);

	}

	private static void mixThem(int[] input) {
		Random rand = new Random();
		
		
		for(int i=0; i<input.length; i++) {
			int randIndex = rand.nextInt(input.length);
			int temp = input[i];
			input[i] = input[randIndex];
			input[randIndex] = temp;
		}
		System.out.println("Shuffled Input "+Arrays.toString(input));
		
	}

}
