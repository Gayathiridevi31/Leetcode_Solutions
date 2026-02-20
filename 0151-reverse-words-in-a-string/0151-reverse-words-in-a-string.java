class Solution {
    public String reverseWords(String s) {
        Stack<String>st=new Stack<>();
        String word="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                if(!word.isEmpty())
                {
                    st.push(word);
                    word="";
                }
            }
            else{
                word+=ch;
            }
        }
            if(!word.isEmpty())
            {
                st.push(word);
            }
            String result="";
            while(!st.isEmpty())
            {
                result+=st.pop();
                if(!st.isEmpty())
                {
                    result+=" ";
                }
               
            }
        return result;
        
    }
}