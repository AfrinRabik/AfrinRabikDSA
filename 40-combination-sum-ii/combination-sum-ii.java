class Solution 

{
    public static void backtrack(int[] candidates,int target,int j,List<List<Integer>> result,List<Integer> current)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=j;i<candidates.length;i++)
        {
            if(candidates[i]>target)break;
             if(i > j && candidates[i] == candidates[i-1])
        continue;

            current.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i+1,result,current);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
       Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        backtrack(candidates,target,0,result,current);
        return result;
    }
}