package syntax;

import java.util.Arrays;

public class CompareArr {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4}; 
		int[] arr2 = {1, 2, 3, 4};
		boolean itIs = Arrays.equals(arr1, arr2);
		System.out.println("Array objects are "+itIs);

	}

}
