package org.manjunath.java.interviewproblems;

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
}
