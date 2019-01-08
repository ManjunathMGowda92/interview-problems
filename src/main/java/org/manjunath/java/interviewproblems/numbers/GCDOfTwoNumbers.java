package org.manjunath.java.interviewproblems.numbers;

public class GCDOfTwoNumbers {
	
	/**
	 * findGcd() method is used to find the GCD(Greatest Common Divisor) between
	 * given 2 integers
	 * 
	 * @param num1 :first input integer
	 * @param num2 :second input integer
	 * @return  GCD of given integers
	 */
	public int findGcd(int num1, int num2) {
		if (num1 == 0)
			return num2;
		if (num2 == 0)
			return num1;
		if (num1 == num2)
			return num1;
		
		if (num1 > num2)
			return findGcd(num1-num2, num2);
		return findGcd(num1, num2-num1);
	}
}
