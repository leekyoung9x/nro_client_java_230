package nro;

import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;
import nro.Char;
import nro.mResources;
import nro.mScreen;
import nro.SmallImage;
import nro.PopUp;
import nro.SoundMn;
import nro.nr_cf;
import nro.nr_cr;
import nro.nr_cw;
import nro.Command;
import nro.mFont;
import nro.Npc;
import nro.Res;
import nro.nr_do;
import nro.mGraphics;
import nro.Panel;
import nro.Main;
import nro.GameScr;
import nro.nr_r;
import nro.IActionListener;

public final class ChatPopup extends nr_cw implements IActionListener {

   public int a = 100;
   public int b;
   public int c;
   public String[] d;
   public int e;
   public int f;
   public int g;
   public int h;
   public Npc i;
   private static long B;
   private static long C;
   private int D;
   private String[] E;
   public Command j;
   public Command k;
   public Command l;
   public static ChatPopup m;
   public static ChatPopup n;
   private static String F;
   private static Npc G;
   public byte o = 0;
   public byte p = 0;
   public static nr_do q;
   private static boolean H;
   private int I;
   private static int J;
   private int K;
   public static int r = 7;
   private int L = 0;
   private int M = 0;
   private int N = 0;
   private Image O;
   public int s;
   public boolean t = false;
   public static int u;
   private int P = 0;
   private int Q = 0;


   public static void a(String var0, Npc var1) {
      F = var0;
      G = var1;
      if(m == null) {
         b(F, 100000, G);
         F = null;
         G = null;
      }

   }

   public static void a(String var0, int var1, Npc var2) {
      String[] var3 = new String[]{var0};
      if(var2.charID != 5 && GameScr.aC.e) {
         GameScr.aC.f = false;
      }

      Char.bG = true;
      (n = c(var3[0], 100000, var2)).s = 5;
      n.e = GameCanvas.z / 2 - n.a / 2 - 1;
      n.f = GameCanvas.A - 20 - n.g;
      n.D = 0;
      n.E = var3;
      q = new nr_do();
      int var4 = n.d.length;
      q.a(var4, 12, n.e, n.f - n.s + 12, n.a + 2, n.g - 25, true, 1);
      SoundMn.gI();
   }

   public static void b(String var0, int var1, Npc var2) {
      Res.out("chat= " + var0);
      String[] var3 = Res.a(var0, "\n", 0);
      Char.bG = true;
      (m = c(var3[0], 100000, var2)).D = 0;
      m.E = var3;
      String var4 = mResources.bh;
      if(var3.length == 1) {
         var4 = mResources.bf;
      }

      m.j = new Command(var4, m, 8000, (Object)null);
      m.j.x = GameCanvas.z / 2 - 35;
      m.j.y = GameCanvas.A - 35;
      SoundMn.gI();
   }

   public static ChatPopup c(String var0, int var1, Npc var2) {
      Res.out("ADD POP");
      Res.out(Char.myCharz().aS != null?"!null":"null");
      J = 10;
      ChatPopup var3;
      (var3 = new ChatPopup()).a = GameCanvas.z - 30 - (GameCanvas.menu.a?GameCanvas.menu.c:0);
      if(var3.a > 320) {
         var3.a = 320;
      }

      if(var0.length() < 10) {
         var3.a = 64;
      }

      if(GameCanvas.z == 128) {
         var3.a = 128;
      }

      var3.d = mFont.p.a(var0, var3.a - 10);
      var3.b = var1;
      var3.i = var2;
      Char.chatPopup = var3;
      var3.g = 15 - var3.c + var3.d.length * 12 + 10;
      if(var3.g > GameCanvas.A - 80) {
         var3.g = GameCanvas.A - 80;
      }

      nr_cw.w.addElement(var3);
      H = false;
      if(var2 != null && var2.charID == 5) {
         H = true;
         GameScr.aC.a("", 1);
      }

      B = C = Main.c();
      return var3;
   }

   public static ChatPopup a(String var0, int var1, Npc var2, int var3) {
      Res.out("ADD POP");
      Res.out(Char.myCharz().aS != null?"!null":"null");
      J = 10;
      ChatPopup var4;
      (var4 = new ChatPopup()).a = GameCanvas.z - 30 - (GameCanvas.menu.a?GameCanvas.menu.c:0);
      if(var4.a > 320) {
         var4.a = 320;
      }

      if(var0.length() < 10) {
         var4.a = 64;
      }

      if(GameCanvas.z == 128) {
         var4.a = 128;
      }

      var4.d = mFont.p.a(var0, var4.a - 10);
      var4.b = 100000;
      var4.i = var2;
      var4.I = 5820;
      Char.chatPopup = var4;
      var4.g = 15 - var4.c + var4.d.length * 12 + 10;
      if(var4.g > GameCanvas.A - 80) {
         var4.g = GameCanvas.A - 80;
      }

      nr_cw.w.addElement(var4);
      H = false;
      if(var2 != null && var2.charID == 5) {
         H = true;
         GameScr.aC.a("", 1);
      }

      var4.g += 15;
      B = C = Main.c();
      return var4;
   }

   public final void a() {
      if(q != null) {
         GameScr.aC.f = false;
         q.b();
      } else {
         GameScr.aC.f = true;
      }

      if(GameCanvas.menu.a) {
         this.s = 0;
         this.e = GameCanvas.z / 2 - this.a / 2 - 1;
         this.f = GameCanvas.menu.d - this.g;
      } else {
         this.s = 0;
         if(GameScr.gI().cc == null && GameScr.gI().ca == null && GameScr.gI().cb == null && this.j == null && this.k == null) {
            this.e = GameCanvas.z / 2 - this.a / 2 - 1;
            this.f = GameCanvas.A - 5 - this.g;
         } else {
            this.s = 5;
            this.e = GameCanvas.z / 2 - this.a / 2 - 1;
            this.f = GameCanvas.A - 20 - this.g;
         }
      }

      if(this.b > 0) {
         --this.b;
      }

      if(J > 0) {
         --J;
      }

      if(this.c > 1) {
         --this.c;
      }

      if(this.i != null && Char.chatPopup != null && Char.chatPopup != this || this.i != null && Char.chatPopup == null || this.b == 0) {
         nr_cw.y.removeElement(this);
         nr_cw.w.removeElement(this);
      }

   }

   public final void a(mGraphics var1) {
      if(!GameScr.gI().bc || !GameScr.gI().aZ) {
         GameCanvas.a(var1);
         int var2 = this.e;
         int var3 = this.f;
         int var4 = this.a + 2;
         int var5 = this.g;
         if(var2 > 0 && var3 > 0 || GameCanvas.panel.a) {
            PopUp.a(var1, var2, var3, var4, var5, 16777215, false);
            if(this.i != null) {
               SmallImage.drawSmallImage(var1, this.i.aN, this.e + 14, this.f, 0, nr_cf.d);
            }

            if(this.I != 0) {
               SmallImage.drawSmallImage(var1, this.I, this.e + var4 / 2, this.f + this.g - 15, 0, nr_cf.f);
            }

            if(q != null) {
               var1.e(var2, var3, var4, var5 - 16);
               var1.a(0, -q.d);
            }

            int var6 = 0;
            int var7 = 0;
            if(this.t) {
               var6 = var1.a();
               var7 = var1.b();
               var1.e(var2, var3 + 1, var4, var5 - 17);
               var1.a(0, -u);
            }

            int var8 = -1;

            int var9;
            for(var9 = 0; var9 < this.d.length; ++var9) {
               if(this.d[var9].startsWith("--")) {
                  var1.a(0);
                  var1.d(var2 + 10, this.f + this.c + var9 * 12 + 6, var4 - 20, 1);
               } else {
                  mFont var10 = mFont.k;
                  int var11 = 2;
                  String var12 = this.d[var9];
                  int var15;
                  if(this.d[var9].startsWith("|")) {
                     String[] var13;
                     if((var13 = Res.a(this.d[var9], "|", 0)).length == 3) {
                        var12 = var13[2];
                     }

                     if(var13.length == 4) {
                        var12 = var13[3];
                        var11 = Integer.parseInt(var13[2]);
                     }

                     var8 = var15 = Integer.parseInt(var13[1]);
                  } else {
                     var15 = var8;
                  }

                  switch(var15) {
                  case -1:
                     var10 = mFont.k;
                     break;
                  case 0:
                     var10 = mFont.tahoma_7b_dark;
                     break;
                  case 1:
                     var10 = mFont.h;
                     break;
                  case 2:
                     var10 = mFont.b;
                     break;
                  case 3:
                     var10 = mFont.p;
                     break;
                  case 4:
                     var10 = mFont.r;
                     break;
                  case 5:
                     var10 = mFont.q;
                  case 6:
                  default:
                     break;
                  case 7:
                     var10 = mFont.a;
                     break;
                  case 8:
                     var10 = mFont.d;
                     break;
                  case 9:
                     var10 = mFont.d;
                  }

                  if(this.d[var9].startsWith("<")) {
                     String[] var14 = Res.a(Res.a(this.d[var9], "<", 0)[1], ">", 1);
                     if(this.K == 0) {
                        this.K = Integer.parseInt(var14[1]);
                     } else if((B = Main.c()) - C >= 1000L) {
                        C = B;
                        --this.K;
                     }

                     var12 = this.K + " " + var14[2];
                     var10.drawString(var1, var12, this.e + this.a / 2, this.f + this.c + var9 * 12 - this.s + 12, var11);
                  } else {
                     if(var11 == 2) {
                        var10.drawString(var1, var12, this.e + this.a / 2, this.f + this.c + var9 * 12 - this.s + 12, var11);
                     }

                     if(var11 == 1) {
                        var10.drawString(var1, var12, this.e + this.a - 5, this.f + this.c + var9 * 12 - this.s + 12, var11);
                     }
                  }
               }
            }

            if(this.t) {
               GameCanvas.a(var1);
               var1.a(var6, var7);
            }

            if(this.p > 4) {
               this.M = (this.p + 1) / 2;
               this.L = this.p - this.M;

               for(var9 = 0; var9 < this.M; ++var9) {
                  var1.drawImage(Panel.s, var2 + var4 / 2 - this.M * 20 / 2 + var9 * 20 + mGraphics.getImageWidth(Panel.s), var3 + var5 - 17, 3);
               }

               for(var9 = 0; var9 < this.L; ++var9) {
                  var1.drawImage(Panel.s, var2 + var4 / 2 - this.L * 20 / 2 + var9 * 20 + mGraphics.getImageWidth(Panel.s), var3 + var5 - 8, 3);
               }

               if(this.o > 0) {
                  this.O = Panel.r;
                  if(this.o >= this.M) {
                     this.N = this.o - this.M;

                     for(var9 = 0; var9 < this.M; ++var9) {
                        var1.drawImage(this.O, var2 + var4 / 2 - this.M * 20 / 2 + var9 * 20 + mGraphics.getImageWidth(this.O), var3 + var5 - 17, 3);
                     }

                     for(var9 = 0; var9 < this.N; ++var9) {
                        if(var9 + this.M >= r) {
                           this.O = Panel.t;
                        }

                        var1.drawImage(this.O, var2 + var4 / 2 - this.L * 20 / 2 + var9 * 20 + mGraphics.getImageWidth(this.O), var3 + var5 - 8, 3);
                     }
                  } else {
                     for(var9 = 0; var9 < this.o; ++var9) {
                        var1.drawImage(this.O, var2 + var4 / 2 - this.M * 20 / 2 + var9 * 20 + mGraphics.getImageWidth(this.O), var3 + var5 - 17, 3);
                     }
                  }
               }
            } else {
               for(var9 = 0; var9 < this.p; ++var9) {
                  var1.drawImage(Panel.s, var2 + var4 / 2 - this.p * 20 / 2 + var9 * 20 + mGraphics.getImageWidth(Panel.s), var3 + var5 - 13, 3);
               }

               if(this.o > 0) {
                  for(var9 = 0; var9 < this.o; ++var9) {
                     var1.drawImage(Panel.r, var2 + var4 / 2 - this.p * 20 / 2 + var9 * 20 + mGraphics.getImageWidth(Panel.r), var3 + var5 - 13, 3);
                  }
               }
            }

            var1.a(-var1.a(), -var1.b());
            var1.e(0, 0, GameCanvas.z, GameCanvas.A);
            if(this.j != null) {
               nr_cr.a(var1, (Command)null, this.j, (Command)null);
            }

            if(this.k != null) {
               nr_cr.a(var1, this.k, (Command)null, this.l);
            }

         }
      }
   }

   public final void a(mGraphics var1, int var2) {
      int var3 = this.e;
      int var4 = this.f;
      int var5 = this.a;
      int var6 = var1.a();
      int var7 = var1.b();
      var1.a(0, -var2);
      if(var3 > 0 && var4 > 0 || GameCanvas.panel.a) {
         var2 = -1;

         for(var4 = 0; var4 < this.d.length; ++var4) {
            if(this.d[var4].startsWith("--")) {
               var1.a(16777215);
               var1.d(var3 + 10, this.f + this.c + var4 * 12 - 6, var5 - 20, 1);
            } else {
               mFont var8 = mFont.s;
               int var9 = 2;
               String var10 = this.d[var4];
               int var13;
               if(this.d[var4].startsWith("|")) {
                  String[] var11;
                  if((var11 = Res.a(this.d[var4], "|", 0)).length == 3) {
                     var10 = var11[2];
                  }

                  if(var11.length == 4) {
                     var10 = var11[3];
                     var9 = Integer.parseInt(var11[2]);
                  }

                  var2 = var13 = Integer.parseInt(var11[1]);
               } else {
                  var13 = var2;
               }

               switch(var13) {
               case -1:
                  var8 = mFont.s;
                  break;
               case 0:
                  var8 = mFont.c;
                  break;
               case 1:
                  var8 = mFont.h;
                  break;
               case 2:
                  var8 = mFont.a;
               }

               if(this.d[var4].startsWith("<")) {
                  String[] var12 = Res.a(Res.a(this.d[var4], "<", 0)[1], ">", 1);
                  if(this.K == 0) {
                     this.K = Integer.parseInt(var12[1]);
                  } else if((B = Main.c()) - C >= 1000L) {
                     C = B;
                     --this.K;
                  }

                  var10 = this.K + " " + var12[2];
                  var8.drawString(var1, var10, this.e + this.a / 2, this.f + this.c + var4 * 12 - this.s, var9);
               } else {
                  if(var9 == 2) {
                     var8.drawString(var1, var10, this.e + this.a / 2, this.f + this.c + var4 * 12 - this.s, var9);
                  }

                  if(var9 == 1) {
                     var8.drawString(var1, var10, this.e + this.a - 5, this.f + this.c + var4 * 12 - this.s, var9);
                  }
               }
            }
         }

         GameCanvas.a(var1);
         var1.a(var6, var7);
      }
   }

   private void a(int var1) {
      if((u += var1 * 12) < 0) {
         u = 0;
      }

      if(u > this.h) {
         u = this.h;
      }

   }

   public final void b() {
      if(this.t) {
         if(GameCanvas.i[8]) {
            GameCanvas.i[8] = false;
            this.a(1);
         }

         if(GameCanvas.i[2]) {
            GameCanvas.i[2] = false;
            this.a(-1);
         }

         if(GameCanvas.a(this.e, 0, this.a + 2, this.g)) {
            if(GameCanvas.n) {
               if(this.Q == 0) {
                  this.Q = GameCanvas.p;
               }

               this.P = this.Q - GameCanvas.p;
               if(this.P != 0) {
                  u += this.P;
                  this.Q = GameCanvas.p;
               }

               if(u < 0) {
                  u = 0;
               }

               if(u > this.h) {
                  u = this.h;
               }
            } else {
               this.Q = 0;
               this.Q = 0;
            }
         }
      }

      if(q != null) {
         if(GameCanvas.isTouch) {
            q.a();
         }

         if(GameCanvas.j[2]) {
            q.b -= 12;
            if(q.b < 0) {
               q.b = 0;
            }
         }

         if(GameCanvas.j[8]) {
            GameCanvas.i[8] = false;
            q.b += 12;
            if(q.b > q.l) {
               q.b = q.l;
            }
         }
      }

      if(GameCanvas.i[5] || mScreen.a(GameCanvas.currentScreen.cb)) {
         GameCanvas.i[5] = false;
         mScreen.cg = -1;
         if(this.j != null) {
            this.j.performAction();
         } else if(this.k != null) {
            this.k.performAction();
         } else if(this.l != null) {
            this.l.performAction();
         }
      }

      if(q == null || !q.m) {
         if(this.k != null && (GameCanvas.i[12] || GameCanvas.i[5] || mScreen.a(this.k))) {
            GameCanvas.i[12] = false;
            GameCanvas.i[5] = false;
            GameCanvas.l = false;
            GameCanvas.m = false;
            this.k.performAction();
            mScreen.cg = -1;
         }

         if(this.l != null && (GameCanvas.i[13] || mScreen.a(this.l))) {
            GameCanvas.i[13] = false;
            GameCanvas.l = false;
            GameCanvas.m = false;
            this.l.performAction();
            mScreen.cg = -1;
         }

      }
   }

   public final void perform(int var1, Object var2) {
      if(var1 == 1000) {
         try {
            GameMidlet.instance.platformRequest((String)var2);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

         GameMidlet.instance.notifyDestroyed();
         GameCanvas.g();
      }

      if(var1 == 1001) {
         q = null;
         Char.chatPopup = null;
         n = null;
         GameScr.aC.f = true;
         Char.bG = false;
         if(H) {
            GameScr.aC.b.e = 0;
            GameScr.aC.b.b.b = 10;
         }
      }

      if(var1 == 8000) {
         if(J > 0) {
            return;
         }

         int var5 = m.D;
         ++var5;
         if(var5 >= m.E.length) {
            Char.chatPopup = null;
            m = null;
            GameScr.aC.f = true;
            Char.bG = false;
            if(F != null) {
               b(F, 100000, G);
               F = null;
               G = null;
               return;
            }

            if(H) {
               GameScr.aC.b.e = 0;

               for(var1 = 0; var1 < GameScr.aC.b.a.size(); ++var1) {
                  if(((nr_r)GameScr.aC.b.a.elementAt(var1)).b == 10000000) {
                     ((nr_r)GameScr.aC.b.a.elementAt(var1)).b = 10;
                  }
               }
            }

            return;
         }

         ChatPopup var4;
         (var4 = c(m.E[var5], m.b, m.i)).D = var5;
         var4.E = m.E;
         var4.j = m.j;
         m = var4;
      }

   }
}
