package org.manjunath.java.interviewproblems;

public class PrimeNumber1 {

	public String isPrime(int num) {
		if (num < 0)
			return "not valid";
		if (num == 0 || num == 1)
			return "not a prime";
		if (num == 2 || num == 3)
			return "prime";
		
		if (((num * num)-1) % 24 == 0)
			return "prime";
		else
			return "not a prime";
	}
}
