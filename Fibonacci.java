public class Fibonacci {

	public  int fibonacci(int n, String type )
	{ //iterative
		if (type.equals("iterative")) 
		{
			int[] f = new int[n+1];
			//start sequence with 0 and 1
			f[0] = 0; 
			f[1] = 1;
			
			for(int i = 2; i <= n; i++) 
			{
				f[i] = f[i-1] + f[i-2]; //add two previous numbers
			}
			return f[n];
		
		}
		else if (type.equals("recursive")) 
		{
			int finalvalue = 0;
			finalvalue = fibonacciRecursive(n);
			return finalvalue;
		}
		return 0;
	}

	public int fibonacciRecursive(int n)
	{ //recursive
		if (n <= 1) { //base case
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);			
	}

}
