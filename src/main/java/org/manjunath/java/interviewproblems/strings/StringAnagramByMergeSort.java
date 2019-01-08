package org.manjunath.java.interviewproblems.strings;

/**
 * The StringAnagramByMergeSort class is for checking of Strings are anagrams or
 * not.
 * 
 * @author Manjunath HM
 *
 */
public class StringAnagramByMergeSort {

	private void mergeSort(char[] arr) {
		if (arr == null)
			return;
		
		if (arr.length > 1) {
			int mid = arr.length / 2;
			char[] left = new char[mid];
			char[] right = new char[arr.length - mid];
			
			for (int i = 0; i < mid; i++)
				left[i] = arr[i];
			for (int i = mid; i < arr.length; i++)
				right[i-mid] = arr[i];
			
			mergeSort(left);
			mergeSort(right);
			merge(left, right, arr);
		}
	}
	
	private void merge(char[] left, char[] right, char[] arr) {
		int leftLength = left.length;
		int rightLength = right.length;
		int i = 0, j = 0, k = 0;
		
		while(i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < leftLength) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while (j < rightLength) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	public boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		mergeSort(arr1);
		mergeSort(arr2);
		
		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != arr2[i])
				return false;
		
		return true;
	}
}
