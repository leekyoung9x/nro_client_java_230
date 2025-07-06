package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Controller;
import nro.Char;
import nro.mResources;
import nro.mScreen;
import nro.Service;
import nro.Command;
import nro.Res;
import nro.mGraphics;
import nro.Main;
import nro.IActionListener;

public final class nr_as extends mScreen implements IActionListener {

   private static nr_as f;
   private static Image g = Main.loadImage("/mainImage/myTexture2dfutherShip.png");
   private static Image h = Main.loadImage("/mainImage/taungam.png");
   public byte a;
   private int i = 5;
   private int[] j;
   private int[] k;
   private int[] l;
   private int[] m;
   private int n;
   private int o = 20;
   public short b;
   public short c;
   public long d;
   public long e;
   private boolean p;
   private boolean q;
   private int r;


   public nr_as() {
      this.j = new int[this.o];
      this.k = new int[this.o];

      int var1;
      for(var1 = 0; var1 < this.o; ++var1) {
         this.j[var1] = Res.b(0, GameCanvas.z);
         this.k[var1] = var1 * (GameCanvas.A / this.o);
      }

      this.l = new int[this.o];
      this.m = new int[this.o];

      for(var1 = 0; var1 < this.o; ++var1) {
         this.l[var1] = Res.b(0, GameCanvas.z);
         this.m[var1] = var1 * (GameCanvas.A / this.o);
      }

   }

   public static nr_as a() {
      if(f == null) {
         f = new nr_as();
      }

      return f;
   }

   public final void b() {
      this.p = false;
      this.q = false;
      if(Char.myCharz().X() > 0 && this.a == 0) {
         super.cb = new Command(mResources.fV, this, 1, (Object)null);
      } else {
         super.cb = null;
      }

      this.r = 0;
      super.b();
   }

   public final void a(mGraphics var1) {
      var1.a(this.a == 0?0:3056895);
      var1.d(0, 0, GameCanvas.z, GameCanvas.A);

      int var2;
      for(var2 = 0; var2 < this.o; ++var2) {
         var1.a(this.a == 0?14802654:11140863);
         var1.d(this.j[var2], this.k[var2], 10, 2);
      }

      if(this.a == 0) {
         var1.drawRegion(g, 0, 0, 72, 95, 7, this.n + this.r, GameCanvas.A / 2, 3);
      }

      if(this.a == 1) {
         var1.drawRegion(h, 0, 0, 144, 79, 2, this.n + this.r, GameCanvas.A / 2, 3);
      }

      for(var2 = 0; var2 < this.o; ++var2) {
         var1.a(this.a == 0?14935011:7536127);
         var1.d(this.l[var2], this.m[var2], 18, 3);
      }

      super.a(var1);
   }

   public final void c() {
      if(this.a == 0) {
         if(!this.p) {
            this.r = GameCanvas.z / 2 * this.b / this.c;
         }
      } else {
         this.r += 2;
      }

      Controller.b = false;
      this.n = (((GameCanvas.z / 2 + this.n) / 2 + this.n) / 2 + this.n) / 2;
      if(this.a == 1) {
         this.n = 0;
      }

      int var1;
      for(var1 = 0; var1 < this.o; ++var1) {
         this.j[var1] -= this.i / 2;
         if(this.j[var1] < -20) {
            this.j[var1] = GameCanvas.z;
         }
      }

      for(var1 = 0; var1 < this.o; ++var1) {
         this.l[var1] -= this.i;
         if(this.l[var1] < -20) {
            this.l[var1] = GameCanvas.z;
         }
      }

      if(GameCanvas.gameTick % 3 == 0) {
         this.i += this.p?2:1;
      }

      if(this.i > (this.p?80:25)) {
         this.i = this.p?80:25;
      }

      this.e = System.currentTimeMillis();
      if(this.e - this.d >= 1000L) {
         ++this.b;
         this.d = this.e;
      }

      if(this.p) {
         this.r += 3;
      }

      if(this.r >= GameCanvas.z / 2 + 30 && !this.q) {
         this.q = true;
         Service.gI().u();
      }

      super.c();
   }

   public final void d() {
      super.d();
   }

   public final void perform(int var1, Object var2) {
      if(var1 == 1) {
         GameCanvas.a(mResources.fW, new Command(mResources.bj, this, 2, (Object)null), new Command(mResources.bk, this, 3, (Object)null));
      }

      if(var1 == 2 && Char.myCharz().X() > 0) {
         this.p = true;
         GameCanvas.g();
         super.cb = null;
      }

      if(var1 == 3) {
         GameCanvas.g();
      }

   }
}
