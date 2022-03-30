package day2;

public class MajorityElem {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {

        int count = 1;
        int res = 0;
        int ans=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i] == nums[res] ){
                count++;
            }
            else {
                count--;
            }

            if(count==0){
                res=i;
                count=1;
            }
        }

        for(int n : nums){
            if(nums[res] == n){
                ans++;
            }
        }
        if(ans>(nums.length/2)){
            return nums[res];
        }
        return -1;

    }
}
