package nro;

import java.util.Random;
import nro.Char;
import nro.mResources;
import nro.Service;
import nro.mFont;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;

public final class Res {

   private static short[] d = new short[]{(short)0, (short)18, (short)36, (short)54, (short)71, (short)89, (short)107, (short)125, (short)143, (short)160, (short)178, (short)195, (short)213, (short)230, (short)248, (short)265, (short)282, (short)299, (short)316, (short)333, (short)350, (short)367, (short)384, (short)400, (short)416, (short)433, (short)449, (short)465, (short)481, (short)496, (short)512, (short)527, (short)543, (short)558, (short)573, (short)587, (short)602, (short)616, (short)630, (short)644, (short)658, (short)672, (short)685, (short)698, (short)711, (short)724, (short)737, (short)749, (short)761, (short)773, (short)784, (short)796, (short)807, (short)818, (short)828, (short)839, (short)849, (short)859, (short)868, (short)878, (short)887, (short)896, (short)904, (short)912, (short)920, (short)928, (short)935, (short)943, (short)949, (short)956, (short)962, (short)968, (short)974, (short)979, (short)984, (short)989, (short)994, (short)998, (short)1002, (short)1005, (short)1008, (short)1011, (short)1014, (short)1016, (short)1018, (short)1020, (short)1022, (short)1023, (short)1023, (short)1024, (short)1024};
   private static short[] e;
   private static int[] f;
   public static Random a;
   public static boolean b;
   public static boolean c;


   static {
      String[] var10000 = new String[]{"<color=#ff0000ff>[  LOG_CAT  ]</color>", "<color=#ff0000ff>[LOG_SESSION]</color>", "<color=#ffff00ff>[LOG_SESSION]</color>", "<color=#ff0000ff>[LOG_MOBILE ]</color>", ""};
      a = new Random();
      new MyVector("");
   }

   public static void a() {
      e = new short[91];
      f = new int[91];

      for(int var0 = 0; var0 <= 90; ++var0) {
         e[var0] = d[90 - var0];
         if(e[var0] == 0) {
            f[var0] = Integer.MAX_VALUE;
         } else {
            f[var0] = (d[var0] << 10) / e[var0];
         }
      }

   }

   public static final int a(int var0) {
      return (var0 = c(var0)) >= 0 && var0 < 90?d[var0]:(var0 >= 90 && var0 < 180?d[180 - var0]:(var0 >= 180 && var0 < 270?-d[var0 - 180]:-d[360 - var0]));
   }

   public static final int b(int var0) {
      return (var0 = c(var0)) >= 0 && var0 < 90?e[var0]:(var0 >= 90 && var0 < 180?-e[180 - var0]:(var0 >= 180 && var0 < 270?-e[var0 - 180]:e[360 - var0]));
   }

   public static final int a(int var0, int var1) {
      int var10000;
      int var2;
      if(var0 != 0) {
         var2 = Math.abs((var1 << 10) / var0);
         int var3 = 0;

         while(true) {
            if(var3 > 90) {
               var10000 = 0;
               break;
            }

            if(f[var3] >= var2) {
               var10000 = var3;
               break;
            }

            ++var3;
         }

         var2 = var10000;
         if(var1 >= 0 && var0 < 0) {
            var2 = 180 - var2;
         }

         if(var1 < 0 && var0 < 0) {
            var2 += 180;
         }

         if(var1 >= 0 || var0 < 0) {
            return var2;
         }

         var10000 = 360 - var2;
      } else {
         var10000 = var1 > 0?90:270;
      }

      var2 = var10000;
      return var2;
   }

   public static final int c(int var0) {
      if(var0 >= 360) {
         var0 -= 360;
      }

      if(var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   public static void a(mGraphics var0) {
      mFont.tahoma_7b_dark.drawString(var0, "check Controller= " + Service.logController, 3, 55, 0);
      mFont.tahoma_7b_dark.drawString(var0, "check Map= " + Service.logMap, 3, 75, 0);
   }

   public static void b() {
      long var0 = Main.c();
      if(Service.curCheckController - var0 > 5000L) {
         Service.gI().sendCheckController();
      }

      if(Service.curCheckMap - var0 > 5000L) {
         Service.gI().sendCheckMap();
      }

   }

   public static String changeString(String var0) {
      if(Main.typeClient != 7) {
         return var0;
      } else if(Char.myCharz() != null && Char.myCharz().taskMaint != null && Char.myCharz().taskMaint.taskId >= 10) {
         return var0;
      } else {
         if(var0.indexOf("Gohan") != -1) {
            var0 = a(var0, "Gohan", "Hango");
         }

         if(var0.indexOf("Gôhan") != -1) {
            var0 = a(var0, "Gôhan", "Hango");
         }

         if(var0.indexOf("Bunma") != -1) {
            var0 = a(var0, "Bunma", "Mabun");
         }

         if(var0.indexOf("Bunman") != -1) {
            var0 = a(var0, "Bunman", "Mabun");
         }

         if(var0.indexOf("Bun ma") != -1) {
            var0 = a(var0, "Bun ma", "Mabun");
         }

         if(var0.indexOf("Đậu thần") != -1) {
            var0 = a(var0, "Đậu thần", "Cây thần");
         }

         if(var0.indexOf("Mabu") != -1) {
            var0 = a(var0, "Mabu", "Buma");
         }

         if(var0.indexOf("Ma bư") != -1) {
            var0 = a(var0, "Ma bư", "Buma");
         }

         if(var0.indexOf("Xayda") != -1) {
            var0 = a(var0, "Xayda", "Dasay");
         }

         if(var0.indexOf("Xay da") != -1) {
            var0 = a(var0, "Xay da", "Dasay");
         }

         if(var0.indexOf("Namếc") != -1) {
            var0 = a(var0, "Namếc", "Mecda");
         }

         if(var0.indexOf("Na mếc") != -1) {
            var0 = a(var0, "Na mếc", "Mecda");
         }

         if(var0.indexOf("Namek") != -1) {
            var0 = a(var0, "Namek", "Mecda");
         }

         if(var0.indexOf("Rồng thần") != -1) {
            var0 = a(var0, "Rồng thần", "Rồng đất");
         }

         if(var0.indexOf("Kame") != -1) {
            var0 = a(var0, "Kame", "Meka");
         }

         if(var0.indexOf("Vegeta") != -1) {
            var0 = a(var0, "Vegeta", "Tageve");
         }

         if(var0.indexOf("Kakalot") != -1) {
            var0 = a(var0, "Kakalot", "Lotkaka");
         }

         if(var0.indexOf("Broly") != -1) {
            var0 = a(var0, "Broly", "Lybro");
         }

         if(var0.indexOf("Ngọc rồng") != -1) {
            var0 = a(var0, "Ngọc rồng", "Ngọc thần");
         }

         if(var0.indexOf("ngọc rồng") != -1) {
            var0 = a(var0, "ngọc rồng", "Ngọc thần");
         }

         if(var0.indexOf("Radic") != -1) {
            var0 = a(var0, "Radic", "Dicra");
         }

         if(var0.indexOf("Ra dic") != -1) {
            var0 = a(var0, "Ra dic", "Dicra");
         }

         if(var0.indexOf("Ra đíc") != -1) {
            var0 = a(var0, "Ra đíc", "Dicra");
         }

         if(var0.indexOf("Cadic") != -1) {
            var0 = a(var0, "Cadic", "Dicca");
         }

         if(var0.indexOf("Ca dic") != -1) {
            var0 = a(var0, "Ca dic", "Dicca");
         }

         if(var0.indexOf("Ca đíc") != -1) {
            var0 = a(var0, "Ca đíc", "Dicca");
         }

         if(var0.indexOf("Quy lão") != -1) {
            var0 = a(var0, "Quy lão", "Lão");
         }

         if(var0.indexOf("quy lão") != -1) {
            var0 = a(var0, "quy lão", "lão");
         }

         if(var0.indexOf("QuyLão") != -1) {
            var0 = a(var0, "Quy Lão", "Lão");
         }

         if(var0.indexOf("Santa") != -1) {
            var0 = a(var0, "Santa", "Tasan");
         }

         if(var0.indexOf("Hạt Mít") != -1) {
            var0 = a(var0, "Hạt Mít", "Hạt Dẻ");
         }

         if(var0.indexOf("Hạt mít") != -1) {
            var0 = a(var0, "Hạt mít", "Hạt dẻ");
         }

         if(var0.indexOf("Tàu bảy bảy") != -1) {
            var0 = a(var0, "Tàu bảy bảy", "Tàu tàu");
         }

         if(var0.indexOf("Uron") != -1) {
            var0 = a(var0, "Uron", "Onru");
         }

         if(var0.indexOf("U ron") != -1) {
            var0 = a(var0, "U ron", "Onru");
         }

         if(var0.indexOf("Urôn") != -1) {
            var0 = a(var0, "Urôn", "Onru");
         }

         if(var0.indexOf("Ngọc Rồng") != -1) {
            var0 = a(var0, "Ngọc Rồng", "Ngọc thần");
         }

         if(var0.indexOf("Ngọc rồng") != -1) {
            var0 = a(var0, "Ngọc rồng", "Ngọc thần");
         }

         if(var0.indexOf("Fide") != -1) {
            var0 = a(var0, "Fide", "Defi");
         }

         if(var0.indexOf("Vegeta") != -1) {
            var0 = a(var0, "Vegeta", "Tageve");
         }

         if(var0.indexOf("Moori") != -1) {
            var0 = a(var0, "Moori", "Rimoo");
         }

         if(var0.indexOf("Aru") != -1) {
            var0 = a(var0, "Aru", "Ura");
         }

         if(var0.indexOf("Kamejoko") != -1) {
            var0 = a(var0, "Kamejoko", "Kojomeka");
         }

         if(var0.indexOf("kamejoko") != -1) {
            var0 = a(var0, "kamejoko", "kojomeka");
         }

         if(var0.indexOf("Kame") != -1) {
            var0 = a(var0, "Kame", "Meka");
         }

         if(var0.indexOf("kame") != -1) {
            var0 = a(var0, "kame", "meka");
         }

         if(var0.indexOf("Masenko") != -1) {
            var0 = a(var0, "Masenko", "Kosenma");
         }

         if(var0.indexOf("Thái Dương Hạ San") != -1) {
            var0 = a(var0, "Thái Dương Hạ San", "Hạ Dương");
         }

         if(var0.indexOf("Solar flare") != -1) {
            var0 = a(var0, "Solar flare", "Solar");
         }

         if(var0.indexOf("Quả cầu kênh khi") != -1) {
            var0 = a(var0, "Quả cầu kênh khi", "Quả cầu");
         }

         if(var0.indexOf("Genki-Dama") != -1) {
            var0 = a(var0, "Genki-Dama", "Dama");
         }

         if(var0.indexOf("Genki-Dama") != -1) {
            var0 = a(var0, "Genki-Dama", "Dama");
         }

         if(var0.indexOf("Makankosappo") != -1) {
            var0 = a(var0, "Makankosappo", "Oppasoknakam");
         }

         return var0;
      }
   }

   private static String a(String var0, String var1, String var2) {
      StringBuffer var3 = new StringBuffer();
      int var4 = var0.indexOf(var1);
      int var5 = 0;

      for(int var6 = var1.length(); var4 != -1; var4 = var0.indexOf(var1, var5)) {
         var3.append(var0.substring(var5, var4)).append(var2);
         var5 = var4 + var6;
      }

      var3.append(var0.substring(var5, var0.length()));
      return var3.toString();
   }

   public static int d(int var0) {
      return a.nextInt(var0);
   }

   public static int b(int var0, int var1) {
      return var0 == var1?var0:var0 + a.nextInt(var1 - var0);
   }

   public static int e(int var0) {
      int var1;
      for(var1 = 0; var1 == 0; var1 = a.nextInt() % var0) {
         ;
      }

      return var1;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      return f((var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3));
   }

   public static int f(int var0) {
      if(var0 <= 0) {
         return 0;
      } else {
         int var1 = (var0 + 1) / 2;

         int var2;
         do {
            var2 = var1;
            var1 = var1 / 2 + var0 / (var1 * 2);
         } while(Math.abs(var2 - var1) > 1);

         return var1;
      }
   }

   public static int c(int var0, int var1) {
      var1 = 1;

      for(int var2 = 0; var2 < 2; ++var2) {
         var1 *= var0;
      }

      return var1;
   }

   public static int g(int var0) {
      return var0 > 0?var0:-var0;
   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3;
   }

   public static void b(String var0) {}

   public static void out(String var0) {}

   public static String[] a(String var0, String var1, int var2) {
      int var3;
      String[] var4;
      if((var3 = var0.indexOf(var1)) >= 0) {
         var4 = a(var0.substring(var3 + var1.length()), var1, var2 + 1);
      } else {
         var4 = new String[var2 + 1];
         var3 = var0.length();
      }

      var4[var2] = var0.substring(0, var3);
      return var4;
   }

   public static String a(long var0) {
      String var2;
      long var4;
      String var6;
      if(var0 >= 1000000000L) {
         var2 = mResources.bc;
         var4 = var0 % 1000000000L / 100000000L;
         var0 /= 1000000000L;
         var6 = String.valueOf(var0);
         if(var4 > 0L) {
            var6 = var6 + "," + var4 + var2;
         } else {
            var6 = var6 + var2;
         }
      } else if(var0 >= 1000000L) {
         var2 = mResources.bd;
         var4 = var0 % 1000000L / 100000L;
         var0 /= 1000000L;
         var6 = String.valueOf(var0);
         if(var4 > 0L) {
            var6 = var6 + "," + var4 + var2;
         } else {
            var6 = var6 + var2;
         }
      } else {
         var6 = String.valueOf(var0);
      }

      return var6;
   }

   public static String b(long var0) {
      String var2;
      long var4;
      String var6;
      if(var0 >= 1000000000L) {
         var2 = mResources.bc;
         var4 = var0 % 1000000000L / 10000000L;
         var0 /= 1000000000L;
         var6 = String.valueOf(var0);
         if(var4 >= 10L) {
            if(var4 % 10L == 0L) {
               var4 /= 10L;
            }

            var6 = var6 + "," + var4 + var2;
         } else if(var4 > 0L) {
            var6 = var6 + ",0" + var4 + var2;
         } else {
            var6 = var6 + var2;
         }
      } else if(var0 >= 1000000L) {
         var2 = mResources.bd;
         var4 = var0 % 1000000L / 10000L;
         var0 /= 1000000L;
         var6 = String.valueOf(var0);
         if(var4 >= 10L) {
            if(var4 % 10L == 0L) {
               var4 /= 10L;
            }

            var6 = var6 + "," + var4 + var2;
         } else if(var4 > 0L) {
            var6 = var6 + ",0" + var4 + var2;
         } else {
            var6 = var6 + var2;
         }
      } else if(var0 >= 10000L) {
         var2 = "k";
         var4 = var0 % 1000L / 10L;
         var0 /= 1000L;
         var6 = String.valueOf(var0);
         if(var4 >= 10L) {
            if(var4 % 10L == 0L) {
               var4 /= 10L;
            }

            var6 = var6 + "," + var4 + var2;
         } else if(var4 > 0L) {
            var6 = var6 + ",0" + var4 + var2;
         } else {
            var6 = var6 + var2;
         }
      } else {
         var6 = String.valueOf(var0);
      }

      return var6;
   }
}
