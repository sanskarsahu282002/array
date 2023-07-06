import java.util.*;
public class linearsearch {
    public static int ls( int n[], int key)
    {
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int key=89;
        int n[]={34,56,78,90,8,972,89,66};
        int index=ls( n, key);// ls()function will return value of i in the variable indext;
        if(index==-1)
        {
            System.out.println("key not found");
        }
        else{
            System.out.println("key  found"+index);
        }


    }
}
