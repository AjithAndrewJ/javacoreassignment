package basicprogram;
import java.util.Scanner;
public class AdditionDivide {
		public static void main (String[] args) {
			System.out.println("Addition of 3 numbers and divide by 3");
			Scanner scann = new Scanner(System.in);
			int n1,n2,n3,res;
			System.out.println("Enter the 1st number :");
			n1=scann.nextInt();
			System.out.println("Enter the 2nd number :");
			n2=scann.nextInt();
			System.out.println("Enter the 3rd number :");
			n3=scann.nextInt();
			res=(n1+n2+n3)/3;
			System.out.println("Addition of 3 numbers and divide by 3 is : " + res);
			scann.close();
		}
}
