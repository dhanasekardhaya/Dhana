package dhana.java.First;

public class Calculator {
	
	int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	int sub(int a, int b)
	{
		int c = a-b;
		return c;
	}
	
	long mul(long a, long b)
	{
		long c =a*b;
		
		return c;
	}
	
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(4, 50));
		
		//cal.sub(int a, int b);
		
		
	}
}
