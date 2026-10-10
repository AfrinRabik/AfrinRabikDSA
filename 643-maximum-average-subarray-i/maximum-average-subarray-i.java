class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
         int left=0;double sum=0;double avg=0;
        double max=-Double.MAX_VALUE;
        if(nums.length==1)
        {
            return (double)nums[0];
        }
        else
        {
            for(int right=0;right<nums.length;right++)
            {
                sum+=nums[right];
                if(right-left+1>k)
                {
                    sum-=nums[left];
                    left++;
                }
                if(right-left+1==k)
                {
                    avg=sum/k;
                    max=(double)Math.max(avg,max);
                }
            }
        }
        return max;
    }
}