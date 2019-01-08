package org.manjunath.java.interviewproblems.strings;

public class StringInplaceReverse {
	
	public String reverseString(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		int length = stringBuilder.length();
		
		for (int i = 0; i < length/2; i++) {
			char current = stringBuilder.charAt(i);
			int otherEndIndex = length-1-i;
			
			stringBuilder.setCharAt(i, stringBuilder.charAt(otherEndIndex));
			stringBuilder.setCharAt(otherEndIndex, current);
		}
		return stringBuilder.toString();
	}
}
