package syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayInt {

	public static void main(String[] args) {
		Integer[] numbers = {2,12,3,1,1,2,5};
		ArrayList<Integer> arrList = new  ArrayList<Integer>(
									Arrays.asList(numbers));
		
		System.out.println(arrList);
		//Method 2
		ArrayList<Integer> arrList2 = new  ArrayList<Integer>();
		Collections.addAll(arrList2,numbers);
		//Collections.sort(arrList2);
		System.out.println(arrList2);
		
		HashSet<Integer> uniqueSet = new HashSet<>();
		Collections.addAll(uniqueSet, numbers);
		
		System.out.println(uniqueSet);
		
		TreeSet<Integer> clearSet = new TreeSet<>();
		Collections.addAll(clearSet, numbers);
		System.out.println(clearSet);
			

	}

}
