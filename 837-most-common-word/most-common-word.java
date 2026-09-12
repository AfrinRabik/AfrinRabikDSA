class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(String word:banned)
        {
            set.add(word.toLowerCase());
        }
      paragraph=paragraph.replaceAll("[^a-zA-Z]"," ");
      paragraph=paragraph.toLowerCase();
      String arr[]=paragraph.split("\\s+");

      for(String word:arr)
      {
        if(!set.contains(word))
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
      }
      int maxval=Collections.max(map.values());
      String res="";
      for(Map.Entry<String,Integer> entry:map.entrySet())
      {
        if(entry.getValue()==maxval)
        {
            res=entry.getKey();
        }
      }
      return res;
    }
}