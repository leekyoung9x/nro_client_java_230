package nro;

import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import nro.nr_ai;

public class nr_ac {

   private Random b;
   Vector a;
   private int[] c;


   public nr_ac(int var1, int var2, int var3, int var4) {
      this.b = new Random();
      this.a = new Vector();
      this.c = new int[]{16711680, 16776960, '\uff00', 16777215, 255, '\uffff', 15790320, 12632256};

      for(var3 = 0; var3 < 72; ++var3) {
         this.a.addElement(new nr_ai(var1, var2, Math.abs(this.b.nextInt() % 8) + 3, var3 * 5, this.c[Math.abs(this.b.nextInt() % this.c.length)]));
      }

   }

   public nr_ac() {}

   public static InputStream a(String var0) {
      return "".getClass().getResourceAsStream(var0);
   }
}
