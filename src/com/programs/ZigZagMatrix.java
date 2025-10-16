package com.programs;

import java.util.Scanner;

public class ZigZagMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Step 2: Take elements from user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("Zig-Zag order is:");

        // Step 3: Zig-zag traversal
        for (int sum = 0; sum <= rows + cols - 2; sum++) {
            if (sum % 2 == 0) {
                // Move upward (↗)
                for (int i = Math.min(sum, rows - 1); i >= 0; i--) {
                    int j = sum - i;
                    if (j >= 0 && j < cols) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            } else {
                // Move downward (↙)
                for (int j = Math.min(sum, cols - 1); j >= 0; j--) {
                    int i = sum - j;
                    if (i >= 0 && i < rows) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
        }
    }
}
