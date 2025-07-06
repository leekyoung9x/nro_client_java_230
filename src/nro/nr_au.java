package nro;

import nro.SmallImage;
import nro.nr_cj;
import nro.nr_cw;
import nro.mGraphics;
import nro.GameScr;

public final class nr_au extends nr_cw {

   private nr_cj a;
   private int b;
   private int c;
   private int d;
   private short e = 0;
   private long f = 0L;


   public static void a(int var0, int var1, int var2, int var3) {
      nr_au var4;
      (var4 = new nr_au()).a = GameScr.y[var0 - 1];
      var4.c = var1;
      var4.d = var2;
      var4.e = 2;
      nr_cw.v.addElement(var4);
   }

   public final void a(mGraphics var1) {
      if(mGraphics.zoomLevel == 1) {
         ++GameScr.aM;
      }

      if(GameScr.aM < 8) {
         int var2 = this.c + this.a.a[this.b].a;
         int var3 = this.d + this.a.a[this.b].b;
         SmallImage.drawSmallImage(var1, this.a.a[this.b].c, var2, var3, 0, 3);
      }

   }

   public final void a() {
      if(0L != 0L) {
         ++this.b;
         if(this.b >= this.a.a.length) {
            this.b = 0;
         }

         if(System.currentTimeMillis() > 0L) {
            nr_cw.v.removeElement(this);
            return;
         }
      } else {
         ++this.b;
         if(this.b >= this.a.a.length) {
            --this.e;
            if(this.e <= 0) {
               nr_cw.v.removeElement(this);
               return;
            }

            this.b = 0;
         }
      }

   }
}
