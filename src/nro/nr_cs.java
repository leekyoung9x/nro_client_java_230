package nro;

import main.GameCanvas;
import nro.Char;
import nro.mFont;
import nro.mGraphics;
import nro.GameScr;

public final class nr_cs {

   public short a;
   public int b = 0;
   public int c;
   private long d;
   private long e;
   private boolean f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;
   private String k;
   private int l = 100;


   public nr_cs(short var1, int var2) {
      this.a = var1;
      this.c = var2 / 60;
      this.b = var2 % 60;
      this.g = var2;
      this.h = var2;
      this.d = this.e = System.currentTimeMillis();
      this.f = var1 == 14;
   }

   public nr_cs() {}

   public static boolean a(int var0) {
      for(int var1 = 0; var1 < Char.bq.size(); ++var1) {
         if(((nr_cs)Char.bq.elementAt(var1)).a == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean b(int var0) {
      for(int var1 = 0; var1 < GameScr.bv.size(); ++var1) {
         if(((nr_cs)GameScr.bv.elementAt(var1)).a == var0) {
            return true;
         }
      }

      return false;
   }

   public static nr_cs c(int var0) {
      for(int var1 = 0; var1 < Char.bq.size(); ++var1) {
         nr_cs var2;
         if((var2 = (nr_cs)Char.bq.elementAt(var1)).a == var0) {
            return var2;
         }
      }

      return null;
   }

   public static nr_cs d(int var0) {
      for(int var1 = 0; var1 < GameScr.bv.size(); ++var1) {
         nr_cs var2;
         if((var2 = (nr_cs)GameScr.bv.elementAt(var1)).a == var0) {
            return var2;
         }
      }

      return null;
   }

   public final void a(byte var1, String var2, int var3) {
      if(var3 == -1) {
         this.j = true;
      } else {
         this.j = false;
      }

      this.i = true;
      this.c = var3 / 60;
      this.b = var3 % 60;
      this.a = var1;
      this.g = var3;
      this.h = var3;
      this.k = var2;
      this.d = this.e = System.currentTimeMillis();
      this.f = this.a == 14;
   }

   public final void a(int var1, boolean var2) {
      this.c = var1 / 60;
      this.b = var1 % 60;
      this.g = var1;
      this.h = var1;
      this.i = false;
      this.d = this.e = System.currentTimeMillis();
   }

   public final void a(mGraphics var1, int var2, int var3) {
      if(this.f) {
         if(Char.myCharz() != null) {
            var2 = GameCanvas.z / 2 - 40;
            var3 = GameCanvas.A - 80;
            var1.a(8421504);
            var1.d(var2, var3, 80, 2);
            var1.a(16777215);
            if(this.l > 0) {
               var1.d(var2, var3, 80 * this.l / 100, 2);
               return;
            }
         }
      } else {
         String var4 = this.c + "\'";
         if(this.c <= 0) {
            var4 = this.b + "s";
         }

         if(this.c < 0) {
            var4 = "";
         }

         if(this.j) {
            var4 = "";
         }

         mFont.c.a(var1, this.k + " " + var4, var2, var3, 0, mFont.tahoma_7b_dark);
      }

   }

   public final void a() {
      this.d = System.currentTimeMillis();
      if(this.d - this.e >= 1000L) {
         this.e = System.currentTimeMillis();
         --this.b;
         --this.h;
         if(this.b <= 0) {
            this.b = 60;
            --this.c;
         }

         if(this.g > 0) {
            this.l = this.h * 100 / this.g;
         }
      }

      if(this.c < 0 && !this.i) {
         Char.bq.removeElement(this);
      }

      if(this.c < 0 && this.i && !this.j) {
         GameScr.bv.removeElement(this);
      }

   }
}
