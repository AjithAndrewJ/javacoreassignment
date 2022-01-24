package basicprogram;

import java.util.Scanner;

class Std{
	public float stdId;
	public String stdName=null;
	public float totalMark;
	public void stdInfo(float a,String b,float c) {
		stdId=a;
		stdName=b;
		totalMark=c;
	}
	public void display() {
		System.out.println("Id = " + stdId + "\n" + "Name = " + stdName + "\n" + "Total marks = " + totalMark);
	}
}

public class StdDetails {
	public static void main (String[] args) {
		float A,C;
		String B=null;
		Std ajith = new Std();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		A=scan.nextFloat();
		scan.nextLine();
		System.out.println("Enter Name : ");
		B=scan.nextLine();
		System.out.println("Enter Total marks : ");
		C=scan.nextFloat();
		ajith.stdInfo(A,B,C);
		ajith.display();
		scan.close();
	}
	

}
