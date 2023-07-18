public class sequentialsearch {
    public static void main(String[] args) {
        int key=1;
        int nums[]={2,5,3,6,1};
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==key)
            {
                System.out.println("found"+" "+i);
            }
            else
            {
                System.out.println("not found");
            }
        }
    }
}
