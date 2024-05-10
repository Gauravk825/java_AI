package assignment6;

public class EvenOddThread {

	public static void main(String[] args) {		
		 Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 1; i<21; i++) {
						if (i%2==0) {
						System.out.println(Thread.currentThread().getName()+ " " +i);
						}
//						try {
//							Thread.sleep(2000);
//						}catch(InterruptedException e){
//							e.printStackTrace();
//						}
					}
					
				}
				 
			 }, "Even");
		 t1.start();
		 
		 
		 
		 Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 1; i<21; i++) {
						if(i%2!=0) {
						System.out.println(Thread.currentThread().getName()+ " " +i);
						}
//						try {
//							Thread.sleep(2000);
//						}catch(InterruptedException e){
//							e.printStackTrace();
//						}
					}
					
				}
				 
			 }, "Odd");
		t2.start();
		
	

	}

}
