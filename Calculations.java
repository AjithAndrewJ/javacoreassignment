package banking;

import java.util.Scanner;

public class Calculations {
	
	private static int f,s,op;
	static Scanner in=new Scanner(System.in);
	
	public static void calInfo() {
		System.out.println("Enter the first number : ");
		f=in.nextInt();
		System.out.println("Enter the second number : ");
		s=in.nextInt();
	}
	public static void add() {
		int sum=0,f;
		System.out.println("Enter the number operands : ");
		op=in.nextInt();
		for(int i=1;i<=op;i++) {
			System.out.println("Enter the number "+i+ " :");
		    f=in.nextInt();
			sum=sum+f;
		}
		System.out.println("Addition of number's is : "+ sum);
		System.out.println();
	}
	public static void sub( ) {
		int sum=f-s;
		System.out.println("Subtraction of "+f+" and "+s+" is : "+ Math.abs(sum));
		System.out.println();
	}
	public static void mul() {
		int sum=1,f;
		System.out.println("Enter the number operands : ");
		op=in.nextInt();
		for(int i=1;i<=op;i++) {
			System.out.println("Enter the number "+i+ " :");
		    f=in.nextInt();
			sum=sum*f;
		}
		System.out.println("Multiplication of number's is : "+ sum);
		System.out.println();
	}
	public static void div() {
		int sum=f/s;
		System.out.println("Divition of "+f+" and "+s+" is : "+ sum);
		System.out.println();
	}
}
