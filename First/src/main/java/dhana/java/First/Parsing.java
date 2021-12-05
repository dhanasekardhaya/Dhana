package dhana.java.First;

public class Parsing {
	
	// parsing: string to other format
	
	//WraperClass.parseType(Sting)
	
	public static void main(String[] args) {
		
		String hello="986";
		
		int hey=Integer.parseInt(hello);
		
		System.out.println(hey+4);
		
		hello="34.8";
		
		double earn=Double.parseDouble(hello);
		
		System.out.println(earn/2);
		
		hello="true";
		
		boolean bb=Boolean.parseBoolean(hello);
		
		System.out.println(bb);
		
		
	}

}
