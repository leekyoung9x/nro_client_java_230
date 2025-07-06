package nro;

import main.GameCanvas;
import nro.ServerEffect;
import nro.Res;
import nro.Info;

public final class PetFollow {

   public short a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public int m;
   public int n;
   int[] o;
   int p;


   public final void a(int var1, int[] var2, int var3, int var4) {
      if(var1 > 0) {
         this.l = var1;
         this.o = var2;
         this.m = var3;
         this.n = var4;
      }
   }

   public PetFollow() {
      new Info();
      this.l = -1;
      this.m = 0;
      this.n = 0;
      this.o = new int[]{0, 1, 2, 1};
      this.c = Res.b(0, 3);
   }

   public final void a() {
      ServerEffect.addServerEffect(60, this.i, this.e + 3 + (GameCanvas.gameTick % 10 > 5?1:0), 1);
   }
}
