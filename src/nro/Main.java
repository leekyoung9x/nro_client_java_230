package nro;

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;

public final class Main {

   public static boolean a = false;
   public static boolean b = false;
   private static Image i = loadImage("/mainImage/black.png");
   public static int typeClient = 1;
   public static byte d = 0;
   public static byte e = 0;
   public static byte f = 5;
   public static String g;
   public static boolean h = false;


   public static int a(Image var0) {
      return typeClient == 5?var0.getWidth():var0.getWidth();
   }

   public static int b(Image var0) {
      return typeClient == 5?var0.getHeight():var0.getWidth();
   }

   public static String a(long var0, int var2, boolean var3, boolean var4) {
      long var5;
      return (var5 = (var0 + (long)(var2 * 1000) - System.currentTimeMillis()) / 1000L) <= 0L?"":String.valueOf(var5);
   }

   public static String a(long var0) {
      String var2 = "" + var0;
      boolean var3 = false;

      try {
         if(var0 < 0L) {
            var3 = true;
            var0 = -var0;
            var2 = "" + var0;
         }

         String var4;
         int var6;
         if(var0 >= 1000000000L) {
            var4 = "b";
            var0 /= 1000000000L;
            var6 = ("" + var0).length();
         } else if(var0 >= 1000000L) {
            var4 = "m";
            var0 /= 1000000L;
            var6 = ("" + var0).length();
         } else {
            if(var0 < 1000L) {
               if(var3) {
                  return "-" + var2;
               }

               return var2;
            }

            var4 = "k";
            var0 /= 1000L;
            var6 = ("" + var0).length();
         }

         int var1;
         if((var1 = Integer.parseInt(var2.substring(var6, 2))) == 0) {
            var2 = var2.substring(0, var6) + var4;
         } else if(var1 % 10 == 0) {
            var2 = var2.substring(0, var6) + "," + var2.substring(var6, 1) + var4;
         } else {
            var2 = var2.substring(0, var6) + "," + var2.substring(var6, 2) + var4;
         }
      } catch (Exception var5) {
         ;
      }

      return var3?"-" + var2:var2;
   }

   public static void a() {
      try {
         GameMidlet.instance.platformRequest(nr_bo.j);
      } catch (ConnectionNotFoundException var1) {
         var1.printStackTrace();
      }
   }

   public static void a(mGraphics var0, int var1, int var2, int var3) {
      var3 = var3 / mGraphics.getImageWidth(i) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         var0.drawImage(i, var1 + var4 * mGraphics.getImageWidth(i), var2, 0);
      }

   }

   public static void b() {
      while(Controller.b) {
         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var1) {
            var1.printStackTrace();
         }
      }

   }

   public static void a(boolean var0) {
      if(GameCanvas.currentScreen.equals(SplashScr.a)) {
         Res.out("toi day");
         if(nr_bo.d != null) {
            if(!nr_bo.d[0]) {
               nr_bo.d[0] = true;
               nr_bo.m = 0;
               GameMidlet.IP = nr_bo.b[nr_bo.m];
               Rms.saveRMSInt("svselect", nr_bo.m);
               GameCanvas.b();
            } else if(!nr_bo.d[2]) {
               nr_bo.d[2] = true;
               nr_bo.m = 2;
               GameMidlet.IP = nr_bo.b[nr_bo.m];
               Rms.saveRMSInt("svselect", nr_bo.m);
               GameCanvas.b();
            } else if(Rms.b("ImageSource") == null) {
               GameCanvas.startOK(mResources.az, 8885, (Object)null);
            } else {
               GameCanvas.startOK(mResources.aA, 9000, (Object)null);
            }
         } else if(Rms.b("ImageSource") == null) {
            GameCanvas.startOK(mResources.az, 8885, (Object)null);
         } else {
            GameCanvas.startOK(mResources.aA, 9000, (Object)null);
         }
      } else {
         Session_ME.gI().c();
         Session_ME.gI2().c();
         nr_bo.f = false;
         if(Controller.isLoadingData) {
            GameCanvas.startOK(mResources.az, 8885, (Object)null);
         } else {
            nr_x.c = false;
            if(GameCanvas.loginScr != null) {
               GameCanvas.h.j();
            } else {
               GameCanvas.loginScr = new nr_x();
            }

            nr_x.i = nr_bo.a[nr_bo.m];
            if(GameCanvas.currentScreen != GameCanvas.af) {
               GameCanvas.startOK(mResources.aB + nr_x.i, 888395, (Object)null);
            } else {
               GameCanvas.g();
            }

            Char.bH = false;
            if(var0) {
               nr_bo.s = 0;
            }

            GameCanvas.a("Connect fail ", new Command(mResources.bj, 12005), new Command(mResources.bk, 12006));
         }
      }
   }

   public static void b(boolean var0) {
      Session_ME.gI().c();
      Session_ME.gI2().c();
      if(Controller.isLoadingData) {
         GameCanvas.h.j();
         GameCanvas.startOK(mResources.az, 8885, (Object)null);
      } else {
         if(GameCanvas.currentScreen != GameCanvas.af) {
            GameCanvas.a(mResources.u);
         } else {
            GameCanvas.g();
         }

         Char.bH = false;
         if(var0) {
            nr_bo.s = 0;
         }

         GameCanvas.h.j();
      }
   }

   public static Image a(String var0) {
      String var1 = "/x" + mGraphics.zoomLevel + var0;
      Res.out("[mSystem]  load rms= " + var0);
      Image var2;
      if((var2 = nr_bj.a(var0)) == null) {
         String[] var3 = Res.a(Res.a(var1, ".", 0)[0], "/", 0);
         byte[] var4;
         if((var4 = Rms.b("x" + mGraphics.zoomLevel + var3[var3.length - 1])) != null) {
            var2 = Image.createImage(var4, 0, var4.length);
         }
      }

      return var2;
   }

   public static Image loadImage(String var0) {
      Image var1 = null;

      try {
         var1 = nr_bj.a(var0);
      } catch (Exception var2) {
         ;
      }

      return var1;
   }

   public static Image c(String var0) {
      var0 = "/x" + mGraphics.zoomLevel + var0;
      Image var1 = null;

      try {
         var1 = Image.createImage(var0);
      } catch (Exception var2) {
         ;
      }

      return var1;
   }

   public static void a(mGraphics var0) {
      for(int var1 = 0; var1 < 5; ++var1) {
         if(GameScr.bI[var1] != -1 && GameCanvas.d(GameScr.bG[var1], GameScr.bH[var1])) {
            if(GameScr.bJ[var1] == 0) {
               mFont.v.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2);
            } else if(GameScr.bJ[var1] == 1) {
               mFont.x.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2);
            } else if(GameScr.bJ[var1] == 2) {
               mFont.y.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2);
            } else if(GameScr.bJ[var1] == 3) {
               mFont.x.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2, mFont.y);
            } else if(GameScr.bJ[var1] == 8) {
               mFont.r.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2, mFont.tahoma_7b_dark);
            } else if(GameScr.bJ[var1] == 4) {
               mFont.s.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2, mFont.o);
            } else if(GameScr.bJ[var1] == 5) {
               mFont.z.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2);
            } else if(GameScr.bJ[var1] == 6) {
               mFont.x.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2, mFont.v);
            } else if(GameScr.bJ[var1] == 7) {
               mFont.c.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2, mFont.tahoma_7b_dark);
            } else if(GameScr.bJ[var1] == 9) {
               mFont.p.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2, mFont.tahoma_7b_dark);
            } else if(GameScr.bJ[var1] == 10) {
               mFont.l.b(var0, GameScr.bF[var1], GameScr.bG[var1], GameScr.bH[var1], 2, mFont.tahoma_7b_dark);
            }
         }
      }

   }

   public static long c() {
      return System.currentTimeMillis();
   }

   public static nr_cz d(String var0) {
      nr_cz var1 = null;
      nr_bi var2 = null;
      if((var2 = nr_aq.a(var0, nr_aq.a)).a != null) {
         int var3;
         if((var3 = var2.a.getHeight() / var2.d) <= 0) {
            var3 = 1;
         }

         var1 = new nr_cz(var2.a, var2.a.getWidth(), var3);
      }

      return var1;
   }
}
