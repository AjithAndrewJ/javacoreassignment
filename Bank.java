package classexample;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		int ch,n;
		String sh;
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------Bank detail----------------------");
		System.out.println("Enter the no. of accounts: ");
		n=sc.nextInt();
		BankDetails bd[]=new BankDetails[n];
		for(int i=0;i<bd.length;i++) {
			System.out.println("Enter account "+(i+1)+" detail");
			bd[i]=new BankDetails();
			bd[i].accountInfo();
			System.out.println("-----------------Acount detaile created-----------------");
		}
		do{
			System.out.println("---------------Banking Transaction System---------------");
			System.out.println("1.Display all account \n2.Search account \n3.Exit");
			System.out.println("Enter your choise : ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("-----------------------User Info------------------------");
				for(int i=0;i<bd.length;i++) {
					System.out.println("--------------------------------------------------------");
					bd[i].displayInfo();
					System.out.println("--------------------------------------------------------");
				}
			    break;
			case 2:
				boolean f=false;
				System.out.println("Enter the account number to search: ");
				sh=sc.next();
				for(int i=0;i<bd.length;i++) {
					f=bd[i].search(sh);
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
				System.out.println("\nEnthe the Correct choice!\n");
			}
		}while(ch!=3);
		sc.close();
	}
}
