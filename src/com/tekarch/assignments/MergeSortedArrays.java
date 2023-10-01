package com.tekarch.assignments;

public class MergeSortedArrays {

    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 0, 0, 0, 0};
        int[] B = {2, 4, 6, 8};
        int m = 4, n = 4;  // m and n are the actual lengths of A and B respectively

        merge(A, m, B, n);

        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
