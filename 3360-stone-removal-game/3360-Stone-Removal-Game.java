class Solution 
{
    public boolean canAliceWin(int n) 
    {
        int i=0;int j=10;
      
        while(n>=j&&j>=0)
        {
           n=n-j;
            j--;
            i++;
        }
        // if(n==0)return true;
      
       return i%2==1;
        
        
        
    }
}