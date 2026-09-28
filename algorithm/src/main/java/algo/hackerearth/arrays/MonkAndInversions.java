package algo.hackerearth.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class MonkAndInversions {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                matrix[i] = parseRow(br.readLine());
            }
            System.out.println(countInversions(matrix, n));
        }
    }

    public static int[] parseRow(String line) {
        String[] values = line.split(" ");
        int[] row = new int[values.length];
        for (int i = 0; i < values.length; i++)
            row[i] = Integer.parseInt(values[i]);
        return row;
    }

    public static long countInversions(int[][] matrix, int n) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int p = i; p < n; p++) {
                    for (int q = j; q < n; q++) {
                        if (matrix[i][j] > matrix[p][q])
                            count++;
                    }
                }
            }
        }
        return count;
    }
}
