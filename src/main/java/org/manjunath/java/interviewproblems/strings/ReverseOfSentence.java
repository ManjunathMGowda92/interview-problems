package org.manjunath.java.interviewproblems.strings;

/**
 * ReverseOfSentence class is used to reverse the given string sentence, by
 * splitting spaces.
 * 
 * @author Manjunath HM
 *
 */
public class ReverseOfSentence {
	
	/**
	 * reverseSentence() method reverse the given input sentence.
	 * 
	 * @param str :Input sentence for reversing.
	 * @return : reversed sentence
	 */
	public String reverseSentence(String str) {
		if (str == null || str.isEmpty())
			return str;
		
		String[] arr = str.split("\\s");
		StringBuffer strBuffer = new StringBuffer();
		for (int i = arr.length - 1; i >= 0 ; i--) {
			strBuffer.append(arr[i]);
			strBuffer.append(" ");
		}
		
		return strBuffer.toString().trim();
	}
}
