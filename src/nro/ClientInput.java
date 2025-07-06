package nro;

import main.GameMidlet;
import main.GameCanvas;

public final class ClientInput extends mScreen implements IActionListener {

   public static ClientInput a;
   private TField b;
   private TField c;
   private int d;
   private int e;
   private int f;
   private int g;
   private String[] h;
   private int i;


   public ClientInput() {
      this.f = GameCanvas.z - 20;
      if(this.f > 320) {
         this.f = 320;
      }

      this.h = mFont.tahoma_7b_green2.a(mResources.aY, this.f - 20);
      this.d = (GameCanvas.z - this.f) / 2;
      this.e = GameCanvas.A - 150 - (this.h.length - 1) * 20;
      this.g = 110 + (this.h.length - 1) * 20;
      this.b = new TField();
      this.b.i = mResources.aW;
      this.b.a = this.d + 10;
      this.b.b = this.e + 35 + (this.h.length - 1) * 20;
      this.b.c = this.f - 20;
      this.b.d = mScreen.cd + 2;
      if(GameCanvas.isTouch) {
         this.b.e = false;
      } else {
         this.b.e = true;
      }

      this.b.c(0);
      if(!GameCanvas.isTouch) {
         super.cc = this.b.j;
      }

      this.c = new TField();
      this.c.i = mResources.aX;
      this.c.a = this.d + 10;
      this.c.b = this.b.b + 35;
      this.c.c = this.f - 20;
      this.c.d = mScreen.cd + 2;
      this.c.e = false;
      this.c.c(0);
      super.ca = new Command(mResources.bf, this, 1, (Object)null);
      super.cb = new Command(mResources.aZ, this, 2, (Object)null);
      if(GameCanvas.isTouch) {
         super.cb.x = GameCanvas.z / 2 + 18;
         super.ca.x = GameCanvas.z / 2 - 85;
         super.cb.y = super.ca.y = this.e + this.g + 5;
      }

   }

   public static ClientInput a() {
      if(a == null) {
         a = new ClientInput();
      }

      return a;
   }

   public final void b() {
      this.i = 0;

      try {
         if(mResources.fw == 0) {
            GameMidlet.instance.platformRequest("http://nrosuno.com/");
         }

         if(mResources.fw == 2) {
            GameMidlet.instance.platformRequest("http://nrosuno.com/");
         }

         if(mResources.fw == 1) {
            GameMidlet.instance.platformRequest("http://nrosuno.com/");
            return;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public final void a(mGraphics var1) {
      GameScr.gI().a(var1);
      PopUp.a(var1, this.d, this.e, this.f, this.g, -1, true);

      for(int var2 = 0; var2 < this.h.length; ++var2) {
         mFont.tahoma_7b_green2.drawString(var1, this.h[var2], GameCanvas.z / 2, this.e + 15 + var2 * 20, 2);
      }

      this.b.a(var1);
      this.c.a(var1);
      super.a(var1);
   }

   public final void c() {
      GameScr.gI().c();
      this.b.c();
      this.c.c();
   }

   public final void a(int var1) {
      if(this.b.e) {
         this.b.a(var1);
      } else if(this.c.e) {
         this.c.a(var1);
      }

      super.a(var1);
   }

   public final void d() {
      if(GameCanvas.i[2]) {
         --this.i;
         if(this.i < 0) {
            this.i = 1;
         }
      } else if(GameCanvas.i[8]) {
         ++this.i;
         if(this.i > 1) {
            this.i = 1;
         }
      }

      if(GameCanvas.i[2] || GameCanvas.i[8]) {
         GameCanvas.e();
         if(this.i == 1) {
            this.b.e = false;
            this.c.e = true;
            if(!GameCanvas.isTouch) {
               super.cc = this.c.j;
            }
         } else if(this.i == 0) {
            this.b.e = true;
            this.c.e = false;
            if(!GameCanvas.isTouch) {
               super.cc = this.b.j;
            }
         } else {
            this.b.e = false;
            this.c.e = false;
         }
      }

      if(GameCanvas.m) {
         if(GameCanvas.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
            this.i = 0;
         } else if(GameCanvas.a(this.c.a, this.c.b, this.c.c, this.c.d)) {
            this.i = 1;
         }
      }

      super.d();
      GameCanvas.e();
   }

   public final void perform(int var1, Object var2) {
      if(var1 == 1) {
         GameScr.c.b();
         a = null;
      }

      if(var1 == 2) {
         if(this.b.getText() == null || this.b.getText().equals("")) {
            GameCanvas.a(mResources.ba);
            return;
         }

         if(this.c.getText() == null || this.c.getText().equals("")) {
            GameCanvas.a(mResources.bb);
            return;
         }

         Service.gI().sendCardInfo(this.b.getText(), this.c.getText());
         GameScr.c.b();
         a = null;
      }

   }
}
