package org.manjunath.java.interviewproblems.numbers;

public class PerfectNumber {
	
	public boolean isPerfectNumber(int num) {
		int sum = 0;
		int remainder = num;
		
		while(remainder > 1) {
			remainder--;
			
			if (num % remainder == 0)
				sum += remainder;
		}
		return (num == sum) ? true : false;
	}
}
