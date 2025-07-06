package nro;

import java.util.Vector;
import nro.Session_ME;
import nro.Message;

final class nr_dp implements Runnable {

   private final Vector a;
   private Session_ME b;


   public nr_dp(Session_ME var1) {
      this.b = var1;
      this.a = new Vector();
   }

   public final void a(Message var1) {
      this.a.addElement(var1);
   }

   public final void run() {
      while(this.b.d) {
         try {
            if(this.b.i) {
               while(this.a.size() > 0) {
                  Message var1 = (Message)this.a.elementAt(0);
                  this.a.removeElementAt(0);
                  Session_ME.a(this.b, var1);
               }
            }

            try {
               Thread.sleep(10L);
            } catch (Exception var2) {
               ;
            }
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

   }

   static Vector a(nr_dp var0) {
      return var0.a;
   }
}
