package thread;

public class DeadLockInThread {
	public static void main(String[] args) {
		String res1="paper";
		String res2="pen";
		Thread t1 = new Thread() {  
			public void run() {  
				synchronized (res1) {  
					  System.out.println("t1Andrew has paper");  
					  
					  try { 
						  Thread.sleep(100);
						  } catch (Exception e) {
							  System.out.println(e);
						  }  
					synchronized (res2) {  
					  System.out.println("Andrew wants pen");  
					}  
				}  
			}  
		};  
			  
		Thread t2 = new Thread() {  
			public void run() {  
				synchronized (res2) {  
					System.out.println("t2Mani has pen");  
					try { 
						Thread.sleep(100);
					} catch (Exception e) {
						System.out.println(e);
					}  
					synchronized (res1) {  
						System.out.println("Mani wants paper");
			        }  
				}  
			}  
		 }; 	      
		 t1.start();  
		 t2.start();  
	}
}
