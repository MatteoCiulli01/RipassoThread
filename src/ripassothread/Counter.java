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
   
    public void run() 
    {
        for(int i=0;i<500000;i++)
        {
        Storage.setValue(i);
        }
    }
}
