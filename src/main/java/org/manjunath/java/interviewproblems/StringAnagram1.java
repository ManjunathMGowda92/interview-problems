package org.manjunath.java.interviewproblems;

import java.util.Arrays;

/**
 * StringAnagram1 class is used to check the given strings are anagrams of each
 * other by using Arrays.sort() and Arrays.equals() methods.
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
public class StringAnagram1 {
	
	public boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		else {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			return Arrays.equals(arr1, arr2);
		}
	}
}
