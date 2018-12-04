package org.manjunath.java.interviewproblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceOfCharsInString {

	private  Map<Character, Integer> getOccurenceMap(String str) {
		Map<Character, Integer> countMap = new LinkedHashMap<>();
		for (char c : str.toCharArray())
			countMap.put(c, countMap.containsKey(c) ? countMap.get(c) + 1 : 1);
		
		return countMap;
	}
	
	public int getOccurenceOfCharInString(String str, char c) {
		Map<Character, Integer> charMap = getOccurenceMap(str);
		
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getKey().equals(c))
				return entry.getValue();
		}
		return 0;
	}
}
