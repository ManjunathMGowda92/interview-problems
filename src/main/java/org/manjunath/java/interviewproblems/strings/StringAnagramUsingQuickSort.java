package org.manjunath.java.interviewproblems.strings;

/**
 * The StringAnagramUsingQuickSort class is for checking of Strings are anagrams
 * or not.
 * 
 * @author Manjunath HM
 *
 */
public class StringAnagramUsingQuickSort {
	
	private void quickSort(char[] arr, int start, int end) {
		if (start > end)
			return;
		
		if (start <= end) {
			int partitionIndex = getPartitionIndex(arr, start, end);
			quickSort(arr, start, partitionIndex-1);
			quickSort(arr, partitionIndex+1, end);
		}
	}
	
	private int getPartitionIndex(char[] arr, int start, int end) {
		int partitionIndex = start;
		char pivot = arr[end];
		
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				char temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;
				
				partitionIndex++;
			}
		}
		
		char temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end]  = temp;
		
		return partitionIndex;
	}
	
	public boolean isAnagrams(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		else {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			quickSort(arr1, 0, arr1.length-1);
			quickSort(arr2, 0, arr2.length-1);
			
			return isArrElementsSame(arr1, arr2);
		}
	}
	
	private boolean isArrElementsSame(char[] arr1, char[] arr2) {
		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != arr2[i])
				return false;
		
		return true;
	}
}
