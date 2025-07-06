package nro;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import main.GameMidlet;
import main.GameCanvas;
import nro.mGraphics;

public abstract class nr_da extends Canvas implements Runnable {

   public static boolean ai;


   public static void setCurrent(GameMidlet var0) {
      Display.getDisplay(var0).setCurrent(GameCanvas.h);
   }

   public nr_da() {
      this.setFullScreenMode(true);
      /*int var10000 = super.getWidth();
      int var2 = super.getHeight();
      int var1 = var10000;
      if(var10000 * var2 >= 2073600) {
      nr_eh.b = 4;
      } else if(var1 * var2 >= 691200) {
      nr_eh.b = 3;
      } else if(var1 * var2 > 153600) {
      nr_eh.b = 2;
      } else {
      nr_eh.b = 1;
      }*/
      mGraphics.zoomLevel = 1;
   }

   public int getHeight() {
      return this.m();
   }

   public int getWidth() {
      return this.l();
   }

   public final int l() {
      int var1;
      return (var1 = super.getWidth()) / mGraphics.zoomLevel + (var1 % mGraphics.zoomLevel == 0?0:1);
   }

   public final int m() {
      int var1;
      return (var1 = super.getHeight()) / mGraphics.zoomLevel + (var1 % mGraphics.zoomLevel == 0?0:1);
   }

   protected final void pointerDragged(int var1, int var2) {
      var1 /= mGraphics.zoomLevel;
      var2 /= mGraphics.zoomLevel;
      this.a(var1, var2);
   }

   protected final void pointerPressed(int var1, int var2) {
      var1 /= mGraphics.zoomLevel;
      var2 /= mGraphics.zoomLevel;
      this.b(var1, var2);
   }

   protected final void pointerReleased(int var1, int var2) {
      var1 /= mGraphics.zoomLevel;
      var2 /= mGraphics.zoomLevel;
      this.c(var1, var2);
   }

   protected abstract void a(int var1, int var2);

   protected abstract void b(int var1, int var2);

   protected abstract void c(int var1, int var2);

   protected abstract void d();

   public void run() {
      try {
         Thread.sleep(100L);
      } catch (Exception var10) {
         ;
      }

      ai = true;

      while(ai) {
         long var1 = System.currentTimeMillis();
         this.d();
         this.repaint();
         this.serviceRepaints();
         long var3 = System.currentTimeMillis() - var1;

         try {
            if(var3 < 27L) {
               while(true) {
                  long var6 = System.currentTimeMillis();
                  Thread.sleep((long)((27L - var3) / nro.Time.timeScale));
                  if(System.currentTimeMillis() - var6 >= 27L - var3) {
                     break;
                  }
               }
            } else {
              Thread.sleep((long)(1L / nro.Time.timeScale));
            }
         } catch (Exception var11) {
            var11.printStackTrace();
         }
      }

   }
}
