package classexample;

import java.util.Scanner;

public class BankDetails {
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
