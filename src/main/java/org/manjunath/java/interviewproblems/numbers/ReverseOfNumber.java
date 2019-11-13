package org.manjunath.java.interviewproblems.numbers;

/**
 * ReverseOfNumber class is used to reverse the integer.
 * <p> The methods included in the class are : </p>
 * <ol>
 * 		<li>getReverseNum()</li>
 * </ol>
 * 
 * @author Manjunath
 *
 */
public class ReverseOfNumber {

	/**
	 * getReverseNum() method is used to generate the reverse of the given input
	 * number.
	 * 
	 * @param num :Input integer number
	 * @return Number after reversing.
	 */
	public int getReverseNum(int num) {
		int reverse = 0;
		
		while (num > 0) {
			int temp = num % 10;
			reverse = reverse * 10 + temp;
			num = num / 10;
		}
		
		return reverse;
	}
	
	/**
	 * Method reverse() is used to generate the reverse of given input number.
	 * The method also handles the overflow of number
	 * 
	 * @param num Integer
	 * @return reversed Number(if overflow, then returns 0)
	 */
	public int reverse(int num) {

		boolean negative = false;
		if (num < 0) {
			negative = true;
			num = -num;
		}

		int prevNum = 0;
		int reverse = 0;
		while (num > 0) {
			int temp = num % 10;
			reverse = reverse * 10 + temp;

			if ((reverse - temp) / 10 != prevNum)
				return 0;

			prevNum = reverse;
			num = num / 10;
		}

		return (negative) ? -reverse : reverse;
	}
}
