package basicprogram;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[]args) {
		long num1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range of number : ");
		num1=in.nextLong();
		in.close();
		System.out.println("The Armstrong numbers are : ");
		for(long i=1;i<=num1;i++) {
			long sum,p;
			p=count(i);
			sum=arm(i,p);
			if(i==sum) {
				System.out.print(sum +" ");
			}
		}
	}
	public static long arm(long i,long p) {
		long n = i,sum=0,rem,n1=p;
		 while(n != 0) {
	            rem = n % 10;
	            sum = (long) (sum +Math.pow(rem, n1));
	            n/=10;
	         }
		return sum ;
	}
	public static long count(long i) {
		long n=i,p=0;
		while(n!=0) {
			n/=10;
			p++;
		}
		return p;
	}
}
