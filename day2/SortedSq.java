package day2;

import java.util.Arrays;

public class SortedSq {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        System.out.println(Arrays.toString( sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int T = j;
        int arr[] = new int[nums.length];


        while(0<=T){
            if((nums[i]*nums[i]) > (nums[j]*nums[j]) ){
                arr[T--] = (nums[i]*nums[i]);
                i++;
            }
            if((nums[i]*nums[i]) < (nums[j]*nums[j]) ){
                arr[T--] = (nums[j]*nums[j]);
                j--;
            }
            if((nums[i]*nums[i]) == (nums[j]*nums[j]) ){
                arr[T--] = (nums[i]*nums[i]);
                i++;
            }

        }
        return arr;

    }
}
