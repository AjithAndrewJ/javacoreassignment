package basicprogram;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[]args) {
		int a,c=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			c+=i;
		}
		System.out.println("The sum of number : "+ c);
		
		sc.close();
	}
}
