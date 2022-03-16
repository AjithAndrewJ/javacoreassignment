package classexample;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
class AccountNumberExistException extends Exception{
	public AccountNumberExistException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class AccountNumberIncorrectException extends Exception{
	public AccountNumberIncorrectException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class MinimumWithdrawalException extends Exception{
	public MinimumWithdrawalException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class MinimumDepositException extends Exception{
	public MinimumDepositException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class BankDetails {
	private String accno;
	private String name;
	private long balance;
	Scanner sc=new Scanner(System.in);
	public BankDetails(String accno, String name, long balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public String getAccno() {
		return accno;
	}
	public void displayInfo() {
		System.out.println("Account no : "+ this.accno);
		System.out.println("Name of account holder : "+ this.name);
		System.out.println("balance : "+ this.balance);
	}
	public void deposit() {
		System.out.println("Enter the amount to deposit : ");
		long amount=sc.nextLong();
		try {
			if(amount>=100) {
				balance=balance+amount;
			}else {
				throw new MinimumDepositException("Minimum deposit amount should\nbe 'grater then or equal to Rs.100'");
			}
		}catch(MinimumDepositException e) {
			System.out.println(e.getMessage());
		}
	}
	public void withdrawal() {
		System.out.println("Enter the amount to withdraw : ");
		long amount=sc.nextLong();
		try {
			if(amount<=balance) {
				try {
					if(amount>=500) {
						balance=balance-amount;
					}else {
						throw new MinimumWithdrawalException("Minimum withdrawal amount is Rs.500");
					}
				}catch(MinimumWithdrawalException e) {
					System.out.println(e.getMessage());
				}
			}else {
				throw new InsufficientBalanceException("'Insufficient balance' Your balance is\nless than Rs." +amount +" 'Transaction failed'");
			}
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	public boolean update(String sh) {
		if(accno.equals(sh)) {
			sc.nextLine();
			System.out.println("Enter Name : ");
			name=sc.nextLine();
			System.out.println("Enter Account Balance : ");
			balance=sc.nextLong();
			return true;
		}
		return false;
	}	
	public boolean search(String sh) {
		int ch;
		if(accno.equals(sh)) {
			System.out.println("---------------------Transaction------------------------");
			displayInfo();
			do{
				System.out.println("--------------------------------------------------------");
				System.out.println("1.Withdrawal \n2.Deposit \n3.Display account \n4.Main menu");
				System.out.println("Enter your choice : ");
				ch=sc.nextInt();
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
					System.out.println("Enter the Correct choice!");
			    }
			}while(ch!=4);
			return(true);
		}
		return(false);
	}
}
public class Bank {
	public static void main(String[] args) {
		int ch,size;
		String sh,accno,name;
		long balance;
		Scanner sc=new Scanner(System.in);
		ArrayList<BankDetails> al=new ArrayList<BankDetails>();
		do{
			System.out.println("------------------Banking System Main Menu-----------------");
			System.out.println("1.Create account \n2.Display all account \n3.Search account \n4.Update account \n5.Delete account \n6.Exit");
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("------------------Enter account detail-----------------");
				System.out.println("Enter Account No : ");
				accno=sc.next();
				sc.nextLine();
				System.out.println("Enter Name : ");
				name=sc.nextLine();
				System.out.println("Enter Account Balance : ");
				balance=sc.nextLong();
				//BankDetails bd=new BankDetails(accno,name,balance);
				al.add(new BankDetails(accno,name,balance));
				size=al.size();
				size=size-1;
				for(int i=0;i<al.size()-1;i++) {
					try {
						if(al.get(i).getAccno().equals(accno)) {
							al.remove(al.get(size));
							throw new AccountNumberExistException("Account number already exist!");
						}
					}catch(AccountNumberExistException e){
						System.out.println(e.getMessage());
					}
				}
				break;
			case 2:
				System.out.println("-----------------------User Info------------------------");
				for(BankDetails b:al) {
					b.displayInfo();
					System.out.println("--------------------------------------------------------");
				}
			    break;
			case 3:
				boolean f1=false;
				System.out.println("Enter the account number to search: ");
				sh=sc.next();
				for(BankDetails b:al) {
					f1=b.search(sh);
				}
				try {
					if(f1) {
						break;
					}else {
						throw new AccountNumberIncorrectException("Account number not found!");
					}
				}catch(AccountNumberIncorrectException e){
					System.out.println(e.getMessage());
				}
			    break;
			case 4:
				boolean f2=false;
				System.out.println("Enter the account number to update: ");
				sh=sc.next();
				for(BankDetails b:al) {
					f2=b.update(sh);
				}
				try {
					if(f2) {
						break;
					}else {
						throw new AccountNumberIncorrectException("Account number not found!");
					}
				}catch(AccountNumberIncorrectException e){
					System.out.println(e.getMessage());
				}
			    break;
			case 5:
				boolean f3=false;
				System.out.println("Enter the account number to delete: ");
				sh=sc.next();
				for(int i=0;i<al.size();i++) {
					if(al.get(i).getAccno().equals(sh)) {
						f3=true;
						al.remove(al.get(i));
						//System.out.println(al.size());
					}
				}
				try {
					if(f3) {
						break;
					}else {
						throw new AccountNumberIncorrectException("Account number not found!");
					}
				}catch(AccountNumberIncorrectException e){
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				System.out.println("-------------------Thank you visit again--------------------");
				break;
			default:
				System.out.println("Enthe the Correct choice!");
			}
		}while(ch!=6);
		sc.close();
	}
}