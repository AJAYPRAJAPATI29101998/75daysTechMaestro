package day3;
import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6},{5,8},{10,15}};
  int ans[][] = merge(intervals);

        for(int o = 0;o<ans.length;o++){
            for(int x=0;x<2;x++){
                System.out.println(ans[o][x]);
            }
        }
       // System.out.println(n[0][0]);
        //        System.out.println(Arrays.toString(intervals) + " " +intervals[0][0] +" ");
//       for(int i = 0;i<intervals.length;i++){
//           for(int j=0;j<2;j++){
//               System.out.println(intervals[i][j]);
//           }
//           System.out.println();
//       }?\
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        } );
        int c0 = intervals[0][0],c1=intervals[0][1];
        List<int []> result = new ArrayList<>();
        int [] arr1 = new int[2];

        for(int i = 1;i<intervals.length;i++){
            int [] arr = new int[2];
            if(c1>=intervals[i][0]){
                c0 = Math.min(c0 , intervals[i][0]);
                c1 = Math.max(c1 , intervals[i][1]);

            }
            else{
                arr[0] = c0;
                arr[1] = c1;
                result.add(arr);
                c0 = intervals[i][0];
                c1 = intervals[i][1];
            }

        }
        arr1[0] = c0;
        arr1[1] = c1;
        result.add(arr1);
        System.out.println(result);

        return result.toArray(new int[result.size()][]);
    }
    }

