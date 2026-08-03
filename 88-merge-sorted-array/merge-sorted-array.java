class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
  
     int temp[]=new int[m+n];
        int index=0;
     for(int i=0;i<m;i++)
     {
        temp[index++]=nums1[i];
        
     }  
     for(int i=0;i<n;i++)
     {
        temp[index++]=nums2[i];
     }  Arrays.sort(temp);
     
    for(int i=0;i<m+n;i++)
    {
        nums1[i]=temp[i];
    }
   
    for(int i=0;i<nums1.length;i++)
    {
System.out.print(nums1[i]+" ");
    }

}
}