package nro;

import java.io.IOException;
import main.GameMidlet;
import main.GameCanvas;
import nro.Session_ME;
import nro.Message;

final class nr_s implements Runnable {

   private Session_ME a;


   nr_s(Session_ME var1) {
      this.a = var1;
   }

   public final void run() {
      while(true) {
         try {
            if(this.a.d()) {
               nr_s var1 = this;
               byte var2 = this.a.a.readByte();
               if(this.a.i) {
                  var2 = Session_ME.a(this.a, var2);
               }

               int var3;
               int var5;
               int var6;
               int var7;
               byte[] var11;
               Message var10000;
               if(var2 != -32 && var2 != -66 && var2 != 11 && var2 != -67 && var2 != -74 && var2 != -87 && var2 != 66) {
                  if(this.a.i) {
                     byte var12 = this.a.a.readByte();
                     byte var13 = this.a.a.readByte();
                     var3 = (Session_ME.a(this.a, var12) & 255) << 8 | Session_ME.a(this.a, var13) & 255;
                  } else {
                     var3 = this.a.a.readUnsignedShort();
                  }

                  var11 = new byte[var3];
                  var5 = 0;
                  var6 = 0;

                  while(var5 != -1 && var6 < var3) {
                     if((var5 = var1.a.a.read(var11, var6, var3 - var6)) > 0) {
                        var6 += var5;
                        var1.a.h += var6 + 5;
                        var7 = Session_ME.gI().h + Session_ME.gI().g;
                        var1.a.l = var7 / 1024 + "." + var7 % 1024 / 102 + "Kb";
                     }
                  }

                  if(var1.a.i) {
                     for(var7 = 0; var7 < var11.length; ++var7) {
                        var11[var7] = Session_ME.a(var1.a, var11[var7]);
                     }
                  }

                  var10000 = new Message(var2, var11);
               } else {
                  var1 = this;
                  var3 = Session_ME.a(this.a, this.a.a.readByte()) + 128;
                  int var4 = Session_ME.a(this.a, this.a.a.readByte()) + 128;
                  var11 = new byte[var3 += (Session_ME.a(this.a, this.a.a.readByte()) + 128 << 8) + var4 << 8];
                  var5 = 0;
                  var6 = 0;

                  while(var5 != -1 && var6 < var3) {
                     if((var5 = var1.a.a.read(var11, var6, var3 - var6)) > 0) {
                        var6 += var5;
                        var1.a.h += var6 + 5;
                        var7 = Session_ME.gI().h + Session_ME.gI().g;
                        var1.a.l = var7 / 1024 + "." + var7 % 1024 / 102 + "Kb";
                     }
                  }

                  if(var1.a.i) {
                     for(var7 = 0; var7 < var11.length; ++var7) {
                        var11[var7] = Session_ME.a(var1.a, var11[var7]);
                     }
                  }

                  var10000 = new Message(var2, var11);
               }

               Message var10 = var10000;
               if(var10000 != null) {
                  try {
                     if(var10.command == -27) {
                        this.a(var10);
                        continue;
                     }

                     this.a.b.onMessage(var10);
                  } catch (Exception var8) {
                     var8.printStackTrace();
                  }
                  continue;
               }
            }
         } catch (Exception var9) {
            ;
         }

         if(this.a.d) {
            if(this.a.b != null) {
               if(System.currentTimeMillis() - this.a.k > 500L) {
                  this.a.b.onDisconnected(this.a.isMainSession);
               } else {
                  this.a.b.onConnectionFail(this.a.isMainSession);
               }
            }

            if(Session_ME.a(this.a) != null) {
               Session_ME.c(this.a);
            }
         }

         return;
      }
   }

   private void a(Message var1) throws IOException {
      byte var2 = var1.reader().readByte();
      this.a.j = new byte[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.a.j[var3] = var1.reader().readByte();
      }

      for(var3 = 0; var3 < this.a.j.length - 1; ++var3) {
         this.a.j[var3 + 1] ^= this.a.j[var3];
      }

      this.a.i = true;
      GameMidlet.IP2 = var1.reader().readUTF();
      GameMidlet.PORT2 = var1.reader().readInt();
      GameMidlet.f = var1.reader().readByte() != 0;
      System.out.println("is connectt 2= " + GameMidlet.f);
      if(this.a.isMainSession && GameMidlet.f) {
         GameCanvas.c();
      }

   }
}
