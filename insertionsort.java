public class insertionsort {
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={-89,-90,-5,90,-56};
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int j=i-1;
            while(j>=0 &&arr[j]<curr )
            {
            arr[j+1]=arr[j];
            j--;
            }
            arr[j+1]=curr;
        }
        print(arr);
    }
}
