package StringImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class StringExercise {
	public static void main(String[] args) {
		// remove duplicate word, character

		String input = "This is nice. This is good";
		String dotRemoved = input.replace(".","");
				
		String[] words = dotRemoved.split(" ");
		// removeDuplicates(words);
		
		printWordCount(words);
		Character[] letters = { 'a', 'b', 'e', 'a', 'c' };
		//removeDuplicates(letters);
		Integer[] numbers = { 2, 5, 4, 2, 5, 2 };
		// removeDuplicates(numbers);

	}

	private static void printWordCount(String[] words) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(String word : words) {
			Integer num = map.get(word);
			if(map.get(word) != null) {
				
				map.put(word, ++num );
			}
			else {
				map.put(word, 1 );
			}
		}
		
		System.out.println(map);
	}

	private static <T> void removeDuplicates(T[] input) {
		// TODO Auto-generated method stub
		HashMap<T, Boolean> map = new HashMap<T, Boolean>();

		for (T element : input) {
			if (map.get(element) == null) {
				map.put(element, true);
			}

		}

		System.out.println("map has unique " + map.keySet());
		Set<T> result = map.keySet();
		System.out.println(result);
		// String[] resultArr = (String[]) result.toArray();

	}

}
