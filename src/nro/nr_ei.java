package nro;

import main.GameCanvas;
import nro.ChatPopup;
import nro.Char;
import nro.nr_ap;
import nro.SmallImage;
import nro.nr_cf;
import nro.Command;
import nro.Res;
import nro.Info;
import nro.mGraphics;
import nro.GameScr;
import nro.nr_r;

public final class nr_ei {

   public int[][] a = new int[3][];
   public Info b = new Info();
   private int j;
   private int k;
   private int l;
   private int m;
   public int c;
   private int n;
   private int o;
   private int p;
   public int d;
   private int q;
   private int r;
   public boolean e;
   public boolean f = true;
   public int g;
   public int h;
   public Command i;


   public nr_ei() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new int[3];
      }

   }

   public final void a(mGraphics var1) {
      if(!this.equals(GameScr.aD) || !GameScr.gI().x()) {
         if(!this.equals(GameScr.aD) || GameScr.gI().bQ == null) {
            if(GameScr.bt) {
               if(GameCanvas.currentScreen == GameScr.gI() || GameCanvas.currentScreen == nr_ap.a()) {
                  if(ChatPopup.n == null) {
                     if(this.f) {
                        if(!Char.bF) {
                           if(!GameCanvas.panel.a || !this.equals(GameScr.aD)) {
                              var1.a(-var1.a(), -var1.b());
                              var1.e(0, 0, GameCanvas.z, GameCanvas.A);
                              if(this.b != null) {
                                 this.b.a(var1, this.d, this.c, this.j);
                              }

                              if(this.b.b != null && this.b.b.c == null && this.a != null) {
                                 SmallImage.drawSmallImage(var1, this.a[Char.myCharz().cgender][this.k], this.d, this.c + 3 + (GameCanvas.gameTick % 10 > 5?1:0), this.j == 1?0:2, nr_cf.f);
                              }

                              var1.a(-var1.a(), -var1.b());
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public final void a() {
      if(this.b != null && this.b.a != null && this.b.a.size() == 0 && this.c != -40) {
         --this.b.f;
         if(this.b.f <= 0) {
            this.c = -40;
            this.b.e = 0;
            this.b.a.removeAllElements();
            this.b.d = null;
            this.b.f = 200;
         }
      }

      if(!this.equals(GameScr.aD) || GameScr.gI().bQ == null) {
         if(this.f) {
            if(this.c != this.m) {
               this.o = this.m - this.c << 2;
               this.n += this.o;
               this.c += this.n >> 4;
               this.n &= 15;
            }

            if(this.d != this.p) {
               this.r = this.p - this.d << 2;
               this.q += this.r;
               this.d += this.q >> 4;
               this.q &= 15;
            }

            ++this.l;
            if(this.l == 5) {
               this.l = 0;
               if(this.k == 0) {
                  this.k = 1;
               } else {
                  this.k = 0;
               }
            }

            if(this.b != null) {
               if(this.b == null || this.b.b != null) {
                  if(!this.e) {
                     if(this.g > 0) {
                        --this.g;
                        if(this.g == 0) {
                           GameCanvas.panel.l();
                           GameCanvas.panel.show();
                        }
                     }

                     if(GameCanvas.gameTick % 3 == 0) {
                        if(Char.myCharz().I == 1) {
                           this.p = Char.myCharz().cx - 20 - GameScr.j;
                        }

                        if(Char.myCharz().I == -1) {
                           this.p = Char.myCharz().cx + 20 - GameScr.j;
                        }

                        if(this.p <= 24) {
                           this.p += this.b.c / 2;
                        }

                        if(this.p >= GameCanvas.z - 24) {
                           this.p -= this.b.c / 2;
                        }

                        this.m = Char.myCharz().cy - 40 - GameScr.k;
                        if(this.b.d != null && this.m < (this.b.d.length + 1) * 12 + 10) {
                           this.m = (this.b.d.length + 1) * 12 + 10;
                        }

                        if(this.b.b.c != null) {
                           if(GameCanvas.z - 50 > 155 + this.b.i) {
                              this.p = GameCanvas.z - 60 - this.b.i / 2;
                              this.m = this.b.j + 10;
                           } else {
                              this.p = GameCanvas.z - 20 - this.b.i / 2;
                              this.m = 45 + this.b.j;
                              if(GameCanvas.z > GameCanvas.A || GameCanvas.z < 220) {
                                 this.p = GameCanvas.z - 20 - this.b.i / 2;
                                 this.m = this.b.j + 10;
                              }
                           }
                        }
                     }

                     if(this.d > Char.myCharz().cx - GameScr.j) {
                        this.j = -1;
                     } else {
                        this.j = 1;
                     }
                  }

                  if(this.b.b != null) {
                     if(this.b.a.size() > 1) {
                        nr_r var1;
                        if(this.b.b.f == 0) {
                           ++this.b.e;
                           if(this.b.e >= this.b.b.b) {
                              this.b.e = 0;
                              this.b.a.removeElementAt(0);
                              var1 = (nr_r)this.b.a.firstElement();
                              this.b.b = var1;
                              this.b.c();
                              return;
                           }
                        } else {
                           this.b.b.i = System.currentTimeMillis();
                           if(this.b.b.i - this.b.b.h >= 1000L) {
                              this.b.b.h = System.currentTimeMillis();
                              --this.b.b.f;
                           }

                           if(this.b.b.f == 0) {
                              this.b.a.removeElementAt(0);
                              if(this.b.a.size() == 0) {
                                 return;
                              }

                              var1 = (nr_r)this.b.a.firstElement();
                              this.b.b = var1;
                              this.b.c();
                              return;
                           }
                        }
                     } else if(this.b.a.size() == 1) {
                        if(this.b.b.f == 0) {
                           ++this.b.e;
                           if(this.b.e >= this.b.b.b) {
                              this.e = true;
                           }

                           if(this.b.e == this.b.b.b) {
                              this.m = -40;
                              this.p = Char.myCharz().cx - GameScr.j + (Char.myCharz().I == 1?-20:20);
                           }

                           if(this.b.e >= this.b.b.b + 20) {
                              this.b.e = 0;
                              this.b.a.removeAllElements();
                              this.b.d = null;
                              return;
                           }
                        } else {
                           this.b.b.i = System.currentTimeMillis();
                           if(this.b.b.i - this.b.b.h >= 1000L) {
                              this.b.b.h = System.currentTimeMillis();
                              --this.b.b.f;
                           }

                           if(this.b.b.f == 0) {
                              this.e = true;
                              this.m = -40;
                              this.p = Char.myCharz().cx - GameScr.j + (Char.myCharz().I == 1?-20:20);
                              this.b.e = 0;
                              this.b.a.removeAllElements();
                              this.b.d = null;
                              this.i = null;
                           }
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public final void a(String var1, Char var2, boolean var3) {
      this.h = var2.charID;
      this.b.a(var1, 3, var2, var3);
      this.e = false;
   }

   public final void a(String var1, int var2) {
      var1 = Res.changeString(var1);
      if(this.b.a.size() <= 0 || !var1.equals(((nr_r)this.b.a.lastElement()).a)) {
         if(this.b.a.size() > 10) {
            for(int var3 = 0; var3 < 5; ++var3) {
               this.b.a.removeElementAt(0);
            }
         }

         this.b.a(var1, var2, (Char)null, false);
         if(this.b.a.size() == 1) {
            this.c = 0;
            this.d = Char.myCharz().cx - GameScr.j + (Char.myCharz().I == 1?-20:20);
         }

         this.e = false;
      }
   }
}
