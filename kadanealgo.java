public class kadanealgo {
    public static void kadane(int arr[])
    {
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            curr=curr+arr[i];
            if(curr<0)
            {
                curr=0;
            }
            maxsum=Math.max(maxsum,curr);
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    kadane(arr);
    }
}
