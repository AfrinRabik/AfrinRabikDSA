class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>2||entry.getValue()==2)
            {
                for(int i=0;i<=1;i++)
                {
                    list.add(entry.getKey());
                }
                
            }
            else if(entry.getValue()==1)
            {
                list.add(entry.getKey());
            }
           
        }
        
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        int size=list.size();
        Arrays.sort(nums,0,size);
        
        System.out.print(list);
        return size;
    }
}