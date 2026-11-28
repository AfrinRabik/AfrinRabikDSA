class Solution 
{
    public int numJewelsInStones(String jewels, String stones) 
    {
        char ch[]=jewels.toCharArray();int c=0;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<stones.length();j++){
            if(ch[i]==stones.charAt(j))
            {
                c++;
            }
        }
        }
        return c;
    }
}