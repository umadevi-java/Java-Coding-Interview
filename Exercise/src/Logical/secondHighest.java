package Logical;

import java.util.Arrays;

public class secondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,8,2,3,7,5,9,4,10};
		int total = Arrays.stream(input).sum();
		System.out.println("sum is "+total);
		
		secondLargest(input);


	}

	private static void secondLargest(int[] input) {
		// TODO Auto-generated method stub
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for(int i : input) {
			if(highest  < i ) {
				secondHighest = highest;
				highest = i;		
			}
			else if (secondHighest < i){
				secondHighest = i;
			}
		}
		System.out.println("secondHighest "+secondHighest);
		
	}

}
