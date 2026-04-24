 class myThread implements Runnable 
{
    public void run()
    {
        //System.out.println("Hello");
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {}
        }
    }
}

public class p6 
{
    public static void main(String[] args) 
    {
        myThread task=new myThread();
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();
    }
}
