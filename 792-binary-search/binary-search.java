class Solution {
    static int binarySearch(int nums[],int low,int high,int target)
    {
        if(high>=low)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]<target)
            {
                return binarySearch(nums,mid+1,high,target);
            }
            return binarySearch(nums,low,mid-1,target);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int res=binarySearch(nums,0,n-1,target);
        if(res!=-1) return res;
        return -1;
        
     
    }
}