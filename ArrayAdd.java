package classexample;

import java.util.Scanner;

public class ArrayAdd {
	public static void main(String[] args) {
		int r,c,a[][],b[][],res[][];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the row size: ");
	    r=sc.nextInt();
	    System.out.println("Enter the column size: ");
	    c=sc.nextInt();
	    a=new int[r][c];
	    b=new int[r][c];
	    res=new int[r][c];
	    System.out.println("Enter the value for matrix 1: ");
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		a[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("Enter the value for matrix 2: ");
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		b[i][j]=sc.nextInt();
	    	}
	    }
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		res[i][j]=a[i][j]+b[i][j];
	    	}
	    }
	    System.out.println("Result");
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		System.out.print(res[i][j]);
	    	}
	    	System.out.println();
	    }
	    sc.close();
	}
}
