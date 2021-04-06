package Logical;

public class NestedParanthesis {

	public static void main(String[] args) {
		String input = "if (test.equals(reversedSB.toString()))";
		char[] inputChars = input.toCharArray();
		int leftParanthesis =0;
		int rightParanthesis =0;

		int firstLeftP = input.indexOf('(');
		int firstRightP = input.indexOf(')');
	

			for(char c : inputChars) {
				
				if(c == '(') {
					leftParanthesis++;
				}
				else if(c == ')') {
					rightParanthesis++;
					leftParanthesis--;
				}
			}
			if(leftParanthesis == 0) {
				System.out.println("Properly nested");
			}
			else {
				System.out.println("Not properly nested");
			}
		
	}

}
