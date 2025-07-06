package nro;

import nro.Service;
import nro.MyVector;
import nro.MyHashTable;

public final class nr_aj {

   public int a;
   public String b;
   public short[] c;
   public int d;
   public int e;
   public static MyVector f = new MyVector("vClanImage");
   public static MyHashTable g = new MyHashTable("h id images");


   public static void a(nr_aj var0) {
      Service.gI().clanImage((byte)var0.a);
      f.addElement(var0);
   }

   public static nr_aj a(short var0) {
      for(int var1 = 0; var1 < f.size(); ++var1) {
         nr_aj var2;
         if((var2 = (nr_aj)f.elementAt(var1)).a == var0) {
            return var2;
         }
      }

      return null;
   }

   public static boolean a(int var0) {
      for(int var1 = 0; var1 < f.size(); ++var1) {
         if(((nr_aj)f.elementAt(var1)).a == var0) {
            return true;
         }
      }

      return false;
   }
}
