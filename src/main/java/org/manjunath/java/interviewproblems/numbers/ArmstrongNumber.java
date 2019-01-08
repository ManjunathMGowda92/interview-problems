package org.manjunath.java.interviewproblems.numbers;

/**
 * An Armstrong number of three digits is an integer such that the sum of the
 * cubes of its digits is equal to the number itself. For example, 371, 153,
 * 370, 407
 * 
 * A positive integer of n digits is called an Armstrong number of order n
 * (order is number of digits) if.
 * 
 * abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
 * 
 * @author Manjunath HM
 *
 */
public class ArmstrongNumber {

	public boolean isArmstrongNumber(int num) {

		int noOfDigits = getNoOfDigits(num);
		int sum = 0;
		int temp = num;

		while (temp > 0) {
			int rem = temp % 10;
			sum = sum + (int) Math.pow(rem, noOfDigits);
			temp = temp / 10;
		}

		if (num == sum)
			return true;
		else
			return false;
	}

	private int getNoOfDigits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}
}
