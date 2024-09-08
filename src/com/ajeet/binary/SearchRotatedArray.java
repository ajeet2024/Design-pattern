package com.ajeet.binary;

public class SearchRotatedArray {
    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if(key < arr[0]) {
                if(arr[mid] >= arr[0]) {
                    low = mid+1;
                }else if(arr[mid] <= arr[0]) {
                    low = mid+1;

                }else{
                    high = mid-1;
                }

            } else  {
                if(arr[mid] <= arr[0]) {
                    high = mid-1;
                } else if (arr[mid] >= arr[0]) {
                    low = mid+1;

                }else{
                    high = mid-1;
                }

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,0,1,2};
        int key = 7;
        System.out.println(search(arr, key));


    }
}
