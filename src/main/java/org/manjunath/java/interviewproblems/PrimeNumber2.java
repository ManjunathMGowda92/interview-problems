package org.manjunath.java.interviewproblems;

public class PrimeNumber2 {
	
	public boolean isPrime(int num) {
		if (num == 0 || num ==1)
			return false;
		
		int sqrt = (int) Math.sqrt(num) + 1;
		for(int i = 2; i < sqrt ; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean isPrimeNumber (int num) {
		if (num == 0 || num ==1)
			return false;
		if (num == 2 || num == 3)
			return true;
		
		if (num % 2 == 0)
			return false;
		
		int sqrt = (int)Math.sqrt(num) + 1;
		for (int i = 3; i < sqrt; i= i+2) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}
}
