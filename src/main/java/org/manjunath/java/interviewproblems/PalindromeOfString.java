package org.manjunath.java.interviewproblems;

public class PalindromeOfString {
	
	public boolean isPalindrome(String str) {
		String temp = "";
		if (str != null) {
			for (int i = str.length()-1; i >= 0; i--)
				temp = temp + str.charAt(i);
			
			if (temp.equals(str))
				return true;
			else
				return false;
		} else
			return false;
	}
	
	public boolean isStringPalindrome(String str) {
		String temp = "";
		for(int i = 0; i < str.length(); i++)
			temp = str.charAt(i) + temp;
		
		if (temp.equals(str))
			return true;
		else
			return false;
	}
}
