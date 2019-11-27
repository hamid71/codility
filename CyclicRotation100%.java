// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[]B=new int [A.length];int i=0;
        if(A.length==1 | A.length==0){
            return A;
        }
        if(K>A.length){
            K=K%A.length;
        }
        int j=K;
        while(i<A.length & K!=i){
            B[i]=B[i]+A[A.length-(K-i)];
            i++;
        }
        while(j<A.length){
            B[j]=B[j]+A[j-K];
            j++;
        }
        return B;
    }
}