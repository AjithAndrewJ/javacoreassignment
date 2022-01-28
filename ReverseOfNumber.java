package basicprogram;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[]args) {
		long num,reverse=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextLong();
		sc.close();
		System.out.println("Given number : " + num);
		while(num != 0) {
			n=num % 10;
			reverse=reverse * 10 + n;
			num/=10;
		}
		System.out.println("Reversed number : " + reverse);
	}
}
