package classexample;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ArrayAndLinkedListExample {
	public static void main(String[] args) {
		
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter the Values: ");
		sc.nextLine();
		for(int i=0;i<n;i++) {
			list.add(sc.nextLine());
		}
		list.add(2,"30");
		//Collections.sort(list,Collections.reverseOrder());
		Iterator<String> it=list.iterator();
		System.out.println("ArrayList");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("Enter the size of the list: ");
		m=sc.nextInt();
		LinkedList<Integer> link=new LinkedList<Integer>();
		System.out.println("Enter the Values: ");
		for(int i=0;i<m;i++) {
			link.add(sc.nextInt());
		}
		link.addFirst(10);
		link.addLast(50);
		link.add(2,30);
		System.out.println(link);
		System.out.println(link.poll());
		System.out.println(link.pollFirst());
		System.out.println(link.pollLast());
		
		List<Integer> l1=new ArrayList<Integer>(link);
		Iterator<Integer> it2=l1.iterator();
		System.out.println("ArrayList");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//Collections.sort(link,Collections.reverseOrder());
		Iterator<Integer> it1=link.iterator();
		System.out.println("LinkedList");
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		sc.close();
	}
}
