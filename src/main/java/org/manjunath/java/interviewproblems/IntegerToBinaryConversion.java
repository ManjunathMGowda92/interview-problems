package org.manjunath.java.interviewproblems;

public class IntegerToBinaryConversion {
	
	public String convertIntegerToBinary(int num) {
		String binary = "";
		
		while (num > 0) {
			int temp = num % 2;
			binary = temp + binary;
			num /=2;
		}
		
		return binary;
	}
	
	public int countNumOfSpecifiedCharsInBinary(String binary, char c) {
		int count = 0;
		for (char c1: binary.toCharArray())
			if (c1 == c)
				count++;
		
		return count;
	}
}
