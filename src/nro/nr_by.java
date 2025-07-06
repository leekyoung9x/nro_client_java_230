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

public final class nr_by extends Mob implements nr_bm {

   private static Image Y = Main.loadImage("/mainImage/shadowBig.png");
   private static nr_cg Z;
   public int a;
   public boolean b;
   private int aa;
   private int ab;
   private boolean ac;
   private int ad;
   private boolean ae = true;
   private int af;
   private int ag;
   private boolean ah;
   private boolean ai;
   private int aj;
   private int ak;
   private Char[] al;
   private int[] am;
   private byte an;
   private int[] ao = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
   private int[] ap = new int[]{37, 37, 37, 38, 38, 38, 39, 39, 40, 40, 40, 39, 39, 39, 38, 38, 38};
   private int[] aq;
   private int[] ar;
   private int[] as;
   private int[] at;
   private int[] au;
   private int[] av;
   private int[] aw;
   private boolean ax;


   public final void C() {
      Z = null;
      Z = new nr_cg();
      String var1 = "/x" + mGraphics.zoomLevel + "/effectdata/" + 100 + "/data";

      try {
         Z.b(var1);
         Z.a = Main.c("/effectdata/100/img.png");
      } catch (Exception var2) {
         Service.gI().requestModTemplate(super.C);
      }

      super.p = 2;
      super.v = Z.f;
      super.w = Z.g;
   }

   public final void a(short var1) {
      super.d = true;
      super.e = var1;
   }

   public final void a() {
      super.d = false;
   }

   public nr_by(int var1, short var2, short var3, int var4, int var5, int var6, int var7) {
      int[] var10000 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
      var10000 = new int[]{1, 1, 2, 2, 3, 3, 2};
      this.aq = new int[]{0, 0, 34, 34, 35, 35, 36, 36, 2, 2, 1, 1};
      this.ar = new int[]{0, 0, 0, 4, 4, 6, 6, 9, 9, 10, 10, 13, 13, 15, 15, 17, 17, 19, 19, 21, 21, 23, 23};
      this.as = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.at = new int[]{37, 37, 5, 5, 7, 7, 11, 11, 14, 14, 16, 16, 18, 18, 20, 20, 22, 22, 24, 24};
      this.au = new int[]{37, 37, 37, 38, 38, 5, 5, 7, 7, 11, 11, 27, 27, 29, 29, 31, 31, 33, 33, 38, 38};
      this.av = new int[]{8, 8, 9, 9, 10, 10, 12, 12};
      this.aw = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      byte[] var10 = new byte[]{(byte)-1, (byte)1};
      super.t = super.m = var2 + 20;
      super.u = super.n = var3;
      super.y = var1;
      super.k = var5;
      super.l = var6;
      super.C = 70;
      super.R = 100;
      this.A();
      if(var7 == 0) {
         Z = null;
         Z = new nr_cg();
         String var9 = "/x" + mGraphics.zoomLevel + "/effectdata/" + 101 + "/data";

         try {
            Z.b(var9);
            Z.a = Main.c("/effectdata/101/img.png");
         } catch (Exception var8) {
            Service.gI().requestModTemplate(super.C);
         }

         super.v = Z.f;
         super.w = Z.g;
      }

      if(var7 == 1) {
         this.C();
      }

      if(var7 == 2) {
         this.C();
         this.b = true;
      }

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
         nr_by var1 = this;
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
            this.a(this.b?this.ap:this.ao);
            if(GameCanvas.gameTick % 5 == 0) {
               ServerEffect.addServerEffect(167, Res.b(super.m - 60 / 2, super.m + 60 / 2), Res.b(this.getY() + 40 / 2, this.getY() + 40), 1);
            }

            if(super.m != super.t || super.n != super.u) {
               super.m += (super.t - super.m) / 4;
               super.n += (super.u - super.n) / 4;
            }
            break;
         case 2:
            this.a(this.b?this.ap:this.ao);
            if(super.m != super.t || super.n != super.u) {
               super.m += (super.t - super.m) / 4;
               super.n += (super.u - super.n) / 4;
            }

            return;
         case 3:
            this.f();
            return;
         case 4:
            super.x = 0;
            if(this.ah) {
               ++this.aj;
               super.n -= this.aj;
               this.a(this.av);
               if(super.n <= -500) {
                  this.ah = false;
                  this.ai = true;
                  this.aj = 0;
               }
            }

            if(this.ai) {
               super.m = this.a;
               this.aj += 2;
               super.n += this.aj;
               this.a(this.aw);
               if(super.n > super.u) {
                  super.n = super.u;
                  this.ai = false;
                  this.aj = 0;
                  super.p = 2;
                  GameScr.bu = 10;
                  this.ax = true;
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

   public final void D() {
      super.p = 4;
      this.ah = true;
   }

   public final void a(Char[] var1, int[] var2, byte var3) {
      this.al = var1;
      this.am = var2;
      this.an = var3;
      this.af = 0;
      if(var3 < 3) {
         super.p = 3;
      }

      if(var3 == 3) {
         this.ah = true;
         super.p = 4;
      }

      if(var3 == 4) {
         for(int var4 = 0; var4 < this.al.length; ++var4) {
            this.al[var4].doInjure(this.am[var4], 0, false, false);
         }
      }

      if(var3 == 7) {
         super.p = 3;
      }

   }

   public final void f() {
      if(this.an == 7) {
         if(this.af > 8) {
            this.af = 8;
         }

         this.a(this.aq);
         if(GameCanvas.gameTick % 4 == 0) {
            ServerEffect.addServerEffect(70, super.m + (super.o == 1?15:-15), super.n - 40, 1);
         }
      }

      int var1;
      if(this.an == 0) {
         if(this.af == this.aq.length - 1) {
            super.p = 2;
         }

         super.o = super.m < this.al[0].cx?1:-1;
         this.a(this.aq);
         if(this.af == 8) {
            for(var1 = 0; var1 < this.al.length; ++var1) {
               nr_ag.a(super.m + (super.o == 1?45:-45), super.n - 30, true, this.am[var1], 0, this.al[var1], 24);
            }
         }
      }

      if(this.an == 1) {
         if(this.af == (this.b?this.at.length - 1:this.ar.length - 1)) {
            super.p = 2;
         }

         super.o = super.m < this.al[0].cx?1:-1;
         this.a(this.b?this.at:this.ar);
         super.m += (this.al[0].cx - super.m) / 4;
         super.n += (this.al[0].cy - super.n) / 4;
         if(this.af == 18) {
            for(var1 = 0; var1 < this.al.length; ++var1) {
               this.al[var1].doInjure(this.am[var1], 0, false, false);
               ServerEffect.addServerEffect(102, this.al[var1].cx, this.al[var1].cy, 1);
            }
         }
      }

      if(this.an == 2) {
         if(this.af == (this.b?this.au.length - 1:this.as.length - 1)) {
            super.p = 2;
         }

         super.o = super.m < this.al[0].cx?1:-1;
         this.a(this.b?this.au:this.as);
         if(this.af == 13) {
            GameScr.bu = 10;
            this.ax = true;

            for(var1 = 0; var1 < this.al.length; ++var1) {
               this.al[var1].doInjure(this.am[var1], 0, false, false);
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
         if(this.ax) {
            ++this.ak;
            EffecMn.addEff(new Effect(this.an == 2?19:22, super.m + this.ak * 50, super.n + 25, 2, 1, -1));
            EffecMn.addEff(new Effect(this.an == 2?19:22, super.m - this.ak * 50, super.n + 25, 2, 1, -1));
            if(this.ak == 50) {
               this.ak = 0;
               this.ax = false;
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
      return this.b?super.n - 20:super.n - 60;
   }

   public final int getH() {
      return 40;
   }

   public final int getW() {
      return 60;
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
