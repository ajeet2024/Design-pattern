package com.ajeet.binary;

public class FirstOccuranceTest {

    public static int findFirstOCcuernce(int[] A, int k){
        int low = 0;
        int high = A.length - 1;
        int ans = -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (A[mid] == k){
                ans = mid;
                return ans;
            }else if (A[mid] > k){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] p  = {1,2,3,3,4,5,6,7,8,8};
        int k = 3;
        System.out.println(findFirstOCcuernce(p, k));

    }
}
