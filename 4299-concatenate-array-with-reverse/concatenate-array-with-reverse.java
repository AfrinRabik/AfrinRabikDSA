class Solution 
{
    public int[] concatWithReverse(int[] nums) 
    {
        int temp[]=new int[nums.length*2];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            temp[index++]=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            temp[index++]=nums[i];
        }
        return temp;
    }
}