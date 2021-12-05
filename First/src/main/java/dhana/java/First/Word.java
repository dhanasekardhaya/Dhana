package dhana.java.First;

public class Word {

	public static void main(String[] args)
	{
		Word wor = new Word();
		
		System.out.println(wor.add(4, 50));
		
		//System.out.println(wor.sub(10, 5));
	}
	
	int add(int a, int b)
	{
		int c = a+b;
		
		return c;
		
	}
	
	int sub(int a, int b)
	
	{
		int c=a-b;
		return c;
	}
	

	}
