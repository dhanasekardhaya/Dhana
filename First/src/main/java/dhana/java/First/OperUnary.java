package dhana.java.First;

import java.util.Scanner;

// Unary operator: pre : SYM data, post: data SYM


// ++ , --
public class OperUnary {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double d = scan.nextDouble();
		
		char c='D';
		
		System.out.println(d+ " "+c);
		
		d++;
		--c;
		
		System.out.println(d);
		
		System.out.println(c);
		
		int f=(char)c;
		System.out.println(f);
		
		
	}

}
