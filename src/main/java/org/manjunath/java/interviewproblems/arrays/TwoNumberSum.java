package org.manjunath.java.interviewproblems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

	public static void main(String[] args) {
		int[] num = { 3, 6, 8, 2, 1, 9, 7 };
		int target = 10;

		twoSumNumberUsingLoops(num, target);
		System.out.println("---------------------------------");
		twoSumNumbersUsingSort(num, target);
		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(twoSumNumbersUsingHashMap(num, target)));
	}

	/**
	 * Method <i>twoSumNumberUsingLoops</i> finds the pair of values for given
	 * target throwing looping the Array.
	 * 
	 * @param num
	 * @param target
	 * @return
	 */
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

	/**
	 * Method <i>twoSumNumbersUsingHashMap</i> finds pair of numbers by using
	 * the HashMap.
	 * 
	 * @param num
	 * @param target
	 * @return
	 */
	private static int[] twoSumNumbersUsingHashMap(int[] num, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < num.length; i++) {
			int complement = target - num[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			map.put(num[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
