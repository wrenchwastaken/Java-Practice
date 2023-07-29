class a extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("From a i="+i);
        }
    }
}
class b extends Thread
{
    public void run()
    {
        for (int j=1;j<=5;j++)
        {
            System.out.println("From b j="+j);
        }
    }
}
class c extends Thread
{
    public void run()
    {
        for (int k=1;k<=5;k++)
        {
            System.out.println("from c k="+k);
        }
        System.out.println("Exit from c");
    }
}
class threadtest
{
    public static void main(String[] args) {
        a ob1=new a();
        b ob2=new b();
        c ob3=new c();
        ob1.start();
        ob2.start();
        ob3.start();
    }
}