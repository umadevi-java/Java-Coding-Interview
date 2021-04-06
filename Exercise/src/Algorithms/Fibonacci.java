package Algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		int series = 5;
		for(int i=0; i <series ;i++) {
			System.out.print(" "+printFibon(i));
		}

	}

	private static int printFibon(int n) {
		if(n < 2) {
			
			return n;
		}
		
		else {
			return printFibon(n-2) +printFibon(n-1);
		}
	}

}
