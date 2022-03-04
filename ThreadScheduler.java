package classexample;

class ThreadExample extends Thread{

	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+ "= "+i);
		}
	}
}
	
public class ThreadScheduler {
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		ThreadExample t3 = new ThreadExample();
		
		/*String thread_1 = t1.getName();
		System.out.println("thread 1 is : "+ thread_1);
		
		String thread_2 = t2.getName();
		System.out.println("thread 2 is : "+ thread_2);*/
		
		t1.setName("first thread");
		t2.setName("Second thread");
		t3.setName("third thread");
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.getPriority();
		t2.getPriority();
		t3.getPriority();
		
		t1.start();
		//t1.start(); IllegalThreadStateException
		t2.start();
		t3.start();
	}
}
