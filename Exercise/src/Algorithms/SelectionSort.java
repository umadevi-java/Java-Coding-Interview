import java.util.Arrays;


/* compare the first element (as minimum) with each and every other element , if there is a minimum number then swap
 * take the next element and compare with all the elements in the forward direction
 * 
 */
public class SelectionSort {
	public static void main(String[] args) {
		 int[] arr = {9,3,5,2,1,7};
		 sort(arr);
	}

	public static void sort(int[] arr)
    {
		int n = arr.length;
       for (int i=0; i < n; i++) {
    	   int min = arr[i]; 
    	   
    	   int min_index = i;
    	   for(int j = i+1; j<n; j++) {
    		   
    		   if(arr[min_index] > arr[j]) {
    			
    			   min_index =j;
    		   }
    		
    	   }
    	   //Swap the elements
    	   int temp = arr[i];
    	   arr[i] = arr[min_index];
    	   arr[min_index] = temp;
    	   System.out.println(i +"Iteration "+Arrays.toString(arr));
       }
        
        System.out.println(Arrays.toString(arr));
    }
  
}
