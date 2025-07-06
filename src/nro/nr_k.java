package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Mob;
import nro.Char;
import nro.NinjaUtil;
import nro.ServerEffect;
import nro.mResources;
import nro.SmallImage;
import nro.PopUp;
import nro.Service;
import nro.SoundMn;
import nro.nr_cf;
import nro.Command;
import nro.mFont;
import nro.Npc;
import nro.mGraphics;
import nro.Main;
import nro.IActionListener;

public final class nr_k extends Npc implements IActionListener {

   private static Image dc = Main.loadImage("/mainImage/myTexture2dhatdau.png");
   public int a;
   public int b;
   public int c;
   public int d;
   public String e;
   public boolean f;
   public int[] g;
   public int[] h;
   private PopUp dd = new PopUp("", 0, 0);
   public boolean i;
   public static boolean j = true;
   public boolean k;
   public int l;
   public long m;
   public long n;
   private boolean de;
   private int df = 0;


   public nr_k(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.dd.i = new Command((String)null, this, 1, (Object)null);
      PopUp.a(this.dd);
   }

   public final void a(mGraphics var1) {
      if(this.a != 0) {
         SmallImage.drawSmallImage(var1, this.a, super.cx, super.cy, 0, nr_cf.c);
         if(Char.myCharz().aS != null && Char.myCharz().aS.equals(this)) {
            var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 0, super.cx, super.cy - SmallImage.a[this.a][4] - 1, 33);
            if(this.e != null) {
               mFont.n.a(var1, this.e, super.cx, super.cy - SmallImage.a[this.a][4] - 20, 2, mFont.o);
            }
         } else if(this.e != null) {
            mFont.n.a(var1, this.e, super.cx, super.cy - SmallImage.a[this.a][4] - 17, 2, mFont.o);
         }

         try {
            for(int var2 = 0; var2 < this.b; ++var2) {
               var1.drawImage(dc, super.cx + this.g[var2] - SmallImage.a[this.a][3] / 2, super.cy + this.h[var2] - SmallImage.a[this.a][4], 0);
            }
         } catch (Exception var3) {
            ;
         }

         if(super.bX >= 0 && super.bY != null && super.aM == 0) {
            SmallImage.drawSmallImage(var1, super.bY.a[super.bX].c, super.cx + super.bY.a[super.bX].a + SmallImage.a[this.a][3] / 2 + 5, super.cy - 15 + super.bY.a[super.bX].b, 0, 3);
            if(GameCanvas.gameTick % 2 == 0) {
               ++super.bX;
               if(super.bX >= super.bY.a.length) {
                  super.bX = 0;
               }
            }
         }

      }
   }

   public final void a() {
      this.dd.j = j;
      this.n = System.currentTimeMillis();
      if(this.n - this.m >= 1000L) {
         --this.l;
         this.m = this.n;
         if(this.l < 0) {
            this.l = 0;
         }
      }

      if(!this.f) {
         if(this.b < this.d && this.l == 0) {
            this.de = true;
         }
      } else if(this.l == 0) {
         this.f = false;
         this.de = true;
      }

      if(this.de) {
         ++this.df;
         if(this.df == 20) {
            this.df = 0;
            this.de = false;
            Service.gI().g((byte)2);
         }
      }

      if(this.i) {
         this.i = false;
         if((this.l < 0 || this.b >= this.d) && (this.l < 0 || !this.f) && !this.k) {
            if(this.b == this.d && !this.f) {
               this.dd.a(new String[]{mResources.cF, this.b + "/" + this.d}, super.cx, super.cy - 20 - SmallImage.a[this.a][4]);
            }
         } else {
            this.dd.a(new String[]{!this.f?this.b + "/" + this.d:mResources.cv, NinjaUtil.b(this.l)}, super.cx, super.cy - 20 - SmallImage.a[this.a][4]);
         }
      }

      if(this.l >= 0 && this.b < this.d || this.l >= 0 && this.f) {
         this.dd.c[this.dd.c.length - 1] = NinjaUtil.b(this.l);
      }

      if(this.k) {
         this.dd.j = false;
         ServerEffect.addServerEffect(98, super.cx + this.g[this.b - 1] - SmallImage.a[this.a][3] / 2, super.cy + this.h[this.b - 1] - SmallImage.a[this.a][4], 1);
         --this.b;
         if(GameCanvas.gameTick % 2 == 0) {
            SoundMn.gI();
         }

         if(this.b == this.c) {
            this.dd.j = true;
            this.i = true;
            this.k = false;
         }
      }

      super.a();
   }

   public final void perform(int var1, Object var2) {
      if(var1 == 1) {
         Service.gI().e((byte)1);
      }

   }
}
