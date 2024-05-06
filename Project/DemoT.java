package Project;

public class DemoT {

	public static void main(String[] args) {
		
		
		 Runnable tt = () ->{
			 for(int i=1; i<21; i++) {
				 if (Thread.currentThread().getName().equals("Even")) {
					 if( i%2==0) {
						 System.out.println(Thread.currentThread().getName()+ " " +i);
					 }
				 }
				 
				 else if(Thread.currentThread().getName().equals("Odd")) {
					 if( i%2!=0) {
						 System.out.println(Thread.currentThread().getName()+ " " +i);
					 }
				 }
				 
				}
		 };
		 
		 Thread t1 =  new Thread(tt,"Even");
		 Thread t2 =  new Thread(tt,"Odd");
		 t1.start();
		 t2.start();

	}

}
