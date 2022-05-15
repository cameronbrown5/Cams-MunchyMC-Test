package me.thecamzone.problem1;

import java.util.Arrays;
import java.util.List;

public class Problem1 {
	
	public static final int[][] INT_ARRAY = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public static final List<String> STRING_LIST = Arrays.asList(new String[] { "a", "b", "c", "a", "b", "c" });

	public static void main(String[] args) {
		
		// Method 1
		flipVariables(1, 2);
		
		// Method 2
		System.out.println();
		printArray(INT_ARRAY);
		
		System.out.println();
		printArray(rotateArray(INT_ARRAY));
		
		// Method 3
		System.out.println();
		System.out.println(countStrings(STRING_LIST, "c"));
	}

	/*
	 * Method 1
	 */
	public static void flipVariables(int x, int y) {
		// Get sum of 2 variables
		x = x + y;
		
		// Subtract y from sum to get original x
		y = x - y;
		
		// Subtract x from sum to get original y
		x = x - y;
		
		System.out.println(x + " " + y);
	}

	/*
	 * Method 2
	 */
	public static int[][] rotateArray(int[][] array) {
		int size = array.length;
		
		// Transpose
		// Switch x to y, and y to x
		// e.g. (0,1) to (1,0)
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		
		// Flip horizontal
		// Switch first column to last column
		// e.g. { 1, 2, 3 } to { 3, 2, 1 }
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size / 2; j++) {
				int temp = array[i][j];
				array[i][j] = array[i][size - 1 - j];
				array[i][size - 1 - j] = temp;
			}
			System.out.println();
		}
		return array;
	}

	// Print array
	public static void printArray(int[][] array) {
		int size = array.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(array[i][j]);
			System.out.println();
		}
	}

	/*
	 * Method 3
	 */
	public static int countStrings(List<String> strings, String string) {
		// Return 0 if list is empty
		if (strings.isEmpty()) {
			return 0;
		}
			
		// Check if the first string in the list is the string we're looking for
		if (strings.get(0).equals(string)) {
			// If it is the string we're looking for, add 1 to the count and remove word from the list.
			return countStrings(strings.subList(1, strings.size()), string) + 1;
		} else {
			// If it is not the string we're looking for, just remove word from the list.
			return countStrings(strings.subList(1, strings.size()), string);
		}
	}
}
