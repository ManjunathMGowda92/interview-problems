package org.manjunath.java.interviewproblems;

public class FactorialOfNumber {
	
	public int fact(int num) {
		if (num == 0)
			return 1;
		
		int product = 1;
		for (int i = 1; i <= num; i++)
			product *= i;
		
		return product;
	}
}
