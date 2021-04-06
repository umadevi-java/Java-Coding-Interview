package syntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeListF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = List.of(1,2,4);
		List<Integer> l2 = List.of(6,7,8);
		List<Integer> l3 = new LinkedList<>(l1);
		l3.addAll(l2);
		
		System.out.println(l3);
		
		
		
	}

}
