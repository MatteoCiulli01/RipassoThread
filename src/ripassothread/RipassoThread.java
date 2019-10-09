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
public class RipassoThread {

	public static void main(String[] args)
	{
	        Storage s = new Storage();
                Counter c = new Counter();
                c.start();
                Printer p = new Printer();
                p.start();
	}

}
    

