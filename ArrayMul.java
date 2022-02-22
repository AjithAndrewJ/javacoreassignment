package classexample;

import java.util.Scanner;

public class ArrayMul {
	public static void main(String[] args) {
		int r,c,a[][],b[][],res[][],sum;
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
	    System.out.println("matrix 1");
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("matrix 2");
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		System.out.print(b[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		sum=0;
	    		for(int k=0;k<r;k++) {
	    			sum+=a[i][k]*b[k][j];
	    		}
	    		res[i][j]=sum;
	    	}
	    }
	    System.out.println("Multiplication result");
	    for(int i=0;i<r;i++) {
	    	for(int j=0;j<c;j++) {
	    		System.out.print(res[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    sc.close();
	}
}
