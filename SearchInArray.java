package classexample;

import java.util.Scanner;

public class SearchInArray {
	public static void main(String [] args) {
		int num,search,p;
	    @SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the size of array: ");
	    num=sc.nextInt();
	    int num1[]=new int[num];
	    System.out.println("Enter "+num+" numbers: ");
	    for(int i=0;i<num;i++) {
	    	num1[i]=sc.nextInt();
	    }
	    System.out.println("Enter the number to search in array: ");
	    search=sc.nextInt();
	    p=searchNum(num1,search);
	    if(p!=-1) {
	    	System.out.println("Number '"+search+"' is in the position "+(p+1));
	    }else {
	    	System.out.println("Number '"+search+"' is not in the array");
	    }
	    Class<? extends int[]> c=num1.getClass();
	    String name=c.getName();
	    System.out.println("proxy class name is :"+name);
	}
	
	public static int searchNum(int num1[],int search) {
		int p=-1;
		for(int i=0;i<num1.length;i++) {
			if(num1[i]==search) {
				p=i;
				break;
			}
		}
		return p;
	}
}
