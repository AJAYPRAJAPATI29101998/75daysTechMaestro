package day1;

public class PlusOne {


    public int[] plusOne(int[] digits) {

        int len = digits.length-1;
        while(0<=len){
            if(digits[len]+1 < 10){
                digits[len]=digits[len]+1;
                return digits;
            }
            else{
                digits[len] = 0;
                len--;
            }
        }

        int []arr = new int[digits.length+1];
        arr[0]=1;
        return arr;



    }

}
