// you can also use imports, for example:
import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max=0;int max_slice=0;
        int maxim = Arrays.stream(A).max().getAsInt();
        if(A.length==1){
            return A[0];
        }
        for(int i=0;i<A.length;i++){
            max=Math.max(0,A[i]+max);
            max_slice=Math.max(max_slice,max);
            if(max==0 & maxim<0 & A.length>2){
                return Math.max(maxim,A[i]);
            }
            if(max==0 & maxim<0 & A.length==2){
                return maxim;
            }
        }
        return max_slice;
    }
}