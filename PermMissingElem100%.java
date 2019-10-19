// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        Arrays.sort(A);int x=0;int res=0;
        if(A.length==0){
            return 1;
        }
        if(A.length==1 & A[A.length-1]!=1){
            return A[A.length-1]-1;
        }
        if(A.length==1 & A[A.length-1]==1){
            return A[A.length-1]+1;
        }
        if(A.length==2 & A[A.length-2]!=1){
            res= A[A.length-1]-2 ;
        }
        if(A.length==2 & A[A.length-2]==1){
            res= A[A.length-1]+1;
        }
        for(int i=0;i<A.length-1;i++){
            if(A[i+1]-A[i]==1 & A.length!=1 & A.length!=2){
                x++;
            }
            if(A[i+1]-A[i]!=1){
                res=A[i]+1;
            }
        }if(x==A.length-1){
            res=A[A.length-1]+1;
        }
        if(x==A.length-1 & A[0]!=1){
            res=A[0]-1;
        }return res;
    }
}