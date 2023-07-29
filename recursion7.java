public class recursion7
{
    public static int calcPower(int x,int n)
    {
        if(x==0)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        if(x%2==0)  //if x is even
        {
            return calcPower(x,n/2)*calcPower(x,n/2);
        }
        else  //if x is odd

        return calcPower(x,n/2)*calcPower(x,n/2)*x;
    }
    public static void main(String args[])
    {
        int x=2, n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}