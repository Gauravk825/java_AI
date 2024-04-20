package assignment3;

import java.util.Comparator;

public class NameComparator implements Comparator<Account>{
	
	@Override
	public int compare(Account o1, Account o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
