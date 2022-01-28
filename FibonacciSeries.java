package basicprogram;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[]args) {
		int num,n3,n1=-1,n2=1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		sc.close();
		for(int i=0;i<num;i++) {
			n3=n1+n2;
			System.out.print(n3 + " ");
			n1=n2;
			n2=n3;
		}
	}
}