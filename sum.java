import java.util.*;
class sum
{
    public static void main(String[] args) 
    {
     double area, r;
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Radius:");
         r=sc.nextInt();
    }
     area=3.14*r*r;
     System.out.println("Area  Of Circle:"+area);  
    }
}