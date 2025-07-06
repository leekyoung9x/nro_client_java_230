package nro;

import main.GameCanvas;
import nro.mResources;
import nro.nr_cr;
import nro.mFont;
import nro.mGraphics;

public final class InfoDlg {

   public static boolean a;
   private static String c;
   private static String d;
   private static int e;
   public static boolean b;


   public static void a(String var0, String var1, int var2) {
      if(var0 != null) {
         a = true;
         c = var0;
         d = var1;
         e = var2;
      }
   }

   public static void a() {
      a(mResources.aw, (String)null, 1000);
      b = true;
   }

   public static void a(mGraphics var0) {
      if(a) {
         if(!b || e <= 4990) {
            nr_cr.a(GameCanvas.B - 75, 10, 150, 55, var0);
            if(b) {
               GameCanvas.a(GameCanvas.B - mFont.t.a(c) / 2 - 10, 38, var0);
               mFont.t.drawString(var0, c, GameCanvas.B + 5, 31, 2);
            } else if(d != null) {
               mFont.t.drawString(var0, c, GameCanvas.B, 23, 2);
               mFont.m.drawString(var0, d, GameCanvas.B, 40, 2);
            } else {
               mFont.t.drawString(var0, c, GameCanvas.B, 31, 2);
            }
         }
      }
   }

   public static void b() {
      if(e > 0 && --e == 0) {
         hide();
      }

   }

   public static void hide() {
      c = "";
      d = null;
      b = false;
      e = 0;
      a = false;
   }
}
