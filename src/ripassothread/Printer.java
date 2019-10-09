package ripassothread;
import java.lang.Thread;
public class Printer implements Runnable
{
    Storage s;
   Printer(Storage st)
   {
       s=st;
       new Thread(this, "Printer").start(); 
   }
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println(s.getValue());

    }
}
