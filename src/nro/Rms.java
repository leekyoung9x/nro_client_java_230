package nro;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;
import nro.Res;
import nro.nr_w;

public class Rms {

   public nr_w[] a;


   public Rms(int var1) {
      if(var1 == 0) {
         this.a = new nr_w[3];
      }

      if(var1 == 1) {
         this.a = new nr_w[17];
      }

      if(var1 == 2) {
         this.a = new nr_w[14];
      }

      if(var1 == 3) {
         this.a = new nr_w[2];
      }

   }

   public Rms() {}

   public static void a(String var0, byte[] var1) {
      try {
         Res.out("save rms " + var0 + " lent= " + var1.length);
         RecordStore var2;
         if((var2 = RecordStore.openRecordStore("vj" + var0, true)).getNumRecords() > 0) {
            var2.setRecord(1, var1, 0, var1.length);
         } else {
            var2.addRecord(var1, 0, var1.length);
         }

         var2.closeRecordStore();
      } catch (Exception var3) {
         Res.out("bi loi save -------------------------" + var0);
      }
   }

   public static void a(String var0) {
      for(int var1 = 0; var1 < RecordStore.listRecordStores().length; ++var1) {
         if(RecordStore.listRecordStores().equals(var0)) {
            try {
               RecordStore.deleteRecordStore(var0);
            } catch (RecordStoreNotFoundException var3) {
               var3.printStackTrace();
            } catch (RecordStoreException var4) {
               var4.printStackTrace();
            }
         }
      }

   }

   public static void a() {
      Res.out("CLEAR ALL");

      try {
         String[] var0;
         if((var0 = RecordStore.listRecordStores()) != null) {
            for(int var1 = 0; var1 < var0.length; ++var1) {
               if(var0[var1] != null) {
                  Res.out("name = " + var0[var1]);
                  RecordStore.deleteRecordStore(var0[var1]);
               }
            }

         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public static byte[] b(String var0) {
      try {
         RecordStore var1;
         byte[] var2 = (var1 = RecordStore.openRecordStore("vj" + var0, false)).getRecord(1);
         var1.closeRecordStore();
         Res.out("load rms " + var0 + " lent= " + var2.length);
         return var2;
      } catch (Exception var3) {
         Res.out("bi loi load ---------------------------------" + var0);
         return null;
      }
   }

   public static void saveRMSInt(String var0, int var1) {
      try {
         a(var0, new byte[]{(byte)var1});
      } catch (Exception var2) {
         ;
      }
   }

   public static void a(String var0, String var1) {
      try {
         a(var0, var1.getBytes("UTF-8"));
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public static String c(String var0) {
      byte[] var3;
      if((var3 = b(var0)) == null) {
         return null;
      } else {
         try {
            return new String(var3, "UTF-8");
         } catch (Exception var2) {
            return new String(var3);
         }
      }
   }

   public static int loadRmsInt(String var0) {
      byte[] var1;
      return (var1 = b(var0)) == null?-1:var1[0];
   }
}
