class Solution {
    public int compress(char[] chars) {
        int i=0;
        int write=0;
        while(i<chars.length)
        {
            char current=chars[i];
            int count=0;
            while(i<chars.length && current==chars[i])
            {
                count++;
                i++;
            }
            chars[write++]=current;
            if(count>1)
            {
                String countstr=String.valueOf(count);
                for(char c:countstr.toCharArray())
                {
                    chars[write++]=c;
                }

            }
        }
        return write;
        
    }
}