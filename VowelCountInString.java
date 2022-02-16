package classexample;

import java.util.Scanner;

public class VowelCountInString {
	public static void main (String [] args) {
		String name,name1;
		char ch;
		int count=0,count1=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the sentence");
		name=in.nextLine();
		in.close();
		
		String[] st=name.split(" ");
		int st1=st.length;
		System.out.println("Number of words present in the sentence is "+st1+"\n");
		
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			if(ch=='a' || ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' ||ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U') {
				count++;
			}
		}
		System.out.println("The number of vowels in the sentence is "+ count+"\n");
		
		for(int i=0;i<st1;i++) {
			name1=st[i];
			ch=name1.charAt(0);
			if(ch=='a' || ch=='A' ||ch=='e' ||ch=='E' ||ch=='i' ||ch=='I' ||ch=='o' ||ch=='O' ||ch=='u' ||ch=='U') {
				System.out.println("\""+name1+"\" is a vowel word");
				count1++;
			}
		}
		System.out.println("The number of vowel words in the sentence is "+ count1);
	}
}
