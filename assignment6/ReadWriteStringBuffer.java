package assignment6;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

public class ReadWriteStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		//ExecutorService executor = Executors.newFixedThreadPool(5);
		
		Thread one = new Thread((new Runnable() {
			@Override
			public void run() {
				synchronized(sb) {
					//String name = s;
					
					for(int i=0; i<5; i++){
						
						sb.append("Element " + i + " " );
						//System.out.println("Thread Write : " + sb + " Added Element : " +i);
					try {
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				
		}
			 
		 
	 }}));

	
	
	
	Thread two = new Thread(new Runnable() {
		@Override
		public void run() {
			synchronized(sb) {
				//String name = s;
				
				//for(int i=0; i<5; i++){
				try {
					System.out.println("thread Read :   " + sb);
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
	}
		 
	 
 });
	one.start();
two.start();
		
	}

}
