package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.nr_bg;
import nro.nr_cz;
import nro.Res;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class nr_cd {

   private MyVector d = new MyVector("EffectEnd VecEffEnd");
   private int e = 0;
   private int f = 0;
   private nr_cz g;
   private int h;
   private int i;
   private int j;
   public int a;
   private int k = 0;
   private int l;
   private int m;
   private int n;
   public boolean b;
   private boolean o;
   public static short[][] c = new short[][]{{(short)68, (short)264, (short)4}, {(short)30, (short)120, (short)4}, {(short)66, (short)280, (short)4}, {(short)0, (short)0, (short)1}, {(short)111, (short)68, (short)2}, {(short)90, (short)68, (short)2}, {(short)125, (short)68, (short)2}, {(short)47, (short)282, (short)6}, new short[2]};


   public static Image a(int var0) {
      if(var0 < 0) {
         return null;
      } else {
         String var3 = "/e/e_" + var0 + ".png";
         Image var1 = null;

         try {
            var1 = Main.c(var3);
         } catch (Exception var2) {
            ;
         }

         return var1;
      }
   }

   public nr_cd(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.e = var1;
      this.f = var2;
      this.i = var3;
      this.j = var4;
      this.a = var5;
      Main.c();
      this.b = this.o = false;
      a(this.i, this.j);
      switch(this.e) {
      case 0:
      case 1:
      case 2:
         var2 = this.e;
         switch(var2) {
         case 0:
            this.g = new nr_cz(4);
            break;
         case 1:
            this.g = new nr_cz(5);
            break;
         case 2:
            this.g = new nr_cz(6);
         }

         this.h = 100;
         this.n = GameCanvas.A / 3 + 10;
         this.l = 10;
         this.m = 0;
         this.o = false;
         return;
      case 3:
         this.b();
      default:
      }
   }

   private static void a(int var0, int var1) {
      try {
         Res.d(3);
      } catch (Exception var2) {
         ;
      }
   }

   public final void a() {
      ++this.k;
      switch(this.e) {
      case 0:
      case 1:
      case 2:
         this.i = GameCanvas.B;
         this.j = this.m;
         if(this.k > this.h) {
            this.b = true;
         }

         ++this.l;
         if(this.l > 15) {
            this.l = 15;
         }

         if(this.m + this.l >= this.n) {
            this.m = this.n;
            if(!this.o) {
               this.o = true;
               if(this.f != -1) {
                  GameScr.a(this.f, 0, this.i, this.j, this.a, 0);
               }
            }

            return;
         }

         this.m += this.l;
         break;
      case 3:
         nr_cd var1 = this;

         for(int var2 = 0; var2 < var1.d.size(); ++var2) {
            nr_bg var3;
            nr_bg var4;
            ++(var4 = var3 = (nr_bg)var1.d.elementAt(var2)).c;
            var4.a = var4.a;
            var4.b = var4.b;
            if(var3.c - var3.d > var3.e.c * 3 - 1) {
               var3.c = 0;
               if(var1.f == 0) {
                  var3.d = Res.d(5);
                  byte var5 = 1;
                  if(var2 % 2 == 0) {
                     var5 = -1;
                  }

                  var3.a = var1.i + Res.d(c[5][0] / 2) * var5;
                  var3.b = var1.j - Res.d(c[5][1] / 2);
               }
            }
         }

         if(var1.k >= var1.h) {
            var1.b = true;
         }
      }

   }

   public final void a(mGraphics var1) {
      try {
         if(!this.b && this.k >= 0) {
            switch(this.e) {
            case 0:
            case 1:
            case 2:
               if(this.g != null) {
                  this.g.a(this.k / 5 % this.g.c, this.i, this.j, 0, 33, var1);
               }

               return;
            case 3:
               mGraphics var2 = var1;
               nr_cd var6 = this;

               for(int var3 = 0; var3 < var6.d.size(); ++var3) {
                  nr_bg var4;
                  if((var4 = (nr_bg)var6.d.elementAt(var3)).c - var4.d >= 0 && var4.e != null) {
                     var4.e.a((var4.c - var4.d) / 3 % var4.e.c, var4.a, var4.b, 0, 3, var2);
                  }
               }
            default:
            }
         }
      } catch (Exception var5) {
         ;
      }
   }

   private void b() {
      int var1 = Res.b(3, 5);
      this.h = 90;

      for(int var2 = 0; var2 < var1; ++var2) {
         nr_bg var3;
         (var3 = new nr_bg()).a = this.i + Res.e(4);
         var3.b = this.j + Res.e(5);
         if(this.f == 0) {
            var3.d = Res.d(5);
            byte var4 = 1;
            if(var2 % 2 == 0) {
               var4 = -1;
            }

            var3.a = this.i + Res.d(c[5][0] / 2) * var4;
            var3.b = this.j - Res.d(c[5][1] / 2);
            var3.e = new nr_cz(7);
         }

         this.d.addElement(var3);
      }

   }
}
