class Solution {
    public String mergeAlternately(String word1, String word2) {
        char ch[]=new char[word1.length()+word2.length()];
        int index1=0;
        int index2=0;
        if(word1.length()==word2.length())
        {
            for(int i=0;i<ch.length;i++)
            {
               if(i%2==0)
               {
                ch[i]=word1.charAt(index1++);
               }
               else 
               {
                ch[i]=word2.charAt(index2++);
               }
            }
        }
        if(word1.length()<word2.length())
        {
           for(int i=0;i<ch.length;i++)
           {
             if(i%2==0&&index1<word1.length())
             {
                ch[i]=word1.charAt(index1++);
             }
             else if(index2<word2.length())
             {
               
                ch[i]=word2.charAt(index2++);
                
             }
             
           }
        }
        if(word2.length()<word1.length())
        {
            for(int i=0;i<ch.length;i++)
            {
                if(i%2==0&&index1<word1.length())
             {
                ch[i]=word1.charAt(index1++);
             }
             else if(index2<word2.length())
             {
                   
                ch[i]=word2.charAt(index2++);
                
             }
             else if(index1 < word1.length())
{
    ch[i] = word1.charAt(index1++);
}
            }
        }
       return new String(ch);
    }
}