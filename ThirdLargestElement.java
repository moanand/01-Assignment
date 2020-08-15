package com.ashokit.arrays;

public class ThirdLargestElement {
	public static int getThirdLargest(int[] a, int total) {
		int temp;
		if (a.length < 2) {
			System.out.println("Invalid Input");
			return 0;
		} else {
			for (int i = 0; i < total; i++) {
				for (int j = i + 1; j < total; j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			return a[total - 3];
		}

	}

	public static void main(String args[]) {
		// int a[] = { 6, 8, 1, 9, 2, 1, 10};
		// int a[] = { 6, 8, 1, 9, 2, 1, 10, 12};
		int a[] = { 6 };

		System.out.println("Third Largest: " + getThirdLargest(a, a.length));

	}
}
