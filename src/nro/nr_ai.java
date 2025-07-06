package nro;

import java.io.IOException;
import main.GameCanvas;
import nro.Mob;
import nro.Char;
import nro.nr_ak;
import nro.nr_al;
import nro.nr_ao;
import nro.nr_ap;
import nro.ServerEffect;
import nro.nr_as;
import nro.Rms;
import nro.mResources;
import nro.mScreen;
import nro.nr_be;
import nro.InfoDlg;
import nro.Session_ME;
import nro.nr_bo;
import nro.Service;
import nro.nr_by;
import nro.nr_ch;
import nro.nr_cm;
import nro.nr_cs;
import nro.nr_d;
import nro.PetFollow;
import nro.Npc;
import nro.ItemTemplates;
import nro.Res;
import nro.Effect;
import nro.ItemOption;
import nro.nr_dy;
import nro.EffecMn;
import nro.MyVector;
import nro.mGraphics;
import nro.nr_ej;
import nro.nr_el;
import nro.Panel;
import nro.Item;
import nro.Main;
import nro.GameScr;
import nro.nr_u;
import nro.nr_x;
import nro.Message;

public class nr_ai {

   int a;
   int b;
   int c;
   int d;
   int e;
   int f;
   int g;
   int h;
   int i;
   int j;
   float k;
   long l;
   long m;
   boolean n;
   int[] o;
   int[] p;


   public nr_ai(int var1, int var2, int var3, int var4, int var5) {
      this.i = 0;
      this.j = 16711680;
      this.l = 0L;
      this.m = 150L;
      this.n = true;
      this.o = new int[2];
      this.p = new int[2];
      this.g = var2;
      this.d = var1;
      this.k = 1.0F;
      this.c = var3;
      this.h = var4;
      this.a = GameCanvas.z;
      this.b = GameCanvas.A;
      this.l = System.currentTimeMillis();

      for(var3 = 0; var3 < 2; ++var3) {
         this.o[var3] = var1;
         this.p[var3] = var2;
      }

      this.j = var5;
   }

   public static void a(mGraphics var0, int var1, int var2, int var3) {
      var0.a(var3);
      var0.d(var1, var2, 1, 2);
   }

   public nr_ai() {}

   public static void a(Message var0) {
      try {
         int var1;
         short var2;
         short var3;
         byte var4;
         short var5;
         short var6;
         int var30;
         Message var71;
         byte var72;
         short var78;
         Npc var117;
         byte var118;
         byte var119;
         int var121;
         byte var125;
         String var128;
         short var129;
         Char var131;
         int var133;
         int var134;
         String var139;
         int var145;
         byte var153;
         int var162;
         switch(var0.command) {
         case -128:
            var71 = var0;

            try {
               var72 = var71.reader().readByte();
               Char var165;
               if((var162 = var71.reader().readInt()) == Char.myCharz().charID) {
                  var165 = Char.myCharz();
               } else {
                  var165 = GameScr.findCharInMap(var162);
               }

               short var170;
               if(var72 == 0) {
                  var170 = var71.reader().readShort();
                  byte var168 = var71.reader().readByte();
                  byte var169 = var71.reader().readByte();
                  var78 = var71.reader().readShort();
                  byte var171 = var71.reader().readByte();
                  if(var165 != null) {
                     var165.a(new Effect(var170, var165, var168, var169, var78, var171));
                  }
                  break;
               }

               if(var72 == 1) {
                  var170 = var71.reader().readShort();
                  if(var165 != null) {
                     var165.b((int)0, (int)var170);
                  }
                  break;
               }

               if(var72 == 2) {
                  if(var165 != null) {
                     var165.b((int)-1, (int)0);
                  }
                  break;
               }
            } catch (Exception var112) {
               var112.printStackTrace();
            }

            return;
         case -127:
            b(var0);
            return;
         case -126:
            var4 = var0.reader().readByte();
            Res.out("type quay= " + var4);
            if(var4 == 1) {
               var0.reader().readByte();
               var128 = var0.reader().readUTF();
               var139 = var0.reader().readUTF();
               GameScr.gI().b(var128, var139);
            }

            if(var4 == 0) {
               GameScr.gI().b(var0.reader().readUTF());
               return;
            }
            break;
         case -125:
            nr_cm.b().b = false;
            String var154 = var0.reader().readUTF();
            Res.out("titile= " + var154);
            var4 = var0.reader().readByte();
            nr_el.a().a(var4, var154);

            for(var133 = 0; var133 < var4; ++var133) {
               nr_el.a().a[var133].i = var0.reader().readUTF();
               if((var118 = var0.reader().readByte()) == 0) {
                  nr_el.a().a[var133].c(1);
               }

               if(var118 == 1) {
                  nr_el.a().a[var133].c(0);
               }

               if(var118 == 2) {
                  nr_el.a().a[var133].c(2);
               }
            }

            return;
         case -124:
            var118 = var0.reader().readByte();
            if((var119 = var0.reader().readByte()) == 0) {
               if(var118 == 2) {
                  if((var121 = var0.reader().readInt()) == Char.myCharz().charID) {
                     Char.myCharz().R();
                  } else if(GameScr.findCharInMap(var121) != null) {
                     GameScr.findCharInMap(var121).R();
                  }
               }

               var121 = var0.reader().readUnsignedByte();
               var134 = var0.reader().readInt();
               Res.out("playerID= " + var134 + " skillID= " + var121);
               if(var121 == 32) {
                  if(var118 == 1) {
                     var133 = var0.reader().readInt();
                     if(var134 == Char.myCharz().charID) {
                        Char.myCharz().cE = var121;
                        GameScr.findCharInMap(var133).b(Char.myCharz());
                     } else if(GameScr.findCharInMap(var134) != null && var133 != Char.myCharz().charID) {
                        GameScr.findCharInMap(var134).cE = var121;
                        GameScr.findCharInMap(var133).b(GameScr.findCharInMap(var134));
                     } else if(GameScr.findCharInMap(var134) != null && var133 == Char.myCharz().charID) {
                        GameScr.findCharInMap(var134).cE = var121;
                        Char.myCharz().b(GameScr.findCharInMap(var134));
                     }
                  } else if(var134 == Char.myCharz().charID) {
                     Char.myCharz().O();
                  } else if(GameScr.findCharInMap(var134) != null) {
                     GameScr.findCharInMap(var134).O();
                  }
               }

               if(var121 == 33) {
                  if(var118 == 1) {
                     if(var134 == Char.myCharz().charID) {
                        Char.myCharz().cG = true;
                     } else if(GameScr.findCharInMap(var134) != null) {
                        GameScr.findCharInMap(var134).cG = true;
                     }
                  } else if(var134 == Char.myCharz().charID) {
                     Char.myCharz().P();
                  } else if(GameScr.findCharInMap(var134) != null) {
                     GameScr.findCharInMap(var134).P();
                  }
               }

               if(var121 == 39) {
                  if(var118 == 1) {
                     if(var134 == Char.myCharz().charID) {
                        Char.myCharz().cJ = true;
                     } else if(GameScr.findCharInMap(var134) != null) {
                        GameScr.findCharInMap(var134).cJ = true;
                     }
                  } else if(var134 == Char.myCharz().charID) {
                     Char.myCharz().S();
                  } else if(GameScr.findCharInMap(var134) != null) {
                     GameScr.findCharInMap(var134).S();
                  }
               }

               if(var121 == 40) {
                  if(var118 == 1) {
                     if(var134 == Char.myCharz().charID) {
                        Char.myCharz().cK = true;
                     } else if(GameScr.findCharInMap(var134) != null) {
                        GameScr.findCharInMap(var134).cK = true;
                     }
                  } else if(var134 == Char.myCharz().charID) {
                     Char.myCharz().Q();
                  } else if(GameScr.findCharInMap(var134) != null) {
                     GameScr.findCharInMap(var134).Q();
                  }
               }

               if(var121 == 41) {
                  if(var118 == 1) {
                     if(var134 == Char.myCharz().charID) {
                        Char.myCharz().cM = true;
                     } else if(GameScr.findCharInMap(var134) != null) {
                        GameScr.findCharInMap(var134).cM = true;
                     }
                  } else if(var134 == Char.myCharz().charID) {
                     Char.myCharz().U();
                  } else if(GameScr.findCharInMap(var134) != null) {
                     GameScr.findCharInMap(var134).U();
                  }
               }

               if(var121 == 42) {
                  if(var118 == 1) {
                     if(var134 == Char.myCharz().charID) {
                        Char.myCharz().cN = true;
                     }
                  } else if(var134 == Char.myCharz().charID) {
                     Char.myCharz().cN = false;
                     Res.out("tra ve huy chieu 2");
                  }
               }
            }

            if(var119 == 1) {
               var121 = var0.reader().readUnsignedByte();
               var4 = var0.reader().readByte();
               Res.out("modbHoldID= " + var4 + " skillID= " + var121 + "eff ID= " + var118);
               if(var121 == 32) {
                  if(var118 == 1) {
                     if((var133 = var0.reader().readInt()) == Char.myCharz().charID) {
                        GameScr.findMobInMap(var4).j = var121;
                        Char.myCharz().a(GameScr.findMobInMap(var4));
                     } else if(GameScr.findCharInMap(var133) != null) {
                        GameScr.findMobInMap(var4).j = var121;
                        GameScr.findCharInMap(var133).a(GameScr.findMobInMap(var4));
                     }
                  } else {
                     GameScr.findMobInMap(var4).r();
                  }
               }

               if(var121 == 40) {
                  if(var118 == 1) {
                     GameScr.findMobInMap(var4).W = true;
                  } else {
                     GameScr.findMobInMap(var4).s();
                  }
               }

               if(var121 == 41) {
                  if(var118 == 1) {
                     GameScr.findMobInMap(var4).X = true;
                     return;
                  }

                  GameScr.findMobInMap(var4).t();
                  return;
               }
            }
            break;
         case -123:
            if(GameScr.findCharInMap(var1 = var0.reader().readInt()) != null) {
               GameScr.findCharInMap(var1).cO = var0.reader().readByte();
               return;
            }
            break;
         case -122:
            var117 = GameScr.a(var0.reader().readShort());
            var119 = var0.reader().readByte();
            var117.da = new int[var119];

            for(var121 = 0; var121 < var119; ++var121) {
               var117.da[var121] = var0.reader().readShort();
            }

            var117.a(var0.reader().readByte(), var0.reader().readInt());
            return;
         case -121:
            Service.logMap = Main.c() - Service.curCheckMap;
            Service.gI().sendCheckMap();
            return;
         case -120:
            Service.logController = Main.c() - Service.curCheckController;
            Service.gI().sendCheckController();
            return;
         case -119:
            Char.myCharz().w = var0.reader().readInt();
            return;
         case -117:
            GameScr.gI().bU = 0;
            GameScr.gI().bS = var0.reader().readByte();
            if(GameScr.gI().bS == 100) {
               GameScr.gI().bT = true;
            }

            if(GameScr.gI().bS == 101) {
               Npc.cZ = true;
               return;
            }
            break;
         case -116:
            GameScr.bj = var0.reader().readByte() == 1;
            return;
         case -115:
            Char.myCharz().a(var0.reader().readUTF(), var0.reader().readShort(), var0.reader().readShort(), var0.reader().readShort());
            return;
         case -113:
            byte[] var150 = new byte[10];

            for(var121 = 0; var121 < 10; ++var121) {
               var150[var121] = var0.reader().readByte();
            }

            GameScr.gI().b(var150);
            GameScr.gI().a(var150);
            GameScr.gI().c(var150);
            return;
         case -111:
            Res.out("LAY HINH");
            var3 = var0.reader().readShort();
            nr_u.b = new MyVector("");

            for(var134 = 0; var134 < var3; ++var134) {
               var128 = var0.reader().readUTF();
               var119 = var0.reader().readByte();
               nr_u.b.addElement(new nr_u(var128, var119));
            }

            nr_u.a();
            nr_u.b();
            return;
         case -110:
            if((var153 = var0.reader().readByte()) == 1) {
               var1 = var0.reader().readInt();
               byte[] var151;
               if((var151 = Rms.b(String.valueOf(var1))) == null) {
                  Service.gI().sendServerData((byte)1, (int)-1, (byte[])null);
               } else {
                  Service.gI().sendServerData((byte)1, var1, var151);
               }
            }

            if(var153 == 0) {
               var1 = var0.reader().readInt();
               byte[] var152 = new byte[var2 = var0.reader().readShort()];
               var0.reader().read(var152, 0, var2);
               Rms.a(String.valueOf(var1), var152);
               return;
            }
            break;
         case -106:
            var2 = var0.reader().readShort();
            var3 = var0.reader().readShort();
            if(nr_cs.a(var2)) {
               nr_cs.c(var2).a(var3, false);
               return;
            }

            nr_cs var142 = new nr_cs(var2, var3);
            Char.bq.addElement(var142);
            return;
         case -105:
            nr_as.a().b = 0;
            nr_as.a().c = var0.reader().readShort();
            nr_as.a().d = nr_as.a().e = System.currentTimeMillis();
            nr_as.a().a = var0.reader().readByte();
            nr_as.a().b();
            return;
         case -103:
            var118 = var0.reader().readByte();
            Res.out("server gui ve actionFlag = " + var118);
            if(var118 == 0) {
               GameCanvas.panel.W.removeAllElements();
               var118 = var0.reader().readByte();

               for(int var144 = 0; var144 < var118; ++var144) {
                  Item var148 = new Item();
                  if((var129 = var0.reader().readShort()) != -1) {
                     var148.template = ItemTemplates.get(var129);
                     if((var153 = var0.reader().readByte()) != -1) {
                        var148.itemOption = new ItemOption[var153];

                        for(var145 = 0; var145 < var148.itemOption.length; ++var145) {
                           int var158 = var0.reader().readUnsignedByte();
                           int var159 = var0.reader().readUnsignedShort();
                           if(var158 != -1) {
                              var148.itemOption[var145] = new ItemOption(var158, var159);
                           }
                        }
                     }
                  }

                  GameCanvas.panel.W.addElement(var148);
               }

               GameCanvas.panel.h();
               GameCanvas.panel.show();
               return;
            }

            if(var118 == 1) {
               var1 = var0.reader().readInt();
               var119 = var0.reader().readByte();
               Res.out("---------------actionFlag1:  " + var1 + " : " + var119);
               if(var1 == Char.myCharz().charID) {
                  Char.myCharz().bx = var119;
               } else if(GameScr.findCharInMap(var1) != null) {
                  GameScr.findCharInMap(var1).bx = var119;
               }

               GameScr.gI();
               GameScr.a(var1, var119);
               return;
            }

            if(var118 == 2) {
               var118 = var0.reader().readByte();
               var2 = var0.reader().readShort();
               nr_ej var147;
               (var147 = new nr_ej()).a = var118;
               var147.b = var2;
               GameScr.H.addElement(var147);

               for(var134 = 0; var134 < GameScr.H.size(); ++var134) {
                  nr_ej var149 = (nr_ej)GameScr.H.elementAt(var134);
                  Res.out("i: " + var134 + "  cflag: " + var149.a + "   IDimageFlag: " + var149.b);
               }

               for(var134 = 0; var134 < GameScr.D.size(); ++var134) {
                  if((var131 = (Char)GameScr.D.elementAt(var134)) != null && var131.bx == var118) {
                     var131.by = var2;
                  }
               }

               if(Char.myCharz().bx == var118) {
                  Char.myCharz().by = var2;
                  return;
               }
            }
            break;
         case -102:
            if((var118 = var0.reader().readByte()) != 0 && var118 == 1) {
               GameCanvas.loginScr.isLogin2 = false;
               Service.gI().login(Rms.c("acc"), Rms.c("pass"), "2.3.0", (byte)0);
               return;
            }
            break;
         case -101:
            GameCanvas.loginScr.isLogin2 = true;
            GameCanvas.b();
            var139 = var0.reader().readUTF();
            Rms.a("userAo" + nr_bo.m, var139);
            Service.gI().setClientType();
            Service.gI().login(var139, "", "2.3.0", (byte)1);
            return;
         case -100:
            InfoDlg.hide();
            boolean var140 = false;
            if(GameCanvas.z > 2 * Panel.WIDTH_PANEL) {
               var140 = true;
            }

            var4 = var0.reader().readByte();
            Res.out("t Indxe= " + var4);
            GameCanvas.panel.I[var4] = var0.reader().readByte();
            GameCanvas.panel.J[var4] = var0.reader().readByte();
            Res.out("max page= " + GameCanvas.panel.I[var4] + " curr page= " + GameCanvas.panel.J[var4]);
            var133 = var0.reader().readUnsignedByte();
            Char.myCharz().aI[var4] = new Item[var133];
            Panel.ao = mResources.eo;

            for(var145 = 0; var145 < var133; ++var145) {
               short var64;
               if((var64 = var0.reader().readShort()) != -1) {
                  Char.myCharz().aI[var4][var145] = new Item();
                  Char.myCharz().aI[var4][var145].template = ItemTemplates.get(var64);
                  Char.myCharz().aI[var4][var145].itemId = var0.reader().readShort();
                  Char.myCharz().aI[var4][var145].j = var0.reader().readInt();
                  Char.myCharz().aI[var4][var145].k = var0.reader().readInt();
                  Char.myCharz().aI[var4][var145].buyType = var0.reader().readByte();
                  Char.myCharz().aI[var4][var145].quantity = var0.reader().readInt();
                  Char.myCharz().aI[var4][var145].isMe = var0.reader().readByte();
                  byte var65;
                  if((var65 = var0.reader().readByte()) != -1) {
                     Char.myCharz().aI[var4][var145].itemOption = new ItemOption[var65];

                     for(int var66 = 0; var66 < Char.myCharz().aI[var4][var145].itemOption.length; ++var66) {
                        int var67 = var0.reader().readUnsignedByte();
                        int var68 = var0.reader().readUnsignedShort();
                        if(var67 != -1) {
                           Char.myCharz().aI[var4][var145].itemOption[var66] = new ItemOption(var67, var68);
                           Char.myCharz().aI[var4][var145].compare = GameCanvas.panel.getCompare(Char.myCharz().aI[var4][var145]);
                        }
                     }
                  }

                  if(var0.reader().readByte() == 1) {
                     short var160 = var0.reader().readShort();
                     short var161 = var0.reader().readShort();
                     short var69 = var0.reader().readShort();
                     short var70 = var0.reader().readShort();
                     Char.myCharz().aI[var4][var145].setPartTemp(var160, var161, var69, var70);
                  }
               }
            }

            if(var140) {
               GameCanvas.panel2.e();
            }

            GameCanvas.panel.y();
            GameCanvas.panel.g = GameCanvas.panel.f = 0;
         case -89:
            GameCanvas.ah = var0.reader().readByte() == 1;
            return;
         case 31:
            var1 = var0.reader().readInt();
            if(var0.reader().readByte() != 1) {
               if(var1 == Char.myCharz().charID) {
                  Char.myCharz().petFollow.a();
                  Char.myCharz().petFollow = null;
                  return;
               }

               Char var137;
               (var137 = GameScr.findCharInMap(var1)).petFollow.a();
               var137.petFollow = null;
               return;
            }

            var2 = var0.reader().readShort();
            var125 = -1;
            int[] var146 = null;
            var5 = 0;
            var6 = 0;

            try {
               if((var125 = var0.reader().readByte()) > 0) {
                  byte var138;
                  var146 = new int[var138 = var0.reader().readByte()];

                  for(int var143 = 0; var143 < var138; ++var143) {
                     var146[var143] = var0.reader().readByte();
                  }

                  var5 = var0.reader().readShort();
                  var6 = var0.reader().readShort();
               }
            } catch (Exception var110) {
               ;
            }

            if(var1 == Char.myCharz().charID) {
               Char.myCharz().petFollow = new PetFollow();
               Char.myCharz().petFollow.a = var2;
               if(var125 > 0) {
                  Char.myCharz().petFollow.a(var125, var146, var5, var6);
                  return;
               }
            } else {
               Char var141;
               (var141 = GameScr.findCharInMap(var1)).petFollow = new PetFollow();
               var141.petFollow.a = var2;
               if(var125 > 0) {
                  var141.petFollow.a(var125, var146, var5, var6);
                  return;
               }
            }
            break;
         case 42:
            GameCanvas.g();
            nr_x.c = false;
            Char.bH = false;
            var119 = var0.reader().readByte();
            if(GameCanvas.I == null) {
               GameCanvas.I = new nr_be(var119);
            }

            GameCanvas.I.b();
            return;
         case 48:
            nr_bo.m = var0.reader().readByte();
            GameCanvas.a((mScreen)GameCanvas.af);
            Session_ME.gI().e();
            GameCanvas.g();
            nr_bo.k = true;
            return;
         case 51:
            nr_ak var135 = (nr_ak)GameScr.findCharInMap(var0.reader().readInt());
            byte var136 = var0.reader().readByte();
            short var7 = var0.reader().readShort();
            short var8 = var0.reader().readShort();
            Char[] var132 = new Char[var118 = var0.reader().readByte()];
            int[] var130 = new int[var118];

            for(var134 = 0; var134 < var118; ++var134) {
               int var9 = var0.reader().readInt();
               Res.out("char ID=" + var9);
               var132[var134] = null;
               if(var9 != Char.myCharz().charID) {
                  var132[var134] = GameScr.findCharInMap(var9);
               } else {
                  var132[var134] = Char.myCharz();
               }

               var130[var134] = var0.reader().readInt();
            }

            var135.a(var136, var7, var8, var132, var130);
            return;
         case 52:
            if((var125 = var0.reader().readByte()) == 1) {
               if((var134 = var0.reader().readInt()) == Char.myCharz().charID) {
                  Char.myCharz().c(true);
                  Char.myCharz().cx = var0.reader().readShort();
                  Char.myCharz().cy = var0.reader().readShort();
               } else if((var131 = GameScr.findCharInMap(var134)) != null) {
                  var131.c(true);
                  var131.cx = var0.reader().readShort();
                  var131.cy = var0.reader().readShort();
               }
            }

            if(var125 == 0) {
               if((var134 = var0.reader().readInt()) == Char.myCharz().charID) {
                  Char.myCharz().c(false);
               } else if((var131 = GameScr.findCharInMap(var134)) != null) {
                  var131.c(false);
               }
            }

            if(var125 == 2) {
               var134 = var0.reader().readInt();
               var133 = var0.reader().readInt();
               ((nr_ak)GameScr.findCharInMap(var134)).b(var133);
            }

            if(var125 == 3) {
               GameScr.bW = var0.reader().readByte();
               return;
            }
            break;
         case 93:
            var128 = Res.changeString(var0.reader().readUTF());
            GameScr.gI().a(var128);
            return;
         case 100:
            var125 = var0.reader().readByte();
            var118 = var0.reader().readByte();
            Item var127 = null;
            if(var125 == 0) {
               var127 = Char.myCharz().arrItemBody[var118];
            }

            if(var125 == 1) {
               var127 = Char.myCharz().arrItemBag[var118];
            }

            short var126;
            if((var126 = var0.reader().readShort()) != -1) {
               var127.template = ItemTemplates.get(var126);
               var127.quantity = var0.reader().readInt();
               var0.reader().readUTF();
               var0.reader().readUTF();
               if((var118 = var0.reader().readByte()) != 0) {
                  var127.itemOption = new ItemOption[var118];

                  for(var1 = 0; var1 < var127.itemOption.length; ++var1) {
                     var121 = var0.reader().readUnsignedByte();
                     var134 = var0.reader().readUnsignedShort();
                     if(var121 != -1) {
                        var127.itemOption[var1] = new ItemOption(var121, var134);
                     }
                  }

                  return;
               }
            }
            break;
         case 101:
            Res.out("big boss--------------------------------------------------");
            nr_by var123;
            if((var123 = Mob.w()) == null) {
               return;
            }

            if((var119 = var0.reader().readByte()) == 0 || var119 == 1 || var119 == 2 || var119 == 4 || var119 == 3) {
               if(var119 == 3) {
                  var123.a = var123.t = var0.reader().readShort();
                  var123.u = var0.reader().readShort();
                  var123.D();
               } else {
                  byte var155 = var0.reader().readByte();
                  Res.out("CHUONG nChar= " + var155);
                  Char[] var156 = new Char[var155];
                  int[] var157 = new int[var155];

                  for(var30 = 0; var30 < var155; ++var30) {
                     var121 = var0.reader().readInt();
                     Res.out("char ID=" + var121);
                     var156[var30] = null;
                     if(var121 != Char.myCharz().charID) {
                        var156[var30] = GameScr.findCharInMap(var121);
                     } else {
                        var156[var30] = Char.myCharz();
                     }

                     var157[var30] = var0.reader().readInt();
                  }

                  var123.a(var156, var157, var119);
               }
            }

            if(var119 == 5) {
               var123.b = true;
               var123.p = 2;
            }

            if(var119 == 6) {
               var123.C();
               var123.m = var0.reader().readShort();
               var123.n = var0.reader().readShort();
            }

            if(var119 == 7) {
               var123.a((Char[])null, (int[])null, var119);
            }

            if(var119 == 8) {
               var123.a = var123.t = var0.reader().readShort();
               var123.u = var0.reader().readShort();
               var123.p = 2;
            }

            if(var119 == 9) {
               var123.m = var123.n = var123.a = var123.t = var123.u = -1000;
               return;
            }
            break;
         case 102:
            Char[] var27;
            int[] var28;
            int var29;
            if((var125 = var0.reader().readByte()) == 0 || var125 == 1 || var125 == 2 || var125 == 6) {
               nr_d var120;
               if((var120 = Mob.x()) == null) {
                  return;
               }

               if(var125 == 6) {
                  var120.m = var120.n = var120.a = var120.b = var120.t = var120.u = -1000;
                  return;
               }

               var27 = new Char[var119 = var0.reader().readByte()];
               var28 = new int[var119];

               for(var29 = 0; var29 < var119; ++var29) {
                  var30 = var0.reader().readInt();
                  var27[var29] = null;
                  if(var30 != Char.myCharz().charID) {
                     var27[var29] = GameScr.findCharInMap(var30);
                  } else {
                     var27[var29] = Char.myCharz();
                  }

                  var28[var29] = var0.reader().readInt();
               }

               var120.a(var27, var28, var125);
            }

            if(var125 == 3 || var125 == 4 || var125 == 5 || var125 == 7) {
               nr_al var122;
               if((var122 = Mob.y()) == null) {
                  return;
               }

               if(var125 == 7) {
                  var122.m = var122.n = var122.a = var122.b = var122.t = var122.u = -1000;
                  return;
               }

               if(var125 == 3 || var125 == 4) {
                  var27 = new Char[var119 = var0.reader().readByte()];
                  var28 = new int[var119];

                  for(var29 = 0; var29 < var119; ++var29) {
                     var30 = var0.reader().readInt();
                     var27[var29] = null;
                     if(var30 != Char.myCharz().charID) {
                        var27[var29] = GameScr.findCharInMap(var30);
                     } else {
                        var27[var29] = Char.myCharz();
                     }

                     var28[var29] = var0.reader().readInt();
                  }

                  var122.a(var27, var28, var125);
               }

               if(var125 == 5) {
                  var2 = var0.reader().readShort();
                  var122.b(var2);
               }
            }

            if(var125 > 9 && var125 < 30) {
               a(var0, var125);
               return;
            }
            break;
         case 113:
            var118 = 0;
            var119 = 0;
            var121 = 0;
            var129 = 0;
            var5 = 0;
            var6 = -1;

            try {
               var118 = var0.reader().readByte();
               var119 = var0.reader().readByte();
               var121 = var0.reader().readUnsignedByte();
               var129 = var0.reader().readShort();
               var5 = var0.reader().readShort();
               var6 = var0.reader().readShort();
            } catch (Exception var108) {
               ;
            }

            EffecMn.addEff(new Effect(var121, var129, var5, var119, var118, var6));
            return;
         case 114:
            try {
               var0.reader().readUTF();
               Main.e = var0.reader().readByte();
               Main.f = var0.reader().readByte();
               return;
            } catch (Exception var109) {
               return;
            }
         case 121:
            Main.g = var0.reader().readUTF();
            var0.reader().readUTF();
            Res.out("SHOW AD public ID= " + Main.g);
            return;
         case 122:
            short var116 = var0.reader().readShort();
            Res.out("second login = " + var116);
            nr_x.k = var116;
            nr_x.m = nr_x.l = System.currentTimeMillis();
            GameCanvas.g();
            return;
         case 123:
            var1 = var0.reader().readInt();
            var2 = var0.reader().readShort();
            var3 = var0.reader().readShort();
            byte var115 = var0.reader().readByte();
            Res.out("SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= " + var2 + " y= " + var3 + "chaPos= " + var1 + "type Pos= " + var115);
            Char var124 = null;
            if(var1 == Char.myCharz().charID) {
               var124 = Char.myCharz();
            } else if(GameScr.findCharInMap(var1) != null) {
               var124 = GameScr.findCharInMap(var1);
            }

            if(var124 != null) {
               ServerEffect.a(var115 == 0?60:173, var124, 1);
               var124.a(var2, var3, var115);
               return;
            }
            break;
         case 124:
            var2 = var0.reader().readShort();
            String var114 = var0.reader().readUTF();
            Res.out("noi chuyen = " + var114 + "npc ID= " + var2);
            if((var117 = GameScr.a(var2)) != null) {
               var117.a(var114);
               return;
            }
            break;
         case 125:
            var4 = var0.reader().readByte();
            if((var1 = var0.reader().readInt()) == Char.myCharz().charID) {
               Char.myCharz().b(var4);
               return;
            }

            if(GameScr.findCharInMap(var1) != null) {
               GameScr.findCharInMap(var1).b(var4);
               return;
            }
            break;
         case 127:
            var71 = var0;

            try {
               int var75;
               int var76;
               nr_dy var77;
               short var164;
               if((var72 = var71.reader().readByte()) == 0) {
                  nr_ao.a();
                  MyVector var163 = new MyVector("");
                  var164 = var71.reader().readShort();
                  var75 = 0;

                  for(var76 = 0; var76 < var164; ++var76) {
                     var77 = new nr_dy();
                     var78 = var71.reader().readShort();
                     int var79 = var76 + 1;
                     short var80 = var71.reader().readShort();
                     byte var81 = var71.reader().readByte();
                     byte var82 = var71.reader().readByte();
                     byte var83 = var71.reader().readByte();
                     short var84 = -1;
                     Char var85 = null;
                     byte var86;
                     if((var86 = var71.reader().readByte()) == 0) {
                        var84 = var71.reader().readShort();
                     } else {
                        short var87 = var71.reader().readShort();
                        short var88 = var71.reader().readShort();
                        short var89 = var71.reader().readShort();
                        short var90 = var71.reader().readShort();
                        Char var101;
                        (var101 = new Char()).head = var87;
                        var101.body = var88;
                        var101.leg = var89;
                        var101.bag = var90;
                        var85 = var101;
                     }

                     String var172 = var71.reader().readUTF();
                     String var173 = var71.reader().readUTF();
                     byte var174 = var71.reader().readByte();
                     byte var175 = var71.reader().readByte();
                     byte var91 = var71.reader().readByte();
                     ItemOption[] var92 = null;
                     if(var91 != 0) {
                        var92 = new ItemOption[var91];

                        for(int var93 = 0; var93 < var92.length; ++var93) {
                           int var94 = var71.reader().readUnsignedByte();
                           int var95 = var71.reader().readUnsignedShort();
                           byte var96 = var71.reader().readByte();
                           if(var94 != -1) {
                              var92[var93] = new ItemOption(var94, var95);
                              var92[var93].active = var96;
                           }
                        }
                     }

                     var77.e = var78;
                     var77.f = var79;
                     var77.g = var80;
                     var77.a = var81;
                     var77.d = var86;
                     if(var84 != -1) {
                        var77.m = new Mob();
                        var77.m.C = var84;
                     }

                     var77.h = var172;
                     var77.i = var173;
                     var77.l = var85;
                     var77.n = var92;
                     var77.a();
                     var77.a(var174);
                     var77.b(var175);
                     var77.a(var82, var83);
                     var163.addElement(var77);
                     if(var174 > 0) {
                        ++var75;
                     }
                  }

                  nr_ao.a().a(var163, var75, var164);
                  break;
               }

               short var73;
               byte var74;
               if(var72 == 1) {
                  var73 = var71.reader().readShort();
                  var74 = var71.reader().readByte();
                  if(nr_dy.a(nr_ao.f, var73) != null) {
                     nr_dy.a(nr_ao.f, var73).b(var74);
                  }

                  nr_ao.e();
                  break;
               }

               if(var72 == 2) {
                  var73 = var71.reader().readShort();
                  var74 = var71.reader().readByte();
                  var75 = 0;

                  for(var76 = 0; var76 < nr_ao.f.size(); ++var76) {
                     if((var77 = (nr_dy)nr_ao.f.elementAt(var76)) != null) {
                        if(var77.e == var73) {
                           var77.a(var74);
                        }

                        if(var77.j > 0) {
                           ++var75;
                        }
                     }
                  }

                  nr_ao.a(var75, nr_ao.f.size());
                  if(nr_dy.a(nr_ao.g, var73) != null) {
                     nr_dy.a(nr_ao.g, var73).a(var74);
                     break;
                  }
               } else if(var72 == 3) {
                  var73 = var71.reader().readShort();
                  var74 = var71.reader().readByte();
                  byte var166 = var71.reader().readByte();
                  if(nr_dy.a(nr_ao.f, var73) != null) {
                     nr_dy.a(nr_ao.f, var73).a(var74, var166);
                  }

                  if(nr_dy.a(nr_ao.g, var73) != null) {
                     nr_dy.a(nr_ao.g, var73).a(var74, var166);
                     break;
                  }
               } else if(var72 == 4) {
                  var162 = var71.reader().readInt();
                  var164 = var71.reader().readShort();
                  Char var167;
                  if(var162 == Char.myCharz().charID) {
                     var167 = Char.myCharz();
                  } else {
                     var167 = GameScr.findCharInMap(var162);
                  }

                  if(var167 != null) {
                     var167.cR = var164;
                     var167.cU = var71.reader().readByte();
                     break;
                  }
               }
            } catch (Exception var111) {
               var111.printStackTrace();
            }

            return;
         default:
            return;
         }
      } catch (Exception var113) {
         ;
      }

   }

   private static void b(Message var0) {
      try {
         byte var1;
         short[] var2;
         int var3;
         if((var1 = var0.reader().readByte()) == 0) {
            var2 = new short[var1 = var0.reader().readByte()];

            for(var3 = 0; var3 < var1; ++var3) {
               var2[var3] = var0.reader().readShort();
            }

            byte var7 = var0.reader().readByte();
            int var6 = var0.reader().readInt();
            short var5 = var0.reader().readShort();
            nr_ap.a().a(var2, var7, var6, var5);
            return;
         }

         if(var1 == 1) {
            var2 = new short[var1 = var0.reader().readByte()];

            for(var3 = 0; var3 < var1; ++var3) {
               var2[var3] = var0.reader().readShort();
            }

            nr_ap.a().a(var2);
            return;
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   private static void a(Message var0, int var1) {
      try {
         nr_ch var2;
         if((var2 = Mob.a(var0.reader().readByte())) == null) {
            return;
         }

         if(var1 == 10) {
            short var3 = var0.reader().readShort();
            short var4 = var0.reader().readShort();
            var2.a(var3, var4);
         }

         if(var1 >= 11 && var1 <= 20) {
            byte var9;
            Char[] var10 = new Char[var9 = var0.reader().readByte()];
            int[] var5 = new int[var9];

            for(int var6 = 0; var6 < var9; ++var6) {
               int var7 = var0.reader().readInt();
               var10[var6] = null;
               if(var7 != Char.myCharz().charID) {
                  var10[var6] = GameScr.findCharInMap(var7);
               } else {
                  var10[var6] = Char.myCharz();
               }

               var5[var6] = var0.reader().readInt();
            }

            byte var11 = var0.reader().readByte();
            var2.a(var10, var5, (byte)(var1 - 10), var11);
         }

         if(var1 == 21) {
            var2.a = var0.reader().readShort();
            var2.b = var0.reader().readShort();
            var2.C();
         }

         if(var1 == 23) {
            var2.D();
            return;
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }
}
