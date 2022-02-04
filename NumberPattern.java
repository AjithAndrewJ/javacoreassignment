package basicprogram;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		int row;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		row=in.nextInt();
		in.close();
		
		System.out.println();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
