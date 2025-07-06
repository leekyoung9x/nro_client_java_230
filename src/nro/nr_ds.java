package nro;

import main.GameCanvas;
import nro.nr_af;
import nro.mResources;
import nro.PopUp;
import nro.TField;
import nro.Command;
import nro.mFont;
import nro.Res;
import nro.mGraphics;
import nro.GameScr;
import nro.IActionListener;

public final class nr_ds implements IActionListener {

   public Command a;
   private Command b;
   private String[] c;
   private int d;
   private int e;
   private int f = 120;
   private int g;
   private int h;
   private long i;
   private long j;


   public final void a(String var1, Command var2, Command var3) {
      this.c = new String[]{var1};
      this.g = 29;
      this.a = var2;
      this.b = var3;
      this.a.img = this.b.img = GameScr.bo;
      this.a.imgFocus = this.b.imgFocus = GameScr.bp;
      this.a.w = mGraphics.getImageWidth(var2.img);
      this.b.w = mGraphics.getImageWidth(var2.img);
      this.a.h = mGraphics.getImageHeight(var2.img);
      this.b.h = mGraphics.getImageHeight(var2.img);
      this.i = System.currentTimeMillis();
      this.h = this.c[0].length() / 3;
      if(this.h < 15) {
         this.h = 15;
      }

      nr_af.a();
   }

   public final void a(mGraphics var1) {
      PopUp.a(var1, this.d, this.e, this.f, this.g + (!GameCanvas.isTouch?10:0), 16777215, false);
      if(this.c != null) {
         nr_af.a(var1, this.c[0], this.d + 5, this.e + this.g / 2 - (GameCanvas.isTouch?4:6), this.f - 10, this.g, mFont.k);
         if(GameCanvas.isTouch) {
            this.a.paint(var1);
            mFont.n.a(var1, String.valueOf(this.h), this.a.x + this.a.w / 2, this.a.y + this.a.h + 5, 2, mFont.o);
            return;
         }

         if(TField.isQwerty) {
            mFont.b.drawString(var1, mResources.cG + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
            return;
         }

         mFont.b.drawString(var1, mResources.cH + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
      }

   }

   public final void a() {
      if(this.c != null) {
         this.d = GameCanvas.z - 5 - this.f;
         this.e = 45;
         if(GameCanvas.z - 50 > 155 + this.f) {
            this.d = GameCanvas.z - 55 - this.f;
            this.e = 5;
         }

         this.a.x = this.d - 35;
         this.a.y = this.e;
         this.j = System.currentTimeMillis();
         Res.out("curr - last= " + (this.j - this.i));
         if(this.j - this.i >= 1000L) {
            this.i = System.currentTimeMillis();
            --this.h;
         }

         if(this.h == 0) {
            GameScr.gI().bQ = null;
         }
      }

   }

   public final void perform(int var1, Object var2) {}
}
