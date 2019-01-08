package org.manjunath.java.interviewproblems.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharFromStringUsingLinkedHashSet {
	
	private Map<Character, Integer> getCharacterMap (String str) {
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		for (char c : str.toCharArray())
			charMap.put(c, charMap.containsKey(c) ? charMap.get(c) + 1 : 1);
		return charMap;
	}
	
	public char getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> charMap = getCharacterMap(str);
		
		for (Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}
				
		throw new RuntimeException("No Non-repeated characters found");
	}
}
