package nro;

import nro.nr_aw;
import nro.Session_ME;
import nro.nr_ea;
import nro.nr_s;
import nro.Message;

final class nr_cb implements Runnable {

   private final String b;
   private int c;
   final Session_ME a;


   nr_cb(Session_ME var1, String var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void run() {
      Session_ME.m = false;
      (new Thread(new nr_ea(this))).start();
      this.a.e = true;
      this.a.d = true;

      try {
         int var3 = this.c;
         String var2 = this.b;
         Session_ME.a(this.a, new nr_aw(var2, var3));
         Session_ME.a(this.a, Session_ME.a(this.a).b());
         this.a.a = Session_ME.a(this.a).c();
         (new Thread(Session_ME.b(this.a))).start();
         this.a.f = new Thread(new nr_s(this.a));
         this.a.f.start();
         this.a.k = System.currentTimeMillis();
         Session_ME.a(this.a, new Message((byte)-27));
         this.a.e = false;
         this.a.b.onConnectOK(this.a.isMainSession);
      } catch (Exception var5) {
         try {
            Thread.sleep(500L);
         } catch (InterruptedException var4) {
            ;
         }

         if(!Session_ME.m) {
            ;
         }
      }
   }
}
