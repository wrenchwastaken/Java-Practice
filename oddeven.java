import java.util.*;
class oddeven
{
    public static void main(String[] args) 
    {
     int a;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number:");
     a=sc.nextInt();
      if(a%2==0)
      {
        System.out.println("The Number is Even");
      }
      else
      {
       System.out.println("The Number is Odd");
      }
      sc.close(); 
    }
}