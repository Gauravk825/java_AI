package assignment6;

public class NumberTable {
	public static void main(String [] args) {
		
		Runnable tt = () ->{
			 for(int i=1; i<10; i++) {
				 if (Thread.currentThread().getName().equals("Number")) {
						 System.out.println(Thread.currentThread().getName()+ " " +i);
				 }
				 
				 else if(Thread.currentThread().getName().equals("Table")) {
					 System.out.println(Thread.currentThread().getName()+ " " +i*2);
				 }
				 
				}
		 };
		 
		 Thread t1 =  new Thread(tt,"Number");
		 Thread t2 =  new Thread(tt,"Table");
		 t1.start();
		 //                                                                                                     t1.join();
		 t2.start();
	}
}
