package basicprogram;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		long num1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range of number : ");
		num1=in.nextLong();
		in.close();
		System.out.println("The Strong numbers are : ");
		for(int i=1;i<=num1;i++) {
			long sum;
			sum=strong(i);
			if(i==sum)
				System.out.print(sum +" ");
		}
	}
	public static long strong(long i) {
		long n = i,sum=0,rem,fact;
		while(n != 0) {
			 rem = n % 10;
	         fact=factor(rem);
	         sum +=fact;
	         n/=10;
		}
		return sum ;
	}
	public static long factor(long j) {
		long n=j,fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}

}
