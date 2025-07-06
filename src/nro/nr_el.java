package nro;

import main.GameCanvas;
import nro.mResources;
import nro.mScreen;
import nro.PopUp;
import nro.Service;
import nro.TField;
import nro.nr_cm;
import nro.Command;
import nro.mFont;
import nro.Res;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;
import nro.IActionListener;

public final class nr_el extends mScreen implements IActionListener {

   private static nr_el b;
   public TField[] a;
   private int c;
   private int d;
   private int e;
   private int f;
   private String[] g;
   private String h;
   private nr_cm i;
   private int j;
   private int k;


   public static nr_el a() {
      if(b == null) {
         b = new nr_el();
      }

      return b;
   }

   public final void b() {
      if((Main.typeClient != 5 || this.a.length != 1) && (Main.typeClient != 3 || this.a.length != 1)) {
         this.j = 0;
         super.b();
      } else {
         this.i = new nr_cm();
         this.i.h = this.h;
         this.i.a.i = this.a[0].f;
         this.i.g = "";
         this.i.b = true;
         this.i.a.c(0);
         if(GameCanvas.isTouch) {
            return;
         }
      }

   }

   public final void a(int var1, String var2) {
      this.k = var1;
      nr_el var3 = this;
      this.h = var2;
      this.e = GameCanvas.z - 20;
      if(this.e > 320) {
         this.e = 320;
      }

      Res.out("title= " + var2);
      this.g = mFont.tahoma_7b_dark.a(var2, this.e - 20);
      this.c = (GameCanvas.z - this.e) / 2;
      this.a = new TField[this.k];
      this.f = this.a.length * 35 + (this.g.length - 1) * 20 + 40;
      this.d = GameCanvas.A - this.f - 40 - (this.g.length - 1) * 20;

      for(int var4 = 0; var4 < var3.a.length; ++var4) {
         var3.a[var4] = new TField();
         var3.a[var4].i = "";
         var3.a[var4].a = var3.c + 10;
         var3.a[var4].b = var3.d + 35 + (var3.g.length - 1) * 20 + var4 * 35;
         var3.a[var4].c = var3.e - 20;
         var3.a[var4].d = mScreen.cd + 2;
         if(GameCanvas.isTouch) {
            var3.a[0].e = false;
         } else {
            var3.a[0].e = true;
         }

         if(!GameCanvas.isTouch) {
            var3.cc = var3.a[0].j;
         }
      }

      var3.ca = new Command(mResources.bf, var3, 1, (Object)null);
      var3.cb = new Command(mResources.bo, var3, 2, (Object)null);
      if(GameCanvas.isTouch) {
         var3.cb.x = GameCanvas.z / 2 + 18;
         var3.ca.x = GameCanvas.z / 2 - 85;
         var3.cb.y = var3.ca.y = var3.d + var3.f + 5;
      }

      this.b();
   }

   public final void a(mGraphics var1) {
      GameScr.gI().a(var1);
      PopUp.a(var1, this.c, this.d, this.e, this.f, -1, true);

      int var2;
      for(var2 = 0; var2 < this.g.length; ++var2) {
         mFont.tahoma_7b_green2.drawString(var1, this.g[var2], GameCanvas.z / 2, this.d + 15 + var2 * 20, 2);
      }

      for(var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2].a(var1);
      }

      super.a(var1);
   }

   public final void c() {
      GameScr.gI().c();

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].c();
      }

   }

   public final void a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if(this.a[var2].e) {
            this.a[var2].a(var1);
            break;
         }
      }

      super.a(var1);
   }

   public final void d() {
      if(GameCanvas.i[2]) {
         --this.j;
         if(this.j < 0) {
            this.j = this.a.length - 1;
         }
      } else if(GameCanvas.i[8]) {
         ++this.j;
         if(this.j > this.a.length - 1) {
            this.j = 0;
         }
      }

      if(GameCanvas.i[2] || GameCanvas.i[8]) {
         GameCanvas.e();

         for(int var1 = 0; var1 < this.a.length; ++var1) {
            if(this.j == var1) {
               this.a[var1].e = true;
               if(!GameCanvas.isTouch) {
                  super.cc = this.a[var1].j;
               }
            } else {
               this.a[var1].e = false;
            }

            if(GameCanvas.m && GameCanvas.a(this.a[var1].a, this.a[var1].b, this.a[var1].c, this.a[var1].d)) {
               this.j = var1;
               break;
            }
         }
      }

      super.d();
      GameCanvas.e();
   }

   public final void perform(int var1, Object var2) {
      if(var1 == 1) {
         GameScr.c.b();
         b = null;
      }

      if(var1 == 2) {
         if(Main.typeClient == 5 && this.a.length == 1 || Main.typeClient == 3 && this.a.length == 1) {
            if(this.i.a.getText() != null && !this.i.a.getText().equals("")) {
               this.a[0].a(this.i.a.getText());
               Service.gI().sendClientInput(this.a);
               GameScr.c.b();
               return;
            }

            GameCanvas.a(mResources.ge);
            return;
         }

         for(var1 = 0; var1 < this.a.length; ++var1) {
            if(this.a[var1].getText() == null || this.a[var1].getText().equals("")) {
               GameCanvas.a(mResources.ge);
               return;
            }
         }

         Service.gI().sendClientInput(this.a);
         GameScr.c.b();
      }

   }
}
