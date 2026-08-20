class Solution 
{
    public double minPrice(int[] prices, int[] discounts) 
    {
        
        Arrays.sort(prices);
        Arrays.sort(discounts);double r=0.000d;int index=prices.length-1;double sum=0.00d;
        int i=prices.length-1;
        int j=discounts.length-1;
      while(i>=0&&j>=0)
      {
            r=prices[i]*(100-discounts[j])/100.0;
            sum+=r;
            j--;
            i--;
        //  min=Math.min(min,r);
        }
        while(i>=0)
        {
            sum+=prices[i];
            i--;
        }
        
        
        
        return sum;
    }
}