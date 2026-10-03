class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {

        HashMap<Integer,Integer> map=new HashMap<>();
        int temp[]=new int[k];

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
        for(int i=0;i<temp.length;i++)
        {
            int max=0;int key=0;
       for(Map.Entry<Integer,Integer> entry:map.entrySet())
       {
        if(entry.getValue()>max)
        {
            max=entry.getValue();
            key=entry.getKey();

        }
       
       }
        temp[i]=key;
        map.remove(key);
       }
       return temp;
    }
}