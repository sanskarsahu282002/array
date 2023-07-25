public class prefixsum {
    public static void maxsum(int nums[])
    {
        int cur=0;
        int mxsum=Integer.MIN_VALUE;
        int prefix[]= new int [nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int start=i;
            cur=0;
            for(int j=0;j<nums.length;j++)
            {
                int end=j;
                cur=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(mxsum<cur)
                {
                    mxsum=cur;
                }

            }
        }
        System.out.println(mxsum);
    }
    public static void main(String[] args) {
        int nums[]={2,4,8,20};
        maxsum(nums);

    }
}
