package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Char;
import nro.mResources;
import nro.mScreen;
import nro.SmallImage;
import nro.InfoDlg;
import nro.Service;
import nro.SoundMn;
import nro.TileMap;
import nro.nr_cf;
import nro.nr_cm;
import nro.nr_cr;
import nro.nr_cz;
import nro.mFont;
import nro.Res;
import nro.Effect;
import nro.nr_du;
import nro.EffecMn;
import nro.mGraphics;
import nro.Panel;
import nro.Main;
import nro.GameScr;
import nro.IActionListener;

public final class nr_ap extends mScreen implements IActionListener {

   public static nr_ap a;
   private nr_du[] b;
   private byte c = 0;
   private byte d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u = 0;
   private int v = 0;
   private int w;
   private int x;
   private int[] y;
   private int[] z;
   private int[] A;
   private int[] B;
   private short[] C;
   private long D;
   private long E;
   private boolean F;
   private boolean G;
   private boolean H;
   private short I;
   private static int J;
   private static int[] K;
   private static nr_cz L;
   private static nr_cz M;
   private static Image N;
   private static Image O;
   private byte[] P = new byte[]{(byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)20};
   private byte[] Q = new byte[]{(byte)0, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)3, (byte)3, (byte)3};


   public nr_ap() {
      (K = new int[2])[0] = 16;
      J = GameCanvas.A - 41;
      K[1] = GameCanvas.z - 40;
      Image var1 = Main.loadImage("/e/e_1.png");
      L = new nr_cz(var1, 30, 30);
      var1 = Main.loadImage("/e/e_0.png");
      M = new nr_cz(var1, 68, 65);
      var1 = Main.loadImage("/e/e_2.png");
      new nr_cz(var1, 66, 70);
      O = Main.loadImage("/e/nut2.png");
      N = Main.loadImage("/e/nut3.png");
      this.q = 230;
      this.o = GameCanvas.B - this.q / 2;
      this.r = 40;
      this.p = -this.r;
   }

   public static nr_ap a() {
      if(a == null) {
         a = new nr_ap();
      }

      return a;
   }

   public final void a(short[] var1, byte var2, int var3, short var4) {
      if(var1 != null && var1.length > 0) {
         this.k = Char.myCharz().cy - 10;
         this.e = GameCanvas.C / 3 + 10;
         if(this.e > 50) {
            this.e = 50;
         }

         this.f = 360;
         GameScr.j = GameScr.n / 2;
         this.g = GameScr.k + GameCanvas.C / 3 + 30;
         this.j = 175;
         this.h = 0;
         this.i = 360 / this.j;
         this.y = new int[this.j];
         this.z = new int[this.j];
         this.A = new int[this.j];
         this.B = new int[this.j];
         nr_ap var5 = this;
         if(!GameCanvas.lowGraphic) {
            for(int var6 = 0; var6 < var5.z.length; ++var6) {
               var5.z[var6] = Res.g(var5.e * Res.a(var5.h) / 1024);
               var5.y[var6] = Res.g(var5.e * Res.b(var5.h) / 1024);
               if(var5.h < 90) {
                  var5.A[var6] = var5.f + var5.y[var6];
                  var5.B[var6] = var5.g - var5.z[var6];
               } else if(var5.h >= 90 && var5.h < 180) {
                  var5.A[var6] = var5.f - var5.y[var6];
                  var5.B[var6] = var5.g - var5.z[var6];
               } else if(var5.h >= 180 && var5.h < 270) {
                  var5.A[var6] = var5.f - var5.y[var6];
                  var5.B[var6] = var5.g + var5.z[var6];
               } else {
                  var5.A[var6] = var5.f + var5.y[var6];
                  var5.B[var6] = var5.g + var5.z[var6];
               }

               var5.h += var5.i;
            }
         }

         this.b = new nr_du[var1.length];

         for(int var7 = 0; var7 < this.b.length; ++var7) {
            this.b[var7] = new nr_du();
            this.b[var7].i = var1[var7];
            this.b[var7].e = var7 * 25;
            this.b[var7].d = -999;
            this.b[var7].g = Res.b(2, 5);
            this.b[var7].h = Res.b(-1, 2);
            nr_du var8;
            (var8 = this.b[var7]).m = new Char();
            var8.m.charID = Res.b(-999, -800);
            var8.m.head = -1;
            var8.m.body = -1;
            var8.m.leg = -1;
            var8.m.bag = -1;
            var8.m.cName = "";
            var8.m.cHP = var8.m.cHPFull = 20;
         }

         this.G = false;
         this.F = false;
         this.H = false;
         this.D = GameCanvas.b + (long)Res.b(1000, 2000);
         this.c = 0;
         this.l = -1;
         this.m = -1;
         this.d = var2;
         this.s = var3;
         this.t = 0;
         Char.myCharz().b(470, 408, 1);
         Char.myCharz().I = 2;
         Char.myCharz().statusMe = 1;
         this.u = 0;
         this.v = 0;
         this.w = 0;
         this.x = 0;
         this.p = -this.r;
         this.I = var4;
         this.n = 0;
         this.g();
         this.b();
         SoundMn.gI();
      }
   }

   public final void perform(int var1, Object var2) {}

   public final void c() {
      try {
         this.t = this.s * this.f();
         this.g();
         GameScr.gI().c();
         int var1;
         if(this.D - GameCanvas.b > 0L) {
            for(var1 = 0; var1 < this.b.length; ++var1) {
               this.b[var1].e += 2;
               if(this.b[var1].e >= this.j) {
                  this.b[var1].e = 0;
               }

               this.b[var1].a = this.A[this.b[var1].e];
               this.b[var1].b = this.B[this.b[var1].e];
            }

            return;
         }

         if(this.c == 0) {
            this.c = 1;
         }

         if(this.c == 1) {
            for(var1 = 0; var1 < this.b.length; ++var1) {
               if(this.b[var1].d != -999 && !this.b[var1].k) {
                  if(this.b[var1].b < this.b[var1].d) {
                     if(this.b[var1].f < 0) {
                        this.b[var1].f = 0;
                     }

                     if(this.b[var1].b + this.b[var1].f > this.b[var1].d) {
                        this.b[var1].b = this.b[var1].d;
                     } else {
                        this.b[var1].b += this.b[var1].f;
                     }

                     ++this.b[var1].f;
                  } else {
                     if(this.b[var1].f > 0) {
                        this.b[var1].f = 0;
                     }

                     this.b[var1].b += this.b[var1].f;
                     --this.b[var1].f;
                  }

                  if(this.b[var1].b == this.b[var1].d) {
                     EffecMn.addEff(new Effect(19, this.b[var1].a - 5, this.b[var1].b + 25, 2, 1, -1));
                     SoundMn.gI();
                     this.b[var1].k = true;
                     if(!this.G) {
                        this.G = true;
                     }
                  }
               }
            }
         }

         if(this.c == 2) {
            for(var1 = 0; var1 < this.b.length; ++var1) {
               if(!this.b[var1].k) {
                  if(this.b[var1].b > -10) {
                     if(this.b[var1].f > 0) {
                        this.b[var1].f = 0;
                     }

                     this.b[var1].b += this.b[var1].f;
                     --this.b[var1].f;
                     this.b[var1].a += this.b[var1].g * this.b[var1].h;
                     this.b[var1].g -= 3;
                  }

                  if(this.b[var1].b == -10) {
                     this.b[var1].j = false;
                  }
               }
            }

            ++this.u;
            if(this.u > this.P.length - 1) {
               this.u = this.P.length - 1;
               this.F = true;
               SoundMn.gI();
               if(!this.H && this.E - GameCanvas.b < 0L) {
                  Service.gI().SendCrackBall((byte)2, (byte)(this.e() + this.f()));
                  this.H = true;
               }
            }

            Char.myCharz().ar = this.P[this.u];
            ++this.v;
            if(this.v > 5) {
               this.v = 0;
            }

            this.w = this.Q[this.v];
         }

         if(this.c == 3) {
            if(this.v <= 5) {
               this.v = 5;
            }

            ++this.v;
            if(this.v > this.Q.length - 1) {
               this.v = this.Q.length - 1;
               this.c = 4;
               this.F = false;
               var1 = 0;

               for(int var2 = 0; var2 < this.b.length; ++var2) {
                  if(this.b[var2].k && !this.b[var2].l) {
                     this.b[var2].i = this.C[var1];
                     this.b[var2].l = true;
                     ++var1;
                  }
               }
            }

            this.w = this.Q[this.v];
         }

         if(this.c == 4) {
            for(var1 = 0; var1 < this.b.length; ++var1) {
               if(this.b[var1].j) {
                  this.b[var1].c = Char.myCharz().cx;
               }
            }

            this.c = 5;
         }

         if(this.c == 5) {
            ++this.x;
            if(this.p < GameCanvas.C / 3) {
               if(this.p + this.x > GameCanvas.C / 3) {
                  this.p = GameCanvas.C / 3;
               } else {
                  this.p += this.x;
               }
            }

            for(var1 = 0; var1 < this.b.length; ++var1) {
               if(this.b[var1].j) {
                  if(this.b[var1].a < this.b[var1].c) {
                     if(this.b[var1].g < 0) {
                        this.b[var1].g = 0;
                     }

                     if(this.b[var1].a + this.b[var1].g > this.b[var1].c) {
                        this.b[var1].a = this.b[var1].c;
                     } else {
                        this.b[var1].a += this.b[var1].g;
                     }

                     ++this.b[var1].g;
                  } else {
                     if(this.b[var1].g > 0) {
                        this.b[var1].g = 0;
                     }

                     this.b[var1].a += this.b[var1].g;
                     --this.b[var1].g;
                  }

                  if(this.b[var1].a == this.b[var1].c) {
                     this.b[var1].j = false;
                  }
               }
            }

            return;
         }
      } catch (Exception var3) {
         System.out.println("-upd--null: " + var3.toString());
      }

   }

   public final void d() {
      if(!InfoDlg.b) {
         if(GameCanvas.isTouch && !nr_cm.b().b && !GameCanvas.menu.a) {
            nr_ap var1 = this;
            int var2;
            if(this.c == 1 && GameCanvas.l) {
               for(var2 = 0; var2 < var1.b.length; ++var2) {
                  if(GameCanvas.a(var1.b[var2].a - 20 - GameScr.j, var1.b[var2].b - 10 - GameScr.k, 30, 30) && GameCanvas.l && GameCanvas.m) {
                     var1.b(var2);
                  }
               }
            }

            if(GameCanvas.l) {
               for(var2 = 0; var2 < K.length; ++var2) {
                  if(GameCanvas.a(K[var2], J, 36, 36) && GameCanvas.l && GameCanvas.m) {
                     var1.c(var2);
                  }
               }
            }
         }

         for(int var3 = 1; var3 < 8; ++var3) {
            if(GameCanvas.i[var3]) {
               GameCanvas.i[var3] = false;
               this.b(var3 - 1);
            }
         }

         if(GameCanvas.i[12]) {
            GameCanvas.i[12] = false;
            this.c(0);
         }

         if(GameCanvas.i[13]) {
            GameCanvas.i[13] = false;
            this.c(1);
         }

         GameCanvas.e();
      }
   }

   private void b(int var1) {
      if(!this.b[var1].k) {
         SoundMn.gI();
         long var2 = this.d == 0?Char.myCharz().as:(long)Char.myCharz().X();
         if(this.e() >= this.n && var2 < (long)(this.t + this.s)) {
            String var4 = mResources.g + " " + (this.d == 0?mResources.bz:mResources.bA);
            GameScr.aC.a(var4, 0);
         } else {
            this.l = var1;
            this.b[this.l].d = this.k + Res.b(-3, 3);
         }
      }
   }

   private void c(int var1) {
      if(this.m != var1) {
         this.m = var1;
      } else {
         if(var1 == 0) {
            if(this.c < 2) {
               if(this.e() + this.f() > 0) {
                  this.c = 2;
                  SoundMn.gI();
                  Char.myCharz().a(GameScr.u[13], 0);
                  this.E = GameCanvas.b + (long)Res.b(2000, 3000);
                  return;
               }
            } else if(this.p == GameCanvas.C / 3) {
               Service.gI().SendCrackBall(this.d, (byte)0);
               return;
            }
         } else {
            GameScr.gI().ba = false;
            GameScr.gI().b();
         }

      }
   }

   public final void a(mGraphics var1) {
      try {
         GameScr.gI().a(var1);
         var1.a(-GameScr.j, -GameScr.k);
         var1.a(0, GameCanvas.Z);

         int var2;
         for(var2 = 0; var2 < this.b.length; ++var2) {
            if(this.b[var2].j && this.b[var2].b > this.b[var2].d - 20) {
               var1.drawImage(TileMap.bong, this.b[var2].a, this.b[var2].d + 7, 3);
            }
         }

         for(var2 = 0; var2 < this.b.length; ++var2) {
            if(this.b[var2].j) {
               SmallImage.drawSmallImage(var1, this.b[var2].i, this.b[var2].a, this.b[var2].b, 0, 3);
            }
         }

         int var3;
         if(this.F) {
            if(L != null) {
               var2 = Char.myCharz().cx - L.a - 28;

               for(var3 = 0; var3 < GameCanvas.z / L.a + 1; ++var3) {
                  L.a(this.w, var2 - var3 * (L.a - 1), Char.myCharz().cy - L.b / 2 - 12 + 2, 0, 0, var1);
               }
            }

            if(M != null) {
               var2 = Char.myCharz().cx - M.a - 10;
               M.a(this.w, var2 - 5, Char.myCharz().cy - M.b / 2 - 12, 0, 0, var1);
            }
         }

         GameScr.c(var1);
         var3 = GameCanvas.z - 240;
         var1.a(13524492);
         var1.d(var3, 0, 240, 15);
         var1.drawImage(Panel.u, var3 + 11, 8, 3);
         var1.drawImage(Panel.w, var3 + 90, 7, 3);
         mFont.n.a(var1, Char.myCharz().xuStr, var3 + 24, 2, 0, mFont.o);
         mFont.n.a(var1, Char.myCharz().luongStr, var3 + 100, 2, 0, mFont.o);
         var1.drawImage(Panel.x, var3 + 150, 8, 3);
         mFont.n.a(var1, Char.myCharz().luongKhoaStr, var3 + 160, 2, 0, mFont.o);
         var1.drawImage(Panel.v, var3 + 200, 8, 3);
         mFont.n.a(var1, String.valueOf(this.n), var3 + 210, 2, 0, mFont.o);
         if(this.c < 4) {
            var3 = GameCanvas.z - 140;
            var1.a(11837316);
            var1.d(var3, 15, 140, 15);
            if(this.d == 0) {
               var1.drawImage(Panel.u, var3 + 21, 23, 3);
            } else {
               var1.drawImage(Panel.x, var3 + 21, 22, 3);
               var1.drawImage(Panel.w, var3 + 18, 22, 3);
            }

            mFont.p.a(var1, "-" + this.t, var3 + 30, 17, 0, mFont.o);
            var1.drawImage(Panel.v, var3 + 80, 22, 3);
            mFont.p.a(var1, "-" + this.e(), var3 + 90, 17, 0, mFont.o);
         }

         var1.drawImage(GameScr.at, K[0], J, 0);
         if(this.m == 0) {
            var1.drawImage(GameScr.au, K[0], J, 0);
         }

         if(this.c < 3) {
            SmallImage.drawSmallImage(var1, 540, K[0] + 14, J + 14, 0, nr_cf.f);
         } else {
            var1.drawImage(O, K[0] + 14 - 10, J + 14 - 10, 0);
         }

         var1.drawImage(GameScr.at, K[1], J, 0);
         if(this.m == 1) {
            var1.drawImage(GameScr.au, K[1], J, 0);
         }

         var1.drawImage(N, K[1] + 14 - 10, J + 14 - 10, 0);
         if(this.c > 3) {
            nr_cr.c(this.o, this.p, this.q, this.r, var1);
            var2 = GameCanvas.B - this.C.length * 30 / 2;

            for(var3 = 0; var3 < this.C.length; ++var3) {
               SmallImage.drawSmallImage(var1, this.C[var3], var2 + 5 + var3 * 30, this.p + 10, 0, 0);
            }

            return;
         }
      } catch (Exception var4) {
         System.out.println("-paint--null: " + var4.toString());
      }

   }

   public final void a(short[] var1) {
      this.c = 3;
      this.C = var1;
   }

   public final void b() {
      GameScr.a = true;
      GameScr.gI().ba = true;
      super.b();
   }

   private byte e() {
      byte var1 = 0;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2].k) {
            ++var1;
         }
      }

      if(var1 > this.n) {
         var1 = (byte)this.n;
      }

      return var1;
   }

   private byte f() {
      byte var1 = 0;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2].k) {
            ++var1;
         }
      }

      if((var1 -= this.e()) <= 0) {
         var1 = 0;
      }

      return var1;
   }

   private void g() {
      for(int var1 = 0; var1 < Char.myCharz().arrItemBag.length; ++var1) {
         if(Char.myCharz().arrItemBag[var1] != null && Char.myCharz().arrItemBag[var1].template.id == this.I) {
            this.n = Char.myCharz().arrItemBag[var1].quantity;
            return;
         }
      }

   }
}
