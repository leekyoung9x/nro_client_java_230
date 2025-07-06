package nro;

import main.GameCanvas;
import nro.NinjaUtil;
import nro.mResources;
import nro.mFont;
import nro.MyVector;
import nro.mGraphics;
import nro.IActionListener;

public final class nr_bx implements IActionListener {

   public int a;
   public int b;
   public int c;
   public String d;
   public long e;
   public String[] f;
   public byte g;
   public byte h;
   private int m;
   public int i;
   public int j;
   public String[] k;
   public static MyVector l = new MyVector("v Message");


   public static void a(nr_bx var0, int var1, boolean var2) {
      for(int var3 = 0; var3 < l.size(); ++var3) {
         nr_bx var4;
         if((var4 = (nr_bx)l.elementAt(var3)).a == var0.a) {
            l.removeElement(var4);
            if(!var2) {
               l.insertElementAt(var0, var3);
               return;
            }

            l.insertElementAt(var0, 0);
            return;
         }

         if(var4.j != 0 && var4.i == var4.j) {
            l.removeElement(var4);
         }
      }

      if(var1 == -1) {
         l.addElement(var0);
      } else {
         l.insertElementAt(var0, 0);
      }

      if(l.size() > 20) {
         l.removeElementAt(l.size() - 1);
      }

   }

   public final void a(mGraphics var1, int var2, int var3) {
      mFont var4 = mFont.tahoma_7b_dark;
      if(this.h == 0) {
         var4 = mFont.a;
      } else if(this.h == 1) {
         var4 = mFont.h;
      } else if(this.h == 2) {
         var4 = mFont.tahoma_7b_green2;
      }

      if(this.b == 0) {
         var4.drawString(var1, this.d, var2 + 3, var3 + 1, 0);
         if(this.g == 0) {
            mFont.o.drawString(var1, this.f[0] + (this.f.length > 1?"...":""), var2 + 3, var3 + 11, 0);
         } else {
            mFont.p.drawString(var1, this.f[0] + (this.f.length > 1?"...":""), var2 + 3, var3 + 11, 0);
         }

         mFont.o.drawString(var1, NinjaUtil.c(this.m) + " " + mResources.dF, var2 + GameCanvas.panel.ad - 3, var3 + 1, 1);
      }

      if(this.b == 1) {
         var4.drawString(var1, this.d + " (" + this.i + "/" + this.j + ")", var2 + 3, var3 + 1, 0);
         mFont.q.drawString(var1, mResources.cT + " " + NinjaUtil.c(this.m) + " " + mResources.dF, var2 + 3, var3 + 11, 0);
      }

      if(this.b == 2) {
         var4.drawString(var1, this.d, var2 + 3, var3 + 1, 0);
         mFont.q.drawString(var1, mResources.dw, var2 + 3, var3 + 11, 0);
      }

   }

   public final void perform(int var1, Object var2) {}

   public final void a() {
      if(this.e != 0L) {
         this.m = (int)(System.currentTimeMillis() / 1000L - this.e);
      }

   }
}
