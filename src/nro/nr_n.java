package nro;

import main.GameCanvas;
import nro.mScreen;
import nro.nr_cr;
import nro.Command;
import nro.mGraphics;

public abstract class nr_n {

   public Command b;
   public Command c;
   public Command d;


   public void a(mGraphics var1) {
      var1.a(-var1.a(), -var1.b());
      var1.e(0, 0, GameCanvas.z, GameCanvas.A);
      nr_cr.a(var1, this.b, this.c, this.d);
   }

   public void a(int var1) {
      switch(var1) {
      case -39:
      case -2:
         GameCanvas.j[8] = true;
         GameCanvas.i[8] = true;
         return;
      case -38:
      case -1:
         GameCanvas.j[2] = true;
         GameCanvas.i[2] = true;
         return;
      case -22:
      case -7:
         GameCanvas.j[13] = true;
         GameCanvas.i[13] = true;
         return;
      case -21:
      case -6:
         GameCanvas.j[12] = true;
         GameCanvas.i[12] = true;
         return;
      case -5:
      case 10:
         GameCanvas.j[5] = true;
         GameCanvas.i[5] = true;
         return;
      default:
      }
   }

   public void a() {
      if(this.c != null && (GameCanvas.i[5] || mScreen.a(this.c))) {
         GameCanvas.i[5] = false;
         GameCanvas.l = false;
         mScreen.cg = -1;
         GameCanvas.m = false;
         if(this.c != null) {
            this.c.performAction();
         }

         mScreen.cg = -1;
      }

      if(this.b != null && (GameCanvas.i[12] || mScreen.a(this.b))) {
         GameCanvas.i[12] = false;
         GameCanvas.l = false;
         mScreen.cg = -1;
         GameCanvas.m = false;
         if(this.b != null) {
            this.b.performAction();
         }

         mScreen.cg = -1;
      }

      if(this.d != null && (GameCanvas.i[13] || mScreen.a(this.d))) {
         GameCanvas.i[13] = false;
         GameCanvas.l = false;
         GameCanvas.m = false;
         mScreen.cg = -1;
         if(this.d != null) {
            this.d.performAction();
         }

         mScreen.cg = -1;
      }

      GameCanvas.e();
      GameCanvas.f();
   }
}
