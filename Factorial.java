public class Factorial {

	public int factorial(int n, String type){ //iterative
	if (type.equals("iterative")) 
	{
		int num = 1;
		
		for(int i = 1; i <= n; i++) 
		{
			num *= i;
		}
		return num;
	}
	else if (type.equals("recursive")) 
	{
		int finalvalue = 0;
		finalvalue = factorialRecursive(n);
		return finalvalue;
	}
return 0;
}
	
	public int factorialRecursive(int n)
	{ //recursive
		if (n == 0) //base case
		{
			return 1;
		}
		return n * factorialRecursive(n-1);			
	}

}