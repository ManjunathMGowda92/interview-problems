package org.manjunath.java.interviewproblems.strings;

/**
 * StringAnagram3 class is used to check the given strings are anagrams of each
 * other by deleting the character by character in the StringBuffer.
 * 
 * An anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * Ex: listen <--> silent
 * restful <--> fluster
 * 
 * @author Manjunath HM
 *
 */
public class StringAnagram3 {

	public boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		
		char[] arr = str1.toCharArray();
		StringBuffer strBuffer = new StringBuffer(str2);
		
		for (char c : arr) {
			int index = strBuffer.indexOf(""+c);
			if (index != -1) {
				strBuffer.deleteCharAt(index);
			} else
				return false;
		}
		
		return strBuffer.length() == 0 ? true : false;
	}
}
