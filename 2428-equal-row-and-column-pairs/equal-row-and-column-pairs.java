class Solution 
{
    public int equalPairs(int[][] grid) 
    {
        int r=grid.length;
        int c=grid[0].length;

        ArrayList<List<Integer>> row=new ArrayList<>();
        ArrayList<List<Integer>> col=new ArrayList<>();


    for(int i=0;i<grid.length;i++)
    {
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<grid[0].length;j++)
        {
            ans.add(grid[i][j]);
        }
        row.add(ans);
    }
        for(int i=0;i<grid[0].length;i++)
        {
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<grid.length;j++)
            {
                ans.add(grid[j][i]);
            }
            col.add(ans);
        }
        int count=0;
      for(int i=0;i<row.size();i++)
      {
        for(int j=0;j<col.size();j++)
        {
            if(row.get(i).equals(col.get(j)))
            {
                count++;
            }
        }
      }
      return count;
    }
}