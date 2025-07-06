package nro;

import java.io.IOException;
import main.GameCanvas;
import mod.Mod;

public final class Service {

    private static Service instance;
    public static long curCheckController;
    public static long curCheckMap;
    public static long logController;
    public static long logMap;
    public static boolean reciveFromMainSession;

    public static Service gI() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    public static Message messageNotLogin(byte var0) throws IOException {
        Message var1 = new Message((byte) -29);
        var1.writer().writeByte(var0);
        return var1;
    }

    private static Message j(byte var0) throws IOException {
        Message var1 = new Message((byte) -28);
        var1.writer().writeByte(var0);
        return var1;
    }
    public ISession session = Session_ME.gI();

    public final void gotoPlayer(int id) {
        Message message = null;
        try {
            message = new Message((byte) 18);
            message.writer().writeInt(id);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void charInfo(String day, String month, String year, String address, String cmnd, String dayCmnd, String noicapCmnd, String sdt, String name) {
        Message message = null;
        try {
            message = new Message((byte) 42);
            message.writer().writeUTF(day);
            message.writer().writeUTF(month);
            message.writer().writeUTF(year);
            message.writer().writeUTF(address);
            message.writer().writeUTF(cmnd);
            message.writer().writeUTF(dayCmnd);
            message.writer().writeUTF(noicapCmnd);
            message.writer().writeUTF(sdt);
            message.writer().writeUTF(name);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void combine(byte action, MyVector id) {
        Res.out("combine");
        Message message = null;
        try {
            message = new Message((byte) -81);
            message.writer().writeByte(action);
            message.writer().writeByte(id.size());
            if (action == 1) {
                for (int i = 0; i < id.size(); i++) {
                    message.writer().writeByte(((Item) id.elementAt(i)).indexUI);
                    Res.out("gui id " + ((Item) id.elementAt(i)).indexUI);
                }
            }
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void giaodich(byte action, int playerID, byte index, int num) {
        Res.out("giao dich action = " + action);
        Message message = null;
        try {
            message = new Message((byte) -86);
            message.writer().writeByte(action);
            if (action == 0 || action == 1) {
                message.writer().writeInt(playerID);
            }
            if (action == 2) {
                Res.out("gui len index =" + index + " num= " + num);
                message.writer().writeByte(index);
                message.writer().writeInt(num);
            }
            if (action == 4) {
                message.writer().writeByte(index);
            }
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void sendClientInput(TField[] t) {
        Message message = null;

        try {
            Res.out(" gui input ");
            message = new Message((byte) -125);
            Res.out("byte lent = " + t.length);
            message.writer().writeByte(t.length);
            for (int i = 0; i < t.length; ++i) {
                message.writer().writeUTF(t[i].getText());
            }
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void speacialSkill(byte index) {
        Message message = null;

        try {
            message = new Message((byte) 112);
            message.writer().writeByte(index);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void mobCaptcha(char ch) {
        Res.out("cap char c= " + ch);
        Message message = null;
        try {
            message = new Message((byte) -85);
            message.writer().writeChar(ch);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void friend(byte action, int playerId) {
        Res.out("add friend");
        Message message = null;
        try {
            message = new Message((byte) -80);
            message.writer().writeByte(action);
            if (playerId != -1) {
                message.writer().writeInt(playerId);
            }
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void getArchivemnt(int index) {
        Res.out("get ngoc");
        Message message = null;
        try {
            message = new Message((byte) -76);
            message.writer().writeByte(index);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void getPlayerMenu(int playerID) {
        Message message = null;
        try {
            message = new Message((byte) -79);
            message.writer().writeInt(playerID);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void clanImage(byte id) {
        Message message = null;
        try {
            message = new Message((byte) -62);
            message.writer().writeByte(id);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void skill_not_focus(byte status) {
        Res.out("Skill not focus so " + status);
        Message message = null;
        try {
            message = new Message((byte) -45);
            message.writer().writeByte(status);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void clanDonate(int var1) {
        Message message = null;
        try {
            Res.out("CLAN DONATE");
            message = new Message((byte) -54);
            message.writer().writeInt(var1);
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }
    }

    public final void clanMessage(int type, String text, int clanID) {
        Message message = null;
        try {
            Res.out("CLAN MESSAGE");
            (message = new Message((byte) -51)).writer().writeByte(type);
            if (type == 0) {
                message.writer().writeUTF(text);
            }
            if (type == 2) {
                message.writer().writeInt(clanID);
            }
            this.session.sendMessage(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            message.cleanup();
        }

    }

    public final void useItem(byte type, byte where, byte index, short template) {
        if (Char.myCharz().statusMe != 14) {
            Message var5 = null;

            try {
                (var5 = new Message((byte) -43)).writer().writeByte(type);
                var5.writer().writeByte(where);
                var5.writer().writeByte(index);
                if (index == -1) {
                    var5.writer().writeShort(template);
                }

                this.session.sendMessage(var5);
                return;
            } catch (Exception var8) {
                var8.printStackTrace();
            } finally {
                var5.cleanup();
            }

        }
    }

    public final void joinClan(int id, byte action) {
        Res.out("JOIN CLAN " + id);
        Message var3 = null;

        try {
            (var3 = new Message((byte) -49)).writer().writeInt(id);
            var3.writer().writeByte(action);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void clanMember(int id) {
        Res.out("MEMBER CLAN " + id);
        Message var2 = null;

        try {
            (var2 = new Message((byte) -50)).writer().writeInt(id);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void searchClan(String text) {
        Res.out("send SEARCH CLAN " + text);
        Message var2 = null;

        try {
            (var2 = new Message((byte) -47)).writer().writeUTF(text);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void clanRemote(int id, byte role) {
        Res.out("REMOTE CLAN id = " + id + " role= " + role);
        Message var3 = null;

        try {
            (var3 = new Message((byte) -56)).writer().writeInt(id);
            var3.writer().writeByte(role);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void leaveClan() {
        Res.out("LEAVE CLAN");
        Message var1 = null;

        try {
            var1 = new Message((byte) -55);
            this.session.sendMessage(var1);
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void clanInvite(byte action, int playerId, int clanId, int code) {
        Res.out("invite action = " + action + "layerid= " + playerId + " clanID= " + clanId + " code= " + code);
        Message var5 = null;

        try {
            (var5 = new Message((byte) -57)).writer().writeByte(action);
            if (action == 0) {
                var5.writer().writeInt(playerId);
            }

            if (action == 1 || action == 2) {
                var5.writer().writeInt(clanId);
                var5.writer().writeInt(code);
            }

            this.session.sendMessage(var5);
            return;
        } catch (Exception var8) {
            var8.printStackTrace();
        } finally {
            var5.cleanup();
        }

    }

    public final void getClan(byte action, byte id, String text) {
        Message var4 = null;

        try {
            (var4 = new Message((byte) -46)).writer().writeByte(action);
            if (action == 2 || action == 4) {
                var4.writer().writeByte(id);
                var4.writer().writeUTF(text);
                Res.out("SEND SLOGAN= " + text);
            }

            this.session.sendMessage(var4);
            return;
        } catch (Exception var7) {
            var7.printStackTrace();
        } finally {
            var4.cleanup();
        }

    }

    public final void getItem(byte type, byte id) {
        Message var3 = null;

        try {
            (var3 = new Message((byte) -40)).writer().writeByte(type);
            var3.writer().writeByte(id);
            this.session.sendMessage(var3);
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void setClientType() {
        Res.out("SET CLIENT TYPE");
        if (Rms.loadRmsInt("clienttype") != -1) {
            Main.typeClient = Rms.loadRmsInt("clienttype");
        }

        try {
            Res.out("setType");
            Message var1;
            (var1 = messageNotLogin((byte) 2)).writer().writeByte(Main.typeClient);
            var1.writer().writeByte(mGraphics.zoomLevel);
            Res.out("gui zoomlevel = " + mGraphics.zoomLevel);
            var1.writer().writeBoolean(false);
            var1.writer().writeInt(GameCanvas.z);
            var1.writer().writeInt(GameCanvas.A);
            var1.writer().writeBoolean(TField.isQwerty);
            var1.writer().writeBoolean(GameCanvas.isTouch);
            var1.writer().writeUTF(System.getProperty("microedition.platform") + "|" + "2.3.0");
            this.session.sendMessage(var1);
            var1.cleanup();
        } catch (IOException var2) {
            var2.printStackTrace();
        }
    }

    public final void sendCheckController() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -120);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            ;
        } finally {
            curCheckController = Main.c();
            var1.cleanup();
        }

    }

    public final void sendCheckMap() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -121);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            ;
        } finally {
            curCheckMap = Main.c();
            var1.cleanup();
        }

    }

    public final void login(String var1, String var2, String var3, byte var4) {
        Res.out("Login " + var1 + " " + var2 + " " + var3);

        try {
            Message var5;
            (var5 = messageNotLogin((byte) 0)).writer().writeUTF(var1);
            var5.writer().writeUTF(var2);
            var5.writer().writeUTF(var3);
            var5.writer().writeByte(var4);
            var5.writer().writeByte(mResources.fw);
            this.session.sendMessage(var5);
            var5.cleanup();
        } catch (IOException var6) {
            var6.printStackTrace();
        }
    }

    public final void requestRegister(String var1, String var2, String var3, String var4) {
        Res.out("Request Register " + var1 + " " + var2 + " " + var4);

        try {
            Message var6;
            (var6 = messageNotLogin((byte) 1)).writer().writeUTF(var1);
            var6.writer().writeUTF(var2);
            if (var3 != null && !var3.equals("")) {
                var6.writer().writeUTF(var3);
                var6.writer().writeUTF("a");
            }

            this.session.sendMessage(var6);
            var6.cleanup();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    public final void requestChangeMap() {
        Message var1 = new Message((byte) -23);
        this.session.sendMessage(var1);
        var1.cleanup();
    }

    public final void e(byte var1) {
        Message var2 = new Message((byte) -34);

        try {
            var2.writer().writeByte(var1);
            this.session.sendMessage(var2);
            var2.cleanup();
        } catch (Exception var3) {
            ;
        }
    }

    public final void f(int var1) {
        Message var2 = new Message((byte) 21);

        try {
            var2.writer().writeByte(var1);
            this.session.sendMessage(var2);
            var2.cleanup();
        } catch (Exception var3) {
            ;
        }
    }

    public final void g(int var1) {
        Message var2 = new Message((byte) -78);

        try {
            var2.writer().writeInt(var1);
            this.session.sendMessage(var2);
            var2.cleanup();
        } catch (Exception var3) {
            ;
        }
    }

    public final void g() {
        int var1 = Char.myCharz().cx - Char.myCharz().bC;
        int var2 = Char.myCharz().cy - Char.myCharz().bD;
        if (!Char.bF && (var1 != 0 || var2 != 0) && !Controller.b && !Char.myCharz().s && Char.myCharz().cy > 0 && !Char.myCharz().cL) {
            try {
                Message var4 = new Message((byte) -7);
                Char.myCharz().bC = Char.myCharz().cx;
                Char.myCharz().bD = Char.myCharz().cy;
                Char.myCharz();
                Char.myCharz();
                Char.myCharz();
                Char.myCharz();
                if (TileMap.a(Char.myCharz().cx / TileMap.i, Char.myCharz().cy / TileMap.i) == 0) {
                    var4.writer().writeByte(1);
                    if (Char.myCharz().an) {
                        if (!Char.myCharz().bt) {
                            Char var10000 = Char.myCharz();
                            var10000.cMP -= Char.myCharz().cq / 100 * (Char.myCharz().cA == 1 ? 2 : 1);
                        }

                        if (Char.myCharz().cMP < 0) {
                            Char.myCharz().cMP = 0;
                        }

                        GameScr.gI().bB = true;
                        GameScr.gI().bA = 0;
                    }
                } else {
                    var4.writer().writeByte(0);
                }

                var4.writer().writeShort(Char.myCharz().cx);
                if (var2 != 0) {
                    var4.writer().writeShort(Char.myCharz().cy);
                }

                this.session.sendMessage(var4);
                ++GameScr.L;
                var4.cleanup();
            } catch (Exception var3) {
                var3.printStackTrace();
            }
        }
    }

    public final void createChar(String var1, int var2, int var3) {
        Message var4 = new Message((byte) -28);

        try {
            var4.writer().writeByte(2);
            var4.writer().writeUTF(var1);
            var4.writer().writeByte(var2);
            var4.writer().writeByte(var3);
            Res.out("name= " + var1 + " gender= " + var2 + " hair=" + var3);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        this.session.sendMessage(var4);
    }

    public final void requestModTemplate(int var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) 11)).writer().writeByte(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void saleItem(byte var1, byte var2, short var3) {
        Message var4 = null;

        try {
            (var4 = new Message((byte) 7)).writer().writeByte(var1);
            var4.writer().writeByte(var2);
            var4.writer().writeShort(var3);
            this.session.sendMessage(var4);
            return;
        } catch (Exception var7) {
            var7.printStackTrace();
        } finally {
            var4.cleanup();
        }

    }

    public final void buyitem(byte var1, int var2, int var3) {
        Message var8 = null;

        try {
            (var8 = new Message((byte) 6)).
                    writer().writeByte(var1);
            var8.writer().writeShort(var2);
            if(var3 > 1)
            {
                var8.writer().writeShort(var3);
            }
            this.session.sendMessage(var8);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var8.cleanup();
        }

    }

    public final void i(int var1) {
        Res.out(Char.myCharz().cName + " SELECT SKILL " + var1);
        Message var2 = null;

        try {
            (var2 = new Message((byte) 34)).writer().writeShort(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void getEffData(short var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) -66)).writer().writeShort(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void openUIZone() {
        Message var1 = null;

        try {
            var1 = new Message((byte) 29);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void confirmMenu(short var1, byte var2) {
        Res.out("confirme menu=" + var2 + " npc= " + var1);
        Message var3 = null;

        try {
            (var3 = new Message((byte) 32)).writer().writeShort(var1);
            var3.writer().writeByte(var2);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void openMenu(int var1) {
        Res.out("npc id" + var1);
        Message var2 = null;

        try {
            (var2 = new Message((byte) 33)).writer().writeShort(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void menu(int var1, int var2, int var3) {
        Message var4 = null;

        try {
            (var4 = new Message((byte) 22)).writer().writeByte(var1);
            var4.writer().writeByte(var2);
            var4.writer().writeByte(var3);
            this.session.sendMessage(var4);
            return;
        } catch (Exception var7) {
            var7.printStackTrace();
        } finally {
            var4.cleanup();
        }

    }

    public final void menuId(short var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) 27)).writer().writeShort(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void textBoxId(short var1, String var2) {
        Message var3 = null;

        try {
            (var3 = new Message((byte) 88)).writer().writeShort(var1);
            var3.writer().writeUTF(var2);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void crystalCollectLock(Item[] var1) {
        GameCanvas.K.b();
        Message var2 = null;

        try {
            var2 = new Message((byte) 13);

            for (int var3 = 0; var3 < var1.length; ++var3) {
                if (var1[var3] != null) {
                    var2.writer().writeByte(var1[var3].indexUI);
                }
            }

            this.session.sendMessage(var2);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void acceptInviteTrade(int var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) 37)).writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void cancelInviteTrade() {
        Message var1 = null;

        try {
            var1 = new Message((byte) 50);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void sendPlayerAttack(MyVector var1, MyVector var2, int var3) {
        try {
            Res.out("SEND ATTACT vChar=  " + var2.size());
            Message var4 = null;
            if (var3 != 0) {
                Mob var5;
                Char var7;
                if (var1.size() > 0 && var2.size() > 0) {
                    if (var3 == 1) {
                        var4 = new Message((byte) -4);
                    } else if (var3 == 2) {
                        var4 = new Message((byte) 67);
                    }

                    var4.writer().writeByte(var1.size());

                    for (var3 = 0; var3 < var1.size(); ++var3) {
                        var5 = (Mob) var1.elementAt(var3);
                        var4.writer().writeByte(var5.y);
                    }

                    for (var3 = 0; var3 < var2.size(); ++var3) {
                        if ((var7 = (Char) var2.elementAt(var3)) != null) {
                            var4.writer().writeInt(var7.charID);
                        } else {
                            var4.writer().writeInt(-1);
                        }
                    }
                } else if (var1.size() > 0) {
                    Res.out("PLAYER ATTACK NPC");
                    var4 = new Message((byte) 54);

                    for (var3 = 0; var3 < var1.size(); ++var3) {
                        if (!(var5 = (Mob) var1.elementAt(var3)).isMobMe) {
                            var4.writer().writeByte(var5.y);
                        } else {
                            var4.writer().writeByte(-1);
                            var4.writer().writeInt(var5.y);
                        }
                    }
                } else if (var2.size() > 0) {
                    Res.out("player attack player ");
                    var4 = new Message((byte) -60);

                    for (var3 = 0; var3 < var2.size(); ++var3) {
                        var7 = (Char) var2.elementAt(var3);
                        var4.writer().writeInt(var7.charID);
                    }
                }

                if (var4 != null) {
                    this.session.sendMessage(var4);
                }
            }
        } catch (Exception var6) {
            ;
        }
    }

    public final void l(int var1) {
        if (GameScr.bl <= 0) {
            Message var2 = null;

            try {
                (var2 = new Message((byte) -20)).writer().writeShort(var1);
                this.session.sendMessage(var2);
                GameScr.bl = 60;
                return;
            } catch (Exception var5) {
                var5.printStackTrace();
            } finally {
                var2.cleanup();
            }

        }
    }

    public final void j() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -15);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void k() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -16);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

   

public final void chat(String var1) {
    if (Mod.chat(var1)) return; // Nếu là lệnh mod, xử lý rồi return, không gửi ra server

    Message var2 = null;
    try {
        Res.out("Send chat " + var1);
        var2 = new Message((byte) 44);
        var2.writer().writeUTF(var1);
        this.session.sendMessage(var2);
    } catch (Exception var5) {
        var5.printStackTrace();
    } finally {
        if (var2 != null) var2.cleanup();
    }
}

    public final void updateData() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -87);
            if (Session_ME.gI2().d() && !Session_ME.gI2().e) {
                this.session = Session_ME.gI2();
            } else {
                this.session = Session_ME.gI();
            }

            this.session.sendMessage(var1);
            this.session = Session_ME.gI();
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void updateMap() {
        Message var1 = null;

        try {
            var1 = j((byte) 6);
            if (Session_ME.gI2().d() && !Session_ME.gI2().e) {
                this.session = Session_ME.gI2();
            } else {
                this.session = Session_ME.gI();
            }

            this.session.sendMessage(var1);
            this.session = Session_ME.gI();
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void updateSkill() {
        Message var1 = null;

        try {
            var1 = j((byte) 7);
            if (Session_ME.gI2().d() && !Session_ME.gI2().e) {
                this.session = Session_ME.gI2();
            } else {
                this.session = Session_ME.gI();
            }

            this.session.sendMessage(var1);
            this.session = Session_ME.gI();
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void updateItem() {
        Message var1 = null;

        try {
            var1 = j((byte) 8);
            if (Session_ME.gI2().d() && !Session_ME.gI2().e) {
                this.session = Session_ME.gI2();
            } else {
                this.session = Session_ME.gI();
            }

            this.session.sendMessage(var1);
            this.session = Session_ME.gI();
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void clientOK() {
        Message var1 = null;

        try {
            var1 = j((byte) 13);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void addFriend(String var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) 53)).writer().writeUTF(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void addPartyAccept(int var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) 76)).writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void addPartyCancel(int var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) 77)).writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void player_vs_player(byte var1, byte var2, int var3) {
        Res.out("PLAYER VS PLAYER");
        Message var4 = null;

        try {
            (var4 = new Message((byte) -59)).writer().writeByte(var1);
            var4.writer().writeByte(var2);
            var4.writer().writeInt(var3);
            this.session.sendMessage(var4);
            return;
        } catch (Exception var7) {
            var7.printStackTrace();
        } finally {
            var4.cleanup();
        }

    }

    public final void requestMaptemplate(int var1) {
        Message var2 = null;

        try {
            (var2 = j((byte) 10)).writer().writeByte(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void acceptPleaseParty(String var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) 17)).writer().writeUTF(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void chatPlayer(String var1, int var2) {
        Message var3 = null;

        try {
            (var3 = new Message((byte) -72)).writer().writeInt(var2);
            var3.writer().writeUTF(var1);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void chatGlobal(String var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) -71)).writer().writeUTF(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void sendCardInfo(String var1, String var2) {
        Message var3 = null;

        try {
            (var3 = j((byte) 16)).writer().writeUTF(var1);
            var3.writer().writeUTF(var2);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void changeName(String var1, int var2) {
        Message var3 = null;

        try {
            (var3 = j((byte) 18)).writer().writeInt(var2);
            var3.writer().writeUTF(var1);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void p(int var1) {
        GameCanvas.b();
        Message var2 = null;

        try {
            (var2 = new Message((byte) -67)).writer().writeInt(var1);
            if (Session_ME.gI2().d() && !Session_ME.gI2().e) {
                this.session = Session_ME.gI2();
            } else {
                this.session = Session_ME.gI();
            }

            this.session.sendMessage(var2);
            this.session = Session_ME.gI();
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void q(int var1) {
        Message var2 = null;

        try {
            (var2 = j((byte) 37)).writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void r(int var1) {
        Message var2 = null;

        try {
            (var2 = j((byte) 41)).writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void s(int var1) {
        Message var2 = null;

        try {
            (var2 = j((byte) 39)).writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void getBgTemplate(short var1) {
        Res.out("get image id= " + var1);
        Message var2 = null;

        try {
            (var2 = new Message((byte) -32)).writer().writeShort(var1);
            if (Session_ME.gI2().d() && !Session_ME.gI2().e) {
                this.session = Session_ME.gI2();
            } else {
                this.session = Session_ME.gI();
            }

            this.session.sendMessage(var2);
            this.session = Session_ME.gI();
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void getMapOffline() {
        Res.out("send map offline");
        Message var1 = null;

        try {
            var1 = new Message((byte) -33);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void r() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -38);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void s() {
        Res.out("finishLoadMap");
        Message var1 = null;

        try {
            var1 = new Message((byte) -39);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void f(byte var1) {
        Res.out("request bag image");
        Message var2 = null;

        try {
            (var2 = new Message((byte) -63)).writer().writeByte(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void f(String var1) {
        Res.out("Login 2");
        Message var2 = null;

        try {
            (var2 = new Message((byte) -101)).writer().writeUTF(var1);
            var2.writer().writeByte(1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void g(byte var1) {
        Res.out("request magic tree");
        Message var7 = null;

        try {
            (var7 = new Message((byte) -34)).writer().writeByte(2);
            this.session.sendMessage(var7);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var7.cleanup();
        }

    }

    public final void upPotential(int var1, int var2) {
        Message var3 = null;

        try {
            boolean var4 = true;
            Message var9;
            (var9 = new Message((byte) -30)).writer().writeByte(16);
            var3 = var9;
            var9.writer().writeByte(var1);
            var9.writer().writeShort(var2);
            Res.out("gửi tăng tiềm năng NUM= " + var2 + " type= " + var1);
            this.session.sendMessage(var9);
            return;
        } catch (Exception var7) {
            var7.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void getResource(byte var1, MyVector var2) {
        Res.out("request resource action= " + var1);
        Message var7 = null;

        try {
            (var7 = new Message((byte) -74)).writer().writeByte(var1);
            if (Session_ME.gI2().d() && !Session_ME.gI2().e) {
                this.session = Session_ME.gI2();
            } else {
                reciveFromMainSession = true;
                this.session = Session_ME.gI();
            }

            this.session.sendMessage(var7);
            this.session = Session_ME.gI();
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var7.cleanup();
        }

    }

    public final void requestMapSelect(int var1) {
        Res.out("request magic tree");
        Message var2 = null;

        try {
            (var2 = new Message((byte) -91)).writer().writeByte(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void t() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -107);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void sendTop(String var1, byte var2) {
        Message var3 = null;

        try {
            (var3 = new Message((byte) -96)).writer().writeUTF(var1);
            var3.writer().writeByte(var2);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void u(int var1) {
        Res.out("GUI THACH DAUA");
        Message var2 = null;

        try {
            (var2 = new Message((byte) -118)).writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void enemy(byte var1, int var2) {
        Res.out("add friend");
        Message var3 = null;

        try {
            (var3 = new Message((byte) -99)).writer().writeByte(var1);
            if (var1 == 1 || var1 == 2) {
                var3.writer().writeInt(var2);
            }

            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void kigui(byte var1, int var2, byte var3, int var4, int var5) {
        Message var6 = null;

        try {
            Res.out("ki gui action= " + var1 + " item id= " + var2);
            (var6 = new Message((byte) -100)).writer().writeByte(var1);
            if (var1 == 0) {
                var6.writer().writeShort(var2);
                var6.writer().writeByte(var3);
                var6.writer().writeInt(var4);
                var6.writer().writeInt(var5);
                Res.out("ki gui so luong " + var5);
            }

            if (var1 == 1 || var1 == 2) {
                var6.writer().writeShort(var2);
            }

            if (var1 == 3) {
                var6.writer().writeShort(var2);
                var6.writer().writeByte(var3);
                var6.writer().writeInt(var4);
            }

            if (var1 == 4) {
                var6.writer().writeByte(var3);
                var6.writer().writeByte(var4);
                Res.out("currTab= " + var3 + " page= " + var4);
            }

            if (var1 == 5) {
                var6.writer().writeShort(var2);
            }

            this.session.sendMessage(var6);
            return;
        } catch (Exception var9) {
            var9.printStackTrace();
        } finally {
            var6.cleanup();
        }

    }

    public final void getFlag(byte var1, byte var2) {
        Message var3 = null;

        try {
            (var3 = new Message((byte) -103)).writer().writeByte(var1);
            Res.out("------------service--  " + var1 + "   " + var2);
            if (var1 != 0) {
                var3.writer().writeByte(var2);
            }

            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void v(int var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) -104)).writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void h(byte var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) -108)).writer().writeByte(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void u() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -105);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void i(byte var1) {
        Message var2 = null;

        try {
            Res.out("FUNSION");
            (var2 = new Message((byte) 125)).writer().writeByte(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void imageSource(MyVector var1) {
        Message var2 = null;

        try {
            Res.out("IMAGE SOURCE size= " + var1.size());
            (var2 = new Message((byte) -111)).writer().writeShort(var1.size());
            if (var1.size() > 0) {
                for (int var3 = 0; var3 < var1.size(); ++var3) {
                    Res.out("gui len str " + ((nr_u) var1.elementAt(var3)).a);
                    var2.writer().writeUTF(((nr_u) var1.elementAt(var3)).a);
                }
            }

            if (Session_ME.gI2().d() && !Session_ME.gI2().e) {
                this.session = Session_ME.gI2();
            } else {
                this.session = Session_ME.gI();
                reciveFromMainSession = true;
            }

            this.session.sendMessage(var2);
            this.session = Session_ME.gI();
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void sendServerData(byte var1, int var2, byte[] var3) {
        Message var8 = null;

        try {
            Res.out("SERVER DATA");
            (var8 = new Message((byte) -110)).writer().writeByte(1);
            var8.writer().writeInt(var2);
            if (var3 != null) {
                var2 = var3.length;
                var8.writer().writeShort(var2);
                var8.writer().write(var3, 0, var2);
            }

            this.session.sendMessage(var8);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var8.cleanup();
        }

    }

    public final void changeOnKeyScr(byte[] var1) {
        Message var2 = null;

        try {
            var2 = new Message((byte) -113);

            for (int var3 = 0; var3 < GameScr.aP.length; ++var3) {
                var2.writer().writeByte(var1[var3]);
            }

            this.session.sendMessage(var2);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void v() {
        Message var1 = null;

        try {
            var1 = new Message((byte) -114);
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var1.cleanup();
        }

    }

    public final void w(int var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) -30)).writer().writeByte(63);
            var2.writer().writeInt(var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void playerMenuAction(int var1, short var2) {
        Message var3 = null;

        try {
            (var3 = new Message((byte) -30)).writer().writeByte(64);
            var3.writer().writeInt(var1);
            var3.writer().writeShort(var2);
            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void g(String var1) {
        Message var2 = null;

        try {
            (var2 = new Message((byte) 66)).writer().writeUTF(var1);
            Res.out(">>>getGetImgByName = " + var1);
            this.session.sendMessage(var2);
            return;
        } catch (Exception var5) {
            var5.printStackTrace();
        } finally {
            var2.cleanup();
        }

    }

    public final void SendCrackBall(byte var1, byte var2) {
        Message var3 = new Message((byte) -127);

        try {
            var3.writer().writeByte(var1);
            if (var2 > 0) {
                var3.writer().writeByte(var2);
            }

            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void SendRada(int var1, int var2) {
        Message var3 = new Message((byte) 127);

        try {
            var3.writer().writeByte(var1);
            if (var2 != -1) {
                var3.writer().writeShort(var2);
            }

            this.session.sendMessage(var3);
            return;
        } catch (Exception var6) {
            var6.printStackTrace();
        } finally {
            var3.cleanup();
        }

    }

    public final void w() {
        Message var1 = new Message((byte) 69);

        try {
            this.session.sendMessage(var1);
            return;
        } catch (Exception var5) {
            ;
        } finally {
            var1.cleanup();
        }

    }
}
