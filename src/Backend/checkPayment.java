/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import Frontend.Waiting;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author thisa
 */
public class checkPayment implements Runnable {
   private Thread t=null;
   Reserve resv = new Reserve();
   long aftertime = System.currentTimeMillis() + 900000;
   int id;
   double amount;
   
  public checkPayment(int id, double amount) {
      this.id = id;
      this.amount=amount;
   }
   
   public void run() {
      Frontend.Waiting wait = new Frontend.Waiting(id,amount);
      while(!Payment.isResvIdExists(id) && System.currentTimeMillis()<aftertime)
        {
            
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                Backend.EventLog.Write("Waiting Exception: " + e.toString());
            }
        }
      if(Payment.isResvIdExists(id)){
          resv.setId(id);
          resv.setReserve();
          wait.res=true;
          wait.dispose();
      }
      else
      {
          wait.dispose();
      }
      
   }
   
   public void start () {
      if (t == null) {
         t = new Thread(this);
         t.start ();
      }
        
   }
}