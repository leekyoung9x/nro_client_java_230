package nro;

import main.GameCanvas;
import nro.mResources;
import nro.mScreen;
import nro.nr_bo;
import nro.SoundMn;
import nro.TileMap;
import nro.Command;
import nro.mGraphics;
import nro.GameScr;
import nro.IActionListener;

public final class nr_eo extends mScreen implements IActionListener {

   private int a = 0;
   private Command[] b;
   private Command c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;


   public final void b() {
      SoundMn.gI();
      super.b();
      this.b = new Command[nr_bo.a.length];

      int var1;
      for(var1 = 0; var1 < nr_bo.a.length; ++var1) {
         this.b[var1] = new Command(nr_bo.a[var1], this, var1 + 100, (Object)null);
      }

      this.a = nr_bo.m;
      this.f = 5;
      this.d = 76;
      this.e = mScreen.cmdH;
      this.g = 2;
      if(GameCanvas.z > 3 * (this.d + this.f)) {
         this.g = 3;
      }

      this.h = this.b.length / this.g + (this.b.length % this.g == 0?0:1);

      for(var1 = 0; var1 < this.b.length; ++var1) {
         if(this.b[var1] != null) {
            int var2 = GameCanvas.B - this.g * (this.d + this.f) / 2 + var1 % this.g * (this.d + this.f);
            int var3 = GameCanvas.C - this.h * (this.e + this.f) / 2 + var1 / this.g * (this.e + this.f);
            this.b[var1].x = var2;
            this.b[var1].y = var3;
         }
      }

      if(!GameCanvas.isTouch) {
         this.c = new Command(mResources.bs, this, 99, (Object)null);
         super.cb = this.c;
      }

   }

   public nr_eo() {
      if((TileMap.o = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || TileMap.o == 6) {
         TileMap.o = 4;
      }

      GameScr.a(-1, (int)-1);
      GameScr.j = 100;
      GameScr.k = 200;
   }

   public final void c() {
      if(++GameScr.j > GameCanvas.z * 3 + 100) {
         GameScr.j = 100;
      }

      for(int var1 = 0; var1 < this.b.length; ++var1) {
         if(!GameCanvas.isTouch) {
            if(var1 == this.a) {
               if(GameCanvas.gameTick % 10 < 4) {
                  this.b[var1].isFocus = true;
               } else {
                  this.b[var1].isFocus = false;
               }
            } else {
               this.b[var1].isFocus = false;
            }
         } else if(this.b[var1] != null && this.b[var1].isPointerPressInside()) {
            this.b[var1].performAction();
         }
      }

   }

   public final void a(mGraphics var1) {
      GameCanvas.b(var1);

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if(this.b[var2] != null) {
            this.b[var2].paint(var1);
         }
      }

      super.a(var1);
   }

   public final void d() {
      super.d();
      int var1 = this.a % this.g;
      int var2 = this.a / this.g;
      if(GameCanvas.i[4]) {
         if(var1 > 0) {
            --this.a;
         }

         GameCanvas.i[4] = false;
      } else if(GameCanvas.i[6]) {
         if(var1 < this.g - 1) {
            ++this.a;
         }

         GameCanvas.i[6] = false;
      } else if(GameCanvas.i[2]) {
         if(var2 > 0) {
            this.a -= this.g;
         }

         GameCanvas.i[2] = false;
      } else if(GameCanvas.i[8]) {
         System.out.println("-----------vo: " + this.a);
         if(var2 < this.h - 1) {
            this.a += this.g;
         }

         GameCanvas.i[8] = false;
      }

      if(this.a < 0) {
         this.a = 0;
      }

      if(this.a >= this.b.length) {
         this.a = this.b.length - 1;
      }

      if(GameCanvas.i[5]) {
         this.b[var1].performAction();
         GameCanvas.i[5] = false;
      }

      GameCanvas.e();
   }

   public final void perform(int var1, Object var2) {
      if(var1 == 99) {
         nr_bo.m = this.a;
         GameCanvas.af.i();
         GameCanvas.af.b();
      } else {
         nr_bo.m = var1 - 100;
         GameCanvas.af.i();
         GameCanvas.af.b();
      }
   }
}
