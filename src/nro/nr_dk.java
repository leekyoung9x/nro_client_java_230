package nro;

import main.GameCanvas;
import nro.Char;
import nro.nr_aj;
import nro.mResources;
import nro.SmallImage;
import nro.PopUp;
import nro.Service;
import nro.nr_cr;
import nro.Command;
import nro.mFont;
import nro.nr_do;
import nro.MyVector;
import nro.mGraphics;
import nro.IActionListener;

public final class nr_dk implements IActionListener {

   int a;
   private int p;
   int b;
   private int q;
   Command c;
   Command d;
   private int r = 24;
   public int e = 0;
   private int s = 50;
   public static nr_do f;
   public int g;
   public int h;
   public int i;
   public int j;
   public boolean k;
   public boolean l;
   public String m;
   private MyVector t = new MyVector("vItems");
   int n;
   int o;


   public final void a(boolean var1) {
      Char.myCharz();
      this.k = true;
      this.l = false;
      if(this.l) {
         this.b = 170;
         this.q = 118;
         this.a = GameCanvas.z / 2 - this.b / 2;
         this.p = GameCanvas.A / 2 - this.q / 2;
      } else {
         this.b = 170;
         this.q = 170;
         this.a = GameCanvas.z / 2 - this.b / 2;
         this.p = GameCanvas.A / 2 - this.q / 2;
         if(GameCanvas.A < 240) {
            this.p -= 10;
         }
      }

      this.h = this.a;
      this.g = 0;
      this.e = nr_aj.f.size();
      if(GameCanvas.isTouch) {
         this.c.x = this.a;
         this.c.y = this.p + this.q + 5;
         this.d.x = this.a + this.b - 68;
         this.d.y = this.p + this.q + 5;
      }

      (f = new nr_do()).a(this.e, this.r, this.a, this.p + this.s, this.b, this.q - this.s, true, 1);
   }

   private void a() {
      this.g = this.a + this.b;
   }

   public nr_dk() {
      this.c = new Command(mResources.bs, this, 1, (Object)null);
      this.d = new Command(mResources.bf, this, 2, (Object)null);
   }

   public final void a(mGraphics var1) {
      var1.a(-this.h, 0);
      PopUp.a(var1, this.a, this.p - 17, this.b, this.q + 17, -1, true);
      mFont.tahoma_7b_dark.drawString(var1, mResources.dv, this.a + this.b / 2, this.p - 7, 2);
      nr_aj var2;
      if(this.o >= 0 && this.o <= nr_aj.f.size() - 1 && (var2 = (nr_aj)nr_aj.f.elementAt(this.o)).c != null) {
         Char.myCharz().a(var1, var2.c, GameCanvas.z / 2, this.p + 45, 1, false);
      }

      Char.myCharz().a(var1, GameCanvas.z / 2, this.p + 45, 1, Char.myCharz().ar, false);
      var1.e(this.a, this.p + this.s, this.b, this.q - this.s - 10);
      if(f != null) {
         var1.a(0, -f.d);
      }

      for(int var7 = 0; var7 < this.e; ++var7) {
         int var3 = this.a + 10;
         int var4;
         if((var4 = this.p + var7 * this.r + this.s) + this.r - (f != null?f.d:0) >= this.p + this.s && var4 - (f != null?f.d:0) <= this.p + this.s + this.q) {
            nr_aj var5 = (nr_aj)nr_aj.f.elementAt(var7);
            mFont var6 = mFont.o;
            if(var7 == this.o) {
               var6 = mFont.q;
            }

            if(var5.b != null) {
               var6.drawString(var1, var5.b, var3 + 20, var4, 0);
            }

            if(var5.d > 0) {
               var6.drawString(var1, var5.d + " " + mResources.bz, var3 + this.b - 20, var4, 1);
            } else if(var5.e > 0) {
               var6.drawString(var1, var5.e + " " + mResources.bA, var3 + this.b - 20, var4, 1);
            }

            if(var5.c != null) {
               SmallImage.drawSmallImage(var1, var5.c[0], var3, var4, 0, 0);
            }
         }
      }

      var1.a(0, -var1.b());
      var1.e(0, 0, GameCanvas.z, GameCanvas.A);
      nr_cr.a(var1, this.c, (Command)null, this.d);
   }

   public final void perform(int var1, Object var2) {
      if(var1 == 2) {
         this.a();
      }

      if(var1 == 1 && !this.l && this.o >= 0) {
         this.a();
         if(Char.myCharz().ai == null) {
            Service.gI().getClan((byte)2, (byte)((nr_aj)nr_aj.f.elementAt(this.o)).a, this.m);
            return;
         }

         Service.gI().getClan((byte)4, (byte)((nr_aj)nr_aj.f.elementAt(this.o)).a, "");
      }

   }
}
