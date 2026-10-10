class Solution 
{
    public int largestAltitude(int[] gain)
    {
    //    int current=0;
    //    int maximum=0;
    //    for(int i=0;i<gain.length;i++)
    //    {
    //     current+=gain[i];
    //     maximum=Math.max(current,maximum);
    //    } 
    //    return maximum;
    int maximum = Integer.MIN_VALUE;
        int add = 0;
        List<Integer> list = new ArrayList<>();
        
        list.add(0); // starting altitude

        for(int i = 0; i < gain.length; i++) // FIXED: start from 0
        {
           add = gain[i] + list.get(i); // FIXED: use correct previous index
           list.add(add);
        }

        for(int i = 0; i < list.size(); i++)
        {
            maximum = Math.max(maximum, list.get(i)); // FIXED: correct Math.max
        }

        return maximum;
    }
}