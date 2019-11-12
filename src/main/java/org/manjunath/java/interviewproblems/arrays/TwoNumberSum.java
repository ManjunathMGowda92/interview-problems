package org.manjunath.java.interviewproblems.arrays;

import java.util.Arrays;

public class TwoNumberSum {

	public static void main(String[] args) {
		int[] num = { 3, 6, 8, 2, 1, 9, 7 };
		int target = 10;

		twoSumNumberUsingLoops(num, target);
		System.out.println("---------------------------------");
		twoSumNumbersUsingSort(num, target);
	}

	private static int[] twoSumNumberUsingLoops(int[] num, int target) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if ((num[i] + num[j]) == target)
					return new int[] { num[i], num[j] };
			}
		}
		return null;
	}

	private static void twoSumNumbersUsingSort(int[] num, int target) {

		Arrays.sort(num);

		int begin = 0;
		int end = num.length - 1;

		while (begin < end) {
			if (num[begin] + num[end] == target) {
				System.out.println(num[begin] + ":: " + num[end]);
				begin++;
				end--;
			} else if (num[begin] + num[end] < target)
				begin++;
			else
				end--;

		}
	}
}
