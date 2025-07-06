package nro;

import main.GameCanvas;
import nro.Mob;
import nro.ChatPopup;
import nro.Char;
import nro.nr_ao;
import nro.mResources;
import nro.nr_bc;
import nro.mFont;
import nro.Res;
import nro.ItemOption;
import nro.MyVector;
import nro.mGraphics;

public final class nr_dy {

   public byte a;
   public byte b;
   public byte c;
   public byte d;
   public int e;
   public int f;
   public int g;
   public String h;
   public String i;
   public byte j;
   public byte k;
   public Char l;
   public Mob m;
   public ItemOption[] n;
   int[] o = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
   int p = 0;
   long q;
   public ChatPopup r;
   private MyVector s = new MyVector("");


   public final void a(byte var1, byte var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void a(byte var1) {
      this.j = var1;
      this.a();
   }

   public final void b(byte var1) {
      this.k = var1;
      this.a();
   }

   public static nr_dy a(MyVector var0, int var1) {
      if(var0 != null) {
         for(int var2 = 0; var2 < var0.size(); ++var2) {
            nr_dy var3;
            if((var3 = (nr_dy)var0.elementAt(var2)) != null && var3.e == var1) {
               return var3;
            }
         }
      }

      return null;
   }

   public final void a() {
      this.r = new ChatPopup();
      String var2 = "";
      var2 = var2 + "\n|6|" + this.i;
      var2 = var2 + "\n--";
      if(this.n != null) {
         int var3 = 0;

         while(true) {
            int var4 = 0;

            int var5;
            for(var5 = 0; var5 < this.n.length; ++var5) {
               if(!this.n[var5].getOptionString().equals("") && var3 == this.n[var5].active) {
                  ++var4;
                  break;
               }
            }

            if(var4 == 0) {
               break;
            }

            if(var3 == 0) {
               var2 = var2 + "\n|6|2|--" + mResources.e + "--";
            } else {
               var2 = var2 + "\n|6|2|--" + mResources.d + " Lv." + var3 + "--";
            }

            for(var5 = 0; var5 < this.n.length; ++var5) {
               String var1;
               if(!(var1 = this.n[var5].getOptionString()).equals("") && var3 == this.n[var5].active) {
                  String var6 = "1";
                  if(this.j == 0) {
                     var6 = "2";
                  } else if(this.n[var5].active != 0) {
                     if(this.k == 0) {
                        var6 = "2";
                     } else if(this.j < this.n[var5].active) {
                        var6 = "2";
                     }
                  }

                  var2 = var2 + "\n|" + var6 + "|1|" + var1;
               }
            }

            if(var4 != 0) {
               ++var3;
            }
         }
      }

      ChatPopup var7 = this.r;
      this.r.a = nr_ao.d;
      var7.e = nr_ao.b;
      var7.d = mFont.k.a(var2, var7.a - 8);
      var7.b = 10000000;
      var7.i = null;
      var7.g = var7.d.length * 12;
      var7.f = nr_ao.c;
      var7.s = 10;
      var7.h = var7.g - nr_ao.e;
      if(var7.h < 0) {
         var7.h = 0;
      }

   }

   public final void a(mGraphics var1, int var2, int var3) {
      nr_dy var4 = this;
      if(this.b == this.c && this.s.size() == 0) {
         int var5 = Res.b(1, 5);

         for(int var6 = 0; var6 < var5; ++var6) {
            nr_bc var7;
            (var7 = new nr_bc()).a = Res.b(5, 25);
            var7.b = Res.b(5, 25);
            var7.d = var6 * Res.b(0, 8);
            var7.e = 0;
            var7.c = -1;
            var4.s.addElement(var7);
         }
      }

      for(int var8 = 0; var8 < this.s.size(); ++var8) {
         nr_bc var9;
         if((var9 = (nr_bc)this.s.elementAt(var8)) != null) {
            if(var9.e < var9.d) {
               ++var9.e;
            }

            if(var9.e >= var9.d) {
               var9.c = GameCanvas.gameTick / 3 % (nr_ao.a.c + 1);
               if(var9.c >= nr_ao.a.c) {
                  this.s.removeElementAt(var8);
                  --var8;
               } else {
                  nr_ao.a.a(var9.c, var2 + var9.a, var3 + var9.b, 0, 3, var1);
               }
            }
         }
      }

   }
}
