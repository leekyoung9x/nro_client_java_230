package nro;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.nr_ac;
import nro.Char;
import nro.Rms;
import nro.mResources;
import nro.mScreen;
import nro.SmallImage;
import nro.InfoDlg;
import nro.Session_ME;
import nro.Service;
import nro.TileMap;
import nro.TField;
import nro.nr_cf;
import nro.nr_cr;
import nro.nr_ct;
import nro.Command;
import nro.mFont;
import nro.nr_de;
import nro.Res;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;
import nro.nr_x;
import nro.IActionListener;

public final class nr_cq extends mScreen implements IActionListener {

   public static nr_cq a;
   public static boolean b = false;
   private static TField c;
   private static int d;
   private static int e;
   private static int f;
   private static int[][] g = new int[][]{{64, 30, 31}, {9, 29, 32}, {6, 27, 28}};
   private static int[] h = new int[]{2, 13, 8};
   private static int[] i = new int[]{1, 12, 7};
   private int[] j = new int[]{0, 4, 8};
   private int k = 168;
   private int l = 350;
   private int m = 45;
   private int n;
   private int o;


   public static nr_cq a() {
      if(a == null) {
         a = new nr_cq();
      }

      return a;
   }

   private static void a(byte[] var0) throws IOException {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         InputStream var1 = nr_ac.a("/mymap/" + var0[var2]);
         DataInputStream var4 = new DataInputStream(var1);
         nr_de.a[var2] = (char)var4.read();
         nr_de.b[var2] = (char)var4.read();
         nr_de.e[var2] = new int[var4.available()];

         for(int var3 = 0; var3 < nr_de.a[var2] * nr_de.b[var2]; ++var3) {
            nr_de.e[var2][var3] = var4.read();
         }

         nr_de.f[var2] = new int[nr_de.e[var2].length];
      }

   }

   public final void b() {
      nr_x.c = false;
      GameCanvas.menu.a = false;
      GameCanvas.g();
      super.b();
      d = Res.b(0, 3);
      e = Res.b(0, 3);
      this.e();
      Char.bH = false;
      if(c != null) {
         c.i = mResources.ar;
      }

   }

   private void e() {
      TileMap.f = new int[nr_de.e[d].length];

      for(int var1 = 0; var1 < nr_de.e[d].length; ++var1) {
         TileMap.f[var1] = nr_de.e[d][var1];
      }

      TileMap.g = nr_de.f[d];
      TileMap.d = nr_de.d[d];
      TileMap.c = nr_de.c[d];
      TileMap.e = nr_de.c[d];
      TileMap.a = nr_de.a[d];
      TileMap.b = nr_de.b[d];
      TileMap.e = this.j[d] + 1;
      TileMap.h();
      GameCanvas.a(this.j[d]);
      GameScr.a(this.k, this.l);
   }

   public nr_cq() {
      try {
         if(!GameCanvas.lowGraphic) {
            byte[] var1 = new byte[]{(byte)39, (byte)40, (byte)41};
            if(!GameCanvas.lowGraphic) {
               try {
                  for(int var3 = 0; var3 < var1.length; ++var3) {
                     InputStream var2 = nr_ac.a("/mymap/mapTable" + var1[var3]);
                     DataInputStream var14;
                     short var4 = (var14 = new DataInputStream(var2)).readShort();
                     nr_de.g[var3] = new MyVector("MapTemplate.vCurrItem[a] ");

                     for(int var5 = 0; var5 < var4; ++var5) {
                        short var6 = var14.readShort();
                        short var7 = var14.readShort();
                        short var8 = var14.readShort();
                        if(TileMap.a(var6) != null) {
                           nr_ct var9 = TileMap.a(var6);
                           nr_ct var10;
                           (var10 = new nr_ct()).a = var6;
                           var10.c = var9.c;
                           var10.f = var9.f;
                           var10.g = var9.g;
                           var10.d = var7 * TileMap.i;
                           var10.e = var8 * TileMap.i;
                           var10.h = var9.h;
                           nr_de.g[var3].addElement(var10);
                           if(!nr_ct.k.containsKey(String.valueOf(var10.c))) {
                              Image var15;
                              try {
                                 var15 = Main.loadImage("/mapBackGround/" + var10.c + ".png");
                                 nr_ct.k.put(String.valueOf(var10.c), var15);
                              } catch (Exception var11) {
                                 if((var15 = Main.c("/mapBackGround/" + var10.c + ".png")) == null) {
                                    var15 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                    Service.gI().getBgTemplate(var10.c);
                                 }

                                 nr_ct.k.put(String.valueOf(var10.c), var15);
                              }

                              nr_ct.m.addElement(String.valueOf(var10.c));
                           }

                           if(!nr_ct.a(String.valueOf(var10.c))) {
                              nr_ct.l.addElement(String.valueOf(var10.c));
                           }
                        }
                     }
                  }
               } catch (Exception var12) {
                  var12.printStackTrace();
               }
            }
         }

         a(new byte[]{(byte)39, (byte)40, (byte)41});
      } catch (Exception var13) {
         var13.printStackTrace();
      }

      if(GameCanvas.z <= 200) {
         GameScr.d(128, 100);
         GameScr.bL = (GameCanvas.z - 128) / 2;
         GameScr.bK = 10;
         this.l += 15;
         this.m -= 15;
      }

      d = 1;
      (c = new TField()).c = GameCanvas.loginScr.a.c;
      if(GameCanvas.z < 200) {
         c.c = 60;
      }

      c.d = 26;
      if(GameCanvas.z < 200) {
         c.a = GameScr.bL + 45;
         c.b = GameScr.bK + 12;
      } else {
         c.a = GameCanvas.z / 2 - c.c / 2;
         c.b = 35;
      }

      if(!GameCanvas.isTouch) {
         c.e = true;
      }

      c.c(0);
      c.i = mResources.ar;
      if(c.getText().equals("@")) {
         c.a(GameCanvas.loginScr.a.getText().substring(0, GameCanvas.loginScr.a.getText().indexOf("@")));
      }

      d = 1;
      e = 0;
      super.cb = new Command(mResources.bv, this, 8000, (Object)null);
      super.ca = new Command(mResources.bw, this, 8001, (Object)null);
      if(!GameCanvas.isTouch) {
         super.cc = c.j;
      }

   }

   public final void a(int var1) {
      c.a(var1);
   }

   public final void c() {
      ++this.n;
      if(this.n > 30) {
         this.n = 0;
      }

      if(this.n % 15 < 5) {
         this.o = 0;
      } else {
         this.o = 1;
      }

      c.c();
      if(f != 0) {
         c.e = false;
      }

   }

   public final void d() {
      if(GameCanvas.i[2] && --f < 0) {
         f = mResources.aG.length - 1;
      }

      if(GameCanvas.i[8] && ++f >= mResources.aG.length) {
         f = 0;
      }

      if(f == 0) {
         if(!GameCanvas.isTouch) {
            super.cc = c.j;
         }

         c.c();
      }

      if(f == 1) {
         if(GameCanvas.i[4]) {
            if(--d < 0) {
               d = mResources.aH.length - 1;
            }

            this.e();
         }

         if(GameCanvas.i[6]) {
            if(++d > mResources.aH.length - 1) {
               d = 0;
            }

            this.e();
         }

         super.cc = null;
      }

      if(f == 2) {
         if(GameCanvas.i[4] && --e < 0) {
            e = mResources.fk[0].length - 1;
         }

         if(GameCanvas.i[6] && ++e > mResources.fk[0].length - 1) {
            e = 0;
         }

         super.cc = null;
      }

      if(GameCanvas.m) {
         byte var1 = 110;
         byte var2 = 60;
         if(GameCanvas.z > GameCanvas.A) {
            var1 = 100;
            var2 = 40;
         }

         if(GameCanvas.a(GameCanvas.z / 2 - 117, 15, 234, 80)) {
            f = 0;
            c.e = true;
         }

         int var3;
         if(GameCanvas.a(GameCanvas.z / 2 - 117, var1 - 30, 234, var2 + 5)) {
            f = 1;
            var3 = d;
            if((d = (GameCanvas.o - (GameCanvas.z / 2 - 117)) / 78) < 0) {
               d = 0;
            }

            if(d > mResources.aH.length - 1) {
               d = mResources.aH.length - 1;
            }

            if(var3 != d) {
               this.e();
            }
         }

         if(GameCanvas.a(GameCanvas.z / 2 - 117, var1 - 30 + var2 + 5, 234, 65)) {
            f = 2;
            var3 = e;
            if((e = (GameCanvas.o - (GameCanvas.z / 2 - 117)) / 78) < 0) {
               e = 0;
            }

            if(e > mResources.fk[0].length - 1) {
               e = mResources.fk[0].length - 1;
            }

            if(var3 != f) {
               this.e();
            }
         }
      }

      super.d();
      GameCanvas.f();
      GameCanvas.e();
   }

   public final void a(mGraphics var1) {
      if(!Char.bH) {
         GameCanvas.b(var1);
         var1.a(-GameScr.j, -GameScr.k);
         int var2;
         if(!GameCanvas.lowGraphic) {
            for(var2 = 0; var2 < nr_de.g[d].size(); ++var2) {
               nr_ct var3;
               if((var3 = (nr_ct)nr_de.g[d].elementAt(var2)).c != -1 && var3.h == 1) {
                  var3.a(var1);
               }
            }
         }

         TileMap.a(var1);
         byte var8 = 30;
         if(GameCanvas.z == 128) {
            var8 = 20;
         }

         int var9 = g[d][e];
         int var4 = h[d];
         int var5 = i[d];
         var1.drawImage(TileMap.bong, this.k, this.l + this.m, 3);
         Rms var10 = GameScr.x[var9];
         Rms var11 = GameScr.x[var4];
         Rms var12 = GameScr.x[var5];
         SmallImage.drawSmallImage(var1, var10.a[Char.bB[this.o][0][0]].a, this.k + Char.bB[this.o][0][1] + var10.a[Char.bB[this.o][0][0]].b, this.l - Char.bB[this.o][0][2] + var10.a[Char.bB[this.o][0][0]].c + this.m, 0, 0);
         SmallImage.drawSmallImage(var1, var11.a[Char.bB[this.o][1][0]].a, this.k + Char.bB[this.o][1][1] + var11.a[Char.bB[this.o][1][0]].b, this.l - Char.bB[this.o][1][2] + var11.a[Char.bB[this.o][1][0]].c + this.m, 0, 0);
         SmallImage.drawSmallImage(var1, var12.a[Char.bB[this.o][2][0]].a, this.k + Char.bB[this.o][2][1] + var12.a[Char.bB[this.o][2][0]].b, this.l - Char.bB[this.o][2][2] + var12.a[Char.bB[this.o][2][0]].c + this.m, 0, 0);
         int var6;
         if(!GameCanvas.lowGraphic) {
            for(var6 = 0; var6 < nr_de.g[d].size(); ++var6) {
               nr_ct var7;
               if((var7 = (nr_ct)nr_de.g[d].elementAt(var6)).c != -1 && var7.h == 3) {
                  var7.a(var1);
               }
            }
         }

         var1.a(-var1.a(), -var1.b());
         if(GameCanvas.z < 200) {
            nr_cr.b(GameScr.bL, GameScr.bK, GameScr.bM, GameScr.bN, var1);
            SmallImage.drawSmallImage(var1, var10.a[Char.bB[0][0][0]].a, GameCanvas.z / 2 + Char.bB[0][0][1] + var10.a[Char.bB[0][0][0]].b, GameScr.bK + 30 + var8 * 3 - Char.bB[0][0][2] + var10.a[Char.bB[0][0][0]].c + this.m, 0, 0);
            SmallImage.drawSmallImage(var1, var11.a[Char.bB[0][1][0]].a, GameCanvas.z / 2 + Char.bB[0][1][1] + var11.a[Char.bB[0][1][0]].b, GameScr.bK + 30 + var8 * 3 - Char.bB[0][1][2] + var11.a[Char.bB[0][1][0]].c + this.m, 0, 0);
            SmallImage.drawSmallImage(var1, var12.a[Char.bB[0][2][0]].a, GameCanvas.z / 2 + Char.bB[0][2][1] + var12.a[Char.bB[0][2][0]].b, GameScr.bK + 30 + var8 * 3 - Char.bB[0][2][2] + var12.a[Char.bB[0][2][0]].c + this.m, 0, 0);

            for(var6 = 0; var6 < mResources.aG.length; ++var6) {
               if(f == var6) {
                  var1.drawRegion(GameScr.bw, 0, 0, 13, 16, 2, GameScr.bL + 10 + (GameCanvas.gameTick % 7 > 3?1:0), GameScr.bK + 35 + var6 * var8, nr_cf.f);
                  var1.drawRegion(GameScr.bw, 0, 0, 13, 16, 0, GameScr.bL + GameScr.bM - 10 - (GameCanvas.gameTick % 7 > 3?1:0), GameScr.bK + 35 + var6 * var8, nr_cf.f);
               }

               mFont.tahoma_7b_dark.drawString(var1, mResources.aG[var6], GameScr.bL + 20, GameScr.bK + 30 + var6 * var8, 0);
            }

            mFont.tahoma_7b_dark.drawString(var1, mResources.aH[d], GameScr.bL + 70, GameScr.bK + 30 + var8 * 1, 0);
            mFont.tahoma_7b_dark.drawString(var1, mResources.fk[d][e], GameScr.bL + 55, GameScr.bK + 30 + var8 * 2, 0);
         } else {
            byte var13 = 110;
            byte var14 = 60;
            if(GameCanvas.z > GameCanvas.A) {
               var13 = 100;
               var14 = 45;
            }

            for(var2 = 0; var2 < 3; ++var2) {
               if(var2 != d) {
                  var1.drawImage(GameScr.av, GameCanvas.z / 2 - 78 + var2 * 78, var13, 3);
               } else {
                  if(f == 1) {
                     var1.drawRegion(GameScr.bw, 0, 0, 13, 16, 4, GameCanvas.z / 2 - 78 + var2 * 78, var13 - 20 + (GameCanvas.gameTick % 7 > 3?1:0), nr_cf.f);
                  }

                  var1.drawImage(GameScr.aw, GameCanvas.z / 2 - 78 + var2 * 78, var13, 3);
               }

               mFont.tahoma_7b_dark.drawString(var1, mResources.aH[var2], GameCanvas.z / 2 - 78 + var2 * 78, var13 - 5, 2);
            }

            for(var2 = 0; var2 < 3; ++var2) {
               if(var2 != e) {
                  var1.drawImage(GameScr.av, GameCanvas.z / 2 - 78 + var2 * 78, var13 + var14, 3);
               } else {
                  if(f == 2) {
                     var1.drawRegion(GameScr.bw, 0, 0, 13, 16, 4, GameCanvas.z / 2 - 78 + var2 * 78, var13 + var14 - 20 + (GameCanvas.gameTick % 7 > 3?1:0), nr_cf.f);
                  }

                  var1.drawImage(GameScr.aw, GameCanvas.z / 2 - 78 + var2 * 78, var13 + var14, 3);
               }

               mFont.tahoma_7b_dark.drawString(var1, mResources.fk[d][var2], GameCanvas.z / 2 - 78 + var2 * 78, var13 + var14 - 5, 2);
            }

            if(f == 0) {
               var1.drawRegion(GameScr.bw, 0, 0, 13, 16, 4, GameCanvas.z / 2, 20 + (GameCanvas.gameTick % 7 > 3?1:0), nr_cf.f);
            }
         }

         c.a(var1);
         var1.e(0, 0, GameCanvas.z, GameCanvas.A);
         mFont.c.a(var1, mResources.aF + " " + nr_x.i, 5, 5, 0, mFont.tahoma_7b_dark);
         super.a(var1);
      }
   }

   public final void perform(int var1, Object var2) {
      switch(var1) {
      case 8000:
         if(c.getText().equals("")) {
            GameCanvas.a(mResources.an);
            return;
         } else if(c.getText().length() < 5) {
            GameCanvas.a(mResources.ao);
            return;
         } else {
            if(c.getText().length() > 15) {
               GameCanvas.a(mResources.ap);
               return;
            }

            InfoDlg.a();
            Service.gI().createChar(c.getText(), d, g[d][e]);
            return;
         }
      case 8001:
         if(GameCanvas.loginScr.isLogin2) {
            GameCanvas.a(mResources.fQ, new Command(mResources.bj, this, 10019, (Object)null), new Command(mResources.bk, this, 10020, (Object)null));
            return;
         }

         Session_ME.gI().e();
         GameCanvas.af.b();
         return;
      case 10019:
         Session_ME.gI().e();
         GameCanvas.g();
         GameCanvas.af.b();
      case 10020:
         GameCanvas.g();
         return;
      default:
      }
   }
}
