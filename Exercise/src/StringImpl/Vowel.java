package StringImpl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vowel {
	public static void main(String[] args) {
		String input = "vrt mfs";
		boolean value = checkVowel(input);
		System.out.println(value);
		
		useStringMethod(input);
	}

	private static void useStringMethod(String input) {
		System.out.println(input);
		//boolean value = input.toLowerCase().matches("(.*)[aeiou](.*)");
		boolean value = input.toLowerCase().matches(".*[aeiou].*");
		

		if(value) {
			System.out.println("Contains vowels");
		}else {
			System.out.println("No vowels");
		}
		
		
	}

	private static boolean checkVowel(String input) {
		Set<Character> list1 = Set.of('a','e','i','o','u');
		Set<Character> vowels = new HashSet<>(list1);
		
		char[] characters = input.toLowerCase().toCharArray();
		for(char c : characters) {
			if(vowels.contains(c)) {
				return true;
			}
		}
		return false;
	
	}

}
