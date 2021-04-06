package Logical;

import java.util.List;

public class onlyOdd {

	public static void main(String[] args) {
		int[] input = {1,3,5};
		
		//extracted(input);
		
		List<Integer> list = List.of(1,3,5);
		chkOdd(list);
	}

	private static boolean chkOdd(List<Integer> list) {
		for(Integer el : list) {
			if(el%2 == 0) {
				System.out.println(el +" Contains NOT only odd numbers");
				return false;
			}
		}
		System.out.println("Contains ONLY odd numbers");
		return true;
		
	}

	private static boolean extracted(int[] input) {
		
		for(int el : input) {
			if(el%2 == 0) {
				
				System.out.println("Contains NOT only odd numbers");
				
				return false;
			}
		}
		System.out.println("Contains only odd numbers");
		return true;
	}

}
