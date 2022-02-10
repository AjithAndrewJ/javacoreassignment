package banking;

import java.util.Scanner;

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
