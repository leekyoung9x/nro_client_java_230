package nro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import nro.nr_aw;
import nro.nr_bo;
import nro.nr_cb;
import nro.nr_dp;
import nro.Message;
import nro.ISession;
import nro.IMessageHandler;

public final class Session_ME implements ISession {

   private static Session_ME n = new Session_ME();
   private static Session_ME o = new Session_ME();
   private DataOutputStream p;
   public DataInputStream a;
   public IMessageHandler b;
   public boolean isMainSession = true;
   private nr_aw q;
   public boolean d;
   public boolean e;
   private final nr_dp r = new nr_dp(this);
   private Thread s;
   public Thread f;
   public int g;
   public int h;
   boolean i;
   public byte[] j = null;
   private byte t;
   private byte u;
   long k;
   public String l = "";
   public static boolean m;
   private static int v;


   public static Session_ME gI() {
      return n;
   }

   public static Session_ME gI2() {
      return o;
   }

   public final void c() {
      nr_dp.a(this.r).removeAllElements();
   }

   public final boolean d() {
      return this.d;
   }

   public final void setHandler(IMessageHandler var1) {
      this.b = var1;
   }

   public final void a(String var1, int var2) {
      System.out.println("Connect to : ip = " + var1 + "-- port = " + var2);
      if(!this.d && !this.e) {
         if(this.isMainSession) {
            nr_bo.s = -1;
         }

         this.i = false;
         this.q = null;
         this.s = new Thread(new nr_cb(this, var1, var2));
         this.s.start();
      }
   }

   public final void sendMessage(Message var1) {
      ++v;
      this.r.a(var1);
   }

   private synchronized void b(Message var1) {
      byte[] var2 = var1.getData();

      try {
         byte var5;
         if(this.i) {
            var5 = this.a(var1.command);
            this.p.writeByte(var5);
         } else {
            this.p.writeByte(var1.command);
         }

         // Ghi key bảo mật sau khi ghi command
         try {
            String key = "160D5A46-742D-47A8-8F13-9B7605D594CD"; // TODO: thay bằng key thực tế hoặc biến truyền vào
            byte[] keyBytes = key.getBytes("UTF-8");
            this.p.write(keyBytes.length);
            this.p.write(keyBytes);
         } catch (Exception e) {
            e.printStackTrace();
         }

         if(var2 != null) {
            int var6 = var2.length;
            if(this.i) {
               byte var3 = this.a((byte)(var6 >> 8));
               this.p.writeByte(var3);
               var5 = this.a((byte)var6);
               this.p.writeByte(var5);
            } else {
               this.p.writeShort(var6);
            }

            if(this.i) {
               for(int var7 = 0; var7 < var2.length; ++var7) {
                  var2[var7] = this.a(var2[var7]);
               }
            }

            this.p.write(var2);
            this.g += 5 + var2.length;
         } else {
            this.p.writeShort(0);
            this.g += 5;
         }

         this.p.flush();
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   private byte a(byte var1) {
      var1 = (byte)(this.j[this.u++] & 255 ^ var1 & 255);
      if(this.u >= this.j.length) {
         this.u = (byte)(this.u % this.j.length);
      }

      return var1;
   }

   public final void e() {
      this.f();
   }

   private void f() {
      this.j = null;
      this.t = 0;
      this.u = 0;

      try {
         this.d = false;
         this.e = false;
         if(this.q != null) {
            this.q.a();
            this.q = null;
         }

         if(this.p != null) {
            this.p.close();
            this.p = null;
         }

         if(this.a != null) {
            this.a.close();
            this.a = null;
         }

         this.f = null;
         if(this.isMainSession) {
            nr_bo.s = 0;
         }

         System.gc();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   static nr_aw a(Session_ME var0) {
      return var0.q;
   }

   static void a(Session_ME var0, nr_aw var1) {
      var0.q = var1;
   }

   static void a(Session_ME var0, DataOutputStream var1) {
      var0.p = var1;
   }

   static nr_dp b(Session_ME var0) {
      return var0.r;
   }

   static void a(Session_ME var0, Message var1) {
      var0.b(var1);
   }

   static void c(Session_ME var0) {
      var0.f();
   }

   static byte a(Session_ME var0, byte var1) {
      var1 = (byte)((var0 = var0).j[var0.t++] & 255 ^ var1 & 255);
      if(var0.t >= var0.j.length) {
         var0.t = (byte)(var0.t % var0.j.length);
      }

      return var1;
   }
}
