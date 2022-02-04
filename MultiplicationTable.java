package basicprogram;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[]args) {
		int num,ans,lim;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table : ");
		num=sc.nextInt();
		System.out.println("Enter the limit : ");
		lim=sc.nextInt();
		sc.close();
		System.out.println(num + " Tables");
		for(int i=1;i<=lim;i++) {
			ans=i*num;
			System.out.println(num+" x "+i+" = "+ans);
		}
	}
}
