package day1;

class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int pointer1 = 0 , pointer2=0;

        while (pointer2<len){
            if(nums[pointer2] == 0){
                pointer2++;
            }
            else if(nums[pointer2]!=0){
                if(pointer1==pointer2){
                    pointer1++;
                    pointer2++;
                }
                else{
                    nums[pointer1] = nums[pointer2];
                    nums[pointer2] = 0;
                    pointer1++;
                    pointer2++;
                }

            }
        }
    }

}
