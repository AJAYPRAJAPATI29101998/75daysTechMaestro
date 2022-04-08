package day3;

import java.util.*;

public class S3Sum {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
int [] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
 res = threeSum(nums);
        System.out.println(res);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int p1=0 ;
        int p2  , p3 = nums.length-1;

        for(int i = 0 ; i<nums.length;i++){
            List<Integer> list = new ArrayList<>();
            //p1=-(nums[i]);

            p2=p1+1;

            if(p2==p3){
                break;
            }
            while(p2<p3){
                if((nums[p2]+nums[p3])==-(nums[p1])){
                    list.add(nums[p1]);
                    list.add(nums[p2]);
                    list.add(nums[p3]);
                    Collections.sort(list);
                    res.add(list);
                    p3--;
                    break;
                }

                if(p2+1 == p3){
                    p1++;
                }
                p2++;
            }

        }



        return res;
        //-4 -1 -1 0 1 2
    }
}
