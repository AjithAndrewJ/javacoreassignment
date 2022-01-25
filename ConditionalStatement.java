package basicprogram;

public class ConditionalStatement {
	public static void main (String[] args) {
		int x=10,y=10;
		if (x==y) {
			System.out.println("Both are equal (=)");
		}else {
			System.out.println("both are not equal (=)");
		}
		System.out.println("");
		int a=30,b=30;
		if (a!=b) {
			System.out.println("Condition true (!=)");
		}else {
			System.out.println("Condition false (!=)");
		}
		System.out.println("");
		int c=20,d=30;
		if (c<d) {
			System.out.println("Condition true (<)");
		}else {
			System.out.println("Condition false (<)");
		}
		System.out.println("");
		int e=20,f=30;
		if (e>f) {
			System.out.println("Condition true (>)");
		}else {
			System.out.println("Condition false (>)");
		}
		System.out.println("");
		int g=10,h=10;
		if (g<=h) {
			System.out.println("Condition true (<=)");
		}else {
			System.out.println("Condition false (<=)");
		}
		System.out.println("");
		int i=30,j=50;
		if (i>=j) {
			System.out.println("Condition true (>=)");
		}else {
			System.out.println("Condition false (>=)");
		}
	}
}
