package classexample;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int ch,n=-1;
		String sh;
		Scanner sc=new Scanner(System.in);
		BankDetails bd[]=new BankDetails[100];
		ArrayList<BankDetails> al=new ArrayList<BankDetails>();
		do{
			System.out.println("---------------------Banking System---------------------");
			System.out.println("1.Create account \n2.Display all account \n3.Search account \n4.Exit");
			System.out.println("Enter your choise : ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("----------------------Bank detail----------------------");
				n++;
				System.out.println("Enter account detail");
				bd[n]=new BankDetails();
				bd[n].createAccount();
				al.add(bd[n]);
				System.out.println("-----------------Acount detaile created-----------------");
				break;
			case 2:
				System.out.println("-----------------------User Info------------------------");
				for(BankDetails b:al) {
					b.displayInfo();
					System.out.println("--------------------------------------------------------");
				}
			    break;
			case 3:
				boolean f=false;
				System.out.println("Enter the account number to search: ");
				sh=sc.next();
				for(BankDetails b:al) {
					f=b.search(sh);
				}
				if(f) {
					break;
				}else {
					System.out.println("Account number not found!");
				}
			    break;
			case 4:
				//ChooseStudentsAndBank.main(null);
				System.out.println("-----------------------Thank you-------------------------");
				break;
			default:
				System.out.println("\nEnthe the Correct choice!\n");
			}
		}while(ch!=4);
		sc.close();
	}
}
