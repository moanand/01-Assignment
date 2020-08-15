package com.ashokit.arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueElements {
	public static void main(String[] args) {
		int numbers[] = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };
		sumOfUniqueElements(numbers);
	}

	public static void sumOfUniqueElements(int numbers[]) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer num : numbers) {
			set.add(num);
		}
		int sum = 0;
		for (Integer num : set) {

			sum += num;
		}
		System.out.println(sum);
		String s = "";
		for (Integer integer : set) {
			s = s + integer + ",";
		}
		System.out.println("Unique elements are : " + "(" + s + ")");
	}
}
