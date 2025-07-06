package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;

public class Mob implements nr_bm {

   public static nr_dr[] c;
   boolean d;
   short e;
   public boolean f;
   public boolean g = false;
   public int h;
   public long i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o = 1;
   private int a = 1;
   public int p;
   public int q;
   public int r;
   public int s;
   public int t;
   public int u;
   public int v;
   public int w;
   public int x;
   public int y;
   public boolean z;
   public boolean A;
   public boolean B;
   private boolean b;
   private MyVector vMobMove = new MyVector("vMobMove");
   public int C;
   public Char D;
   public int E;
   public int F;
   public int G;
   public byte H;
   public boolean I;
   public boolean isMobMe;
   public static MyVector K = new MyVector("lastMob");
   public static MyVector L = new MyVector("newMob");
   public int M;
   public int N;
   private boolean Z;
   private int aa;
   private boolean ab = true;
   private int ac;
   private int ad;
   public static Image imgHP = Main.loadImage("/mainImage/myTexture2dmobHP.png");
   private boolean ae;
   private int af;
   private int ag;
   private int ah;
   public int P;
   public boolean Q = true;
   private int[] ai = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
   private int[] aj = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
   private int[] ak = new int[]{1, 1, 2, 2, 3, 3, 2};
   private int[] al = new int[]{4, 5, 6};
   private int[] am = new int[]{7, 8, 9};
   private int[] an = new int[1];
   public int R = 24;
   public int S = 100;
   private int ao = 100;
   public Image T;
   private int ap = 0;
   public Char U;
   public boolean V;
   private Mob aq;
   private int ar;
   public boolean W;
   public boolean X;
   private int[][] as;
   private boolean at;
   public int timeDie;
    public long timeLastDie;
    public int countDie;
    public long lastTimeDie;


   public final boolean u() {
      return this instanceof nr_al || this instanceof nr_d || this instanceof nr_by || this instanceof nr_ch;
   }

   public Mob() {
      byte[] var10000 = new byte[]{(byte)-1, (byte)1};
      this.V = false;
      this.as = new int[][]{{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};
      this.at = true;
   }

   public final void v() {
      if(c[this.C].f == null) {
         c[this.C].f = new nr_cg();
         String var1 = "/Mob/" + this.C;
         if("".getClass().getResourceAsStream(var1) != null) {
            c[this.C].f.a(var1 + "/data");
            c[this.C].f.a = Main.loadImage(var1 + "/img.png");
         } else {
            Service.gI().requestModTemplate(this.C);
         }

         K.addElement(String.valueOf(this.C));
      } else {
         this.v = c[this.C].f.f;
         this.w = c[this.C].f.g;
      }
   }

   public void a(short var1) {
      this.d = true;
      this.e = var1;
   }

   public void a() {
      this.d = false;
   }

   public Mob(int var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, int var7, int var8, int var9, byte var10, int var11, short var12, short var13, byte var14, byte var15) {
      byte[] var10000 = new byte[]{(byte)-1, (byte)1};
      this.V = false;
      this.as = new int[][]{{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}};
      this.at = true;
      this.z = var3;
      this.A = var5;
      this.B = var6;
      this.G = var8;
      this.y = var1;
      this.C = var7;
      this.k = var9;
      this.t = this.m = var12;
      this.u = this.n = var13;
      this.p = var14;
      if(var7 != 70) {
         C();
         this.v();
      }

      if(!a(String.valueOf(var7))) {
         L.addElement(String.valueOf(var7));
      }

      this.l = var11;
      this.H = var15;
      this.A();
      this.b = false;
      this.M = var12;
      this.N = var13;
      if(this.D()) {
         this.ai = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.aj = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.ak = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.al = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
         this.am = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
      } else if(this.E()) {
         this.ai = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
         this.aj = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3, 3};
         this.ak = new int[]{1, 1, 2, 2, 1, 1, 3, 3};
         this.al = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6};
         this.am = new int[]{7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9};
      } else if(this.e()) {
         this.ai = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
         this.aj = new int[]{2, 2, 3, 3, 2, 2, 4, 4, 2, 2, 3, 3, 2, 2, 4, 4};
         this.ak = new int[]{2, 2, 3, 3, 2, 2, 4, 4};
         this.al = new int[]{5, 6, 7, 8, 9, 10, 11, 12};
         this.am = new int[]{5, 12, 13, 14};
      } else {
         this.ai = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
         this.aj = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
         this.ak = new int[]{1, 1, 2, 2, 3, 3, 2};
         this.al = new int[]{4, 5, 6};
         this.am = new int[]{7, 8, 9};
      }

      Res.out("MOB ID= " + var1);
   }

   public static boolean a(String var0) {
      for(int var1 = 0; var1 < L.size(); ++var1) {
         if(((String)L.elementAt(var1)).equals(var0)) {
            return true;
         }
      }

      return false;
   }

   private static void C() {
      int var0 = 0;

      int var1;
      for(var1 = 0; var1 < c.length; ++var1) {
         if(c[var1].f != null) {
            ++var0;
         }
      }

      if(var0 >= 10) {
         for(var1 = 0; var1 < c.length; ++var1) {
            if(c[var1].f != null && var0 > 5) {
               c[var1].f = null;
            }
         }
      }

   }

   public void a(int[] var1) {
      if(this.ac > var1.length - 1) {
         this.ac = 0;
      }

      this.ad = var1[this.ac];
      ++this.ac;
   }

   public void b() {
      if(this.P == 0 && GameCanvas.gameTick % 25 == 0) {
         ServerEffect.a(114, this, 1);
      }

      if(this.P == 1 && GameCanvas.gameTick % 4 == 0) {
         ServerEffect.a(132, this, 1);
      }

      if(this.P == 2 && GameCanvas.gameTick % 7 == 0) {
         ServerEffect.a(131, this, 1);
      }

   }

   public void c() {
       if ((this.b || this.k <= 0 || this.p == 0 || this.p == 1) &&
    (System.currentTimeMillis() - this.lastTimeDie > 1000L)) {
    
    this.timeDie--;
    this.lastTimeDie = System.currentTimeMillis();
}
      this.B();
      if(this.W && GameCanvas.gameTick % 5 == 0) {
         ServerEffect.addServerEffect(113, this.m, this.n, 1);
      }

      if(this.X && GameCanvas.gameTick % 10 == 0) {
         EffecMn.addEff(new Effect(41, this.m, this.n, 3, 1, 1));
      }

      int var1;
      if(!GameCanvas.lowGraphic && this.p != 1 && this.p != 0 && !GameCanvas.lowGraphic && GameCanvas.gameTick % (15 + (this.y << 1)) == 0) {
         for(var1 = 0; var1 < GameScr.D.size(); ++var1) {
            Char var2;
            if((var2 = (Char)GameScr.D.elementAt(var1)) != null && var2.cg && var2.ar == 32) {
               Char var3;
               (var3 = new Char()).cx = var2.cx;
               var3.cy = var2.cy - var2.al;
               if(var2.cgender == 0) {
                  nr_ag.a(this.m + this.o * this.v, this.n, this.j(), -100, -100, var3, 25);
               }
            }
         }

         if(Char.myCharz().cg && Char.myCharz().ar == 32) {
            Char var4;
            (var4 = new Char()).cx = Char.myCharz().cx;
            var4.cy = Char.myCharz().cy - Char.myCharz().al;
            if(Char.myCharz().cgender == 0) {
               nr_ag.a(this.m + this.o * this.v, this.n, this.j(), -100, -100, var4, 25);
            }
         }
      }

      if(this.j != 0 && GameCanvas.gameTick % 5 == 0) {
         EffecMn.addEff(new Effect(this.j, this.m, this.n + 24, 3, 5, 1));
      }

      if(this.g) {
         if(GameCanvas.gameTick % 5 == 0) {
            ServerEffect.addServerEffect(113, this.m, this.n, 1);
         }

         long var5;
         if((var5 = System.currentTimeMillis()) - this.i >= 1000L) {
            --this.h;
            this.i = var5;
            if(this.h < 0) {
               this.g = false;
               this.h = 0;
            }
         }

         if(this.F()) {
            this.ad = this.an[GameCanvas.gameTick % this.an.length];
         } else if(this.D()) {
            this.ad = this.al[GameCanvas.gameTick % this.al.length];
         } else if(this.E()) {
            if(GameCanvas.gameTick % 20 > 5) {
               this.ad = 11;
            } else {
               this.ad = 10;
            }
         } else if(this.e()) {
            if(GameCanvas.gameTick % 20 > 5) {
               this.ad = 1;
            } else {
               this.ad = 15;
            }
         } else if(GameCanvas.gameTick % 20 > 5) {
            this.ad = 11;
         } else {
            this.ad = 10;
         }
      }

      if(this.i()) {
         if(this.ab) {
            Mob var6 = this;
            byte var7 = TileMap.i;
            this.M = this.m;
            this.aa = 0;
            if(this.N > 0 && !TileMap.a(this.M, this.N, 2)) {
               if(TileMap.a(this.M / var7, this.N / var7) == 0) {
                  this.Z = true;
               } else if(TileMap.a(this.M / var7, this.N / var7) != 0 && !TileMap.a(this.M, this.N, 2)) {
                  this.M = this.m;
                  this.N = this.n;
                  this.Z = false;
               }

               while(var6.Z && var6.aa < 10) {
                  ++var6.aa;
                  var6.N += 24;
                  if(TileMap.a(var6.M, var6.N, 2)) {
                     if(var6.N % 24 != 0) {
                        var6.N %= 24;
                     }
                     break;
                  }
               }
            }
         }

         if(this.vMobMove != null || c[this.C].a == 0) {
            if(this.p != 3 && this.Q) {
               if(this.D != null) {
                  this.D.doInjure(this.E, this.F, false, true);
               } else if(this.aq != null) {
                  this.aq.d();
               }

               this.Q = false;
            }

            if(this.H > 0) {
               this.b();
            }

            switch(this.p) {
            case 1:
               this.z = false;
               this.A = false;
               this.B = false;
               this.n += this.q;
               if(GameCanvas.gameTick % 2 == 0) {
                  if(this.r > 1) {
                     --this.r;
                  } else if(this.r < -1) {
                     ++this.r;
                  }
               }

               this.m += this.r;
               if(this.F()) {
                  this.ad = this.an[GameCanvas.gameTick % this.an.length];
               } else if(this.D()) {
                  this.ad = this.al[GameCanvas.gameTick % this.al.length];
               } else if(!this.E() && this.e()) {
                  this.ad = 15;
               } else {
                  this.ad = 11;
               }

               if(this.b) {
                  this.b = false;
                  if(this.isMobMe) {
                     for(var1 = 0; var1 < GameScr.vMob.size(); ++var1) {
                        if(((Mob)GameScr.vMob.elementAt(var1)).y == this.y) {
                           GameScr.vMob.removeElementAt(var1);
                        }
                     }
                  }

                  this.q = 0;
                  this.r = 0;
                  this.m = this.n = 0;
                  this.k = this.z().d;
                  this.p = 0;
                  this.x = 0;
                  return;
               }

               if((TileMap.b(this.m, this.n) & 2) == 2) {
                  this.q = this.q > 4?-4:-this.q;
                  if(this.s == 0) {
                     this.s = 16;
                  }
               } else {
                  ++this.q;
               }

               if(this.s > 0) {
                  --this.s;
                  if(this.s == 0) {
                     this.b = true;
                     return;
                  }
               }
               break;
            case 2:
               if(this.j != 0) {
                  return;
               }

               if(this.g) {
                  return;
               }

               if(this.W) {
                  return;
               }

               if(this.X) {
                  return;
               }

               this.x = 0;
               this.a(this.ai);
               switch(c[this.C].c) {
               case 0:
               case 1:
               case 2:
               case 3:
                  ++this.q;
                  if(this.q > 10 + this.y % 10 && (this.D == null || Res.g(this.D.cx - this.m) > 80) && (this.aq == null || Res.g(this.aq.m - this.m) > 80)) {
                     this.p = 5;
                  }
                  break;
               case 4:
               case 5:
                  ++this.q;
                  if(this.q > this.y % 3 && (this.D == null || Res.g(this.D.cx - this.m) > 80) && (this.aq == null || Res.g(this.aq.m - this.m) > 80)) {
                     this.p = 5;
                  }
               }

               if(this.D != null && GameCanvas.gameTick % (10 + this.q % 20) == 0) {
                  if(this.D.cx > this.m) {
                     this.o = 1;
                  } else {
                     this.o = -1;
                  }
               } else if(this.aq != null && GameCanvas.gameTick % (10 + this.q % 20) == 0) {
                  if(this.aq.m > this.m) {
                     this.o = 1;
                  } else {
                     this.o = -1;
                  }
               }

               if(this.ar > 0) {
                  --this.ar;
                  this.p = 2;
               }

               return;
            case 3:
               if(this.j != 0) {
                  return;
               }

               if(this.W) {
                  return;
               }

               if(this.X) {
                  return;
               }

               if(this.g) {
                  return;
               }

               this.f();
               return;
            case 4:
               if(this.j != 0) {
                  return;
               }

               if(this.W) {
                  return;
               }

               if(this.X) {
                  return;
               }

               if(this.g) {
                  return;
               }

               this.x = 0;
               ++this.q;
               if(this.q > 40 + this.y % 5) {
                  this.n -= 2;
                  this.p = 5;
                  this.q = 0;
                  return;
               }
               break;
            case 5:
               if(this.j != 0) {
                  return;
               }

               if(this.W) {
                  return;
               }

               if(this.X) {
                  return;
               }

               if(this.g) {
                  if(c[this.C].c == 4) {
                     ++this.ah;
                     ++this.af;
                     this.ag += !this.ae?1:-1;
                     if(this.af == 10) {
                        this.af = 0;
                        this.ae = !this.ae;
                     }
                  }

                  return;
               }

               this.x = 0;
               this.g();
               return;
            case 6:
               this.x = 0;
               ++this.q;
               this.n += this.q;
               if(this.n >= this.u) {
                  this.n = this.u;
                  this.q = 0;
                  this.p = 5;
                  return;
               }
               break;
            case 7:
               if(!this.Q && GameCanvas.gameTick % 4 == 0) {
                  if(this.F()) {
                     this.ad = this.an[GameCanvas.gameTick % this.an.length];
                  } else if(this.D()) {
                     this.ad = this.al[GameCanvas.gameTick % this.al.length];
                  } else if(this.E()) {
                     if(this.ad != 10) {
                        this.ad = 10;
                     } else {
                        this.ad = 11;
                     }
                  } else if(this.e()) {
                     if(this.ad != 1) {
                        this.ad = 1;
                     } else {
                        this.ad = 15;
                     }
                  } else if(this.ad != 10) {
                     this.ad = 10;
                  } else {
                     this.ad = 11;
                  }
               }

               --this.x;
               if(this.x <= 0 && (this.F() || this.D() || this.E() && this.ad == 11 || this.e() && this.ad == 15 || this.C < 58 && this.ad == 11)) {
                  if((this.U == null || !this.V) && this.k != 0) {
                     this.p = 5;
                     if(this.U != null) {
                        this.o = -this.U.I;
                        if(Res.g(this.m - this.U.cx) < 24) {
                           this.p = 2;
                        }
                     }

                     this.q = this.r = this.s = 0;
                     this.x = 0;
                  } else {
                     this.p = 1;
                     this.r = this.U.I << 1;
                     this.q = -3;
                     this.s = 0;
                  }

                  this.U = null;
                  return;
               }

               if(c[this.C].c != 0 && this.U != null) {
                  int var8 = -this.U.I << 1;
                  if(this.m > this.t - c[this.C].a && this.m < this.t + c[this.C].a) {
                     this.m -= var8;
                  }
               }
            }

         }
      }
   }

   public void d() {
      if(this.k > 0 && this.p != 3) {
         this.x = 4;
         this.p = 7;
         if(this.z().c != 0 && Res.g(this.m - this.t) < 30) {
            this.m -= 10 * this.o;
         }
      }

   }

   public static nr_by w() {
      for(int var0 = 0; var0 < GameScr.vMob.size(); ++var0) {
         Mob var1;
         if((var1 = (Mob)GameScr.vMob.elementAt(var0)) instanceof nr_by) {
            return (nr_by)var1;
         }
      }

      return null;
   }

   public static nr_d x() {
      for(int var0 = 0; var0 < GameScr.vMob.size(); ++var0) {
         Mob var1;
         if((var1 = (Mob)GameScr.vMob.elementAt(var0)) instanceof nr_d) {
            return (nr_d)var1;
         }
      }

      return null;
   }

   public static nr_al y() {
      for(int var0 = 0; var0 < GameScr.vMob.size(); ++var0) {
         Mob var1;
         if((var1 = (Mob)GameScr.vMob.elementAt(var0)) instanceof nr_al) {
            return (nr_al)var1;
         }
      }

      return null;
   }

   public static nr_ch a(byte var0) {
      Mob var1;
      return (var1 = (Mob)GameScr.vMob.elementAt(var0)) instanceof nr_ch?(nr_ch)var1:null;
   }

   public void a(Char var1) {
      this.Q = true;
      this.aq = null;
      this.D = var1;
      this.q = 0;
      this.r = 0;
      this.p = 3;
      this.ac = 0;
      this.o = var1.cx > this.m?1:-1;
      int var2 = var1.cx;
      int var3 = var1.cy;
      if(Res.g(var2 - this.m) < this.v << 1 && Res.g(var3 - this.n) < this.w << 1) {
         if(this.m < var2) {
            this.m = var2 - this.v;
         } else {
            this.m = var2 + this.v;
         }

         this.s = 0;
      } else {
         this.s = 1;
      }
   }

   boolean e() {
      return this.C >= 58 && this.C <= 65 || this.C == 67 || this.C == 68;
   }

   private boolean D() {
      return this.C == 76;
   }

   private boolean E() {
      return this.C >= 73 && !this.D();
   }

   public void f() {
      int[] var1 = this.s == 0?this.al:this.am;
      if(this.ac < var1.length) {
         this.a(var1);
         if(this.m >= GameScr.j && this.m <= GameScr.j + GameCanvas.z && this.s == 0 && GameCanvas.gameTick % 2 == 0) {
            SoundMn.gI();
         }
      }

      if(this.q == 0) {
         int var2 = this.D != null?this.D.cx:this.aq.m;
         int var3 = this.D != null?this.D.cy:this.aq.n;
         if(!this.E()) {
            if(this.m > this.t + c[this.C].a) {
               this.q = 1;
            }

            if(this.m < this.t - c[this.C].a) {
               this.q = 1;
            }
         }

         if((c[this.C].c == 4 || c[this.C].c == 5) && !this.z) {
            this.n += (var3 - this.n) / 20;
         }

         ++this.r;
         if(this.r > var1.length - 1 || this.q == 1) {
            this.q = 1;
            if(this.s == 0) {
               if(this.D != null) {
                  this.D.doInjure(this.E, this.F, false, true);
               } else {
                  this.aq.d();
               }

               this.Q = false;
            } else {
               if(this.D != null) {
                  nr_ag.a(this.m + this.o * this.v, this.n, this.j(), this.E, this.F, this.D, this.z().g);
               } else {
                  Char var4;
                  (var4 = new Char()).cx = this.aq.m;
                  var4.cy = this.aq.n;
                  var4.charID = -100;
                  nr_ag.a(this.m + this.o * this.v, this.n, this.j(), this.E, this.F, var4, this.z().g);
               }

               this.Q = false;
            }
         }

         this.o = this.m < var2?1:-1;
      } else {
         if(this.q == 1) {
            if(c[this.C].c != 0 && !this.z && !this.A && !this.B) {
               this.m += (this.t - this.m) / 4;
               this.n += (this.u - this.n) / 4;
            }

            if(Res.g(this.t - this.m) < 5 && Res.g(this.u - this.n) < 5 && this.ac == var1.length) {
               this.p = 2;
               this.q = 0;
               this.r = 0;
               this.ac = 0;
            }
         }

      }
   }

   public void g() {
      try {
         if(this.V) {
            this.p = 1;
            this.r = this.U.I << 3;
            this.q = -5;
            this.s = 0;
         }

         if(this.A) {
            return;
         }

         if(this.z || this.B) {
            this.a(this.ai);
            return;
         }

         byte var1;
         switch(c[this.C].c) {
         case 0:
            if(!this.D()) {
               this.ad = 0;
               return;
            }

            this.ad = this.ai[GameCanvas.gameTick % this.ai.length];
            break;
         case 1:
         case 2:
         case 3:
            if((var1 = c[this.C].b) == 1) {
               if(GameCanvas.gameTick % 2 == 1) {
                  return;
               }
            } else if(var1 > 2) {
               var1 = (byte)(var1 + this.y % 2);
            } else if(GameCanvas.gameTick % 2 == 1) {
               --var1;
            }

            this.m += var1 * this.o;
            if(this.m > this.t + c[this.C].a) {
               this.o = -1;
            } else if(this.m < this.t - c[this.C].a) {
               this.o = 1;
            }

            if(Res.g(this.m - Char.myCharz().cx) < 40 && Res.g(this.m - this.t) < c[this.C].a) {
               this.o = this.m > Char.myCharz().cx?-1:1;
               if(Res.g(this.m - Char.myCharz().cx) < 20) {
                  this.m -= this.o * 10;
               }

               this.p = 2;
               this.ar = 20;
            }

            this.a(this.v > 30?this.aj:this.ak);
            return;
         case 4:
            var1 = (byte)(c[this.C].b + this.y % 2);
            this.m += var1 * this.o;
            if(GameCanvas.gameTick % 10 > 2) {
               this.n += var1 * this.a;
            }

            if(this.m > this.t + c[this.C].a) {
               this.o = -1;
               this.p = 2;
               this.ar = GameCanvas.gameTick % 20 + 20;
               this.q = 0;
            } else if(this.m < this.t - c[this.C].a) {
               this.o = 1;
               this.p = 2;
               this.ar = GameCanvas.gameTick % 20 + 20;
               this.q = 0;
            }

            if(this.n > this.u + 24) {
               this.a = -1;
            } else if(this.n < this.u - (20 + GameCanvas.gameTick % 10)) {
               this.a = 1;
            }

            this.a(this.aj);
            return;
         case 5:
            var1 = (byte)(c[this.C].b + this.y % 2);
            this.m += var1 * this.o;
            var1 = (byte)(var1 + (GameCanvas.gameTick + this.y) % 2);
            if(GameCanvas.gameTick % 10 > 2) {
               this.n += var1 * this.a;
            }

            if(this.m > this.t + c[this.C].a) {
               this.o = -1;
               this.p = 2;
               this.ar = GameCanvas.gameTick % 20 + 20;
               this.q = 0;
            } else if(this.m < this.t - c[this.C].a) {
               this.o = 1;
               this.p = 2;
               this.ar = GameCanvas.gameTick % 20 + 20;
               this.q = 0;
            }

            if(this.n > this.u + 24) {
               this.a = -1;
            } else if(this.n < this.u - (20 + GameCanvas.gameTick % 10)) {
               this.a = 1;
            }

            if(!TileMap.a(this.m, this.n, 2)) {
               break;
            }

            if(GameCanvas.gameTick % 10 > 5) {
               this.n = TileMap.e(this.n);
               this.p = 4;
               this.q = 0;
               this.a = -1;
               return;
            }

            this.a = -1;
         default:
            return;
         }
      } catch (Exception var2) {
         ;
      }

   }

   public final nr_dr z() {
      return c[this.C];
   }

   public boolean h() {
      return this.m < GameScr.j?false:(this.m > GameScr.j + GameScr.d?false:(this.n < GameScr.k?false:(this.n > GameScr.k + GameScr.e + 30?false:(c[this.C] == null?false:(c[this.C].f == null?false:(c[this.C].f.a == null?false:this.p != 0))))));
   }

   public boolean i() {
      return c[this.C] == null?false:(c[this.C].f == null?false:this.p != 0);
   }

   public boolean j() {
      return this.I || this.H > 0;
   }

   public final void A() {
      this.S = (int)((long)this.k * 100L / (long)this.l);
      if(this.S >= 100) {
         this.ao = this.S;
      }

      this.ap = 0;
      if(this.S < 30) {
         this.T = GameScr.aG;
      } else if(this.S < 60) {
         this.T = GameScr.aH;
      } else {
         this.T = GameScr.aJ;
      }
   }

   public void a(mGraphics var1) {
      if(this.ab && this.p != 0) {
         byte var4 = TileMap.i;
         if(TileMap.a(this.M + var4 / 2, this.N + 1, 4)) {
            var1.e(this.M / var4 * var4, (this.N - 30) / var4 * var4, var4, 100);
         } else if(TileMap.a((this.M - var4 / 2) / var4, (this.N + 1) / var4) == 0) {
            var1.e(this.M / var4 * var4, (this.N - 30) / var4 * var4, 100, 100);
         } else if(TileMap.a((this.M + var4 / 2) / var4, (this.N + 1) / var4) == 0) {
            var1.e(this.M / var4 * var4, (this.N - 30) / var4 * var4, var4, 100);
         } else if(TileMap.a(this.M - var4 / 2, this.N + 1, 8)) {
            var1.e(this.M / 24 * var4, (this.N - 30) / var4 * var4, var4, 100);
         }

         var1.drawImage(TileMap.bong, this.M, this.N, 3);
         var1.e(GameScr.j, GameScr.k - GameCanvas.Z, GameScr.d, GameScr.e + 2 * GameCanvas.Z);
      }

      if(this.h()) {
         if(this.p != 1 || this.s <= 0 || GameCanvas.gameTick % 3 != 0) {
            var1.a(0, GameCanvas.Z);
            if(!this.d) {
               c[this.C].f.a(var1, this.ad, this.m, this.n + this.ag, this.o == 1?0:1, 2);
            } else {
               SmallImage.drawSmallImage(var1, this.e, this.m, this.n + this.ag - 14, 0, 3);
            }

            var1.a(0, -GameCanvas.Z);
            if(Char.myCharz().aP != null && Char.myCharz().aP.equals(this) && this.p != 1 && this.k > 0 && this.T != null) {
               int var2 = mGraphics.getImageWidth(this.T);
               int var3 = mGraphics.getImageHeight(this.T);
               int var6;
               int var5 = var6 = var2 * this.S / 100;
               if(this.ao >= this.S) {
                  var5 = var2 * (this.ao -= GameCanvas.gameTick % 6 > 3?this.ap++:this.ap) / 100;
                  if(this.ao <= 0) {
                     this.ao = 0;
                  }

                  if(this.ao < this.S) {
                     this.ao = this.S;
                  }

                  if(this.ap >= 3) {
                     this.ap = 3;
                  }
               }

               var1.drawImage(GameScr.aI, this.m - (var2 >> 1), this.n - this.w - 5, 20);
               var1.a(16777215);
               var1.d(this.m - (var2 >> 1), this.n - this.w - 5, var5, 2);
               var1.drawRegion(this.T, 0, 0, var6, var3, 0, this.m - (var2 >> 1), this.n - this.w - 5, 20);
            }

         }
      }
   }

   public void k() { // hp đây
      this.k = 0;
      this.V = true;
      this.k = 0;
      this.p = 1;
      this.q = -3;
      this.r = -this.o;
      this.s = 0;
      this.lastTimeDie = System.currentTimeMillis();
		this.timeDie = 5;
   }

   public void a(Mob var1) {
      this.aq = var1;
      this.Q = true;
      this.D = null;
      this.q = 0;
      this.r = 0;
      this.p = 3;
      this.ac = 0;
      this.o = var1.m > this.m?1:-1;
      int var2 = var1.m;
      int var3 = var1.n;
      if(Res.g(var2 - this.m) < this.v << 1 && Res.g(var3 - this.n) < this.w << 1) {
         if(this.m < var2) {
            this.m = var2 - this.v;
         } else {
            this.m = var2 + this.v;
         }

         this.s = 0;
      } else {
         this.s = 1;
      }
   }

   public int getX() {
      return this.m;
   }

   public int getY() {
      return this.n;
   }

   public int getH() {
      return this.w;
   }

   public int getW() {
      return this.v;
   }

   public void stopMoving() {
      if(this.p == 5) {
         this.p = 2;
         this.q = this.r = this.s = 0;
         this.ar = 50;
      }

   }

   public boolean isInvisible() {
      return this.p == 0 || this.p == 1;
   }

   public void r() {
      if(this.j != 0) {
         this.j = 0;
      }

   }

   public void s() {
      this.W = false;
   }

   public void t() {
      this.X = false;
   }

   public void B() {
      if(this.at && this.F() && c[this.C].f != null) {
         this.as = (int[][])Controller.c.get(String.valueOf(this.C));
         this.ai = this.as[0];
         this.aj = this.as[1];
         this.ak = this.as[2];
         this.al = this.as[3];
         this.am = this.as[4];
         this.an = this.as[5];
         this.at = false;
      }

   }

   private boolean F() {
      return c[this.C].f != null && c[this.C].f.e == 2;
   }
}
