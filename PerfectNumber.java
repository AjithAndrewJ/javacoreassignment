package basicprogram;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[]args) {
		long num,i,j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range of number : ");
		num=in.nextLong();
		in.close();
		System.out.print("The perfect numbers are : ");
		for(i=1;i<=num;i++) {
			long sum=0;
			for(j=1;j<i;j++) {
				if(i%j==0)
					sum+=j;
			}
			if(i==sum)
			    System.out.print(i + " ");
		}
	}
}
