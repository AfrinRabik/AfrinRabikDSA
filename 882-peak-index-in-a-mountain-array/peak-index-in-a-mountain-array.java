class Solution 
{
    public int peakIndexInMountainArray(int[] arr) 
    {
        int max=Integer.MIN_VALUE;int index=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(arr[i],max);
           
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                index=i;
            }
        }
        return index;
    }
}