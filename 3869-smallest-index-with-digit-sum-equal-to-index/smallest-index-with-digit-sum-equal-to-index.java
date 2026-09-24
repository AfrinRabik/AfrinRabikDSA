class Solution 
{
    public int smallestIndex(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        { 
            int temp=nums[i];
            int r=0;
            int sum=0;
            while(temp!=0)
            {
                r=temp%10;
                sum+=r;
                temp=temp/10;

            }
             if(sum==i)
             {
                return i;
             }
            
        }
        return -1;
    }
}