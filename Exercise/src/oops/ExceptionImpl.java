package oops;

public class ExceptionImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input = "";
		String input = null;
		foo(input);
		
	}

	private static void foo(String input) {
		try {
			System.out.println("whats the first char"+input.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("Caught in NPE");
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("Caught in the SIOB Exception");
		}
		
	}

}
