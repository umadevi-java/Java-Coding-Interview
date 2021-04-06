package Collections1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class removeArrayList {

	public static void main(String[] args) {
		String[] words = {"cat","dog","cat","myna"};
		ArrayList<String> arrList = new ArrayList<String>();
		
		for(String word: words) {
			if(!word.equals("cat")) {
				arrList.add(word);
			}
		}
		
		//Removing particular 
		System.out.println(arrList);
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext()) {
			if(itr.next().toString().startsWith("d")) {
				arrList.remove("dog");
			}
		}
		
		System.out.println(arrList);
	}
}


//Scanner input = new Scanner();
//int number = input.next();