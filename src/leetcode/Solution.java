package leetcode;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
        public int minArray(int[] numbers) {
            int index = numbers.length-1;
            int[] co = new int[numbers.length];
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1])
                    index = i;
            }
            if (index == numbers.length-1) {
                return numbers[0];
            }
           /* else if(index == 0){
                return numbers[numbers.length-1];
            }*/else{

            System.arraycopy(numbers,0,co,numbers.length-index-1,index+1);
            System.arraycopy(numbers,index+1,co,0, numbers.length-index-1);
            System.out.println(Arrays.toString(co));

            return co[0];
            }
        }
    public static void main(String[] args) {
        int[] a = {1,3};
        System.out.println(new Solution().minArray(a));
//        System.out.println(Integer.MAX_VALUE);



    }
}