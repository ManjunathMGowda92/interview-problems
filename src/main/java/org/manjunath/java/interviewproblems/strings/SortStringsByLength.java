package org.manjunath.java.interviewproblems.strings;

public class SortStringsByLength {
	
	private void quickSort(String[] arr, int start, int end) {
		if (start > end)
			return;
		if (start <= end) {
			int partitionIndex = getPartitionIndex(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}
	
	private int getPartitionIndex(String[] arr, int start, int end) {
		int partitionIndex = start;
		String pivot = arr[end];
		
		for (int i = start; i < end; i++) {
			if (arr[i].length() <= pivot.length()) {
				String temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;
				
				partitionIndex++;				
			}
		}
		
		String temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end] = temp;
		return partitionIndex;
	}
	
	public String[] getSortedStringArrayByLength(String[] strArr) {
		quickSort(strArr, 0, strArr.length-1);
		
		return strArr;
	}
}
