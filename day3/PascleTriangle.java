package day3;
import java.util.*;
public class PascleTriangle {


    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> out1 = new ArrayList<>();
        out1.add(1);
        result.add(out1);

        if(numRows == 1){
            return result;
        }
        List<Integer> out2 = new ArrayList<>();
        out2.add(1);
        out2.add(1);
        result.add(out2);

        if(numRows==2){
            return result;
        }

        for(int i =2 ; i<numRows;i++){
            List<Integer> out = new ArrayList<>();
            out.add(1);
            for(int j = 1; j < i;j++){
                out.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));

            }
            out.add(1);
            result.add(out);
        }
        return result;
    }
}
