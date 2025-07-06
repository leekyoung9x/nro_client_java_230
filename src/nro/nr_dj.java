package nro;

import nro.Char;
import nro.SmallImage;
import nro.nr_cp;
import nro.Res;
import nro.mGraphics;

public final class nr_dj {

   public int a = 0;
   public int b;
   public int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private Char j;
   private nr_cp k = null;
   private static byte[] l = new byte[]{(byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0};
   private static int[] m = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
   private static int[] n = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};


   public nr_dj(Char var1, nr_cp var2) {
      this.j = var1;
      this.k = var2;
   }

   public final void a() {
      if(this.j.aP != null || this.j.aT != null) {
         if(this.j.aP != null) {
            this.d = this.j.aP.m;
            this.e = this.j.aP.n - this.j.aP.w / 4;
         } else if(this.j.aT != null) {
            this.d = this.j.aT.cx;
            this.e = this.j.aT.cy - this.j.aT.al / 4;
         }

         int var1 = this.d - this.b;
         int var2 = this.e - this.c;
         byte var3 = 4;
         if(var1 + var2 < 60) {
            var3 = 3;
         } else if(var1 + var2 < 30) {
            var3 = 2;
         }

         if(this.b != this.d) {
            if(var1 > 0 && var1 < 5) {
               this.b = this.d;
            } else if(var1 < 0 && var1 > -5) {
               this.b = this.d;
            } else {
               this.f = this.d - this.b << 2;
               this.h += this.f;
               this.b += this.h >> var3;
               this.h &= 15;
            }
         }

         if(this.c != this.e) {
            if(var2 > 0 && var2 < 5) {
               this.c = this.e;
            } else if(var2 < 0 && var2 > -5) {
               this.c = this.e;
            } else {
               this.g = this.e - this.c << 2;
               this.i += this.g;
               this.c += this.i >> var3;
               this.i &= 15;
            }
         }

         var1 = 0;
         var2 = 0;
         int var5 = 0;
         int var4 = 0;
         if(this.j.aP != null) {
            var1 = this.d - this.j.aP.v / 4;
            var5 = this.d + this.j.aP.v / 4;
            var2 = this.e - this.j.aP.w / 4;
            var4 = this.e + this.j.aP.w / 4;
         } else if(this.j.aT != null) {
            var1 = this.d - this.j.aT.ak / 4;
            var5 = this.d + this.j.aT.ak / 4;
            var2 = this.e - this.j.aT.al / 4;
            var4 = this.e + this.j.aT.al / 4;
         }

         if(this.a > 0) {
            --this.a;
         }

         if(this.a != 0 && (this.b < var1 || this.b > var5 || this.c < var2 || this.c > var4)) {
            return;
         }
      }

      this.b();
   }

   private void b() {
      this.j.ca = null;
      this.b = this.c = this.d = this.e = this.f = this.g = this.h = this.i = 0;
      this.j.D();
   }

   public final void a(mGraphics var1) {
      int var2 = this.d - this.b;
      int var3 = this.e - this.c;
      var2 = Res.a(var2, -var3);
      var3 = 0;

      int var10000;
      while(true) {
         if(var3 >= m.length - 1) {
            var10000 = 0;
            break;
         }

         if(var2 >= m[var3] && var2 <= m[var3 + 1]) {
            var10000 = var3 >= 16?0:var3;
            break;
         }

         ++var3;
      }

      var2 = var10000;
      SmallImage.drawSmallImage(var1, this.k.a[l[var2]], this.b, this.c, n[var2], 3);
   }
}
