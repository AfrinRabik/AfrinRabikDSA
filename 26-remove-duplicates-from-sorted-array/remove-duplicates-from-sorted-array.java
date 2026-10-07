class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
       Integer arr[]=new Integer[set.size()];
       set.toArray(arr);
       for(int i=0;i<nums.length;i++)
       {
        nums[i]=0;
       }
       
       for(int i=0;i<arr.length;i++)
       {
        nums[i]=arr[i];
       }
        return set.size();
    }
}