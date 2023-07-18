public class q1ls {
    public static int q1(int arr[],int k)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,23};
        int k=9;
        System.out.println("the k is"+q1(arr,k));
    }
}
