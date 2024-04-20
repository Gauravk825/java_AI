package assignment3;
import java.util.*;

import day5.Employee;




public class BnkCollection {
	
	public static void printlst(List<Account> aclst) {
		
		for (Account ab: aclst) {
			System.out.println(ab);
		}
		
	}

	public static void sortByIFSC(List<Account> aclst) {
		
		Collections.sort(aclst, new IfscComparator());
		System.out.println("\n*********** Sort By IFSC **********\n");
		BnkCollection.printlst(aclst);
	
	}
	
	public static void sortByID(List<Account> aclst) {
		
		Collections.sort(aclst);
		System.out.println();
		System.out.println("********** Sort BY  ***********");
		BnkCollection.printlst(aclst);
	
	}
	
	public static void sortByBalance(List<Account> aclst) {
		
		Collections.sort(aclst, new BalanceComparator());
		System.out.println("\n*********** Sort By Balance **********\n");
		BnkCollection.printlst(aclst);
	
	}
	
	public static void sortByName(List<Account> aclst) {
		
		Collections.sort(aclst, new NameComparator());
		System.out.println("\n*********** Sort By Name **********\n");
		BnkCollection.printlst(aclst);
	
	}
	
	public static Map<String, Account> filterByIFSC(List<Account> aclst, String sifsc){
		
		Map<String, Account> ifscmap = new HashMap<>();
		
		for(Account a: aclst) {
			if(a.ifsc == sifsc) {
				ifscmap.put(a.name, a);
			}
			
		}
		return ifscmap;
		
	}
	
	public static Map<String, Account> filterByBalance(List<Account> aclst){
		
		Map<String, Account> balmap = new HashMap<>();
		
		for(Account a: aclst) {
			if(a.bal > 60000) {
				balmap.put(a.name, a);
			}
			
		}
		return balmap;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	
	List<Account> aclst = new ArrayList<>();
	
	aclst.add(new Account(976, "Gaurav", 50000, "SBIN001"));
	aclst.add(new Account(345, "Mitali", 89000, "SBIN002"));
	aclst.add(new Account(889, "Utsav", 60000, "SBIN001"));
	aclst.add(new Account(763, "Prathamesh", 687467, "SBIN003"));
	
	BnkCollection b1 = new BnkCollection();
	
	b1.printlst(aclst);
	
	b1.sortByID(aclst);
	
	b1.sortByName(aclst);
	
	b1.sortByIFSC(aclst);
	
	b1.sortByBalance(aclst);
	
	
	int find_name = Collections.binarySearch(aclst, new Account(763, null, 0, null));
	System.out.println("\n ***** Searching Account *******");
	System.out.println(find_name);
	
	
	Map<String, Account> ifscmap = filterByIFSC(aclst, "SBIN001");
	System.out.println("\n ****** Filter By IFSC *********\n" + ifscmap);
	
	
	Map<String, Account> balmap = filterByBalance(aclst);
	System.out.println("\n ****** Filter By Balance *********\n" + balmap);
	
	
	
	
	}
	


}
