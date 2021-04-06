package Logical;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {15, 12, 7, 3, 10};
		Random rand = new Random();
		
		for(int i=0; i< input.length; i++) {
			int randIndex = rand.nextInt(input.length);
			int temp = input[i];
			input[i] = input[randIndex];
			input[randIndex] = temp;
		}
		System.out.println(Arrays.toString(input));
	}

}
