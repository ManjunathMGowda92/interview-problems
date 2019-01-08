package org.manjunath.java.interviewproblems.numbers;

public class MaxTripletSum {
	
	public int getMaxTripletSumFromArray(int[] arr) {
		int maxA = -1, maxB = -1, maxC = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxA) {
				maxC = maxB;
				maxB = maxA;
				maxA = arr[i];
			} else if (arr[i] > maxB) {
				maxC = maxB;
				maxB = arr[i];
			} else if (arr[i] > maxC) {
				maxC = arr[i];
			}
		}
		
		return maxA + maxB + maxC;
	}
}
