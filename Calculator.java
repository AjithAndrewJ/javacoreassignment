package classexample;

import java.util.Scanner;

class Calculations {
	
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
public class Calculator {
	public static void main(String[] args) {
		int i;
		Scanner in=new Scanner(System.in);
		do{
			System.out.println("---Calculator---");
			System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
			System.out.println("Enter your choise : ");
			i=in.nextInt();
			switch(i) {
			case 1:
				Calculations.add();;
			    break;
			case 2:
				Calculations.calInfo();
				Calculations.sub();
			    break;
			case 3:
				Calculations.mul();
			    break;
			case 4:
				Calculations.calInfo();
				Calculations.div();
			    break;
			case 5:
				break;
			default:
				System.out.println();
				System.out.println("!!!! Enthe the Correct choise !!!!");
				System.out.println();
			}
		}while(i!=5);
		System.out.println("---Thank you---");
		in.close();
	}
}
