class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0,count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0)
            rem=rem+k;
            if(rem==0)
            count++;
            if(hm.get(rem)!=null)
            {
                count+=hm.get(rem);
            }
            Integer prev=hm.get(rem);
            if(prev==null)
            {
                hm.put(rem,1);
            }
            else{
                hm.put(rem,prev+1);
            }
        }
        return count;
        
    }
}