package classexample;

import java.util.Scanner;

class StudentDetails {
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
public class Students {
	public static void main(String[] args) {
		int n,num;
		String sh;
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------Student detail---------------");
		System.out.println("Enter the no. of students: ");
		n=sc.nextInt();
		StudentDetails sd[]=new StudentDetails[n];
		for(int i=0;i<sd.length;i++) {
			System.out.println("Enter student "+(i+1)+" detail");
			sd[i]=new StudentDetails();
			sd[i].stdInfo();
			System.out.println("-------------Student detaile created-------------");
		}
		do {
			System.out.println("==================================================");
			System.out.println("1.Display all student details \n2.Enter student Id to search \n3.Exit");
			System.out.println("==================================================");
			System.out.println("Enter your choice");
			num=sc.nextInt();
			switch(num) {
			case 1:
				for(int i=0;i<sd.length;i++) {
					System.out.println("____________________________________________________");
					sd[i].display(i+1);
					System.out.println("____________________________________________________");
				}
				break;
			case 2:
				boolean f=false;
				System.out.println("Enter the Id to search: ");
				sh=sc.next();
				for(int i=0;i<sd.length;i++) {
					f=sd[i].search(i+1, sh);
				}
				if(f) {
					break;
				}else {
					System.out.println("Enter the correct student Id!");
				}
				break;
			case 3:
				System.out.println("-------------------------Thank you----------------------------");
				//ChooseStudentsAndBank.main(null);
				break;
			default:
				System.out.println("Enter the correct choice!");
			}
		}while(num!=3);
		sc.close();
	}
}
