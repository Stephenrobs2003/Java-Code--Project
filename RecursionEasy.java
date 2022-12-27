
public class RecursionEasy {
	private static long[]fibonacciache;

	public static void main(String[] args) {
		//sayhi(5);
		int n =50;
		fibonacciache = new long[n+1];
		System.out.println(fibonacci(n));
		
	}
	public static long fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		if(fibonacciache[n]!=0) {
			return fibonacciache[n];
		}
		long nfibonaccinumber = fibonacci(n-1)+ fibonacci(n-2);
		return fibonacciache[n]= nfibonaccinumber;
		
		/*if(n==0) {
			System.out.println("Done");
		}
		else {
			System.out.println("hi");
			n--;
			sayhi(n);
		}*/
		
	}

}
