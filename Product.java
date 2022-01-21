package basicprogram;
import java.util.Scanner;
public class Product {
	public static void main (String[] args) {
		System.out.println("product of 2 numbers");
		Scanner scann = new Scanner(System.in);
		int p1,p2,pro;
		System.out.println("Enter the 1st number :");
		p1=scann.nextInt();
		System.out.println("Enter the 2nd number :");
		p2=scann.nextInt();
		pro=p1*p2;
		System.out.println("product of 2 numbers is :" + pro);
		scann.close();
	}
}
