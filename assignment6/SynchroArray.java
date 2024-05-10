package assignment6;

public class SynchroArray {
	
	
	
	public static void main(String[] args) {	
		PrintArrays p = new PrintArrays();
		int []arr1 = {1,2,3,4,5,7};
		int []arr2 = {8,9,10,11,12};
		
		 Thread one = new Thread(new Runnable() {
				@Override
				public void run() {
					synchronized(p) {
						p.ArrayPrint(arr1);
						try {
							Thread.sleep(100);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
					}
					
			}
				 
			 
		 });
		 
		 
		 
		 
		 Thread two = new Thread(new Runnable() {
				@Override
				public void run() {
					synchronized(p) {
						 p.ArrayPrint(arr2);
						try {
							Thread.sleep(1000);
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
