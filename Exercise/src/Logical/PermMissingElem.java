package Logical;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] input = {2, 3,5,1};
		System.out.println( findMissingElement(input) );
	}
	 public static  int findMissingElement(int[] A) {
		 if(A == null || A.length == 0) {
			 return 1;
		 }
		 
		 long N = A.length + 1;
		 long total = N * (N + 1) / 2;
		 System.out.println("Total  "+total);
		 
		 long sum = 0L;
		 for(int i = 0; i < A.length; i++) {
			 sum += A[i];
		 }
		 
		 return (int) (total - sum);
	 }

}
