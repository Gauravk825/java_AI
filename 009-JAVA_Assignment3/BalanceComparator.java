package assignment3;

import java.util.Comparator;

public class BalanceComparator implements Comparator<Account>{
	
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return (int) (o1.bal - o2.bal);
	}

}
