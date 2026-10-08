class Solution 
{
    public String reverseWords(String s) 
    {
       
        String str[]=s.trim().split("\\s+");
       
        int left=0;
        int right=str.length-1;
        while(left<right)
        {
            String temp=str[right];
            str[right]=str[left];
            str[left]=temp;
            left++;
            right--;
        }
      String res="";
     for(int i=0;i<str.length;i++)
     {
        if(i<str.length-1)
        {
        res+=str[i]+" ";
        }
       else
        {
            res+=str[i];
        }
     }
        return res;
    }
}