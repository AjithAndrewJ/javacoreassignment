package classexample;

import java.util.Scanner;

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
				ChooseStudentsAndBank.main(null);
				break;
			default:
				System.out.println("Enter the correct choice!");
			}
		}while(num!=3);
		sc.close();
	}
}
