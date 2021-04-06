package Algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] input= {1,4,7,5,1,8,2,3};
		
		
		mergeSort(input);
	}

	private static int[] merge(int[] left, int[] right) {
		System.out.println("left "+Arrays.toString(left));
		System.out.println("right "+Arrays.toString(right));
		int i= 0, j=0,k=0;
		int[] result = new int[left.length +right.length];
		while(i < left.length && j <right.length) {
			if(left[i] < right[j]) {
				result[k] = left[i];
				i++;
				k++;
			}else {
				result[k] = right[j];
				j++;
				k++;
			}
		
		}
		while(i < left.length ) {
			result[k] = left[i];
			i++;
			k++;
		}
		while(j < right.length ) {
			result[k] = right[j];
			j++;
			k++;
		}

		System.out.println("Merged "+Arrays.toString(result));
		return result;
		
	}

	private static int[] mergeSort(int[] input) {
		if(input.length == 1) {
			return input;
		}
		int middle = input.length/2;
		int[] left = Arrays.copyOfRange(input, 0,middle);
		int[] right = Arrays.copyOfRange(input, middle, input.length);
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		return merge(
				mergeSort(left),
				mergeSort(right)
				);
	}

}
