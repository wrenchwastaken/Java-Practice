import java.util.*;
class firstdigit
{
    public static void main(String args[])
    {
       int num, firstdig;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Digit Number:");
        num=sc.nextInt();
        firstdig=num/100;
        System.out.println("The First Digit:"+firstdig);
        sc.close();
    }
}