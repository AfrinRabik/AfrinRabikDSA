class Solution 
{
    public static int binarySearch(int nums[],int low,int high,int target)
    {
        if(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) return binarySearch(nums,low,mid-1,target);
            else return binarySearch(nums,mid+1,high,target);
            
        }
        return low;
    }
    public int searchInsert(int[] nums, int target) 
    {
        int n=nums.length;
        int result=binarySearch(nums,0,n-1,target);
        return result;
    }
}