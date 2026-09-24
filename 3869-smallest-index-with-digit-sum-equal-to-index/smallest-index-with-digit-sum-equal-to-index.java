class Solution 
{
    public int smallestIndex(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            if(i==nums[i]&&i<=9)
            {
                return i;
            }
            else if(nums[i]>9)
            {
                int r=0;
                int sum=0;
                while(nums[i]!=0)
                {
                    r=nums[i]%10;
                    sum+=r;
                    nums[i]=nums[i]/10;

                }
                if(sum==i)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}