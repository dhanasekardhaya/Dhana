package dhana.java.First;

import java.util.Scanner;

// short hand = += -= *= /= %=

// alpha=alpha+10;

// alpha+10;

// * Operation left var and assigning var should be same;

// dont given value this variable cos=100-cos;

public class OperShortHand {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double d = sc.nextDouble();
		
		System.out.println(d);
		
		char m=sc.next().charAt(0);
		
		char s=sc.next().charAt(0);
		
		m+=s;
		
		s=(char)(m-s);
		m-=s;
		
		System.out.println(" value is "+ m +" casting "+ s);
		
		//int f=(char)m;
		
		System.out.println("value is "+(int)m);
		
	}
	
	
	
	
	

}
