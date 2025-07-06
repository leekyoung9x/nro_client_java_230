package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.mGraphics;

public final class nr_dz {

   public Image a;
   public int b;
   public int c;
   public int d;


   public nr_dz(Image var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = 0;
      this.d = 0;
   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5) {
      mGraphics var10001 = var1;
      boolean var7 = false;
      int var6 = var5;
      var5 = var4;
      var4 = var3;
      var3 = var2;
      mGraphics var8 = var10001;
      var8.b(this.a, 0, 0, mGraphics.getImageWidth(this.a), mGraphics.getImageHeight(this.a), var3, var4, var5, var6);
      if(GameCanvas.gameTick % 1000 == 0) {
         ++this.c;
         this.d = this.c;
      }

   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      mGraphics var10001 = var1;
      boolean var10 = false;
      int var9 = var8;
      var8 = var7;
      var7 = var6;
      var6 = var5;
      var5 = var4;
      var4 = var3;
      var3 = var2;
      mGraphics var11 = var10001;
      if(mGraphics.getImageWidth(this.a) != 1) {
         var11.b(this.a, 0, var4 * var7, var7, var8, var3, var5, var6, var9);
         if(GameCanvas.gameTick % 1000 == 0) {
            ++this.c;
            this.d = this.c;
         }
      }

   }
}
