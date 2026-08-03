class Solution 
{
    public int[] kWeakestRows(int[][] mat, int k) 
    {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
             int c=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;

                }
                
            }
            map.put(i,c);
           
        }
         List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->a.getValue()-b.getValue());
        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=list.get(i).getKey();
            
        }
        
        
        return arr;
    }
}