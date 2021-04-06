package syntax;

import java.util.Arrays;

public class ShiftArray {
	public static void main(String args[]) {
		int[] input = {2,3,4, 1,5,7,9};
		int shiftRightBy = 3;
		int arr1 = input.length - shiftRightBy;
		int[] left = Arrays.copyOfRange(input, 0, shiftRightBy);
		
		int[] right = Arrays.copyOfRange(input, shiftRightBy, input.length);
		
		int[] result =new int [input.length];
		System.arraycopy(right, 0, result, 0, right.length);
		System.arraycopy(left, 0, result, right.length, left.length);
		
		//Another method
		//from input directly , we need not split
		int[] output =new int [input.length];
		System.arraycopy(input, shiftRightBy, output, 0, arr1);
		System.arraycopy(input, 0, output, arr1, shiftRightBy);
		
		for (int element:result) {
			System.out.print(element +" ");
		}
		System.out.println("");
		for (int element:output) {
			System.out.print(element +" ");
		}
		
	}

}
