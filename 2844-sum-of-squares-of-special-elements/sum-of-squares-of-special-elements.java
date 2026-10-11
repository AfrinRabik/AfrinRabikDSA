class Solution 
{
    public int sumOfSquares(int[] nums) 
    {
        int n=nums.length;int sum=0;int product=1;
        for(int i=0;i<nums.length;i++)
        {
            if(n%(i+1)==0)
            {
                product=nums[i]*nums[i];
                sum+=product;
            }
        }   
        return sum; 
    }
}