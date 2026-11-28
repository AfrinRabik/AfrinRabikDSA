class Solution 
{
    public int uniqueMorseRepresentations(String[] words) 
    {
        String dash[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        char alp[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String res="";
            char c[]=words[i].toCharArray();int index=0;
            for(int j=0;j<c.length;j++)
            {
                for(int k=0;k<alp.length;k++)
                {
                if(c[j]==alp[k])
                {
                    index=k;
                    break;
                }
                }
                for(int l=0;l<dash.length;l++)
                {
                    if(l==index)
                    {
                    res+=dash[l];
                    }
                }
            }
            list.add(res);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++)
        {
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        return map.size();
    }
}