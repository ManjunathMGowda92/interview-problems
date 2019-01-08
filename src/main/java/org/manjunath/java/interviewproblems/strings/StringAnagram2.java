package org.manjunath.java.interviewproblems.strings;

/**
 * StringAnagram1 class is used to check the given strings are anagrams of each
 * other by removing character by character in the string.
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
public class StringAnagram2 {
	
	public boolean isAnagram(String str1, String str2) {
		
		if (str1.length() != str2.length())
			return false;
		
		char[] arr = str1.toCharArray();
		for (char c : arr) {
			int index = str2.indexOf(c);
			if (index != -1)
				str2 = str2.substring(0, index) + str2.substring(index+1, str2.length());
			else
				return false;
		}
		
		return str2.isEmpty();
	}
}
