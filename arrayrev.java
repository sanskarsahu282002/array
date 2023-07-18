import java.util.Scanner;
public class arrayrev
{
    public static void reversearray(int arr[])
    {
        int first=0,last=arr.length-1;
        while(first<last)
        {
            
           int temp=arr[last];
           arr [last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
        
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        reversearray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
