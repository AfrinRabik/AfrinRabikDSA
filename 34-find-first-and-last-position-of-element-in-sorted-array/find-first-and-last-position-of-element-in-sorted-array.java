class Solution 
{
    public static int binarySearchfirst(int nums[],int low,int high,int target)
    {
            if(low>high) return -1;
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                int left=binarySearchfirst(nums,low,mid-1,target);
            return (left!=-1)?left:mid;
            }
            else if(nums[mid]>target) 
            {
                return binarySearchfirst(nums,low,mid-1,target);
            }
            else 
            {
                return binarySearchfirst(nums,mid+1,high,target);
            }
        
    }
    public static int binarySearchLast(int nums[],int low,int high,int target)
    {
            if(low>high)return -1;
            int mid=low+(high-low)/2;
            if(nums[mid]==target) 
            {
                int right=binarySearchLast(nums,mid+1,high,target);
            
            return (right!=-1)?right:mid;
            }
            else if(nums[mid]>target)
            {
                return binarySearchLast(nums,low,mid-1,target);
            }
            else
            {
                 return binarySearchLast(nums,mid+1,high,target);
            }
        
    }
    
    public int[] searchRange(int[] nums, int target) 
    {
        int n=nums.length;
        int res[]=new int[2];
        res[0]=binarySearchfirst(nums,0,n-1,target);
        res[1]=binarySearchLast(nums,0,n-1,target);
        return res;
    }
}