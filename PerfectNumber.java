package basicprogram;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[]args) {
		int num,i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range of number : ");
		num=in.nextInt();
		in.close();
		System.out.print("The perfect numbers are : ");
		for(i=1;i<=num;i++) {
			int sum=cal(i);
			if(i==sum)
			    System.out.print(i + " ");
		}
	}
	public static int cal(int i) {
		int sum=0;
		for(int j=1;j<=i/2;j++) {
			if(i%j==0)
				sum+=j;
		}
		return sum;
	}
}
