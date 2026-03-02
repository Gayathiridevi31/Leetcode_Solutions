class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        if(s.length()!=t.length())
        {
            return false;

        }
        for(char c1:s.toCharArray())
        freq[c1-'a']++;
        for(char c1:t.toCharArray())
        freq[c1-'a']--;
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}