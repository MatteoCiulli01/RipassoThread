/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripassothread;

/**
 *
 * @author informatica
 */
public class Counter extends Thread{
   
   Storage s;
  
   Counter(Storage st)
   {
       s=st;
        new Thread(this, "Contatore").start(); 
   }
    public void run() 
    {
       for(int i=0; i < 5; i++)  
       s.setValue(i);
    }
}
