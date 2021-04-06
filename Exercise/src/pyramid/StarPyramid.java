package pyramid;

public class StarPyramid {

	/**
	 * Program to print following pyramid structure
	 * 
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 
	 */
	private static void printPattern3(int rows) {
		// for loop for the rows
		for (int i = 1; i <= rows; i++) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			// print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			// print character
			printString("* ", i);

			// move to next line
			System.out.println("");
		}
	}

	private static void printString(String s, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Please enter the rows to print:");
		int rows = 5;
		// System.out.println("Rows = "+rows);

		System.out.println("Printing Pattern 2\n");
		printPattern3(rows);

	}

}
