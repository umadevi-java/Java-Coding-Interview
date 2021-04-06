package syntax;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer>numbers = List.of(2,3,4,5);
		
		List<String> words = List.of("this","is", "a", "world","is","that");
		
		List<Integer> l1 = new ArrayList<>(numbers);
		//removeDuplicates(l1);
		removeDuplicates(words);
		chkDuplicates(l1);
	}

	private static <T> void chkDuplicates(List<T> l1) {
		List<T> l2 = new ArrayList<>();
		for(T el: l1) {
			if(!l2.contains(el)) {
				l2.add(el);
				
			}
		}
		if(l1.size() == l2.size()) {
			System.out.println("Has NO Duplicates");
		}
		else {
			System.out.println("Has Duplicates");
		}
	}
	
	

	private static <T> void removeDuplicates(List<T> l1) {
		List<T> l2 = new ArrayList<>();
		for(T el : l1) {
			if(! l2.contains(el) ) {
				l2.add(el);
			}
		}
		System.out.println(l2);
		
	}

}
