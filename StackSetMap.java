package classexample;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class StackSetMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		int n=sc.nextInt();
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("Enter the Values: ");
		for(int i=0;i<n;i++) {
			stack.push(sc.nextInt());
		}
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.search(5));
		System.out.println(stack);
		
		HashSet<String> set=new HashSet<String>();
		System.out.println("Enter the Values: ");
		sc.nextLine();
		for(int i=0;i<n;i++) {
			set.add(sc.nextLine());
		}
		System.out.println(set);
		String a[]=new String[set.size()];
		set.toArray(a);
		for(String s:a) {
			System.out.println(s);
		}
		Set<String> set1=new TreeSet<String>(set);
		System.out.println(set1);
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		System.out.println("Enter the Values: ");
		sc.nextLine();
		for(int i=0;i<n;i++) {
			map.put((i+1),sc.nextLine());
		}
		System.out.println(map);
		Set<Entry<Integer, String>> s=map.entrySet();
		Iterator<Entry<Integer, String>> t=s.iterator();
		while(t.hasNext()) {
			Entry<Integer, String>  m=t.next();
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
		sc.close();
	}
}
