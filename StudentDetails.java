package classexample;

import java.util.Scanner;

public class StudentDetails {
	private int total;
	private int mark[]=new int[6];
	private String name,id;
	private String sub[]={"Tamil","English","physics","chemistry","maths","computer"};
	Scanner sc=new Scanner(System.in);
	
	public void stdInfo() {
		System.out.println("Enter the Id: ");
		id=sc.next();
		sc.nextLine();
		System.out.println("Enter the student name: ");
		name=sc.nextLine();
		System.out.println("Enter the 6 subjects marks");
		for(int i=0;i<6;i++) {
			System.out.print(sub[i]+": ");
			mark[i]=sc.nextInt();
			total=total+mark[i];
		}
	}
	public  void display(int k) {
		System.out.println("Student "+k+" detail");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		for(int j=0;j<6;j++) {
			System.out.println(sub[j]+": "+mark[j]);
		}
		System.out.println("Total: "+total+"/600");
	}
	
	public boolean search(int k,String sh) {
		if(id.equals(sh)) {
			display(k);
			return(true);
		}
		return(false);
	}
}