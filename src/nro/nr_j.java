package nro;

import main.GameCanvas;
import nro.mResources;
import nro.mScreen;
import nro.TField;
import nro.Command;
import nro.mFont;
import nro.mGraphics;
import nro.nr_n;

public final class nr_j extends nr_n {

   private String[] e;
   public TField a;
   private int f = 40;


   public nr_j() {
      if(GameCanvas.z <= 176) {
         this.f = 10;
      }

      this.a = new TField();
      this.a.a = this.f + 10;
      this.a.b = GameCanvas.A - mScreen.cd - 43;
      this.a.c = GameCanvas.z - 2 * (this.f + 10);
      this.a.d = mScreen.cd + 2;
      this.a.e = true;
      super.d = this.a.j;
   }

   public final void a(String var1, Command var2, int var3) {
      this.a.a("");
      this.a.c(var3);
      this.e = mFont.t.a(var1, GameCanvas.z - (this.f << 1));
      super.b = new Command(mResources.bf, GameCanvas.a(), 8882, (Object)null);
      super.c = var2;
      GameCanvas.J = this;
   }

   public final void a(mGraphics var1) {
      GameCanvas.L.a(var1, this.f, GameCanvas.A - 77 - mScreen.cmdH, GameCanvas.z - (this.f << 1), 69, this.e);
      this.a.a(var1);
      super.a(var1);
   }

   public final void a(int var1) {
      this.a.a(var1);
      super.a(var1);
   }

   public final void a() {
      this.a.c();
      super.a();
   }
}
