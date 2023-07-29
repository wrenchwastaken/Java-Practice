import java.util.*;
class arrayx
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter Element into Array");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Contents Of Array");
        for(int i=0;i<num;i++)
        {
            System.out.println(arr[i]+"\t");
        }
        sc.close();
    }
}