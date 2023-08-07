package org.tnsif.codingchallenge;

import java.util.Scanner;

public class sum_of_array {
    public static int[] computeArraySumExceptCurrent(int[] arr)
    {
        int totalSum = 0;
        for (int num : arr) 
        {
            totalSum += num;
        }
        
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
        {
            result[i] = totalSum - arr[i];
        }
        
        return result;
    }
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.print("Enter the length of the array: ");
            int N = scanner.nextInt();

            int[] array = new int[N];
            System.out.print("Enter " + N + " space-separated positive integers: ");
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            int[] result = computeArraySumExceptCurrent(array);
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        
    }
}