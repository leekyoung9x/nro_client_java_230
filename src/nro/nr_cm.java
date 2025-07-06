package nro;

import main.GameCanvas;
import nro.mResources;
import nro.mScreen;
import nro.PopUp;
import nro.nr_bt;
import nro.TField;
import nro.nr_cr;
import nro.Command;
import nro.mFont;
import nro.Res;
import nro.mGraphics;
import nro.Main;
import nro.IActionListener;

public final class nr_cm implements IActionListener {

   private static nr_cm i;
   public TField a;
   public boolean b = false;
   public nr_bt c;
   private long j = 0L;
   public Command d;
   public Command e;
   public Command f = null;
   private int k;
   private int l;
   private int m;
   private int n;
   public String g;
   public String h;


   public final void a() {
      this.d = new Command(mResources.bo, this, 8000, (Object)null, 1, GameCanvas.A - mScreen.cmdH + 1);
      this.e = new Command(mResources.bg, this, 8001, (Object)null, GameCanvas.z - 70, GameCanvas.A - mScreen.cmdH + 1);
      this.f = null;
      this.m = this.a.c + 28;
      this.n = this.a.d + 26;
      this.k = GameCanvas.z / 2 - this.m / 2;
      this.l = this.a.b - 18;
      if(this.m > 320) {
         this.m = 320;
      }

      this.d.x = this.k;
      this.e.x = this.k + this.m - 68;
      if(GameCanvas.isTouch) {
         this.a.b -= 5;
         this.l -= 20;
         this.n += 30;
         this.d.x = GameCanvas.z / 2 - 68 - 5;
         this.e.x = GameCanvas.z / 2 + 5;
         this.d.y = GameCanvas.A - 30;
         this.e.y = GameCanvas.A - 30;
      }

   }

   public final void a(int var1) {
      if(this.b) {
         this.a.a(var1);
      }

      if(this.a.getText().equals("")) {
         this.e.caption = mResources.bf;
      } else {
         this.e.caption = mResources.bg;
      }
   }

   public static nr_cm b() {
      return i == null?(i = new nr_cm()):i;
   }

   public nr_cm() {
      this.h = mResources.bm + " ";
      this.a = new TField();
      this.a.i = mResources.bm;
      this.a.c = GameCanvas.z - 32;
      if(this.a.c > 250) {
         this.a.c = 250;
      }

      this.a.d = mScreen.cd + 2;
      this.a.a = GameCanvas.z / 2 - this.a.c / 2;
      this.a.e = true;
      this.a.b(80);
   }

   public final void a(int var1, nr_bt var2, String var3) {
      this.e.caption = mResources.bf;
      this.g = var3;
      this.a.a(var1);
      if(!this.a.getText().equals("") && GameCanvas.J == null) {
         this.c = var2;
         this.b = true;
      }

   }

   public final void a(String var1) {
      this.e.caption = mResources.bf;
      this.g = var1;
      if(GameCanvas.J == null) {
         this.b = true;
         if(GameCanvas.isTouch) {
            this.a.a();
         }
      }

   }

   public final void c() {
      if(this.b) {
         if(Main.typeClient != 5 && Main.typeClient != 3) {
            this.a.c();
         }

         if(this.a.h) {
            this.a.h = false;
            this.c.a(this.a.getText(), this.g);
            this.a.a("");
            this.e.caption = mResources.bf;
         }

      }
   }

   public final void a(mGraphics var1) {
      if(this.b) {
         if(Main.typeClient != 5 && Main.typeClient != 3) {
            PopUp.a(var1, this.k, this.l, this.m, this.n, -1, true);
            mFont.tahoma_7b_green2.drawString(var1, this.h + this.g, this.a.a, this.a.b - (GameCanvas.isTouch?17:12), 0);
            nr_cr.a(var1, this.d, this.f, this.e);
            this.a.a(var1);
         }
      }
   }

   public final void perform(int var1, Object var2) {
      switch(var1) {
      case 8000:
         Res.out("perform chat 1");
         if(this.c != null) {
            long var3;
            if((var3 = System.currentTimeMillis()) - this.j < 1000L) {
               return;
            }

            this.j = var3;
            this.c.a(this.a.getText(), this.g);
            this.a.a("");
            this.e.caption = mResources.bf;
            return;
         }
         break;
      case 8001:
         Res.out("perform chat 2");
         if(this.a.getText().equals("")) {
            this.b = false;
            this.c.D();
         }

         this.a.b();
      case 8002:
      }

   }
}
