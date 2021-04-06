package Collections1;

import java.util.LinkedList;

public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1);
		ll1.add(3);
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll1.descendingIterator().forEachRemaining(ll2::add);
		System.out.println(ll2);
	}

}
