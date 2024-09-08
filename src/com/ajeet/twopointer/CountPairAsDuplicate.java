package com.ajeet.twopointer;

public class CountPairAsDuplicate {
    public static int countPairs(int[] nums,int k) {
        int count = 0;
        int  i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                int counti = 1;
                int countj = 1;
                while (i < j && nums[i] == nums[i + 1]) {
                    counti++;
                    i++;
                }
                while (i < j && nums[j] == nums[j - 1]) {
                    countj++;
                    j--;
                }
                count = counti * countj;
                i++;
                j--;

            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 5, 5, 7, 7, 10, 10, 10, 15};
        int k = 13;
        System.out.println(countPairs(nums,k));
    }
}
