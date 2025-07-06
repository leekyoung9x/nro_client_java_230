package nro;

import main.GameCanvas;
import nro.ChatPopup;
import nro.nr_cm;
import nro.nr_cr;
import nro.Command;
import nro.mGraphics;

public class mScreen {

   public Command ca;
   public Command cb;
   public Command cc;
   public static int cd;
   public static int cmdW = 68;
   public static int cmdH = 26;
   public static int cg = -1;


   public void b() {
      GameCanvas.e();
      GameCanvas.f();
      GameCanvas.currentScreen = this;
      GameCanvas.h.setFullScreenMode(true);
   }

   public void a(int var1) {}

   public void c() {}

   public void d() {
      if(GameCanvas.i[5] || a(GameCanvas.currentScreen.cb)) {
         GameCanvas.i[5] = false;
         cg = -1;
         GameCanvas.m = false;
         if(this.cb != null) {
            this.cb.performAction();
         }
      }

      if(GameCanvas.i[12] || a(GameCanvas.currentScreen.ca)) {
         GameCanvas.i[12] = false;
         cg = -1;
         GameCanvas.m = false;
         if(nr_cm.b().b) {
            if(nr_cm.b().d != null) {
               nr_cm.b().d.performAction();
            }
         } else if(this.ca != null) {
            this.ca.performAction();
         }
      }

      if(GameCanvas.i[13] || a(GameCanvas.currentScreen.cc)) {
         GameCanvas.i[13] = false;
         cg = -1;
         GameCanvas.m = false;
         if(nr_cm.b().b) {
            if(nr_cm.b().e != null) {
               nr_cm.b().e.performAction();
               return;
            }
         } else if(this.cc != null) {
            this.cc.performAction();
         }
      }

   }

   public static boolean a(Command var0) {
      if(var0 == null) {
         return false;
      } else if(var0.x >= 0 && var0.y != 0) {
         return var0.isPointerPressInside();
      } else {
         if(GameCanvas.J != null) {
            if(GameCanvas.J.c != null && GameCanvas.a(GameCanvas.z - cmdW >> 1, GameCanvas.A - cmdH - 5, cmdW, cmdH + 10)) {
               cg = 1;
               if(var0 == GameCanvas.J.c && GameCanvas.l && GameCanvas.m) {
                  return true;
               }
            }

            if(GameCanvas.J.b != null && GameCanvas.a(0, GameCanvas.A - cmdH - 5, cmdW, cmdH + 10)) {
               cg = 0;
               if(var0 == GameCanvas.J.b && GameCanvas.l && GameCanvas.m) {
                  return true;
               }
            }

            if(GameCanvas.J.d != null && GameCanvas.a(GameCanvas.z - cmdW, GameCanvas.A - cmdH - 5, cmdW, cmdH + 10)) {
               cg = 2;
               if((var0 == GameCanvas.J.d || var0 == nr_cm.b().e) && GameCanvas.l && GameCanvas.m) {
                  return true;
               }
            }
         } else {
            if(var0 == GameCanvas.currentScreen.ca && GameCanvas.a(0, GameCanvas.A - cmdH - 5, cmdW, cmdH + 10)) {
               cg = 0;
               if(GameCanvas.l && GameCanvas.m) {
                  return true;
               }
            }

            if(var0 == GameCanvas.currentScreen.cc && GameCanvas.a(GameCanvas.z - cmdW, GameCanvas.A - cmdH - 5, cmdW, cmdH + 10)) {
               cg = 2;
               if(GameCanvas.l && GameCanvas.m) {
                  return true;
               }
            }

            if((var0 == GameCanvas.currentScreen.cb || ChatPopup.m != null) && GameCanvas.a(GameCanvas.z - cmdW >> 1, GameCanvas.A - cmdH - 5, cmdW, cmdH + 10)) {
               cg = 1;
               if(GameCanvas.l && GameCanvas.m) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void a(mGraphics var1) {
      var1.a(-var1.a(), -var1.b());
      var1.e(0, 0, GameCanvas.z, GameCanvas.A + 1);
      if(!nr_cm.b().b && GameCanvas.J == null && !GameCanvas.menu.a) {
         nr_cr.a(var1, this.ca, this.cb, this.cc);
      }

   }
}
