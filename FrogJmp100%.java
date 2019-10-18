class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int i=0; int s=0;
        i=(Y-X)/D;
        if((Y-X)%D==0){
            s=i;
        }
        if((Y-X)%D!=0){
            s=i+1;
        }return s;
    }
}