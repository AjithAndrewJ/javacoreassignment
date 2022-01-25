package basicprogram;

import java.util.Scanner;

public class OnlineBanking {
	public static void main (String[] args) {
		int accNumber,withdraw;
		Bank sbi = new Bank();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account number : ");
		accNumber=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Withdrawal amount : ");
		withdraw=scan.nextInt();
		sbi.setaccNumer(accNumber);
		sbi.setwithdraw(withdraw);
		sbi.withdrawAmount();
		scan.close();
	}
}
//Creat this
class Bank{
	private int accBalance=10000;
	private int accNumber;
	private int withdraw;
	public int getaccNum() {
		return accNumber;
	}
	public void setaccNumer(int accNumber) {
		this.accNumber=accNumber;
	}
	public int getwithdraw() {
		return withdraw;
	}
	public void setwithdraw(int withdraw) {
		this.withdraw=withdraw;
	}
	public void withdrawAmount() {
		if(withdraw<=accBalance) {
			accBalance-=withdraw;
			System.out.println("The Account number is : "+ accNumber);
			System.out.println("The withdrawal amount is : "+ withdraw);
			System.out.println("The account balance is : "+ accBalance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
}
