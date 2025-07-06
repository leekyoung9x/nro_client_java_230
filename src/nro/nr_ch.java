package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Mob;
import nro.Controller;
import nro.Char;
import nro.ServerEffect;
import nro.nr_bm;
import nro.Service;
import nro.TileMap;
import nro.Res;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class nr_ch extends Mob implements nr_bm {

   private static Image Y = Main.loadImage("/mainImage/shadowBig.png");
   public int a;
   public int b;
   private int Z;
   private int aa;
   private boolean ab = true;
   private int ac;
   private int ad;
   private Char[] ae;
   private int[] af;
   private byte ag;
   private int[][] ah;


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

   public nr_ch(int var1, short var2, short var3, int var4, int var5, int var6) {
      byte[] var10000 = new byte[]{(byte)-1, (byte)1};
      this.ah = new int[][]{{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};
      super.y = var1;
      super.m = super.t = var2 + 20;
      super.n = super.u = var3;
      this.a = super.m;
      this.b = super.n;
      super.l = var6;
      super.k = var5;
      super.C = var4;
      super.R = 100;
      this.A();
      if(Mob.c[super.C].f == null) {
         Service.gI().requestModTemplate(super.C);
      }

      super.p = 2;
      this.ah = null;
   }

   public final void a(int[] var1) {
      ++this.ac;
      if(this.ac > var1.length - 1) {
         this.ac = 0;
      }

      this.ad = var1[this.ac];
   }

   public final void b() {}

   public final void c() {
      if(this.ah == null && Mob.c[super.C].f != null) {
         this.B();
      }

      if(this.ah != null) {
         if(this.i()) {
            nr_ch var1 = this;
            int var2 = 0;
            this.Z = super.m;
            if(TileMap.a(super.m, super.n, 2)) {
               this.aa = super.n;
            } else {
               this.aa = super.n;

               while(var2 < 30) {
                  ++var2;
                  var1.aa += 24;
                  if(TileMap.a(var1.Z, var1.aa, 2)) {
                     if(var1.aa % 24 != 0) {
                        var1.aa -= var1.aa % 24;
                     }
                     break;
                  }
               }
            }

            switch(super.p) {
            case 0:
            case 1:
               ++this.ac;
               if(this.ac > this.ah[13].length - 1) {
                  this.ac = this.ah[13].length - 1;
               }

               this.ad = this.ah[13][this.ac];
               if(super.m != this.a || super.n != this.b) {
                  super.m += (this.a - super.m) / 4;
                  super.n += (this.b - super.n) / 4;
               }
               break;
            case 2:
               this.a(this.ah[0]);
               if(super.m != this.a || super.n != this.b) {
                  super.m += (this.a - super.m) / 4;
                  super.n += (this.b - super.n) / 4;
               }

               return;
            case 3:
               this.f();
               return;
            case 4:
            default:
               break;
            case 5:
               super.x = 0;
               this.g();
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
   }

   public final void a(Char var1) {
      super.D = var1;
      super.q = 0;
      super.r = 0;
      super.p = 3;
      this.ac = 0;
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

   public final void C() {
      super.p = 4;
   }

   public final void a(Char[] var1, int[] var2, byte var3, byte var4) {
      this.ae = var1;
      this.af = var2;
      this.ag = var3;
      super.o = var4;
      super.p = 3;
      if(super.m != this.a || super.n != this.b) {
         super.m += (this.a - super.m) / 4;
         super.n += (this.b - super.n) / 4;
      }

   }

   public final void f() {
      if(this.ac == this.ah[this.ag + 1].length - 1) {
         super.p = 2;
      }

      this.a(this.ah[this.ag + 1]);
      if(this.ac == this.ah[15][this.ag - 1]) {
         for(int var1 = 0; var1 < this.ae.length; ++var1) {
            this.ae[var1].doInjure(this.af[var1], 0, false, false);
            ServerEffect.addServerEffect(this.ah[16][this.ag - 1], this.ae[var1].cx, this.ae[var1].cy, 1);
         }
      }

   }

   public final void g() {
      this.a(this.ah[1]);
      byte var1;
      int var2 = var1 = Mob.c[super.C].b;
      if(Res.g(super.m - this.a) < var1) {
         var2 = Res.g(super.m - this.a);
      }

      super.m += super.m < this.a?var2:-var2;
      super.n = this.b;
      if(super.m < this.a) {
         super.o = 1;
      } else if(super.m > this.a) {
         super.o = -1;
      }

      if(Res.g(super.m - this.a) <= 1) {
         super.m = this.a;
         super.p = 2;
      }

   }

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
      if(Mob.c[super.C].f != null) {
         if(this.ab) {
            byte var4 = TileMap.i;
            if((TileMap.l < 114 || TileMap.l > 120) && TileMap.l != 127 && TileMap.l != 128) {
               if(TileMap.a(this.Z + var4 / 2, this.aa + 1, 4)) {
                  var1.e(this.Z / var4 * var4, (this.aa - 30) / var4 * var4, var4, 100);
               } else if(TileMap.a((this.Z - var4 / 2) / var4, (this.aa + 1) / var4) == 0) {
                  var1.e(this.Z / var4 * var4, (this.aa - 30) / var4 * var4, 100, 100);
               } else if(TileMap.a((this.Z + var4 / 2) / var4, (this.aa + 1) / var4) == 0) {
                  var1.e(this.Z / var4 * var4, (this.aa - 30) / var4 * var4, var4, 100);
               } else if(TileMap.a(this.Z - var4 / 2, this.aa + 1, 8)) {
                  var1.e(this.Z / 24 * var4, (this.aa - 30) / var4 * var4, var4, 100);
               }
            }

            var1.drawImage(Y, this.Z, this.aa - 5, 3);
            var1.e(GameScr.j, GameScr.k - GameCanvas.Z, GameScr.d, GameScr.e + 2 * GameCanvas.Z);
         }

         var1.a(0, GameCanvas.Z);
         Mob.c[super.C].f.a(var1, this.ad, super.m, super.n, super.o == 1?0:1, 2);
         var1.a(0, -GameCanvas.Z);
         int var2 = mGraphics.getImageWidth(super.T);
         int var3 = mGraphics.getImageHeight(super.T);
         int var8 = var2;
         int var6 = super.m - var2;
         int var7 = super.n - super.w - 5;
         int var5;
         if((var5 = (var2 << 1) * super.S / 100) > var2) {
            if((var5 -= var2) <= 0) {
               var5 = 0;
            }
         } else {
            var8 = var5;
            var5 = 0;
         }

         var1.drawImage(GameScr.aI, var6, var7, 20);
         var1.drawImage(GameScr.aI, var6 + var2, var7, 20);
         var1.drawRegion(super.T, 0, 0, var8, var3, 0, var6, var7, 20);
         var1.drawRegion(super.T, 0, 0, var5, var3, 0, var6 + var2, var7, 20);
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
      this.ac = 0;
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
      return super.n;
   }

   public final int getH() {
      return super.w;
   }

   public final int getW() {
      return super.v;
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

   public final void a(short var1, short var2) {
      if(var2 != -1) {
         if(Res.a(super.m, super.n, this.a, this.b) > 100) {
            super.m = var1;
            super.n = var2;
            super.p = 2;
         } else {
            this.a = var1;
            this.b = var2;
            super.p = 5;
         }
      } else {
         this.a = var1;
         super.p = 5;
      }
   }

   public final void B() {
      this.ah = (int[][])Controller.c.get(String.valueOf(super.C));
      super.v = Mob.c[super.C].f.f;
      super.w = Mob.c[super.C].f.g;
   }

   public final void D() {
      super.p = 0;
   }
}
