package com.ashokit.arrays;

public class MaxAndMinElement {
	public static void main(String[] args) {
		int myArray[] = { 1, 2, 5, 5, 6, 6, 7, 2 };
		
		MaxAndMinElement m = new MaxAndMinElement();
		System.out.println("Maximum value in the array is::" + m.max(myArray));
		System.out.println("Minimum value in the array is::" + m.min(myArray));

	}

	public int max(int[] array) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public int min(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}
