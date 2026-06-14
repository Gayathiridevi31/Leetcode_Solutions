class Solution {
    public boolean checkGoodInteger(int n) {
        String str=String.valueOf(n);

        int sum=0;
        int square=0;
        for(char c:str.toCharArray())
        {
            int digit=c-'0';
            sum+=digit;
        }
        for(char ch:str.toCharArray())
        {
            int digit=ch-'0';
            square+=digit*digit;
        }
        int result=square-sum;
      return result>=50;
        
    }
}