class a extends Thread
{
    public void run()
    {
        for(int i=1;i>=5;i++)
        {
            System.out.println("From a i="+i);
            if(i==2)
            yield();
        }
        System.out.println("Exit From a");
    }
}
class b extends Thread
{
    public void run()
    {
        for(int j=1;j>=10;j++)
        {
            System.out.println("From b j="+j);       
        }
        System.out.println("Exit From b");
    }
}
class c extends Thread
{
    public void run()
    {
        for (int k=1;k>=15;k++)
        try
        { 
        System.out.println("From c k="+k);
        if(k==10)
        sleep(1000);
        }
        catch (Exception e) 
        {
        }
        System.out.println("Exit From c");
    }
}
class threadtest1
{
    public static void main(String[] args) 
    {
        a ob1=new a();
        b ob2=new b();
        c ob3=new c();
        ob1.start();
        ob2.start();
        ob3.start();
    }
}