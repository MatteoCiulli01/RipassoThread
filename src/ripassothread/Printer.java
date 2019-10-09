package ripassothread;
import java.lang.Thread;
public class Printer extends Thread
{
    Storage s;
    public void run()
    {
        System.out.println(s.getValue());
    }
}
