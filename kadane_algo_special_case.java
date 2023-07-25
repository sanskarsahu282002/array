public class kadane_algo_special_case {
    public static void kadane(int nums[])
    {
        int cur=0;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            
            cur=cur+nums[i];
            if(cur<0)
            {
                cur=0;
            }
            mx=Math.max(mx,cur);
        }
        System.out.println(mx);
    }
    public static void main(String[] args) {
        int nums[]={-1,-2,-3,-4};
        kadane(nums);

    }
}
