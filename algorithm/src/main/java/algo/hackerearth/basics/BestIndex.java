package algo.hackerearth.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 Best Index

 You are given an array of elements. Now you need to choose the best index of this array.
 An index of the array is called best if the special sum of this index is maximum across
 the special sum of all the other indices.

 I/P:
 6
 -3 2 3 -4 3 1

 O/P:
 3

 Special Sum (SS):
 SS[0] = A[0] + A[1]+A[2] + A[3]+A[4]+A[5] = 2
 SS[1] = A[1] + A[2]+A[3] = 1
 SS[2] = A[2] + A[3]+A[4] = 2
 SS[3] = A[3] + A[4]+A[5] = 0
 SS[4] = A[4] = 3
 SS[5] = A[5] = 1

 Max = 3
 * */

public class BestIndex {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        long[] a = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine()); //split on whitespace by default
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        long answer = findMaxSpecialSum(a);
        System.out.println(answer);
    }

    private static long findMaxSpecialSum(long[] a) {
        int n = a.length;

        //A prefix sum is an array where each element stores the sum of everything before it
        long[] prefixSum = new long[n+1];
        for(int  i =0; i < n; i++)
            prefixSum[i+1] = prefixSum[i]+a[i];

        long maxSpecialSum = Long.MIN_VALUE;
        for(int i = 0; i < n; i++){
            long specialSum = 0;
            int start = i;
            int groupSize = 1;
            while(start+groupSize <= n){
                int end = start+groupSize;
                specialSum += prefixSum[end] - prefixSum[start];

                start = end;
                groupSize++;
            }
            maxSpecialSum = Math.max(maxSpecialSum,specialSum);
        }
        return maxSpecialSum;
    }
}
