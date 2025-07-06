package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Mob;
import nro.mScreen;
import nro.SmallImage;
import nro.InfoDlg;
import nro.Service;
import nro.SoundMn;
import nro.nr_cf;
import nro.nr_cm;
import nro.nr_cz;
import nro.mFont;
import nro.nr_dy;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class nr_ao extends mScreen {

   private static nr_ao h;
   private static boolean i;
   private static nr_cz j;
   private static nr_cz k;
   public static nr_cz a;
   private static Image l;
   private static Image m;
   private static Image n;
   private static Image o;
   private static Image p;
   private static Image q;
   private static Image r;
   private static Image s;
   private static Image t;
   private static Image u;
   private static Image v;
   private static Image w;
   private static Image x;
   private static Image y;
   private static Image[] z;
   private static int A;
   private static int B;
   private static int C;
   private static int D;
   private static int E;
   private static int F;
   public static int b;
   public static int c;
   public static int d;
   private static int G;
   public static int e;
   private static int H;
   private static int[] I = new int[0];
   private static int[] J = new int[0];
   private static int[][] K;
   private static int[][] L;
   private static int[] M = new int[]{-2, -1, 0, 1, 2};
   private int N;
   private int[] O;
   private int P;
   private int Q;
   private int R = 0;
   public static MyVector f;
   public static MyVector g;
   private static int S;
   private nr_dy T;
   private int U = 0;
   private int V = 0;
   private int W;
   private int X;
   private int Y;


   public static nr_ao a() {
      if(h == null) {
         h = new nr_ao();
      }

      return h;
   }

   public nr_ao() {
      i = true;
      Image var1 = Main.loadImage("/radar/17.png");
      Image var2 = Main.loadImage("/radar/3.png");
      Image var3 = Main.loadImage("/radar/23.png");
      j = new nr_cz(var1, 28, 28);
      k = new nr_cz(var2, 30, 30);
      a = new nr_cz(var3, 11, 11);
      l = Main.loadImage("/radar/0.png");
      n = Main.loadImage("/radar/1.png");
      o = Main.loadImage("/radar/2.png");
      m = Main.loadImage("/radar/17.png");
      p = Main.loadImage("/radar/4.png");
      q = Main.loadImage("/radar/5.png");
      r = Main.loadImage("/radar/6.png");
      z = new Image[7];

      for(int var4 = 0; var4 < 7; ++var4) {
         z[var4] = Main.loadImage("/radar/" + (var4 + 7) + ".png");
      }

      s = Main.loadImage("/radar/14.png");
      t = Main.loadImage("/radar/15.png");
      u = Main.loadImage("/radar/16.png");
      m = Main.loadImage("/radar/18.png");
      w = Main.loadImage("/radar/19.png");
      x = Main.loadImage("/radar/20.png");
      y = Main.loadImage("/radar/21.png");
      v = Main.loadImage("/radar/22.png");
      C = 200;
      D = 219;
      A = GameCanvas.B - (C + 40) / 2;
      B = GameCanvas.C - D / 2;
      b = A + C - 81;
      c = B + 29;
      d = 120;
      e = 80;
      K = new int[][]{{A + 34, B + D - 42}, {A + C / 2 - p.getWidth() / 2, B + D / 2 + 33}, {A + C - 41, B + D - 42}};
      L = new int[][]{{A + 25, B + D - 82}, {A + 57, B + D - 62}, {A + C / 2 - 14, B + D - 102}, {A + C - 57 - 28, B + D - 62}, {A + C - 25 - 28, B + D - 82}};
      this.O = new int[2];
      this.N = 0;
      E = A + 73;
      F = B + D / 2 + 5;
      H = B + D - 22;
      I = new int[]{A + C / 2 - 8 - 80, A + C / 2 - 8, A + C / 2 - 8 + 80};
      J = new int[3];
      this.X = c + 10 + 70;
      this.Y = 0;
      f = new MyVector("");
      g = new MyVector("");
      this.P = 1;
      this.Q = 2;
   }

   public final void a(MyVector var1, int var2, int var3) {
      f = var1;
      S = var2;
      this.P = 1;
      this.R = 2;
      this.f();
      i = true;
      e();
      if(i) {
         this.Q = var1.size() / 5 + (var1.size() % 5 > 0?1:0);
      } else {
         this.Q = g.size() / 5 + (g.size() % 5 > 0?1:0);
      }
   }

   public static void a(int var0, int var1) {
      S = var0;
   }

   public static void e() {
      g = new MyVector("");

      for(int var0 = 0; var0 < f.size(); ++var0) {
         nr_dy var1;
         if((var1 = (nr_dy)f.elementAt(var0)) != null && var1.k == 1) {
            g.addElement(var1);
         }
      }

   }

   private void f() {
      MyVector var1 = g;
      if(i) {
         var1 = f;
      }

      int var2;
      int var3 = (var2 = (this.P - 1) * 5) + 5;

      for(int var4 = var2; var4 < var3; ++var4) {
         if(var4 >= var1.size()) {
            M[var4 - var2] = -1;
         } else {
            nr_dy var5;
            if((var5 = (nr_dy)var1.elementAt(var4)) != null) {
               M[var4 - var2] = var5.e;
            }
         }
      }

      SoundMn.gI();
   }

   public final void c() {
      try {
         if(e < 80 && (e += 4) > 80) {
            e = 80;
         }

         this.T = nr_dy.a(g, M[this.R]);
         if(i) {
            this.T = nr_dy.a(f, M[this.R]);
         }

         GameScr.gI().c();
         if(GameCanvas.gameTick % 10 < 6) {
            if(GameCanvas.gameTick % 2 == 0) {
               --this.N;
            }
         } else {
            this.N = 0;
         }

         if(this.T != null) {
            int var1 = this.T.b * 100 / this.T.c;
            this.Y = var1 * w.getHeight() / 100;
            var1 = S * 100 / f.size();
            this.W = var1 * y.getWidth() / 100;
            return;
         }
      } catch (Exception var2) {
         System.out.println("-upd-radaScr-null: " + var2.toString());
      }

   }

   public final void d() {
      if(!InfoDlg.b) {
         if(GameCanvas.isTouch && !nr_cm.b().b && !GameCanvas.menu.a) {
            nr_ao var1 = this;
            if(GameCanvas.l) {
               int var2;
               for(var2 = 0; var2 < 5; ++var2) {
                  if(GameCanvas.a(L[var2][0], L[var2][1], 30, 30) && GameCanvas.l && GameCanvas.m && var2 != var1.R) {
                     var1.R = var2;
                     e = 0;
                  }
               }

               if(GameCanvas.a(K[0][0] - 5, K[0][1] - 5, 20, 20)) {
                  if(GameCanvas.k) {
                     var1.O[0] = 1;
                  }

                  if(GameCanvas.l && GameCanvas.m) {
                     var1.c(0);
                     var1.O[0] = 0;
                  }
               }

               if(GameCanvas.a(K[2][0] - 5, K[2][1] - 5, 20, 20)) {
                  if(GameCanvas.k) {
                     var1.O[1] = 1;
                  }

                  if(GameCanvas.l && GameCanvas.m) {
                     var1.c(1);
                     var1.O[1] = 0;
                  }
               }

               for(var2 = 0; var2 < I.length; ++var2) {
                  if(GameCanvas.a(I[var2] - 5, H - 5, 20, 20)) {
                     if(GameCanvas.k) {
                        J[var2] = 1;
                     }

                     if(GameCanvas.l && GameCanvas.m) {
                        var1.b(var2);
                        J[var2] = 0;
                     }
                  }
               }
            } else {
               J[0] = 0;
               J[1] = 0;
               J[2] = 0;
               this.O[0] = 0;
               this.O[1] = 0;
            }

            if(GameCanvas.a(b, 0, d, c + e)) {
               if(GameCanvas.n) {
                  if(var1.V == 0) {
                     var1.V = GameCanvas.p;
                  }

                  var1.U = var1.V - GameCanvas.p;
                  if(var1.U != 0) {
                     G += var1.U;
                     var1.V = GameCanvas.p;
                  }

                  if(G < 0) {
                     G = 0;
                  }

                  if(G > var1.T.r.h) {
                     G = var1.T.r.h;
                  }
               } else {
                  var1.V = 0;
                  var1.V = 0;
               }
            }
         }

         if(GameCanvas.i[8]) {
            GameCanvas.i[8] = false;
            this.d(1);
         }

         if(GameCanvas.i[2]) {
            GameCanvas.i[2] = false;
            this.d(-1);
         }

         if(GameCanvas.i[4]) {
            GameCanvas.i[4] = false;
            this.e(1);
         }

         if(GameCanvas.i[6]) {
            GameCanvas.i[6] = false;
            this.e(0);
         }

         if(GameCanvas.i[12]) {
            GameCanvas.i[12] = false;
            this.b(0);
         }

         if(GameCanvas.i[5]) {
            GameCanvas.i[5] = false;
            this.b(1);
         }

         if(GameCanvas.i[13]) {
            this.b(2);
         }

         GameCanvas.e();
      }
   }

   private void b(int var1) {
      if(var1 == 0) {
         i = !i;
         this.P = 1;
         this.R = 0;
         if(i) {
            this.Q = f.size() / 5 + (f.size() % 5 > 0?1:0);
         } else {
            this.Q = g.size() / 5 + (g.size() % 5 > 0?1:0);
         }

         this.f();
         e = 0;
      } else if(var1 == 1) {
         if(this.T != null) {
            Service.gI().SendRada((int)1, this.T.e);
         }
      } else if(var1 == 2) {
         GameScr.gI().b();
      }

      SoundMn.gI();
   }

   private void c(int var1) {
      if(i) {
         this.Q = f.size() / 5 + (f.size() % 5 > 0?1:0);
      } else {
         this.Q = g.size() / 5 + (g.size() % 5 > 0?1:0);
      }

      int var2 = this.P;
      if(var1 == 0) {
         if(this.P == 1) {
            return;
         }

         --var2;
         if(var2 <= 0) {
            var2 = 1;
         }
      } else {
         if(this.P == this.Q) {
            return;
         }

         ++var2;
         if(var2 > this.Q) {
            var2 = this.Q;
         }
      }

      if(var2 != this.P) {
         this.P = var2;
         this.f();
      }

   }

   private void d(int var1) {
      if((G += var1 * 12) < 0) {
         G = 0;
      }

      if(G > this.T.r.h) {
         G = this.T.r.h;
      }

   }

   private void e(int var1) {
      int var2 = this.R;
      int var3 = this.P;
      if(var1 == 0) {
         ++var2;
      } else {
         --var2;
      }

      if(var2 >= M.length) {
         if(this.P < this.Q) {
            var2 = 0;
            ++var3;
         } else {
            var2 = M.length - 1;
         }
      }

      if(var2 < 0) {
         if(this.P > 1) {
            var2 = M.length - 1;
            --var3;
         } else {
            var2 = 0;
         }
      }

      if(var2 != this.R) {
         this.R = var2;
         G = 0;
         e = 0;
      }

      if(var3 != this.P) {
         this.P = var3;
         this.f();
      }

   }

   public final void a(mGraphics var1) {
      try {
         GameScr.gI().a(var1);
         var1.a(-GameScr.j, -GameScr.k);
         var1.a(0, GameCanvas.Z);
         GameScr.c(var1);
         var1.drawImage(l, A, B, 0);
         var1.drawImage(x, A + C / 2 - Main.a(x) / 2, B - Main.b(x) / 2 - 2, 0);
         var1.e(A + C / 2 - Main.a(x) / 2 + 13, B - Main.b(x) / 2 + 3, this.W, Main.b(x));
         var1.drawImage(y, A + C / 2 - Main.a(x) / 2 + 13, B - Main.b(x) / 2 + 3, 0);
         GameScr.c(var1);
         var1.drawImage(u, I[0], H + J[0], 0);
         var1.drawImage(r, I[1], H + J[1], 0);
         var1.drawImage(t, I[2], H + J[2], 0);
         if(i) {
            var1.drawRegion(s, 0, 0, 17, 17, 0, I[1], H + J[1], 0);
         } else {
            var1.drawRegion(s, 0, 0, 17, 17, 1, I[1], H + J[1], 0);
         }

         if(this.T != null) {
            var1.e(A + 30, B + 13, C - 60, D / 2);
            int var5 = F;
            int var4 = E;
            nr_dy var2 = this.T;
            ++this.T.p;
            if(var2.p > var2.o.length - 1) {
               var2.p = 0;
            }

            if(var2.d == 0) {
               if(Mob.c[var2.m.C] != null) {
                  if(Mob.c[var2.m.C].f != null) {
                     Mob.c[var2.m.C].f.a(var1, var2.o[var2.p], var4, var5, 0, 0);
                  } else if(var2.q - GameCanvas.b < 0L) {
                     var2.q = GameCanvas.b + 1500L;
                     var2.m.v();
                  }
               }
            } else if(var2.l != null) {
               var2.l.a(var1, var4, var5, 1, var2.o[var2.p], true);
            }

            GameScr.c(var1);
            mFont.d.drawString(var1, (this.T.j > 0?"Lv." + this.T.j + " ":"") + this.T.h, A + C / 2, B + 15, 2);
            mFont.s.drawString(var1, "no." + this.T.f, A + 30, c - 2, 0);
            var1.drawImage(v, A + 36, c + 10, 0);
            var1.e(A + 36, this.X - this.Y, 7, this.Y);
            var1.drawImage(w, A + 36, c + 10, 0);
            GameScr.c(var1);
            var1.drawImage(z[this.T.a], A + 39 - 5 + 14, c + 12, 0);
         }

         var1.e(b, c, d + 5, e + 8);
         if(this.T != null) {
            var1.drawImage(m, b, c, 0);
         }

         GameScr.c(var1);
         var1.e(b, c + 1, d, e + 5);
         if(this.T != null && this.T.r != null) {
            if(this.T.r.d == null) {
               return;
            }

            this.T.r.a(var1, G);
         }

         GameScr.c(var1);
         if(!i && g.size() > 5 || i) {
            if(this.P > 1) {
               var1.drawImage(n, K[0][0], K[0][1] + this.O[0], 0);
            }

            if(this.P < this.Q) {
               var1.drawImage(o, K[2][0], K[2][1] + this.O[1], 0);
            }
         }

         for(int var8 = 0; var8 < M.length; ++var8) {
            int var3 = 0;
            byte var9 = 0;
            byte var10 = 0;
            if(var8 == this.R) {
               var3 = this.N;
               var9 = -10;
               var10 = 1;
               var1.drawImage(p, L[var8][0] + 10, L[var8][1] + this.N + 29 + -10, 0);
            }

            nr_dy var6 = nr_dy.a(g, M[var8]);
            if(i) {
               var6 = nr_dy.a(f, M[var8]);
            }

            if(var6 != null) {
               j.a(var6.a, L[var8][0], L[var8][1] + var3 + var9, 0, 0, var1);
               SmallImage.drawSmallImage(var1, var6.g, L[var8][0] + 14, L[var8][1] + 14 + var3 + var9, 0, nr_cf.f);
               var6.a(var1, L[var8][0], L[var8][1] + var3 + var9);
               if(var6.j == 0) {
                  var1.drawImage(q, L[var8][0], L[var8][1] + var3 + var9, 0);
               }

               if(var8 == this.R) {
                  j.a(7, L[var8][0], L[var8][1] + var3 + var9, 0, 0, var1);
               }

               if(var6.k == 1) {
                  j.a(8, L[var8][0], L[var8][1] + var3 + var9, 0, 0, var1);
               }
            } else {
               k.a(var10, L[var8][0] - 1, L[var8][1] - 1 + var3 + var9, 0, 0, var1);
            }
         }

      } catch (Exception var7) {
         System.out.println("-paint-radaScr-null: " + var7.toString());
      }
   }

   public final void b() {
      GameScr.a = true;
      super.b();
   }
}
