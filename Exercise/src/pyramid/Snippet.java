package pyramid;

public class Snippet {
	
	/**
	 * 
	 * Program to print below pyramid structure
	 *      1         
	       1 2        
	      1 2 3       
	     1 2 3 4      
	    1 2 3 4 5     
	   1 2 3 4 5 6    
	  1 2 3 4 5 6 7   
	 1 2 3 4 5 6 7 8  
	1 2 3 4 5 6 7 8 9 
	*/
	private static void printPattern2(int rows) {
		// for loop for the rows
		for (int i = 1; i <= rows; i++) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;
	
			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);
	
			//print numbers
			for(int x = 1; x<=i; x++) {
				System.out.print(x+" ");
			}
	
			//move to next line
			System.out.println("");
		}
	}
	private static void printString(String s, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}
	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Please enter the rows to print:");
		int rows = 5;
		// System.out.println("Rows = "+rows);
		
		System.out.println("Printing Pattern 2\n");
		printPattern2(rows);

	}
}

