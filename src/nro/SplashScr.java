package nro;

import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;
import nro.Rms;
import nro.mResources;
import nro.mScreen;
import nro.nr_bo;
import nro.SoundMn;
import nro.nr_cf;
import nro.mFont;
import nro.Res;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;
import nro.nr_x;

public final class SplashScr extends mScreen {

   private static int c;
   private boolean d = false;
   private static int e = -1;
   private static int f = -1;
   public static SplashScr a;
   public static Image b = Main.loadImage("/gamelogo.png");


   public SplashScr() {
      a = this;
   }

   public static void loadSplashScr() {
      c = 0;
   }

   public final void c() {
      if(c == 30 && !this.d) {
         this.d = true;
         if(Rms.loadRmsInt("serverchat") != -1) {
            GameScr.isPaintChatVip = Rms.loadRmsInt("serverchat") == 0;
         }

         if(Rms.loadRmsInt("isPlaySound") != -1) {
            GameCanvas.ae = Rms.loadRmsInt("isPlaySound") == 1;
         }

         if(GameCanvas.ae) {
            SoundMn.gI();
         }

         SoundMn.gI();
         SoundMn.getStrOption();
         nr_bo.f();
      }

      ++c;
      nr_bo.e();
   }

   public static void e() {
      if(Rms.loadRmsInt("svselect") != -1) {
         if((nr_bo.m = Rms.loadRmsInt("svselect")) > nr_bo.a.length - 1) {
            nr_bo.m = nr_bo.c;
            Rms.saveRMSInt("svselect", nr_bo.m);
         }

         GameMidlet.IP = nr_bo.b[nr_bo.m];
         GameMidlet.PORT = nr_bo.e[nr_bo.m];
         mResources.a(nr_bo.g[nr_bo.m]);
         nr_x.i = nr_bo.a[nr_bo.m];
         System.out.println("ipselect = " + nr_bo.m + " , " + nr_x.i);
         GameCanvas.b();
      } else {
         int var0 = 0;
         if(mResources.fw > 0) {
            for(int var1 = 0; var1 < mResources.fw; ++var1) {
               var0 += nr_bo.l[var1];
            }
         }

         if(nr_bo.c == -1) {
            nr_bo.m = var0 + Res.b(0, nr_bo.l[mResources.fw]);
         } else {
            nr_bo.m = nr_bo.c;
         }

         Rms.saveRMSInt("svselect", nr_bo.m);
         GameMidlet.IP = nr_bo.b[nr_bo.m];
         GameMidlet.PORT = nr_bo.e[nr_bo.m];
         mResources.a(nr_bo.g[nr_bo.m]);
         nr_x.i = nr_bo.a[nr_bo.m];
         GameCanvas.b();
      }
   }

   public final void a(mGraphics var1) {
      if(b != null && c < 30) {
         if(Main.typeClient == 3 || Main.typeClient == 5) {
            var1.a(16777215);
            var1.d(0, 0, GameCanvas.z, GameCanvas.A);
         }

         var1.drawImage(b, GameCanvas.z / 2, GameCanvas.A / 2, 3);
      }

      if(e != -1) {
         var1.a(0);
         var1.d(0, 0, GameCanvas.z, GameCanvas.A);
         var1.drawImage(nr_x.j, GameCanvas.z / 2, GameCanvas.A / 2 - 24, nr_cf.c);
         GameCanvas.a(GameCanvas.B, GameCanvas.A / 2 + 24, var1);
         mFont.c.drawString(var1, mResources.ay + e * 100 / f + "%", GameCanvas.z / 2, GameCanvas.A / 2, 2);
      } else {
         if(c >= 30) {
            var1.a(0);
            var1.d(0, 0, GameCanvas.z, GameCanvas.A);
            GameCanvas.a(GameCanvas.B, GameCanvas.C, var1);
         }

      }
   }
}
