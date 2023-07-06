import java.util.Scanner;
public class array1
{
public static void main(String[] args)
 {
int marks[]= new int[50];  
//int num[]={1,2,3,4};
//String name[]={"sanskar","sahu"};
Scanner sc = new Scanner(System.in);
 marks[0]=sc.nextInt();
marks[1]=sc.nextInt();
marks[2]=sc.nextInt();

System.out.println("phy"+""+marks[0]);
System.out.println("chem"+marks[1]);
System.out.println("maths"+marks[2]);
int avg = (marks[0]+marks[1]+marks[2])/3;
System.out.println("avg is"+avg);
System.out.println("the length of array"+marks.length);

}
}