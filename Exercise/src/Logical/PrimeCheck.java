package Logical;

import java.util.List;
import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number to check for Prime");
		int number = sc.nextInt();*/
		int number =23;
		// chkPrime(number);
				
	
	}

	private static boolean chkPrime(int number) {
		for(int i=2; i<=number/2 ; i++) {
			if(number%i == 0) {
				System.out.println("It is NOT a prime");
				return false;
			}
		}
		System.out.println("It is prime");
			return true;
		
	}
}
