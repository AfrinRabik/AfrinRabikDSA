class Solution {
    public static void solve(int index,int[] nums,List<Integer> current,List<List<Integer>> result)
    {
        if(index==nums.length)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        solve(index+1,nums,current,result);
        current.remove(current.size()-1);
        while(index+1<nums.length&&nums[index]==nums[index+1])
        {
            index++;
        }
        solve(index+1,nums,current,result);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        solve(0,nums,current,result);
        return result;
    }
}