package nro;

import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;
import nro.ChatPopup;
import nro.Rms;
import nro.mResources;
import nro.mScreen;
import nro.PopUp;
import nro.Session_ME;
import nro.nr_bo;
import nro.Service;
import nro.SoundMn;
import nro.TileMap;
import nro.TField;
import nro.nr_cw;
import nro.Command;
import nro.mFont;
import nro.Res;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;
import nro.IActionListener;

public final class nr_x extends mScreen implements IActionListener {

   public TField a;
   public TField b;
   public static boolean c = false;
   private int o;
   private int p;
   private int q;
   private int r;
   private boolean s = false;
   private boolean t = false;
   private Command u;
   private Command v;
   private Command w;
   private Command x;
   private Command y;
   public static boolean d;
   public static boolean e;
   public static boolean f;
   public static boolean g;
   public static boolean h;
   public static String i;
   public static Image j;
   public static short k;
   public static long l;
   public static long m;
   private int z;
   private Command A;
   private int B;
   private int C;
   private int D;
   private int E = -1;
   public boolean isLogin2 = false;
   private int F = 2;
   private int G = 0;
   private int H = -40;
   private int I = 1;
   private Command J;


   static {
      int[] var10000 = new int[]{0, 8, 2, 6, 9};
   }

   public final void b() {
      SoundMn.gI();
      this.a.e = true;
      this.b.e = false;
      if(GameCanvas.isTouch) {
         this.a.e = false;
      }

      GameCanvas.a(0);
      super.b();
   }

   public nr_x() {
      this.C = GameCanvas.C - 30;
      if((TileMap.o = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || TileMap.o == 6) {
         TileMap.o = 4;
      }

      GameScr.a(-1, (int)-1);
      GameScr.j = 100;
      GameScr.k = 200;
      if(GameCanvas.A > 200) {
         this.r = GameCanvas.C - 80;
      } else {
         this.r = GameCanvas.C - 65;
      }

      this.q = -50;
      int var1 = GameCanvas.z >= 200?160:140;
      this.p = var1;
      this.z = GameCanvas.C - mScreen.cd - 5;
      if(GameCanvas.A <= 160) {
         this.z = 20;
      }

      this.a = new TField();
      this.a.b = GameCanvas.C - mScreen.cd - 9;
      this.a.c = this.p;
      this.a.d = mScreen.cd + 2;
      this.a.e = true;
      this.a.c(0);
      this.a.i = (mResources.fw == 2?"":mResources.ae + "/") + mResources.af;
      this.b = new TField();
      this.b.b = GameCanvas.C - 4;
      this.b.c(2);
      this.b.c = this.p;
      this.b.d = mScreen.cd + 2;
      this.z += 35;
      this.s = true;
      if((var1 = Rms.loadRmsInt("check")) == 1) {
         this.s = true;
      } else if(var1 == 2) {
         this.s = false;
      }

      this.a.a(Rms.c("acc"));
      this.b.a(Rms.c("pass"));
      this.a.a((String)null);
      this.b.a((String)null);
      if(this.J == null) {
         this.J = new Command("Gọi hotline", this, 13, (Object)null);
         this.J.x = GameCanvas.z - 75;
         if(Main.typeClient == 1 && !GameCanvas.isTouch) {
            this.J.y = GameCanvas.A - 20;
         } else {
            this.J.y = 8;
         }
      }

      this.o = 0;
      this.u = new Command(GameCanvas.z > 200?mResources.as:mResources.at, GameCanvas.h, 888393, (Object)null);
      new Command(mResources.bp, this, 2001, (Object)null);
      this.w = new Command(mResources.au, this, 2002, (Object)null);
      this.y = new Command(mResources.br, this, 10021, (Object)null);
      super.ca = this.x = new Command(mResources.be, this, 2003, (Object)null);
      if(GameCanvas.isTouch) {
         this.u.x = GameCanvas.z / 2 + 8;
         this.x.x = GameCanvas.z / 2 - mScreen.cmdW - 8;
         if(GameCanvas.A >= 200) {
            this.u.y = this.C + 110;
            this.x.y = this.C + 110;
         }

         this.y.x = GameCanvas.z / 2 + 3;
         this.y.y = this.C + 110;
         this.w.x = GameCanvas.z / 2 - 84;
         this.w.y = this.x.y;
      }

      this.D = 170;
      short var2 = 184;
      if(184 >= GameCanvas.z) {
         var2 = 152;
      }

      this.B = GameCanvas.z / 2 - var2 / 2;
      this.C = GameCanvas.C - 30;
      this.a.a = this.B + 10;
      this.a.b = this.C + 20;
      this.A = new Command(mResources.bo, this, 2008, (Object)null);
      this.A.x = GameCanvas.z / 2 - 84;
      this.A.y = this.u.y;
      this.v = new Command(mResources.X, this, 1003, (Object)null);
      this.v.x = GameCanvas.z / 2 + 3;
      this.v.y = this.u.y;
      super.cb = this.A;
      super.ca = this.v;
   }

   public final void a() {
      Res.out("user ao= " + Rms.c("userAo" + nr_bo.m));
      String var1 = Rms.c("acc");
      String var2 = Rms.c("pass");
      if((var1 == null || var1.equals("")) && Rms.c("userAo" + nr_bo.m) != null && !Rms.c("userAo" + nr_bo.m).equals("")) {
         this.isLogin2 = true;
      } else {
         this.isLogin2 = false;
      }

      Res.out("isLogin 2= " + this.isLogin2);
      if((var1 == null || var1.equals("")) && this.isLogin2) {
         var1 = Rms.c("userAo" + nr_bo.m);
         var2 = "a";
      }

      Res.out("user = " + var1 + " pass= " + var2);
      if(var1 != null && var2 != null && !var1.equals("")) {
         if(var2.equals("")) {
            this.o = 1;
            this.a.e = false;
            this.b.e = true;
            if(!GameCanvas.isTouch) {
               super.cc = this.b.j;
            }

         } else {
            if(!Session_ME.gI().d()) {
               GameCanvas.b();
            }

            Service.gI().login(var1, var2, "2.3.0", (byte)(this.isLogin2?1:0));
            Res.out(this.getClass().getName() + " doLogin =" + var1);
            GameCanvas.h();
            this.o = 0;
            if(!this.isLogin2) {
               this.h();
            }

         }
      }
   }

   public final void e() {
      if(this.s) {
         Rms.saveRMSInt("check", 1);
         Rms.a("acc", this.a.getText().toLowerCase().trim());
         Rms.a("pass", this.b.getText().toLowerCase().trim());
      } else {
         Rms.saveRMSInt("check", 2);
         Rms.a("acc", "");
         Rms.a("pass", "");
      }
   }

   public final void c() {
      if(k > 0) {
         GameCanvas.h();
         if((m = System.currentTimeMillis()) - l >= 1000L) {
            if(--k == 0) {
               GameCanvas.loginScr.a();
            }

            l = m;
         }
      }

      if(this.isLogin2 && !this.t) {
         this.a.i = (mResources.fw == 2?"":mResources.ae + "/") + mResources.af;
         this.b.i = mResources.Y;
         this.a.k = false;
         this.b.k = false;
         this.a.c();
         this.b.c();
      } else {
         this.a.i = (mResources.fw == 2?"":mResources.ae + "/") + mResources.af;
         this.b.i = mResources.Y;
         this.a.c();
         this.b.c();
      }

      for(int var1 = 0; var1 < nr_cw.w.size(); ++var1) {
         ((nr_cw)nr_cw.w.elementAt(var1)).a();
      }

      if(d && !e && !h && !f && !g) {
         d = false;
         System.gc();
         Service.gI().r();
      }

      if(++GameScr.j > GameCanvas.z * 3 + 100) {
         GameScr.j = 100;
      }

      if(ChatPopup.m == null) {
         if(this.r != this.q) {
            this.q += this.r - this.q >> 1;
         }

         if(this.G >= 0) {
            this.H += this.I * this.G;
            this.G += this.I * this.F;
            if(this.G <= 0) {
               this.I = -this.I;
            }

            if(this.H > 0) {
               this.I = -this.I;
               this.G -= 2 * this.F;
            }
         }

         if(this.E >= 0 && GameCanvas.gameTick % 100 == 0) {
            ++this.E;
            if(this.E >= mResources.aU.length) {
               this.E = 0;
            }

            if(GameCanvas.J == GameCanvas.K && GameCanvas.K.a) {
               GameCanvas.K.a(mResources.aU[this.E]);
            }
         }

         if(this.isLogin2 && !this.t) {
            this.a.k = false;
            this.b.k = false;
            this.a.c();
            this.b.c();
         } else {
            this.a.i = (mResources.fw == 2?"":mResources.ae + "/") + mResources.af;
            this.b.i = mResources.Y;
            this.a.c();
            this.b.c();
         }

         if(GameCanvas.isTouch) {
            if(this.t) {
               super.cb = this.w;
               super.ca = this.y;
            } else {
               super.cb = this.A;
               super.ca = this.v;
            }
         } else if(this.t) {
            super.cb = this.w;
            super.ca = this.y;
         } else {
            super.cb = this.A;
            super.ca = this.v;
         }
      }
   }

   public final void a(int var1) {
      if(this.a.e) {
         this.a.a(var1);
      } else if(this.b.e) {
         this.b.a(var1);
      }

      super.a(var1);
   }

   public final void a(mGraphics var1) {
      GameCanvas.b(var1);
      int var2 = this.a.b - 50;
      if(GameCanvas.A <= 220) {
         var2 += 5;
      }

      mFont.s.a(var1, "v2.3.0", GameCanvas.z - 2, 17, 1, mFont.o);
      if(Main.typeClient == 1 && !GameCanvas.isTouch) {
         mFont.s.a(var1, nr_bo.j, GameCanvas.z - 2, GameCanvas.A - 15, 1, mFont.o);
      } else {
         mFont.s.a(var1, nr_bo.j, GameCanvas.z - 2, 2, 1, mFont.o);
      }

      if(ChatPopup.m == null) {
         if(ChatPopup.n == null) {
            if(GameCanvas.J == null) {
               int var3 = GameCanvas.z >= 200?180:160;
               PopUp.a(var1, this.B, this.C - 10, var3, 105, -1, true);
               if(GameCanvas.A > 160 && j != null) {
                  var1.drawImage(j, GameCanvas.B, var2, 3);
               }

               short var4 = 184;
               if(184 >= GameCanvas.z) {
                  var4 = 152;
               }

               this.B = GameCanvas.z / 2 - var4 / 2;
               this.a.a = this.B + 10;
               this.a.b = this.C + 20;
               this.b.a = this.B + 10;
               this.b.b = this.C + 55;
               this.a.a(var1);
               this.b.a(var1);
               if(GameCanvas.z < 176) {
                  mFont.tahoma_7b_green2.drawString(var1, mResources.ag + ":", this.a.a - 35, this.a.b + 7, 0);
                  mFont.tahoma_7b_green2.drawString(var1, mResources.ah + ":", this.b.a - 35, this.b.b + 7, 0);
                  mFont.tahoma_7b_green2.drawString(var1, mResources.aF + ": " + i, GameCanvas.z / 2, this.b.b + 32, 2);
               }
            }

            super.a(var1);
         }
      }
   }

   public final void d() {
      if(GameCanvas.isTouch && this.J != null && this.J.isPointerPressInside()) {
         this.J.performAction();
      }

      if(!c) {
         if(!GameCanvas.isTouch) {
            if(this.a.e) {
               super.cc = this.a.j;
            } else {
               super.cc = this.b.j;
            }
         }

         if(GameCanvas.i[2]) {
            --this.o;
            if(this.o < 0) {
               this.o = 1;
            }
         } else if(GameCanvas.i[8]) {
            ++this.o;
            if(this.o > 1) {
               this.o = 1;
            }
         }

         if(GameCanvas.i[2] || GameCanvas.i[8]) {
            GameCanvas.e();
            if(!this.isLogin2 || this.t) {
               if(this.o == 1) {
                  this.a.e = false;
                  this.b.e = true;
               } else if(this.o == 0) {
                  this.a.e = true;
                  this.b.e = false;
               } else {
                  this.a.e = false;
                  this.b.e = false;
               }
            }
         }

         if(GameCanvas.isTouch) {
            if(this.t) {
               super.cb = this.w;
               super.ca = this.y;
            } else {
               super.cb = this.A;
               super.ca = this.v;
            }
         } else if(this.t) {
            super.cb = this.w;
            super.ca = this.y;
         } else {
            super.cb = this.A;
            super.ca = this.v;
         }

         if(GameCanvas.m && (!this.isLogin2 || this.t)) {
            if(GameCanvas.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
               this.o = 0;
            } else if(GameCanvas.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
               this.o = 1;
            }
         }

         super.d();
         GameCanvas.e();
      }
   }

   public final void perform(int var1, Object var2) {
      String var9;
      switch(var1) {
      case 13:
         switch(Main.typeClient) {
         case 1:
            Main.a();
            return;
         case 2:
         case 4:
         default:
            return;
         case 3:
         case 5:
            return;
         case 6:
            return;
         }
      case 1000:
         try {
            GameMidlet.instance.platformRequest((String)var2);
         } catch (Exception var5) {
            var5.printStackTrace();
         }

         GameCanvas.g();
         return;
      case 1001:
         GameCanvas.g();
         this.t = false;
         return;
      case 1002:
         GameCanvas.h();
         String var8;
         if((var8 = Rms.c("userAo" + nr_bo.m)) != null && !var8.equals("")) {
            GameCanvas.loginScr.isLogin2 = true;
            GameCanvas.b();
            Service.gI().setClientType();
            Service.gI().login(var8, "", "2.3.0", (byte)1);
            return;
         }

         Service.gI().f("");
         return;
      case 1003:
         GameCanvas.a(mResources.ai);
         return;
      case 1004:
         nr_bo.a();
         GameCanvas.af.b();
         return;
      case 1005:
         try {
            GameMidlet.instance.platformRequest("http://nrosuno.com/");
            return;
         } catch (Exception var4) {
            var4.printStackTrace();
            return;
         }
      case 2000:
         return;
      case 2001:
         if(this.s) {
            this.s = false;
            return;
         }

         this.s = true;
         return;
      case 2002:
         nr_x var7 = this;
         if(this.a.getText().equals("")) {
            GameCanvas.a(mResources.Q);
         } else {
            this.a.getText().toCharArray();
            if(this.b.getText().equals("")) {
               GameCanvas.a(mResources.R);
            } else {
               if(this.a.getText().length() >= 5) {
                  var9 = null;
                  boolean var3;
                  if(mResources.fw == 2) {
                     if(this.a.getText().indexOf("@") == -1 || this.a.getText().indexOf(".") == -1) {
                        var9 = mResources.U;
                     }

                     var3 = false;
                  } else {
                     try {
                        Long.parseLong(var7.a.getText());
                        if(var7.a.getText().length() < 8 || var7.a.getText().length() > 12 || !var7.a.getText().startsWith("0") && !var7.a.getText().startsWith("84")) {
                           var9 = mResources.T;
                        }

                        var3 = true;
                     } catch (Exception var6) {
                        if(this.a.getText().indexOf("@") == -1 || this.a.getText().indexOf(".") == -1) {
                           var9 = mResources.U;
                        }

                        var3 = false;
                     }
                  }

                  if(var9 != null) {
                     GameCanvas.a(var9);
                  } else {
                     GameCanvas.K.a(mResources.ad + (var3?mResources.ae + ": ":mResources.af + ": ") + this.a.getText() + "\n" + mResources.Y + ": " + this.b.getText(), new Command(mResources.bq, this, 4000, (Object)null), (Command)null, new Command(mResources.bk, GameCanvas.h, 8882, (Object)null));
                  }

                  GameCanvas.J = GameCanvas.K;
                  return;
               }

               GameCanvas.a(mResources.S);
            }
         }
         break;
      case 2003:
         MyVector var10;
         (var10 = new MyVector("vMenu Login")).addElement(new Command(mResources.V, this, 2004, (Object)null));
         if(!this.isLogin2) {
            var10.addElement(new Command(mResources.W, this, 1004, (Object)null));
         }

         var10.addElement(new Command(mResources.X, this, 1003, (Object)null));
         var10.addElement(new Command(mResources.aE, this, 1005, (Object)null));
         if(Rms.loadRmsInt("lowGraphic") == 1) {
            var10.addElement(new Command(mResources.bR, this, 10041, (Object)null));
         } else {
            var10.addElement(new Command(mResources.bS, this, 10042, (Object)null));
         }

         var10.addElement(new Command(mResources.bl, GameCanvas.h, 8885, (Object)null));
         GameCanvas.menu.a(var10);
         return;
      case 2004:
         this.f();
         return;
      case 2008:
         Rms.a("acc", this.a.getText().trim());
         Rms.a("pass", this.b.getText().trim());
         if(nr_bo.t) {
            GameCanvas.af.b();
            return;
         }

         GameCanvas.af.j();
         return;
      case 4000:
         var9 = this.a.getText();
         GameCanvas.b(mResources.ax);
         GameCanvas.b();
         GameCanvas.b(mResources.F);
         Service var10000 = Service.gI();
         String var10002 = this.b.getText();
         String var10003 = Rms.c("userAo" + nr_bo.m);
         Rms.c("passAo");
         var10000.requestRegister(var9, var10002, var10003, "2.3.0");
         Rms.a("acc", var9);
         Rms.a("pass", this.b.getText());
         break;
      case 10021:
         this.h();
         return;
      case 10041:
         Rms.saveRMSInt("lowGraphic", 0);
         GameCanvas.startOK(mResources.plsRestartGame, 8885, (Object)null);
         return;
      case 10042:
         Rms.saveRMSInt("lowGraphic", 1);
         GameCanvas.startOK(mResources.plsRestartGame, 8885, (Object)null);
         return;
      }

   }

   private void h() {
      if(this.isLogin2) {
         this.a();
      } else {
         this.t = false;
         this.b.e = false;
         this.a.e = true;
         super.ca = this.x;
      }
   }

   public final void f() {
      GameCanvas.g();
      GameCanvas.a(mResources.fR);
      this.t = true;
      this.b.e = false;
      this.a.e = true;
   }

   public static void g() {
      if(GameCanvas.loginScr.isLogin2) {
         GameCanvas.a(mResources.fQ, new Command(mResources.bj, GameCanvas.panel, 10019, (Object)null), new Command(mResources.bk, GameCanvas.panel, 10020, (Object)null));
      } else {
         GameCanvas.a((mScreen)GameCanvas.loginScr);
         Session_ME.gI().e();
      }
   }
}
