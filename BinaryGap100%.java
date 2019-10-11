class Solution 
{
    public int solution(int N) 
    {
        
        // write your code in Java SE 8
        String r=Integer.toBinaryString(N);int i = 0;int temp=0;
        char [] c= r.toCharArray();int x=0;int y=0;
        while(i < c.length-1)
        {
            if(c[i]=='1')
                {
                    i++;
                      
                    while((c[i]=='0') & (i != c.length-1))
                    {
                        x++;
                        i++;
                          
                        if(c[i]=='1')
                        {
                            temp = x;
                            if(temp>y)
                            {
                                y=temp;
                                
                            }x=0;
                             temp=0;
                        }
                    }
                }
        
        }return y;
    }
}