public class maxsumsubarray {
    public static void maxsum(int number[])
    {
        int currsum=0;
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            int start=i;
            for(int j=0;j<number.length;j++)
            {
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++)
                {
                    currsum+=number[k];
                }
                System.out.println(currsum);
                if(msum<currsum)
                {
                    msum=currsum;
                }
            }
        }
        System.out.println(msum);
    }
    public static void main(String[] args) {
        int number[]={1,-3,5,-6,7};
        maxsum(number);

    }
}
