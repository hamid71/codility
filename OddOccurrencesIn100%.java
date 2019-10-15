class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int i; 
        int res = 0; 
        for (i = 0; i < A.length; i++)  
        { 
            res = res ^ A[i]; 
        } 
        return res;
    }
}