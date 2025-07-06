package nro;

import nro.Session_ME;
import nro.nr_cb;

final class nr_ea implements Runnable {

   private nr_cb a;


   nr_ea(nr_cb var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var3) {
         ;
      }

      nr_cb var1 = this.a;
      if(this.a.a.e) {
         try {
            var1 = this.a;
            Session_ME.a(this.a.a).a();
         } catch (Exception var2) {
            ;
         }

         Session_ME.m = true;
         var1 = this.a;
         this.a.a.e = false;
         var1 = this.a;
         this.a.a.d = false;
         var1 = this.a;
         var1 = this.a;
         this.a.a.b.onConnectionFail(this.a.a.isMainSession);
      }

   }
}
