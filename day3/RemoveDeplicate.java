package day3;

import java.util.*;

public class RemoveDeplicate {


    public static int removeDuplicates(int[] nums) {


        int p1=1;

        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[p1] = nums[i];
                p1++;
            }
        }
        return p1;
    }

}
