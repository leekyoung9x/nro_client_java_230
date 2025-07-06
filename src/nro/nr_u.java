package nro;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import nro.Rms;
import nro.Service;
import nro.Res;
import nro.MyVector;

public final class nr_u {

   private byte c;
   public String a;
   public static MyVector b = new MyVector("");
   private static MyVector d = new MyVector("");


   public nr_u(String var1, byte var2) {
      this.a = var1;
      this.c = var2;
   }

   public static void a() {
      MyVector var0 = new MyVector("");
      byte[] var1;
      if((var1 = Rms.b("ImageSource")) == null) {
         Service.gI().imageSource(var0);
      } else {
         d = new MyVector("");
         ByteArrayInputStream var7 = new ByteArrayInputStream(var1);
         DataInputStream var8 = new DataInputStream(var7);

         try {
            short var2;
            String[] var3 = new String[var2 = var8.readShort()];
            byte[] var4 = new byte[var2];

            for(int var5 = 0; var5 < var2; ++var5) {
               var3[var5] = var8.readUTF();
               var4[var5] = var8.readByte();
               d.addElement(new nr_u(var3[var5], var4[var5]));
            }

            var8.close();
         } catch (IOException var6) {
            var6.printStackTrace();
         }

         Res.out("vS size= " + b.size() + " vRMS size= " + d.size());
         Service.gI().imageSource(var0);
      }
   }

   public static void b() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeShort(b.size());

         for(int var2 = 0; var2 < b.size(); ++var2) {
            var1.writeUTF(((nr_u)b.elementAt(var2)).a);
            var1.writeByte(((nr_u)b.elementAt(var2)).c);
         }

         Rms.a("ImageSource", var0.toByteArray());
         var1.close();
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
