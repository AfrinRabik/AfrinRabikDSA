class Solution 
{
    public boolean areOccurrencesEqual(String s) 
    {
      
      char[] ch=s.toCharArray();
      HashMap<Character,Integer> map=new HashMap<>();
      for(char c:ch)
      {
        map.put(c,map.getOrDefault(c,0)+1);
      }
       int count=-1;
    for(int val:map.values())
    {
     if(count==-1)
     {
        count=val;
     }
     else if(count!=val)
     {
        return false;
     }
    }
     return true;
    }
}