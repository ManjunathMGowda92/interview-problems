package org.manjunath.java.interviewproblems;

public class PrimeNumber2 {
	
	/**
	 * isPrime() method is used to check whether the given number is prime or not.
	 * The method checks whether the number is divisible by any number till its
	 * square root.
	 * 
	 * @param num :Input number to check prime or not
	 * @return :boolean value to specify the number is prime or not. True if the
	 *         number is prime, false otherwise.
	 */
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
	
	/**
	 * isPrimeNumber() method is used to check whether the given number is prime or
	 * not. The method checks whether the number is divisible by any number till its
	 * square root by skipping the even numbers, because if the number is not
	 * divisible by 2 then it is not divisible by any other even number.
	 * 
	 * @param num :Input number to check prime or not
	 * @return :boolean value to specify the number is prime or not. True if the
	 *         number is prime, false otherwise.
	 */
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
