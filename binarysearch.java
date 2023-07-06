public class binarysearch {
    public static int bs(int nums[],int key)
    {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==key)
            {
             return mid;
            }
            if(nums[mid]<key)
            {
                low=mid+1;
                high=nums.length-1;//right
            }
            else{
                low=0;
                high=mid-1;//left
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={8,11,13,89,90,99,101};
        int key=102;
        System.out.println("the index of key"+bs(nums,key));
    }
}
