import java.util.*;
public class recursion4
{
public static int calcfactorial(int n)
    {
    if(n==1||n==0)
    {
        return 1;
    }
    int m=calcfactorial(n-1);
    int fact_n=n*m;
    return fact_n;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The No. Natural Numbers:");
        int n=sc.nextInt();
        int ans=calcfactorial(n);
        System.out.println(ans);
        sc.close();
    }
}
