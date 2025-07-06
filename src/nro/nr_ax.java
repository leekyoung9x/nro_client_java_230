package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.ChatPopup;
import nro.Char;
import nro.mResources;
import nro.mScreen;
import nro.InfoDlg;
import nro.SoundMn;
import nro.nr_cr;
import nro.nr_cw;
import nro.Command;
import nro.mFont;
import nro.Res;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class nr_ax {

   public boolean a;
   private MyVector f;
   public int b;
   public int c;
   public int d;
   private int g;
   private int h;
   private static int[] i;
   private static int j;
   private static int k;
   private static int l;
   private static int m;
   private Command n;
   private Command o;
   private Command p;
   private static Image q = Main.loadImage("/mainImage/myTexture2dbtMenu1.png");
   private static Image r = Main.loadImage("/mainImage/myTexture2dbtMenu2.png");
   private boolean s;
   public int e;
   private int t;
   private int u;
   private int v;
   private int[] w;
   private boolean x;
   private boolean y;
   private int z;
   private int A;
   private boolean B;
   private boolean C;
   private int D;
   private int E;
   private boolean F;
   private boolean[] G;


   public nr_ax() {
      this.n = new Command(mResources.bs, 0);
      this.o = new Command(mResources.bf, 0, GameCanvas.z - 71, GameCanvas.A - mScreen.cmdH + 1);
      this.p = null;
      this.w = new int[3];
   }

   public final void a(MyVector var1, int var2) {
      this.a(var1);
      this.s = true;
   }

   public final void a(MyVector var1, int var2, int var3) {
      this.a(var1);
      this.c = var2;

      for(this.d = var3; this.d + this.h > GameCanvas.A; this.d -= 2) {
         ;
      }

   }

   public final void a(MyVector var1) {
      if(!this.a) {
         this.F = false;
         this.B = false;
         this.C = false;
         this.e = 0;
         if(var1.size() == 1) {
            this.b = 0;
            Command var2;
            if((var2 = (Command)var1.elementAt(0)) != null && var2.caption.equals(mResources.cA)) {
               var2.performAction();
               this.a = false;
               InfoDlg.a();
               return;
            }
         }

         SoundMn.gI();
         this.G = new boolean[var1.size()];

         int var4;
         for(var4 = 0; var4 < this.G.length; ++var4) {
            this.G[var4] = false;
         }

         this.s = false;
         ChatPopup.m = null;
         nr_cw.w.removeAllElements();
         nr_cw.y.removeAllElements();
         InfoDlg.hide();
         if(var1.size() != 0) {
            this.f = var1;
            this.g = 60;
            this.h = 60;

            for(var4 = 0; var4 < var1.size(); ++var4) {
               Command var3;
               (var3 = (Command)var1.elementAt(var4)).isPlaySoundButton = false;
               mFont.n.a(var3.caption);
               var3.subCaption = mFont.n.a(var3.caption, this.g - 10);
            }

            i = new int[var1.size()];
            this.c = (GameCanvas.z - var1.size() * this.g) / 2;
            if(this.c <= 0) {
               this.c = 1;
            }

            this.d = GameCanvas.A - this.h - (nr_cr.a + 1) - 1;
            if(GameCanvas.isTouch) {
               this.d -= 3;
            }

            this.d += 27;

            for(var4 = 0; var4 < i.length; ++var4) {
               i[var4] = GameCanvas.A;
            }

            this.a = true;
            this.b = 0;
            if((l = this.f.size() * this.g - GameCanvas.z) < 0) {
               l = 0;
            }

            j = 0;
            k = 0;
            m = 50;
            this.t = var1.size() * this.g - 1;
            if(this.t > GameCanvas.z - 2) {
               this.t = GameCanvas.z - 2;
            }

            if(GameCanvas.isTouch) {
               this.b = -1;
            }

         }
      }
   }

   private boolean c() {
      return !this.F && i[i.length - 1] > this.d || this.F && i[i.length - 1] < GameCanvas.A;
   }

   public final void a() {
      if(!GameScr.gI().bc || !GameScr.gI().aZ) {
         if(this.a) {
            if(!this.c()) {
               boolean var1 = false;
               if(!GameCanvas.i[2] && !GameCanvas.i[4]) {
                  if(!GameCanvas.i[8] && !GameCanvas.i[6]) {
                     if(GameCanvas.i[5]) {
                        this.z = 2;
                     } else if(GameCanvas.i[12] && !GameScr.gI().u()) {
                        if(this.c()) {
                           return;
                        }

                        if(this.n.idAction <= 0) {
                           this.z = 2;
                        }

                        SoundMn.gI();
                     } else if(!GameScr.gI().u() && !this.s && (GameCanvas.i[13] || mScreen.a(this.o))) {
                        if(this.c()) {
                           return;
                        }

                        if(!this.C) {
                           this.C = true;
                        }

                        this.F = true;
                        SoundMn.gI();
                     }
                  } else {
                     var1 = true;
                     ++this.b;
                     if(this.b > this.f.size() - 1) {
                        this.b = 0;
                     }
                  }
               } else {
                  var1 = true;
                  --this.b;
                  if(this.b < 0) {
                     this.b = this.f.size() - 1;
                  }
               }

               if(var1) {
                  if((j = this.b * this.g + this.g - GameCanvas.z / 2) > l) {
                     j = l;
                  }

                  if(j < 0) {
                     j = 0;
                  }

                  if(this.b == this.f.size() - 1 || this.b == 0) {
                     k = j;
                  }
               }

               var1 = true;
               if(GameCanvas.panel.af != null && GameCanvas.panel.af.t) {
                  if(!GameCanvas.a(GameCanvas.panel.af.e, 0, GameCanvas.panel.af.a + 2, GameCanvas.panel.af.g)) {
                     var1 = true;
                  } else {
                     var1 = false;
                     GameCanvas.panel.af.b();
                  }
               }

               if(!this.s && GameCanvas.m && !GameCanvas.b(this.c, this.d, this.t, this.h) && !this.x && !GameScr.gI().u() && var1) {
                  if(!this.c()) {
                     this.u = this.v = 0;
                     this.x = false;
                     GameCanvas.clearAllPointerEvent();
                     this.F = true;
                     this.C = true;
                     SoundMn.gI();
                  }
               } else {
                  int var2;
                  int var4;
                  if(GameCanvas.k) {
                     if(!this.x && GameCanvas.b(this.c, this.d, this.t, this.h)) {
                        for(var4 = 0; var4 < this.w.length; ++var4) {
                           this.w[0] = GameCanvas.o;
                        }

                        this.v = GameCanvas.o;
                        this.x = true;
                        this.y = this.A != 0;
                        this.A = 0;
                     } else if(this.x) {
                        ++this.u;
                        if(this.u > 5 && this.v == GameCanvas.o && !this.y) {
                           this.v = -1000;
                           this.b = (j + GameCanvas.o - this.c) / this.g;
                        }

                        if((var4 = GameCanvas.o - this.w[0]) != 0 && this.b != -1) {
                           this.b = -1;
                        }

                        for(var2 = this.w.length - 1; var2 > 0; --var2) {
                           this.w[var2] = this.w[var2 - 1];
                        }

                        this.w[0] = GameCanvas.o;
                        if((j -= var4) < 0) {
                           j = 0;
                        }

                        if(j > l) {
                           j = l;
                        }

                        if(k < 0 || k > l) {
                           var4 /= 2;
                        }

                        k -= var4;
                     }
                  }

                  if(GameCanvas.m && this.x) {
                     var4 = GameCanvas.o - this.w[0];
                     GameCanvas.m = false;
                     if(Res.g(var4) < 20 && Res.g(GameCanvas.o - this.v) < 20 && !this.y) {
                        this.A = 0;
                        j = k;
                        this.v = -1000;
                        this.b = (j + GameCanvas.o - this.c) / this.g;
                        this.u = 0;
                        this.z = 10;
                     } else if(this.b != -1 && this.u > 5) {
                        this.u = 0;
                        this.z = 1;
                     } else if(this.b == -1 && !this.y) {
                        if(k < 0) {
                           j = 0;
                        } else if(k > l) {
                           j = l;
                        } else {
                           byte var3;
                           if((var2 = GameCanvas.o - this.w[0] + (this.w[0] - this.w[1]) + (this.w[1] - this.w[2])) > 10) {
                              var3 = 10;
                           } else if(var2 < -10) {
                              var3 = -10;
                           } else {
                              var3 = 0;
                           }

                           this.A = -var3 * 100;
                        }
                     }

                     this.x = false;
                     this.u = 0;
                     GameCanvas.m = false;
                  }

                  GameCanvas.e();
                  GameCanvas.f();
               }
            }
         }
      }
   }

   public final void a(mGraphics var1) {
      if(!GameScr.gI().bc || !GameScr.gI().aZ) {
         var1.a(-var1.a(), -var1.b());
         var1.a(-k, 0);

         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            if(var2 == this.b) {
               var1.drawImage(r, this.c + var2 * this.g + 1, i[var2] + 1, 0);
            } else {
               var1.drawImage(q, this.c + var2 * this.g + 1, i[var2] + 1, 0);
            }

            String[] var3;
            if((var3 = ((Command)this.f.elementAt(var2)).subCaption) == null) {
               var3 = new String[]{((Command)this.f.elementAt(var2)).caption};
            }

            int var4 = i[var2] + (this.h - var3.length * 14) / 2 + 1;

            for(int var5 = 0; var5 < var3.length; ++var5) {
               if(var2 == this.b) {
                  mFont.tahoma_7b_green2.drawString(var1, var3[var5], this.c + var2 * this.g + this.g / 2, var4 + var5 * 14, 2);
               } else {
                  mFont.tahoma_7b_dark.drawString(var1, var3[var5], this.c + var2 * this.g + this.g / 2, var4 + var5 * 14, 2);
               }
            }
         }

         var1.a(-var1.a(), -var1.b());
      }
   }

   public final void b() {
      if(this.A != 0 && !this.x) {
         if((j += this.A / 100) < 0) {
            j = 0;
         } else if(j > l) {
            j = l;
         } else {
            k = j;
         }

         this.A = this.A * 9 / 10;
         if(this.A < 100 && this.A > -100) {
            this.A = 0;
         }
      }

      if(k != j && !this.x) {
         this.D = j - k << 2;
         this.E += this.D;
         k += this.E >> 4;
         this.E &= 15;
      }

      int var1;
      int var2;
      Command var3;
      if(!this.F) {
         ++this.e;

         for(var1 = 0; var1 < i.length; ++var1) {
            if(i[var1] > this.d) {
               if((var2 = i[var1] - this.d >> 1) <= 0) {
                  var2 = 1;
               }

               if(this.e > var1) {
                  i[var1] -= var2;
               }
            }
         }

         if(i[i.length - 1] <= this.d) {
            this.e = 0;
         }
      } else {
         ++this.e;

         for(var1 = 0; var1 < i.length; ++var1) {
            if(i[var1] < GameCanvas.A) {
               if((var2 = (GameCanvas.A - i[var1] >> 1) + 2) <= 0) {
                  var2 = 1;
               }

               if(this.e > var1) {
                  i[var1] += var2;
               }
            }
         }

         if(i[i.length - 1] >= GameCanvas.A) {
            this.e = 0;
            this.F = false;
            this.a = false;
            InfoDlg.hide();
            if(this.C) {
               GameCanvas.panel.af = null;
               Char.chatPopup = null;
               if(GameCanvas.panel2 != null && GameCanvas.panel2.af != null) {
                  GameCanvas.panel2.af = null;
               }
            } else if(this.B) {
               GameCanvas.panel.af = null;
               if(GameCanvas.panel2 != null && GameCanvas.panel2.af != null) {
                  GameCanvas.panel2.af = null;
               }

               if(this.b >= 0 && (var3 = (Command)this.f.elementAt(this.b)) != null) {
                  SoundMn.gI();
                  var3.performAction();
               }
            }
         }
      }

      if(m != 0 && (m >>= 1) < 0) {
         m = 0;
      }

      if(!this.c()) {
         if(this.z > 0) {
            --this.z;
            if(this.z == 0) {
               if(this.b >= 0 && !this.G[this.b]) {
                  this.F = true;
                  this.B = true;
                  GameCanvas.panel.af = null;
                  return;
               }

               InfoDlg.hide();
               if(this.b >= 0 && (var3 = (Command)this.f.elementAt(this.b)) != null) {
                  var3.performAction();
               }
            }
         }

      }
   }
}
