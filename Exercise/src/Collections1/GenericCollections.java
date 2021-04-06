package Collections1;

import java.util.*;

public class GenericCollections {

	// Function to remove duplicates from an ArrayList
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
	{

		// Create a new ArrayList
		ArrayList<T> newList = new ArrayList<T>();

		// Traverse through the first list
		for (T element : list) {

			// If this element is not present in newList
			// then add it
			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

		// return the new list
		return newList;
	}

	// Driver code
	public static void main(String args[])
	{

		Integer[] input = {1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5};
		// Get the ArrayList with duplicate values
		 ArrayList<Integer> list = new ArrayList<Integer>(
				 				Arrays.asList(input)
				 				); 
		 System.out.println("ArrayList with duplicates: "
					+ list);	
		
		/* A simple way of creating ArrayList or HashSet or TreeSet from an array
		   HashSet removes only duplicates
		   Treeset removes duplicates and Sort them
		 */
		 ArrayList<Integer> list2 = new ArrayList<Integer>();
	      Collections.addAll(list2, input);
	      System.out.println("ArrayList created in another way: "
					+ list2);
	     
	     HashSet<Integer> list3 = new HashSet<Integer>();
	     Collections.addAll(list3, input);
	     System.out.println("Duplicates removed using HashSet: "
					+ list3);
	     //HashSet cannot be sorted by Collections.sort(list3);
	     
	     TreeSet<Integer> list4 = new TreeSet<Integer>();
	     Collections.addAll(list4, input);
	     System.out.println("Sorted using TreeSet: "
					+ list4);
	      
	      // Remove duplicates
		ArrayList<Integer>
			newList = removeDuplicates(list2);
		Collections.sort(newList);
		 System.out.println("ArrayList duplicates removed and sorted "
					+ newList);

		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed: "
						+ newList);
	}
}
