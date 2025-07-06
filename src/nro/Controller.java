package nro;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;

public final class Controller implements IMessageHandler {

    private static Controller me;
    private Message messWait;
    private float f;
    public static boolean isLoadingData;
    public static boolean b;
    public static MyHashTable c = new MyHashTable("frame new boss");

    public static Controller gI() {
        if (me == null) {
            me = new Controller();
        }

        return me;
    }

    public final void onConnectOK(boolean var1) {
        Service var4;
        if (var1) {
            System.out.println("connect 1 ok");
            GameMidlet.IP = nr_bo.b[nr_bo.m];
            GameMidlet.PORT = nr_bo.e[nr_bo.m];
            nr_bo.s = 2;
            Rms.saveRMSInt("svselect", nr_bo.m);
            String var5 = GameMidlet.IP + ":" + GameMidlet.PORT;
            Rms.a("NRIPlink", var5.getBytes());
            Service.gI().setClientType();
            var4 = Service.gI();
        } else {
            System.out.println("connect 2 ok");
            var4 = Service.gI();
            Res.out("SET CLIENT TYPE");
            if (Rms.loadRmsInt("clienttype") != -1) {
                Main.typeClient = Rms.loadRmsInt("clienttype");
            }

            try {
                Res.out("setType");
                Message var2;
                (var2 = Service.messageNotLogin((byte) 2)).writer().writeByte(Main.typeClient);
                var2.writer().writeByte(mGraphics.zoomLevel);
                Res.out("gui zoomlevel = " + mGraphics.zoomLevel);
                var2.writer().writeBoolean(false);
                var2.writer().writeInt(GameCanvas.z);
                var2.writer().writeInt(GameCanvas.A);
                var2.writer().writeBoolean(TField.isQwerty);
                var2.writer().writeBoolean(GameCanvas.isTouch);
                var2.writer().writeUTF(System.getProperty("microedition.platform") + "|" + "2.3.0");
                var4.session = Session_ME.gI2();
                var4.session.sendMessage(var2);
                var4.session = Session_ME.gI();
                var2.cleanup();
            } catch (IOException var3) {
                var3.printStackTrace();
            }

            var4 = Service.gI();
        }
    }

    public final void onConnectionFail(boolean var1) {
        if (!var1) {
            if (GameCanvas.currentScreen == GameCanvas.af && nr_bo.r && !Service.reciveFromMainSession) {
                GameCanvas.af.h();
            }

            if (GameCanvas.currentScreen != GameCanvas.loginScr || Service.reciveFromMainSession) {
                return;
            }
        }

        Main.a(var1);
    }

    public final void onDisconnected(boolean var1) {
        if (!var1) {
            System.out.println("connect 2 fail");
            if (GameCanvas.currentScreen == GameCanvas.af && !Service.reciveFromMainSession) {
                GameCanvas.af.h();
            }

            if (GameCanvas.currentScreen == GameCanvas.loginScr && !Service.reciveFromMainSession) {
                Main.b(var1);
                return;
            }
        } else {
            System.out.println("connect 1 fail");
            Main.b(var1);
        }

    }

    private static void b(Message var0) {
        try {
            int var1 = var0.reader().readUnsignedByte();
            Item var4 = GameScr.P.arrItemBody[var1];
            var0.reader().readInt();
            var0.reader().readByte();
            var4.options = new MyVector("item.options");

            try {
                while (true) {
                    var4.options.addElement(new ItemOption(var0.reader().readUnsignedByte(), var0.reader().readUnsignedShort()));
                }
            } catch (Exception var2) {
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public final void onMessage(Message msg) {
        Main.b();
        GameCanvas.S.removeAllElements();

        try {
            try {
                byte var2;
                int var3;
                int var6;
                int var8;
                int var9;
                int var11;
                int var12;
                int var215;
                short var220;
                byte var221;
                int var224;
                Npc var248;
                byte var253;
                Mob var256;
                Char var260;
                short var268;
                Char var10000;
                byte var273;
                String var274;
                int var275;
                short var278;
                Res.out("cmd= " + msg.command);
                nr_ai.a(msg);
                String[] var4;
                byte var5;
                short var7;
                byte var10;
                int var64;
                int var65;
                byte var66;
                byte var68;
                int var69;
                byte var71;
                int var72;
                short var74;
                Char var89;
                int var90;
                MyVector var92;
                short var108;
                short var112;
                short var120;
                String var121;
                Npc var123;
                int var130;
                int var131;
                boolean var217;
                byte var219;
                int var222;
                nr_aj var226;
                int var227;
                nr_e var229;
                short var230;
                String var232;
                byte var233;
                short var235;
                short var238;
                int var240;
                byte var241;
                nr_r var242;
                Char var243;
                Char var245;
                Char var250;
                String var251;
                short var254;
                Char var255;
                byte var257;
                short var259;
                byte var290;
                int var315;
                int var326;
                ItemMap var329;
                Char[] var340;
                label5279:
                switch (msg.command) {
                    case -112:
                        if ((var257 = msg.reader().readByte()) == 0) {
                            GameScr.findMobInMap(msg.reader().readByte()).a();
                        }

                        if (var257 == 1) {
                            GameScr.findMobInMap(msg.reader().readByte()).a(msg.reader().readShort());
                        }
                    case -111:
                    case -110:
                    case -109:
                    case -108:
                    case -106:
                    case -105:
                    case -104:
                    case -103:
                    case -102:
                    case -101:
                    case -100:
                    case -89:
                    case -78:
                    case -75:
                    case -73:
                    case -72:
                    case -71:
                    case -58:
                    case -56:
                    case -55:
                    case -54:
                    case -49:
                    case -48:
                    case -40:
                    case -39:
                    case -38:
                    case -33:
                    case -27:
                    case -23:
                    case -17:
                    case -16:
                    case -15:
                    case -13:
                    case -12:
                    case -11:
                    case -10:
                    case -9:
                    case -8:
                    case -7:
                    case -6:
                    case -5:
                    case -3:
                    case -2:
                    case -1:
                    case 0:
                    case 3:
                    case 4:
                    case 5:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 22:
                    case 23:
                    case 25:
                    case 26:
                    case 28:
                    case 30:
                    case 31:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 42:
                    case 44:
                    case 45:
                    case 48:
                    case 49:
                    case 51:
                    case 52:
                    case 53:
                    case 55:
                    case 59:
                    case 60:
                    case 61:
                    case 67:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 89:
                    case 91:
                    case 93:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    default:
                        break;
                    case -107:
                        if ((var5 = msg.reader().readByte()) == 0) {
                            Char.myCharz().havePet = false;
                        }

                        if (var5 == 1) {
                            Char.myCharz().havePet = true;
                        }

                        if (var5 == 2) {
                            InfoDlg.hide();
                            Char.myPetz().head = msg.reader().readShort();
                            Char.myPetz().setDefaultPart();
                            var215 = msg.reader().readUnsignedByte();
                            Char.myPetz().arrItemBody = new Item[var215];

                            for (var3 = 0; var3 < var215; ++var3) {
                                var220 = msg.reader().readShort();
                                Res.out("template id= " + var220);
                                if (var220 != -1) {
                                    Res.out("1");
                                    Char.myPetz().arrItemBody[var3] = new Item();
                                    Char.myPetz().arrItemBody[var3].template = ItemTemplates.get(var220);
                                    var5 = Char.myPetz().arrItemBody[var3].template.type;
                                    Char.myPetz().arrItemBody[var3].quantity = msg.reader().readInt();
                                    Res.out("3");
                                    Char.myPetz();
                                    msg.reader().readUTF();
                                    Char.myPetz();
                                    msg.reader().readUTF();
                                    var6 = msg.reader().readUnsignedByte();
                                    Res.out("option size= " + var6);
                                    if (var6 != 0) {
                                        Char.myPetz().arrItemBody[var3].itemOption = new ItemOption[var6];

                                        for (var227 = 0; var227 < Char.myPetz().arrItemBody[var3].itemOption.length; ++var227) {
                                            var8 = msg.reader().readUnsignedByte();
                                            var9 = msg.reader().readUnsignedShort();
                                            if (var8 != -1) {
                                                Char.myPetz().arrItemBody[var3].itemOption[var227] = new ItemOption(var8, var9);
                                            }
                                        }
                                    }

                                    if (var5 == 0) {
                                        Char.myPetz().body = Char.myPetz().arrItemBody[var3].template.part;
                                    } else if (var5 == 1) {
                                        Char.myPetz().leg = Char.myPetz().arrItemBody[var3].template.part;
                                    }
                                }
                            }

                            Char.myPetz().cHP = msg.readInt3Byte();
                            Char.myPetz().cHPFull = msg.readInt3Byte();
                            Char.myPetz().cMP = msg.readInt3Byte();
                            Char.myPetz().cMPFull = msg.readInt3Byte();
                            Char.myPetz().cDamFull = msg.readInt3Byte();
                            Char.myPetz().cName = msg.reader().readUTF();
                            Char.myPetz().currStrLevel = msg.reader().readUTF();
                            Char.myPetz().cPower = msg.reader().readLong();
                            Char.myPetz().cTiemNang = msg.reader().readLong();
                            Char.myPetz().petStatus = msg.reader().readByte();
                            Char.myPetz().cStamina = msg.reader().readShort();
                            Char.myPetz().cMaxStamina = msg.reader().readShort();
                            Char.myPetz().cCriticalFull = msg.reader().readByte();
                            Char.myPetz().cDefull = msg.reader().readShort();
                            Char.myPetz().arrPetSkill = new Skill[msg.reader().readByte()];
                            Res.out("SKILLENT = " + Char.myPetz().arrPetSkill);

                            for (var3 = 0; var3 < Char.myPetz().arrPetSkill.length; ++var3) {
                                if ((var220 = msg.reader().readShort()) != -1) {
                                    Char.myPetz().arrPetSkill[var3] = Skills.get(var220);
                                } else {
                                    Char.myPetz().arrPetSkill[var3] = new Skill();
                                    Char.myPetz().arrPetSkill[var3].a = null;
                                    Char.myPetz().arrPetSkill[var3].l = msg.reader().readUTF();
                                }
                            }

                            if (GameCanvas.z > 2 * Panel.WIDTH_PANEL) {
                                (GameCanvas.panel2 = new Panel()).tabName[7] = new String[][]{{""}};
                                GameCanvas.panel2.setTypeBodyOnly();
                                GameCanvas.panel2.show();
                                GameCanvas.panel.setTypePetMain();
                                GameCanvas.panel.show();
                            } else {
                                GameCanvas.panel.setTypePetMain();
                                GameCanvas.panel.show();
                            }
                        }
                        break;
                    case -99:
                        InfoDlg.hide();
                        var233 = msg.reader().readByte();
                        Res.out("byte size= " + var233);
                        if (var233 == 0) {
                            GameCanvas.panel.vEnemy.removeAllElements();
                            var227 = msg.reader().readUnsignedByte();

                            for (var8 = 0; var8 < var227; ++var8) {
                                (var243 = new Char()).charID = msg.reader().readInt();
                                var243.head = msg.reader().readShort();
                                var243.headICON = msg.reader().readShort();
                                var243.body = msg.reader().readShort();
                                var243.leg = msg.reader().readShort();
                                var243.bag = msg.reader().readShort();
                                var243.cName = msg.reader().readUTF();
                                Res.out("head = " + var243.head + " body" + var243.body + " leg=" + var243.leg);
                                var242 = new nr_r(msg.reader().readUTF());
                                boolean var285 = msg.reader().readBoolean();
                                var242.c = var243;
                                var242.e = var285;
                                Res.out("isonline = " + var285);
                                GameCanvas.panel.vEnemy.addElement(var242);
                            }

                            GameCanvas.panel.j();
                            GameCanvas.panel.show();
                        }
                        break;
                    case -98:
                        var2 = msg.reader().readByte();
                        GameCanvas.menu.a = false;
                        if (var2 == 0) {
                            GameCanvas.a(msg.reader().readUTF(), new Command(mResources.bj, GameCanvas.h, 888397, msg.reader().readUTF()), new Command(mResources.bk, GameCanvas.h, 888396, (Object) null));
                        }
                        break;
                    case -97:
                        Char.myCharz().cNangdong = (long) msg.reader().readInt();
                        break;
                    case -96:
                        var219 = msg.reader().readByte();
                        GameCanvas.panel.U.removeAllElements();
                        var232 = msg.reader().readUTF();
                        var5 = msg.reader().readByte();

                        for (var6 = 0; var6 < var5; ++var6) {
                            var215 = msg.reader().readInt();
                            var227 = msg.reader().readInt();
                            var268 = msg.reader().readShort();
                            short var264 = msg.reader().readShort();
                            var254 = msg.reader().readShort();
                            var259 = msg.reader().readShort();
                            Res.out("head = " + var268 + " body= " + var254 + " leg=" + var259);
                            var274 = msg.reader().readUTF();
                            String var276 = msg.reader().readUTF();
                            TopInfo topinfo;
                            (topinfo = new TopInfo()).h = var215;
                            topinfo.a = var268;
                            topinfo.b = var264;
                            topinfo.c = var254;
                            topinfo.d = var259;
                            topinfo.e = var274;
                            topinfo.f = var276;
                            topinfo.i = msg.reader().readUTF();
                            topinfo.g = var227;
                            GameCanvas.panel.U.addElement(topinfo);
                        }

                        GameCanvas.panel.n = var232;
                        GameCanvas.panel.a(var219);
                        GameCanvas.panel.show();
                        break;
                    case -95:
                        var233 = msg.reader().readByte();
                        Res.out("type= " + var233);
                        if (var233 == 0) {
                            var215 = msg.reader().readInt();
                            var7 = msg.reader().readShort();
                            var8 = msg.readInt3Byte();
                            SoundMn.gI();
                            Res.out("TẠO QUÁI ID= " + var215 + " HP= " + var8 + " template = " + var7);
                            if (var215 == Char.myCharz().charID) {
                                Char.myCharz().mobMe = new Mob(var215, false, false, false, false, false, var7, 1, var8, (byte) 0, var8, (short) (Char.myCharz().cx + (Char.myCharz().I == 1 ? 40 : -40)), (short) Char.myCharz().cy, (byte) 4, (byte) 0);
                                Char.myCharz().mobMe.isMobMe = true;
                                EffecMn.addEff(new Effect(18, Char.myCharz().mobMe.m, Char.myCharz().mobMe.n, 2, 10, -1));
                                Char.myCharz().tMobMeBorn = 30;
                                GameScr.vMob.addElement(Char.myCharz().mobMe);
                            } else if ((var255 = GameScr.findCharInMap(var215)) != null) {
                                (var256 = new Mob(var215, false, false, false, false, false, var7, 1, var8, (byte) 0, var8, (short) var255.cx, (short) var255.cy, (byte) 4, (byte) 0)).isMobMe = true;
                                var255.mobMe = var256;
                                GameScr.vMob.addElement(var255.mobMe);
                            } else if (GameScr.c(var215) == null) {
                                (var256 = new Mob(var215, false, false, false, false, false, var7, 1, var8, (byte) 0, var8, (short) -100, (short) -100, (byte) 4, (byte) 0)).isMobMe = true;
                                GameScr.vMob.addElement(var256);
                            }
                        }

                        if (var233 == 1) {
                            var215 = msg.reader().readInt();
                            var253 = msg.reader().readByte();
                            Res.out("mod attack id= " + var215);
                            if (var215 == Char.myCharz().charID) {
                                if (GameScr.c(var253) != null) {
                                    Char.myCharz().mobMe.a(GameScr.c(var253));
                                }
                            } else if ((var245 = GameScr.findCharInMap(var215)) != null && GameScr.c(var253) != null) {
                                var245.mobMe.a(GameScr.c(var253));
                            }
                        }

                        if (var233 == 2) {
                            var215 = msg.reader().readInt();
                            var227 = msg.reader().readInt();
                            var8 = msg.readInt3Byte();
                            msg.readInt3Byte();
                            if (var215 == Char.myCharz().charID) {
                                Res.out("mob dame= " + var8);
                                if ((var260 = GameScr.findCharInMap(var227)) != null) {
                                    if (Char.myCharz().mobMe.Q) {
                                        var260.doInjure(var8, 0, false, true);
                                    } else {
                                        Char.myCharz().mobMe.E = var8;
                                        Char.myCharz().mobMe.a(var260);
                                    }
                                }
                            } else if ((var256 = GameScr.c(var215)) != null) {
                                if (var227 == Char.myCharz().charID) {
                                    Char.myCharz();
                                    if (var256.Q) {
                                        Char.myCharz().doInjure(var8, 0, false, true);
                                    } else {
                                        var256.E = var8;
                                        var256.a(Char.myCharz());
                                    }
                                } else if ((var250 = GameScr.findCharInMap(var227)) != null) {
                                    if (var256.Q) {
                                        var250.doInjure(var8, 0, false, true);
                                    } else {
                                        var256.E = var8;
                                        var256.a(var250);
                                    }
                                }
                            }
                        }

                        if (var233 == 3) {
                            var215 = msg.reader().readInt();
                            var227 = msg.reader().readInt();
                            var8 = msg.readInt3Byte();
                            var9 = msg.readInt3Byte();
                            if (Char.myCharz().charID == var215) {
                                var260 = Char.myCharz();
                            } else {
                                var260 = GameScr.findCharInMap(var215);
                            }

                            if (var260 != null) {
                                Mob var263 = GameScr.c(var227);
                                if (var260.mobMe != null) {
                                    var260.mobMe.a(var263);
                                }

                                if (var263 != null) {
                                    var263.k = var8;
                                    var263.A();
                                    if (var9 == 0) {
                                        var263.m = var263.t;
                                        var263.n = var263.u;
                                        GameScr.a(mResources.cB, var263.m, var263.n - var263.w, 0, -2, 4);
                                    } else {
                                        GameScr.a("-" + var9, var263.m, var263.n - var263.w, 0, -2, 5);
                                    }
                                }
                            }
                        }

                        if (var233 == 5) {
                            var215 = msg.reader().readInt();
                            var253 = msg.reader().readByte();
                            var8 = msg.reader().readInt();
                            var9 = msg.readInt3Byte();
                            var240 = msg.readInt3Byte();
                            if (var215 == Char.myCharz().charID) {
                                var250 = Char.myCharz();
                            } else {
                                var250 = GameScr.findCharInMap(var215);
                            }

                            if (var250 == null) {
                                return;
                            }

                            if ((TileMap.b(var250.cx, var250.cy) & 2) == 2) {
                                var250.a(GameScr.u[var253], 0);
                            } else {
                                var250.a(GameScr.u[var253], 1);
                            }

                            Mob var270 = GameScr.c(var8);
                            if (var250.cx <= var270.m) {
                                var250.I = 1;
                            } else {
                                var250.I = -1;
                            }

                            var250.aP = var270;
                            var270.k = var240;
                            var270.A();
                            if (var9 == 0) {
                                var270.m = var270.t;
                                var270.n = var270.u;
                                GameScr.a(mResources.cB, var270.m, var270.n - var270.w, 0, -2, 4);
                            } else {
                                GameScr.a("-" + var9, var270.m, var270.n - var270.w, 0, -2, 5);
                            }
                        }

                        Char var279;
                        if (var233 == 6) {
                            Res.out("REMOVE QUÁI");
                            if ((var215 = msg.reader().readInt()) == Char.myCharz().charID) {
                                Char.myCharz().mobMe.k();
                            } else if ((var279 = GameScr.findCharInMap(var215)) != null) {
                                var279.mobMe.k();
                            }
                        }

                        if (var233 == 7) {
                            if ((var215 = msg.reader().readInt()) == Char.myCharz().charID) {
                                Char.myCharz().mobMe = null;

                                for (var227 = 0; var227 < GameScr.vMob.size(); ++var227) {
                                    if (((Mob) GameScr.vMob.elementAt(var227)).y == var215) {
                                        GameScr.vMob.removeElementAt(var227);
                                    }
                                }
                            } else {
                                var279 = GameScr.findCharInMap(var215);

                                for (var8 = 0; var8 < GameScr.vMob.size(); ++var8) {
                                    if (((Mob) GameScr.vMob.elementAt(var8)).y == var215) {
                                        GameScr.vMob.removeElementAt(var8);
                                    }
                                }

                                if (var279 != null) {
                                    var279.mobMe = null;
                                }
                            }
                        }
                        break;
                    case -94:
                        while (true) {
                            if (msg.reader().available() <= 0) {
                                break label5279;
                            }

                            var230 = msg.reader().readShort();
                            var215 = msg.reader().readInt();

                            for (var227 = 0; var227 < Char.myCharz().ay.size(); ++var227) {
                                Skill var280;
                                if ((var280 = (Skill) Char.myCharz().ay.elementAt(var227)) != null && var280.b == var230) {
                                    if (var215 < var280.e) {
                                        var280.f = System.currentTimeMillis() - (long) (var280.e - var215);
                                    }

                                    Res.out("1 chieu id= " + var280.a.a + " cooldown= " + var215 + "curr cool down= " + var280.e);
                                }
                            }
                        }
                    case -93:
                        nr_ct.n = new byte[var278 = msg.reader().readShort()];
                        var215 = 0;

                        while (true) {
                            if (var215 >= var278) {
                                break label5279;
                            }

                            nr_ct.n[var215] = msg.reader().readByte();
                            ++var215;
                        }
                    case -92:
                        Main.typeClient = msg.reader().readByte();
                        Rms.a();
                        Rms.saveRMSInt("clienttype", Main.typeClient);
                        Rms.saveRMSInt("lastZoomlevel", mGraphics.zoomLevel);
                        GameCanvas.startOK(mResources.plsRestartGame, 8885, (Object) null);
                        break;
                    case -91:
                        var2 = msg.reader().readByte();
                        Res.out("nList= " + var2);
                        GameCanvas.panel.C = new String[var2];
                        GameCanvas.panel.D = new String[var2];

                        for (var227 = 0; var227 < var2; ++var227) {
                            GameCanvas.panel.C[var227] = msg.reader().readUTF();
                            GameCanvas.panel.D[var227] = msg.reader().readUTF();
                        }

                        GameCanvas.panel.b();
                        GameCanvas.panel.show();
                        break;
                    case -90:
                        var253 = msg.reader().readByte();
                        var8 = msg.reader().readInt();
                        Res.out("===> UPDATE_BODY:    type = " + var253);
                        var255 = Char.myCharz().charID == var8 ? Char.myCharz() : GameScr.findCharInMap(var8);
                        if (var253 != -1) {
                            var254 = msg.reader().readShort();
                            var259 = msg.reader().readShort();
                            short var266 = msg.reader().readShort();
                            var273 = msg.reader().readByte();
                            Res.b("====> Cmd: -90 UPDATE_BODY   \n  isMonkey= " + var273 + " head=  " + var254 + " body= " + var259 + " legU= " + var266);
                            if (var255 != null) {
                                if (var255.charID == var8) {
                                    var255.r = true;
                                    var255.cA = var273;
                                    if (var255.cA != 0) {
                                        var255.cC = false;
                                        var255.bI = false;
                                    }
                                } else if (var255 != null) {
                                    var255.r = true;
                                    var255.cA = var273;
                                }

                                if (var254 != -1) {
                                    var255.head = var254;
                                }

                                if (var259 != -1) {
                                    var255.body = var259;
                                }

                                if (var266 != -1) {
                                    var255.leg = var266;
                                }
                            }
                        }

                        if (var253 == -1 && var255 != null) {
                            var255.r = false;
                            var255.cA = 0;
                        }
                        break;
                    case -88:
                        GameCanvas.g();
                        GameCanvas.af.b();
                        break;
                    case -87:
                        Res.out("GET UPDATE_DATA " + msg.reader().available() + " bytes");
                        msg.reader().mark(100000);
                        a(msg.reader(), true);
                        msg.reader().reset();
                        byte[] var249 = new byte[msg.reader().available()];
                        msg.reader().readFully(var249);
                        byte[] var272 = new byte[]{GameScr.ak};
                        Rms.a("NRdataVersion", var272);
                        nr_x.e = false;
                        if (GameScr.ao == GameScr.ak && GameScr.ap == GameScr.al && GameScr.aq == GameScr.am && GameScr.ar == GameScr.an) {
                            Res.out(GameScr.ao + "," + GameScr.ap + "," + GameScr.aq + "," + GameScr.ar);
                            GameScr.gI();
                            GameScr.k();
                            GameScr.gI();
                            GameScr.i();
                            GameScr.gI();
                            GameScr.j();
                            GameScr.gI();
                            GameScr.l();
                            Service.gI().clientOK();
                            return;
                        }
                        break;
                    case -86:
                        var241 = msg.reader().readByte();
                        Res.out("server gui ve giao dich action = " + var241);
                        if (var241 == 0) {
                            var240 = msg.reader().readInt();
                            GameScr.gI().d(var240);
                        }

                        if (var241 == 1) {
                            if ((var250 = GameScr.findCharInMap(var240 = msg.reader().readInt())) == null) {
                                return;
                            }

                            GameCanvas.panel.b(var250);
                            GameCanvas.panel.show();
                            Service.gI().getPlayerMenu(var240);
                        }

                        if (var241 == 2) {
                            var10 = msg.reader().readByte();

                            for (var11 = 0; var11 < GameCanvas.panel.S.size(); ++var11) {
                                Item var261;
                                if ((var261 = (Item) GameCanvas.panel.S.elementAt(var11)).indexUI == var10) {
                                    GameCanvas.panel.S.removeElement(var261);
                                    break;
                                }
                            }
                        }

                        if (var241 == 6) {
                            GameCanvas.panel.m = true;
                            if (GameCanvas.panel2 != null) {
                                GameCanvas.panel2.m = true;
                            }

                            GameCanvas.panel.T.removeAllElements();
                            if (GameCanvas.panel2 != null) {
                                GameCanvas.panel2.T.removeAllElements();
                            }

                            var240 = msg.reader().readInt();
                            var257 = msg.reader().readByte();

                            for (var12 = 0; var12 < var257; ++var12) {
                                Item var271;
                                (var271 = new Item()).template = ItemTemplates.get(msg.reader().readShort());
                                var271.quantity = msg.reader().readInt();
                                if ((var275 = msg.reader().readUnsignedByte()) != 0) {
                                    var271.itemOption = new ItemOption[var275];

                                    for (var215 = 0; var215 < var271.itemOption.length; ++var215) {
                                        var3 = msg.reader().readUnsignedByte();
                                        var222 = msg.reader().readUnsignedShort();
                                        if (var3 != -1) {
                                            var271.itemOption[var215] = new ItemOption(var3, var222);
                                            var271.compare = GameCanvas.panel.getCompare(var271);
                                        }
                                    }
                                }

                                if (GameCanvas.panel2 != null) {
                                    GameCanvas.panel2.T.addElement(var271);
                                } else {
                                    GameCanvas.panel.T.addElement(var271);
                                }
                            }

                            if (GameCanvas.panel2 != null) {
                                GameCanvas.panel2.a(false);
                                GameCanvas.panel2.l = var240;
                            } else {
                                GameCanvas.panel.l = var240;
                                if (GameCanvas.panel.z == 2) {
                                    GameCanvas.panel.a(false);
                                }
                            }
                        }

                        if (var241 == 7) {
                            InfoDlg.hide();
                            if (GameCanvas.panel.a) {
                                GameCanvas.panel.A();
                            }
                        }
                        break;
                    case -85:
                        Res.out("CAP CHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                        if ((var10 = msg.reader().readByte()) == 0) {
                            var11 = msg.reader().readUnsignedShort();
                            Res.out("lent =" + var11);
                            byte[] var258 = new byte[var11];
                            msg.reader().read(var258, 0, var11);
                            GameScr.gI();
                            GameScr.br = Image.createImage(var258, 0, var11);
                            GameScr.gI().bs = "-----";
                            GameScr.gI().bm = msg.reader().readUTF();
                            GameScr.gI().bq = new int[GameScr.gI().bm.length()];
                            GameScr.gI().aK = new Mob();
                            GameScr.gI().cc = null;
                        }

                        if (var10 == 1) {
                            nr_em.b = true;
                        }

                        if (var10 == 2) {
                            nr_em.a = true;
                            GameScr.gI().cc = GameScr.gI().s;
                        }
                        break;
                    case -84:
                        var12 = msg.reader().readUnsignedByte();
                        Mob var13 = null;

                        try {
                            var13 = (Mob) GameScr.vMob.elementAt(var12);
                        } catch (Exception var202) {
                            ;
                        }

                        if (var13 != null) {
                            var13.l = msg.reader().readInt();
                        }
                        break;
                    case -83:
                        byte var14;
                        if ((var14 = msg.reader().readByte()) == 0) {
                            var238 = msg.reader().readShort();
                            msg.reader().readShort();
                            var222 = msg.reader().readUnsignedByte();
                            var224 = msg.reader().readInt();
                            msg.reader().readUTF();
                            var7 = msg.reader().readShort();
                            var268 = msg.reader().readShort();
                            if (msg.reader().readByte() == 1) {
                                GameScr.gI().bb = true;
                            } else {
                                GameScr.gI().bb = false;
                            }

                            GameScr.gI().be = var7;
                            GameScr.gI().bf = var268;
                            Res.out("xR= " + var7 + " yR= " + var268 + " +++++++++++++++++++++++++++++++++++++++");
                            if (Char.myCharz().charID == var224) {
                                GameCanvas.panel.z();
                                GameScr.gI().a(true);
                            } else if (TileMap.l == var238 && TileMap.n == var222) {
                                GameScr.gI().a(false);
                            } else if (mGraphics.zoomLevel > 1) {
                                GameScr.gI().s();
                            }

                            GameScr.gI().bg = var238;
                            GameScr.gI();
                            GameScr.gI().bh = var222;
                        }

                        if (var14 == 1) {
                            Res.out("map RID = " + GameScr.gI().bg + " zone RID= " + GameScr.gI().bh);
                            Res.out("map ID = " + TileMap.l + " zone ID= " + TileMap.n);
                            if (TileMap.l == GameScr.gI().bg && TileMap.n == GameScr.gI().bh) {
                                GameScr.gI().r();
                            } else {
                                GameScr.gI().ba = false;
                                if (GameScr.gI().bb) {
                                    GameScr.gI().bb = false;
                                }
                            }
                        }
                        break;
                    case -82:
                        TileMap.z = new int[var2 = msg.reader().readByte()][][];
                        TileMap.y = new int[var2][];
                        var3 = 0;

                        while (true) {
                            if (var3 >= var2) {
                                break label5279;
                            }

                            var221 = msg.reader().readByte();
                            TileMap.y[var3] = new int[var221];
                            TileMap.z[var3] = new int[var221][];

                            for (var224 = 0; var224 < var221; ++var224) {
                                TileMap.y[var3][var224] = msg.reader().readInt();
                                var233 = msg.reader().readByte();
                                TileMap.z[var3][var224] = new int[var233];

                                for (var227 = 0; var227 < var233; ++var227) {
                                    TileMap.z[var3][var224][var227] = msg.reader().readByte();
                                }
                            }

                            ++var3;
                        }
                    case -81:
                        var219 = msg.reader().readByte();
                        Res.out("combine action =" + var219);
                        if (var219 == 0) {
                            var232 = msg.reader().readUTF();
                            var251 = msg.reader().readUTF();
                            GameCanvas.panel.n();
                            GameCanvas.panel.am = mFont.b.a(var232, Panel.WIDTH_PANEL);
                            GameCanvas.panel.an = mFont.k.a(var251, Panel.WIDTH_PANEL);
                            GameCanvas.panel.show();
                        }

                        if (var219 == 1) {
                            GameCanvas.panel.k.removeAllElements();
                            var221 = msg.reader().readByte();

                            for (var224 = 0; var224 < var221; ++var224) {
                                var233 = msg.reader().readByte();

                                for (var227 = 0; var227 < Char.myCharz().arrItemBag.length; ++var227) {
                                    Item var265;
                                    if ((var265 = Char.myCharz().arrItemBag[var227]) != null && var265.indexUI == var233) {
                                        var265.isSelect = true;
                                        GameCanvas.panel.k.addElement(var265);
                                    }
                                }
                            }

                            if (GameCanvas.panel.a) {
                                GameCanvas.panel.o();
                            }
                        }

                        if (var219 == 2) {
                            GameCanvas.panel.as = 0;
                            GameCanvas.panel.b(0);
                        }

                        if (var219 == 3) {
                            GameCanvas.panel.as = 1;
                            GameCanvas.panel.b(0);
                        }

                        if (var219 == 4) {
                            var220 = msg.reader().readShort();
                            GameCanvas.panel.ay = var220;
                            GameCanvas.panel.as = 0;
                            GameCanvas.panel.b(1);
                        }

                        if (var219 == 5) {
                            var220 = msg.reader().readShort();
                            GameCanvas.panel.ay = var220;
                            GameCanvas.panel.as = 0;
                            GameCanvas.panel.b(2);
                        }

                        if (var219 == 6) {
                            var220 = msg.reader().readShort();
                            var235 = msg.reader().readShort();
                            GameCanvas.panel.as = 0;
                            GameCanvas.panel.b(3);
                            GameCanvas.panel.ax = var220;
                            GameCanvas.panel.ay = var235;
                        }

                        if (var219 == 7) {
                            var220 = msg.reader().readShort();
                            GameCanvas.panel.ay = var220;
                            GameCanvas.panel.as = 0;
                            GameCanvas.panel.b(4);
                        }

                        if (var219 == 8) {
                            GameCanvas.panel.ay = -1;
                            GameCanvas.panel.as = 1;
                            GameCanvas.panel.b(4);
                        }

                        var220 = 21;

                        try {
                            var220 = msg.reader().readShort();
                        } catch (Exception var201) {
                            ;
                        }

                        var224 = 0;

                        while (true) {
                            if (var224 >= GameScr.G.size()) {
                                break label5279;
                            }

                            if ((var248 = (Npc) GameScr.G.elementAt(var224)).cW.a == var220) {
                                GameCanvas.panel.au = var248.cx - GameScr.j;
                                GameCanvas.panel.av = var248.cy - GameScr.k;
                                GameCanvas.panel.at = var220;
                                break label5279;
                            }

                            ++var224;
                        }
                    case -80:
                        var5 = msg.reader().readByte();
                        InfoDlg.hide();
                        if (var5 == 0) {
                            GameCanvas.panel.R.removeAllElements();
                            var6 = msg.reader().readUnsignedByte();

                            for (var227 = 0; var227 < var6; ++var227) {
                                (var245 = new Char()).charID = msg.reader().readInt();
                                var245.head = msg.reader().readShort();
                                var245.headICON = msg.reader().readShort();
                                var245.body = msg.reader().readShort();
                                var245.leg = msg.reader().readShort();
                                var245.bag = msg.reader().readUnsignedByte();
                                var245.cName = msg.reader().readUTF();
                                Res.out("head = " + var245.head + " body" + var245.body + " leg=" + var245.leg);
                                var217 = msg.reader().readBoolean();
                                (var242 = new nr_r(mResources.cW + ": " + msg.reader().readUTF())).c = var245;
                                var242.e = var217;
                                GameCanvas.panel.R.addElement(var242);
                            }

                            GameCanvas.panel.i();
                            GameCanvas.panel.show();
                        }

                        MyVector var239;
                        nr_r var262;
                        if (var5 == 3) {
                            var239 = GameCanvas.panel.R;
                            var227 = msg.reader().readInt();
                            Res.out("online offline id=" + var227);

                            for (var8 = 0; var8 < var239.size(); ++var8) {
                                if ((var262 = (nr_r) var239.elementAt(var8)).c != null && var262.c.charID == var227) {
                                    Res.out("online= " + var262.e);
                                    var262.e = msg.reader().readBoolean();
                                    break;
                                }
                            }
                        }

                        if (var5 == 2) {
                            var239 = GameCanvas.panel.R;
                            var227 = msg.reader().readInt();

                            for (var8 = 0; var8 < var239.size(); ++var8) {
                                if ((var262 = (nr_r) var239.elementAt(var8)).c != null && var262.c.charID == var227) {
                                    var239.removeElement(var262);
                                    break;
                                }
                            }

                            if (GameCanvas.panel.a) {
                                GameCanvas.panel.k();
                            }
                        }
                        break;
                    case -79:
                        InfoDlg.hide();
                        msg.reader().readInt();
                        var245 = GameCanvas.panel.Z;
                        if (GameCanvas.panel.Z == null) {
                            return;
                        }

                        var245.cPower = msg.reader().readLong();
                        var245.currStrLevel = msg.reader().readUTF();
                        break;
                    case -77:
                        var238 = msg.reader().readShort();
                        Res.out("nSmall = " + var238);
                        SmallImage.e = new byte[var238];
                        SmallImage.f = var238;
                        SmallImage.c = new nr_dz[var238];
                        var222 = 0;

                        while (true) {
                            if (var222 >= var238) {
                                break label5279;
                            }

                            SmallImage.e[var222] = msg.reader().readByte();
                            ++var222;
                        }
                    case -76:
                        if ((var221 = msg.reader().readByte()) == 0) {
                            if ((var2 = msg.reader().readByte()) <= 0) {
                                return;
                            }

                            Char.myCharz().aD = new nr_am[var2];

                            for (var3 = 0; var3 < var2; ++var3) {
                                Char.myCharz().aD[var3] = new nr_am();
                                Char.myCharz().aD[var3].a = var3 + 1 + ". " + msg.reader().readUTF();
                                Char.myCharz().aD[var3].b = msg.reader().readUTF();
                                Char.myCharz().aD[var3].c = msg.reader().readShort();
                                Char.myCharz().aD[var3].d = msg.reader().readBoolean();
                                Char.myCharz().aD[var3].e = msg.reader().readBoolean();
                            }

                            GameCanvas.panel.c();
                            GameCanvas.panel.show();
                        } else if (var221 == 1) {
                            var215 = msg.reader().readUnsignedByte();
                            if (Char.myCharz().aD[var215] != null) {
                                Char.myCharz().aD[var215].e = true;
                            }
                        }
                        break;
                    case -74:
                        if (nr_bo.i) {
                            return;
                        }

                        var2 = msg.reader().readByte();
                        Res.out("[Controler: cmd-74] action = " + var2);
                        if (var2 == 0) {
                            var3 = msg.reader().readInt();
                            Res.out("serverVersion= " + var3);
                            var224 = (var232 = Rms.c("ResVersion")) != null && var232 != "" ? Integer.parseInt(var232) : -1;
                            Res.out("[Controler: cmd-74] version = " + var224);
                            if (var224 != -1 && var224 == var3) {
                                Res.out("login ngay");
                                SmallImage.a();
                                SplashScr.b = null;
                                nr_bo.t = true;
                                if (GameCanvas.currentScreen != GameCanvas.loginScr) {
                                    GameCanvas.af.b();
                                }
                            } else {
                                nr_bo.t = false;
                                GameCanvas.af.j();
                            }
                        }

                        if (var2 == 1) {
                            nr_bo.p = msg.reader().readShort();
                            Service.gI().getResource((byte) 2, (MyVector) null);
                        }

                        if (var2 == 2) {
                            try {
                                isLoadingData = true;
                                GameCanvas.g();
                                var4 = Res.a(msg.reader().readUTF(), "/", 0);
                                var251 = "x" + mGraphics.zoomLevel + var4[var4.length - 1];
                                byte[] var252 = new byte[var6 = msg.reader().readInt()];
                                msg.reader().read(var252, 0, var6);
                                Res.out("path save= " + var251 + " data save lent= " + var252.length + " === " + nr_bo.o + "% " + nr_bo.p);
                                Rms.a(var251, var252);
                                nr_bo.o = ++nr_bo.q * 100 / nr_bo.p;
                                if (Main.typeClient != 5) {
                                    ;
                                }
                            } catch (Exception var200) {
                                GameCanvas.startOK(mResources.az, 8885, (Object) null);
                            }
                        }

                        if (var2 == 3) {
                            isLoadingData = false;
                            var3 = msg.reader().readInt();
                            Res.out("last version= " + var3);
                            Rms.a("ResVersion", String.valueOf(var3));
                            Service.gI().getResource((byte) 3, (MyVector) null);
                            GameCanvas.g();
                            SplashScr.b = null;
                            SmallImage.a();
                            System.gc();
                            nr_bo.n = true;
                            nr_bo.t = true;
                            GameScr.gI().o();
                            if (GameCanvas.currentScreen != GameCanvas.loginScr) {
                                GameCanvas.af.b();
                            }
                        }
                        break;
                    case -70:
                        Res.out("BIG MESSAGE .......................................");
                        GameCanvas.g();
                        short var116 = msg.reader().readShort();
                        String var117 = msg.reader().readUTF();
                        Npc var118;
                        (var118 = new Npc(-1, 0, 0, 0, 0, 0)).aN = var116;
                        ChatPopup.a(var117, 100000, var118);
                        byte var119;
                        if ((var119 = msg.reader().readByte()) == 0) {
                            ChatPopup.n.k = new Command(mResources.bf, ChatPopup.n, 1001, (Object) null);
                            ChatPopup.n.k.x = GameCanvas.z / 2 - 35;
                            ChatPopup.n.k.y = GameCanvas.A - 35;
                        }

                        if (var119 == 1) {
                            String var331 = msg.reader().readUTF();
                            var121 = msg.reader().readUTF();
                            ChatPopup.n.k = new Command(var121, ChatPopup.n, 1000, var331);
                            ChatPopup.n.k.x = GameCanvas.z / 2 - 75;
                            ChatPopup.n.k.y = GameCanvas.A - 35;
                            ChatPopup.n.l = new Command(mResources.bf, ChatPopup.n, 1001, (Object) null);
                            ChatPopup.n.l.x = GameCanvas.z / 2 + 11;
                            ChatPopup.n.l.y = GameCanvas.A - 35;
                        }
                        break;
                    case -69:
                        Char.myCharz().cMaxStamina = msg.reader().readShort();
                        break;
                    case -68:
                        Char.myCharz().cStamina = msg.reader().readShort();
                        break;
                    case -67:
                        ++this.f;
                        var72 = msg.reader().readInt();

                        byte[] var309;
                        try {
                            var309 = NinjaUtil.a(msg);
                            if (SmallImage.c != null) {
                                SmallImage.c[var72].a = a(var309);
                            }
                        } catch (Exception var205) {
                            var309 = null;
                            if (SmallImage.c != null && SmallImage.c[var72] != null) {
                                SmallImage.c[var72].a = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                            }
                        }

                        if (var309 != null && mGraphics.zoomLevel > 1) {
                            Rms.a(mGraphics.zoomLevel + "Small" + var72, var309);
                        }
                        break;
                    case -66:
                        var74 = msg.reader().readShort();
                        byte[] var310 = NinjaUtil.a(msg);
                        nr_cg var311 = Effect.b(var74);
                        byte var77;
                        if ((var77 = msg.reader().readByte()) == 0) {
                            var311.a(var310);
                        } else {
                            var311.a(var310, var77);
                        }

                        byte[] var78 = NinjaUtil.a(msg);
                        var311.a = Image.createImage(var78, 0, var78.length);
                        break;
                    case -65:
                        InfoDlg.hide();
                        var215 = msg.reader().readInt();
                        var221 = msg.reader().readByte();
                        Res.out("TELEPORT ..................................................." + var221);
                        if (var221 != 0) {
                            if (Char.myCharz().charID == var215) {
                                b = true;
                                GameScr.z = 500;
                                GameScr.gI().cb = null;
                                if (var221 == 0 || var221 == 1 || var221 == 3) {
                                    int var10008 = var221 == 1 ? Char.myCharz().cgender : var221;
                                    nr_ci var352 = new nr_ci(Char.myCharz().cx, Char.myCharz().cy, Char.myCharz().head, Char.myCharz().I, 0, true, var10008);;
                                    nr_ci.a(var352);
                                }

                                if (var221 == 2) {
                                    GameScr.z = 50;
                                    Char.myCharz().k();
                                }
                            } else {
                                var243 = GameScr.findCharInMap(var215);
                                if ((var221 == 0 || var221 == 1 || var221 == 3) && var243 != null) {
                                    var243.t = true;
                                    nr_ci var246;
                                    (var246 = new nr_ci(var243.cx, var243.cy, var243.head, var243.I, 0, false, var221 == 1 ? var243.cgender : var221)).d = var215;
                                    nr_ci.a(var246);
                                }

                                if (var221 == 2) {
                                    var243.k();
                                }
                            }
                        }
                        break;
                    case -64:
                        var3 = msg.reader().readInt();
                        var224 = msg.reader().readUnsignedByte();
                        Char var228;
                        if (var3 == Char.myCharz().charID) {
                            var228 = Char.myCharz();
                        } else {
                            var228 = GameScr.findCharInMap(var3);
                        }

                        var228.bag = var224;
                        if (var228.bag >= 201 && var228.bag < 255) {
                            Effect var244;
                            (var244 = new Effect(var228.bag, var228, 2, -1, 10, (byte) 1)).b = 5;
                            var228.a(var244);
                        } else {
                            for (var222 = 0; var222 < 54; ++var222) {
                                var228.b((int) 0, var222 + 201);
                            }
                        }

                        Res.out("cmd:-64 UPDATE BAG PLAER = " + (var228 == null ? "" : var228.cName) + var3 + " BAG ID= " + var224);
                        break;
                    case -63:
                        Res.out("GET BAG");
                        var3 = msg.reader().readUnsignedByte();
                        var5 = msg.reader().readByte();
                        (var226 = new nr_aj()).a = var3;
                        if (var5 > 0) {
                            var226.c = new short[var5];

                            for (var222 = 0; var222 < var5; ++var222) {
                                var226.c[var222] = msg.reader().readShort();
                                Res.out("ID=  " + var3 + " frame= " + var226.c[var222]);
                            }

                            nr_aj.g.put(String.valueOf(var3), var226);
                        }
                        break;
                    case -62:
                        var215 = msg.reader().readUnsignedByte();
                        var219 = msg.reader().readByte();
                        Res.out("cmd: -62 CLAN_IMAGE id= " + var215 + " nImage= " + var219);
                        if (var219 > 0 && (var226 = nr_aj.a((short) var215)) != null) {
                            var226.c = new short[var219];

                            for (var222 = 0; var222 < var219; ++var222) {
                                var226.c[var222] = msg.reader().readShort();
                                if (var226.c[var222] > 0) {
                                    SmallImage.d.addElement(String.valueOf(var226.c[var222]));
                                }
                            }
                        }
                        break;
                    case -61:
                        if ((var215 = msg.reader().readInt()) != Char.myCharz().charID) {
                            if (GameScr.findCharInMap(var215) != null) {
                                GameScr.findCharInMap(var215).ah = msg.reader().readInt();
                                if (GameScr.findCharInMap(var215).ah == -2) {
                                    GameScr.findCharInMap(var215).cB = true;
                                }
                            }
                        } else if (Char.myCharz().ai != null) {
                            Char.myCharz().ai.a = msg.reader().readInt();
                        }
                        break;
                    case -60:
                        int var345 = msg.reader().readInt();
                        int var135 = -1;
                        if (var345 != Char.myCharz().charID) {
                            Char var136;
                            if ((var136 = GameScr.findCharInMap(var345)) == null) {
                                return;
                            }

                            if (var136.bO != null) {
                                var136.a(var136.cx, var136.cy, (int) 10);
                                var136.cx = var136.bO.a;
                                var136.cy = var136.bO.b;
                            }

                            int var137 = msg.reader().readUnsignedByte();
                            if ((TileMap.b(var136.cx, var136.cy) & 2) == 2) {
                                var136.a(GameScr.u[var137], 0);
                            } else {
                                var136.a(GameScr.u[var137], 1);
                            }

                            var340 = new Char[msg.reader().readByte()];

                            for (var131 = 0; var131 < var340.length; ++var131) {
                                Char var139;
                                if ((var135 = msg.reader().readInt()) == Char.myCharz().charID) {
                                    var139 = Char.myCharz();
                                    if (!GameScr.bk && GameScr.bi && GameScr.bj) {
                                        Service.gI().f((int) -1);
                                        GameScr.bk = true;
                                    }
                                } else {
                                    var139 = GameScr.findCharInMap(var135);
                                }

                                var340[var131] = var139;
                                if (var131 == 0) {
                                    if (var136.cx <= var139.cx) {
                                        var136.I = 1;
                                    } else {
                                        var136.I = -1;
                                    }
                                }
                            }

                            if (var131 > 0) {
                                var136.aX = new Char[var131];

                                for (var131 = 0; var131 < var136.aX.length; ++var131) {
                                    var136.aX[var131] = var340[var131];
                                }

                                var136.aP = null;
                                var136.aT = var136.aX[0];
                            }
                        } else {
                            msg.reader().readByte();
                            msg.reader().readByte();
                            var135 = msg.reader().readInt();
                        }

                        try {
                            if (msg.reader().readByte() == 1) {
                                byte var347 = msg.reader().readByte();
                                boolean var138;
                                int var348;
                                if (var135 == Char.myCharz().charID) {
                                    var89 = Char.myCharz();
                                    var348 = msg.readInt3Byte();
                                    var89.af = msg.reader().readBoolean();
                                    if (var89.af) {
                                        Char.bG = true;
                                    }

                                    var138 = msg.reader().readBoolean();
                                    var89.ae = var138;
                                    var89.ad = false;
                                    var89.ac = var348;
                                    if (var347 == 0) {
                                        var89.doInjure(var348, 0, var138, false);
                                    }
                                } else {
                                    if ((var89 = GameScr.findCharInMap(var135)) == null) {
                                        return;
                                    }

                                    var348 = msg.readInt3Byte();
                                    var89.af = msg.reader().readBoolean();
                                    var138 = msg.reader().readBoolean();
                                    var89.ae = var138;
                                    var89.ad = false;
                                    var89.ac = var348;
                                    if (var347 == 0) {
                                        var89.doInjure(var348, 0, var138, false);
                                    }
                                }
                            }
                        } catch (Exception var211) {
                            ;
                        }
                        break;
                    case -59:
                        var219 = msg.reader().readByte();
                        GameScr var350 = GameScr.gI();
                        int var351 = msg.reader().readInt();
                        msg.reader().readInt();
                        var350.a(var351, msg.reader().readUTF(), var219);
                        break;
                    case -57:
                        var232 = msg.reader().readUTF();
                        var215 = msg.reader().readInt();
                        var3 = msg.reader().readInt();
                        GameScr.gI().a(var232, var215, var3);
                        break;
                    case -53:
                        Res.out("MY CLAN INFO");
                        InfoDlg.hide();
                        var215 = msg.reader().readInt();
                        Res.out("clanId= " + var215);
                        if (var215 == -1) {
                            Char.myCharz().ai = null;
                            nr_bx.l.removeAllElements();
                            if (GameCanvas.panel.O != null) {
                                GameCanvas.panel.O.removeAllElements();
                            }

                            if (GameCanvas.panel.P != null) {
                                GameCanvas.panel.P.removeAllElements();
                            }

                            if (GameCanvas.currentScreen == GameScr.gI()) {
                                GameCanvas.panel.w();
                            }

                            return;
                        }

                        GameCanvas.panel.j = null;
                        if (Char.myCharz().ai == null) {
                            Char.myCharz().ai = new nr_eb();
                        }

                        Char.myCharz().ai.a = var215;
                        Char.myCharz().ai.c = msg.reader().readUTF();
                        Char.myCharz().ai.d = msg.reader().readUTF();
                        Char.myCharz().ai.b = msg.reader().readUnsignedByte();
                        Char.myCharz().ai.f = msg.reader().readUTF();
                        Char.myCharz().ai.i = msg.reader().readUTF();
                        Char.myCharz().ai.g = msg.reader().readUnsignedByte();
                        Char.myCharz().ai.h = msg.reader().readUnsignedByte();
                        Char.myCharz().aj = msg.reader().readByte();
                        Char.myCharz().ai.k = msg.reader().readInt();
                        Char.myCharz().ai.j = msg.reader().readByte();
                        GameCanvas.panel.P = new MyVector("GameCanvas.panel.myMember ");

                        for (var215 = 0; var215 < Char.myCharz().ai.g; ++var215) {
                            nr_e var231;
                            (var231 = new nr_e()).a = msg.reader().readInt();
                            var231.b = msg.reader().readShort();
                            var231.c = msg.reader().readShort();
                            var231.d = msg.reader().readShort();
                            var231.e = msg.reader().readShort();
                            var231.f = msg.reader().readUTF();
                            var231.g = msg.reader().readByte();
                            var231.h = msg.reader().readUTF();
                            var231.i = msg.reader().readInt();
                            var231.j = msg.reader().readInt();
                            var231.l = msg.reader().readInt();
                            var231.k = msg.reader().readInt();
                            var231.m = NinjaUtil.a(msg.reader().readInt());
                            GameCanvas.panel.P.addElement(var231);
                        }

                        var215 = msg.reader().readUnsignedByte();

                        for (var3 = 0; var3 < var215; ++var3) {
                            a(msg, -1);
                        }

                        if (GameCanvas.panel.ai || GameCanvas.panel.ak || GameCanvas.panel.aj) {
                            GameCanvas.panel.w();
                        }
                        break;
                    case -52:
                        nr_e var218;
                        if ((var219 = msg.reader().readByte()) == 0) {
                            (var218 = new nr_e()).a = msg.reader().readInt();
                            var218.b = msg.reader().readShort();
                            var218.c = msg.reader().readShort();
                            var218.d = msg.reader().readShort();
                            var218.e = msg.reader().readShort();
                            var218.f = msg.reader().readUTF();
                            var218.g = msg.reader().readByte();
                            var218.h = msg.reader().readUTF();
                            var218.i = msg.reader().readInt();
                            var218.j = msg.reader().readInt();
                            var218.l = msg.reader().readInt();
                            var218.m = NinjaUtil.a(msg.reader().readInt());
                            if (GameCanvas.panel.P == null) {
                                GameCanvas.panel.P = new MyVector("ameCanvas.panel.myMember");
                            }

                            GameCanvas.panel.P.addElement(var218);
                            GameCanvas.panel.v();
                        }

                        if (var219 == 1) {
                            GameCanvas.panel.P.removeElementAt(msg.reader().readByte());
                            --GameCanvas.panel.M;
                            GameCanvas.panel.v();
                        }

                        if (var219 == 2) {
                            (var218 = new nr_e()).a = msg.reader().readInt();
                            var218.b = msg.reader().readShort();
                            var218.c = msg.reader().readShort();
                            var218.d = msg.reader().readShort();
                            var218.e = msg.reader().readShort();
                            var218.f = msg.reader().readUTF();
                            var218.g = msg.reader().readByte();
                            var218.h = msg.reader().readUTF();
                            var218.i = msg.reader().readInt();
                            var218.j = msg.reader().readInt();
                            var218.l = msg.reader().readInt();
                            var218.m = NinjaUtil.a(msg.reader().readInt());

                            for (var3 = 0; var3 < GameCanvas.panel.P.size(); ++var3) {
                                if ((var229 = (nr_e) GameCanvas.panel.P.elementAt(var3)).a == var218.a) {
                                    if (Char.myCharz().charID == var218.a) {
                                        Char.myCharz().aj = var218.g;
                                    }

                                    GameCanvas.panel.P.removeElement(var229);
                                    GameCanvas.panel.P.insertElementAt(var218, var3);
                                    return;
                                }
                            }
                        }
                        break;
                    case -51:
                        InfoDlg.hide();
                        a(msg, 0);
                        if (GameCanvas.panel.aj && GameCanvas.panel.y == 5) {
                            GameCanvas.panel.v();
                        }
                        break;
                    case -50:
                        InfoDlg.hide();
                        GameCanvas.panel.O = new MyVector(".panel.member");
                        var2 = msg.reader().readByte();

                        for (var3 = 0; var3 < var2; ++var3) {
                            (var229 = new nr_e()).a = msg.reader().readInt();
                            var229.b = msg.reader().readShort();
                            var229.c = msg.reader().readShort();
                            var229.d = msg.reader().readShort();
                            var229.e = msg.reader().readShort();
                            var229.f = msg.reader().readUTF();
                            var229.g = msg.reader().readByte();
                            var229.h = msg.reader().readUTF();
                            var229.i = msg.reader().readInt();
                            var229.j = msg.reader().readInt();
                            var229.l = msg.reader().readInt();
                            var229.m = NinjaUtil.a(msg.reader().readInt());
                            GameCanvas.panel.O.addElement(var229);
                        }

                        GameCanvas.panel.ak = true;
                        GameCanvas.panel.ai = false;
                        GameCanvas.panel.aj = false;
                        GameCanvas.panel.M = GameCanvas.panel.O.size() + 2;
                        GameCanvas.panel.v();
                        break;
                    case -47:
                        InfoDlg.hide();
                        var219 = msg.reader().readByte();
                        Res.out("clan = " + var219);
                        if (var219 == 0) {
                            GameCanvas.panel.al = mResources.dE;
                            GameCanvas.panel.N = null;
                        } else {
                            GameCanvas.panel.N = new nr_eb[var219];
                            Res.out("clan search lent= " + GameCanvas.panel.N.length);

                            for (var222 = 0; var222 < GameCanvas.panel.N.length; ++var222) {
                                GameCanvas.panel.N[var222] = new nr_eb();
                                GameCanvas.panel.N[var222].a = msg.reader().readInt();
                                GameCanvas.panel.N[var222].c = msg.reader().readUTF();
                                GameCanvas.panel.N[var222].d = msg.reader().readUTF();
                                GameCanvas.panel.N[var222].b = msg.reader().readUnsignedByte();
                                GameCanvas.panel.N[var222].f = msg.reader().readUTF();
                                GameCanvas.panel.N[var222].i = msg.reader().readUTF();
                                GameCanvas.panel.N[var222].g = msg.reader().readUnsignedByte();
                                GameCanvas.panel.N[var222].h = msg.reader().readUnsignedByte();
                                GameCanvas.panel.N[var222].e = msg.reader().readInt();
                            }
                        }

                        GameCanvas.panel.ai = true;
                        GameCanvas.panel.ak = false;
                        GameCanvas.panel.aj = false;
                        if (GameCanvas.panel.ai) {
                            GameCanvas.panel.v();
                        }
                        break;
                    case -46:
                        InfoDlg.hide();
                        var221 = msg.reader().readByte();
                        Res.out("cAction= " + var221);
                        if (var221 == 1 || var221 == 3) {
                            GameCanvas.g();
                            nr_aj.f.removeAllElements();
                            var215 = msg.reader().readUnsignedByte();

                            for (var3 = 0; var3 < var215; ++var3) {
                                nr_aj var237;
                                (var237 = new nr_aj()).a = msg.reader().readUnsignedByte();
                                var237.b = msg.reader().readUTF();
                                var237.d = msg.reader().readInt();
                                var237.e = msg.reader().readInt();
                                if (!nr_aj.a(var237.a)) {
                                    nr_aj.a(var237);
                                } else {
                                    nr_aj.a((short) var237.a).b = var237.b;
                                    nr_aj.a((short) var237.a).d = var237.d;
                                    nr_aj.a((short) var237.a).e = var237.e;
                                }
                            }

                            if (Char.myCharz().ai != null) {
                                GameCanvas.panel.C();
                            }
                        }

                        if (var221 == 4) {
                            Char.myCharz().ai.b = msg.reader().readUnsignedByte();
                            Char.myCharz().ai.d = msg.reader().readUTF();
                            Res.out("change slogan " + Char.myCharz().ai.d);
                        }
                        break;
                    case -45:
                        var5 = msg.reader().readByte();
                        var6 = msg.reader().readInt();
                        var7 = msg.reader().readShort();
                        Res.out("skill type= " + var5 + "player use= " + var6 + " id= " + var7);
                        if (var5 == 0) {
                            Res.out("id use= " + var6);
                            if (Char.myCharz().charID != var6) {
                                if ((TileMap.b((var245 = GameScr.findCharInMap(var6)).cx, var245.cy) & 2) == 2) {
                                    var245.a(GameScr.u[var7], 0);
                                } else {
                                    var245.a(GameScr.u[var7], 1);
                                    var245.bP = 20;
                                }
                            } else {
                                Char.myCharz();
                                Res.out("LOAD LAST SKILL");
                            }

                            byte var247 = msg.reader().readByte();
                            Res.out("npc size= " + var247);

                            for (var9 = 0; var9 < var247; ++var9) {
                                byte var291 = msg.reader().readByte();
                                var290 = msg.reader().readByte();
                                Res.out("index= " + var291);
                                if (var7 >= 42 && var7 <= 48) {
                                    ((Mob) GameScr.vMob.elementAt(var291)).g = true;
                                    ((Mob) GameScr.vMob.elementAt(var291)).h = var290;
                                    Mob var349 = (Mob) GameScr.vMob.elementAt(var291);
                                    GameScr.vMob.elementAt(var291);
                                    var349.i = System.currentTimeMillis();
                                }
                            }

                            var241 = msg.reader().readByte();

                            for (var64 = 0; var64 < var241; ++var64) {
                                var65 = msg.reader().readInt();
                                var66 = msg.reader().readByte();
                                Res.out("player ID= " + var65 + " my ID= " + Char.myCharz().charID);
                                if (var7 >= 42 && var7 <= 48) {
                                    if (var65 == Char.myCharz().charID) {
                                        if (!Char.myCharz().cg && !Char.myCharz().ch) {
                                            GameScr.gI().aY = true;
                                            Char.myCharz().bj = true;
                                            Char.myCharz().bm = var66;
                                            var10000 = Char.myCharz();
                                            Char.myCharz();
                                            var10000.bo = System.currentTimeMillis();
                                            Char.myCharz().bI = true;
                                        }
                                    } else {
                                        Char var300;
                                        if ((var300 = GameScr.findCharInMap(var65)) != null && !var300.cg && !var300.ch) {
                                            var300.bj = true;
                                            var300.bm = var66;
                                            GameScr.findCharInMap(var65);
                                            var300.bo = System.currentTimeMillis();
                                        }
                                    }
                                }
                            }
                        }

                        if (var5 == 1 && var6 != Char.myCharz().charID) {
                            GameScr.findCharInMap(var6).bk = true;
                        }

                        if (var5 == 3) {
                            if (var6 == Char.myCharz().charID) {
                                Char.myCharz().bk = false;
                                SoundMn.gI();
                                Char.myCharz();
                            } else {
                                GameScr.findCharInMap(var6).bk = false;
                            }
                        }

                        if (var5 == 4) {
                            if (var6 == Char.myCharz().charID) {
                                Char.myCharz().bl = msg.reader().readShort() - 1000;
                                Char.myCharz().bn = System.currentTimeMillis();
                                Res.out("second= " + Char.myCharz().bl + " last= " + Char.myCharz().bn);
                            } else if (GameScr.findCharInMap(var6) != null) {
                                if ((var8 = GameScr.findCharInMap(var6).cgender) == 0) {
                                    GameScr.findCharInMap(var6).b(false);
                                } else if (var8 == 1) {
                                    GameScr.findCharInMap(var6).b(true);
                                }

                                GameScr.findCharInMap(var6).aO = var7;
                                GameScr.findCharInMap(var6).cf = true;
                                GameScr.findCharInMap(var6).bl = msg.reader().readShort();
                                GameScr.findCharInMap(var6).bn = System.currentTimeMillis();
                            }
                        }

                        if (var5 == 5) {
                            if (var6 == Char.myCharz().charID) {
                                Char.myCharz().B();
                            } else if (GameScr.findCharInMap(var6) != null) {
                                GameScr.findCharInMap(var6).B();
                            }
                        }

                        if (var5 == 6) {
                            if (var6 == Char.myCharz().charID) {
                                Char.myCharz().b(GameScr.u[var7], 0);
                            } else if (GameScr.findCharInMap(var6) != null) {
                                GameScr.findCharInMap(var6).b(GameScr.u[var7], 0);
                                SoundMn.gI();
                            }
                        }

                        if (var5 == 7) {
                            if (var6 == Char.myCharz().charID) {
                                Char.myCharz().bl = msg.reader().readShort();
                                Res.out("second = " + Char.myCharz().bl);
                                Char.myCharz().bn = System.currentTimeMillis();
                            } else if (GameScr.findCharInMap(var6) != null) {
                                GameScr.findCharInMap(var6).b(true);
                                GameScr.findCharInMap(var6).bl = msg.reader().readShort();
                                GameScr.findCharInMap(var6).bn = System.currentTimeMillis();
                                SoundMn.gI();
                            }
                        }

                        if (var5 == 8 && var6 != Char.myCharz().charID && GameScr.findCharInMap(var6) != null) {
                            GameScr.findCharInMap(var6).b(GameScr.u[var7], 0);
                        }
                        break;
                    case -44:
                        boolean var236 = false;
                        if (GameCanvas.z > 2 * Panel.WIDTH_PANEL) {
                            var236 = true;
                        }

                        var241 = msg.reader().readByte();
                        var64 = msg.reader().readUnsignedByte();
                        Char.myCharz().aI = new Item[var64][];
                        GameCanvas.panel.H = new String[var64 + (!var236 ? 1 : 0)][2];
                        if (var241 == 2) {
                            GameCanvas.panel.I = new int[var64];
                            GameCanvas.panel.J = new int[var64];
                        }

                        if (!var236) {
                            GameCanvas.panel.H[var64] = mResources.cb;
                        }

                        for (var65 = 0; var65 < var64; ++var65) {
                            String[] var294 = Res.a(msg.reader().readUTF(), "\n", 0);
                            if (var241 == 2) {
                                GameCanvas.panel.I[var65] = msg.reader().readUnsignedByte();
                            }

                            if (var294.length == 2) {
                                GameCanvas.panel.H[var65] = var294;
                            }

                            if (var294.length == 1) {
                                GameCanvas.panel.H[var65][0] = var294[0];
                                GameCanvas.panel.H[var65][1] = "";
                            }

                            int var298 = msg.reader().readUnsignedByte();
                            Char.myCharz().aI[var65] = new Item[var298];

                            for (int var301 = 0; var301 < var298; ++var301) {
                                short var306;
                                if ((var306 = msg.reader().readShort()) != -1) {
                                    Char.myCharz().aI[var65][var301] = new Item();
                                    Char.myCharz().aI[var65][var301].template = ItemTemplates.get(var306);
                                    Panel.ao = mResources.eo;
                                    if (var241 == 8) {
                                        Char.myCharz().aI[var65][var301].j = msg.reader().readInt();
                                        Char.myCharz().aI[var65][var301].k = msg.reader().readInt();
                                        Char.myCharz().aI[var65][var301].quantity = msg.reader().readInt();
                                    } else if (var241 == 4) {
                                        Char.myCharz().aI[var65][var301].reason = msg.reader().readUTF();
                                    } else if (var241 == 0) {
                                        Char.myCharz().aI[var65][var301].j = msg.reader().readInt();
                                        Char.myCharz().aI[var65][var301].k = msg.reader().readInt();
                                    } else if (var241 == 1) {
                                        Char.myCharz().aI[var65][var301].powerRequire = msg.reader().readLong();
                                        Panel.ao = mResources.ep;
                                    } else if (var241 == 2) {
                                        Char.myCharz().aI[var65][var301].itemId = msg.reader().readShort();
                                        Char.myCharz().aI[var65][var301].j = msg.reader().readInt();
                                        Char.myCharz().aI[var65][var301].k = msg.reader().readInt();
                                        Char.myCharz().aI[var65][var301].buyType = msg.reader().readByte();
                                        Char.myCharz().aI[var65][var301].quantity = msg.reader().readInt();
                                        Char.myCharz().aI[var65][var301].isMe = msg.reader().readByte();
                                    } else if (var241 == 3) {
                                        Char.myCharz().aI[var65][var301].p = true;
                                        Char.myCharz().aI[var65][var301].iconSpec = msg.reader().readShort();
                                        Char.myCharz().aI[var65][var301].l = msg.reader().readInt();
                                    }

                                    int var305;
                                    if ((var305 = msg.reader().readUnsignedByte()) != 0) {
                                        Char.myCharz().aI[var65][var301].itemOption = new ItemOption[var305];

                                        for (int var307 = 0; var307 < Char.myCharz().aI[var65][var301].itemOption.length; ++var307) {
                                            var72 = msg.reader().readUnsignedByte();
                                            int var73 = msg.reader().readUnsignedShort();
                                            if (var72 != -1) {
                                                Char.myCharz().aI[var65][var301].itemOption[var307] = new ItemOption(var72, var73);
                                                Char.myCharz().aI[var65][var301].compare = GameCanvas.panel.getCompare(Char.myCharz().aI[var65][var301]);
                                            }
                                        }
                                    }

                                    var71 = msg.reader().readByte();
                                    Char.myCharz().aI[var65][var301].newItem = var71 != 0;
                                    if (msg.reader().readByte() == 1) {
                                        short var308 = msg.reader().readShort();
                                        var74 = msg.reader().readShort();
                                        short var75 = msg.reader().readShort();
                                        short var76 = msg.reader().readShort();
                                        Char.myCharz().aI[var65][var301].setPartTemp(var308, var74, var75, var76);
                                    }
                                }
                            }
                        }

                        if (var236) {
                            if (var241 != 2) {
                                (GameCanvas.panel2 = new Panel()).tabName[7] = new String[][]{{""}};
                                GameCanvas.panel2.setTypeBodyOnly();
                                GameCanvas.panel2.show();
                            } else {
                                (GameCanvas.panel2 = new Panel()).d();
                                GameCanvas.panel2.show();
                            }
                        }

                        GameCanvas.panel.tabName[1] = GameCanvas.panel.H;
                        if (var241 == 2) {
                            String[][] var293 = GameCanvas.panel.tabName[1];
                            if (var236) {
                                GameCanvas.panel.tabName[1] = new String[][]{var293[0], var293[1], var293[2], var293[3]};
                            } else {
                                GameCanvas.panel.tabName[1] = new String[][]{var293[0], var293[1], var293[2], var293[3], var293[4]};
                            }
                        }

                        GameCanvas.panel.a((int) var241);
                        GameCanvas.panel.show();
                        break;
                    case -43:
                        var219 = msg.reader().readByte();
                        var221 = msg.reader().readByte();
                        var5 = msg.reader().readByte();
                        String var234 = msg.reader().readUTF();
                        GameCanvas.panel.a(var219, var234, var221, var5);
                        break;
                    case -42:
                        Char.myCharz().cp = msg.readInt3Byte();
                        Char.myCharz().cq = msg.readInt3Byte();
                        Char.myCharz().co = msg.reader().readInt();
                        Char.myCharz().cHPFull = msg.readInt3Byte();
                        Char.myCharz().cMPFull = msg.readInt3Byte();
                        Char.myCharz().cHP = msg.readInt3Byte();
                        Char.myCharz().cMP = msg.readInt3Byte();
                        Char.myCharz().O = msg.reader().readByte();
                        Char.myCharz().ct = msg.reader().readByte();
                        Char.myCharz().cu = msg.reader().readByte();
                        Char.myCharz().cv = msg.reader().readByte();
                        Char.myCharz().cDamFull = msg.reader().readInt();
                        Char.myCharz().cDefull = msg.reader().readInt();
                        Char.myCharz().cCriticalFull = msg.reader().readByte();
                        Char.myCharz().cTiemNang = msg.reader().readLong();
                        Char.myCharz().cz = msg.reader().readShort();
                        Char.myCharz().cr = msg.reader().readShort();
                        Char.myCharz().cs = msg.reader().readByte();
                        InfoDlg.hide();
                        break;
                    case -41:
                        var290 = msg.reader().readByte();
                        Char.myCharz().bh = new String[var290];
                        int var292 = 0;

                        while (true) {
                            if (var292 >= var290) {
                                break label5279;
                            }

                            String var297 = msg.reader().readUTF();
                            Char.myCharz().bh[var292] = var297;
                            ++var292;
                        }
                    case -37:
                        var2 = msg.reader().readByte();
                        Res.out("cAction= " + var2);
                        if (var2 == 0) {
                            Char.myCharz().head = msg.reader().readShort();
                            Char.myCharz().setDefaultPart();
                            var3 = msg.reader().readUnsignedByte();
                            Res.out("num body = " + var3);
                            Char.myCharz().arrItemBody = new Item[var3];

                            for (var222 = 0; var222 < var3; ++var222) {
                                if ((var235 = msg.reader().readShort()) != -1) {
                                    Char.myCharz().arrItemBody[var222] = new Item();
                                    Char.myCharz().arrItemBody[var222].template = ItemTemplates.get(var235);
                                    var233 = Char.myCharz().arrItemBody[var222].template.type;
                                    Char.myCharz().arrItemBody[var222].quantity = msg.reader().readInt();
                                    Char.myCharz();
                                    msg.reader().readUTF();
                                    Char.myCharz();
                                    msg.reader().readUTF();
                                    if ((var227 = msg.reader().readUnsignedByte()) != 0) {
                                        Char.myCharz().arrItemBody[var222].itemOption = new ItemOption[var227];

                                        for (var8 = 0; var8 < Char.myCharz().arrItemBody[var222].itemOption.length; ++var8) {
                                            var9 = msg.reader().readUnsignedByte();
                                            var64 = msg.reader().readUnsignedShort();
                                            if (var9 != -1) {
                                                Char.myCharz().arrItemBody[var222].itemOption[var8] = new ItemOption(var9, var64);
                                            }
                                        }
                                    }

                                    if (var233 == 0) {
                                        Char.myCharz().body = Char.myCharz().arrItemBody[var222].template.part;
                                    } else if (var233 == 1) {
                                        Char.myCharz().leg = Char.myCharz().arrItemBody[var222].template.part;
                                    }
                                }
                            }
                        }

                        Res.out("head= " + Char.myCharz().head + " body= " + Char.myCharz().body + " leg= " + Char.myCharz().leg);
                        break;
                    case -36:
                        var219 = msg.reader().readByte();
                        Res.out("cAction= " + var219);
                        if (var219 == 0) {
                            var222 = msg.reader().readUnsignedByte();
                            Char.myCharz().arrItemBag = new Item[var222];
                            GameScr.t = 0;
                            Res.out("numC=" + var222);

                            for (var224 = 0; var224 < var222; ++var224) {
                                if ((var230 = msg.reader().readShort()) != -1) {
                                    Char.myCharz().arrItemBag[var224] = new Item();
                                    Char.myCharz().arrItemBag[var224].template = ItemTemplates.get(var230);
                                    Char.myCharz().arrItemBag[var224].quantity = msg.reader().readInt();
                                    Char.myCharz();
                                    msg.reader().readUTF();
                                    Char.myCharz();
                                    msg.reader().readUTF();
                                    Char.myCharz().arrItemBag[var224].indexUI = var224;
                                    if ((var227 = msg.reader().readUnsignedByte()) != 0) {
                                        Char.myCharz().arrItemBag[var224].itemOption = new ItemOption[var227];

                                        for (var8 = 0; var8 < Char.myCharz().arrItemBag[var224].itemOption.length; ++var8) {
                                            var9 = msg.reader().readUnsignedByte();
                                            var64 = msg.reader().readUnsignedShort();
                                            if (var9 != -1) {
                                                Char.myCharz().arrItemBag[var224].itemOption[var8] = new ItemOption(var9, var64);
                                            }
                                        }

                                        Char.myCharz().arrItemBag[var224].compare = GameCanvas.panel.getCompare(Char.myCharz().arrItemBag[var224]);
                                    }

                                    Char.myCharz().arrItemBag[var224].template.getClass();
                                    if (Char.myCharz().arrItemBag[var224].template.type == 6) {
                                        GameScr.t += Char.myCharz().arrItemBag[var224].quantity;
                                    }
                                }
                            }
                        }

                        if (var219 == 2) {
                            var221 = msg.reader().readByte();
                            var224 = msg.reader().readInt();
                            var6 = Char.myCharz().arrItemBag[var221].quantity;
                            Char.myCharz().arrItemBag[var221].quantity = var224;
                            if (Char.myCharz().arrItemBag[var221].quantity < var6 && Char.myCharz().arrItemBag[var221].template.type == 6) {
                                GameScr.t -= var6 - Char.myCharz().arrItemBag[var221].quantity;
                            }

                            if (Char.myCharz().arrItemBag[var221].quantity == 0) {
                                Char.myCharz().arrItemBag[var221] = null;
                            }
                        }
                        break;
                    case -35:
                        var221 = msg.reader().readByte();
                        Res.out("cAction= " + var221);
                        if (var221 == 0) {
                            var224 = msg.reader().readUnsignedByte();
                            Char.myCharz().aF = new Item[var224];
                            GameCanvas.panel.L = 0;

                            for (var6 = 0; var6 < var224; ++var6) {
                                if ((var7 = msg.reader().readShort()) != -1) {
                                    Char.myCharz().aF[var6] = new Item();
                                    Char.myCharz().aF[var6].template = ItemTemplates.get(var7);
                                    Char.myCharz().aF[var6].quantity = msg.reader().readInt();
                                    Char.myCharz();
                                    msg.reader().readUTF();
                                    Char.myCharz();
                                    msg.reader().readUTF();
                                    if ((var8 = msg.reader().readUnsignedByte()) != 0) {
                                        Char.myCharz().aF[var6].itemOption = new ItemOption[var8];

                                        for (var9 = 0; var9 < Char.myCharz().aF[var6].itemOption.length; ++var9) {
                                            var64 = msg.reader().readUnsignedByte();
                                            var65 = msg.reader().readUnsignedShort();
                                            if (var64 != -1) {
                                                Char.myCharz().aF[var6].itemOption[var9] = new ItemOption(var64, var65);
                                            }
                                        }
                                    }

                                    ++GameCanvas.panel.L;
                                }
                            }
                        }

                        if (var221 == 1) {
                            boolean var225 = false;

                            try {
                                if (msg.reader().readByte() == 1) {
                                    var225 = true;
                                }
                            } catch (Exception var199) {
                                ;
                            }

                            GameCanvas.panel.m();
                            GameCanvas.panel.ag = var225;
                            GameCanvas.panel.show();
                        }

                        if (var221 == 2) {
                            var5 = msg.reader().readByte();
                            var6 = msg.reader().readInt();
                            Char.myCharz().aF[var5].quantity = var6;
                            if (Char.myCharz().aF[var5].quantity == 0) {
                                Char.myCharz().aF[var5] = null;
                            }
                        }
                        break;
                    case -34:
                        var66 = msg.reader().readByte();
                        Res.out("act= " + var66);
                        if (var66 == 0 && GameScr.gI().aL != null) {
                            Res.out("toi duoc day");
                            nr_k var295;
                            (var295 = GameScr.gI().aL).a = msg.reader().readShort();
                            var295.e = msg.reader().readUTF();
                            var295.e = Res.changeString(var295.e);
                            msg.reader().readShort();
                            msg.reader().readShort();
                            msg.reader().readByte();
                            var295.b = msg.reader().readShort();
                            var295.d = msg.reader().readShort();
                            Res.out("curr Peas= " + var295.b);
                            msg.reader().readUTF();
                            var295.l = msg.reader().readInt();
                            var68 = msg.reader().readByte();
                            var295.g = new int[var68];
                            var295.h = new int[var68];

                            for (var69 = 0; var69 < var68; ++var69) {
                                var295.g[var69] = msg.reader().readByte();
                                var295.h[var69] = msg.reader().readByte();
                            }

                            var295.f = msg.reader().readBoolean();
                            var295.m = var295.n = System.currentTimeMillis();
                            GameScr.gI().aL.i = true;
                        }

                        if (var66 == 1) {
                            MyVector var296 = new MyVector("vmenu controle 2");

                            try {
                                while (msg.reader().available() > 0) {
                                    String var299 = msg.reader().readUTF();
                                    var296.addElement(new Command(var299, GameCanvas.h, 888392, (Object) null));
                                }
                            } catch (Exception var204) {
                                ;
                            }

                            GameCanvas.menu.a(var296);
                        }

                        if (var66 == 2) {
                            GameScr.gI().aL.c = msg.reader().readShort();
                            Res.out("Curr pea= " + GameScr.gI().aL.c);
                            GameScr.gI().aL.l = msg.reader().readInt();
                            GameScr.gI().aL.m = GameScr.gI().aL.n = System.currentTimeMillis();
                            GameScr.gI().aL.i = true;
                            GameScr.gI().aL.k = true;
                        }
                        break;
                    case -32:
                        short var79 = msg.reader().readShort();
                        Res.out("BACK GROUND template id= " + var79);
                        int var80 = msg.reader().readInt();
                        Image var82 = null;

                        byte[] var81;
                        try {
                            var81 = new byte[var80];
                            msg.reader().read(var81, 0, var80);
                            var82 = Image.createImage(var81, 0, var80);
                            nr_ct.k.put(String.valueOf(var79), var82);
                        } catch (Exception var198) {
                            var81 = null;
                            nr_ct.k.put(String.valueOf(var79), Image.createRGBImage(new int[]{-2013265920}, 1, 1, true));
                        }

                        if (var81 != null && mGraphics.zoomLevel > 1) {
                            Rms.a(mGraphics.zoomLevel + "bgItem" + var79, var81);
                        }
                        break;
                    case -31:
                        TileMap.u.removeAllElements();
                        short var129 = msg.reader().readShort();
                        Res.out("nItem= " + var129);
                        var130 = 0;

                        while (true) {
                            if (var130 >= var129) {
                                break label5279;
                            }

                            nr_ct var346;
                            (var346 = new nr_ct()).a = var130;
                            var346.c = msg.reader().readShort();
                            var346.h = msg.reader().readByte();
                            var346.f = msg.reader().readShort();
                            var346.g = msg.reader().readShort();
                            byte var343 = msg.reader().readByte();
                            var346.i = new int[var343];
                            var346.j = new int[var343];

                            for (int var344 = 0; var344 < var343; ++var344) {
                                var346.i[var130] = msg.reader().readByte();
                                var346.j[var130] = msg.reader().readByte();
                            }

                            TileMap.u.addElement(var346);
                            ++var130;
                        }
                    case -30:
                        this.f(msg);
                        break;
                    case -29:
                        e(msg);
                        break;
                    case -28:
                        this.d(msg);
                        break;
                    case -26:
                        nr_bo.s = 2;
                        GameCanvas.a(msg.reader().readUTF());
                        InfoDlg.hide();
                        nr_x.c = false;
                        Char.bH = false;
                        if (GameCanvas.currentScreen == GameCanvas.loginScr) {
                            GameCanvas.af.b();
                        }
                        break;
                    case -25:
                        GameScr.aC.a(msg.reader().readUTF(), 0);
                        break;
                    case -24:
                        Char.bH = true;
                        Res.out("GET MAP INFO");
                        GameScr.gI().aL = null;
                        GameCanvas.d = true;
                        GameScr.g();
                        GameCanvas.g();
                        TileMap.t.removeAllElements();
                        PopUp.a.removeAllElements();
                        System.gc();
                        TileMap.l = msg.reader().readUnsignedByte();
                        TileMap.r = msg.reader().readByte();
                        TileMap.e = msg.reader().readByte();
                        TileMap.o = msg.reader().readByte();
                        Res.out("load planet from server: " + TileMap.r + "bgType= " + TileMap.p + ".............................");
                        msg.reader().readByte();
                        TileMap.k = msg.reader().readUTF();
                        TileMap.n = msg.reader().readByte();

                        try {
                            TileMap.d(TileMap.l);
                        } catch (Exception var210) {
                            Res.out("load map from server: " + TileMap.l);
                            Service.gI().requestMaptemplate(TileMap.l);
                            this.messWait = msg;
                            return;
                        }
                        this.c(msg);

                        try {
                            TileMap.j = msg.reader().readByte() != 0;
                        } catch (Exception var190) {
                            ;
                        }

                        GameScr.j = GameScr.l;
                        GameScr.k = GameScr.m;
                        break;
                    case -22:
                        Char.bG = true;
                        Char.bF = true;
                        GameScr.gI();
                        GameScr.gI();
                        Char.myCharz().aP = null;
                        Char.myCharz().aS = null;
                        Char.myCharz().aT = null;
                        Char.myCharz().itemFocus = null;
                        Char.myCharz().aV.removeAllElements();
                        Char.myCharz().aZ = -9999;
                        Char.myCharz().ba = -9999;
                        GameScr.gI().q();
                        GameScr.gI().cb = null;
                        break;
                    case -21:
                        var108 = msg.reader().readShort();
                        var326 = 0;

                        while (true) {
                            if (var326 >= GameScr.vItemMap.size()) {
                                break label5279;
                            }

                            if (((ItemMap) GameScr.vItemMap.elementAt(var326)).itemMapID == var108) {
                                GameScr.vItemMap.removeElementAt(var326);
                                break label5279;
                            }

                            ++var326;
                        }
                    case -20:
                        Char.myCharz().itemFocus = null;
                        var108 = msg.reader().readShort();
                        var326 = 0;

                        while (true) {
                            if (var326 >= GameScr.vItemMap.size()) {
                                break label5279;
                            }

                            if ((var329 = (ItemMap) GameScr.vItemMap.elementAt(var326)).itemMapID == var108) {
                                var329.setPoint(Char.myCharz().cx, Char.myCharz().cy - 10);
                                String var330 = msg.reader().readUTF();
                                var112 = 0;

                                try {
                                    var112 = msg.reader().readShort();
                                    if (var329.template.type == 9) {
                                        var112 = msg.reader().readShort();
                                        var10000 = Char.myCharz();
                                        var10000.as += (long) var112;
                                        Char.myCharz().xuStr = Main.a(Char.myCharz().as);
                                    } else if (var329.template.type == 10) {
                                        var112 = msg.reader().readShort();
                                        var10000 = Char.myCharz();
                                        var10000.au += var112;
                                        Char.myCharz().luongStr = Main.a((long) Char.myCharz().au);
                                    } else if (var329.template.type == 34) {
                                        var112 = msg.reader().readShort();
                                        var10000 = Char.myCharz();
                                        var10000.av += var112;
                                        Char.myCharz().luongKhoaStr = Main.a((long) Char.myCharz().av);
                                    }
                                } catch (Exception var193) {
                                    ;
                                }

                                if (var330.equals("")) {
                                    if (var329.template.type == 9) {
                                        GameScr.a((var112 < 0 ? "" : "+") + var112, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al, 0, -2, 1);
                                        SoundMn.gI();
                                    } else if (var329.template.type == 10) {
                                        GameScr.a((var112 < 0 ? "" : "+") + var112, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al, 0, -2, 2);
                                        SoundMn.gI();
                                    } else if (var329.template.type == 34) {
                                        GameScr.a((var112 < 0 ? "" : "+") + var112, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al, 0, -2, 0);
                                        SoundMn.gI();
                                    } else {
                                        GameScr.aC.a(mResources.bF + " " + (var112 > 0 ? var112 + " " : "") + var329.template.name, 0);
                                        SoundMn.gI();
                                    }

                                    if (var112 > 0 && Char.myCharz().petFollow != null && Char.myCharz().petFollow.a == 4683) {
                                        ServerEffect.addServerEffect(55, Char.myCharz().petFollow.i, Char.myCharz().petFollow.e, 1);
                                        ServerEffect.addServerEffect(55, Char.myCharz().cx, Char.myCharz().cy, 1);
                                    }
                                } else if (var330.length() != 1) {
                                    GameScr.aC.a(var330, 0);
                                }
                                break label5279;
                            }

                            ++var326;
                        }
                    case -19:
                        var108 = msg.reader().readShort();
                        var89 = GameScr.findCharInMap(msg.reader().readInt());
                        var326 = 0;

                        while (true) {
                            if (var326 >= GameScr.vItemMap.size()) {
                                break label5279;
                            }

                            if ((var329 = (ItemMap) GameScr.vItemMap.elementAt(var326)).itemMapID == var108) {
                                if (var89 == null) {
                                    return;
                                }

                                var329.setPoint(var89.cx, var89.cy - 10);
                                if (var329.x < var89.cx) {
                                    var89.I = -1;
                                } else if (var329.x > var89.cx) {
                                    var89.I = 1;
                                }
                                break label5279;
                            }

                            ++var326;
                        }
                    case -18:
                        byte var325 = msg.reader().readByte();
                        GameScr.vItemMap.addElement(new ItemMap(msg.reader().readShort(), Char.myCharz().arrItemBag[var325].template.id, Char.myCharz().cx, Char.myCharz().cy, msg.reader().readShort(), msg.reader().readShort()));
                        Char.myCharz().arrItemBag[var325] = null;
                        break;
                    case -14:
                        if ((var89 = GameScr.findCharInMap(msg.reader().readInt())) == null) {
                            return;
                        }

                        GameScr.vItemMap.addElement(new ItemMap(msg.reader().readShort(), msg.reader().readShort(), var89.cx, var89.cy, msg.reader().readShort(), msg.reader().readShort()));
                        break;
                    case -4:
                        if ((var89 = GameScr.findCharInMap(msg.reader().readInt())) == null) {
                            return;
                        }

                        if ((TileMap.b(var89.cx, var89.cy) & 2) == 2) {
                            var89.a(GameScr.u[msg.reader().readUnsignedByte()], 0);
                        } else {
                            var89.a(GameScr.u[msg.reader().readUnsignedByte()], 1);
                        }

                        var89.aW = new Mob[msg.reader().readByte()];

                        for (var130 = 0; var130 < var89.aW.length; ++var130) {
                            Mob var342 = (Mob) GameScr.vMob.elementAt(msg.reader().readByte());
                            var89.aW[var130] = var342;
                            if (var130 == 0) {
                                if (var89.cx <= var342.m) {
                                    var89.I = 1;
                                } else {
                                    var89.I = -1;
                                }
                            }
                        }

                        var89.aT = null;
                        var89.aP = var89.aW[0];
                        var340 = new Char[10];
                        var131 = 0;

                        try {
                            for (var131 = 0; var131 < var340.length; ++var131) {
                                Char var341;
                                if ((var90 = msg.reader().readInt()) == Char.myCharz().charID) {
                                    var341 = Char.myCharz();
                                } else {
                                    var341 = GameScr.findCharInMap(var90);
                                }

                                var340[var131] = var341;
                                if (var131 == 0) {
                                    if (var89.cx <= var341.cx) {
                                        var89.I = 1;
                                    } else {
                                        var89.I = -1;
                                    }
                                }
                            }
                        } catch (Exception var208) {
                            ;
                        }

                        if (var131 > 0) {
                            var89.aX = new Char[var131];

                            for (var131 = 0; var131 < var89.aX.length; ++var131) {
                                var89.aX[var131] = var340[var131];
                            }

                            var89.aT = var89.aX[0];
                            var89.aP = null;
                        }
                        break;
                    case 1:
                        var217 = msg.reader().readBoolean();
                        Res.out("isRes= " + var217);
                        if (!var217) {
                            GameCanvas.a(msg.reader().readUTF());
                        } else {
                            GameCanvas.loginScr.isLogin2 = false;
                            Rms.a("userAo" + nr_bo.m, "");
                            GameCanvas.g();
                            GameCanvas.loginScr.a();
                        }
                        break;
                    case 2:
                        Char.bH = true;
                        if (!GameScr.b) {
                            GameScr.gI().a();
                        }

                        nr_ct.a();
                        GameCanvas.g();
                        nr_cq.b = true;
                        nr_cq.a().b();
                        break;
                    case 6:
                        Char.myCharz().as = msg.reader().readLong();
                        Char.myCharz().au = msg.reader().readInt();
                        Char.myCharz().av = msg.reader().readInt();
                        Char.myCharz().xuStr = Main.a(Char.myCharz().as);
                        Char.myCharz().luongStr = Main.a((long) Char.myCharz().au);
                        Char.myCharz().luongKhoaStr = Main.a((long) Char.myCharz().av);
                        GameCanvas.g();
                        break;
                    case 7:
                        byte var338 = msg.reader().readByte();
                        short var339 = msg.reader().readShort();
                        String var128 = msg.reader().readUTF();
                        GameCanvas.panel.a(var338, var128, var339);
                        break;
                    case 11:
                        byte var67 = msg.reader().readByte();
                        Res.out("====> 2 NEW DATA TEMPLATE  = " + var67);
                        if ((var68 = msg.reader().readByte()) != 0) {
                            Mob.c[var67].f.a(NinjaUtil.a(msg), var68);
                        } else {
                            Mob.c[var67].f.a(NinjaUtil.a(msg));
                        }

                        for (var69 = 0; var69 < GameScr.vMob.size(); ++var69) {
                            Mob var70;
                            if ((var70 = (Mob) GameScr.vMob.elementAt(var69)).C == var67) {
                                var70.v = Mob.c[var67].f.f;
                                var70.w = Mob.c[var67].f.g;
                            }
                        }

                        for (var69 = 0; var69 < GameScr.D.size(); ++var69) {
                            Char var302;
                            if ((var302 = (Char) GameScr.D.elementAt(var69)) != null && var302.mobMe != null && var302.mobMe.C == var67) {
                                var302.mobMe.v = Mob.c[var67].f.f;
                                var302.mobMe.w = Mob.c[var67].f.g;
                            }
                        }

                        if (Char.myCharz().mobMe != null && Char.myCharz().mobMe.C == var67) {
                            nr_dr var10001 = Mob.c[var67];
                            Char.myCharz().mobMe.v = var10001.f.f;
                            var10001 = Mob.c[var67];
                            Char.myCharz().mobMe.w = var10001.f.g;
                        }

                        byte[] var303 = NinjaUtil.a(msg);
                        Res.out("mob image lent= " + var303.length);
                        Image var304 = Image.createImage(var303, 0, var303.length);
                        Mob.c[var67].f.a = var304;
                        var71 = msg.reader().readByte();
                        Mob.c[var67].f.e = var71;
                        if (var71 == 1 || var71 == 2) {
                            b(msg, var67);
                        }
                        break;
                    case 20:
                        this.h(msg);
                        break;
                    case 24:
                        i(msg);
                        break;
                    case 27:
                        var92 = new MyVector("menu open ui");
                        msg.reader().readUTF();
                        var2 = msg.reader().readByte();

                        for (var315 = 0; var315 < var2; ++var315) {
                            String var318 = msg.reader().readUTF();
                            Short var319 = new Short(msg.reader().readShort());
                            var92.addElement(new Command(var318, GameCanvas.h, 88819, var319));
                        }

                        GameCanvas.menu.a(var92, 3);
                        break;
                    case 29:
                        GameScr.gI().a(msg);
                        break;
                    case 32:
                        var120 = msg.reader().readShort();
                        Res.out("npc template id= " + var120);

                        for (int var333 = 0; var333 < GameScr.G.size(); ++var333) {
                            Npc var124;
                            if ((var124 = (Npc) GameScr.G.elementAt(var333)).cW.a == var120 && var124.equals(Char.myCharz().aS)) {
                                String var125 = msg.reader().readUTF();
                                String[] var126 = new String[msg.reader().readByte()];

                                for (int var127 = 0; var127 < var126.length; ++var127) {
                                    var126[var127] = msg.reader().readUTF();
                                }

                                GameScr.gI();
                                GameScr.a(var126, var124);
                                ChatPopup.c(var125, 100000, var124);
                                return;
                            }
                        }

                        var123 = new Npc(var120, 0, -100, 100, var120, GameScr.aC.a[Char.myCharz().cgender][2]);
                        Res.out(Char.myCharz().aS != null ? "!null" : "null");
                        String var334 = msg.reader().readUTF();
                        String[] var335 = new String[msg.reader().readByte()];

                        for (int var336 = 0; var336 < var335.length; ++var336) {
                            var335[var336] = msg.reader().readUTF();
                        }

                        try {
                            short var337 = msg.reader().readShort();
                            var123.aN = var337;
                        } catch (Exception var191) {
                            ;
                        }

                        Res.out(Char.myCharz().aS != null ? "!null" : "null");
                        GameScr.gI();
                        GameScr.a(var335, var123);
                        ChatPopup.c(var334, 100000, var123);
                        break;
                    case 33:
                        InfoDlg.hide();
                        GameCanvas.f();
                        GameCanvas.e();
                        var92 = new MyVector("vt menu");

                        try {
                            while (true) {
                                String var316 = msg.reader().readUTF();
                                var92.addElement(new Command(var316, GameCanvas.h, 88822, (Object) null));
                            }
                        } catch (Exception var212) {
                            if (Char.myCharz().aS == null) {
                                return;
                            }

                            for (var315 = 0; var315 < Char.myCharz().aS.cW.f.length; ++var315) {
                                String[] var317 = Char.myCharz().aS.cW.f[var315];
                                var92.addElement(new Command(var317[0], GameCanvas.h, 88820, var317));
                            }

                            GameCanvas.menu.a(var92);
                            break;
                        }
                    case 38:
                        InfoDlg.hide();
                        var120 = msg.reader().readShort();
                        Res.out("OPEN_UI_SAY ID= " + var120);
                        var121 = Res.changeString(msg.reader().readUTF());

                        for (int var122 = 0; var122 < GameScr.G.size(); ++var122) {
                            var123 = (Npc) GameScr.G.elementAt(var122);
                            Res.out("npc id= " + var123.cW.a);
                            if (var123.cW.a == var120) {
                                ChatPopup.b(var121, 100000, var123);
                                GameCanvas.panel.z();
                                return;
                            }
                        }

                        Npc var332;
                        if ((var332 = new Npc(var120, 0, 0, 0, var120, GameScr.aC.a[Char.myCharz().cgender][2])).cW.a == 5) {
                            var332.charID = 5;
                        }

                        try {
                            var332.aN = msg.reader().readShort();
                        } catch (Exception var192) {
                            ;
                        }

                        ChatPopup.b(var121, 100000, var332);
                        GameCanvas.panel.z();
                        break;
                    case 39:
                        GameScr.gI().aa = 2;
                        GameScr.gI();
                        break;
                    case 40:
                        GameCanvas.w = 150;
                        short var99 = msg.reader().readShort();
                        byte var100 = msg.reader().readByte();
                        Res.out("TASK GET index= " + var100);
                        String var101 = Res.changeString(msg.reader().readUTF());
                        String var102 = Res.changeString(msg.reader().readUTF());
                        String[] var103;
                        String[] var104 = new String[(var103 = new String[msg.reader().readByte()]).length];
                        GameScr.ab = new int[var103.length];
                        GameScr.ac = new int[var103.length];
                        short[] var105 = new short[var103.length];
                        short var106 = -1;

                        int var320;
                        for (var320 = 0; var320 < var103.length; ++var320) {
                            String var322 = Res.changeString(msg.reader().readUTF());
                            GameScr.ab[var320] = msg.reader().readByte();
                            GameScr.ac[var320] = msg.reader().readShort();
                            String var324 = Res.changeString(msg.reader().readUTF());
                            var105[var320] = -1;
                            if (!var322.equals("")) {
                                var103[var320] = var322;
                                var104[var320] = var324;
                            }
                        }

                        try {
                            var106 = msg.reader().readShort();

                            for (var320 = 0; var320 < var103.length; ++var320) {
                                var105[var320] = msg.reader().readShort();
                            }
                        } catch (Exception var206) {
                            ;
                        }

                        Char.myCharz().taskMaint = new NinjaUtil(var99, var100, var101, var102, var103, var105, var106, var104);
                        if (Char.myCharz().aS != null) {
                            Npc.Y();
                        }

                        Char.taskAction(false);
                        break;
                    case 41:
                        GameCanvas.w = 100;
                        Res.out("TASK NEXT");
                        ++Char.myCharz().taskMaint.a;
                        Char.myCharz().taskMaint.h = 0;
                        Npc.Y();
                        Char.taskAction(true);
                        break;
                    case 43:
                        GameCanvas.w = 50;
                        Char.myCharz().taskMaint.h = msg.reader().readShort();
                        if (Char.myCharz().aS != null) {
                            Npc.Y();
                        }

                        try {
                            var108 = msg.reader().readShort();
                            short var323 = msg.reader().readShort();
                            Char.myCharz().bz = var108;
                            Char.myCharz().bA = var323;
                            Res.out("CMD   TASK_UPDATE:43_mapID =    x|y " + var108 + "|" + var323);
                            int var328 = 0;

                            while (true) {
                                if (var328 >= TileMap.t.size()) {
                                    break label5279;
                                }

                                Res.out("===> " + TileMap.t.elementAt(var328));
                                ++var328;
                            }
                        } catch (Exception var209) {
                            break;
                        }
                    case 46:
                        Char.bG = false;
                        Char.myCharz().a((int) msg.reader().readShort(), (int) msg.reader().readShort());
                        break;
                    case 47:
                        GameScr.gI().q();
                        break;
                    case 50:
                        byte var107 = msg.reader().readByte();
                        Panel.aq.removeAllElements();
                        int var321 = 0;

                        while (true) {
                            if (var321 >= var107) {
                                break label5279;
                            }

                            nr_ay var109;
                            (var109 = new nr_ay()).c = msg.reader().readShort();
                            var109.a = msg.reader().readUTF();
                            var109.b = msg.reader().readUTF();
                            Panel.aq.addElement(var109);
                            boolean var327 = Rms.loadRmsInt(String.valueOf(var109.c)) != -1;
                            var109.d = var327;
                            ++var321;
                        }
                    case 54:
                        if ((var89 = GameScr.findCharInMap(msg.reader().readInt())) == null) {
                            return;
                        }

                        int var132 = msg.reader().readUnsignedByte();
                        if ((TileMap.b(var89.cx, var89.cy) & 2) == 2) {
                            var89.a(GameScr.u[var132], 0);
                        } else {
                            var89.a(GameScr.u[var132], 1);
                        }

                        Mob[] var133 = new Mob[10];
                        var131 = 0;

                        try {
                            for (var131 = 0; var131 < var133.length; ++var131) {
                                //"SA769991v4-num" + var131;
                                Mob var134 = (Mob) GameScr.vMob.elementAt(msg.reader().readByte());
                                var133[var131] = var134;
                                if (var131 == 0) {
                                    if (var89.cx <= var134.m) {
                                        var89.I = 1;
                                    } else {
                                        var89.I = -1;
                                    }
                                }
                                //"SA769991v5-num" + var131;
                            }
                        } catch (Exception var207) {
                            ;
                        }

                        if (var131 > 0) {
                            var89.aW = new Mob[var131];

                            for (var131 = 0; var131 < var89.aW.length; ++var131) {
                                var89.aW[var131] = var133[var131];
                            }

                            var89.aT = null;
                            var89.aP = var89.aW[0];
                        }
                        break;
                    case 56:
                        boolean var312;
                        int var313;
                        byte var314;
                        if ((var90 = msg.reader().readInt()) == Char.myCharz().charID) {
                            var312 = false;
                            (var89 = Char.myCharz()).cHP = msg.readInt3Byte();
                            if ((var313 = msg.readInt3Byte()) != 0) {
                                var89.J();
                            }

                            try {
                                var312 = msg.reader().readBoolean();
                                if ((var314 = msg.reader().readByte()) != -1) {
                                    Res.out("hit eff= " + var314);
                                    EffecMn.addEff(new Effect(var314, var89.cx, var89.cy, 3, 1, -1));
                                }
                            } catch (Exception var197) {
                                ;
                            }

                            if (Char.myCharz().aM != 4) {
                                if (var313 == 0) {
                                    GameScr.a(mResources.cB, var89.cx, var89.cy - var89.al, 0, -3, 7);
                                } else {
                                    GameScr.a("-" + var313, var89.cx, var89.cy - var89.al, 0, -3, !var312 ? 0 : 3);
                                }
                            }
                        } else {
                            if ((var89 = GameScr.findCharInMap(var90)) == null) {
                                return;
                            }

                            var89.cHP = msg.readInt3Byte();
                            var312 = false;
                            if ((var313 = msg.readInt3Byte()) != 0) {
                                var89.J();
                            }

                            try {
                                var312 = msg.reader().readBoolean();
                                if ((var314 = msg.reader().readByte()) != -1) {
                                    Res.out("hit eff= " + var314);
                                    EffecMn.addEff(new Effect(var314, var89.cx, var89.cy, 3, 1, -1));
                                }
                            } catch (Exception var196) {
                                ;
                            }

                            if (var89.aM != 4) {
                                if (var313 == 0) {
                                    GameScr.a(mResources.cB, var89.cx, var89.cy - var89.al, 0, -3, 4);
                                } else {
                                    GameScr.a("-" + var313, var89.cx, var89.cy - var89.al, 0, -3, !var312 ? 5 : 3);
                                }
                            }
                        }
                        break;
                    case 57:
                        (var92 = new MyVector("vmenu UI")).addElement(new Command(msg.reader().readUTF(), GameCanvas.h, 88817, (Object) null));
                        GameCanvas.menu.a(var92);
                        break;
                    case 58:
                        Char var93;
                        if ((var90 = msg.reader().readInt()) == Char.myCharz().charID) {
                            var93 = Char.myCharz();
                        } else {
                            var93 = GameScr.findCharInMap(var90);
                        }

                        var93.aY = new short[3];
                        var93.aY[0] = 0;
                        short var95 = msg.reader().readShort();
                        short var96 = msg.reader().readShort();
                        var93.aY[1] = var95;
                        var93.aY[2] = var96;

                        try {
                            Char var94;
                            if ((var90 = msg.reader().readInt()) == Char.myCharz().charID) {
                                var94 = Char.myCharz();
                            } else {
                                var94 = GameScr.findCharInMap(var90);
                            }

                            var94.cx = var95;
                            var94.cy = var96;
                        } catch (Exception var194) {
                            var194.printStackTrace();
                        }
                        break;
                    case 62:
                        if ((var89 = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                            var89.ba = Char.myCharz().charID;
                            Char.myCharz().aS = null;
                            Char.myCharz().aP = null;
                            Char.myCharz().itemFocus = null;
                            Char.myCharz().aT = var89;
                            Char.cl = true;
                            GameScr.aC.a(var89.cName + mResources.bD, 0);
                        }
                        break;
                    case 63:
                        Char.myCharz().ba = msg.reader().readInt();
                        Char.myCharz().aS = null;
                        Char.myCharz().aP = null;
                        Char.myCharz().itemFocus = null;
                        Char.myCharz().aT = GameScr.findCharInMap(Char.myCharz().ba);
                        Char.cl = true;
                        break;
                    case 64:
                        var89 = Char.myCharz();

                        try {
                            var89 = GameScr.findCharInMap(msg.reader().readInt());
                        } catch (Exception var195) {
                            ;
                        }

                        var89.ba = -9999;
                        break;
                    case 65:
                        var2 = msg.reader().readByte();
                        String var216 = msg.reader().readUTF();
                        var220 = msg.reader().readShort();
                        if (nr_cs.b(var2)) {
                            if (var220 != 0) {
                                nr_cs.d(var2).a(var2, var216, var220);
                            } else {
                                GameScr.bv.removeElement(nr_cs.d(var2));
                            }
                        } else {
                            nr_cs var223;
                            (var223 = new nr_cs()).a(var2, var216, var220);
                            GameScr.bv.addElement(var223);
                        }

                        Res.out("idMessageTime + messageStr + timeMessage:::  " + var2 + "_" + var216 + "_" + var220);
                        break;
                    case 66:
                        this.g(msg);
                        break;
                    case 68:
                        Res.out("ADD ITEM TO MAP --------------------------------------");
                        var108 = msg.reader().readShort();
                        short var110 = msg.reader().readShort();
                        short var111 = msg.reader().readShort();
                        var112 = msg.reader().readShort();
                        int var113 = msg.reader().readInt();
                        short var114 = 0;
                        if (var113 == -2) {
                            var114 = msg.reader().readShort();
                        }

                        ItemMap var115 = new ItemMap(var113, var108, var110, var111, var112, var114);
                        GameScr.vItemMap.addElement(var115);
                        break;
                    case 69:
                        SoundMn.a = msg.reader().readByte() != 0;
                        break;
                    case 81:
                        GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        msg.reader().readBoolean();
                        break;
                    case 82:
                        ((Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte())).z = msg.reader().readBoolean();
                        break;
                    case 83:
                        if ((var90 = msg.reader().readInt()) == Char.myCharz().charID) {
                            var89 = Char.myCharz();
                        } else {
                            var89 = GameScr.findCharInMap(var90);
                        }

                        if (var89 == null) {
                            return;
                        }

                        Mob var91 = (Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        if (var89.mobMe != null) {
                            var89.mobMe.a(var91);
                        }
                        break;
                    case 84:
                        if ((var90 = msg.reader().readInt()) == Char.myCharz().charID) {
                            var89 = Char.myCharz();
                        } else if ((var89 = GameScr.findCharInMap(var90)) == null) {
                            return;
                        }

                        var89.cHP = var89.cHPFull;
                        var89.cMP = var89.cMPFull;
                        var89.cx = msg.reader().readShort();
                        var89.cy = msg.reader().readShort();
                        var89.K();
                        break;
                    case 85:
                        GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        msg.reader().readBoolean();
                        break;
                    case 86:
                        Mob var88;
                        (var88 = (Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte())).A = msg.reader().readBoolean();
                        if (!var88.A) {
                            ServerEffect.addServerEffect(77, var88.m, var88.n - 9, 1);
                        }
                        break;
                    case 87:
                        ((Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte())).B = msg.reader().readBoolean();
                        break;
                    case 88:
                        String var97 = msg.reader().readUTF();
                        Short var98 = new Short(msg.reader().readShort());
                        GameCanvas.dialog.a(var97, new Command(mResources.bq, GameCanvas.h, 88818, var98), 0);
                        break;
                    case 90:
                        b(msg);
                        break;
                    case 92:
                        if (GameCanvas.currentScreen == GameScr.c) {
                            GameCanvas.g();
                        }

                        String var83 = msg.reader().readUTF();
                        String var84 = Res.changeString(msg.reader().readUTF());
                        Res.out("chat text= " + var84);
                        String var85 = "";
                        Char var86 = null;
                        byte var87 = 0;
                        if (!var83.equals("")) {
                            (var86 = new Char()).charID = msg.reader().readInt();
                            var86.head = msg.reader().readShort();
                            var86.headICON = msg.reader().readShort();
                            var86.body = msg.reader().readShort();
                            var86.bag = msg.reader().readShort();
                            var86.leg = msg.reader().readShort();
                            var87 = msg.reader().readByte();
                            var86.cName = var83;
                        }

                        var85 = var85 + var84;
                        InfoDlg.hide();
                        if (var83.equals("")) {
                            GameScr.aC.a(var85, 0);
                        } else {
                            GameScr.aD.a(var85, var86, var87 == 0);
                            if (GameCanvas.panel.a && GameCanvas.panel.y == 8) {
                                GameCanvas.panel.x();
                            }
                        }
                        break;
                    case 94:
                        GameScr.aC.a(msg.reader().readUTF(), 0);
                        break;
                    case 112:
                        if ((var5 = msg.reader().readByte()) == 0) {
                            Panel.q = msg.reader().readShort();
                            Panel.p = msg.reader().readUTF();
                        } else if (var5 == 1) {
                            var2 = msg.reader().readByte();
                            Char.myCharz().aJ = new String[var2][];
                            Char.myCharz().aK = new short[var2][];
                            GameCanvas.panel.az = new String[var2][];

                            for (var3 = 0; var3 < var2; ++var3) {
                                GameCanvas.panel.az[var3] = new String[2];
                                if ((var4 = Res.a(msg.reader().readUTF(), "\n", 0)).length == 2) {
                                    GameCanvas.panel.az[var3] = var4;
                                }

                                if (var4.length == 1) {
                                    GameCanvas.panel.az[var3][0] = var4[0];
                                    GameCanvas.panel.az[var3][1] = "";
                                }

                                var5 = msg.reader().readByte();
                                Char.myCharz().aJ[var3] = new String[var5];
                                Char.myCharz().aK[var3] = new short[var5];

                                for (var6 = 0; var6 < var5; ++var6) {
                                    Char.myCharz().aK[var3][var6] = msg.reader().readShort();
                                    Char.myCharz().aJ[var3][var6] = msg.reader().readUTF();
                                }
                            }

                            GameCanvas.panel.tabName[25] = GameCanvas.panel.az;
                            GameCanvas.panel.E();
                            GameCanvas.panel.show();
                        }
                }

                Char var283;
                switch (msg.command) {
                    case -75:
                        var256 = null;

                        try {
                            var256 = (Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        } catch (Exception var187) {
                            ;
                        }

                        if (var256 != null) {
                            var256.H = msg.reader().readByte();
                            if (var256.H > 0) {
                                var256.P = Res.b(0, 3);
                                return;
                            }
                        }

                        return;
                    case -73:
                        var221 = msg.reader().readByte();

                        for (var224 = 0; var224 < GameScr.G.size(); ++var224) {
                            if ((var248 = (Npc) GameScr.G.elementAt(var224)).cW.a == var221) {
                                if (msg.reader().readByte() == 0) {
                                    var248.cY = true;
                                } else {
                                    var248.cY = false;
                                }

                                return;
                            }
                        }

                        return;
                    case -17:
                        Char.myCharz().meDead = true;
                        Char.myCharz().aL = msg.reader().readByte();
                        Char.myCharz().a(msg.reader().readShort(), msg.reader().readShort());

                        try {
                            Char.myCharz().cPower = msg.reader().readLong();
                            Char.myCharz().applyCharLevelPercent();
                        } catch (Exception var178) {
                            ;
                        }

                        Char.myCharz();
                        return;
                    case -16:
                        if (Char.myCharz().cm != 0 || Char.myCharz().cn != 0) {
                            Char.myCharz().cx = Char.myCharz().cm;
                            Char.myCharz().cy = Char.myCharz().cn;
                            Char.myCharz().cm = Char.myCharz().cn = 0;
                        }

                        Char.myCharz().K();
                        Char.myCharz().bI = false;
                        Char.myCharz().meDead = false;
                        return;
                    case -13:
                        if ((var9 = msg.reader().readUnsignedByte()) <= GameScr.vMob.size() - 1 && var9 >= 0) {
                            (var256 = (Mob) GameScr.vMob.elementAt(var9)).G = msg.reader().readByte();
                            var256.H = msg.reader().readByte();
                            if (var256.H != 0) {
                                var256.P = Res.b(0, 3);
                            }

                            var256.m = var256.t;
                            var256.n = var256.u;
                            Res.out("HOI SINH x= " + var256.t + " y= " + var256.u);
                            var256.p = 5;
                            var256.V = false;
                            var256.k = msg.reader().readInt();
                            var256.l = var256.k;
                            var256.A();
                            ServerEffect.addServerEffect(60, var256.m, var256.n, 1);
                            return;
                        }

                        return;
                    case -12:
                        Res.out("SERVER SEND MOB DIE");
                        var256 = null;

                        try {
                            var256 = (Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        } catch (Exception var184) {
                            ;
                        }

                        if (var256 != null && var256.p != 0 && var256.p != 0) {
                            var256.k();

                            try {
                                var11 = msg.readInt3Byte();
                                if (msg.reader().readBoolean()) {
                                    GameScr.a("-" + var11, var256.m, var256.n - var256.w, 0, -2, 3);
                                } else {
                                    GameScr.a("-" + var11, var256.m, var256.n - var256.w, 0, -2, 5);
                                }

                                var273 = msg.reader().readByte();

                                for (var275 = 0; var275 < var273; ++var275) {
                                    ItemMap var287 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), var256.m, var256.n, msg.reader().readShort(), msg.reader().readShort());
                                    var3 = msg.reader().readInt();
                                    var287.playerId = var3;
                                    Res.out("playerid= " + var3 + " my id= " + Char.myCharz().charID);
                                    GameScr.vItemMap.addElement(var287);
                                    if (Res.g(var287.y - Char.myCharz().cy) < 24 && Res.g(var287.x - Char.myCharz().cx) < 24) {
                                        Char.myCharz().aT = null;
                                    }
                                }
                            } catch (Exception var203) {
                                ;
                            }

                            return;
                        }

                        return;
                    case -11:
                        var256 = null;

                        try {
                            var11 = msg.reader().readUnsignedByte();
                            Res.out("mob index= " + var11);
                            var256 = (Mob) GameScr.vMob.elementAt(var11);
                        } catch (Exception var182) {
                            ;
                        }

                        if (var256 != null) {
                            Char.myCharz().af = false;
                            Char.bG = false;
                            var11 = msg.readInt3Byte();

                            try {
                                var12 = msg.readInt3Byte();
                            } catch (Exception var181) {
                                var12 = 0;
                            }

                            if (var256.Q) {
                                Char.myCharz().doInjure(var11, var12, false, true);
                            } else {
                                var256.E = var11;
                                var256.F = var12;
                                var256.a(Char.myCharz());
                            }

                            return;
                        }

                        return;
                    case -10:
                        var256 = null;

                        try {
                            var256 = (Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        } catch (Exception var180) {
                            ;
                        }

                        if (var256 == null) {
                            return;
                        }

                        if ((var283 = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                            var11 = msg.readInt3Byte();
                            var256.E = var283.cHP - var11;

                            try {
                                var283.cMP = msg.readInt3Byte();
                            } catch (Exception var179) {
                                ;
                            }

                            if (var256.Q) {
                                var283.doInjure(var256.E, 0, false, true);
                            } else {
                                var256.a(var283);
                            }

                            return;
                        }

                        return;
                    case -9:
                        var256 = null;

                        try {
                            var256 = (Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        } catch (Exception var186) {
                            ;
                        }

                        if (var256 == null) {
                            return;
                        }

                        var256.k = msg.readInt3Byte();
                        var256.A();
                        if ((var11 = msg.readInt3Byte()) != 1) {
                            boolean var281 = msg.reader().readBoolean();
                            if ((var273 = msg.reader().readByte()) != -1) {
                                EffecMn.addEff(new Effect(var273, var256.m, var256.getY(), 3, 1, -1));
                            }

                            if (var281) {
                                GameScr.a("-" + var11, var256.m, var256.getY() - var256.getH(), 0, -2, 3);
                                return;
                            } else {
                                if (var11 == 0) {
                                    var256.m = var256.t;
                                    var256.n = var256.u;
                                    GameScr.a(mResources.cB, var256.m, var256.getY() - var256.getH(), 0, -2, 4);
                                } else {
                                    GameScr.a("-" + var11, var256.m, var256.getY() - var256.getH(), 0, -2, 5);
                                }

                                return;
                            }
                        }

                        return;
                    case -8:
                        if ((var283 = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                            var283.aL = msg.reader().readByte();
                            var283.b(msg.reader().readShort(), msg.reader().readShort());
                            return;
                        }

                        return;
                    case -7:
                        var8 = msg.reader().readInt();

                        for (var9 = 0; var9 < GameScr.D.size(); ++var9) {
                            var260 = null;

                            try {
                                var260 = (Char) GameScr.D.elementAt(var9);
                            } catch (Exception var188) {
                                ;
                            }

                            if (var260 == null) {
                                return;
                            }

                            if (var260.charID == var8) {
                                //"SA8x2y" + var9;
                                var260.b(msg.reader().readShort(), msg.reader().readShort(), 0);
                                System.currentTimeMillis();
                                return;
                            }
                        }

                        return;
                    case -6:
                        Res.out("PLAYER REMOVED!!!!!============");
                        var8 = msg.reader().readInt();

                        for (var9 = 0; var9 < GameScr.D.size(); ++var9) {
                            if ((var260 = (Char) GameScr.D.elementAt(var9)) != null && var260.charID == var8) {
                                if (!var260.bb && !var260.t) {
                                    ServerEffect.addServerEffect(60, var260.cx, var260.cy, 1);
                                }

                                if (!var260.t) {
                                    GameScr.D.removeElementAt(var9);
                                }

                                return;
                            }
                        }

                        return;
                    case -5:
                        var6 = msg.reader().readInt();
                        Char var286;
                        if ((var215 = msg.reader().readInt()) != -100) {
                            (var286 = new Char()).charID = var6;
                            ((Char) var286).ah = var215;
                        } else {
                            (var286 = new nr_ak()).charID = var6;
                            ((Char) var286).ah = var215;
                        }

                        if (((Char) var286).ah == -2) {
                            ((Char) var286).cB = true;
                        }

                        if (a((Char) var286, msg)) {
                            var253 = msg.reader().readByte();
                            if (((Char) var286).cy <= 10 && var253 != 0 && var253 != 2) {
                                nr_ci var288;
                                (var288 = new nr_ci(((Char) var286).cx, ((Char) var286).cy, ((Char) var286).head, ((Char) var286).I, 1, false, var253 == 1 ? ((Char) var286).cgender : var253)).d = ((Char) var286).charID;
                                ((Char) var286).s = true;
                                nr_ci.a(var288);
                            }

                            if (var253 == 2) {
                                ((Char) var286).r();
                            }

                            for (var8 = 0; var8 < GameScr.vMob.size(); ++var8) {
                                Mob var269;
                                if ((var269 = (Mob) GameScr.vMob.elementAt(var8)) != null && var269.isMobMe && var269.y == ((Char) var286).charID) {
                                    Res.out("co 1 con quai");
                                    ((Char) var286).mobMe = var269;
                                    ((Char) var286).mobMe.m = ((Char) var286).cx;
                                    ((Char) var286).mobMe.n = ((Char) var286).cy - 40;
                                    break;
                                }
                            }

                            if (GameScr.findCharInMap(((Char) var286).charID) == null) {
                                GameScr.D.addElement(var286);
                            }

                            ((Char) var286).cA = msg.reader().readByte();
                            if ((var268 = msg.reader().readShort()) != -1) {
                                ((Char) var286).bt = true;
                                if (var268 != 346 && var268 != 347 && var268 != 348) {
                                    if (var268 != 349 && var268 != 350 && var268 != 351) {
                                        if (var268 == 396) {
                                            ((Char) var286).bv = true;
                                        } else if (var268 == 532) {
                                            ((Char) var286).bw = true;
                                        } else if (var268 >= Char.br) {
                                            ((Char) var286).bs = var268;
                                        }
                                    } else {
                                        ((Char) var286).bu = true;
                                    }
                                } else {
                                    ((Char) var286).bu = false;
                                }
                            } else {
                                ((Char) var286).bt = false;
                            }
                        }

                        var253 = msg.reader().readByte();
                        ((Char) var286).bx = var253;
                        ((Char) var286).u = msg.reader().readByte() == 1;

                        try {
                            ((Char) var286).cR = msg.reader().readShort();
                            ((Char) var286).cU = msg.reader().readByte();
                            ((Char) var286).cV = msg.reader().readShort();
                        } catch (Exception var189) {
                            ;
                        }

                        GameScr.gI();
                        GameScr.a(((Char) var286).charID, ((Char) var286).bx);
                        if (((Char) var286).bag >= 201 && ((Char) var286).bag < 255) {
                            Effect var289;
                            (var289 = new Effect(((Char) var286).bag, (Char) var286, 2, -1, 10, (byte) 1)).b = 5;
                            ((Char) var286).a(var289);
                        } else {
                            for (var8 = 0; var8 < 54; ++var8) {
                                ((Char) var286).b((int) 0, var8 + 201);
                            }
                        }

                        Res.out("Cmd: -5 PLAYER_ADD: cID| cName| cFlag| cBag|    " + ((Char) var286).charID + " | " + ((Char) var286).cName + " | " + ((Char) var286).bx + " | " + ((Char) var286).bag);
                        return;
                    case -3:
                        var2 = msg.reader().readByte();
                        var3 = msg.reader().readInt();
                        if (var2 == 0) {
                            var10000 = Char.myCharz();
                            var10000.cPower += (long) var3;
                        }

                        if (var2 == 1) {
                            var10000 = Char.myCharz();
                            var10000.cTiemNang += (long) var3;
                        }

                        if (var2 == 2) {
                            var10000 = Char.myCharz();
                            var10000.cPower += (long) var3;
                            var10000 = Char.myCharz();
                            var10000.cTiemNang += (long) var3;
                        }

                        Char.myCharz().applyCharLevelPercent();
                        if (Char.myCharz().aM != 3) {
                            GameScr.a((var3 > 0 ? "+" : "") + var3, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al, 0, -4, 2);
                            if (var3 > 0 && Char.myCharz().petFollow != null && Char.myCharz().petFollow.a == 5002) {
                                ServerEffect.addServerEffect(55, Char.myCharz().petFollow.i, Char.myCharz().petFollow.e, 1);
                                ServerEffect.addServerEffect(55, Char.myCharz().cx, Char.myCharz().cy, 1);
                                return;
                            }
                        }

                        return;
                    case -2:
                        var215 = msg.reader().readInt();
                        var10000 = Char.myCharz();
                        var10000.at += var215;
                        GameScr.a(var215 > 0 ? "+" + var215 : "" + var215, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al - 10, 0, -2, 1);
                        return;
                    case -1:
                        var224 = msg.reader().readInt();
                        var10000 = Char.myCharz();
                        var10000.as += (long) var224;
                        Char.myCharz().xuStr = Main.a(Char.myCharz().as);
                        var10000 = Char.myCharz();
                        var10000.at -= var224;
                        GameScr.a("+" + var224, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al - 10, 0, -2, 1);
                        return;
                    case 18:
                        var273 = msg.reader().readByte();

                        for (var275 = 0; var275 < var273; ++var275) {
                            var215 = msg.reader().readInt();
                            var278 = msg.reader().readShort();
                            var220 = msg.reader().readShort();
                            var224 = msg.readInt3Byte();
                            Char var267;
                            if ((var267 = GameScr.findCharInMap(var215)) != null) {
                                var267.cx = var278;
                                var267.cy = var220;
                                var267.cHP = var224;
                                System.currentTimeMillis();
                            }
                        }

                        return;
                    case 19:
                        Char.myCharz();
                        msg.reader().readUnsignedShort();
                        Char.myCharz();
                        msg.reader().readUnsignedShort();
                        return;
                    case 44:
                        var11 = msg.reader().readInt();
                        var274 = msg.reader().readUTF();
                        Res.out("user id= " + var11 + " text= " + var274);
                        if (Char.myCharz().charID == var11) {
                            var283 = Char.myCharz();
                        } else {
                            var283 = GameScr.findCharInMap(var11);
                        }

                        if (var283 != null) {
                            var283.a(var274);
                            return;
                        }

                        return;
                    case 45:
                        var256 = null;

                        try {
                            var256 = (Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        } catch (Exception var185) {
                            ;
                        }

                        if (var256 != null) {
                            var256.k = msg.reader().readInt();
                            var256.A();
                            GameScr.a(mResources.cB, var256.m, var256.n - var256.w, 0, -2, 4);
                        }

                        return;
                    case 66:
                        Res.out("ME DIE XP DOWN NOT IMPLEMENT YET!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        return;
                    case 74:
                        var256 = null;

                        try {
                            var256 = (Mob) GameScr.vMob.elementAt(msg.reader().readUnsignedByte());
                        } catch (Exception var183) {
                            ;
                        }

                        if (var256 != null && var256.p != 0 && var256.p != 0) {
                            var256.p = 0;
                            ServerEffect.addServerEffect(60, var256.m, var256.n, 1);
                            ItemMap var282 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), var256.m, var256.n, msg.reader().readShort(), msg.reader().readShort());
                            GameScr.vItemMap.addElement(var282);
                            if (Res.g(var282.y - Char.myCharz().cy) < 24 && Res.g(var282.x - Char.myCharz().cx) < 24) {
                                Char.myCharz().aT = null;
                                return;
                            }
                        }

                        return;
                    case 95:
                        var3 = msg.reader().readInt();
                        var10000 = Char.myCharz();
                        var10000.as += (long) var3;
                        Char.myCharz().xuStr = Main.a(Char.myCharz().as);
                        GameScr.a(var3 > 0 ? "+" + var3 : "" + var3, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al - 10, 0, -2, 1);
                        return;
                    case 96:
                        Char.myCharz().bd.addElement(new nr_cl(msg.reader().readByte(), msg.reader().readShort(), msg.reader().readShort(), msg.reader().readUTF(), msg.reader().readUTF(), msg.reader().readByte(), msg.reader().readByte()));
                        return;
                    case 97:
                        var221 = msg.reader().readByte();

                        for (var224 = 0; var224 < Char.myCharz().bd.size(); ++var224) {
                            nr_cl var284;
                            if ((var284 = (nr_cl) Char.myCharz().bd.elementAt(var224)).a == var221) {
                                var284.b = msg.reader().readShort();
                                return;
                            }
                        }
                }
            } catch (Exception var213) {
                //var213.getMessage() + " " + var213.toString();
                var213.printStackTrace();
            }

        } finally {
            if (msg != null) {
                msg.cleanup();
            }

        }
    }

    private static void a(DataInputStream var0) throws IOException {
        GameScr.am = var0.readByte();
        GameScr.gI().K = new nr_ee[var0.readByte()];

        int var1;
        for (var1 = 0; var1 < GameScr.gI().K.length; ++var1) {
            GameScr.gI().K[var1] = new nr_ee();
            GameScr.gI();
            GameScr.gI();
            var0.readUTF();
        }

        GameScr.I = new nr_cu[var0.readByte()];

        for (var1 = 0; var1 < GameScr.I.length; ++var1) {
            GameScr.I[var1] = new nr_cu();
            GameScr.I[var1].a = var1;
            var0.readUTF();
            GameScr.I[var1].b = new nr_en[var0.readByte()];

            for (int var2 = 0; var2 < GameScr.I[var1].b.length; ++var2) {
                GameScr.I[var1].b[var2] = new nr_en();
                GameScr.I[var1].b[var2].a = var0.readByte();
                GameScr.I[var1].b[var2].b = var0.readUTF();
                GameScr.I[var1].b[var2].c = var0.readByte();
                GameScr.I[var1].b[var2].d = var0.readByte();
                GameScr.I[var1].b[var2].e = var0.readByte();
                GameScr.I[var1].b[var2].f = var0.readShort();
                GameScr.I[var1].b[var2].i = var0.readUTF();
                short var3 = 130;
                if (GameCanvas.z == 128 || GameCanvas.A <= 208) {
                    var3 = 100;
                }

                GameScr.I[var1].b[var2].g = mFont.m.a(var0.readUTF(), var3);
                GameScr.I[var1].b[var2].h = new Skill[var0.readByte()];

                for (int var4 = 0; var4 < GameScr.I[var1].b[var2].h.length; ++var4) {
                    GameScr.I[var1].b[var2].h[var4] = new Skill();
                    GameScr.I[var1].b[var2].h[var4].b = var0.readShort();
                    GameScr.I[var1].b[var2].h[var4].a = GameScr.I[var1].b[var2];
                    GameScr.I[var1].b[var2].h[var4].c = var0.readByte();
                    GameScr.I[var1].b[var2].h[var4].d = var0.readLong();
                    GameScr.I[var1].b[var2].h[var4].i = var0.readShort();
                    GameScr.I[var1].b[var2].h[var4].e = var0.readInt();
                    GameScr.I[var1].b[var2].h[var4].g = var0.readShort();
                    GameScr.I[var1].b[var2].h[var4].h = var0.readShort();
                    var0.readByte();
                    GameScr.I[var1].b[var2].h[var4].k = var0.readShort();
                    var0.readShort();
                    GameScr.I[var1].b[var2].h[var4].l = var0.readUTF();
                    Skills.a(GameScr.I[var1].b[var2].h[var4]);
                }
            }
        }

    }

    private static void b(DataInputStream var0) throws IOException {
        GameScr.al = var0.readByte();
        TileMap.w = new String[var0.readUnsignedByte()];

        for (int var1 = 0; var1 < TileMap.w.length; ++var1) {
            TileMap.w[var1] = var0.readUTF();
        }

        Npc.cX = new nr_an[var0.readByte()];

        byte var4;
        for (var4 = 0; var4 < Npc.cX.length; ++var4) {
            Npc.cX[var4] = new nr_an();
            Npc.cX[var4].a = var4;
            Npc.cX[var4].b = var0.readUTF();
            Npc.cX[var4].c = var0.readShort();
            Npc.cX[var4].d = var0.readShort();
            Npc.cX[var4].e = var0.readShort();
            Npc.cX[var4].f = new String[var0.readByte()][];

            for (int var2 = 0; var2 < Npc.cX[var4].f.length; ++var2) {
                Npc.cX[var4].f[var2] = new String[var0.readByte()];

                for (int var3 = 0; var3 < Npc.cX[var4].f[var2].length; ++var3) {
                    Npc.cX[var4].f[var2][var3] = var0.readUTF();
                }
            }
        }

        Mob.c = new nr_dr[var0.readByte()];

        for (var4 = 0; var4 < Mob.c.length; ++var4) {
            Mob.c[var4] = new nr_dr();
            Mob.c[var4].c = var0.readByte();
            Mob.c[var4].e = var0.readUTF();
            Mob.c[var4].d = var0.readInt();
            Mob.c[var4].a = var0.readByte();
            Mob.c[var4].b = var0.readByte();
            Mob.c[var4].g = var0.readByte();
        }

    }

    private static void a(DataInputStream var0, boolean var1) throws IOException {
        GameScr.ak = var0.readByte();
        Res.out("vcData= " + GameScr.ak + " vData=" + GameScr.ao);
        Rms.a("NR_dart", NinjaUtil.a(var0));
        Rms.a("NR_arrow", NinjaUtil.a(var0));
        Rms.a("NR_effect", NinjaUtil.a(var0));
        Rms.a("NR_image", NinjaUtil.a(var0));
        Rms.a("NR_part", NinjaUtil.a(var0));
        Rms.a("NR_skill", NinjaUtil.a(var0));
        Rms.a("NRdata");
    }

    private static Image a(byte[] var0) {
        try {
            return Image.createImage(var0, 0, var0.length);
        } catch (Exception var1) {
            return null;
        }
    }

    private static void a(Message var0, int var1) {
        try {
            nr_bx var2 = new nr_bx();
            byte var3 = var0.reader().readByte();
            var2.b = var3;
            var2.a = var0.reader().readInt();
            var2.c = var0.reader().readInt();
            var2.d = var0.reader().readUTF();
            var2.h = var0.reader().readByte();
            var2.e = (long) (var0.reader().readInt() + 1000000000);
            Res.out("type= " + var2.b + " id= " + var2.a + " playID= " + var2.c + " time= " + var2.e);
            boolean var4 = false;
            GameScr.aV = false;
            if (var3 == 0) {
                String var6 = var0.reader().readUTF();
                Res.out("str chat " + var6);
                GameScr.aV = true;
                if (mFont.k.a(var6) > Panel.WIDTH_PANEL - 60) {
                    var2.f = mFont.k.a(var6, Panel.WIDTH_PANEL - 10);
                } else {
                    var2.f = new String[1];
                    var2.f[0] = var6;
                }

                var2.g = var0.reader().readByte();
            } else if (var3 == 1) {
                var2.i = var0.reader().readByte();
                var2.j = var0.reader().readByte();
                if (var4 = var0.reader().readByte() == 1) {
                    GameScr.aV = true;
                }

                if (var2.c != Char.myCharz().charID) {
                    if (var2.i < var2.j) {
                        var2.k = new String[]{mResources.cC};
                    } else {
                        var2.k = null;
                    }
                }

                if (GameCanvas.panel.af != null) {
                    GameCanvas.panel.a(var2.i, var2.j);
                }
            } else if (var3 == 2 && Char.myCharz().aj == 0) {
                GameScr.aV = true;
                var2.k = new String[]{mResources.br, mResources.cD};
            }

            if (GameCanvas.currentScreen != GameScr.c) {
                GameScr.aV = false;
            } else if (GameCanvas.panel.a && GameCanvas.panel.y == 0 && GameCanvas.panel.z == 3) {
                GameScr.aV = false;
            }

            nr_bx.a(var2, var1, var4);
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    private static void a(byte var0) {
        Res.out("is loading map = " + Char.bH);
        GameScr.gI().aW = 0;
        GameScr.bk = false;
        nr_cq.a = null;
        GameScr.aC.f = false;
        GameScr.aD.f = false;
        GameScr.z = 0;
        GameCanvas.panel.a = false;
        SoundMn.gI();
        if (!GameScr.b && !nr_cq.b) {
            GameScr.gI().a();
        }

        GameScr.a(var0 == 1 ? Char.myCharz().cx : -1, var0 == 0 ? -1 : 0);
        TileMap.h();
        TileMap.c(TileMap.e);
        Res.out("LOAD GAMESCR 2");
        Char.myCharz().D = 0;
        Char.myCharz().statusMe = 4;
        Char.myCharz().bO = null;
        Char.myCharz().aP = null;
        Char.myCharz().aT = null;
        Char.myCharz().aS = null;
        Char.myCharz().itemFocus = null;
        Char.myCharz().cd = null;
        Char.myCharz().c(false);
        Char.myCharz().ce = null;
        GameCanvas.clearAllPointerEvent();
        if (Char.myCharz().cy >= TileMap.d - 100) {
            Char.myCharz().bp = true;
            Char var10000 = Char.myCharz();
            var10000.cx += Res.g(Res.b(0, 80));
            Service.gI().g();
        }

        GameScr.gI().o();
        GameCanvas.a(TileMap.o);
        Char.bG = false;

        for (int var1 = 0; var1 < Char.myCharz().aA.size(); ++var1) {
            Char.myCharz().aA.elementAt(var1);
        }

        GameCanvas.f();
        GameCanvas.e();
        GameScr.gI().bC = Char.myCharz().cHP;
        GameScr.gI().bz = Char.myCharz().cMP;
        Char.bF = false;
        GameScr.gI().b();
        if (Char.myCharz().cy <= 10 && var0 != 0 && var0 != 2) {
            int var10008 = var0 == 1 ? Char.myCharz().cgender : var0;
            nr_ci var2 = new nr_ci(Char.myCharz().cx, Char.myCharz().cy, Char.myCharz().head, Char.myCharz().I, 1, true, var10008);;
            nr_ci.a(var2);
            Char.myCharz().s = true;
        }

        if (var0 == 2) {
            Char.myCharz().r();
        }

        if (GameScr.gI().ba) {
            if (TileMap.l == GameScr.gI().bg && TileMap.n == GameScr.gI().bh) {
                GameScr.gI().c(GameScr.gI().be, GameScr.gI().bf);
            }

            if (mGraphics.zoomLevel > 1) {
                GameScr.gI().s();
            }
        }

        InfoDlg.hide();
        InfoDlg.a(TileMap.k, mResources.ch + " " + TileMap.n, 30);
        GameCanvas.g();
        GameCanvas.d = false;
        nr_v.b();
        nr_v.a();
    }

    private void c(Message var1) {
        try {
            Res.out("123 char= " + Char.myCharz() == null ? "null" : "!null");
            Char var10000 = Char.myCharz();
            Char var10001 = Char.myCharz();
            Char.myCharz();
            var10000.cx = var10001.bC = var1.reader().readShort();
            var10000 = Char.myCharz();
            var10001 = Char.myCharz();
            Char.myCharz();
            var10000.cy = var10001.bD = var1.reader().readShort();
            Char.myCharz().cj = Char.myCharz().cx;
            Char.myCharz().ck = Char.myCharz().cy;
            Res.out("head= " + Char.myCharz().head + " body= " + Char.myCharz().body + " left= " + Char.myCharz().leg + " x= " + Char.myCharz().cx + " y= " + Char.myCharz().cy + " chung toc= " + Char.myCharz().cgender);
            if (Char.myCharz().cx >= 0 && Char.myCharz().cx <= 100) {
                Char.myCharz().I = 1;
            } else if (Char.myCharz().cx >= TileMap.a - 100 && Char.myCharz().cx <= TileMap.a) {
                Char.myCharz().I = -1;
            }

            byte var2 = var1.reader().readByte();
            Res.out("vGo size= " + var2);
            if (!GameScr.aC.e) {
                GameScr.aC.d = Char.myCharz().cx - GameScr.j;
                GameScr.aC.c = Char.myCharz().cy - GameScr.k;
            }

            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                new Waypoint(var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort(), var1.reader().readBoolean(), var1.reader().readBoolean(), var1.reader().readUTF());
            }

            var2 = var1.reader().readByte();
            Mob.L.removeAllElements();

            for (byte var13 = 0; var13 < var2; ++var13) {
                Mob var4;
                (var4 = new Mob(var13, var1.reader().readBoolean(), var1.reader().readBoolean(), var1.reader().readBoolean(), var1.reader().readBoolean(), var1.reader().readBoolean(), var1.reader().readByte(), var1.reader().readByte(), var1.reader().readInt(), var1.reader().readByte(), var1.reader().readInt(), var1.reader().readShort(), var1.reader().readShort(), var1.reader().readByte(), var1.reader().readByte())).M = var4.m;
                var4.N = var4.n;
                var4.I = var1.reader().readBoolean();
                if (Mob.c[var4.C].c != 0) {
                    if (var13 % 3 == 0) {
                        var4.o = -1;
                    } else {
                        var4.o = 1;
                    }

                    var4.m += 10 - var13 % 20;
                }

                var4.isMobMe = false;
                nr_by var5 = null;
                nr_al var6 = null;
                nr_d var7 = null;
                nr_ch var8 = null;
                if (var4.C == 70) {
                    var5 = new nr_by(var13, (short) var4.m, (short) var4.n, 70, var4.k, var4.l, var4.G);
                }

                if (var4.C == 71) {
                    var6 = new nr_al(var13, (short) var4.m, (short) var4.n, 71, var4.k, var4.l);
                }

                if (var4.C == 72) {
                    var7 = new nr_d(var13, (short) var4.m, (short) var4.n, 72, var4.k, var4.l);
                }

                if (var4.I) {
                    var8 = new nr_ch(var13, (short) var4.m, (short) var4.n, var4.C, var4.k, var4.l);
                }

                if (var8 != null) {
                    GameScr.vMob.addElement(var8);
                } else if (var5 != null) {
                    GameScr.vMob.addElement(var5);
                } else if (var6 != null) {
                    GameScr.vMob.addElement(var6);
                } else if (var7 != null) {
                    GameScr.vMob.addElement(var7);
                } else {
                    GameScr.vMob.addElement(var4);
                }
            }

            String var15;
            for (var3 = 0; var3 < Mob.K.size(); ++var3) {
                if (!Mob.a(var15 = (String) Mob.K.elementAt(var3))) {
                    Mob.c[Integer.parseInt(var15)].f = null;
                    Mob.K.removeElementAt(var3);
                    --var3;
                }
            }

            if (Char.myCharz().mobMe != null && GameScr.c(Char.myCharz().mobMe.y) == null) {
                Char.myCharz().mobMe.v();
                Char.myCharz().mobMe.m = Char.myCharz().cx;
                Char.myCharz().mobMe.n = Char.myCharz().cy - 40;
                GameScr.vMob.addElement(Char.myCharz().mobMe);
            }

            var1.reader().readByte();
            var2 = var1.reader().readByte();
            Res.out("NPC size= " + var2);

            short var20;
            short var25;
            for (var3 = 0; var3 < var2; ++var3) {
                byte var16 = var1.reader().readByte();
                var20 = var1.reader().readShort();
                var25 = var1.reader().readShort();
                byte var27 = var1.reader().readByte();
                Res.out("tempalte = " + var27);
                short var33 = var1.reader().readShort();
                Res.out("1");
                if (var27 != 6) {
                    Res.out("2");
                    if (Char.myCharz().taskMaint.taskId < 7 || Char.myCharz().taskMaint.taskId == 7 && Char.myCharz().taskMaint.a <= 1) {
                        if (var27 == 7 || var27 == 8 || var27 == 9) {
                            continue;
                        }

                        Res.out("3");
                    }

                    if (Char.myCharz().taskMaint.taskId >= 6 || var27 != 16) {
                        if (var27 == 4) {
                            GameScr.gI().aL = new nr_k(var3, var16, var20, var25, var27, var33);
                            Service.gI().e((byte) 2);
                            GameScr.G.addElement(GameScr.gI().aL);
                            Res.out("5");
                        } else {
                            Npc var9 = new Npc(var3, var16, var20, var25 + 3, var27, var33);
                            GameScr.G.addElement(var9);
                            Res.out("6");
                        }
                    }
                }
            }

            var2 = var1.reader().readByte();
            Res.out("item size = " + var2);
            int var37 = 0;

            short var18;
            boolean var19;
            short var21;
            int var26;
            int var38;
            while (var37 < var2) {
                var21 = var1.reader().readShort();
                var18 = var1.reader().readShort();
                var25 = var1.reader().readShort();
                short var29 = var1.reader().readShort();
                var38 = var1.reader().readInt();
                var20 = 0;
                if (var38 == -2) {
                    var20 = var1.reader().readShort();
                }

                ItemMap var23 = new ItemMap(var38, var21, var18, var25, var29, var20);
                var19 = false;
                var26 = 0;

                while (true) {
                    if (var26 < GameScr.vItemMap.size()) {
                        if (((ItemMap) GameScr.vItemMap.elementAt(var26)).itemMapID != var23.itemMapID) {
                            ++var26;
                            continue;
                        }

                        var19 = true;
                    }

                    if (!var19) {
                        GameScr.vItemMap.addElement(var23);
                    }

                    ++var37;
                    break;
                }
            }

            TileMap.v.removeAllElements();
            if (mGraphics.zoomLevel == 1) {
                nr_ct.a();
            }

            nr_ct.l.removeAllElements();
            int var34;
            short var39;
            if (GameCanvas.lowGraphic && (!GameCanvas.lowGraphic || !TileMap.a()) && TileMap.l != 45 && TileMap.l != 46 && TileMap.l != 47 && TileMap.l != 48) {
                var39 = var1.reader().readShort();

                for (var3 = 0; var3 < var39; ++var3) {
                    var1.reader().readShort();
                    var1.reader().readShort();
                    var1.reader().readShort();
                }

                var21 = var1.reader().readShort();

                for (var34 = 0; var34 < var21; ++var34) {
                    var1.reader().readUTF();
                    var1.reader().readUTF();
                }
            } else {
                var39 = var1.reader().readShort();

                for (var3 = 0; var3 < var39; ++var3) {
                    var18 = var1.reader().readShort();
                    var20 = var1.reader().readShort();
                    var25 = var1.reader().readShort();
                    if (TileMap.a(var18) != null) {
                        nr_ct var12 = TileMap.a(var18);
                        nr_ct var32;
                        (var32 = new nr_ct()).a = var18;
                        var32.c = var12.c;
                        var32.f = var12.f;
                        var32.g = var12.g;
                        var32.d = var20 * TileMap.i;
                        var32.e = var25 * TileMap.i;
                        var32.h = var12.h;
                        if (TileMap.b(var32.a)) {
                            var32.b = var3 % 2 == 0 ? 0 : 2;
                            if (TileMap.l == 45) {
                                var32.b = 0;
                            }
                        }

                        if (!nr_ct.k.containsKey(String.valueOf(var32.c))) {
                            Image var14;
                            if (mGraphics.zoomLevel == 1) {
                                if ((var14 = Main.c("/mapBackGround/" + var32.c + ".png")) == null) {
                                    var14 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                    Session_ME.gI2().d();
                                    Service.gI().getBgTemplate(var32.c);
                                }

                                nr_ct.k.put(String.valueOf(var32.c), var14);
                            } else {
                                var19 = false;
                                byte[] var17;
                                if ((var17 = Rms.b(mGraphics.zoomLevel + "bgItem" + var32.c)) != null) {
                                    if (nr_ct.n != null) {
                                        Res.out("Small  last= " + var17.length % 127 + "new Version= " + nr_ct.n[var32.c]);
                                        if (var17.length % 127 != nr_ct.n[var32.c]) {
                                            var19 = true;
                                        }
                                    }

                                    if (!var19) {
                                        if ((var14 = Image.createImage(var17, 0, var17.length)) != null) {
                                            nr_ct.k.put(String.valueOf(var32.c), var14);
                                        } else {
                                            var19 = true;
                                        }
                                    }
                                } else {
                                    var19 = true;
                                }

                                if (var19) {
                                    if ((var14 = Main.c("/mapBackGround/" + var32.c + ".png")) == null) {
                                        var14 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                        Service.gI().getBgTemplate(var32.c);
                                    }

                                    nr_ct.k.put(String.valueOf(var32.c), var14);
                                }
                            }

                            nr_ct.m.addElement(String.valueOf(var32.c));
                        }

                        if (!nr_ct.a(String.valueOf(var32.c))) {
                            nr_ct.l.addElement(String.valueOf(var32.c));
                        }

                        TileMap.v.addElement(var32);
                    }
                }

                for (var3 = 0; var3 < nr_ct.m.size(); ++var3) {
                    if (!nr_ct.a(var15 = (String) nr_ct.m.elementAt(var3))) {
                        nr_ct.k.remove(var15);
                        if (nr_ct.k.containsKey(var15 + "blend" + 1)) {
                            nr_ct.k.remove(var15 + "blend" + 1);
                        }

                        if (nr_ct.k.containsKey(var15 + "blend" + 3)) {
                            nr_ct.k.remove(var15 + "blend" + 3);
                        }

                        nr_ct.m.removeElementAt(var3);
                        --var3;
                    }
                }

                nr_dw.c = false;
                nr_dw.d = 0;
                EffecMn.a.removeAllElements();
                nr_dw.a.removeAllElements();
                Effect.l.removeAllElements();
                var21 = var1.reader().readShort();

                String var30;
                for (var34 = 0; var34 < var21; ++var34) {
                    var30 = var1.reader().readUTF();
                    String var28 = var1.reader().readUTF();
                    String var22;
                    if ((var22 = var30).equals("eff")) {
                        if (Panel.G <= 0) {
                            String[] var24;
                            var26 = Integer.parseInt((var24 = Res.a(var28, ".", 0))[0]);
                            int var31 = Integer.parseInt(var24[1]);
                            int var35 = Integer.parseInt(var24[2]);
                            var38 = Integer.parseInt(var24[3]);
                            int var10;
                            if (var24.length <= 4) {
                                var37 = -1;
                                var10 = 1;
                            } else {
                                var37 = Integer.parseInt(var24[4]);
                                var10 = Integer.parseInt(var24[5]);
                            }

                            Effect var36 = new Effect(var26, var35, var38, var31, var37, var10);
                            if (var24.length > 6) {
                                var36.b = Integer.parseInt(var24[6]);
                                if (var24.length > 7) {
                                    var36.c = Integer.parseInt(var24[7]);
                                    var36.d = Integer.parseInt(var24[8]);
                                }
                            }

                            EffecMn.addEff(var36);
                        }
                    } else if (var22.equals("beff") && Panel.G <= 1) {
                        nr_dw.a(Integer.parseInt(var28));
                    }
                }

                for (var34 = 0; var34 < Effect.k.size(); ++var34) {
                    if (!Effect.a(var30 = (String) Effect.k.elementAt(var34))) {
                        Effect.a(Integer.parseInt(var30));
                        Effect.k.removeElementAt(var34);
                        --var34;
                    }
                }
            }

            TileMap.p = var1.reader().readByte();
            a(var1.reader().readByte());
            Char.bH = false;
        } catch (Exception var11) {
            var11.printStackTrace();
        }
    }

    private void d(Message var1) {
        try {
            label371:
            {
                try {
                    int var22;
                    byte[] var24;
                    switch (var1.reader().readByte()) {
                        case 4:
                            GameCanvas.loginScr.e();
                            GameScr.bi = false;
                            GameScr.bj = false;
                            nr_x.d = true;
                            nr_x.e = true;
                            nr_x.f = true;
                            nr_x.g = true;
                            nr_x.h = true;
                            GameScr.ao = var1.reader().readByte();
                            GameScr.ap = var1.reader().readByte();
                            GameScr.aq = var1.reader().readByte();
                            GameScr.ar = var1.reader().readByte();
                            var1.reader().readByte();
                            if (GameCanvas.loginScr.isLogin2) {
                                Rms.a("acc", "");
                                Rms.a("pass", "");
                            } else {
                                Rms.a("userAo" + nr_bo.m, "");
                            }

                            Res.out("****** DATA VERSION: Server " + GameScr.ao + " Client " + GameScr.ak);
                            Res.out("****** MAP VERSION: Server " + GameScr.ap + " Client " + GameScr.al);
                            Res.out("****** SKILL VERSION: Server " + GameScr.aq + " Client " + GameScr.am);
                            Res.out("****** ITEM VERSION: Server " + GameScr.ar + " Client " + GameScr.an);
                            if (GameScr.ao != GameScr.ak) {
                                Res.out("send update data");
                                GameScr.b = false;
                                Service.gI().updateData();
                            } else {
                                try {
                                    nr_x.e = false;
                                } catch (Exception var18) {
                                    var18.printStackTrace();
                                    GameScr.ak = -1;
                                    Service.gI().updateData();
                                }
                            }

                            if (GameScr.ap != GameScr.al) {
                                GameScr.b = false;
                                Service.gI().updateMap();
                            } else {
                                try {
                                    if (!GameScr.b) {
                                        b(new DataInputStream(new ByteArrayInputStream(Rms.b("NRmap"))));
                                    }

                                    nr_x.f = false;
                                } catch (Exception var17) {
                                    GameScr.al = -1;
                                    Service.gI().updateMap();
                                }
                            }

                            if (GameScr.aq != GameScr.am) {
                                GameScr.b = false;
                                Service.gI().updateSkill();
                            } else {
                                try {
                                    if (!GameScr.b) {
                                        a(new DataInputStream(new ByteArrayInputStream(Rms.b("NRskill"))));
                                    }

                                    nr_x.g = false;
                                } catch (Exception var16) {
                                    GameScr.am = -1;
                                    Service.gI().updateSkill();
                                }
                            }

                            if (GameScr.ar != GameScr.an) {
                                GameScr.b = false;
                                Service.gI().updateItem();
                            } else {
                                try {
                                    DataInputStream var26 = new DataInputStream(new ByteArrayInputStream(Rms.b("NRitem0")));
                                    this.b(var26, false);
                                    var26 = new DataInputStream(new ByteArrayInputStream(Rms.b("NRitem1")));
                                    this.b(var26, false);
                                    var26 = new DataInputStream(new ByteArrayInputStream(Rms.b("NRitem2")));
                                    this.b(var26, false);
                                    var26 = new DataInputStream(new ByteArrayInputStream(Rms.b("NRitem100")));
                                    this.b(var26, false);
                                    nr_x.h = false;
                                } catch (Exception var15) {
                                    GameScr.an = -1;
                                    Service.gI().updateItem();
                                }
                            }

                            if (GameScr.ao == GameScr.ak && GameScr.ap == GameScr.al && GameScr.aq == GameScr.am && GameScr.ar == GameScr.an) {
                                if (!GameScr.b) {
                                    GameScr.gI();
                                    GameScr.k();
                                    GameScr.gI();
                                    GameScr.i();
                                    GameScr.gI();
                                    GameScr.j();
                                    GameScr.gI();
                                    GameScr.l();
                                }

                                Service.gI().clientOK();
                            }

                            byte var27 = var1.reader().readByte();
                            Res.out("CAPTION LENT= " + var27);
                            GameScr.exps = new long[var27];

                            for (var22 = 0; var22 < GameScr.exps.length; ++var22) {
                                GameScr.exps[var22] = var1.reader().readLong();
                            }
                            break label371;
                        case 5:
                        case 9:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        default:
                            return;
                        case 6:
                            Res.out("GET UPDATE_MAP " + var1.reader().available() + " bytes");
                            var1.reader().mark(100000);
                            b(var1.reader());
                            var1.reader().reset();
                            var24 = new byte[var1.reader().available()];
                            var1.reader().readFully(var24);
                            Rms.a("NRmap", var24);
                            var24 = new byte[]{GameScr.al};
                            Rms.a("NRmapVersion", var24);
                            nr_x.f = false;
                            if (GameScr.ao != GameScr.ak || GameScr.ap != GameScr.al || GameScr.aq != GameScr.am || GameScr.ar != GameScr.an) {
                                return;
                            }

                            GameScr.gI();
                            GameScr.k();
                            GameScr.gI();
                            GameScr.i();
                            GameScr.gI();
                            GameScr.j();
                            GameScr.gI();
                            GameScr.l();
                            Service.gI().clientOK();
                            return;
                        case 7:
                            Res.out("GET UPDATE_SKILL " + var1.reader().available() + " bytes");
                            var1.reader().mark(100000);
                            a(var1.reader());
                            var1.reader().reset();
                            var24 = new byte[var1.reader().available()];
                            var1.reader().readFully(var24);
                            Rms.a("NRskill", var24);
                            var24 = new byte[]{GameScr.am};
                            Rms.a("NRskillVersion", var24);
                            nr_x.g = false;
                            if (GameScr.ao != GameScr.ak || GameScr.ap != GameScr.al || GameScr.aq != GameScr.am || GameScr.ar != GameScr.an) {
                                return;
                            }

                            GameScr.gI();
                            GameScr.k();
                            GameScr.gI();
                            GameScr.i();
                            GameScr.gI();
                            GameScr.j();
                            GameScr.gI();
                            GameScr.l();
                            Service.gI().clientOK();
                            return;
                        case 8:
                            Res.out("GET UPDATE_ITEM " + var1.reader().available() + " bytes");
                            DataInputStream var25 = var1.reader();
                            Controller var23 = this;

                            try {
                                var23.b(var25, true);
                            } catch (Exception var14) {
                                var14.printStackTrace();
                            }

                            return;
                        case 10:
                            try {
                                Char.bH = true;
                                Res.out("REQUEST MAP TEMPLATE");
                                GameCanvas.d = true;
                                TileMap.f = null;
                                TileMap.g = null;
                                System.gc();
                                TileMap.a = var1.reader().readByte();
                                TileMap.b = var1.reader().readByte();
                                TileMap.f = new int[TileMap.a * TileMap.b];
                                Res.out("Cmd.REQUEST_MAPTEMPLATE=10  w|H= " + TileMap.a + "|" + TileMap.b + "\n Dien Tich = " + TileMap.a * TileMap.b);

                                for (var22 = 0; var22 < TileMap.f.length; ++var22) {
                                    int var3;
                                    if ((var3 = var1.reader().readByte()) < 0) {
                                        var3 += 256;
                                    }

                                    TileMap.f[var22] = (char) var3;
                                }

                                TileMap.g = new int[TileMap.f.length];
                                var1 = this.messWait;
                                this.c(var1);

                                try {
                                    TileMap.j = var1.reader().readByte() != 0;
                                } catch (Exception var13) {
                                    ;
                                }
                            } catch (Exception var19) {
                                var19.printStackTrace();
                            }

                            var1.cleanup();
                            this.messWait.cleanup();
                            var1 = this.messWait = null;
                            return;
                        case 16:
                            ClientInput.a().b();
                            return;
                        case 17:
                            Char.myCharz();
                            Char.M();
                            return;
                        case 18:
                            GameCanvas.d = false;
                            GameCanvas.g();
                            Integer var2 = new Integer(var1.reader().readInt());
                            GameCanvas.dialog.a(mResources.aq, new Command(mResources.bo, GameCanvas.h, 88829, var2), 0);
                            return;
                        case 20:
                            Char.myCharz().aL = var1.reader().readByte();
                            GameScr.aC.a(mResources.bC + " " + Char.myCharz().aL, 0);
                            return;
                        case 35:
                            GameCanvas.g();
                            GameScr.gI().q();
                            GameScr.aC.a(var1.reader().readUTF(), 0);
                            return;
                        case 36:
                            GameScr.aB = var1.reader().readByte();
                            Res.out("load Me Active: " + GameScr.aB);
                    }
                } catch (Exception var20) {
                    ;
                }

                return;
            }
        } finally {
            if (var1 != null) {
                var1.cleanup();
            }

        }

    }

    private static void e(Message var0) {
        try {
            switch (var0.reader().readByte()) {
                case 2:
                    String var1 = var0.reader().readUTF();
                    if (Rms.loadRmsInt("AdminLink") == 1) {
                        return;
                    }

                    int var10000 = Main.typeClient;
                    boolean var10001 = true;
                    nr_bo.h = var1;
                    nr_bo.a(var1);

                    try {
                        Panel.aa = var0.reader().readByte() == 1;
                        byte var8 = var0.reader().readByte();
                        Rms.saveRMSInt("AdminLink", var8);
                    } catch (Exception var5) {
                        ;
                    }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            if (var0 != null) {
                var0.cleanup();
            }

        }

    }

    private void f(Message var1) {
        try {
            byte var2 = var1.reader().readByte();
            Res.out("sub: " + var2);
            int var4;
            String var5;
            int var34;
            byte var35;
            Char var41;
            int var42;
            int var44;
            byte var45;
            int var49;
            short var52;
            switch (var2) {
                case 0:
                    nr_ao.f = new MyVector("");
                    nr_ci.a.removeAllElements();
                    GameScr.D.removeAllElements();
                    GameScr.vItemMap.removeAllElements();
                    Char.bq.removeAllElements();
                    GameScr.y();
                    GameScr.P = Char.myCharz();
                    Char.myCharz().charID = var1.reader().readInt();
                    Char.myCharz().ctaskId = var1.reader().readByte();
                    Char.myCharz().cgender = var1.reader().readByte();
                    Char.myCharz().head = var1.reader().readShort();
                    Res.out("Char head = " + Char.myCharz().head + "+++++++++++++++++++++++++++++++++");
                    Char.myCharz().cName = var1.reader().readUTF();
                    Char.myCharz().aL = var1.reader().readByte();
                    Char.myCharz().aM = var1.reader().readByte();
                    Char.myCharz().cPower = var1.reader().readLong();
                    Char.myCharz().applyCharLevelPercent();
                    Char.myCharz().V = var1.reader().readShort();
                    Char.myCharz().W = var1.reader().readShort();
                    Char.myCharz().aw = GameScr.I[var1.reader().readByte()];
                    Char.myCharz().ay.removeAllElements();
                    Char.myCharz().az.removeAllElements();
                    GameScr.gI().bC = Char.myCharz().cHP;
                    GameScr.gI().bz = Char.myCharz().cMP;
                    var45 = var1.reader().readByte();

                    for (var35 = 0; var35 < var45; ++var35) {
                        a(Skills.get(var1.reader().readShort()));
                    }

                    GameScr.gI();
                    GameScr.t();
                    GameScr.gI();
                    Char.myCharz().as = var1.reader().readLong();
                    Char.myCharz().av = var1.reader().readInt();
                    Char.myCharz().au = var1.reader().readInt();
                    Char.myCharz().xuStr = Main.a(Char.myCharz().as);
                    Char.myCharz().luongStr = Main.a((long) Char.myCharz().au);
                    Char.myCharz().luongKhoaStr = Main.a((long) Char.myCharz().av);
                    Char.myCharz().arrItemBody = new Item[var1.reader().readByte()];

                    int var40;
                    try {
                        Char.myCharz().setDefaultPart();

                        for (var4 = 0; var4 < Char.myCharz().arrItemBody.length; ++var4) {
                            if ((var52 = var1.reader().readShort()) != -1) {
                                ItemTemplate var46;
                                byte var50 = (var46 = ItemTemplates.get(var52)).type;
                                Char.myCharz().arrItemBody[var4] = new Item();
                                Char.myCharz().arrItemBody[var4].template = var46;
                                Char.myCharz().arrItemBody[var4].quantity = var1.reader().readInt();
                                Char.myCharz();
                                var1.reader().readUTF();
                                Char.myCharz();
                                var1.reader().readUTF();
                                var44 = var1.reader().readUnsignedByte();
                                Res.out("option size= " + var44);
                                if (var44 != 0) {
                                    Char.myCharz().arrItemBody[var4].itemOption = new ItemOption[var44];

                                    for (var40 = 0; var40 < Char.myCharz().arrItemBody[var4].itemOption.length; ++var40) {
                                        var34 = var1.reader().readUnsignedByte();
                                        var44 = var1.reader().readUnsignedShort();
                                        if (var34 != -1) {
                                            Char.myCharz().arrItemBody[var4].itemOption[var40] = new ItemOption(var34, var44);
                                        }
                                    }
                                }

                                if (var50 == 0) {
                                    Res.out("toi day =======================================" + Char.myCharz().body);
                                    Char.myCharz().body = Char.myCharz().arrItemBody[var4].template.part;
                                } else if (var50 == 1) {
                                    Char.myCharz().leg = Char.myCharz().arrItemBody[var4].template.part;
                                    Res.out("toi day =======================================" + Char.myCharz().leg);
                                }
                            }
                        }
                    } catch (Exception var29) {
                        var29.printStackTrace();
                    }

                    Char.myCharz().arrItemBag = new Item[var1.reader().readByte()];
                    GameScr.t = 0;

                    for (var4 = 0; var4 < Char.myCharz().arrItemBag.length; ++var4) {
                        if ((var52 = var1.reader().readShort()) != -1) {
                            Char.myCharz().arrItemBag[var4] = new Item();
                            Char.myCharz().arrItemBag[var4].template = ItemTemplates.get(var52);
                            Char.myCharz().arrItemBag[var4].quantity = var1.reader().readInt();
                            Char.myCharz();
                            var1.reader().readUTF();
                            Char.myCharz();
                            var1.reader().readUTF();
                            Char.myCharz().arrItemBag[var4].indexUI = var4;
                            byte var48;
                            if ((var48 = var1.reader().readByte()) != 0) {
                                Char.myCharz().arrItemBag[var4].itemOption = new ItemOption[var48];

                                for (var49 = 0; var49 < Char.myCharz().arrItemBag[var4].itemOption.length; ++var49) {
                                    var44 = var1.reader().readUnsignedByte();
                                    var40 = var1.reader().readUnsignedShort();
                                    if (var44 != -1) {
                                        Char.myCharz().arrItemBag[var4].itemOption[var49] = new ItemOption(var44, var40);
                                        Char.myCharz().arrItemBag[var4].getCompare();
                                    }
                                }
                            }

                            if (Char.myCharz().arrItemBag[var4].template.type == 6) {
                                GameScr.t += Char.myCharz().arrItemBag[var4].quantity;
                            }
                        }
                    }

                    Char.myCharz().aF = new Item[var1.reader().readByte()];
                    GameCanvas.panel.L = 0;

                    for (var4 = 0; var4 < Char.myCharz().aF.length; ++var4) {
                        if ((var52 = var1.reader().readShort()) != -1) {
                            Char.myCharz().aF[var4] = new Item();
                            Char.myCharz().aF[var4].template = ItemTemplates.get(var52);
                            Char.myCharz().aF[var4].quantity = var1.reader().readInt();
                            Char.myCharz();
                            var1.reader().readUTF();
                            Char.myCharz();
                            var1.reader().readUTF();
                            Char.myCharz().aF[var4].itemOption = new ItemOption[var1.reader().readByte()];

                            for (var42 = 0; var42 < Char.myCharz().aF[var4].itemOption.length; ++var42) {
                                var49 = var1.reader().readUnsignedByte();
                                var44 = var1.reader().readUnsignedShort();
                                if (var49 != -1) {
                                    Char.myCharz().aF[var4].itemOption[var42] = new ItemOption(var49, var44);
                                    Char.myCharz().aF[var4].getCompare();
                                }
                            }

                            ++GameCanvas.panel.L;
                        }
                    }

                    Char.myCharz().statusMe = 4;
                    Rms.loadRmsInt(Char.myCharz().cName + "vci");
                    Char.bf = new short[var52 = var1.reader().readShort()];
                    Char.bg = new short[var52];

                    for (var42 = 0; var42 < var52; ++var42) {
                        Char.bf[var42] = var1.reader().readShort();
                        Char.bg[var42] = var1.reader().readShort();
                    }

                    GameScr.aC.a[Char.myCharz().cgender][0] = var1.reader().readShort();
                    GameScr.aC.a[Char.myCharz().cgender][1] = var1.reader().readShort();
                    GameScr.aC.a[Char.myCharz().cgender][2] = var1.reader().readShort();
                    Char.myCharz().u = var1.reader().readByte() == 1;
                    GameScr.aR = Main.c() - (long) var1.reader().readInt() * 1000L;
                    GameScr.bX = var1.reader().readByte();
                    Res.out("delta time= " + GameScr.aR);
                    Service var10000 = Service.gI();
                    var45 = (byte) Char.myCharz().cgender;
                    Service var47 = var10000;
                    Message var51 = null;

                    try {
                        (var51 = new Message((byte) -41)).writer().writeByte(var45);
                        var47.session.sendMessage(var51);
                    } catch (Exception var27) {
                        var27.printStackTrace();
                    } finally {
                        var51.cleanup();
                    }

                    var47 = Service.gI();

                    try {
                        Char.myCharz().cR = var1.reader().readShort();
                        Char.myCharz().cU = var1.reader().readByte();
                        Char.myCharz().cV = var1.reader().readShort();
                    } catch (Exception var26) {
                        ;
                    }

                    return;
                case 1:
                    Char.myCharz().aw = GameScr.I[var1.reader().readByte()];
                    Char.myCharz().cTiemNang = var1.reader().readLong();
                    Char.myCharz().ay.removeAllElements();
                    Char.myCharz().az.removeAllElements();
                    Char.myCharz().aB = null;
                    return;
                case 2:
                    if (Char.myCharz().statusMe != 14 && Char.myCharz().statusMe != 5) {
                        Char.myCharz().cHP = Char.myCharz().cHPFull;
                        Char.myCharz().cMP = Char.myCharz().cMPFull;
                    }

                    Char.myCharz().ay.removeAllElements();
                    Char.myCharz().az.removeAllElements();
                    var45 = var1.reader().readByte();

                    for (var35 = 0; var35 < var45; ++var35) {
                        var52 = var1.reader().readShort();
                        Res.out("skidd id my  char= " + var52);
                        a(Skills.get(var52));
                    }

                    GameScr.gI();
                    GameScr.t();
                    return;
                case 4:
                    Char.myCharz().as = var1.reader().readLong();
                    Char.myCharz().au = var1.reader().readInt();
                    Char.myCharz().cHP = var1.readInt3Byte();
                    Char.myCharz().cMP = var1.readInt3Byte();
                    Char.myCharz().av = var1.reader().readInt();
                    Char.myCharz().xuStr = Main.a(Char.myCharz().as);
                    Char.myCharz().luongStr = Main.a((long) Char.myCharz().au);
                    Char.myCharz().luongKhoaStr = Main.a((long) Char.myCharz().av);
                    return;
                case 5:
                    var42 = Char.myCharz().cHP;
                    Char.myCharz().cHP = var1.readInt3Byte();
                    Res.out("hpgoc  =" + Char.myCharz().cp + " hp full= " + Char.myCharz().cHPFull);
                    if (Char.myCharz().cHP > var42 && Char.myCharz().aM != 4) {
                        GameScr.a("+" + (Char.myCharz().cHP - var42) + " " + mResources.eR, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al - 20, 0, -1, 9);
                        SoundMn.gI();
                        if (Char.myCharz().petFollow != null && Char.myCharz().petFollow.a == 5003) {
                            nr_ag.a(Char.myCharz().petFollow.i + (Char.myCharz().petFollow.b == 1 ? 10 : -10), Char.myCharz().petFollow.e + 10, true, -1, -1, Char.myCharz(), 29);
                        }
                    }

                    if (Char.myCharz().cHP < var42) {
                        GameScr.a("-" + (var42 - Char.myCharz().cHP) + " " + mResources.eR, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al - 20, 0, -1, 9);
                    }

                    Res.out("curr HP= " + Char.myCharz().cHP);
                    GameScr.gI().bC = Char.myCharz().cHP;
                    return;
                case 6:
                    var49 = Char.myCharz().cMP;
                    Char.myCharz().cMP = var1.readInt3Byte();
                    if (Char.myCharz().cMP > var49) {
                        GameScr.a("+" + (Char.myCharz().cMP - var49) + " " + mResources.eS, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al - 23, 0, -2, 10);
                        SoundMn.gI();
                        if (Char.myCharz().petFollow != null && Char.myCharz().petFollow.a == 5001) {
                            nr_ag.a(Char.myCharz().petFollow.i + (Char.myCharz().petFollow.b == 1 ? 10 : -10), Char.myCharz().petFollow.e + 10, true, -1, -1, Char.myCharz(), 29);
                        }
                    }

                    if (Char.myCharz().cMP < var49) {
                        GameScr.a("-" + (var49 - Char.myCharz().cMP) + " " + mResources.eS, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al - 23, 0, -2, 10);
                    }

                    Res.out("curr MP= " + Char.myCharz().cMP);
                    GameScr.gI().bz = Char.myCharz().cMP;
                    return;
                case 7:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) != null) {
                        var41.ah = var1.reader().readInt();
                        if (var41.ah == -2) {
                            var41.cB = true;
                        }

                        a(var41, var1);

                        try {
                            var41.cR = var1.reader().readShort();
                            var41.cU = var1.reader().readByte();
                            var41.cV = var1.reader().readShort();
                            if (var41.bag >= 201) {
                                Effect var39;
                                (var39 = new Effect(var41.bag, var41, 2, -1, 10, (byte) 1)).b = 5;
                                var41.a(var39);
                            } else {
                                var41.b((int) 0, (int) 201);
                            }

                            return;
                        } catch (Exception var25) {
                            return;
                        }
                    }

                    return;
                case 8:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var41.O = var1.reader().readByte();
                    return;
                case 9:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var41.cHP = var1.readInt3Byte();
                    var41.cHPFull = var1.readInt3Byte();
                    return;
                case 10:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var41.cHP = var1.readInt3Byte();
                    var41.cHPFull = var1.readInt3Byte();
                    var41.V = var1.reader().readShort();
                    var41.W = var1.reader().readShort();
                    var41.bW = var1.reader().readShort();
                    if (var41.bW == -1) {
                        var41.t();
                    }

                    return;
                case 11:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var41.cHP = var1.readInt3Byte();
                    var41.cHPFull = var1.readInt3Byte();
                    var41.V = var1.reader().readShort();
                    var41.W = var1.reader().readShort();
                    var41.body = var1.reader().readShort();
                    if (var41.body == -1) {
                        var41.u();
                    }

                    return;
                case 12:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var41.cHP = var1.readInt3Byte();
                    var41.cHPFull = var1.readInt3Byte();
                    var41.V = var1.reader().readShort();
                    var41.W = var1.reader().readShort();
                    var41.leg = var1.reader().readShort();
                    if (var41.leg == -1) {
                        var41.v();
                    }

                    return;
                case 13:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var41.cHP = var1.readInt3Byte();
                    var41.cHPFull = var1.readInt3Byte();
                    var41.V = var1.reader().readShort();
                    var41.W = var1.reader().readShort();
                    return;
                case 14:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var41.cHP = var1.readInt3Byte();
                    if (var1.reader().readByte() == 1) {
                        ServerEffect.a(11, var41, 5);
                        ServerEffect.a(104, var41, 4);
                    }

                    try {
                        var41.cHPFull = var1.readInt3Byte();
                    } catch (Exception var24) {
                        ;
                    }

                    return;
                case 15:
                    if ((var41 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var41.cHP = var1.readInt3Byte();
                    var41.cHPFull = var1.readInt3Byte();
                    var41.cx = var1.reader().readShort();
                    var41.cy = var1.reader().readShort();
                    var41.statusMe = 1;
                    var41.G = 0;
                    ServerEffect.a(109, var41, 2);
                    return;
                case 19:
                    Char.myCharz().h();
                    return;
                case 23:
                    short var37;
                    Skill var43;
                    a(var43 = Skills.get(var37 = var1.reader().readShort()));
                    if (var37 != 0 && var37 != 14 && var37 != 28) {
                        GameScr.aC.a(mResources.bG + " " + var43.a.b, 0);
                    }

                    return;
                case 35:
                    var34 = var1.reader().readInt();
                    Res.out("CID = " + var34);
                    if (TileMap.l == 130) {
                        GameScr.gI().w();
                    }

                    if (var34 == Char.myCharz().charID) {
                        Char.myCharz().aM = var1.reader().readByte();
                        if (GameScr.gI().x() && Char.myCharz().aM != 0) {
                            GameScr.gI().w();
                        }

                        Res.out("type pk= " + Char.myCharz().aM);
                        Char.myCharz().aS = null;
                        GameScr.gI();
                        if (!GameScr.a(Char.myCharz().aP)) {
                            Char.myCharz().aP = null;
                        }

                        Char.myCharz().itemFocus = null;
                    } else if ((var41 = GameScr.findCharInMap(var34)) != null) {
                        Res.out("type pk= " + var41.aM);
                        var41.aM = var1.reader().readByte();
                        if (var41.H()) {
                            Char.myCharz().aT = var41;
                        }
                    }

                    for (var44 = 0; var44 < GameScr.D.size(); ++var44) {
                        Char var36;
                        if ((var36 = GameScr.findCharInMap(var44)) != null && var36.aM != 0 && var36.aM == Char.myCharz().aM) {
                            if (!Char.myCharz().aP.isMobMe) {
                                Char.myCharz().aP = null;
                            }

                            Char.myCharz().aS = null;
                            Char.myCharz().itemFocus = null;
                            break;
                        }
                    }

                    Res.out("update type pk= ");
                    return;
                case 61:
                    var5 = var1.reader().readUTF();
                    byte[] var33 = new byte[var1.reader().readInt()];
                    var1.reader().read(var33);
                    if (var33.length == 0) {
                        var33 = null;
                    }

                    if (var5.equals("KSkill")) {
                        GameScr.gI().b(var33);
                        return;
                    } else {
                        if (var5.equals("OSkill")) {
                            GameScr.gI().a(var33);
                        } else if (var5.equals("CSkill")) {
                            GameScr.gI().c(var33);
                            return;
                        }

                        return;
                    }
                case 62:
                    Res.out("ME UPDATE SKILL");
                    Skill var32 = Skills.get(var1.reader().readShort());

                    for (var34 = 0; var34 < Char.myCharz().ay.size(); ++var34) {
                        if (((Skill) Char.myCharz().ay.elementAt(var34)).a.a == var32.a.a) {
                            Char.myCharz().ay.setElementAt(var32, var34);
                            break;
                        }
                    }

                    for (var34 = 0; var34 < Char.myCharz().az.size(); ++var34) {
                        if (((Skill) Char.myCharz().az.elementAt(var34)).a.a == var32.a.a) {
                            Char.myCharz().az.setElementAt(var32, var34);
                            break;
                        }
                    }

                    for (var34 = 0; var34 < GameScr.aP.length; ++var34) {
                        if (GameScr.aP[var34] != null && GameScr.aP[var34].a.a == var32.a.a) {
                            GameScr.aP[var34] = var32;
                            break;
                        }
                    }

                    for (var34 = 0; var34 < GameScr.aO.length; ++var34) {
                        if (GameScr.aO[var34] != null && GameScr.aO[var34].a.a == var32.a.a) {
                            GameScr.aO[var34] = var32;
                            break;
                        }
                    }

                    if (Char.myCharz().aB.a.a == var32.a.a) {
                        Char.myCharz().aB = var32;
                    }

                    GameScr.aC.a(mResources.ez + var32.a.b + mResources.eA + var32.c, 0);
                    return;
                case 63:
                    if ((var2 = var1.reader().readByte()) > 0) {
                        InfoDlg.a();
                        MyVector var3 = GameCanvas.panel.Q;

                        for (var4 = 0; var4 < var2; ++var4) {
                            var5 = var1.reader().readUTF();
                            String var6 = var1.reader().readUTF();
                            short var7 = var1.reader().readShort();
                            Char.myCharz().aT.M = var7;
                            Command var38;
                            (var38 = new Command(var5, 11115, Char.myCharz().aT)).caption2 = var6;
                            var3.addElement(var38);
                        }

                        InfoDlg.hide();
                        GameCanvas.panel.g();
                    }

                    return;
                default:
                    return;
            }
        } catch (Exception var30) {
            var30.printStackTrace();
        } finally {
            if (var1 != null) {
                var1.cleanup();
            }

        }

    }

    private static void a(Skill var0) {
        if (Char.myCharz().aB == null) {
            Char.myCharz().aB = var0;
        } else if (var0.a.equals(Char.myCharz().aB.a)) {
            Char.myCharz().aB = var0;
        }

        Char.myCharz().ay.addElement(var0);
        if ((var0.a.e == 1 || var0.a.e == 4 || var0.a.e == 2 || var0.a.e == 3) && (var0.a.c == 0 || var0.a.c > 0 && var0.c > 0)) {
            if (var0.a.a == Char.myCharz().aO) {
                Service.gI().i(Char.myCharz().aO);
            }

            Char.myCharz().az.addElement(var0);
        }

    }

    private static boolean a(Char var0, Message var1) {
        try {
            var0.clevel = var1.reader().readByte();
            var0.bb = var1.reader().readBoolean();
            var0.aM = var1.reader().readByte();
            Res.out("ADD TYPE PK= " + var0.aM + " to player " + var0.charID);
            var0.aw = GameScr.I[var1.reader().readByte()];
            var0.cgender = var1.reader().readByte();
            var0.head = var1.reader().readShort();
            var0.cName = var1.reader().readUTF();
            var0.cHP = var1.readInt3Byte();
            var0.cP = var0.cHP;
            if (var0.cHP == 0) {
                var0.statusMe = 14;
            }

            var0.cHPFull = var1.readInt3Byte();
            if (var0.cy >= TileMap.d - 100) {
                var0.bp = true;
            }

            var0.body = var1.reader().readShort();
            var0.leg = var1.reader().readShort();
            var0.bag = var1.reader().readUnsignedByte();
            Res.out(" body= " + var0.body + " leg= " + var0.leg + " bag=" + var0.bag + "BAG ==" + var0.bag + "*********************************");
            var0.bc = true;
            var1.reader().readByte();
            if (var0.bW == -1) {
                var0.t();
            }

            if (var0.body == -1) {
                var0.u();
            }

            if (var0.leg == -1) {
                var0.v();
            }

            Res.out("1");
            var0.cx = var1.reader().readShort();
            var0.cy = var1.reader().readShort();
            var0.cj = var0.cx;
            var0.ck = var0.cy;
            var0.V = var1.reader().readShort();
            var0.W = var1.reader().readShort();
            byte var2 = var1.reader().readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                nr_dv var4 = new nr_dv(var1.reader().readByte(), var1.reader().readInt(), var1.reader().readInt(), var1.reader().readShort());
                var0.aA.addElement(var4);
            }

            Res.out("Controller readCharInfo body: body|leg|bag " + var0.body + var0.leg + var0.bag);
            return true;
        } catch (Exception var5) {
            var5.printStackTrace();
            return false;
        }
    }

    private void g(Message var1) {
        try {
            String var2 = var1.reader().readUTF();
            byte var3 = var1.reader().readByte();
            byte[] var6;
            Image var4 = a(var6 = NinjaUtil.a(var1));
            nr_aq.a(var2, var4, var3);
            if (var6 != null && mGraphics.zoomLevel > 1) {
                nr_aq.a(var2, var3, var6);
                return;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }

    private void b(DataInputStream var1, boolean var2) {
        try {
            var1.mark(100000);
            GameScr.an = var1.readByte();
            byte var3;
            byte[] var8;
            if ((var3 = var1.readByte()) == 0) {
                GameScr.gI().optionTemplateId = new ItemOptionTemplate[var1.readUnsignedByte()];

                for (int var7 = 0; var7 < GameScr.gI().optionTemplateId.length; ++var7) {
                    GameScr.gI().optionTemplateId[var7] = new ItemOptionTemplate();
                    GameScr.gI().optionTemplateId[var7].id = var7;
                    GameScr.gI().optionTemplateId[var7].name = var1.readUTF();
                    GameScr.gI();
                    var1.readByte();
                }

                if (var2) {
                    var1.reset();
                    var8 = new byte[var1.available()];
                    var1.readFully(var8);
                    Rms.a("NRitem0", var8);
                    return;
                }
            } else {
                short var9;
                if (var3 == 1) {
                    ItemTemplates.itemTemplates.clear();
                    var9 = var1.readShort();

                    for (int var4 = 0; var4 < var9; ++var4) {
                        ItemTemplates.add(new ItemTemplate((short) var4, var1.readByte(), var1.readByte(), var1.readUTF(), var1.readUTF(), var1.readByte(), var1.readInt(), var1.readShort(), var1.readShort(), var1.readBoolean()));
                    }

                    if (var2) {
                        var1.reset();
                        byte[] var10 = new byte[var1.available()];
                        var1.readFully(var10);
                        Rms.a("NRitem1", var10);
                        return;
                    }
                } else if (var3 == 2) {
                    var9 = var1.readShort();
                    short var11 = var1.readShort();

                    for (int var5 = var9; var5 < var11; ++var5) {
                        ItemTemplates.add(new ItemTemplate((short) var5, var1.readByte(), var1.readByte(), var1.readUTF(), var1.readUTF(), var1.readByte(), var1.readInt(), var1.readShort(), var1.readShort(), var1.readBoolean()));
                    }

                    if (var2) {
                        var1.reset();
                        byte[] var12 = new byte[var1.available()];
                        var1.readFully(var12);
                        Rms.a("NRitem2", var12);
                        var8 = new byte[]{GameScr.an};
                        Rms.a("NRitemVersion", var8);
                        nr_x.h = false;
                        if (GameScr.ao == GameScr.ak && GameScr.ap == GameScr.al && GameScr.aq == GameScr.am && GameScr.ar == GameScr.an) {
                            GameScr.gI();
                            GameScr.k();
                            GameScr.gI();
                            GameScr.i();
                            GameScr.gI();
                            GameScr.j();
                            GameScr.gI();
                            GameScr.l();
                            Service.gI().clientOK();
                            return;
                        }
                    }
                } else if (var3 == 100) {
                    Char.cQ = c(var1);
                    if (var2) {
                        var1.reset();
                        var8 = new byte[var1.available()];
                        var1.readFully(var8);
                        Rms.a("NRitem100", var8);
                        return;
                    }
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    private static void b(Message var0, int var1) {
        try {
            byte var2;
            int[][] var3 = new int[var2 = var0.reader().readByte()][];

            for (int var4 = 0; var4 < var2; ++var4) {
                byte var5 = var0.reader().readByte();
                var3[var4] = new int[var5];

                for (int var6 = 0; var6 < var5; ++var6) {
                    var3[var4][var6] = var0.reader().readByte();
                }
            }

            c.put(String.valueOf(var1), var3);
        } catch (Exception var7) {
            var7.printStackTrace();
        }
    }

    private static int[][] c(DataInputStream var0) {
        int[][] var1 = new int[][]{{542, 543}};

        try {
            var1 = new int[var0.readShort()][];

            for (int var2 = 0; var2 < var1.length; ++var2) {
                byte var3 = var0.readByte();
                var1[var2] = new int[var3];

                for (int var4 = 0; var4 < var3; ++var4) {
                    var1[var2][var4] = var0.readShort();
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return var1;
    }

    private void h(Message var1) {
        try {
            byte var2;
            if ((var2 = var1.reader().readByte()) == 0) {
                var2 = var2;
                var1 = var1;

                try {
                    byte var3;
                    short var13;
                    if ((var3 = var1.reader().readByte()) == 0) {
                        var13 = var1.reader().readShort();
                        String var16 = var1.reader().readUTF();
                        String var5 = var1.reader().readUTF();
                        int var6 = var1.reader().readInt();
                        short var7 = var1.reader().readShort();
                        byte var11 = var1.reader().readByte();
                        (GameScr.bZ = new nr_cc(var2, var13, var16, var5, var6, var7)).g = var11;
                        GameScr.bZ.a(var2, 0, 0);
                        return;
                    }

                    nr_cc var10;
                    if (var3 == 1) {
                        int var12 = var1.reader().readInt();
                        int var4 = var1.reader().readInt();
                        if (GameScr.bZ != null) {
                            var10 = GameScr.bZ;
                            GameScr.bZ.a = var2;
                            var10.c = var12;
                            var10.d = var4;
                            return;
                        }
                    } else {
                        if (var3 == 2) {
                            var3 = var1.reader().readByte();
                            byte var15 = 0;
                            if (var3 == 1) {
                                var15 = 1;
                            } else if (var3 == 2) {
                                var15 = 2;
                            }

                            GameScr.bZ = null;
                            GameScr.a(var15, -1, GameCanvas.B, GameCanvas.C, 0, 0);
                            return;
                        }

                        if (var3 == 5) {
                            var13 = var1.reader().readShort();
                            if (GameScr.bZ != null) {
                                var10 = GameScr.bZ;
                                GameScr.bZ.a = var2;
                                var10.m = var13;
                                var10.n = GameCanvas.b;
                                return;
                            }
                        } else if (var3 == 4) {
                            var3 = var1.reader().readByte();
                            byte var14 = var1.reader().readByte();
                            if (GameScr.bZ != null) {
                                GameScr.bZ.a(var2, var3, var14);
                                return;
                            }
                        }
                    }
                } catch (Exception var8) {
                    ;
                }

                return;
            }
        } catch (Exception var9) {
            ;
        }

    }

    private static void i(Message var0) {
        try {
            if (var0.reader().readByte() == 0) {
                short var3 = var0.reader().readShort();
                Char.myCharz().cV = var3;
                SoundMn.gI();
                SoundMn.getStrOption();
                return;
            }
        } catch (Exception var2) {
            ;
        }

    }
}
