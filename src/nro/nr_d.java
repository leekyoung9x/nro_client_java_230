package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Mob;
import nro.Char;
import nro.nr_ag;
import nro.ServerEffect;
import nro.nr_bm;
import nro.Service;
import nro.TileMap;
import nro.nr_cg;
import nro.Res;
import nro.Effect;
import nro.EffecMn;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class nr_d extends Mob implements nr_bm {

   private static Image Y = Main.loadImage("/mainImage/shadowBig.png");
   private static nr_cg Z;
   public int a;
   public int b;
   private int aa;
   private int ab;
   private boolean ac;
   private int ad;
   private boolean ae = true;
   private int af;
   private int ag;
   private boolean ah;
   private int ai;
   private int aj;
   private Char[] ak;
   private int[] al;
   private byte am;
   private int[] an = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
   private int[] ao;
   private int[] ap;
   private int[] aq;
   private int[] ar;
   private boolean as;


   static {
      Main.loadImage("/mainImage/myTexture2dmobHP.png");
   }

   public final void a(short var1) {
      super.d = true;
      super.e = var1;
   }

   public final void a() {
      super.d = false;
   }

   public nr_d(int var1, short var2, short var3, int var4, int var5, int var6) {
      int[] var10000 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
      var10000 = new int[]{1, 1, 2, 2, 3, 3, 2};
      this.ao = new int[]{0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9};
      this.ap = new int[]{0, 0, 0, 10, 10, 10, 11, 11, 11, 12, 12, 12};
      var10000 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.aq = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
      this.ar = new int[]{6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
      byte[] var9 = new byte[]{(byte)-1, (byte)1};
      super.y = var1;
      this.a = super.m = var2 + 20;
      this.b = super.n = var3;
      super.u = var3;
      super.k = var5;
      super.l = var6;
      super.C = 72;
      super.R = 100;
      this.A();
      Z = null;
      Z = new nr_cg();
      String var8 = "/x" + mGraphics.zoomLevel + "/effectdata/" + 109 + "/data";

      try {
         Z.b(var8);
         Z.a = Main.c("/effectdata/109/img.png");
      } catch (Exception var7) {
         Service.gI().requestModTemplate(super.C);
      }

      super.v = Z.f;
      super.w = Z.g;
      super.p = 2;
   }

   public final void a(int[] var1) {
      ++this.af;
      if(this.af > var1.length - 1) {
         this.af = 0;
      }

      this.ag = var1[this.af];
   }

   public final void b() {}

   public final void c() {
      if(this.i()) {
         nr_d var1 = this;
         byte var2 = TileMap.i;
         this.aa = super.m;
         this.ad = 0;
         if(this.ab > 0 && !TileMap.a(this.aa, this.ab, 2)) {
            if(TileMap.a(this.aa / var2, this.ab / var2) == 0) {
               this.ac = true;
            } else if(TileMap.a(this.aa / var2, this.ab / var2) != 0 && !TileMap.a(this.aa, this.ab, 2)) {
               this.aa = super.m;
               this.ab = super.n;
               this.ac = false;
            }

            while(var1.ac && var1.ad < 10) {
               ++var1.ad;
               var1.ab += 24;
               if(TileMap.a(var1.aa, var1.ab, 2)) {
                  if(var1.ab % 24 != 0) {
                     var1.ab -= var1.ab % 24;
                  }
                  break;
               }
            }
         }

         switch(super.p) {
         case 0:
         case 1:
            this.a(this.an);
            if(GameCanvas.gameTick % 5 == 0) {
               ServerEffect.addServerEffect(167, Res.b(super.m - 50 / 2, super.m + 50 / 2), Res.b(super.n - 50 + 40 / 2, super.n - 50 + 40), 1);
            }

            if(super.m != this.a || super.n != this.b) {
               super.m += (this.a - super.m) / 4;
               super.n += (this.b - super.n) / 4;
            }
            break;
         case 2:
            this.a(this.an);
            if(super.m != this.a || super.n != this.b) {
               super.m += (this.a - super.m) / 4;
               super.n += (this.b - super.n) / 4;
            }

            return;
         case 3:
            this.f();
            return;
         case 4:
            super.x = 0;
            if(this.ah) {
               super.m = this.a;
               this.ai += 2;
               super.n += this.ai;
               this.a(this.ar);
               if(super.n > super.u) {
                  super.n = super.u;
                  this.ah = false;
                  this.ai = 0;
                  super.p = 2;
                  GameScr.bu = 10;
                  this.as = true;
               }
            }

            return;
         case 5:
            super.x = 0;
            return;
         case 6:
            super.x = 0;
            ++super.q;
            super.n += super.q;
            if(super.n >= super.u) {
               super.n = super.u;
               super.q = 0;
               super.p = 5;
               return;
            }
            break;
         case 7:
            return;
         }

      }
   }

   public final void d() {}

   public final void a(Char var1) {
      super.D = var1;
      super.q = 0;
      super.r = 0;
      super.p = 3;
      this.af = 0;
      super.o = var1.cx > super.m?1:-1;
      int var2 = var1.cx;
      int var3 = var1.cy;
      if(Res.g(var2 - super.m) < super.v << 1 && Res.g(var3 - super.n) < super.w << 1) {
         if(super.m < var2) {
            super.m = var2 - super.v;
         } else {
            super.m = var2 + super.v;
         }

         super.s = 0;
      } else {
         super.s = 1;
      }
   }

   final boolean e() {
      return super.C >= 58 && super.C <= 65 || super.C == 67 || super.C == 68;
   }

   public final void a(Char[] var1, int[] var2, byte var3) {
      super.p = 3;
      this.ak = var1;
      this.al = var2;
      this.am = var3;
      this.af = 0;
   }

   public final void f() {
      int var1;
      if(this.am == 0) {
         if(this.af == this.ao.length - 1) {
            super.p = 2;
         }

         super.o = super.m < this.ak[0].cx?1:-1;
         this.a(this.ao);
         super.m += (this.ak[0].cx - super.m) / 4;
         super.n += (this.ak[0].cy - super.n) / 4;
         this.a = super.m;
         if(this.af == 8) {
            for(var1 = 0; var1 < this.ak.length; ++var1) {
               this.ak[var1].doInjure(this.al[var1], 0, false, false);
               ServerEffect.addServerEffect(102, this.ak[var1].cx, this.ak[var1].cy, 1);
            }
         }
      }

      if(this.am == 1) {
         if(this.af == this.ap.length - 1) {
            super.p = 2;
         }

         super.o = super.m < this.ak[0].cx?1:-1;
         this.a(this.ap);
         if(this.af == 8) {
            for(var1 = 0; var1 < this.ak.length; ++var1) {
               nr_ag.a(super.m + (super.o == 1?45:-45), super.n - 25, true, this.al[var1], 0, this.ak[var1], 24);
            }
         }
      }

      if(this.am == 2) {
         if(this.af == this.aq.length - 1) {
            super.p = 2;
         }

         super.o = super.m < this.ak[0].cx?1:-1;
         this.a(this.aq);
         super.m += (this.ak[0].cx - super.m) / 4;
         this.a = super.m;
         this.b = super.n;
         if(this.af == 12) {
            for(var1 = 0; var1 < this.ak.length; ++var1) {
               this.ak[var1].doInjure(this.al[var1], 0, false, false);
               ServerEffect.addServerEffect(102, this.ak[var1].cx, this.ak[var1].cy, 1);
            }
         }
      }

   }

   public final void g() {}

   public final boolean h() {
      return super.m < GameScr.j?false:(super.m > GameScr.j + GameScr.d?false:(super.n < GameScr.k?false:(super.n > GameScr.k + GameScr.e + 30?false:super.p != 0)));
   }

   public final boolean i() {
      return super.p != 0;
   }

   public final boolean j() {
      return super.I || super.H > 0;
   }

   public final void a(mGraphics var1) {
      if(Z != null) {
         if(this.ae && super.p != 0) {
            var1.drawImage(Y, this.aa, super.u, 3);
            var1.e(GameScr.j, GameScr.k - GameCanvas.Z, GameScr.d, GameScr.e + 2 * GameCanvas.Z);
         }

         var1.a(0, GameCanvas.Z);
         Z.a(var1, this.ag, super.m, super.n, super.o == 1?0:1, 2);
         var1.a(0, -GameCanvas.Z);
         int var2 = mGraphics.getImageWidth(super.T);
         int var3 = mGraphics.getImageHeight(super.T);
         int var4 = var2;
         int var6 = super.m - var2;
         int var7 = super.n - super.w - 5;
         int var5;
         if((var5 = (var2 << 1) * super.S / 100) > var2) {
            if((var5 -= var2) <= 0) {
               var5 = 0;
            }
         } else {
            var4 = var5;
            var5 = 0;
         }

         var1.drawImage(GameScr.aI, var6, var7, 20);
         var1.drawImage(GameScr.aI, var6 + var2, var7, 20);
         var1.drawRegion(super.T, 0, 0, var4, var3, 0, var6, var7, 20);
         var1.drawRegion(super.T, 0, 0, var5, var3, 0, var6 + var2, var7, 20);
         if(this.as) {
            ++this.aj;
            EffecMn.addEff(new Effect(this.am == 2?19:22, super.m + this.aj * 50, super.n + 25, 2, 1, -1));
            EffecMn.addEff(new Effect(this.am == 2?19:22, super.m - this.aj * 50, super.n + 25, 2, 1, -1));
            if(this.aj == 50) {
               this.aj = 0;
               this.as = false;
            }
         }

      }
   }

   public final void k() {
      super.k = 0;
      super.k = 0;
      super.p = 1;
      super.q = -3;
      super.r = -super.o;
      super.s = 0;
   }

   public final void a(Mob var1) {
      super.D = null;
      super.q = 0;
      super.r = 0;
      super.p = 3;
      this.af = 0;
      super.o = var1.m > super.m?1:-1;
      int var2 = var1.m;
      int var3 = var1.n;
      if(Res.g(var2 - super.m) < super.v << 1 && Res.g(var3 - super.n) < super.w << 1) {
         if(super.m < var2) {
            super.m = var2 - super.v;
         } else {
            super.m = var2 + super.v;
         }

         super.s = 0;
      } else {
         super.s = 1;
      }
   }

   public final int getX() {
      return super.m;
   }

   public final int getY() {
      return super.n - 50;
   }

   public final int getH() {
      return 40;
   }

   public final int getW() {
      return 50;
   }

   public final void stopMoving() {
      if(super.p == 5) {
         super.p = 2;
         super.q = super.r = super.s = 0;
      }

   }

   public final boolean isInvisible() {
      return super.p == 0 || super.p == 1;
   }

   public final void r() {
      if(super.j != 0) {
         super.j = 0;
      }

   }

   public final void s() {}

   public final void t() {}
}
