package dhana.java.First;

import java.util.Scanner;

public class OperationArthimetic {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tell us amount:");
		
		int amt=scan.nextInt();
		
		System.out.println("Amount Status: "+(amt%2000==0));
		
		int hai=255;
		
		String rev="";
		
		rev=rev+(hai%10);//remainder
		
		System.out.println(rev);
		
		hai=hai/10;//quot
		
		System.out.println(hai);
		
		rev=rev+(hai%10);//remainder
		
		System.out.println(rev);
		
		hai=hai/10;//quot
		
		System.out.println(hai);
		
		rev=rev+(hai%10);// remaainder
		
		System.out.println(rev);
		
		// Swapping numver
		
		Double ex1, ex2;
		
		ex1=scan.nextDouble();
		
		ex2=scan.nextDouble();
		
		System.out.println("first exp "+ ex1+ "second exp "+ex2);
		
		ex1=ex1*ex2;
		
		ex2=ex1/ex2;
		
		ex1=ex1/ex2;
		
		System.out.println("first exp "+ ex1+ "second exp "+ex2);
		
		
		
		
		
		
	}

}
