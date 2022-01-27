package basicprogram;

import java.util.Scanner;

public class SumFirstAndLast {
	public static void main(String[]args) {
		long ldig,num;
		Scanner scann = new Scanner (System.in);
		System.out.println("Enter the number : ");
		num=scann.nextLong();
		scann.close();
		ldig=num%10;
		while(num>=10) {
			num=num/10;
		}
		System.out.println("Sum of first and last digit : " + (num+ldig));
	}
}
