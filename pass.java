import java.util.*;
class pass
{
    public static void main(String[] args) 
    {
     int marks;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Marks:");
     marks=sc.nextInt();
     if(marks>=60)
     {
       System.out.println("You Passed:");
     } 
     else
     {
        System.out.println("You Have Failed");
     }
     sc.close();
    }
}