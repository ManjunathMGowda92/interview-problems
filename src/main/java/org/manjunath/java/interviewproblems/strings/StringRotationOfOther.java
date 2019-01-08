package org.manjunath.java.interviewproblems.strings;

import java.util.ArrayList;
import java.util.List;

public class StringRotationOfOther {
	
	private List<String> getRotationList(String str) {
		List<String> rotationList = new ArrayList<>();
		String temp = str;
		
		if (str != null) {
			rotationList.add(str);
			for (int i = 0; i < str.length()-1; i++) {
				temp = str.substring(i+1) + str.substring(0, i+1);
				rotationList.add(temp);
			}
		}
		return rotationList;
	}
	
	public boolean isStringRotationOfOther(String str1, String str2) {	
		List<String> rotationList = getRotationList(str1);
		for(String str : rotationList) {
			if (str.equals(str2))
				return true;
		}				
		return false;
	}
}
