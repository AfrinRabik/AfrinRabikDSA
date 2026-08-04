class Solution {
    public static void solve(int nums[],List<List<Integer>> result,int index)
    {
        if(index==nums.length)
        {
           List<Integer> temp=new ArrayList<>();
           for(int num:nums)
           {
            temp.add(num);
           }
           result.add(temp);
           return;
        }
        for(int i=index;i<nums.length;i++)
        {
            //swapping
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;

            solve(nums,result,index+1);

            //backtrack
            temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;

        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        
        solve(nums,result,0);
        return result;
    }
}