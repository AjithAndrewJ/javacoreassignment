package basicprogram;

public class StarPattern {

	public static void main(String[] args) {
		char i,j,n,m;
		for(i=1;i<=8;i++) {
			for(j=1;j<=8;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		System.out.println(" ");
		
		
		for(n=1;n<=5;n++) {
			for(m=1;m<=n;m++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
