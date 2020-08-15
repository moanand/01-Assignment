package com.ashokit.arrays;

public class PairSumEqualGivenNumber {
	public static void main(String args[]) {
		int a[] = { 3, 6, 8, -8, 10, 8 };
		int sum = 16;

		System.out.println("Pairs of the elements whose sum is: " + sum);
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if ((a[i] + a[j]) == sum && i != j) {
					System.out.println(a[i] + ", " + a[j]);
				}
			}
		}
	}
}
