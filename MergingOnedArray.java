package classexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MergingOnedArray {
	public static void main(String[] args) {
		int arr[],arr1[],arr2[],n,n1,n2,j=0,k=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array 1: ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter size of array 2: ");
		n1=sc.nextInt();
		arr1=new int[n1];
	    System.out.println("Enter array 1 element: ");
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter array 2 element: ");
	    for(int i=0;i<n1;i++) {
	    	arr1[i]=sc.nextInt();
	    }
	    n2=n+n1;
	    arr2=new int[n2];
	    for(int i=0;i<n;i++) {
	    	arr2[i]=arr[i];
	    	j++;
	    }
	    for(int i=j;i<n2;i++) {
	    	arr2[i]=arr1[k];
	    	k++;
	    }
	    for(int i=0;i<n2;i++) {
	    	System.out.println(arr2[i]+" ");
	    }
	    Integer arr4[]=new Integer[] {1,5,3,6,3,6,2};
	    Arrays.sort(arr4);
	    System.out.println(Arrays.binarySearch(arr4, 5));
	    Arrays.sort(arr4,Collections.reverseOrder());
	    System.out.println(Arrays.toString(arr4));
	    sc.close();
	}
}
