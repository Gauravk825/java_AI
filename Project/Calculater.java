package Project;

public class Calculater {

	
	public static void main(String[] args) {
	int res = Math.add(34,45);
	System.out.println(res);
	
	
	/*a=12;
	b=15;
	Math.swap2(a,b);
	System.out.println("after swap" + "a: "+ a + " b : " + b);
	*/
	
	int n[] = {12,15};
	System.out.println("after swap" + "a: "+ n[0] + " b : " + n[1]);
	Math.swap(n);
	System.out.println("after swap" + "a: "+ n[0] + " b : " + n[1]);
	
	
	
	}

}
