package basicprogram;
import java.util.Scanner;

public class CheckGrade {
public static void main(String []args) {
	float total,percentage;
	char grade;
	float eng,phy,chem,math,comp;
	Scanner sc = new Scanner(System.in);
	System.out.println("**Enter marks of five subjects**");
    System.out.print("Enter marks of English subject:");
    eng=sc.nextFloat();
    System.out.print("Enter marks of physics subject:");
    phy=sc.nextFloat();
    System.out.print("Enter marks of chemistry subject:");
    chem=sc.nextFloat();
    System.out.print("Enter marks of maths subject:");
    math=sc.nextFloat();
    System.out.print("Enter marks of computer subject:");
    comp=sc.nextFloat();

    total = eng + phy + chem + math + comp;
    percentage = (total / 500) * 100;
    
    System.out.println("Total marks ="+total);
    System.out.println("Percentage = "+percentage);
    if(percentage>=90){
    	System.out.println("Your grade is'A'");
    }else if(percentage>=80 && percentage<90){
    	System.out.println("Your grade is'B'");
    }else if(percentage>=70 && percentage<80){
    	System.out.println("Your grade is'C'");
    }else if(percentage>=60 && percentage<70){
    	System.out.println("Your grade is'C'");
    }else if(percentage>=40 && percentage<60){
    	System.out.println("Your grade is'D'");
    }else if(percentage<40){
    	System.out.println("Your grade is'E'");
    }
   }
}