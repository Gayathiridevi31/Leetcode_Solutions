class Solution {
    static String expand(String str,int left,int right)
    {
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right))
        {
            left--;
            right++;
        }
        return str.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        String longer="";
        for(int i=0;i<s.length();i++)
        {
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);
            String result=odd.length()>even.length() ? odd :even;
            if(result.length()>longer.length())
            {
                longer=result;
            }
        }
        return longer;

        
    }
}