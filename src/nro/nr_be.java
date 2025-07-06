package nro;

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
import nro.MyVector;
import nro.mGraphics;
import nro.GameScr;
import nro.IActionListener;

public final class nr_be extends mScreen implements IActionListener {

   private TField a;
   private TField b;
   private TField c;
   private TField d;
   private TField e;
   private TField f;
   private TField g;
   private TField h;
   private TField i;
   private static boolean j = false;
   private int k;
   private int l;
   private int m;
   private boolean n = false;
   private boolean o = false;
   private Command p;
   private Command q;
   private Command r;
   private Command s;
   private Command t;
   private int u;
   private Command v;
   private int w;
   private int x = 130;
   private int y;
   private int z = -1;
   private boolean A = false;
   private int B = 2;
   private int C = 0;
   private int D = -40;
   private int E = 1;


   static {
      int[] var10000 = new int[]{0, 8, 2, 6, 9};
   }

   public final void b() {
      System.out.println("Res switch");
      SoundMn.gI();
      this.a.e = true;
      this.b.e = false;
      if(GameCanvas.isTouch) {
         this.a.e = false;
      }

      super.b();
   }

   public nr_be(byte var1) {
      if((TileMap.o = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || TileMap.o == 6) {
         TileMap.o = 4;
      }

      GameScr.a(-1, (int)-1);
      GameScr.j = 100;
      GameScr.k = 200;
      if(GameCanvas.A > 200) {
         this.m = GameCanvas.C - 80;
      } else {
         this.m = GameCanvas.C - 65;
      }

      this.l = -50;
      this.u = GameCanvas.C - mScreen.cd - 5;
      if(GameCanvas.A <= 160) {
         this.u = 20;
      }

      this.i = new TField();
      this.i.c(1);
      this.i.c = 220;
      this.i.d = mScreen.cd + 2;
      this.i.i = "Số điện thoại/ địa chỉ email";
      if(var1 == 1) {
         this.i.a("01234567890");
      }

      this.a = new TField();
      this.a.c = 220;
      this.a.d = mScreen.cd + 2;
      this.a.e = true;
      this.a.i = "Họ và tên";
      if(var1 == 1) {
         this.a.a("Nguyễn Văn A");
      }

      this.a.c(0);
      this.b = new TField();
      this.b.c(1);
      this.b.c = 70;
      this.b.d = mScreen.cd + 2;
      this.b.i = "Ngày sinh";
      if(var1 == 1) {
         this.b.a("01");
      }

      this.c = new TField();
      this.c.c(1);
      this.c.c = 70;
      this.c.d = mScreen.cd + 2;
      this.c.i = "Tháng sinh";
      if(var1 == 1) {
         this.c.a("01");
      }

      this.d = new TField();
      this.d.c(1);
      this.d.c = 70;
      this.d.d = mScreen.cd + 2;
      this.d.i = "Năm sinh";
      if(var1 == 1) {
         this.d.a("1980");
      }

      this.e = new TField();
      this.e.c(0);
      this.e.c = 220;
      this.e.d = mScreen.cd + 2;
      this.e.i = "Địa chỉ đăng ký thường trú";
      if(var1 == 1) {
         this.e.a("123 đường số 1, Quận 1, TP.HCM");
      }

      this.f = new TField();
      this.f.c(1);
      this.f.c = 220;
      this.f.d = mScreen.cd + 2;
      this.f.i = "Số Chứng minh nhân dân hoặc số hộ chiếu";
      if(var1 == 1) {
         this.f.a("123456789");
      }

      this.g = new TField();
      this.g.c(1);
      this.g.c = 220;
      this.g.d = mScreen.cd + 2;
      this.g.i = "Ngày cấp";
      if(var1 == 1) {
         this.g.a("01/01/1990");
      }

      this.h = new TField();
      this.h.c(0);
      this.h.c = 220;
      this.h.d = mScreen.cd + 2;
      this.h.i = "Nơi cấp";
      if(var1 == 1) {
         this.h.a("TP.HCM");
      }

      this.u += 35;
      this.n = true;
      this.k = 0;
      this.p = new Command(GameCanvas.z > 200?mResources.as:mResources.at, GameCanvas.h, 888393, (Object)null);
      new Command(mResources.bp, this, 2001, (Object)null);
      this.r = new Command(mResources.au, this, 2002, (Object)null);
      this.t = new Command(mResources.br, this, 10021, (Object)null);
      super.ca = this.s = new Command(mResources.be, this, 2003, (Object)null);
      if(GameCanvas.isTouch) {
         this.p.x = GameCanvas.z / 2 - 100;
         this.s.x = GameCanvas.z / 2 - mScreen.cmdW - 8;
         if(GameCanvas.A >= 200) {
            this.p.y = GameCanvas.A / 2 - 40;
            this.s.y = this.x + 110;
         }

         this.t.x = GameCanvas.z / 2 + 3;
         this.t.y = this.x + 110;
         this.r.x = GameCanvas.z / 2 - 84;
         this.r.y = this.s.y;
      }

      this.y = 170;
      short var3 = 184;
      if(184 >= GameCanvas.z) {
         var3 = 152;
      }

      this.w = GameCanvas.z / 2 - var3 / 2;
      this.x = 5;
      this.a.a = this.w + 10;
      this.a.b = this.x + 20;
      this.v = new Command(mResources.bo, this, 2008, (Object)null);
      this.v.x = 260;
      this.v.y = GameCanvas.A - 60;
      this.q = new Command("Thoát", this, 1003, (Object)null);
      this.q.x = 260;
      this.q.y = GameCanvas.A - 30;
      if(GameCanvas.z < 250) {
         this.v.x = GameCanvas.z / 2 - 80;
         this.q.x = GameCanvas.z / 2 + 10;
         this.q.y = this.v.y = GameCanvas.A - 25;
      }

      super.cb = this.v;
      super.ca = this.q;
   }

   public final void c() {
      this.a.c();
      this.b.c();
      this.c.c();
      this.d.c();
      this.e.c();
      this.f.c();
      this.h.c();
      this.i.c();
      this.g.c();

      for(int var1 = 0; var1 < nr_cw.w.size(); ++var1) {
         ((nr_cw)nr_cw.w.elementAt(var1)).a();
      }

      if(++GameScr.j > GameCanvas.z * 3 + 100) {
         GameScr.j = 100;
      }

      if(ChatPopup.m == null) {
         if(this.m != this.l) {
            this.l += this.m - this.l >> 1;
         }

         if(this.C >= 0) {
            this.D += this.E * this.C;
            this.C += this.E * this.B;
            if(this.C <= 0) {
               this.E = -this.E;
            }

            if(this.D > 0) {
               this.E = -this.E;
               this.C -= 2 * this.B;
            }
         }

         if(this.z >= 0 && GameCanvas.gameTick % 100 == 0) {
            ++this.z;
            if(this.z >= mResources.aU.length) {
               this.z = 0;
            }

            if(GameCanvas.J == GameCanvas.K && GameCanvas.K.a) {
               GameCanvas.K.a(mResources.aU[this.z]);
            }
         }

         if(GameCanvas.isTouch) {
            if(this.o) {
               super.cb = this.r;
               super.ca = this.t;
            } else {
               super.cb = this.v;
               super.ca = this.q;
            }
         } else if(this.o) {
            super.cb = this.r;
            super.ca = this.t;
         } else {
            super.cb = this.v;
            super.ca = this.q;
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
      if(ChatPopup.m == null) {
         if(ChatPopup.n == null) {
            if(GameCanvas.J == null) {
               this.w = 5;
               if(GameCanvas.z < 260) {
                  this.w = (GameCanvas.z - 240) / 2;
               }

               this.x = (GameCanvas.A - 233) / 2;
               PopUp.a(var1, this.w, this.x, 240, 233, -1, true);
               this.i.a = this.w + 10;
               this.i.b = this.x + 15;
               this.a.a = this.i.a;
               this.a.b = this.i.b + 30;
               this.b.a = this.w + 10;
               this.b.b = this.a.b + 30;
               this.c.a = this.b.a + 75;
               this.c.b = this.b.b;
               this.d.a = this.c.a + 75;
               this.d.b = this.c.b;
               this.e.a = this.a.a;
               this.e.b = this.b.b + 30;
               this.f.a = this.a.a;
               this.f.b = this.e.b + 30;
               this.g.a = this.a.a;
               this.g.b = this.f.b + 30;
               this.h.a = this.a.a;
               this.h.b = this.g.b + 30;
               this.a.a(var1);
               this.b.a(var1);
               this.c.a(var1);
               this.d.a(var1);
               this.e.a(var1);
               this.f.a(var1);
               this.g.a(var1);
               this.h.a(var1);
               this.i.a(var1);
               if(GameCanvas.z < 176) {
                  mFont.tahoma_7b_green2.drawString(var1, mResources.ag + ":", this.a.a - 35, this.a.b + 7, 0);
                  mFont.tahoma_7b_green2.drawString(var1, mResources.ah + ":", this.b.a - 35, this.b.b + 7, 0);
                  mFont.tahoma_7b_green2.drawString(var1, mResources.aF + ": " + null, GameCanvas.z / 2, this.b.b + 32, 2);
               }
            }

            String var2 = "2.3.0";
            var1.a(GameCanvas.N);
            var1.d(GameCanvas.z - 40, 4, 36, 11);
            mFont.o.drawString(var1, var2, GameCanvas.z - 22, 4, 2);
            GameCanvas.a(var1);
            if(GameCanvas.J == null) {
               if(GameCanvas.z > 250) {
                  mFont.c.a(var1, "Dưới 18 tuổi", 260, 10, 0, mFont.tahoma_7b_dark);
                  mFont.c.a(var1, "chỉ có thể chơi", 260, 25, 0, mFont.tahoma_7b_dark);
                  mFont.c.a(var1, "180p 1 ngày", 260, 40, 0, mFont.tahoma_7b_dark);
               } else {
                  mFont.c.a(var1, "Dưới 18 tuổi chỉ có thể chơi", GameCanvas.z / 2, 5, 2, mFont.tahoma_7b_dark);
                  mFont.c.a(var1, "180p 1 ngày", GameCanvas.z / 2, 15, 2, mFont.tahoma_7b_dark);
               }
            }

            super.a(var1);
         }
      }
   }

   public final void d() {
      if(!GameCanvas.isTouch) {
         if(this.a.e) {
            super.cc = this.a.j;
         } else {
            super.cc = this.b.j;
         }
      }

      if(GameCanvas.i[2]) {
         --this.k;
         if(this.k < 0) {
            this.k = 1;
         }
      } else if(GameCanvas.i[8]) {
         ++this.k;
         if(this.k > 1) {
            this.k = 1;
         }
      }

      if(GameCanvas.i[2] || GameCanvas.i[8]) {
         GameCanvas.e();
         if(this.k == 1) {
            this.a.e = false;
            this.b.e = true;
         } else if(this.k == 0) {
            this.a.e = true;
            this.b.e = false;
         } else {
            this.a.e = false;
            this.b.e = false;
         }
      }

      if(GameCanvas.isTouch) {
         if(this.o) {
            super.cb = this.r;
            super.ca = this.t;
         } else {
            super.cb = this.v;
            super.ca = this.q;
         }
      } else if(this.o) {
         super.cb = this.r;
         super.ca = this.t;
      } else {
         super.cb = this.v;
         super.ca = this.q;
      }

      if(GameCanvas.m) {
         if(GameCanvas.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
            this.k = 0;
         } else if(GameCanvas.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
            this.k = 1;
         }
      }

      super.d();
      GameCanvas.e();
   }

   public final void perform(int var1, Object var2) {
      switch(var1) {
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
         this.o = false;
         return;
      case 1002:
         return;
      case 1003:
         GameCanvas.af.b();
         Session_ME.gI().e();
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
         if(this.n) {
            this.n = false;
            return;
         }

         this.n = true;
         return;
      case 2002:
         nr_be var7 = this;
         if(this.a.getText().equals("")) {
            GameCanvas.a(mResources.Q);
         } else {
            this.a.getText().toCharArray();
            if(this.b.getText().equals("")) {
               GameCanvas.a(mResources.R);
            } else {
               if(this.a.getText().length() >= 5) {
                  String var9 = null;
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
         MyVector var8;
         (var8 = new MyVector("vMenu Login")).addElement(new Command(mResources.V, this, 2004, (Object)null));
         var8.addElement(new Command(mResources.W, this, 1004, (Object)null));
         var8.addElement(new Command(mResources.X, this, 1003, (Object)null));
         var8.addElement(new Command(mResources.aE, this, 1005, (Object)null));
         if(Rms.loadRmsInt("lowGraphic") == 1) {
            var8.addElement(new Command(mResources.bR, this, 10041, (Object)null));
         } else {
            var8.addElement(new Command(mResources.bS, this, 10042, (Object)null));
         }

         var8.addElement(new Command(mResources.bl, GameCanvas.h, 8885, (Object)null));
         GameCanvas.menu.a(var8);
         return;
      case 2004:
         GameCanvas.g();
         GameCanvas.a(mResources.fR);
         this.o = true;
         this.b.e = false;
         this.a.e = true;
         return;
      case 2008:
         if(this.b.getText().equals("") || this.c.getText().equals("") || this.d.getText().equals("") || this.e.getText().equals("") || this.f.getText().equals("") || this.g.getText().equals("") || this.h.getText().equals("") || this.i.getText().equals("") || this.a.getText().equals("")) {
            GameCanvas.a("Vui lòng điền đầy đủ thông tin");
            return;
         }

         GameCanvas.a(mResources.aw);
         Service.gI().charInfo(this.b.getText(), this.c.getText(), this.d.getText(), this.e.getText(), this.f.getText(), this.g.getText(), this.h.getText(), this.i.getText(), this.a.getText());
      case 4000:
      default:
         break;
      case 10021:
         this.o = false;
         this.b.e = false;
         this.a.e = true;
         super.ca = this.s;
         return;
      case 10041:
         return;
      case 10042:
         return;
      }

   }
}
