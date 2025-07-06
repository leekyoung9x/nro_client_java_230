package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Char;
import nro.nr_af;
import nro.mResources;
import nro.PopUp;
import nro.TField;
import nro.nr_cm;
import nro.Command;
import nro.mFont;
import nro.Res;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;
import nro.nr_r;
import nro.IActionListener;

public final class Info implements IActionListener {

   public MyVector a = new MyVector("infoWaitToShow");
   public nr_r b;
   public int c = 100;
   private int k;
   public String[] d;
   private int l;
   private int m;
   private boolean n = false;
   private static Image o = Main.loadImage("/mainImage/myTexture2dgocnhon.png");
   public int e;
   public int f;
   private int p;
   public int g;
   public int h;
   public int i;
   public int j;


   public final void a() {
      this.d = null;
      this.a.removeAllElements();
   }

   public final void a(mGraphics var1, int var2, int var3, int var4) {
      if(this.a.size() != 0) {
         var1.a(var2, var3);
         if(this.d != null && this.d.length != 0 && this.p != 1) {
            int var5 = mGraphics.zoomLevel == 1?0:10;
            if(this.b.c == null) {
               PopUp.a(var1, this.g, this.h, this.i, this.j, 16777215, false);
            } else {
               Main.a(var1, this.g - 23, this.h - var5 / 2, this.i + 15);
            }

            if(this.b.c == null) {
               var1.drawRegion(o, 0, 0, 9, 8, var4 == 1?0:2, this.l - 3 + (var4 == 1?-15:20), this.m - 20 + this.k + 2, 17);
            }

            var4 = -1;

            for(int var6 = 0; var6 < this.d.length; ++var6) {
               mFont var7 = mFont.k;
               String var8 = this.d[var6];
               int var12;
               if(this.d[var6].startsWith("|")) {
                  String[] var9;
                  if((var9 = Res.a(this.d[var6], "|", 0)).length == 3) {
                     var8 = var9[2];
                  }

                  if(var9.length == 4) {
                     var8 = var9[3];
                     Integer.parseInt(var9[2]);
                  }

                  var4 = var12 = Integer.parseInt(var9[1]);
               } else {
                  var12 = var4;
               }

               switch(var12) {
               case -1:
                  var7 = mFont.k;
                  break;
               case 0:
                  var7 = mFont.tahoma_7b_dark;
                  break;
               case 1:
                  var7 = mFont.h;
                  break;
               case 2:
                  var7 = mFont.b;
                  break;
               case 3:
                  var7 = mFont.p;
                  break;
               case 4:
                  var7 = mFont.r;
                  break;
               case 5:
                  var7 = mFont.q;
               case 6:
               default:
                  break;
               case 7:
                  var7 = mFont.a;
               }

               if(this.b.c == null) {
                  var7.drawString(var1, var8, this.l, this.m - 15 + this.k + var6 * 12 - this.d.length * 12 - 9, 2);
               } else {
                  var12 = this.g - 23;
                  int var14 = this.h - var5 / 2;
                  int var10 = Main.typeClient == 1?this.i + 28:this.i + 25;
                  int var11 = this.j + (GameCanvas.isTouch?0:14) + var5;
                  var1.a(4465169);
                  var1.d(var12, var14 + var11, var10, 2);
                  if((var10 = this.b.f * var10 / this.b.g) < 0) {
                     var10 = 0;
                  }

                  var1.a('\uaaee');
                  var1.d(var12, var14 + var11, var10, 2);
                  if(this.b.f == 0) {
                     return;
                  }

                  this.b.c.a(var1, this.g + 5, this.h + this.j / 2, (int)0);
                  if(mGraphics.zoomLevel == 1) {
                     (this.b.d?mFont.F:mFont.I).drawString(var1, this.b.c.cName, this.g + 12, this.h + 3, 0);
                  } else {
                     (this.b.d?mFont.F:mFont.I).drawString(var1, this.b.c.cName, this.g + 12, this.h - 3, 0);
                  }

                  if(!GameCanvas.isTouch) {
                     if(!TField.isQwerty) {
                        mFont.G.drawString(var1, "Nhấn # để chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
                     } else {
                        mFont.G.drawString(var1, "Nhấn Y để chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
                     }
                  }

                  if(mGraphics.zoomLevel == 1) {
                     nr_af.a(var1, var8, this.g + 14, this.h + this.j / 2 + 2, this.i - 16, this.j, mFont.H);
                  } else {
                     String[] var15 = mFont.H.a(var8, 120);

                     for(int var13 = 0; var13 < var15.length; ++var13) {
                        mFont.H.drawString(var1, var15[var13], this.g + 12, this.h + 12 + var13 * 12 - 3, 0);
                     }

                     GameCanvas.a(var1);
                  }
               }
            }

            this.b.getClass();
         }

         var1.a(-var2, -var3);
      }

   }

   public final void b() {
      if(this.a.size() != 0 && this.b.f == 0) {
         ++this.e;
         if(this.e >= this.b.b) {
            this.e = 0;
            this.a.removeElementAt(0);
            if(this.a.size() == 0) {
               return;
            }

            nr_r var1 = (nr_r)this.a.firstElement();
            this.b = var1;
            this.c();
         }
      }

   }

   public final void c() {
      this.c = 100;
      if(GameCanvas.z == 128) {
         this.c = 128;
      }

      int var1;
      if(this.b.c != null) {
         this.d = new String[]{this.b.a};
         if(mGraphics.zoomLevel == 1) {
            var1 = this.d.length;
         } else {
            var1 = mFont.H.a(this.b.a, 120).length;
         }
      } else {
         this.d = mFont.k.a(this.b.a, this.c - 10);
         var1 = this.d.length;
      }

      this.k = 7;
      this.g = this.l - this.c / 2 - 1;
      this.h = this.m - 15 + this.k - var1 * 12 - 15;
      this.i = this.c + 2 + (this.b.c != null?30:0);
      this.j = (var1 + 1) * 12 + 1 + (this.b.c != null?5:0);
   }

   public final void a(String var1, int var2, Char var3, boolean var4) {
      this.p = var2;
      if(this.a.size() > 10) {
         this.a.removeElementAt(0);
      }

      if(this.a.size() > 0) {
         var1.equals(((nr_r)this.a.lastElement()).a);
      }

      nr_r var5 = new nr_r(var1);
      if(this.p == 0) {
         var5.b = var1.length();
      }

      if(var5.b < 70) {
         var5.b = 70;
      }

      if(this.p == 1) {
         var5.b = 10000000;
      }

      if(this.p == 3) {
         var5.b = 300;
         var5.h = Main.c();
         var5.f = var1.length();
         if(var5.f < 15) {
            var5.f = 15;
         }

         if(var5.f > 100) {
            var5.f = 100;
         }

         var5.g = var5.f;
      }

      if(var3 != null) {
         var5.c = var3;
         var5.d = var4;
         GameCanvas.panel.a(var5);
         if(GameCanvas.isTouch && GameCanvas.panel.ar) {
            GameScr.aD.i = new Command(mResources.bm, this, 1000, var5);
         }
      }

      if(var3 != null && GameCanvas.panel.ar || var3 == null) {
         this.a.addElement(var5);
      }

      if(this.a.size() == 1) {
         this.b = (nr_r)this.a.firstElement();
         this.c();
      }

      if(GameCanvas.isTouch && var3 != null && GameCanvas.panel.ar && GameCanvas.z - 50 > 155 + this.i) {
         GameScr.aD.i.x = GameCanvas.z - this.i - 50;
         GameScr.aD.i.y = 35;
      }

   }

   public final void perform(int var1, Object var2) {
      if(var1 == 1000) {
         nr_cm var10000 = nr_cm.b();
         GameScr.gI();
         var10000.a(mResources.cM);
      }

   }
}
