package org.manjunath.java.interviewproblems.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ReverseOfSentenceUsingCollections class is used to reverse the given input
 * string by using Collections class reverse method.
 * 
 * @author Manjunath HM
 *
 */
public class ReverseOfSentenceUsingCollections {

	/**
	 * reverseSentence() method is used to reverse the given sentnce, by using
	 * Collections.reverse() method.
	 * 
	 * @param str : Input Sentence for reversing.
	 * @return : Sentence after reversed.
	 */
	public String reverseSentence(String str) {
		if (str == null || str.isEmpty())
			return str;
		
		List<String> words = Arrays.asList(str.split("\\s"));
		Collections.reverse(words);
		StringBuffer strBuffer = new StringBuffer();
		
		for (String tempStr : words) {
			strBuffer.append(tempStr);
			strBuffer.append(" ");
		}
		
		return strBuffer.toString().trim();
	}
}
