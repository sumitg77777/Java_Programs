package basicprograms;

import java.util.Scanner;

public class FindbasePower {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int a=sc.nextInt();
		System.out.println("enter the exponent");
		int b=sc.nextInt();
		
		double c=Math.pow(a, b);
		System.out.println(c);
		
	}

}
