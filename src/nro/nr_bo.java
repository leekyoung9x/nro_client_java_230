package nro;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import main.GameMidlet;
import main.GameCanvas;
import nro.Rms;
import nro.mResources;
import nro.mScreen;
import nro.InfoDlg;
import nro.Session_ME;
import nro.Service;
import nro.Command;
import nro.mFont;
import nro.Res;
import nro.MyVector;
import nro.SplashScr;
import nro.mGraphics;
import nro.nr_eo;
import nro.Main;
import nro.GameScr;
import nro.nr_x;
import nro.IActionListener;

public final class nr_bo extends mScreen implements IActionListener {

   public static String[] a;
   public static String[] b;
   public static byte c;
   public static boolean[] d;
   public static short[] e;
   private static int u;
   public static boolean f;
   public static byte[] g;
   private Command[] v;
   private Command w;
   private int x;
   private static String y = "Suno:nrosuno.com:14445:0,0,0";
   private static String z = "Suno:nrosuno.com:14445:0,0,0";
   private static String A = "Suno:nrosuno.com:14445:0,0,0";
   private static String B = "Suno:nrosuno.com:14445:0,0,0";
   private static String C = "Suno:nrosuno.com:14445:0,0,0";
   private static String D = "Suno:nrosuno.com:14445:0,0,0";
   public static String h = z;
   public static boolean i;
   public static String j;
   public static boolean k;
   private static int E;
   public static int[] l = new int[3];
   public static int m;
   private static int F;
   public static boolean n;
   public static int o;
   public static int p;
   public static int q;
   public static boolean r = false;
   private static Command G;
   public static int s = -1;
   public static boolean t;


   public nr_bo() {
      System.getProperty("com.sonyericsson.imei");
      this.k();
      if(!GameCanvas.isTouch) {
         u = 0;
         this.l();
      }

      GameScr.a(-1, (int)-1);
      GameScr.j = 100;
      GameScr.k = 200;
      if(this.w == null) {
         this.w = new Command("Gọi hotline", this, 13, (Object)null);
         this.w.x = GameCanvas.z - 75;
         if(Main.typeClient == 1 && !GameCanvas.isTouch) {
            this.w.y = GameCanvas.A - 20;
         } else {
            this.w.y = 8;
         }
      }

      boolean var1 = false;
      if(false) {
         if(Main.typeClient == 1) {
            h = B;
         } else {
            h = A;
         }
      } else if(var1) {
         h = D;
         if(Main.typeClient == 1) {
            h = D;
         } else {
            h = C;
         }
      } else {
         h = z;
         if(Main.typeClient == 1) {
            h = z;
         } else {
            h = y;
         }
      }
   }

   private void k() {
      String var1;
      label59: {
         this.x = 0;
         if((var1 = Rms.c("acc")) == null) {
            if(Rms.b("userAo" + m) == null) {
               break label59;
            }
         } else if(var1.equals("") && Rms.b("userAo" + m) == null) {
            break label59;
         }

         this.x = 1;
      }

      this.v = new Command[mGraphics.zoomLevel > 1?3 + this.x:4 + this.x];
      int var2 = GameCanvas.C - 15 * this.v.length + 28;

      for(int var3 = 0; var3 < this.v.length; ++var3) {
         switch(var3) {
         case 0:
            this.v[0] = new Command("", this, 3, (Object)null);
            if(var1 == null) {
               this.v[0].caption = mResources.gc;
               if(Rms.b("userAo" + m) != null) {
                  this.v[0].caption = mResources.n;
               }
            } else if(var1.equals("")) {
               this.v[0].caption = mResources.gc;
               if(Rms.b("userAo" + m) != null) {
                  this.v[0].caption = mResources.n;
               }
            } else {
               this.v[0].caption = mResources.gd + ": " + var1;
               if(this.v[0].caption.length() > 23) {
                  this.v[0].caption = this.v[0].caption.substring(0, 23);
                  this.v[0].caption = this.v[0].caption + "...";
               }
            }
            break;
         case 1:
            if(this.x == 1) {
               this.v[1] = new Command("", this, 10100, (Object)null);
               this.v[1].caption = mResources.gc;
            } else {
               this.v[1] = new Command(mResources.P, this, 7, (Object)null);
            }
            break;
         case 2:
            if(this.x == 1) {
               this.v[2] = new Command(mResources.P, this, 7, (Object)null);
            } else {
               this.v[2] = new Command("", this, 17, (Object)null);
            }
            break;
         case 3:
            if(this.x == 1) {
               this.v[3] = new Command("", this, 17, (Object)null);
            } else {
               this.v[3] = new Command(mResources.bQ, this, 8, (Object)null);
            }
            break;
         case 4:
            this.v[4] = new Command(mResources.bQ, this, 8, (Object)null);
         }

         this.v[var3].y = var2;
         this.v[var3].setType();
         this.v[var3].x = (GameCanvas.z - this.v[var3].w) / 2;
         var2 += 30;
      }

   }

   public static void a() {
      a(h);
   }

   public static void a(String var0) {
      try {
         l = new int[3];
         String[] var5;
         mResources.a(Byte.parseByte((var5 = Res.a(var0.trim(), ",", 0))[var5.length - 2]));
         a = new String[var5.length - 2];
         b = new String[var5.length - 2];
         e = new short[var5.length - 2];
         g = new byte[var5.length - 2];
         d = new boolean[2];

         for(int var1 = 0; var1 < var5.length - 2; ++var1) {
            String[] var2 = Res.a(var5[var1].trim(), ":", 0);
            a[var1] = var2[0];
            b[var1] = var2[1];
            e[var1] = Short.parseShort(var2[2]);
            g[var1] = Byte.parseByte(var2[3].trim());
            ++l[g[var1]];
         }

         c = Byte.parseByte(var5[var5.length - 1]);
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();
         DataOutputStream var7 = new DataOutputStream(var6);

         try {
            var7.writeByte(mResources.fw);
            var7.writeByte(a.length);

            for(int var8 = 0; var8 < a.length; ++var8) {
               var7.writeUTF(a[var8]);
               Res.out("===> save IP " + a[var8]);
               var7.writeUTF(b[var8]);
               var7.writeShort(e[var8]);
               var7.writeByte(g[var8]);
            }

            var7.writeByte(c);
            Rms.a("NRlink", var6.toByteArray());
            var7.close();
            SplashScr.e();
         } catch (Exception var3) {
            var3.printStackTrace();
         }

         GameCanvas.g();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public final void a(mGraphics var1) {
      if(!t) {
         var1.a(0);
         var1.d(0, 0, GameCanvas.z, GameCanvas.A);
      } else {
         GameCanvas.b(var1);
      }

      mFont.s.a(var1, "v2.3.0(" + mGraphics.zoomLevel + ")", GameCanvas.z - 2, 17, 1, mFont.o);
      if(r && !t) {
         mFont.s.a(var1, j, GameCanvas.z - 2, 2, 1, mFont.o);
      } else if(Main.typeClient == 1 && !GameCanvas.isTouch) {
         mFont.s.a(var1, j, GameCanvas.z - 2, GameCanvas.A - 15, 1, mFont.o);
      } else {
         mFont.s.a(var1, j, GameCanvas.z - 2, 2, 1, mFont.o);
      }

      if(GameCanvas.J == null) {
         if(!t) {
            if(!n) {
               var1.drawImage(nr_x.j, GameCanvas.B, GameCanvas.C - 32, 3);
               if(r) {
                  if(G != null) {
                     G.paint(var1);
                  }

                  var1.e(0, 0, GameCanvas.z, GameCanvas.A);
                  mFont.c.drawString(var1, mResources.ay + o + "%", GameCanvas.z / 2, GameCanvas.C + 24, 2);
                  GameScr.a(GameScr.ah, GameScr.ai, GameScr.aj, (float)(GameCanvas.z / 2 - 50), (float)(GameCanvas.C + 45), 100, 100.0F, var1);
                  GameScr.a(GameScr.ae, GameScr.af, GameScr.ag, (float)(GameCanvas.z / 2 - 50), (float)(GameCanvas.C + 45), 100, (float)o, var1);
                  return;
               }

               mFont.c.drawString(var1, mResources.fX, GameCanvas.B, GameCanvas.C + 24, 2);
               if(G != null) {
                  G.paint(var1);
                  return;
               }
            }
         } else {
            int var2;
            if((var2 = GameCanvas.C - 15 * this.v.length - 15) < 25) {
               var2 = 25;
            }

            if(nr_x.j != null) {
               var1.drawImage(nr_x.j, GameCanvas.B, var2, 3);
            }

            for(var2 = 0; var2 < this.v.length; ++var2) {
               this.v[var2].paint(var1);
            }

            var1.e(0, 0, GameCanvas.z, GameCanvas.A);
            if(s == -1) {
               if(GameCanvas.gameTick % 20 > 10) {
                  var1.drawRegion(GameScr.ad, 0, 14, 7, 7, 0, (GameCanvas.z - mFont.tahoma_7b_dark.a(this.v[2 + this.x].caption) >> 1) - 10, this.v[2 + this.x].y + 10, 0);
                  return;
               }
            } else {
               var1.drawRegion(GameScr.ad, 0, s * 7, 7, 7, 0, (GameCanvas.z - mFont.tahoma_7b_dark.a(this.v[2 + this.x].caption) >> 1) - 10, this.v[2 + this.x].y + 9, 0);
            }
         }
      }

   }

   public final void c() {
      if(k) {
         if(++E == 50) {
            byte var3 = 0;
            Object var2 = null;
            nr_bo var1 = GameCanvas.af;
            F = 30;
            GameCanvas.b(mResources.aw);
            GameMidlet.IP = (String)var2;
            GameMidlet.PORT = var3;
            var1.k();
            GameCanvas.a((String)var2, var3);
         }

         if(E >= 100 && Session_ME.gI().d()) {
            if(GameCanvas.loginScr == null) {
               GameCanvas.loginScr = new nr_x();
            }

            GameCanvas.loginScr.a();
            Service.gI().r();
            k = false;
         }
      }

      if(F > 0 && --F == 0) {
         GameCanvas.g();
      }

      for(int var4 = 0; var4 < this.v.length; ++var4) {
         if(var4 == u) {
            this.v[var4].isFocus = true;
         } else {
            this.v[var4].isFocus = false;
         }
      }

      ++GameScr.j;
      if(!t && (n || o == 100)) {
         G = null;
      }

      super.c();
   }

   private void l() {
      Res.out("load Screen= " + t + " select= " + u);
      if(t) {
         super.cb = new Command("", this, this.v[u].idAction, (Object)null);
      } else {
         super.cb = G;
      }
   }

   public static void e() {}

   public final void d() {
      int var1;
      if(GameCanvas.isTouch) {
         if(this.w != null && this.w.isPointerPressInside()) {
            this.w.performAction();
         }

         if(!t) {
            if(G != null && G.isPointerPressInside()) {
               G.performAction();
            }

            super.d();
            return;
         }

         for(var1 = 0; var1 < this.v.length; ++var1) {
            if(this.v[var1] != null && this.v[var1].isPointerPressInside()) {
               this.v[var1].performAction();
            }
         }
      } else {
         if(Main.typeClient == 1 && GameCanvas.i[13]) {
            GameCanvas.i[13] = false;
            this.w.performAction();
         }

         if(t) {
            if(GameCanvas.i[8]) {
               var1 = this.v.length - 1;
               GameCanvas.i[8] = false;
               if(++u > var1) {
                  u = 0;
               }

               this.l();
            }

            if(GameCanvas.i[2]) {
               var1 = this.v.length - 1;
               GameCanvas.i[2] = false;
               if(--u < 0) {
                  u = var1;
               }

               this.l();
            }
         }
      }

      super.d();
   }

   public static void f() {
      byte[] var0;
      if((var0 = Rms.b("NRlink")) == null) {
         System.out.println("Go true");
         a(h);
      } else {
         System.out.println("Go false");
         ByteArrayInputStream var4 = new ByteArrayInputStream(var0);
         DataInputStream var5 = new DataInputStream(var4);

         try {
            l = new int[3];
            Res.out(" NRlink = " + var5.available());
            mResources.a(var5.readByte());
            byte var1;
            a = new String[var1 = var5.readByte()];
            b = new String[var1];
            e = new short[var1];
            g = new byte[var1];

            for(int var2 = 0; var2 < var1; ++var2) {
               a[var2] = var5.readUTF();
               Res.out(" nameServer = " + a[var2]);
               b[var2] = var5.readUTF();
               e[var2] = var5.readShort();
               g[var2] = var5.readByte();
               ++l[g[var2]];
            }

            c = var5.readByte();
            var5.close();
            SplashScr.e();
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   public final void b() {
      GameCanvas.b();
      GameScr.k = 0;
      GameScr.j = 0;
      this.k();
      f = false;
      GameCanvas.loginScr = null;
      String var1;
      if(((var1 = Rms.c("ResVersion")) != null && var1 != ""?Integer.parseInt(var1):-1) > 0) {
         t = true;
         GameCanvas.a(0);
      }

      n = true;
      this.v[2 + this.x].caption = mResources.aF + ": " + a[m];
      super.cb = new Command("", this, this.v[u].idAction, (Object)null);
      this.v[1 + this.x].caption = mResources.P;
      if(this.v.length == 4 + this.x) {
         this.v[3 + this.x].caption = mResources.bQ;
      }

      super.b();
   }

   public final void g() {
      GameScr.k = 0;
      GameScr.j = 0;
      this.k();
      f = false;
      GameCanvas.loginScr = null;
      String var1;
      if(((var1 = Rms.c("ResVersion")) != null && var1 != ""?Integer.parseInt(var1):-1) > 0) {
         t = true;
         GameCanvas.a(0);
      }

      n = true;
      this.v[2 + this.x].caption = mResources.aF + ": " + a[m];
      super.cb = new Command("", this, this.v[u].idAction, (Object)null);
      this.v[1 + this.x].caption = mResources.P;
      if(this.v.length == 4 + this.x) {
         this.v[3 + this.x].caption = mResources.bQ;
      }

      super.b();
   }

   public final void h() {
      if(GameCanvas.af == null) {
         GameCanvas.af = new nr_bo();
      }

      q = 0;
      o = 0;
      i = true;
      GameCanvas.af.j();
      r = false;
      G.isFocus = true;
      super.cb = new Command("", this, 2, (Object)null);
   }

   public final void i() {
      F = 30;
      GameCanvas.b(mResources.aw);
      if(Session_ME.gI().d()) {
         Session_ME.gI().e();
      }

      GameMidlet.IP = b[m];
      GameMidlet.PORT = e[m];
      if(g[m] != mResources.fw) {
         mResources.a(g[m]);
      }

      nr_x.i = a[m];
      this.k();
      GameCanvas.b();
   }

   public final void perform(int var1, Object var2) {
      Res.out("perform " + var1);
      if(var1 == 1000) {
         GameCanvas.b();
      }

      if(var1 == 1 || var1 == 4) {
         this.h();
      }

      if(var1 == 2) {
         i = false;
         (G = new Command(mResources.fY, this, 4, (Object)null)).x = GameCanvas.z / 2 - mScreen.cmdW / 2;
         G.y = GameCanvas.C + 65;
         super.cc = null;
         if(!GameCanvas.isTouch) {
            G.x = GameCanvas.z / 2 - mScreen.cmdW / 2;
            G.y = GameCanvas.A - mScreen.cmdH - 1;
         }

         super.cb = new Command("", this, 4, (Object)null);
         if(!r) {
            Service.gI().getResource((byte)1, (MyVector)null);
            if(!GameCanvas.isTouch) {
               G.isFocus = true;
               super.cb = new Command("", this, 4, (Object)null);
            }

            r = true;
         }
      }

      boolean var4;
      String var5;
      if(var1 == 3) {
         if(GameCanvas.loginScr == null) {
            GameCanvas.loginScr = new nr_x();
         }

         GameCanvas.loginScr.b();
         Res.out("toi day");
         if(Rms.c("acc") == null) {
            var4 = false;
         } else if(Rms.c("acc").equals("")) {
            var4 = false;
         } else {
            var4 = true;
         }

         boolean var3;
         if(Rms.c("userAo" + m) == null) {
            var3 = false;
         } else if(Rms.c("userAo" + m).equals("")) {
            var3 = false;
         } else {
            var3 = true;
         }

         if(!var4 && !var3) {
            GameCanvas.b();
            if((var5 = Rms.c("userAo" + m)) != null && !var5.equals("")) {
               GameCanvas.loginScr.isLogin2 = true;
               GameCanvas.b();
               Service.gI().setClientType();
               Service.gI().login(var5, "", "2.3.0", (byte)1);
            } else {
               Service.gI().f("");
               Res.out("tao user ao");
            }

            GameCanvas.h();
         } else {
            GameCanvas.loginScr.a();
         }

         nr_x.i = a[m];
      }

      if(var1 == 10100) {
         if(GameCanvas.loginScr == null) {
            GameCanvas.loginScr = new nr_x();
         }

         GameCanvas.loginScr.b();
         GameCanvas.b();
         Service.gI().f("");
         Res.out("tao user ao");
         GameCanvas.h();
         nr_x.i = a[m];
      }

      if(var1 == 5) {
         a();
         if(a.length == 1) {
            return;
         }

         MyVector var6 = new MyVector("");

         for(int var7 = 0; var7 < a.length; ++var7) {
            var6.addElement(new Command(a[var7], this, 6, (Object)null));
         }

         GameCanvas.menu.a(var6);
         if(!GameCanvas.isTouch) {
            GameCanvas.menu.b = m;
         }
      }

      if(var1 == 6) {
         m = GameCanvas.menu.b;
         this.i();
      }

      if(var1 == 7) {
         if(GameCanvas.loginScr == null) {
            GameCanvas.loginScr = new nr_x();
         }

         GameCanvas.loginScr.b();
      }

      if(var1 == 8) {
         var4 = Rms.loadRmsInt("lowGraphic") == 1;
         MyVector var8;
         (var8 = new MyVector("cau hinh")).addElement(new Command(mResources.v, this, 9, (Object)null));
         var8.addElement(new Command(mResources.w, this, 10, (Object)null));
         GameCanvas.menu.a(var8);
         if(var4) {
            GameCanvas.menu.b = 0;
         } else {
            GameCanvas.menu.b = 1;
         }
      }

      if(var1 == 9) {
         Rms.saveRMSInt("lowGraphic", 1);
         GameCanvas.startOK(mResources.plsRestartGame, 8885, (Object)null);
      }

      if(var1 == 10) {
         Rms.saveRMSInt("lowGraphic", 0);
         GameCanvas.startOK(mResources.plsRestartGame, 8885, (Object)null);
      }

      if(var1 == 11) {
         if(GameCanvas.loginScr == null) {
            GameCanvas.loginScr = new nr_x();
         }

         GameCanvas.loginScr.b();
         if((var5 = Rms.c("userAo" + m)) != null && !var5.equals("")) {
            GameCanvas.loginScr.isLogin2 = true;
            GameCanvas.b();
            Service.gI().setClientType();
            Service.gI().login(var5, "", "2.3.0", (byte)1);
         } else {
            Service.gI().f("");
         }

         GameCanvas.b(mResources.aw);
         Res.out("tao user ao");
      }

      if(var1 == 12) {
         GameMidlet.instance.a();
      }

      if(var1 == 13 && (!r || t)) {
         switch(Main.typeClient) {
         case 1:
            Main.a();
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         }
      }

      if(var1 == 14) {
         Command var9 = new Command(mResources.bj, GameCanvas.af, 15, (Object)null);
         Command var10 = new Command(mResources.bk, GameCanvas.af, 16, (Object)null);
         GameCanvas.a(mResources.gb, var9, var10);
      }

      if(var1 == 15) {
         Rms.a();
         GameCanvas.startOK(mResources.plsRestartGame, 8885, (Object)null);
      }

      if(var1 == 16) {
         InfoDlg.hide();
         GameCanvas.J = null;
      }

      if(var1 == 17) {
         if(GameCanvas.ag == null) {
            GameCanvas.ag = new nr_eo();
         }

         GameCanvas.ag.b();
      }

   }

   public final void j() {
      GameScr.j = 0;
      GameScr.k = 0;
      this.k();
      t = false;
      o = 0;
      n = false;
      r = false;
      q = 0;
      if(!t) {
         (G = new Command(mResources.fZ, this, 2, (Object)null)).isFocus = true;
         G.x = GameCanvas.z / 2 - mScreen.cmdW / 2;
         G.y = GameCanvas.C + 45;
         if(G.y > GameCanvas.A - 26) {
            G.y = GameCanvas.A - 26;
         }
      }

      if(!GameCanvas.isTouch) {
         u = 0;
         this.l();
      }

      super.b();
   }
}
