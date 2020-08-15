package com.ashokit.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		int numbers[] = { 1, 2, 5, 5, 6, 6, 7, 2 };
		removeDuplicateElements(numbers);
	}

	public static void removeDuplicateElements(int numbers[]) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : numbers) {
			set.add(num);
		}

		for (Integer integer : set) {
			System.out.print(integer + " ");
		}
	}

}
