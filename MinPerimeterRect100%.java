// you can also use imports, for example:
import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class Solution 
{
    public int solution(int N) 
	{
        // write your code in Java SE 
        int y=0;int z=0;int result=0;
        if(N==1)
		{
            return 4;
        }
		//check if prime number
        for (int j = 2; j < Math.sqrt(N); j++) 
        {  
           if (N % j != 0) 
            {
				return 2*(N+1);
            }
            if(N%j == 0)
			{
               for(int i=1;i<=N;i++)
				{
					if((N%i==0) & (i*i >= N | i == N))
					{
						y = i;
						z=N/y;
						return 2*(y+z);
					}
				} 
			}
        }
        return result;
    }
}