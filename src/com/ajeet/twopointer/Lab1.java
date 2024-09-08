package com.ajeet.twopointer;

public class Lab1 {

    public static int[] getPair(int [] A, int k){
        int i=0;
        int j = A.length-1;
        while(i<j){
            if(A[i]+A[j]==k){
                return new int[]{i,j};
            } else if (A[i]+A[j]<k) {
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
    int [] p = getPair(new int[]{1,2,3,4,5},3);
    for(int i =0;i<p.length;i++){
        System.out.println(p[i]);

    }
    }
}
