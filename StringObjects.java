package classexample;

public class StringObjects {
	public static void main(String[] args) {
		String s1="Ajith Andrew J";
		String s2="Ajith Andrew J";
		String s3=new String("Ajith Andrew J");
		String s4=new String("ajith Andrew J");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3==s4);
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s4.charAt(0));
	}
}
