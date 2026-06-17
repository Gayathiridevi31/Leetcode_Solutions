class Solution {
    public String minWindow(String s, String t) {
        int[] count=new int[128];
        for(char c:t.toCharArray())
        {
            count[c]++;
        }
        int start=0;
        int left=0;
        int min=Integer.MAX_VALUE;
        int need=t.length();
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(count[ch]>0)
            {
                need--;
            }
            count[ch]--;
            while(need==0)
            {
                if(right-left+1<min)
                {
                    min=right-left+1;
                    start=left;
                }
                char remove=s.charAt(left);
                count[remove]++;
                if(count[remove]>0)
                {
                    need++;
                }
                left++;
            }
        }
        if(min==Integer.MAX_VALUE)
        return "";
        else
        return s.substring(start,min+start);
        
    }
}