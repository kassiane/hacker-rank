package com.kassiane.hacker.rank;

import java.util.Scanner;

/**
 * You are given a 2D array with dimensions 6*6. An hourglass in an array is
 * defined as a portion shaped like this:
 *
 * a b c d e f g
 *
 * For example, if we create an hourglass using the number 1 within an array
 * full of zeros, it may look like this:
 *
 * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 *
 * Actually, there are many hourglasses in the array above. The three topmost
 * hourglasses are the following:
 *
 * 1 1 1 1 1 0 1 0 0 1 0 0 1 1 1 1 1 0 1 0 0
 *
 * The sum of an hourglass is the sum of all the numbers within it. The sum for
 * the hourglasses above are 7, 4, and 2, respectively.
 *
 * In this problem, you have to print the largest sum among all the hourglasses
 * in the array.
 *
 * Note: If you have already solved the problem "Java 2D array" in the data
 * structures chapter of the Java domain, you may skip this challenge.
 *
 * Input Format
 *
 * There will be exactly 6 lines of input, each containing 6 integers separated
 * by spaces. Each integer will be between -9 and 9, inclusively.
 *
 * Output Format
 *
 * Print the answer to this problem on a single line.
 *
 * Sample Input
 *
 * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0
 *
 * Sample Output
 *
 * 19
 *
 * Explanation
 *
 * The hourglass possessing the largest sum is:
 *
 * 2 4 4 2 1 2 4
 *
 * @author kassi
 *
 */
public class Solution {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int matrix[][] = new int[6][6];

        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 6; column++) {
                matrix[row][column] = in.nextInt();
            }
        }

        int greaterSum = 0;

        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 6; column++) {
                if (column < 4 && row < 4) {
                    final int partialSum = matrix[row][column] + matrix[row][column + 1] + matrix[row][column + 2]
                            + matrix[row + 1][column + 1] + matrix[row + 2][column] + matrix[row + 2][column + 1]
                                    + matrix[row + 2][column + 2];
                    if (partialSum > greaterSum)
                        greaterSum = partialSum;
                }
            }
        }

        System.out.println(greaterSum);
        in.close();
    }
}
