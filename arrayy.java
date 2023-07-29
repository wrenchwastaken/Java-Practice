import java.util.*;
class arrayy
{
    public static void main(String[] args) 
    {
     int m,n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Rows and Columns");
     m=sc.nextInt();
     n=sc.nextInt();
     int arr[][]=new int[m][n];
     System.out.println("Enter Elements Into Array");
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=sc.nextInt();
        }
     }
     System.out.println("Contexts of the Array");
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
     } 
     sc.close();  
    }
}