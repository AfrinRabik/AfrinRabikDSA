class Solution 
{
    public static void recurse(int[] candidates,int target,int start,List<List<Integer>> result,List<Integer> current)
    {
        
        if(target==0)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            if(candidates[i]>target)break;
            current.add(candidates[i]);
            recurse(candidates,target-candidates[i],i,result,current);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        recurse(candidates,target,0,result,current);
        return result;
    }
}