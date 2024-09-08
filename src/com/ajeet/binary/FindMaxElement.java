package com.ajeet.binary;

public class FindMaxElement {
    public static int findMax(int[] arr) {
        int low= 0;
        int high= arr.length-1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if((mid ==0 || arr[mid]>arr[mid-1]) && (mid == arr.length-1 || arr[mid]>arr[mid+1])) {
                return arr[mid];
            }else if(mid ==0 ||arr[mid-1]<arr[mid]) {
                low = mid+1;
            }else{
                high = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[]  p = {1,3,5,2};
        System.out.println(findMax(p));

    }
}
