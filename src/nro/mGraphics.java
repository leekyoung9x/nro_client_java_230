package nro;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import nro.Res;

public final class mGraphics {

   public Graphics a;
   public static int zoomLevel = 1;


   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      this.a.fillArc(var1, var2, var3, var4, 0, 360);
   }

   public final void drawImage(Image var1, int var2, int var3, int var4) {
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      this.a.drawImage(var1, var2, var3, var4);
   }

   public final void a(Image var1, float var2, float var3, int var4) {
      int var5 = var4;
      float var6 = var3;
      var3 = var2 * (float)zoomLevel;
      var6 *= (float)zoomLevel;
      this.a.drawImage(var1, (int)var3, (int)var6, var5);
   }

   public final void a(int var1, int var2, int var3, int var4) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      this.a.drawLine(var1, var2, var3, var4);
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      this.a.setColor(var5);
      this.a.fillRect(var1, var2, var3, var4);
   }

   public final void b(int var1, int var2, int var3, int var4) {
      this.d(var1, var2, var3, var4);
   }

   public final void c(int var1, int var2, int var3, int var4) {
      this.d(var1, var2, 1, var4);
      this.d(var1 + var3, var2, 1, var4);
      this.d(var1, var2, var3, 1);
      this.d(var1, var2 + var4, var3 + 1, 1);
   }

   public final void drawRegion(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var7 *= zoomLevel;
      var8 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      var5 *= zoomLevel;
      this.a.drawRegion(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void b(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.drawRegion(var1, 0, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void a(Image var1, int var2, int var3, int var4, int var5) {
      for(var2 = 0; var2 < var4 / getImageWidth(var1) + 1; ++var2) {
         for(var3 = 0; var3 < var5 / getImageHeight(var1) + 1; ++var3) {
            this.a.drawImage(var1, 0 + var2 * getImageWidth(var1), 0 + var3 * getImageHeight(var1), 0);
         }
      }

   }

   public static int a(float var0, int var1, int var2) {
      Res.out("blend color");
      var0 = (float)(var2 >> 16 & 255);
      float var3 = (float)(var2 >> 8 & 255);
      float var4 = (float)(var2 & 255);
      var0 *= 0.4F;
      var3 *= 0.4F;
      var4 *= 0.4F;
      if(var0 > 255.0F) {
         var0 = 255.0F;
      }

      if(var0 < 0.0F) {
         var0 = 0.0F;
      }

      if(var3 > 255.0F) {
         var3 = 255.0F;
      }

      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 255.0F) {
         var4 = 255.0F;
      }

      return -16777216 | (int)var0 << 16 | (int)var3 << 8 | (int)var4 & 255;
   }

   public final void d(int var1, int var2, int var3, int var4) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      this.a.fillRect(var1, var2, var3, var4);
   }

   public final int a() {
      return this.a.getTranslateX() / zoomLevel;
   }

   public final int b() {
      return this.a.getTranslateY() / zoomLevel;
   }

   public final void e(int var1, int var2, int var3, int var4) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      var3 *= zoomLevel;
      var4 *= zoomLevel;
      this.a.setClip(var1, var2, var3, var4);
   }

   public final int c() {
      return this.a.getClipX();
   }

   public final int d() {
      return this.a.getClipY();
   }

   public final int e() {
      return this.a.getClipWidth();
   }

   public final int f() {
      return this.a.getClipHeight();
   }

   public final void a(int var1) {
      this.a.setColor(var1);
   }

   public final void a(int var1, int var2) {
      var1 *= zoomLevel;
      var2 *= zoomLevel;
      this.a.translate(var1, var2);
   }

   public static int getImageWidth(Image var0) {
      return var0.getWidth() / zoomLevel;
   }

   public static int getImageHeight(Image var0) {
      return var0.getHeight() / zoomLevel;
   }

   public static int c(Image var0) {
      return var0.getWidth();
   }

   public static int d(Image var0) {
      return var0.getHeight();
   }
}
