package basicprogram;

import java.util.Scanner;

public class CountNumOfDigits {
	public static void main(String[]args) {
		long number;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		number=sc.nextLong();
		sc.close();
		while(number != 0) {
			number/=10;
			count++;
		}
		System.out.println("No. of digits in the number is : " + count);
	}
}
