class Solution {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int x=0;int y=0;int temp=0;
        for(int i=0;i <A.length;i++)
        {
            if(x<K)
            {
                 x=x+A[i];
                 y++;
            }
            if(x>=K)
            {
                
               temp++;x=0;y=0;
            }
            
        }return temp;
    }
}