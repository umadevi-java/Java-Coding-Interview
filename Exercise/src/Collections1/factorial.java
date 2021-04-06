package Collections1;


public class factorial {

	public static void main(String[] args) {
		
		int n = 4;
		int answer = calcFibonacc(n);
		System.out.println("With Recursive "+answer);
		
		System.out.println("No recursive "+noRecursive(n));
	}

	private static int calcFibonacc(int n) {
		if( n == 1)
			return 1;
		else 
			return n * calcFibonacc(n-1);
	}
	
	
	private static int noRecursive(int n) {
		int answer = 1;
			for (int i=1; i<=n; i++) {
				answer *= n;
			System.out.println(answer);
			}
			return answer;
		
	} 
	
	

}
