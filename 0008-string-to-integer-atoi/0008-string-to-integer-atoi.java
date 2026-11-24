class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        
        // 1. Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // 2. Check sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // 3. Convert digits
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            
            // 4. Handle overflow
            if (num * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (num * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }
        
        return (int)(num * sign);
        
    }
}