package com.ajeet.binary;

public class FindSqrtusingBinary {

    public static int findSqrt(int x) {
        if(x==0 || x==1)
            return x;

        int left = 0;
        int right = x;
        int result = 0;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(mid*mid == x)
                result = mid;
            else if (mid*mid < x) {
                left = mid + 1;
                result = mid;

            }
            else {
                right = mid - 1;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSqrt(11));

    }
}
