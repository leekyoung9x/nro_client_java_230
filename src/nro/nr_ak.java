package nro;

import main.GameCanvas;
import nro.Char;
import nro.nr_cg;
import nro.Res;
import nro.Effect;
import nro.EffecMn;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class nr_ak extends Char {

   private static nr_cg a;
   private static nr_cg b;
   private int c = 0;
   private int d;
   private boolean e;
   private Effect f;
   private Char g;
   private int h;
   private int i;
   private Char[] j;
   private int[] k;
   private int l;
   private int[] m = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
   private int[] n = new int[]{0, 0, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9, 10, 10};
   private int[] cW = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12};
   private int[] cX = new int[]{13, 13, 14, 14, 15, 15, 16, 16};
   private int[][] cY;
   private byte cZ;
   private int da;
   private int db;


   public final void b(int var1) {
      this.f = new Effect(105, super.cx, super.cy + 20, 2, 1, -1);
      EffecMn.addEff(this.f);
      if(var1 == Char.myCharz().charID) {
         this.g = Char.myCharz();
      } else {
         this.g = GameScr.findCharInMap(var1);
      }
   }

   public final void a(int[] var1) {
      if(this.cZ == 0) {
         if(this.c == 11) {
            this.e = true;
            EffecMn.addEff(new Effect(19, super.cx, super.cy + 20, 2, 1, -1));
         }

         if(this.c >= var1.length - 1) {
            this.cZ = 2;
            return;
         }
      }

      if(this.cZ == 1 && this.c == var1.length - 1) {
         this.cZ = 3;
         super.cy -= 15;
      } else {
         ++this.c;
         if(this.c > var1.length - 1) {
            this.c = 0;
         }

         this.da = var1[this.c];
      }
   }

   public nr_ak() {
      this.cY = new int[][]{this.m, this.n, this.cW, this.cX};
      this.cZ = -1;
      a = null;
      a = new nr_cg();
      String var1 = "/x" + mGraphics.zoomLevel + "/effectdata/" + 102 + "/data";

      try {
         a.b(var1);
         a.a = Main.c("/effectdata/102/img.png");
      } catch (Exception var3) {
         ;
      }

      b = null;
      b = new nr_cg();
      var1 = "/x" + mGraphics.zoomLevel + "/effectdata/" + 103 + "/data";

      try {
         b.b(var1);
         b.a = Main.c("/effectdata/103/img.png");
      } catch (Exception var2) {
         ;
      }
   }

   public final void a(byte var1, short var2, short var3, Char[] var4, int[] var5) {
      this.cZ = var1;
      this.h = var2;
      this.i = var3;
      this.d = super.I;
      super.I = this.h > super.cx?1:-1;
      this.j = var4;
      this.k = var5;
   }

   public final void a() {
      if(this.g != null) {
         if(this.f.e >= 30) {
            this.f.f += (super.cx - this.f.f) / 4;
            this.f.g += (super.cy - this.f.g) / 4;
            this.g.cx = this.f.f;
            this.g.cy = this.f.g;
            this.g.ci = true;
         } else {
            this.f.j = this.f.f > this.g.cx?1:0;
            this.f.f += (this.g.cx - this.f.f) / 3;
            this.f.g += (this.g.cy - this.f.g) / 3;
         }
      }

      if(this.cZ == -1) {
         super.a();
      } else {
         if(this.cZ == 0 && this.e && GameCanvas.gameTick % 2 == 0) {
            this.l += this.h > super.cx?30:-30;
            Effect var1;
            (var1 = new Effect(103, super.cx + this.l, super.cy + 20, 2, 1, -1)).j = this.h > super.cx?0:1;
            EffecMn.addEff(var1);
            if(super.I == 1 && super.cx + this.l >= this.h || super.I == -1 && super.cx + this.l <= this.h) {
               this.e = false;
               this.cZ = -1;
               this.l = 0;
               this.c = 0;
               super.I = this.d;

               for(int var2 = 0; var2 < this.j.length; ++var2) {
                  this.j[var2].doInjure(this.k[var2], 0, false, false);
               }
            }
         }

         if(this.cZ == 3) {
            this.h = this.j[this.db].cx;
            this.i = this.j[this.db].cy;
            super.cx += (this.h - super.cx) / 3;
            super.cy += (this.i - super.cy) / 3;
            if(GameCanvas.gameTick % 5 == 0) {
               EffecMn.addEff(new Effect(19, super.cx, super.cy, 2, 1, -1));
            }

            if(Res.g(super.cx - this.h) <= 20 && Res.g(super.cy - this.i) <= 20) {
               super.cx = this.h;
               super.cy = this.i;
               this.j[this.db].doInjure(this.k[this.db], 0, false, false);
               ++this.db;
               if(this.db == this.j.length) {
                  this.cZ = -1;
                  this.db = 0;
               }
            }
         }

      }
   }

   public final void a(mGraphics var1) {
      if(this.cZ == -1) {
         super.a(var1);
      } else {
         this.c(var1);
         var1.a(0, GameCanvas.Z);
         this.a(this.cY[this.cZ]);
         if(this.cZ != 0 && this.cZ != 1) {
            b.a(var1, this.da, super.cx, super.cy + super.bQ, super.I == 1?0:1, 2);
         } else {
            a.a(var1, this.da, super.cx, super.cy + super.bQ, super.I == 1?0:1, 2);
         }

         var1.a(0, -GameCanvas.Z);
      }
   }
}
