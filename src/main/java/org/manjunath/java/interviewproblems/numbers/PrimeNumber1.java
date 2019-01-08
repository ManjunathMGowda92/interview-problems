package org.manjunath.java.interviewproblems.numbers;

public class PrimeNumber1 {

	/**
	 * isPrime() method is used to check whether the given number is prime or not.
	 * The method checks by using different scenarios.
	 * <p>
	 * 	<ul>
	 * 		<li>If number is less than 0, then it return not valid as output</li>
	 * 		<li>If number is equal to 0 or 1, then it return not a prime as output</li>
	 * 		<li>If number is equal to 2 or 3, then it will return prime as output</li>
	 * 	</ul>
	 * </p>
	 * <p>
	 * If above conditions fail, then it checks by multiplying the given number with
	 * itself and subtracting 1 from the product, and then finding modulus of 24 for
	 * the outcome number. If the modulus (remainder) is equal to 0, then it returns
	 * prime as output, because it is prime number.Otherwise it returns not a prime
	 * as output.
	 * </p>
	 * 
	 * @param num : Input number to check prime or not
	 * @return : String to specify the number is prime or not.
	 */
	public String isPrime(int num) {
		if (num < 0)
			return "not valid";
		if (num == 0 || num == 1)
			return "not a prime";
		if (num == 2 || num == 3)
			return "prime";

		if (((num * num) - 1) % 24 == 0)
			return "prime";
		else
			return "not a prime";
	}
}
