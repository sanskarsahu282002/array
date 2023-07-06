public class array2 {
    public static void update(int marks[])
    {
        int nonchangeble=20;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] ={1,2,3,4};
        int nonchangeble =56;
        update(marks);
        System.out.println(nonchangeble);
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]);
        }

    }
}
