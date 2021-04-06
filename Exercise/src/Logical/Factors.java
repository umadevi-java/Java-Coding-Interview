

package Logical;

import java.util.ArrayList;

public class Factors {

	public static void main(String[] args) {
		int n=24;
		
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i=1 ; i<=24; i++) {
			if(n%i == 0) {
				factors.add(i);
			}
		}

		System.out.print(factors);
	}

}
