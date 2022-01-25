package basicprogram;

public class CheckVowel {
	public static void main (String[] args) {
		char ch='y';
		if(ch=='a' || ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' ||ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U') {
			System.out.println(ch + " is vowel");
		}else
			System.out.println(ch + " is consonant");
	}
}
