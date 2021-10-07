package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int length = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i]+1 != arr[j]) {
					System.out.println(arr[i]+1);
				}
				break;
			}
		}

	}

}
