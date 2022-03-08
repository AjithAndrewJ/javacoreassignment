package thread;

class NumberTable{
	synchronized static void printTable(int n) {
		System.out.println("start");
		//synchronized(this) {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+": "+n*i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		//}
		System.out.println("end");
	}
}

/*class thread1 extends Thread{
	NumberTable num;
	public thread1(NumberTable num) {
		this.num=num;
	}
	public void run() {
		num.printTable(5);
	}
}

class thread2 extends Thread{
	NumberTable num;
	public thread2(NumberTable num) {
		this.num=num;
	}
	public void run() {
		num.printTable(10);
	}
}*/

public class ThreadSynchronization {
	public static void main(String[] args) {
		final NumberTable nt1=new NumberTable();
		final NumberTable nt2=new NumberTable();
		/*thread1 t1=new thread1(nt);
		thread2 t2=new thread2(nt);
		t1.start();
		t2.start();*/
		Thread t1=new Thread() {
			@SuppressWarnings("static-access")
			public void run() {
				nt1.printTable(5);
			}
		};
		Thread t2=new Thread() {
			@SuppressWarnings("static-access")
			public void run() {
				nt1.printTable(10);
			}
		};
		Thread t3=new Thread() {
			@SuppressWarnings("static-access")
			public void run() {
				nt2.printTable(5);
			}
		};
		Thread t4=new Thread() {
			@SuppressWarnings("static-access")
			public void run() {
				nt2.printTable(10);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
