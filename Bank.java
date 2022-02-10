package banking;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		int i;
		BankDetails bk=new BankDetails();
		Scanner in=new Scanner(System.in);
		do{
			System.out.println("---Banking Transaction System---");
			System.out.println("1.Create Account \n2.Display Account \n3.To Deposit \n4.To Withdrawal \n5.Exit");
			System.out.println("Enter your choise : ");
			i=in.nextInt();
			switch(i) {
			case 1:
				System.out.println("---Enter your details---");
				bk.accountInfo();
				System.out.println("---Account created---");
				System.out.println();

			    break;
			case 2:
				System.out.println("---User Info---");
				bk.displayInfo();
				System.out.println();
			    break;
			case 3:
				bk.deposit();
				System.out.println();
			    break;
			case 4:
				bk.withdrawal();
				System.out.println();
			    break;
			case 5:
				break;
			default:
				System.out.println();
				System.out.println("!!!! Enthe the Correct choise !!!!");
				System.out.println();
			}
		}while(i!=5);
		System.out.println("---Thank you---");
		in.close();
	}
}
