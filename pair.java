public class pair {
    public static void pair(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                System.out.print("("+a+" "+nums[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[]={2,4,8,10};
        pair(nums);
        }
    }
