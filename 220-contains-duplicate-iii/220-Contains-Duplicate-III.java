class Solution 
{
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) 
    {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            
                if(left!=right&&(Math.abs(left-right)<=indexDiff)&&(Math.abs(nums[left]-nums[right])<=valueDiff))
                {
                    return true;
                }
               
            
             left++;
                right--;
        }
        
        return false;
    }
}