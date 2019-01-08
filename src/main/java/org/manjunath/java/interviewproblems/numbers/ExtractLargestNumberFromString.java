package org.manjunath.java.interviewproblems.numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * ExtractLargestNumberFromString class is used to extract the largest number
 * associated with the input string. 
 * If string doen't have any number in it,then the function 
 * getLargestNumber() return 0.
 * 
 * @author Manjunath HM
 *
 */
public class ExtractLargestNumberFromString {
	
	public int getLargestNumber(String str) {
		
		if (str != null) {
			if (str.matches("(.)*(\\d)(.)*")) {
				List<Integer> numList = getNumbersList(str);
				return numList.stream().max(Integer :: compareTo).get();
			}
		} else
			throw new RuntimeException("Given String is null");
		
		return 0;
	}
	
	private List<Integer> getNumbersList(String str) {
		List<Integer> numberList = new ArrayList<>();
		String[] numbers = str.split("[^(\\d)]");
		
		for(String number : numbers) {
			if (number != null && number.trim().length() > 0)
				numberList.add(Integer.parseInt(number));
		}
		return numberList;
	}
}
