package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.SmallImage;
import nro.TileMap;
import nro.nr_ci;
import nro.Res;
import nro.nr_dz;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class nr_dw {

   public static MyVector a = new MyVector("vBG Effect");
   private int[] f;
   private int[] g;
   private int[] h;
   private int[] i;
   private static int[] j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private boolean t;
   private static Image u;
   private static Image v;
   private static Image w;
   private static Image x;
   private static Image y;
   private static Image z;
   private static Image A;
   private static Image B;
   private int[] C;
   private int D;
   public int b;
   private boolean[] E;
   private int[] F;
   private int[] G;
   private boolean[] H;
   private int I;
   private int J;
   private static int K = 16;
   private static Image L = Main.loadImage("/mainImage/myTexture2dwater1.png");
   private static Image M = Main.loadImage("/mainImage/myTexture2dwater2.png");
   private static Image N;
   private static Image O;
   public static boolean c;
   private static boolean P;
   public static int d;
   private static Image Q;
   private static Image R;
   private static int S;
   private static int T;
   public static int e;
   private static int U;
   private int[] V = new int[]{0, 1, 2, 1, 0, 0};
   private int[] W;


   public static void a() {
      TileMap.H = 0;
   }

   public static boolean b() {
      for(int var0 = 0; var0 < a.size(); ++var0) {
         nr_dw var1;
         if((var1 = (nr_dw)a.elementAt(var0)).b == 0 || var1.b == 12) {
            return true;
         }
      }

      return false;
   }

   private nr_dw(int var1) {
      this.b = var1;
      int var2;
      switch(this.b) {
      case 0:
      case 12:
         if(u == null) {
            u = Main.a("/bg/mua.png");
         }

         if(v == null) {
            v = Main.a("/bg/mua1.png");
         }

         if(w == null) {
            w = Main.a("/bg/mua2.png");
         }

         this.D = Res.b(GameCanvas.z / 3, GameCanvas.z / 2);
         this.f = new int[this.D];
         this.g = new int[this.D];
         this.h = new int[this.D];
         this.i = new int[this.D];
         this.C = new int[this.D];
         this.G = new int[this.D];
         this.F = new int[this.D];
         this.E = new boolean[this.D];
         this.H = new boolean[this.D];

         for(var2 = 0; var2 < this.D; ++var2) {
            this.g[var2] = Res.b(-10, GameCanvas.A + 100) + GameScr.k;
            this.f[var2] = Res.b(-10, GameCanvas.z + 300) + GameScr.j;
            this.G[var2] = Res.b(0, 1);
            this.h[var2] = -12;
            this.i[var2] = 12;
            this.C[var2] = Res.b(1, 3);
            this.E[var2] = false;
            if(this.C[var2] == 2 && var2 % 2 == 0) {
               this.E[var2] = true;
            }

            this.H[var2] = false;
            this.F[var2] = Res.b(1, 2);
         }

         return;
      case 1:
      case 2:
      case 5:
      case 6:
      case 7:
      case 11:
      case 15:
         if(this.b == 1) {
            y = Main.a("/bg/lacay.png");
            K = 10;
         }

         if(this.b == 2) {
            y = Main.a("/bg/lacay2.png");
            K = 18;
         }

         if(this.b == 5) {
            y = Main.a("/bg/lacay3.png");
            K = 14;
         }

         if(this.b == 6) {
            y = Main.a("/bg/lacay4.png");
            K = 14;
         }

         if(this.b == 7) {
            y = Main.a("/bg/lacay5.png");
            K = 12;
         }

         if(this.b == 11) {
            y = Main.a("/bg/tuyet.png");
         }

         if(this.b == 15) {
            nr_dz var3;
            if((var3 = SmallImage.c[11120]) == null) {
               SmallImage.a(11120);
            }

            K = 16;
         }

         this.D = Res.b(15, 25);
         if(this.b == 11) {
            this.D = 100;
         }

         this.f = new int[this.D];
         this.g = new int[this.D];
         this.h = new int[this.D];
         this.i = new int[this.D];
         this.G = new int[this.D];
         this.F = new int[this.D];
         this.H = new boolean[this.D];

         for(var2 = 0; var2 < this.D; ++var2) {
            this.f[var2] = Res.b(-10, TileMap.c + 10);
            this.g[var2] = Res.b(0, TileMap.d);
            this.F[var2] = Res.b(0, 1);
            this.G[var2] = Res.b(0, 1);
            this.h[var2] = Res.b(-3, 3);
            this.i[var2] = Res.b(1, 4);
            if(this.b == 11) {
               this.F[var2] = Res.b(0, 2);
               this.h[var2] = Res.g(Res.b(1, 3));
               this.i[var2] = Res.g(Res.b(1, 3));
            }

            if(this.b == 15) {
               this.F[var2] = Res.b(0, 2);
               this.h[var2] = Res.g(Res.b(1, 3));
               this.i[var2] = Res.g(Res.b(1, 3));
            }
         }

         return;
      case 3:
         GameCanvas.X = true;
         return;
      case 4:
         this.D = Res.b(5, 10);
         if(x == null) {
            x = Main.a("/bg/sao.png");
         }

         this.f = new int[this.D];
         this.g = new int[this.D];
         this.F = new int[this.D];
         this.G = new int[this.D];
         this.W = new int[this.D];

         for(var2 = 0; var2 < this.D; ++var2) {
            this.f[var2] = Res.b(0, GameCanvas.z);
            this.g[var2] = Res.b(0, 50);
            if(var2 % 2 == 0) {
               this.W[var2] = 0;
            } else if(var2 % 3 == 0) {
               this.W[var2] = 1;
            } else if(var2 % 4 == 0) {
               this.W[var2] = 2;
            } else {
               this.W[var2] = 3;
            }

            this.G[var2] = Res.b(0, 10);
         }

         return;
      case 8:
         this.r = Res.b(100, 300);
         if(z == null) {
            z = Main.a("/bg/ship.png");
         }

         if(A == null) {
            A = Main.a("/bg/fire1.png");
         }

         if(B == null) {
            B = Main.a("/bg/fire2.png");
         }

         this.t = false;
         this.e();
         return;
      case 9:
         if(N == null) {
            N = Main.a("/bg/cham-tron1.png");
         }

         if(O == null) {
            O = Main.a("/bg/cham-tron2.png");
         }

         this.k = 20;
         this.f = new int[this.k];
         this.g = new int[this.k];
         j = new int[this.k];
         this.h = new int[this.k];

         for(var2 = 0; var2 < this.k; ++var2) {
            this.f[var2] = Res.g(Res.b(0, GameCanvas.z));
            this.g[var2] = Res.g(Res.b(10, 80));
            j[var2] = Res.g(Res.b(1, 3));
            this.h[var2] = j[var2];
         }

         return;
      case 10:
         this.k = 30;
         this.f = new int[this.k];
         this.g = new int[this.k];
         j = new int[this.k];
         this.h = new int[this.k];
         var1 = 0;

         for(var2 = 0; var2 < this.k; ++var2) {
            this.f[var2] = Res.g(Res.b(0, GameCanvas.z)) + GameScr.j;
            ++var1;
            if(var1 > this.k / 2) {
               this.g[var2] = Res.g(Res.b(20, 60));
               j[var2] = 10;
            } else {
               this.g[var2] = Res.g(Res.b(0, 20));
               j[var2] = 7;
            }

            this.h[var2] = j[var2] / 2 - 2;
         }

         return;
      case 13:
         if(Res.g(Res.b(0, 2)) == 0) {
            if(Res.g(Res.b(0, 2)) == 0) {
               P = true;
            } else {
               P = false;
            }

            d = Res.g(Res.b(2, 5));
            d();
            return;
         }
         break;
      case 14:
         if(Res.g(Res.b(0, 2)) == 0) {
            c = true;
            d();
         }
      }

   }

   private static void d() {
      if(Main.typeClient == 1) {
         Q = null;
         R = null;
      } else if(GameCanvas.lowGraphic) {
         Q = null;
         R = null;
      } else {
         if(d > 0) {
            if(Q == null) {
               S = (Q = Main.loadImage("/bg/fog1.png")).getWidth();
            }
         } else {
            Q = null;
         }

         if(!c) {
            R = null;
         } else {
            if(R == null) {
               R = Main.loadImage("/bg/fog0.png");
            }

            U = 287;
         }
      }
   }

   private static void g(mGraphics var0) {
      if(Main.typeClient != 1) {
         if(!GameCanvas.lowGraphic) {
            if(d != 0) {
               if(Q != null) {
                  for(int var1 = 0; var1 < d; ++var1) {
                     var0.a(Q, (float)GameCanvas.V[var1], (float)GameCanvas.W[var1], 3);
                  }
               }

            }
         }
      }
   }

   public static void a(mGraphics var0) {
      if(Main.typeClient != 1) {
         if(!GameCanvas.lowGraphic) {
            if(c) {
               if(R != null) {
                  for(int var1 = T; var1 < TileMap.c; var1 += U) {
                     if(var1 >= GameScr.j - U) {
                        var0.a(R, (float)var1, (float)e, 0);
                     }
                  }
               }

            }
         }
      }
   }

   private void e() {
      int var1 = GameScr.j;
      int var2 = GameScr.k;
      this.n = Res.b(1, 3);
      this.t = false;
      this.s = Res.b(3, 5);
      nr_dw var10000;
      byte var10001;
      if(this.n == 1) {
         this.l = -50;
         this.m = Res.b(var2, GameCanvas.A - 100 + var2);
         var10000 = this;
         var10001 = 0;
      } else {
         label29: {
            if(this.n == 2) {
               this.l = TileMap.c + 50;
               this.m = Res.b(var2, GameCanvas.A - 100 + var2);
               var10000 = this;
            } else {
               if(this.n == 3) {
                  this.l = Res.b(var1 + 50, GameCanvas.z - 50 + var1);
                  this.m = -50;
                  var1 = Res.b(0, 2);
                  this.o = var1 == 0?0:2;
                  return;
               }

               if(this.n != 4) {
                  return;
               }

               this.l = Res.b(var1 + 50, GameCanvas.z - 50 + var1);
               this.m = TileMap.d + 50;
               var1 = Res.b(0, 2);
               var10000 = this;
               if(var1 == 0) {
                  var10001 = 0;
                  break label29;
               }
            }

            var10001 = 2;
         }
      }

      var10000.o = var10001;
   }

   public static void a(int var0) {
      if(!GameCanvas.lowGraphic) {
         nr_dw var1 = new nr_dw(var0);
         a.addElement(var1);
      }
   }

   public static void a(int var0, int var1) {
      nr_dw var2;
      (var2 = new nr_dw(10)).J = var0;
      var2.I = var1;
      a.addElement(var2);
   }

   public static void b(mGraphics var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         nr_dw var10000 = (nr_dw)a.elementAt(var1);
         mGraphics var3 = var0;
         nr_dw var2 = var10000;
         if(var10000.b == 10) {
            var0.a(var2.J);

            for(int var4 = 0; var4 < var2.k; ++var4) {
               var3.drawImage(var4 < var2.k / 2?M:L, var2.f[var4], var2.g[var4] + var2.I, 0);
            }
         }
      }

   }

   public static void c(mGraphics var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         nr_dw var2;
         switch((var2 = (nr_dw)a.elementAt(var1)).b) {
         case 8:
            var0.drawRegion(z, 0, 0, z.getWidth(), z.getHeight(), var2.o, var2.l, var2.m, 3);
            int var4;
            if(var2.n != 1 && var2.n != 2) {
               var4 = var2.o == 0?11:-11;
               var0.drawRegion(B, 0, var2.p * 18, 8, 18, var2.o, var2.l + var4, var2.m + 22, 3);
            } else {
               var4 = var2.o == 0?-25:25;
               var0.drawRegion(A, 0, var2.p << 3, 20, 8, var2.o, var2.l + var4, var2.m + 5, 3);
            }
            break;
         case 13:
            if(P) {
               g(var0);
            }
         }
      }

   }

   public static void d(mGraphics var0) {
      label89:
      for(int var1 = 0; var1 < a.size(); ++var1) {
         nr_dw var10000 = (nr_dw)a.elementAt(var1);
         mGraphics var3 = var0;
         nr_dw var2 = var10000;
         switch(var10000.b) {
         case 0:
         case 12:
            int var7 = 0;

            while(true) {
               if(var7 >= var2.D) {
                  continue label89;
               }

               if(var2.C[var7] == 2 && var2.f[var7] >= GameScr.j && var2.f[var7] <= GameCanvas.z + GameScr.j && var2.g[var7] >= GameScr.k && var2.g[var7] <= GameCanvas.A + GameScr.k) {
                  if(var2.H[var7]) {
                     var3.drawRegion(u, 0, 10 * var2.F[var7], 13, 10, 0, var2.f[var7], var2.g[var7] - 10, 0);
                  } else {
                     var3.drawImage(v, var2.f[var7], var2.g[var7], 0);
                  }
               }

               ++var7;
            }
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 11:
         case 15:
            if(var2.b == 15) {
               if(SmallImage.c[11120] != null && SmallImage.c[11120].a != null) {
                  y = SmallImage.c[11120].a;
               }

               if(y == null) {
                  continue;
               }
            }

            Image var4 = y;
            var3 = var0;
            var2 = var2;

            try {
               for(int var5 = 0; var5 < var2.D; ++var5) {
                  if(var5 % 3 == 0 && var2.f[var5] >= GameScr.j && var2.f[var5] <= GameCanvas.z + GameScr.j && var2.g[var5] >= GameScr.k && var2.g[var5] <= GameCanvas.A + GameScr.k && var4 != null && K <= mGraphics.getImageHeight(var4) && K * var2.F[var5] <= mGraphics.getImageHeight(var4)) {
                     var3.drawRegion(var4, 0, K * var2.F[var5], var4.getWidth(), K, 0, var2.f[var5], var2.g[var5], 0);
                  }
               }
            } catch (Exception var6) {
               ;
            }
         case 3:
         case 4:
         case 8:
         case 9:
         case 10:
         case 14:
         default:
            break;
         case 13:
            if(!P) {
               g(var0);
            }
         }
      }

   }

   public static void e(mGraphics var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         nr_dw var10000 = (nr_dw)a.elementAt(var1);
         mGraphics var3 = var0;
         nr_dw var2 = var10000;
         var0.a(-var0.a(), -var0.b());
         int var4;
         if(var2.b == 4) {
            for(var4 = 0; var4 < var2.D; ++var4) {
               var3.drawRegion(x, 0, 16 * var2.F[var4], 16, 16, 0, var2.f[var4], var2.g[var4], 0);
            }
         }

         if(var2.b == 9) {
            var3.a(16777215);

            for(var4 = 0; var4 < var2.k; ++var4) {
               var3.drawImage(j[var4] == 1?N:O, var2.f[var4], var2.g[var4], 3);
            }
         }
      }

   }

   public static void f(mGraphics var0) {
      label82:
      for(int var1 = 0; var1 < a.size(); ++var1) {
         nr_dw var10000 = (nr_dw)a.elementAt(var1);
         mGraphics var3 = var0;
         nr_dw var2 = var10000;
         switch(var10000.b) {
         case 0:
            var0.a(10742731);
            int var7 = 0;

            while(true) {
               if(var7 >= var2.D) {
                  continue label82;
               }

               if(var2.C[var7] != 2 && var2.f[var7] >= GameScr.j && var2.f[var7] <= GameCanvas.z + GameScr.j && var2.g[var7] >= GameScr.k && var2.g[var7] <= GameCanvas.A + GameScr.k) {
                  var3.drawImage(w, var2.f[var7], var2.g[var7], 0);
               }

               ++var7;
            }
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 11:
         case 15:
            if(var2.b == 15) {
               if(SmallImage.c[11120] != null && SmallImage.c[11120].a != null) {
                  y = SmallImage.c[11120].a;
               }

               if(y == null) {
                  continue;
               }
            }

            Image var4 = y;
            var3 = var0;
            var2 = var2;

            try {
               for(int var5 = 0; var5 < var2.D; ++var5) {
                  if(var5 % 3 != 0 && var2.f[var5] >= GameScr.j && var2.f[var5] <= GameCanvas.z + GameScr.j && var2.g[var5] >= GameScr.k && var2.g[var5] <= GameCanvas.A + GameScr.k && var4 != null && K <= mGraphics.getImageHeight(var4) && K * var2.F[var5] <= mGraphics.getImageHeight(var4)) {
                     var3.drawRegion(var4, 0, K * var2.F[var5], var4.getWidth(), K, 0, var2.f[var5], var2.g[var5], 0);
                  }
               }
            } catch (Exception var6) {
               ;
            }
         case 3:
         case 4:
         case 8:
         case 9:
         case 10:
         case 12:
         case 13:
         case 14:
         }
      }

   }

   public static void c() {
      label236:
      for(int var0 = 0; var0 < a.size(); ++var0) {
         nr_dw var1;
         int var2;
         int var3;
         switch((var1 = (nr_dw)a.elementAt(var0)).b) {
         case 0:
         case 12:
            var2 = 0;

            while(true) {
               if(var2 >= var1.D) {
                  continue label236;
               }

               if(var2 % 3 != 0 && var1.b != 12 && TileMap.a(var1.f[var2], var1.g[var2] - GameCanvas.Z, 2)) {
                  var1.H[var2] = true;
               }

               if(var2 % 3 == 0 && var1.g[var2] > GameCanvas.A + GameScr.k) {
                  var1.f[var2] = Res.b(-10, GameCanvas.z + 300) + GameScr.j;
                  var1.g[var2] = Res.b(-100, 0) + GameScr.k;
               }

               if(!var1.H[var2]) {
                  var1.g[var2] += var1.i[var2];
                  var1.f[var2] += var1.h[var2];
               }

               if(var1.H[var2]) {
                  ++var1.G[var2];
                  if(var1.G[var2] > 2) {
                     ++var1.F[var2];
                     var1.G[var2] = 0;
                     if(var1.F[var2] > 1) {
                        var1.F[var2] = 0;
                        var1.H[var2] = false;
                        var1.f[var2] = Res.b(-10, GameCanvas.z + 300) + GameScr.j;
                        var1.g[var2] = Res.b(-100, 0) + GameScr.k;
                     }
                  }
               }

               ++var2;
            }
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 11:
         case 15:
            for(var2 = 0; var2 < var1.D; ++var2) {
               if(var2 % 3 != 0 && TileMap.a(var1.f[var2], var1.g[var2] + (TileMap.e == 15?10:0), 2)) {
                  var1.H[var2] = true;
               }

               if(var2 % 3 == 0 && var1.g[var2] > TileMap.d) {
                  var1.f[var2] = Res.b(-10, TileMap.c + 50);
                  var1.g[var2] = Res.b(-50, 0);
               }

               if(!var1.H[var2]) {
                  for(var3 = 0; var3 < nr_ci.a.size(); ++var3) {
                     nr_ci var4;
                     if((var4 = (nr_ci)nr_ci.a.elementAt(var3)) != null && var4.e && var1.f[var2] < var4.b + 80 && var1.f[var2] > var4.b - 80 && var1.g[var2] < var4.c + 80 && var1.g[var2] > var4.c - 80) {
                        var1.f[var2] += var1.f[var2] < var4.b?-10:10;
                     }
                  }

                  var1.g[var2] += var1.i[var2];
                  var1.f[var2] += var1.h[var2];
                  ++var1.G[var2];
                  if(var1.G[var2] > (var1.b != 2?2:4)) {
                     if(var1.b != 11 && var1.b != 15) {
                        ++var1.F[var2];
                     }

                     var1.G[var2] = 0;
                     if(var1.F[var2] > 3) {
                        var1.F[var2] = 0;
                     }
                  }
               } else {
                  ++var1.G[var2];
                  if(var1.G[var2] == 100) {
                     var1.G[var2] = 0;
                     var1.f[var2] = Res.b(-10, TileMap.c + 50);
                     var1.g[var2] = Res.b(-50, 0);
                     var1.H[var2] = false;
                  }
               }
            }
         case 3:
         default:
            break;
         case 4:
            var2 = 0;

            while(true) {
               if(var2 >= var1.D) {
                  continue label236;
               }

               ++var1.G[var2];
               if(var1.G[var2] > 10) {
                  ++var1.W[var2];
                  var1.G[var2] = 0;
                  if(var1.W[var2] > 5) {
                     var1.W[var2] = 0;
                  }

                  var1.F[var2] = var1.V[var1.W[var2]];
               }

               ++var2;
            }
         case 8:
            ++var1.q;
            if(var1.q == 3) {
               var1.q = 0;
               ++var1.p;
               if(var1.p > 1) {
                  var1.p = 0;
               }
            }

            if(GameCanvas.gameTick % var1.r == 0) {
               var1.t = true;
            }

            if(var1.t) {
               if(var1.n == 1) {
                  var1.l += var1.s;
                  if(var1.l > TileMap.c + 50) {
                     var1.e();
                  }
               } else if(var1.n == 2) {
                  var1.l -= var1.s;
                  if(var1.l < -50) {
                     var1.e();
                  }
               } else if(var1.n == 3) {
                  var1.m += var1.s;
                  if(var1.m > TileMap.d + 50) {
                     var1.e();
                  }
               } else if(var1.n == 4) {
                  var1.m -= var1.s;
                  if(var1.m < -50) {
                     var1.e();
                  }
               }
            }
            break;
         case 9:
            var2 = 0;

            while(true) {
               if(var2 >= var1.k) {
                  continue label236;
               }

               var1.f[var2] -= var1.h[var2];
               if(var1.f[var2] < -var1.h[var2]) {
                  j[var2] = Res.g(Res.b(1, 3));
                  var1.h[var2] = j[var2];
                  var1.f[var2] = GameCanvas.z + var1.h[var2];
               }

               ++var2;
            }
         case 10:
            var2 = 0;

            while(true) {
               if(var2 >= var1.k) {
                  continue label236;
               }

               var1.f[var2] -= var1.h[var2];
               if(var1.f[var2] < -var1.h[var2] + GameScr.j) {
                  var1.f[var2] = GameCanvas.z + var1.h[var2] + GameScr.j;
               }

               ++var2;
            }
         case 13:
            if(Main.typeClient != 1 && !GameCanvas.lowGraphic && d > 0) {
               int var5 = GameCanvas.currentScreen == GameScr.gI()?TileMap.c:GameScr.j + GameCanvas.z;

               for(var2 = 0; var2 < d; ++var2) {
                  var3 = var2 + 1;
                  GameCanvas.V[var2] -= var3;
                  if(GameCanvas.V[var2] < -S) {
                     GameCanvas.V[var2] = var5 + 100;
                  }
               }
            }
            break;
         case 14:
            if(Main.typeClient != 1 && !GameCanvas.lowGraphic && c && --T < -U) {
               T = 0;
            }
         }
      }

   }
}
