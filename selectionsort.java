public class selectionsort {
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={45,80,99,5,-78};
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    int temp = arr[smallest];//temp=arr[0]=arr[smallest]=45;
                    arr[smallest]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    print(arr);
    }
}
