package day4;

import java.util.*;

class MostWater {

    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,18,17,6};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int diff =0 , ans =0;
        for(int i=0;i<height.length;i++){

            diff  = Math.min(height[start] , height[end]) * ((height.length-1) - i);
            if(ans<diff){ans = diff;}

            if(start==end){break;}
            if(height[start]<height[end]){
                start++;

            }else{
                end--;
            }


        }
        return ans;
    }
}