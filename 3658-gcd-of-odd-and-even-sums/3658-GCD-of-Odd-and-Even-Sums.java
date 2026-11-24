class Solution 
{
    public int gcdOfOddEvenSums(int n) 
    {

        int sum1=0;int sum2=0;
        int count=0;
         for(int i=1;i<=n;i++)
            {
                sum1+=2*i-1;
                sum2+=2*i;
            }
        
        int result=gcd(sum1,sum2);
        return result;
    }
    static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}