package nro;

import nro.nr_cd;
import nro.MyVector;
import nro.mGraphics;

public final class nr_db extends MyVector {

   public static nr_db a = new nr_db("low");
   public static nr_db b = new nr_db("mid");
   public static nr_db c = new nr_db("hi");


   private void b() {
      for(int var1 = this.size() - 1; var1 >= 0; --var1) {
         nr_cd var2;
         if((var2 = (nr_cd)this.elementAt(var1)) != null) {
            var2.a();
            if(var2.b) {
               this.removeElementAt(var1);
            }
         }
      }

   }

   public static void a() {
      c.b();
      b.b();
      a.b();
   }

   public final void a(mGraphics var1) {
      for(int var2 = 0; var2 < this.size(); ++var2) {
         nr_cd var3;
         if((var3 = (nr_cd)this.elementAt(var2)) != null && !var3.b) {
            ((nr_cd)this.elementAt(var2)).a(var1);
         }
      }

   }

   public static void a(nr_cd var0) {
      c.addElement(var0);
   }

   public static void b(nr_cd var0) {
      b.addElement(var0);
   }

   public static void c(nr_cd var0) {
      a.addElement(var0);
   }

   private nr_db(String var1) {
      super(var1);
   }
}
