package day4;

import java.util.*;
class NextPermutation {
    public void nextPermutation(int[] nums) {
        //9889880 1232144322 1232212344 1232144 1232414
        int idx = -1;
        int min =0;
        for(int i = nums.length-1;i>0;i--){

            if(nums[i-1]<nums[i]){

                idx=i-1;
                break;
            }

        }
        if(idx==-1){
            Arrays.sort(nums);
        }
        else{
            int count=idx+1;
            int max=nums[count];
            int pointer = count;

            while(count<nums.length){
                if(nums[count]<=max && nums[count]>nums[idx]){
                    max = nums[count];
                    pointer = count;
                }
                count++;
            }
            int temp = nums[idx];
            nums[idx] = max;
            nums[pointer] = temp;
            System.out.print(Arrays.toString(nums));
            Arrays.sort(nums,idx+1,nums.length);

        }

    }
}