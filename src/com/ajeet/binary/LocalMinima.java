package com.ajeet.binary;

public class LocalMinima {

    public static int localMinima(int[] arr){
        int low= 0;
        int high= arr.length-1;
        int count  = -1;
        while(low<=high){
          int mid = low+(high-low)/2;
          if((mid==0 || arr[mid]>arr[mid-1]) && (mid==arr.length-1 || arr[mid]<arr[mid+1])){
              return arr[mid];

          }else if(mid==0 || arr[mid]<arr[mid-1]){
              low = mid-1;
          }else{
              high = mid+1;
          }

        }
        if(count == -1){

        }

        return count;
    }
    public static void main(String[] args) {
        int[] p = {3,6,1,0,9,15,8};
        System.out.println(localMinima(p));

    }
}
