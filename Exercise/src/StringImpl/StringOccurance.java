package StringImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringOccurance {

	public static void main(String[] args) {
		String input = "This is beauty .This is fine";

		Character testChar = 'e';

		System.out.println("First occurance of character " + input.indexOf('e'));

		System.out.println("First occurance of word " + input.indexOf("man"));

		int firstOccurIndex = firstOccurance(input, testChar);
		System.out.println(" <The first occurance is at " + firstOccurIndex);

		printCharCount(input);
		String dotRemoved = input.replace(".", "");
		
		String[] words = dotRemoved.split(" ");
		
		printWordCount(words);

	}

	private static void printWordCount(String[] words) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {

			Integer number = map.get(word);
			if (number != null) {
				map.put(word, ++number);
			} else {
				map.put(word, 1);
			}
		}

		System.out.println("Words and their count" + map);
		// to remove the key of null
		map.remove("");
		
		System.out.println("Words and their count without null" + map);
	}

	private static void printCharCount(String input) {
		String lowerCaseInput = input.toLowerCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < lowerCaseInput.length(); i++) {
			Integer number = map.get(lowerCaseInput.charAt(i));
			if (number != null) {
				map.put(lowerCaseInput.charAt(i), ++number);
			} else {
				map.put(lowerCaseInput.charAt(i), 1);
			}
		}
		
		System.out.println("hmmm "+map);
		
	
	}

	private static int firstOccurance(String input, Character e) {
		for (int i = 0; i < input.length(); i++) {
			if (e == input.charAt(i)) {
				return i;
			}
		}
		return -1;

	}

}
