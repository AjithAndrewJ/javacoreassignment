package classexample;

import java.util.StringTokenizer;

public class ExOfTokenizer {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Ajith Andrew J");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(" "));
		}
	}
}
