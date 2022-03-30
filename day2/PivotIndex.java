package day2;

public class PivotIndex {
    public static void main(String[] args) {
        int []nums = {1,7,3,6,5,6};
        System.out.println(pivot(nums));
    }

    private static int pivot(int[] nums) {
        int total=0;
        for(int n: nums){
            total+=n;
        }
        int left=0;


        for(int i=0;i<nums.length;i++){
            if(left == (total - nums[i])){
                return i;
            }
            else{
                left=left+nums[i];
                total -= nums[i];
            }

        }
        return -1;
    }
}
