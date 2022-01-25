package basicprogram;

import java.util.Scanner;

public class OddEven {
	public static void main (String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number=scan.nextInt();
		if(number%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("the number is odd");
		}
		scan.close();
	}
}
