package nro;

import main.GameCanvas;
import nro.Mob;
import nro.ChatPopup;
import nro.Char;
import nro.NinjaUtil;
import nro.nr_an;
import nro.Rms;
import nro.SmallImage;
import nro.TileMap;
import nro.mFont;
import nro.Res;
import nro.Effect;
import nro.EffecMn;
import nro.mGraphics;
import nro.GameScr;

public class Npc extends Char {

   public nr_an cW;
   public static nr_an[] cX;
   public boolean cY;
   private int a;
   private int b;
   public static boolean cZ;
   private static int c;
   public int[] da;
   private int d;
   private long e;
   private long f;
   public int db;


   static {
      int[] var10000 = new int[]{1, -1, 1, -1};
      var10000 = new int[]{1, -1, -1, 1};
   }

   public Npc(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.bc = true;
      super.aN = var6;
      Res.out("npc avatar= " + super.aN);
      super.cx = var3;
      super.cy = var4;
      super.cj = var3;
      super.ck = var4;
      super.statusMe = var2;
      if(var1 != -1) {
         this.cW = cX[var5];
      }

      if(var5 == 23 || var5 == 42) {
         super.al = 45;
      }

      if(var5 == 51) {
         super.bc = false;
         this.a = var2;
         Res.out("duaHau = " + var2);
      }

      if(this.cW != null) {
         if(this.cW.b == null) {
            this.cW.b = "";
         }

         this.cW.b = Res.changeString(this.cW.b);
      }

   }

   public final void a(byte var1, int var2) {
      this.a = var1;
      this.e = this.f = System.currentTimeMillis();
      this.d = var2;
      Res.out("in ra second= " + this.d);
   }

   public static void Y() {
      for(int var0 = 0; var0 < GameScr.G.size(); ++var0) {
         Npc var1;
         (var1 = (Npc)GameScr.G.elementAt(var0)).bY = null;
         var1.bX = -1;
      }

   }

   public void a() {
      if(this.cW.a == 51) {
         this.f = System.currentTimeMillis();
         if(this.f - this.e >= 1000L) {
            --this.d;
            this.e = this.f;
            if(this.d < 0) {
               this.d = 0;
            }
         }
      }

      if(super.bc) {
         this.G();
      }

      if(super.bY == null) {
         label75: {
            byte[] var1 = new byte[]{(byte)-1, (byte)9, (byte)9, (byte)10, (byte)10, (byte)11, (byte)11};
            if(Char.myCharz().ctaskId >= 9 && Char.myCharz().ctaskId <= 10 && Char.myCharz().aw.a > 0 && var1[Char.myCharz().aw.a] == this.cW.a) {
               if(Char.myCharz().taskMaint == null) {
                  super.bY = GameScr.y[57];
               } else {
                  if(Char.myCharz().taskMaint == null || Char.myCharz().taskMaint.a + 1 != Char.myCharz().taskMaint.f.length) {
                     break label75;
                  }

                  super.bY = GameScr.y[62];
               }
            } else {
               GameScr.gI();
               byte var2 = GameScr.A();
               if(Char.myCharz().taskMaint != null || var2 != this.cW.a) {
                  if(Char.myCharz().taskMaint == null || var2 != this.cW.a) {
                     break label75;
                  }

                  int var10000 = Char.myCharz().taskMaint.a + 1;
                  int var10001 = Char.myCharz().taskMaint.f.length;
                  super.bY = GameScr.y[98];
               }
            }

            super.bX = 0;
         }
      }

      super.a();
      if(TileMap.l == 51) {
         if(super.cx > Char.myCharz().cx) {
            super.I = -1;
         } else {
            super.I = 1;
         }

         if(this.cW.a % 2 == 0) {
            if(super.ar == 1) {
               super.ar = 0;
               return;
            }

            super.ar = 1;
         }
      }

   }

   public void a(mGraphics var1) {
      if(!Char.bH) {
         if(!this.cY) {
            if(this.F()) {
               if(super.statusMe != 15) {
                  if(super.aM != 0) {
                     super.a(var1);
                  } else if(this.cW != null) {
                     if(this.cW.a != 4 && this.cW.a != 51 && this.cW.a != 50) {
                        var1.drawImage(TileMap.bong, super.cx, super.cy, 3);
                     }

                     if(this.cW.a == 3) {
                        SmallImage.drawSmallImage(var1, 265, super.cx, super.cy, 0, 33);
                        if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this) && ChatPopup.m == null) {
                           var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 0, super.cx, super.cy - super.al + 4, 33);
                        }

                        this.b = 60;
                     } else if(this.cW.a != 4) {
                        int var2;
                        if(this.cW.a != 50 && this.cW.a != 51) {
                           if(this.cW.a == 6) {
                              SmallImage.drawSmallImage(var1, 545, super.cx, super.cy + 5, 0, 33);
                              if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this) && ChatPopup.m == null) {
                                 var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 0, super.cx, super.cy - super.al - 9, 33);
                              }

                              mFont.c.drawString(var1, String.valueOf(TileMap.n), super.cx, super.cy - super.al + 19 - mFont.k.a(), 2);
                           } else {
                              var2 = this.cW.c;
                              int var3 = this.cW.e;
                              int var4 = this.cW.d;
                              Rms var6 = GameScr.x[var2];
                              Rms var5 = GameScr.x[var3];
                              Rms var7 = GameScr.x[var4];
                              if(super.I == 1) {
                                 SmallImage.drawSmallImage(var1, var6.a[Char.bB[super.ar][0][0]].a, super.cx + Char.bB[super.ar][0][1] + var6.a[Char.bB[super.ar][0][0]].b, super.cy - Char.bB[super.ar][0][2] + var6.a[Char.bB[super.ar][0][0]].c, 0, 0);
                                 SmallImage.drawSmallImage(var1, var5.a[Char.bB[super.ar][1][0]].a, super.cx + Char.bB[super.ar][1][1] + var5.a[Char.bB[super.ar][1][0]].b, super.cy - Char.bB[super.ar][1][2] + var5.a[Char.bB[super.ar][1][0]].c, 0, 0);
                                 SmallImage.drawSmallImage(var1, var7.a[Char.bB[super.ar][2][0]].a, super.cx + Char.bB[super.ar][2][1] + var7.a[Char.bB[super.ar][2][0]].b, super.cy - Char.bB[super.ar][2][2] + var7.a[Char.bB[super.ar][2][0]].c, 0, 0);
                              } else {
                                 SmallImage.drawSmallImage(var1, var6.a[Char.bB[super.ar][0][0]].a, super.cx - Char.bB[super.ar][0][1] - var6.a[Char.bB[super.ar][0][0]].b, super.cy - Char.bB[super.ar][0][2] + var6.a[Char.bB[super.ar][0][0]].c, 2, 24);
                                 SmallImage.drawSmallImage(var1, var5.a[Char.bB[super.ar][1][0]].a, super.cx - Char.bB[super.ar][1][1] - var5.a[Char.bB[super.ar][1][0]].b, super.cy - Char.bB[super.ar][1][2] + var5.a[Char.bB[super.ar][1][0]].c, 2, 24);
                                 SmallImage.drawSmallImage(var1, var7.a[Char.bB[super.ar][2][0]].a, super.cx - Char.bB[super.ar][2][1] - var7.a[Char.bB[super.ar][2][0]].b, super.cy - Char.bB[super.ar][2][2] + var7.a[Char.bB[super.ar][2][0]].c, 2, 24);
                              }

                              if(TileMap.l != 51) {
                                 byte var8 = 15;
                                 if(this.cW.a == 47) {
                                    var8 = 47;
                                 }

                                 if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this) && ChatPopup.m == null) {
                                    var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 0, super.cx, super.cy - super.al - (var8 - 8), 33);
                                 }
                              }

                              this.b = 65;
                           }
                        } else if(this.da != null) {
                           if(this.cW.a == 50 && cZ) {
                              ++c;
                              if(GameCanvas.gameTick % 3 == 0) {
                                 EffecMn.addEff(new Effect(19, super.cx + Res.b(-50, 50), super.cy, 2, 1, -1));
                              }

                              if(GameCanvas.gameTick % 15 == 0) {
                                 EffecMn.addEff(new Effect(18, super.cx + Res.b(-5, 5), super.cy + Res.b(-90, 0), 2, 1, -1));
                              }

                              if(c == 100) {
                                 GameScr.gI().b(super.cx, super.cy);
                              }

                              if(c == 110) {
                                 cZ = false;
                                 this.cW.a = 4;
                              }
                           }

                           var2 = 0;
                           if(SmallImage.c[this.da[this.a]] != null && SmallImage.c[this.da[this.a]].a != null) {
                              var2 = mGraphics.getImageHeight(SmallImage.c[this.da[this.a]].a);
                           }

                           SmallImage.drawSmallImage(var1, this.da[this.a], super.cx + Res.b(-1, 1), super.cy, 0, 33);
                           if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this)) {
                              if(ChatPopup.m == null) {
                                 var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 0, super.cx, super.cy - super.al - 9 + 16 - var2, 33);
                              }

                              mFont.c.a(var1, NinjaUtil.b(this.d), super.cx, super.cy - super.al - 16 - mFont.k.a() - 20 - var2 + 16, 2, mFont.tahoma_7b_dark);
                           } else {
                              mFont.c.a(var1, NinjaUtil.b(this.d), super.cx, super.cy - super.al - 8 - mFont.k.a() - 20 - var2 + 16, 2, mFont.tahoma_7b_dark);
                           }
                        }
                     }

                     if(super.bX >= 0 && super.bY != null && super.aM == 0) {
                        SmallImage.drawSmallImage(var1, super.bY.a[super.bX].c, super.cx + super.bY.a[super.bX].a, super.cy + super.bY.a[super.bX].b - this.b, 0, 3);
                        if(GameCanvas.gameTick % 2 == 0) {
                           ++super.bX;
                           if(super.bX >= super.bY.a.length) {
                              super.bX = 0;
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   public final void e(mGraphics var1) {
      if(!Char.bH) {
         if(!this.cY) {
            if(this.F()) {
               if(super.statusMe != 15) {
                  if(this.cW != null) {
                     if(this.cW.a == 3) {
                        if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this)) {
                           mFont.n.a(var1, this.cW.b, super.cx, super.cy - super.al - mFont.k.a() - 5, 2, mFont.o);
                        } else {
                           mFont.n.a(var1, this.cW.b, super.cx, super.cy - super.al - 3 - mFont.k.a(), 2, mFont.o);
                        }

                        this.b = 60;
                     } else {
                        if(this.cW.a != 4) {
                           if(this.cW.a != 50 && this.cW.a != 51) {
                              if(this.cW.a == 6) {
                                 if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this)) {
                                    mFont.n.a(var1, this.cW.b, super.cx, super.cy - super.al - mFont.k.a() - 16, 2, mFont.o);
                                    return;
                                 }

                                 mFont.n.a(var1, this.cW.b, super.cx, super.cy - super.al - 8 - mFont.k.a(), 2, mFont.o);
                                 return;
                              }

                              if(TileMap.l != 51) {
                                 byte var3 = 15;
                                 if(this.cW.a == 47) {
                                    var3 = 47;
                                 }

                                 if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this)) {
                                    if(TileMap.l != 113) {
                                       mFont.n.a(var1, this.cW.b, super.cx, super.cy - super.al - mFont.k.a() - var3, 2, mFont.o);
                                    }
                                 } else {
                                    var3 = 8;
                                    if(this.cW.a == 47) {
                                       var3 = 40;
                                    }

                                    if(TileMap.l != 113) {
                                       mFont.n.a(var1, this.cW.b, super.cx, super.cy - super.al - var3 - mFont.k.a(), 2, mFont.o);
                                    }
                                 }
                              }

                              this.b = 65;
                           } else if(this.da != null) {
                              int var2 = 0;
                              if(SmallImage.c[this.da[this.a]] != null && SmallImage.c[this.da[this.a]].a != null) {
                                 var2 = mGraphics.getImageHeight(SmallImage.c[this.da[this.a]].a);
                              }

                              if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this)) {
                                 mFont.n.a(var1, this.cW.b, super.cx, super.cy - super.al - mFont.k.a() - var2, 2, mFont.o);
                                 return;
                              }

                              mFont.n.a(var1, this.cW.b, super.cx, super.cy - super.al - 8 - mFont.k.a() - var2 + 16, 2, mFont.o);
                              return;
                           }
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public final void k() {
      super.statusMe = 15;
      Char.chatPopup = null;
   }
}
