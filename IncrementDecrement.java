package basicprogram;

public class IncrementDecrement {
public static void main (String[] args) {
	System.out.println("pre-increment");
	int x=10;
	int y=++x;
	System.out.println(x);
	System.out.println(y);
	System.out.println("");
	System.out.println("pre-decrement");
	int a=10;
	int b=--a;
	System.out.println(a);
	System.out.println(b);
	System.out.println("");
	System.out.println("post-increment");
	int c=10;
	int d=c++;
	System.out.println(c);
	System.out.println(d);
	System.out.println("post-decrement");
	int t=10;
	int q=t--;
	System.out.println(t);
	System.out.println(q);
	}
}
