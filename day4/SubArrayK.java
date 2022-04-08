package day4;

import java.util.*;
class SubArrayK {
    public int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans=0;
        int st=0;
        int check=0;
        for(int i=0;i<nums.length;i++){
            check+= nums[i];
            if(map.containsKey(check-k)){
                ans=ans+map.get(check-k);


            }
            if(map.containsKey(check)){
                st = map.get(check)+1;
            }else { st =1;}

            map.put(check,st);

        }
        return ans;
    }
}