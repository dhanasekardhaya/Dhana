package dhana.java.First;

import java.util.Scanner;

public class MyForm {
	public static void main(String[] args) {
		Scanner sekar=new Scanner(System.in);
		
		String name="", pan="", email="";
		
		long mobileno=0L, adhar=0L;
		
		System.out.println("Tell you name:");
		
		name=sekar.next();
		
		System.out.println("Tell you pan:");
		
		pan=sekar.next();
		
		System.out.println("Tell you email:");
		
		email=sekar.next();
		
		System.out.println("Tell you mobileno:");
		
		mobileno=sekar.nextLong();
		
		System.out.println("Tell you adhar:");
		
		adhar=sekar.nextLong();
		
		
		System.out.println("HI "+name+ "thanks for using our bank updated will inform your mobile"+mobileno+"and email"+email);
		
		sekar.close();		
	}
}
