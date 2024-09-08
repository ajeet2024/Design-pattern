package com.ajeet.binary;

public class FindUniqueElement {
    public static int findUnique(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if((mid == 0 || arr[mid] != arr[mid - 1]) && (mid==arr.length-1 || arr[mid] != arr[mid + 1])) {
                return arr[mid];

            }else if(mid ==0 || arr[mid] == arr[mid+1]) {
                if(mid%2 == 0){
                    low = mid + 2;
                }else{
                    high = mid - 1;
                }

            }else{
                if(mid%2 ==0){
                    high = mid - 2;

                }else{
                    low = mid + 1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {

        int [] p = {3,3,1,1,8,8,10,10,19,6,6,2,2,4,4};
        System.out.println(findUnique(p));

    }
}
