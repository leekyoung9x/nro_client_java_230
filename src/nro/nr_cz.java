package nro;

import javax.microedition.lcdui.Image;
import nro.nr_cd;
import nro.mGraphics;

public final class nr_cz {

   public int a;
   public int b;
   public int c;
   public Image d;


   public nr_cz(int var1) {
      Image var2;
      if((var2 = nr_cd.a(var1)) != null) {
         this.d = var2;
         this.a = nr_cd.c[var1][0];
         this.b = nr_cd.c[var1][1] / nr_cd.c[var1][2];
         this.c = nr_cd.c[var1][2];
      }

   }

   public nr_cz(Image var1, int var2, int var3) {
      if(var1 != null) {
         this.d = var1;
         this.a = var2;
         this.b = var3;
         this.c = var1.getHeight() / var3;
         if(this.c <= 0) {
            this.c = 1;
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, mGraphics var6) {
      try {
         if(this.d != null) {
            if(var1 > this.c) {
               var1 = this.c;
            }

            var6.drawRegion(this.d, 0, var1 * this.b, this.a, this.b, var4, var2, var3, var5);
            return;
         }
      } catch (Exception var7) {
         ;
      }

   }
}
