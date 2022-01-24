package basicprogram;

import java.util.Scanner;

class Human{
	public float height;
	public float weight;
	public void setHeightAndWeight(float h,float w) {
		height=h;
		weight=w;
	}
	public void display() {
		System.out.println("Height = " + height + "\n" + "Weight = " + weight);
	}
}

public class ClassDemo {
	public static void main (String[] args) {
		float H ,W;
		Human ajith = new Human();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height : ");
		H=scan.nextFloat();
		System.out.println("Enter weight : ");
		W=scan.nextFloat();
		ajith.setHeightAndWeight(H,W);
		//ajith.height=5.5f;
		//ajith.weight=70.9f;
		//ajith.setHeightAndWeight(6.6f, 77.7f);
		ajith.display();
	}
	

}
