package com.ajeet.binary;

public class BinarySearchTest {

    public static int binarySearch(int[] A, int k){
        int low = 0;
        int high = A.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(A[mid] == k){
                return mid;
            } else if (A[mid] < k) {
                low = mid + 1;

            }else{
                high = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] A = {3,6,9,12,4,6,7};
        int  p =binarySearch(A, 12);
        System.out.println(p);


    }
}
