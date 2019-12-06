// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int i=0;int x=0;int result=0;int value=0;int ind=0;int j=0;
        if(A.length==1){
            return 0;
        }
        for(;i<A.length-1;i++){
           if(x==0){
                x++;
                value=A[i];
            }
            if(value!=A[i]){
                x--;
                value=A[i+1];
            }else
            {
                x++;
            }
            if(x>0){
               result=value; 
            }
            
        }for(;j<A.length;j++)
        {
            if(A[j]==result)
            {
                ind++;
            }
            if(ind>A.length/2)
            {
                return j;
            }
            
        }
        return -1;
    }
}