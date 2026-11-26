class Solution 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        ArrayList<List<Integer>> result=new ArrayList<>();
        int arr[]=Arrays.stream(nums1).filter(num->Arrays.stream(nums2).noneMatch(x->x==num)).toArray();
        List<Integer> ans=new ArrayList<>();
            HashSet<Integer> set1=new HashSet<>();
          for(int x:arr)
        {
            set1.add(x);
        }
        for(int x:set1)
        {
            ans.add(x);
        }
        result.add(ans);
        List<Integer> ans2=new ArrayList<>();
        int arr2[]=Arrays.stream(nums2).filter(num->Arrays.stream(nums1).noneMatch(x->x==num)).toArray();
    
        HashSet<Integer> set2=new HashSet<>();
      
        for(int x:arr2)
        {
            set2.add(x);
        }
             for(int x:set2)
        {
            ans2.add(x);
        }
        result.add(ans2);
      return result;
    }
}