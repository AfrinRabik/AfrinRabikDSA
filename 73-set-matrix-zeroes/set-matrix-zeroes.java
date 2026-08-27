class Solution 
{
    public void setZeroes(int[][] matrix)
     {
        int n[]=new int[matrix.length];
        int m[]=new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    n[i]=1;
                    m[j]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            if(n[i]==1)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            if(m[i]==1)
            {
                for(int j=0;j<matrix.length;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    }
}