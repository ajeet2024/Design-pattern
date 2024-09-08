package com.ajeet.twopointer;

public class CountPair {
    public static int countPairs(int[] arr, int k) {
        if (arr == null || arr.length == 0) return 0;
        int count = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i]+arr[j] == k) {
                count++;
                i++;
                j--;
            } else if (arr[i]+arr[j] < k) {
                i++;

            }else {
                j--;
            }
        }
    return count;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(countPairs(arr, 7));


    }
}
