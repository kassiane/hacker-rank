package com.kassiane.hacker.rank.data.structures.arrays.arrayds;

import java.util.Scanner;

/**
 * HackerRank An array is a series of elements of the same type placed in
 * contiguous memory locations that can be individually referenced by adding an
 * index to a unique identifier.
 *
 * You'll be given an array of NN integers, and you have to print the integers
 * in reverse order.
 *
 * Note: If you have already solved the problem "Arrays Introduction" in the
 * Introduction chapter of the C++ domain, you may skip this challenge.
 *
 * Input Format
 *
 * The first line of input contains NN, the number of integers. The next line
 * contains NN integers separated by a space.
 *
 * Constraints
 *
 * 1<=N<=10001<=N<=1000
 *
 * 1<=Ai<=100001<=Ai<=10000, where AiAi is the ithith integer in the array.
 *
 * Output Format
 *
 * Print the NN integers of the array in the reverse order on a single line
 * separated by single spaces.
 *
 * Sample Input
 *
 * 4 1 4 3 2
 *
 * Sample Output
 *
 * 2 3 4 1
 *
 * @author kassi
 *
 */
public class Solution {

	public static void main(final String[] args) {
		final Scanner in = new Scanner(System.in);
		final int n = in.nextInt();
		final int numbers[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			numbers[arr_i] = in.nextInt();
		}
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i]);
			if (i != 0)
				System.out.print(" ");
		}

		in.close();
	}
}