package Algorithms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "BINIB";
		chkPalindrome(input);

	}

	private static void chkPalindrome(String input) {
		StringBuffer sb = new StringBuffer();
		char[] characters = input.toCharArray();
		for (char c : characters) {
			sb.append(c);
		}
		if(input.equals( sb.reverse().toString() ) ){
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is NOT a Palindrome");
		}
	}

}
