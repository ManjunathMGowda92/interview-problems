package org.manjunath.java.interviewproblems.numbers;

/**
 * PalindromeOfNumber class is used to check number is palindrome or not
 * 
 * @author Manjunath HM
 *
 */
public class PalindromeOfNumber {

	/**
	 * getReverseNum() method is used to reverse the input number.
	 * @param num : Input number for reverse
	 * @return : number which is reversed
	 */
	private int getReverseNum(int num) {
		int reverse = 0;
		while (num > 0) {
			int temp = num % 10;
			reverse = reverse  * 10 + temp;
			num = num / 10;
		}
		
		return reverse;
	}
	
	/**
	 * Checks whether the input number is palindrome or not. If the number is
	 * palindrome return true, else false.
	 * 
	 * @param num : Input number to check palindrome or not
	 * @return :boolean value specifying the input is palindrome or not.
	 */
	public boolean isNumberPalindrome(int num) {
		int reverseNum = getReverseNum(num);
		
		if (num == reverseNum)
			return true;
		else 
			return false;
	}
}
