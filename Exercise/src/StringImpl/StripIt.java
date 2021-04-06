package StringImpl;

public class StripIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "   te  st  ";
		stripSpaces(input);

	}

	private static void stripSpaces(String input) {
		char[] characters = input.toCharArray();
		StringBuffer output = new StringBuffer();
		for (char c: characters) {
			if(!Character.isWhitespace(c)) {
				output.append(c);
			}
		}
		
		System.out.println(output);
	}

}
