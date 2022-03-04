package classexample;
import java.util.ArrayList;
import java.util.Scanner;

class BankDetails {
	private int ch;
	private String accno;
	private String name;
	private long balance;
	Scanner in=new Scanner(System.in);
	public void createAccount() {
		System.out.println("Enter Account No : ");
		accno=in.next();
		in.nextLine();
		System.out.println("Enter Name : ");
		name=in.nextLine();
		System.out.println("Enter Account Balance : ");
		balance=in.nextLong();
	}
	public void displayInfo() {
		System.out.println("Account no : "+ this.accno);
		System.out.println("Name of account holder : "+ this.name);
		System.out.println("balance : "+ this.balance);
	}
	public void deposit() {
		System.out.println("Enter the amount to deposit : ");
		long amount=in.nextLong();
		balance=balance+amount;
	}
	public void withdrawal() {
		System.out.println("Enter the amount to withdraw : ");
		long amount=in.nextLong();
		if(balance>=amount) {
			balance=balance-amount;
		}else {
			System.out.println("'Insufficient balance' Your balance is less than " +amount +"\nTransaction failed");
		}
	}
	public boolean search(String sh) {
		if(accno.equals(sh)) {
			System.out.println("---------------------Transaction------------------------");
			displayInfo();
			do{
				System.out.println("--------------------------------------------------------");
				System.out.println("1.Withdrawal \n2.Deposit \n3.Display account \n4.Mani menu");
				System.out.println("Enter your choise : ");
				ch=in.nextInt();
			    switch(ch) {
			    case 1:
			    	withdrawal();
			    	break;
			    case 2:
			    	deposit();
			    	break;
			    case 3:
			    	System.out.println("--------------------------------------------------------");
			    	displayInfo();
			    	break;
			    case 4:
			    	break;
			    default:
					System.out.println("\nEnthe the Correct choice!\n");
			    }
			}while(ch!=4);
			return(true);
		}
		return(false);
	}
}
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
