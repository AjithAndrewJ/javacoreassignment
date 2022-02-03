package basicprogram;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		int row;
		char ch;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		row=in.nextInt();
		System.out.println("Enter the character : ");
		ch=in.next().charAt(0);
		in.close();
		
		System.out.println();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		 for(int i=row-1; i>=1; i--) { 
	         for(int j=1; j<=i; j++){
	             System.out.print(ch);
	         }
	         System.out.println();
         }
		 
		 System.out.println();
		 
		 for(int i=1; i<=row; i++) {
			 for(int j=row; j>i; j--){
	             System.out.print(" ");
	         }
	         for(int k=1; k<=(i*2)-1; k++){
	             System.out.print(ch);
	         }
	         System.out.println();
	     }
		 
		 System.out.println();
		 
		 for(int i=1; i<=row; i++) {
			 for(int j=row; j>i; j--){
	             System.out.print(" ");
	         }
	         for(int k=1; k<=(i*2)-1; k++){
	             System.out.print(ch);
	         }
	         System.out.println();
	     }
		 for(int i=row-1; i>=1; i--) {
			 for(int j=row-1; j>=i; j--){
	             System.out.print(" ");
	         }
	         for(int k=1; k<=(i*2)-1; k++){
	             System.out.print(ch);
	         }
	         System.out.println();
	     }
	}

}
