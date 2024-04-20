package assignment3;

import java.util.Comparator;

public class IfscComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.ifsc.compareTo(o2.ifsc);
	}

}
