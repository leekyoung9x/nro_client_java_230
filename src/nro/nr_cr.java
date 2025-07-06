package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.mScreen;
import nro.nr_cf;
import nro.Command;
import nro.mFont;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class nr_cr {

   private static int b = 15787715;
   private static Image[] c = new Image[6];
   public static int a;
   private static int d;


   static {
      for(int var0 = 0; var0 < c.length; ++var0) {
         c[var0] = Main.loadImage("/mainImage/myTexture2dgoc" + (var0 + 1) + ".png");
      }

      a = 24;
      d = 0;
      Main.loadImage("/mainImage/myTexture2dcheck.png");
   }

   public nr_cr() {
      int[] var10000 = new int[]{15970400, -844109861, 2250052, 16374659, 15906669, 12931125, 3108954};
   }

   public static void a(mGraphics var0, Command var1, Command var2, Command var3) {
      boolean var10000 = GameCanvas.isTouch;
      mFont var4 = mFont.tahoma_7b_dark;
      if(var1 != null && (d = var4.a(var1.caption)) > 0) {
         if(var1.x >= 0 && var1.y > 0) {
            var1.paint(var0);
         } else {
            var0.drawImage(mScreen.cg == 0?GameScr.aw:GameScr.av, 1, GameCanvas.A - mScreen.cmdH - 1, 0);
            var4.drawString(var0, var1.caption, 35, GameCanvas.A - mScreen.cmdH + 3 + 3, 2);
         }
      }

      if(var2 != null && (d = var4.a(var2.caption)) > 0) {
         if(var2.x > 0 && var2.y > 0) {
            var2.paint(var0);
         } else {
            var0.drawImage(mScreen.cg == 1?GameScr.aw:GameScr.av, GameCanvas.B - 35, GameCanvas.A - mScreen.cmdH - 1, 0);
            var4.drawString(var0, var2.caption, GameCanvas.B, GameCanvas.A - mScreen.cmdH + 3 + 3, 2);
         }
      }

      if(var3 != null && (d = var4.a(var3.caption)) > 0) {
         if(var3.x > 0 && var3.y > 0) {
            var3.paint(var0);
            return;
         }

         var0.drawImage(mScreen.cg == 2?GameScr.aw:GameScr.av, GameCanvas.z - 71, GameCanvas.A - mScreen.cmdH - 1, 0);
         var4.drawString(var0, var3.caption, GameCanvas.z - 35, GameCanvas.A - mScreen.cmdH + 3 + 3, 2);
      }

   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5, String[] var6) {
      b(var2, var3, var4, 69, var1);
      var3 = var3 + 20 - mFont.t.a();
      var5 = 0;

      for(var3 = var3; var5 < var6.length; var3 += mFont.t.a()) {
         mFont.t.drawString(var1, var6[var5], var2 + var4 / 2, var3, 2);
         ++var5;
      }

   }

   public static void a(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.a(9340251);
      var4.c(var0 + 18, var1, (var2 - 36) / 2 - 32, var3);
      var4.c(var0 + 18 + (var2 - 36) / 2 + 32, var1, (var2 - 36) / 2 - 22, var3);
      var4.c(var0, var1 + 8, var2, var3 - 17);
      var4.a(b);
      var4.d(var0 + 18, var1 + 3, (var2 - 36) / 2 - 32, var3 - 4);
      var4.d(var0 + 18 + (var2 - 36) / 2 + 31, var1 + 3, (var2 - 38) / 2 - 22, var3 - 4);
      var4.d(var0 + 1, var1 + 6, var2 - 1, var3 - 11);
      var4.a(14667919);
      var4.d(var0 + 18, var1 + 1, (var2 - 36) / 2 - 32, 2);
      var4.d(var0 + 18 + (var2 - 36) / 2 + 32, var1 + 1, (var2 - 36) / 2 - 12, 2);
      var4.d(var0 + 18, var1 + var3 - 2, (var2 - 36) / 2 - 31, 2);
      var4.d(var0 + 18 + (var2 - 36) / 2 + 32, var1 + var3 - 2, (var2 - 36) / 2 - 31, 2);
      var4.d(var0 + 1, var1 + 11, 2, var3 - 18);
      var4.d(var0 + var2 - 2, var1 + 11, 2, var3 - 18);
      var4.drawImage(c[0], var0 - 3, var1 - 2, 20);
      var4.drawImage(c[2], var0 + var2 + 3, var1 - 2, nr_cf.b);
      var4.drawImage(c[1], var0 - 3, var1 + var3 + 3, nr_cf.d);
      var4.drawImage(c[3], var0 + var2 + 4, var1 + var3 + 2, nr_cf.e);
      var4.drawImage(c[4], var0 + var2 / 2, var1, nr_cf.a);
      var4.drawImage(c[5], var0 + var2 / 2, var1 + var3 + 1, nr_cf.c);
   }

   public static void b(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.a(13524492);
      var4.c(var0 + 6, var1, var2 - 12, var3);
      var4.c(var0, var1 + 6, var2, var3 - 12);
      var4.c(var0 + 7, var1 + 1, var2 - 14, var3 - 2);
      var4.c(var0 + 1, var1 + 7, var2 - 2, var3 - 14);
      var4.a(14338484);
      var4.d(var0 + 8, var1 + 2, var2 - 16, var3 - 3);
      var4.d(var0 + 2, var1 + 8, var2 - 3, var3 - 14);
      var4.drawImage(GameCanvas.U[2], var0, var1, 20);
      var4.drawRegion(GameCanvas.U[2], 0, 0, 16, 16, 2, var0 + var2 + 1, var1, nr_cf.b);
      var4.drawRegion(GameCanvas.U[2], 0, 0, 16, 16, 1, var0, var1 + var3 + 1, nr_cf.d);
      var4.drawRegion(GameCanvas.U[2], 0, 0, 16, 16, 3, var0 + var2 + 1, var1 + var3 + 1, nr_cf.e);
   }

   public static void c(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.a(6702080);
      var4.d(var0, var1, var2, var3);
      var4.a(14338484);
      var4.d(var0 + 1, var1 + 1, var2 - 2, var3 - 2);
   }
}
