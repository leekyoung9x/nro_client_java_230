package nro;

import main.GameCanvas;
import nro.mResources;
import nro.nr_cr;
import nro.Command;
import nro.mFont;
import nro.mGraphics;
import nro.Main;
import nro.nr_n;
import nro.nr_x;

public final class nr_ba extends nr_n {

   private String[] e;
   public boolean a;
   private int f;
   private int g = 35;
   private long h = -1L;


   public nr_ba() {
      if(GameCanvas.z <= 176) {
         this.g = 10;
      }

      if(GameCanvas.z > 320) {
         this.g = 80;
      }

   }

   public final void b() {
      this.a(mResources.aw, (Command)null, (Command)null, (Command)null);
      GameCanvas.J = this;
      this.h = Main.c() + 5000L;
   }

   public final void c() {
      GameCanvas.J = this;
      this.h = -1L;
   }

   public final void a(String var1) {
      this.e = mFont.t.a(var1, GameCanvas.z - ((this.g << 1) + 20));
      this.f = 80;
      if(this.e.length >= 5) {
         this.f = this.e.length * mFont.t.a() + 20;
      }

   }

   public final void a(String var1, Command var2, Command var3, Command var4) {
      this.e = mFont.t.a(var1, GameCanvas.z - ((this.g << 1) + 20));
      super.b = var2;
      super.c = var3;
      super.d = var4;
      this.f = 80;
      if(this.e.length >= 5) {
         this.f = this.e.length * mFont.t.a() + 20;
      }

      if(GameCanvas.isTouch) {
         if(var2 != null) {
            super.b.x = GameCanvas.z / 2 - 68 - 5;
            super.b.y = GameCanvas.A - 50;
         }

         if(var4 != null) {
            super.d.x = GameCanvas.z / 2 + 5;
            super.d.y = GameCanvas.A - 50;
         }

         if(var3 != null) {
            super.c.x = GameCanvas.z / 2 - 35;
            super.c.y = GameCanvas.A - 50;
         }
      }

      this.a = false;
      this.h = -1L;
   }

   public final void a(mGraphics var1) {
      var1.e(0, 0, GameCanvas.z, GameCanvas.A);
      if(!nr_x.c) {
         int var2 = GameCanvas.A - this.f - 38;
         int var3 = GameCanvas.z - (this.g << 1);
         nr_cr.a(this.g, var2, var3, this.f, var1);
         var2 = var2 + (this.f - this.e.length * mFont.t.a()) / 2 - 2;
         if(this.a) {
            var2 += 8;
            GameCanvas.a(GameCanvas.B, var2 - 12, var1);
         }

         var3 = 0;

         for(var2 = var2; var3 < this.e.length; var2 += mFont.t.a()) {
            mFont.tahoma_7b_dark.drawString(var1, this.e[var3], GameCanvas.B, var2, 2);
            ++var3;
         }

         super.a(var1);
      }
   }

   public final void a() {
      super.a();
      if(this.h != -1L && Main.c() > this.h) {
         GameCanvas.g();
      }

   }
}
