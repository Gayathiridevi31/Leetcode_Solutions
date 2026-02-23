class Solution {
    private int[] count;
    private int[] indexes;
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        count=new int[n];
        indexes=new int[n];
        for(int i=0;i<n;i++)
        {
            indexes[i]=i;
        }
        mergesort(nums,0,n-1);
         List<Integer> result = new ArrayList<>();
        for (int c : count) {
            result.add(c);
        }
        return result;
      
    }
    private void mergesort(int[] num,int left,int right)
    {
        if(left>=right)return;
        int mid=left+(right-left)/2;
        mergesort(num,left,mid);
        mergesort(num,mid+1,right);
        merge(num,left,mid,right);
    }
   private void merge(int[] num, int left, int mid, int right)
{
    int[] temp = new int[right - left + 1];
    int i = left, j = mid + 1, k = 0;
    int rightcount = 0;

    while (i <= mid && j <= right)
    {
        if (num[indexes[j]] < num[indexes[i]])
        {
            temp[k++] = indexes[j++];
            rightcount++;
        }
        else
        {
            count[indexes[i]] += rightcount;
            temp[k++] = indexes[i++];
        }
    }
    while (i <= mid)
    {
        count[indexes[i]] += rightcount;
        temp[k++] = indexes[i++];
    }
    while (j <= right)
    {
        temp[k++] = indexes[j++];
    }
    for (int p = 0; p < temp.length; p++)
    {
        indexes[left + p] = temp[p];
    }
}
    }
