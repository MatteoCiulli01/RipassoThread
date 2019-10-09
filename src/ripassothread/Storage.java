package ripassothread;

import java.util.concurrent.Semaphore;

class Storage
{
      int  i;
      static Semaphore semCon = new Semaphore(0);
      static Semaphore semProd = new Semaphore(1);
      public synchronized void setValue(int i)
      {
            this.i = i;
      }
      public synchronized int getValue()
      {
            return this.i;
      }
}
