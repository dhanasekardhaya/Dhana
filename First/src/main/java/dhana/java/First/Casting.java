package dhana.java.First;

public class Casting {
	
	public static void main(String[] hi)
	{
		int hai=90;
		
		char c='\0';
		
		c=(char)hai;// casting int to char
		
		System.out.println(c);
		
		int fuel=32;
		
		float km=34.5F;
		
		System.out.println((int)km/fuel);
		
		//float value convert to hole number
		
		int f=45;
		
		float ff=45.67F;
		
		System.out.printf("Taken fuel for 1km in ml:%.2f\n", (f/ff));
		
		
		// class name to casting
		
		Character s='A';
		
		Integer d=0;
		
		d=(int)s;
		
		System.out.println(d);
		
		
		
	}

}
