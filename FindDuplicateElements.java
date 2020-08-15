package com.ashokit.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 5, 5, 6, 6, 7, 2 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.print(numbers[j] + " ");
				}
			}
		}

		//findDuplicateValue(numbers);
	}

	public static void findDuplicateValue(int numbers[]) {
		// List<Integer> list=numbers.
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : numbers) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int count = entry.getValue();
			if (count > 1)
				System.out.print(entry.getKey() + " ");

		}
	}

}
