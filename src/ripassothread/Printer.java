package ripassothread;
import java.lang.Thread;
public class Printer extends Thread
{
    public void run()
    {
        System.out.println(Storage.getValue());
    }
}
