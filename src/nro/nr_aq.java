package nro;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Rms;
import nro.nr_bi;
import nro.Service;
import nro.MyVector;
import nro.mGraphics;
import nro.MyHashTable;

public final class nr_aq {

   public static MyHashTable a = new MyHashTable("h ImgByName");


   public static void a(String var0, Image var1, byte var2) {
      a.put(var0, new nr_bi(var1, var2));
   }

   public static nr_bi a(String var0, MyHashTable var1) {
      nr_bi var2;
      if((var2 = (nr_bi)var1.get(var0)) == null) {
         var2 = new nr_bi();
         nr_bi var3;
         if((var3 = a(var0)) != null) {
            var2.a = var3.a;
            var2.d = var3.d;
         }

         var1.put(var0, var2);
      }

      var2.b = GameCanvas.b / 1000L;
      if(var2.a == null) {
         --var2.c;
         if(var2.c <= 0) {
            Service.gI().g(var0);
            var2.c = 200;
         }
      }

      return var2;
   }

   private static nr_bi a(String var0) {
      byte[] var1;
      if((var1 = Rms.b(mGraphics.zoomLevel + "ImgByName_" + var0)) == null) {
         return null;
      } else {
         try {
            nr_bi var3;
            (var3 = new nr_bi()).d = var1[0];
            var3.a = Image.createImage(var1, 1, var1.length);
            return var3;
         } catch (Exception var2) {
            return null;
         }
      }
   }

   public static void a(String var0, byte var1, byte[] var2) {
      var0 = mGraphics.zoomLevel + "ImgByName_" + var0;
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);

      try {
         var4.writeByte(var1);

         for(int var6 = 0; var6 < var2.length; ++var6) {
            var4.writeByte(var2[var6]);
         }

         Rms.a(var0, var3.toByteArray());
         var4.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public static void a(MyHashTable var0, int var1) {
      MyVector var5 = new MyVector("checkDelHash");
      Enumeration var2 = var0.keys();

      while(var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         nr_bi var4 = (nr_bi)var0.get(var3);
         if(GameCanvas.b / 1000L - var4.b > 600L) {
            var5.addElement(var3);
         }
      }

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         var0.remove((String)var5.elementAt(var6));
      }

   }
}
