package com.ashokit.arrays;

public class SmallestPairSum {
	public static void findPair(int[] a) {
		if (a.length < 2)
			return;

		int low = 0;
		int high = a.length - 1;

		int min = Integer.MAX_VALUE;
		int i = 0, j = 0;

		while (low < high) {
			if (Math.abs(a[high] + a[low]) < min) {
				min = Math.abs(a[high] + a[low]);
				i = low;
				j = high;
			}
			if (min == 0) {
				break;
			}
			if (a[high] + a[low] < 0) {
				low++;
			} else {
				high--;
			}

		}
		System.out.println("Pair found (" + a[i] + ", " + a[j] + ")");
		System.out.println("Sum of pairs: " + (a[i] + a[j]));

	}

	public static void main(String[] args) {
		int[] a = { 1, 7, 2, 9, 6 };
		findPair(a);
	}

}
