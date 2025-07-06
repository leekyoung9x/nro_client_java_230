package main;

import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import nro.Controller;
import nro.ChatPopup;
import nro.Char;
import nro.nr_ap;
import nro.Rms;
import nro.mResources;
import nro.nr_ax;
import nro.mScreen;
import nro.nr_ba;
import nro.nr_bc;
import nro.nr_be;
import nro.SmallImage;
import nro.PopUp;
import nro.InfoDlg;
import nro.Session_ME;
import nro.nr_bo;
import nro.Service;
import nro.SoundMn;
import nro.TileMap;
import nro.Waypoint;
import nro.nr_bx;
import nro.ItemMap;
import nro.nr_cf;
import nro.nr_cm;
import nro.nr_cq;
import nro.nr_cr;
import nro.nr_cw;
import nro.Command;
import nro.nr_da;
import nro.mFont;
import nro.Res;
import nro.nr_dn;
import nro.Effect;
import nro.nr_dw;
import nro.EffecMn;
import nro.MyVector;
import nro.SplashScr;
import nro.mGraphics;
import nro.nr_ei;
import nro.nr_eo;
import nro.Panel;
import nro.Item;
import nro.nr_j;
import nro.Main;
import nro.nr_n;
import nro.GameScr;
import nro.nr_v;
import nro.nr_x;
import nro.IActionListener;

public final class GameCanvas extends nr_da implements IActionListener {

    public static boolean lowGraphic = false;
    public static long b = 0L;
    public static boolean c = true;
    public static boolean d;
    public static boolean isTouch = false;
    public static boolean f;
    public static boolean g;
    public static GameCanvas h;
    public static boolean[] i = new boolean[14];
    private static boolean[] aj = new boolean[14];
    public static boolean[] j = new boolean[14];
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static nr_bc[] u = new nr_bc[4];
    public static int gameTick;
    public static int w;
    private static int ak;
    public static boolean x;
    public static boolean y;
    private static long al;
    private static long am;
    public static int z;
    public static int A;
    public static int B;
    public static int C;
    public static mScreen currentScreen;
    public static nr_ax menu;
    public static Panel panel;
    public static Panel panel2;
    public static nr_x loginScr;
    public static nr_be I;
    public static nr_n J;
    public static nr_ba K;
    public static nr_cr L;
    public static Image[] M;
    public static int N;
    private static int an;
    public static int[] O;
    public static int[] P;
    private mGraphics ao = new mGraphics();
    public static Image[] Q;
    public static Image[] R;
    private static MyVector ap;
    private static MyVector aq;
    public static MyVector S;
    public static boolean T;
    private static int ar;
    private static boolean as;
    private static Image at;
    private static Image au;
    public static Image[] U;
    private static Image[] av;
    public static int[] V;
    public static int[] W;
    private static int aw;
    private static int ax;
    private static int ay;
    private static int az;
    private static int[] aA;
    private static int[] aB;
    private static int[] aC;
    public static boolean X;
    private static boolean aD;
    private static int aE;
    public static int Y;
    public static int Z;
    private static int[] aF;
    public static int[] aa;
    private static int[] aG;
    private static int aH;
    private static int[] aI;
    private static Image aJ;
    private static Image aK;
    private static boolean aL;
    private static long aM;
    public static int ab;
    public static Image ac;
    private static int aN;
    private long aO;
    private static MyVector aP;
    private int aQ;
    public static boolean ad;
    private int[] aR;
    private int[] aS;
    private int[] aT;
    private static int[] aU;
    private static Image[] aV;
    private static Image aW;
    private static Image[][] aX;
    public static boolean ae;
    public static nr_bo af;
    public static nr_eo ag;
    public static boolean ah;
    private boolean aY;
    public static nr_j dialog;

    static {
        Object object = new Object();
        an = 0;
        Q = new Image[7];
        R = new Image[7];
        U = new Image[3];
        av = new Image[3];
        Y = -1;
        aF = new int[5];
        aH = 0;
        aI = new int[]{1, 4, 11};
        int[] var10000 = new int[]{-1};
        aM = 0L;
        MyVector nr_ef = new MyVector("vFlyText");
        aP = new MyVector("");
        ad = false;
        Random random = new Random();
        ae = true;
        dialog = new nr_j();
    }

    public GameCanvas() {
        System.currentTimeMillis();
        this.aO = System.currentTimeMillis() + 1000L;
        this.aQ = 12;
        z = this.l();
        A = this.m();
        mScreen.cd = mFont.t.a() + 8;
        menu = new nr_ax();
        panel = new Panel();
        new MyVector("vCurrPopup");
        B = z / 2;
        C = A / 2;
        if (this.hasPointerEvents()) {
            isTouch = true;
            if (z >= 240) {
                f = true;
            }

            if (z < 320) {
                g = true;
            }
        }

        K = new nr_ba();
        if (A <= 160) {
            nr_cr.a = 15;
            mScreen.cmdH = 17;
        }

        h = this;
        System.gc();
        L = new nr_cr();
        if (!lowGraphic) {
            if (aX == null) {
                aX = new Image[2][5];

                for (int var2 = 0; var2 < 2; ++var2) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        aX[var2][var3] = Main.loadImage("/e/d" + var2 + var3 + ".png");
                    }
                }
            }

            this.aR = new int[2];
            this.aS = new int[2];
            this.aT = new int[2];
            this.aT[0] = this.aT[1] = -1;
        }

        n();
        aW = Main.loadImage("/mainImage/myTexture2df.png");
        int var1;
        if ((var1 = Rms.loadRmsInt("clienttype")) != -1) {
            if (var1 > 7) {
                Rms.saveRMSInt("clienttype", Main.typeClient);
            } else {
                Main.typeClient = var1;
            }
        }

        if (Main.typeClient == 7 && (Rms.c("fake") == null || Rms.c("fake") == "")) {
            aW = Main.loadImage("/mainImage/wait.png");
        }

        ap = new MyVector("vDebugUpdate");
        aq = new MyVector("vDeBugPait");
        S = new MyVector("vDebugSesion");

        for (var1 = 0; var1 < 3; ++var1) {
            U[var1] = Main.loadImage("/mainImage/myTexture2dbd" + var1 + ".png");
        }

        mGraphics.getImageWidth(U[0]);
        mGraphics.getImageHeight(U[0]);
        mGraphics.getImageWidth(U[1]);
        mGraphics.getImageHeight(U[1]);
        Panel.G = Rms.loadRmsInt("lowGraphic");
        lowGraphic = Rms.loadRmsInt("lowGraphic") == 1;
        GameScr.isPaintChatVip = Rms.loadRmsInt("serverchat") != 1;
        Char.cS = Rms.loadRmsInt("isPaintAura") == 1;
        Char.isPaintAura2 = Rms.loadRmsInt("isPaintAura2") == 1;
        Res.a();
        SmallImage.b();
        PopUp.a();
        Panel.WIDTH_PANEL = 176;
        if (176 > z) {
            Panel.WIDTH_PANEL = z;
        }

        af = new nr_bo();
        ac = Main.loadImage("/mainImage/12+.png");

        for (var1 = 0; var1 < 7; ++var1) {
            Q[var1] = Main.loadImage("/effectdata/blue/" + var1 + ".png");
            R[var1] = Main.loadImage("/effectdata/violet/" + var1 + ".png");
        }
        ag = new nr_eo();
    }

    public static GameCanvas a() {
        return h;
    }

    public static void b() {
        if (!Session_ME.gI().d()) {
            Session_ME.gI().a(GameMidlet.IP, GameMidlet.PORT);
        }

    }
    public static void a(String var0, short var1) {
        if (!Session_ME.gI().d()) {
            Session_ME.gI().a(var0, (int) var1);
        }

    }

    public static void c() {
        if (!Session_ME.gI2().d()) {
            Res.out("IP2= " + GameMidlet.IP2 + " PORT 2= " + GameMidlet.PORT2);
            Session_ME.gI2().a(GameMidlet.IP2, GameMidlet.PORT2);
        }

    }
    public static boolean isGameScr()
    {
        return currentScreen == GameScr.gI();                
    }
    public static void a(mGraphics var0) {
        var0.a(-var0.a(), -var0.b());
        var0.e(0, 0, z, A);
    }

    public final void d() {
        ++ar;
        if (gameTick % 50 == 0) {
            ar = 0;
        }

        if (gameTick % 5 == 0) {
            b = Main.c();
        }

        if (Main.c() > this.aO) {
            this.aO += 1000L;
            aN = 0;
        }

        ++aN;
        ap.removeAllElements();
        long var1 = System.currentTimeMillis();
        if (GameScr.bP) {
            Res.b();
        }

        if (var1 - al >= 780L && !x) {
            al = var1;
            x = true;
        } else {
            x = false;
        }

        if (var1 - am >= 7800L && !y) {
            am = var1;
            y = true;
        } else {
            y = false;
        }

        if (w > 0) {
            --w;
        }

        if (++gameTick > 10000) {
            if (System.currentTimeMillis() - aM > 20000L && currentScreen == loginScr) {
                GameMidlet.instance.a();
            }

            gameTick = 0;
        }

        if (currentScreen != null) {
            if (ChatPopup.n != null) {
                ChatPopup.n.a();
                ChatPopup.n.b();
            } else if (ChatPopup.m != null) {
                ChatPopup.m.a();
                ChatPopup.m.b();
            } else if (J != null) {
                J.a();
            } else if (menu.a) {
                menu.b();
                menu.a();
            } else if (panel.a) {
                panel.B();
                if (b(panel.b, 0, panel.d, panel.e)) {
                    T = false;
                }

                if (panel2 != null && panel2.a) {
                    panel2.B();
                    if (b(panel2.b, 0, panel2.d, panel2.e)) {
                        T = true;
                    }
                }

                if (panel2 != null) {
                    if (T) {
                        panel2.u();
                    } else {
                        panel.u();
                    }
                } else {
                    panel.u();
                }

                if (panel.o != null && panel.o.b) {
                    panel.t();
                } else if (panel2 != null && panel2.o != null && panel2.o.b) {
                    panel2.t();
                } else if ((!b(panel.b, 0, panel.d, panel.e) || panel2 == null) && panel2 != null) {
                    if (panel2 != null && panel2.a && b(panel2.b, 0, panel2.d, panel2.e)) {
                        panel2.u();
                    }
                } else {
                    panel.u();
                }

                if (b(panel.b + panel.d, 0, z - (panel.d << 1), panel.e) && m && panel.aw) {
                    panel.A();
                }
            }

            if (!d) {
                currentScreen.c();
            }

            if (!panel.a && ChatPopup.n == null) {
                currentScreen.d();
            }

            int var4;
            label342:
            {
                if (Char.myCharz().taskMaint != null && currentScreen == GameScr.c) {
                    short var3 = Char.myCharz().taskMaint.taskId;
                    int var2 = Char.myCharz().taskMaint.a;
                    nr_v.j = false;
                    nr_v.k = 0;
                    nr_v.c = 0;
                    nr_v.i = true;
                    nr_v.m = true;
                    if (menu.a && var3 > 0) {
                        nr_v.i = false;
                    }

                    switch (var3) {
                        case 0:
                            if (ChatPopup.m == null && Char.myCharz().statusMe != 14) {
                                if (var2 == 0 && TileMap.t.size() != 0) {
                                    nr_v.a = ((Waypoint) TileMap.t.elementAt(0)).minX - 100;
                                    nr_v.b = ((Waypoint) TileMap.t.elementAt(0)).minY + 40;
                                    nr_v.j = true;
                                }

                                if (var2 == 1) {
                                    nr_v.a(0);
                                }

                                if (var2 == 2) {
                                    nr_v.a();
                                }

                                if (var2 == 3) {
                                    if (!panel.a) {
                                        nr_v.a();
                                    } else if (panel.z == 0) {
                                        if (panel.af == null) {
                                            nr_v.a = panel.ab + panel.ad / 2;
                                            nr_v.b = panel.ac + 20;
                                        } else if (menu.e != 0) {
                                            nr_v.a = panel.ab + 25;
                                            nr_v.b = panel.ac + 60;
                                        }
                                    } else if (panel.z == 1) {
                                        nr_v.a = panel.A + 10;
                                        nr_v.b = 65;
                                    }
                                }

                                if (var2 == 4) {
                                    if (panel.a) {
                                        nr_v.a = panel.X.x + 5;
                                        nr_v.b = panel.X.y + 5;
                                    } else if (menu.a) {
                                        nr_v.a = z / 2;
                                        nr_v.b = A - 20;
                                    } else {
                                        nr_v.a();
                                    }
                                }

                                if (var2 == 5) {
                                    nr_v.a();
                                }
                            } else {
                                nr_v.a = z / 2;
                                nr_v.b = A - 15;
                            }
                            break label342;
                        case 1:
                            if (ChatPopup.m == null && Char.myCharz().statusMe != 14) {
                                if (var2 == 0) {
                                    if (TileMap.d()) {
                                        nr_v.a(0);
                                    } else {
                                        nr_v.b();
                                    }
                                }

                                if (var2 == 1) {
                                    if (!TileMap.d()) {
                                        nr_v.a(1);
                                    } else {
                                        nr_v.a();
                                    }
                                }
                            } else {
                                nr_v.a = z / 2;
                                nr_v.b = A - 15;
                            }
                            break label342;
                        case 2:
                            if (ChatPopup.m != null || Char.myCharz().statusMe == 14) {
                                nr_v.a = z / 2;
                                nr_v.b = A - 15;
                                break label342;
                            }

                            if (var2 == 0) {
                                if (!TileMap.d()) {
                                    nr_v.f = true;
                                }

                                if (!panel.a) {
                                    if (!nr_v.f) {
                                        nr_v.a = GameScr.gI().aQ.x;
                                        nr_v.b = GameScr.gI().aQ.y + 13;
                                        nr_v.k = 1;
                                    } else {
                                        if (GameScr.z() == TileMap.l) {
                                            if (!nr_v.c()) {
                                                nr_v.b();
                                            }
                                        } else {
                                            nr_v.a(0);
                                        }

                                        if (nr_v.f) {
                                            nr_v.g = true;
                                        }
                                    }
                                } else if (!nr_v.f) {
                                    if (panel.z == 0) {
                                        var4 = A > 300 ? 15 : 10;
                                        nr_v.a = panel.ab + panel.ad / 2;
                                        nr_v.b = panel.ac + panel.ae - var4;
                                    } else {
                                        nr_v.a = panel.A + 10;
                                        nr_v.b = 65;
                                    }
                                } else if (!nr_v.g) {
                                    nr_v.a = panel.X.x + 5;
                                    nr_v.b = panel.X.y + 5;
                                } else {
                                    nr_v.i = false;
                                }

                                if (Char.myCharz().cMP <= 0) {
                                    nr_v.a = GameScr.bx + 5;
                                    nr_v.b = GameScr.by + 13;
                                    nr_v.j = false;
                                }
                            }

                            if (var2 != 1) {
                                break label342;
                            }
                            break;
                        case 3:
                            if (ChatPopup.m == null && Char.myCharz().statusMe != 14) {
                                if (var2 == 0) {
                                    if (!panel.a) {
                                        if (!nr_v.h) {
                                            nr_v.a = GameScr.gI().aQ.x;
                                            nr_v.b = GameScr.gI().aQ.y + 13;
                                            nr_v.k = 1;
                                        } else {
                                            if (GameScr.z() == TileMap.l) {
                                                if (!nr_v.c()) {
                                                    nr_v.b();
                                                }
                                            } else {
                                                nr_v.a(0);
                                            }

                                            if (nr_v.f) {
                                                nr_v.g = true;
                                            }
                                        }
                                    } else if (!nr_v.h) {
                                        nr_v.a = panel.ab + 10 + 108 - 18;
                                        nr_v.b = 65;
                                    } else if (!nr_v.g) {
                                        nr_v.a = panel.X.x + 5;
                                        nr_v.b = panel.X.y + 5;
                                    } else {
                                        nr_v.i = false;
                                    }

                                    if (Char.myCharz().cMP <= 0) {
                                        nr_v.a = GameScr.bx + 5;
                                        nr_v.b = GameScr.by + 13;
                                        nr_v.j = false;
                                    }
                                } else {
                                    nr_v.i = false;
                                    nr_v.m = false;
                                }
                            } else {
                                nr_v.a = z / 2;
                                nr_v.b = A - 15;
                            }
                            break label342;
                        default:
                            if (Char.myCharz().taskMaint.taskId == 9 && Char.myCharz().taskMaint.a == 2) {
                                for (var4 = 0; var4 < PopUp.a.size(); ++var4) {
                                    PopUp var5;
                                    if ((var5 = (PopUp) PopUp.a.elementAt(var4)).e <= 24) {
                                        nr_v.a = var5.d + var5.b / 2;
                                        nr_v.b = var5.e + 30;
                                        nr_v.j = true;
                                        nr_v.i = false;
                                        nr_v.m = true;
                                        break label342;
                                    }
                                }
                            }

                            nr_v.i = false;
                            nr_v.m = false;
                            break label342;
                    }
                }

                nr_v.i = false;
                nr_v.m = false;
            }

            var4 = nr_v.k == 0 ? 2 : -2;
            if (!nr_v.e) {
                nr_v.l = false;
                if (++nr_v.d == 50) {
                    nr_v.d = 0;
                    nr_v.e = true;
                }
            } else {
                ++nr_v.d;
                if (nr_v.c == 0) {
                    if (nr_v.d == 2) {
                        nr_v.a += var4 * 2;
                        nr_v.b -= 4;
                        nr_v.l = true;
                    }

                    if (nr_v.d == 4) {
                        nr_v.a -= var4 * 2;
                        nr_v.b += 4;
                        nr_v.e = false;
                        nr_v.l = false;
                        nr_v.d = 0;
                    }

                    if (nr_v.d > 4) {
                        nr_v.e = false;
                    }
                }

                if (nr_v.c == 1) {
                    if (nr_v.d == 2) {
                        if (isTouch) {
                            GameScr.a(mResources.cE, nr_v.a, nr_v.b + 10, 0, 20, 7);
                        }

                        nr_v.l = true;
                        nr_v.a += var4 * 2;
                        nr_v.b -= 4;
                    }

                    if (nr_v.d == 4) {
                        nr_v.l = false;
                        nr_v.a -= var4;
                        nr_v.b += 2;
                    }

                    if (nr_v.d == 6) {
                        nr_v.l = true;
                        nr_v.a += var4;
                        nr_v.b -= 2;
                    }

                    if (nr_v.d == 8) {
                        nr_v.l = false;
                        nr_v.a -= var4;
                        nr_v.b += 2;
                    }

                    if (nr_v.d == 10) {
                        nr_v.a -= var4;
                        nr_v.b += 2;
                        nr_v.e = false;
                        nr_v.d = 0;
                    }
                }
            }

            SoundMn.gI();
        }

        System.currentTimeMillis();
        InfoDlg.b();
        if (this.aY) {
            this.aY = false;
            a((mScreen) af);
        }

    }

    public static void a(mScreen var0) {
        try {
            Char.bH = false;
            Char.bF = false;
            SoundMn.gI();
            nr_x.c = false;
            TileMap.p = 0;
            TileMap.q = 0;
            Char.g();
            GameScr.n();
            GameScr.g();
            InfoDlg.hide();
            nr_ei var1 = GameScr.aC;
            GameScr.aC.b.a();
            var1 = GameScr.aD;
            GameScr.aD.b.a();
            GameScr.aD.i = null;
            ChatPopup.m = null;
            Controller.b = false;
            GameScr.a(-1, (int) -1);
            GameScr.bv.removeAllElements();
            GameScr.j = 100;
            panel.z = 0;
            panel.ah = isTouch ? -1 : 0;
            panel.a();
            panel2 = null;
            GameScr.bt = true;
            nr_bx.l.removeAllElements();
            GameScr.A.removeAllElements();
            GameScr.B.removeAllElements();
            GameScr.C.removeAllElements();
            TileMap.v.removeAllElements();
            nr_dw.a.removeAllElements();
            EffecMn.a.removeAllElements();
            Effect.l.removeAllElements();
            menu.a = false;
            panel.a = false;
            panel.k.removeAllElements();
            if (panel.j != null) {
                panel.j.k = false;
            }

            Session_ME.gI().e();
            Session_ME.gI2().e();
            var0.b();
        } catch (Exception var2) {
            ;
        }
    }

    private static void a(mGraphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        var0.a(var1);
        var1 = GameScr.k;
        if (GameScr.k > A) {
            var1 = A;
        }

        var0.d(0, var3 - (var6 != 0 ? var1 >> var6 : 0), var4, var5 + (var6 != 0 ? var1 >> var6 : 0));
    }

    private static void a(mGraphics var0, int var1, int var2, int var3, int var4) {
        try {
            int var5;
            if ((var5 = var1 - 1) == M.length - 1 && (GameScr.gI().ba || GameScr.gI().bR)) {
                var0.a(GameScr.gI().bd);
                var0.d(0, 0, z, A);
                if (Y == 2 || Y == 4 || Y == 7) {
                    c(var0);
                    d(var0);
                }

                if (GameScr.gI().bR && !lowGraphic) {
                    nr_dn.a(var0);
                }

                return;
            }

            if (M != null && M[var5] != null) {
                if (aB[var5] != 0) {
                    aB[var5] += aC[var5];
                }

                int var6 = GameScr.k;
                if (GameScr.k > A) {
                    var6 = A;
                }

                int var7;
                if (aA[var5] != 0) {
                    for (var7 = -((GameScr.j + aB[var5] >> aA[var5]) % O[var5]); var7 < GameScr.d; var7 += O[var5]) {
                        var0.drawImage(M[var5], var7, aF[var5] - (var2 > 0 ? var6 >> var2 : 0), 0);
                    }
                } else {
                    for (var7 = 0; var7 < GameScr.d; var7 += O[var5]) {
                        var0.drawImage(M[var5], var7, aF[var5] - (var2 > 0 ? var6 >> var2 : 0), 0);
                    }
                }

                if (var3 != -1) {
                    if (var5 == aH - 1) {
                        a(var0, var3, 0, -(var6 >> var2), GameScr.d, aF[var5], var2);
                    } else {
                        a(var0, var3, 0, aF[var5 - 1] + P[var5 - 1], GameScr.d, aF[var5] - (aF[var5 - 1] + P[var5 - 1]), var2);
                    }
                }

                if (var4 != -1) {
                    if (var5 == 0) {
                        a(var0, var4, 0, aF[var5] + P[var5], GameScr.d, GameScr.e - (aF[var5] + P[var5]), var2);
                    } else {
                        a(var0, var4, 0, aF[var5] + P[var5], GameScr.d, aF[var5 - 1] - (aF[var5] + P[var5]) + 80, var2);
                    }
                }

                if (currentScreen == GameScr.c) {
                    if (var1 == 1 && Y == 11 && TileMap.p == 0) {
                        var0.drawImage(au, -(GameScr.j >> aA[0]) + 400, aF[0] + 30 - (var6 >> 2), nr_cf.c);
                    }

                    if (var1 == 1 && Y == 13) {
                        var0.drawImage(M[1], -(GameScr.j >> aA[0]) + 200, aF[0] - (var6 >> 3) + 30, 0);
                        var0.drawRegion(M[1], 0, 0, O[1], P[1], 2, -(GameScr.j >> aA[0]) + 200 + O[1], aF[0] - (var6 >> 3) + 30, 0);
                    }

                    if (var1 == 3 && TileMap.l == 1) {
                        for (var7 = 0; var7 < TileMap.d / mGraphics.getImageHeight(aJ); ++var7) {
                            var0.drawImage(aJ, -(GameScr.j >> aA[2]) + 300, var7 * mGraphics.getImageHeight(aJ) - (var6 >> 3), 0);
                        }
                    }
                }

                var7 = -(GameScr.j + aB[var5] >> aA[var5]);
                EffecMn.a(var0, var7, aF[var5] + P[var5] - (var6 >> var2), var5);
                return;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }

    }

    private static void c(mGraphics var0) {
        if (at != null) {
            var0.drawImage(at, aw, ax, 0);
        }

        if (X) {
            if (gameTick % 200 == 0) {
                aD = true;
            }

            if (aD) {
                if (++aE == 10) {
                    aE = 0;
                    aD = false;
                }

                if (aE % 2 == 0) {
                    var0.a(16777215);
                    var0.d(0, 0, z, A);
                }
            }
        }

    }

    private static void d(mGraphics var0) {
        if (au != null) {
            var0.drawImage(au, ay, az, 0);
        }

    }

    public static void b(mGraphics var0) {
        if (!aL) {
            var0.a(0);
            var0.d(0, 0, z, A);
        }

        if (!Char.bH) {
            int var1 = GameScr.d;
            var0.a(-var0.a(), -var0.b());

            try {
                int var2;
                if (as && !lowGraphic) {
                    if (currentScreen == GameScr.gI()) {
                        if (TileMap.l == 137 || TileMap.l == 115 || TileMap.l == 117 || TileMap.l == 118 || TileMap.l == 120 || TileMap.j) {
                            var0.a(0);
                            var0.d(0, 0, z, A);
                            return;
                        }

                        if (TileMap.l == 138) {
                            var0.a(6776679);
                            var0.d(0, 0, z, A);
                            return;
                        }
                    }

                    if (Y == 0) {
                        a(var0, 4, 6, aa[3], aG[3]);
                        a(var0, 3, 4, -1, aG[2]);
                        a(var0, 2, 3, -1, aG[1]);
                        a(var0, 1, 2, -1, aG[0]);
                        return;
                    }

                    if (Y == 1) {
                        a(var0, 4, 6, -1, -1);
                        a(var0, 3, 3, -1, -1);
                        a(var0, aa[2], 0, -(GameScr.k >> 5), var1, aF[2], 5);
                        a(var0, aG[2], 0, aF[2] + P[2] - (GameScr.k >> 3), var1, 70, 3);
                        a(var0, 2, 2, -1, -1);
                        a(var0, 1, 1, -1, aG[0]);
                        return;
                    }

                    if (Y == 2) {
                        a(var0, 5, 10, aa[4], aG[4]);
                        a(var0, 4, 8, -1, aa[2]);
                        a(var0, 3, 5, -1, aG[2]);
                        a(var0, 2, 2, -1, aG[1]);
                        a(var0, 1, 1, -1, aG[0]);
                        return;
                    }

                    if (Y == 3) {
                        var2 = GameScr.k - (325 - GameScr.g);
                        var0.a(0, -var2);
                        a(var0, !GameScr.gI().ba && !GameScr.gI().bR ? aa[2] : GameScr.gI().bd, 0, var2 - (GameScr.k >> 3), var1, aF[2] - var2 + (GameScr.k >> 3) + 100, 2);
                        a(var0, 3, 2, -1, aG[2]);
                        a(var0, 2, 0, -1, -1);
                        a(var0, 1, 0, -1, aG[0]);
                        var0.a(0, -var0.b());
                        return;
                    }

                    if (Y == 4) {
                        a(var0, 4, 7, aa[3], -1);
                        a(var0, 3, 3, -1, mGraphics.zoomLevel > 1 ? aG[2] : aa[1]);
                        a(var0, 2, 2, aa[1], aG[1]);
                        a(var0, 1, 1, -1, aG[0]);
                        return;
                    }

                    if (Y == 5) {
                        a(var0, 4, 15, aa[3], -1);
                        c(var0);
                        var0.a(100, 10);
                        c(var0);
                        var0.a(-100, -10);
                        d(var0);
                        a(var0, 3, 10, -1, -1);
                        a(var0, 2, 6, -1, -1);
                        a(var0, 1, 4, -1, -1);
                        var0.a(0, 27);
                        a(var0, 1, 2, -1, -1);
                        var0.a(0, 20);
                        a(var0, 1, 2, -1, aG[0]);
                        var0.a(-var0.a(), -var0.b());
                        return;
                    }

                    if (Y == 6) {
                        a(var0, 5, 10, aa[4], aG[4]);
                        c(var0);
                        d(var0);
                        var0.a(60, 40);
                        d(var0);
                        var0.a(-60, -40);
                        a(var0, 4, 7, -1, aG[3]);
                        nr_dw.e(var0);
                        a(var0, 3, 4, -1, -1);
                        a(var0, 2, 3, -1, aG[1]);
                        a(var0, 1, 2, -1, aG[0]);
                        return;
                    }

                    if (Y == 7) {
                        a(var0, 4, 6, aa[3], aG[3]);
                        a(var0, 3, 5, -1, -1);
                        a(var0, 2, 4, -1, -1);
                        a(var0, 1, 3, -1, aG[0]);
                        return;
                    }

                    if (Y != 8) {
                        if (Y == 9) {
                            a(var0, 4, 8, aa[3], aG[3]);
                            c(var0);
                            d(var0);
                            var0.a(-80, 20);
                            d(var0);
                            var0.a(80, -20);
                            nr_dw.e(var0);
                            a(var0, 3, 5, -1, -1);
                            a(var0, 2, 3, -1, -1);
                            a(var0, 1, 2, -1, aG[0]);
                            return;
                        }

                        if (Y == 10) {
                            var2 = GameScr.k - (380 - GameScr.g);
                            var0.a(0, -var2);
                            a(var0, GameScr.gI().ba ? GameScr.gI().bd : aa[1], 0, var2 - (GameScr.k >> 2), var1, aF[1] - var2 + (GameScr.k >> 2) + 100, 2);
                            a(var0, 2, 2, -1, aG[1]);
                            c(var0);
                            d(var0);
                            a(var0, 1, 0, -1, -1);
                            var0.a(0, -var0.b());
                            return;
                        }

                        if (Y == 11) {
                            a(var0, 3, 6, aa[2], aG[2]);
                            c(var0);
                            a(var0, 2, 3, -1, aG[1]);
                            a(var0, 1, 2, -1, aG[0]);
                            return;
                        }

                        if (Y == 12) {
                            var0.a(9161471);
                            var0.d(0, 0, z, A);
                            a(var0, 3, 4, -1, 14417919);
                            a(var0, 2, 3, -1, 14417919);
                            a(var0, 1, 2, -1, 14417919);
                            return;
                        }

                        if (Y == 13) {
                            var0.a(15268088);
                            var0.d(0, 0, z, A);
                            a(var0, 1, 5, -1, 15268088);
                            return;
                        }

                        if (Y == 15) {
                            var0.a(2631752);
                            var0.d(0, 0, z, A);
                            a(var0, 2, 3, -1, aG[1]);
                            a(var0, 1, 2, -1, aG[0]);
                            return;
                        }

                        if (Y != 16) {
                            a(var0, aG[3], 0, aF[3] + P[3], GameScr.d, aF[2] + P[2], 6);
                            a(var0, 4, 6, aa[3], aG[3]);
                            c(var0);
                            a(var0, 3, 4, -1, aG[2]);
                            a(var0, 2, 3, -1, aG[1]);
                            a(var0, 1, 2, -1, aG[0]);
                            return;
                        }

                        a(var0, 4, 6, aa[3], aG[3]);

                        for (var2 = 0; var2 < av.length; ++var2) {
                            var0.drawImage(av[var2], V[var2], W[var2], 33);
                        }

                        a(var0, 3, 4, -1, aG[2]);
                        a(var0, 2, 3, -1, aG[1]);
                        a(var0, 1, 2, -1, aG[0]);
                        return;
                    }

                    a(var0, 4, 8, aa[3], aG[3]);
                    c(var0);
                    d(var0);
                    a(var0, 3, 4, -1, aG[2]);
                    a(var0, 2, 2, -1, aG[1]);
                    if ((TileMap.l < 92 || TileMap.l > 96) && TileMap.l != 51 && TileMap.l != 52 || currentScreen == loginScr) {
                        a(var0, 1, 1, -1, aG[0]);
                        return;
                    }
                } else {
                    var0.a(2315859);
                    var0.d(0, 0, z, A);
                    if (aK != null) {
                        for (var2 = -((GameScr.j >> 2) % mGraphics.getImageWidth(aK)); var2 < GameScr.d; var2 += mGraphics.getImageWidth(aK)) {
                            var0.drawImage(aK, var2, (GameScr.k >> 3) + A / 2 - 50, 0);
                        }

                        var0.a(5084791);
                        var0.d(0, (GameScr.k >> 3) + A / 2 - 50 + mGraphics.getImageHeight(aK), var1, A);
                        return;
                    }
                }
            } catch (Exception var3) {
                var0.a(0);
                var0.d(0, 0, z, A);
            }

        }
    }

    private static void b(int var0) {
        try {
            int var1 = GameScr.g;
            switch (var0) {
                case 0:
                    aF[0] = var1 - P[0] + 70;
                    aF[1] = aF[0] - P[1] + 20;
                    aF[2] = aF[1] - P[2] + 30;
                    aF[3] = aF[2] - P[3] + 50;
                    return;
                case 1:
                    aF[0] = var1 - P[0] + 120;
                    aF[1] = aF[0] - P[1] + 40;
                    aF[2] = aF[1] - 90;
                    aF[3] = aF[2] - 25;
                    return;
                case 2:
                    aF[0] = var1 - P[0] + 150;
                    aF[1] = aF[0] - P[1] - 60;
                    aF[2] = aF[1] - P[2] - 40;
                    aF[3] = aF[2] - P[3] - 10;
                    aF[4] = aF[3] - P[4];
                    return;
                case 3:
                    aF[0] = var1 - P[0] + 10;
                    aF[1] = aF[0] + 80;
                    aF[2] = aF[1] - P[2] - 10;
                    return;
                case 4:
                    aF[0] = var1 - P[0] + 130;
                    aF[1] = aF[0] - P[1];
                    aF[2] = aF[1] - P[2] - 20;
                    aF[3] = aF[1] - P[2] - 80;
                    return;
                case 5:
                    aF[0] = var1 - P[0] + 40;
                    aF[1] = aF[0] - P[1] + 10;
                    aF[2] = aF[1] - P[2] + 15;
                    aF[3] = aF[2] - P[3] + 50;
                    return;
                case 6:
                    aF[0] = var1 - P[0] + 100;
                    aF[1] = aF[0] - P[1] - 30;
                    aF[2] = aF[1] - P[2] + 10;
                    aF[3] = aF[2] - P[3] + 15;
                    aF[4] = aF[3] - P[4] + 15;
                    return;
                case 7:
                    aF[0] = var1 - P[0] + 20;
                    aF[1] = aF[0] - P[1] + 15;
                    aF[2] = aF[1] - P[2] + 20;
                    aF[3] = aF[1] - P[2] - 10;
                    return;
                case 8:
                    aF[0] = var1 - 103 + 150;
                    if (TileMap.l == 103) {
                        aF[0] -= 100;
                    }

                    aF[1] = aF[0] - P[1] - 10;
                    aF[2] = aF[1] - P[2] + 40;
                    aF[3] = aF[2] - P[3] + 10;
                    return;
                case 9:
                    aF[0] = var1 - P[0] + 100;
                    aF[1] = aF[0] - P[1] + 22;
                    aF[2] = aF[1] - P[2] + 50;
                    aF[3] = aF[2] - P[3];
                    return;
                case 10:
                    aF[0] = var1 - P[0] - 45;
                    aF[1] = aF[0] - P[1] - 10;
                    return;
                case 11:
                    aF[0] = var1 - P[0] + 60;
                    aF[1] = aF[0] - P[1] + 5;
                    aF[2] = aF[1] - P[2] - 15;
                    return;
                case 12:
                    aF[0] = var1 + 40;
                    aF[1] = aF[0] - 40;
                    aF[2] = aF[1] - 40;
                    return;
                case 13:
                    aF[0] = var1 - 80;
                    aF[1] = aF[0];
                    return;
                case 14:
                default:
                    aF[0] = var1 - P[0] + 75;
                    aF[1] = aF[0] - P[1] + 50;
                    aF[2] = aF[1] - P[2] + 50;
                    aF[3] = aF[2] - P[3] + 90;
                    return;
                case 15:
                    aF[0] = var1 - 20;
                    aF[1] = aF[0] - 80;
                    return;
                case 16:
                    aF[0] = var1 - P[0] + 75;
                    aF[1] = aF[0] - P[1] + 50;
                    aF[2] = aF[1] - P[2] + 50;
                    aF[3] = aF[2] - P[3] + 90;
            }
        } catch (Exception var2) {
            for (var0 = 0; var0 < aF.length; ++var0) {
                aF[var0] = 1;
            }

        }
    }

    public static void a(int var0) {
        try {
            aL = true;
            if (Y == 12) {
                nr_dw.e = TileMap.d - 100;
            } else {
                nr_dw.e = TileMap.d - 160;
            }

            Res.out("load bg id= " + var0 + "map ID= " + TileMap.l);
            nr_dw.a();
            c(var0);
            if (TileMap.m == var0 && TileMap.q == TileMap.p || var0 == -1) {
                return;
            }

            Z = 12;
            TileMap.m = (byte) var0;
            TileMap.q = (byte) TileMap.p;
            aA = new int[]{1, 2, 3, 7, 8};
            aB = new int[5];
            aC = new int[5];
            Y = var0;
            X = false;
            M = null;
            at = null;
            aJ = null;
            switch (Y) {
                case 0:
                    aJ = Main.a("/bg/caycot.png");
                    aA = new int[]{1, 3, 5, 7};
                    aH = 4;
                    if (TileMap.p == 2) {
                        Z = 8;
                    }
                    break;
                case 1:
                    Z = 7;
                    aH = 4;
                    break;
                case 2:
                    aB = new int[]{0, 0, 1, 0, 0};
                    aC = new int[]{0, 0, 2, 0, 0};
                    aH = 5;
                    break;
                case 3:
                    aH = 3;
                    break;
                case 4:
                    nr_dw.a(3);
                    aB = new int[]{0, 1, 0, 0, 0};
                    aC = new int[]{0, 1, 0, 0, 0};
                    aH = 4;
                    break;
                case 5:
                    aH = 4;
                    break;
                case 6:
                    aB = new int[]{1, 0, 0, 0, 0};
                    aC = new int[]{2, 0, 0, 0, 0};
                    aH = 5;
                    break;
                case 7:
                    aH = 4;
                    break;
                case 8:
                    Z = 8;
                    aH = 4;
                    break;
                case 9:
                    nr_dw.a(9);
                    aH = 4;
                    break;
                case 10:
                    aH = 2;
                    break;
                case 11:
                    Z = 7;
                    aA[2] = 0;
                    aH = 3;
                    break;
                case 12:
                    aB = new int[]{1, 1, 0, 0, 0};
                    aC = new int[]{2, 1, 0, 0, 0};
                    aH = 3;
                    break;
                case 13:
                    aH = 2;
                    break;
                case 14:
                default:
                    aA = new int[]{1, 3, 5, 7};
                    aH = 4;
                    break;
                case 15:
                    Res.out("HELL");
                    aH = 2;
                    break;
                case 16:
                    aA = new int[]{1, 3, 5, 7};
                    aH = 4;
            }

            int[] var2;
            if (var0 <= 16) {
                N = nr_cf.g[Y];
            } else {
                try {
                    String var1 = "/bg/b" + Y + 3 + ".png";
                    if (TileMap.p != 0) {
                        var1 = "/bg/b" + Y + 3 + "-" + TileMap.p + ".png";
                    }

                    var2 = new int[1];
                    Image var3;
                    (var3 = Main.a(var1)).getRGB(var2, 0, 1, mGraphics.c(var3) / 2, 0, 1, 1);
                    N = var2[0];
                } catch (Exception var4) {
                    N = nr_cf.g[nr_cf.g.length - 1];
                }
            }

            aa = new int[nr_cf.g.length];
            aG = new int[nr_cf.g.length];

            int var6;
            for (var6 = 0; var6 < nr_cf.g.length; ++var6) {
                aa[var6] = nr_cf.g[var6];
                aG[var6] = nr_cf.g[var6];
            }

            if (lowGraphic) {
                aK = Main.a("/bg/b63.png");
                return;
            }

            M = new Image[aH];
            O = new int[aH];
            P = new int[aH];
            aG = new int[aH];
            aa = new int[aH];
            if (TileMap.p == 100) {
                M[0] = Main.a("/bg/b100.png");
                M[1] = Main.a("/bg/b100.png");
                M[2] = Main.a("/bg/b82-1.png");
                M[3] = Main.a("/bg/b93.png");

                for (var6 = 0; var6 < aH; ++var6) {
                    if (M[var6] != null) {
                        var2 = new int[1];
                        M[var6].getRGB(var2, 0, 1, mGraphics.c(M[var6]) / 2, 0, 1, 1);
                        aa[var6] = var2[0];
                        var2 = new int[1];
                        M[var6].getRGB(var2, 0, 1, mGraphics.c(M[var6]) / 2, mGraphics.d(M[var6]) - 1, 1, 1);
                        aG[var6] = var2[0];
                        O[var6] = mGraphics.getImageWidth(M[var6]);
                        P[var6] = mGraphics.getImageHeight(M[var6]);
                    } else if (aH > 1) {
                        M[var6] = Main.a("/bg/b" + Y + "0.png");
                        O[var6] = mGraphics.getImageWidth(M[var6]);
                        P[var6] = mGraphics.getImageHeight(M[var6]);
                    }
                }
            } else {
                for (var6 = 0; var6 < aH; ++var6) {
                    String var7 = "/bg/b" + Y + var6 + ".png";
                    if (TileMap.p != 0) {
                        var7 = "/bg/b" + Y + var6 + "-" + TileMap.p + ".png";
                    }

                    M[var6] = Main.a(var7);
                    if (M[var6] != null) {
                        int[] var8 = new int[1];
                        M[var6].getRGB(var8, 0, 1, mGraphics.c(M[var6]) / 2, 0, 1, 1);
                        aa[var6] = var8[0];
                        var8 = new int[1];
                        M[var6].getRGB(var8, 0, 1, mGraphics.c(M[var6]) / 2, mGraphics.d(M[var6]) - 1, 1, 1);
                        aG[var6] = var8[0];
                        O[var6] = mGraphics.getImageWidth(M[var6]);
                        P[var6] = mGraphics.getImageHeight(M[var6]);
                    } else if (aH > 1) {
                        M[var6] = Main.a("/bg/b" + Y + "0.png");
                        O[var6] = mGraphics.getImageWidth(M[var6]);
                        P[var6] = mGraphics.getImageHeight(M[var6]);
                    }
                }
            }

            b(Y);
            Res.out("5");
            V = new int[]{GameScr.d / 2 - 40, GameScr.d / 2 + 40, GameScr.d / 2 - 100, GameScr.d / 2 - 80, GameScr.d / 2 - 120};
            W = new int[]{130, 100, 150, 140, 80};
            av = null;
            if (Y != 0) {
                if (Y == 2) {
                    at = Main.a("/bg/sun0.png");
                    aw = GameScr.d / 2 + 50;
                    ax = aF[4] - 40;
                } else if (Y == 4) {
                    at = Main.a("/bg/sun2.png");
                    aw = GameScr.d / 2 + 30;
                    ax = aF[3];
                } else if (Y == 7) {
                    at = Main.a("/bg/sun3" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    au = Main.a("/bg/sun4" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    aw = GameScr.d - GameScr.d / 3;
                    ax = aF[3] - 80;
                    ay = aw - 100;
                    az = aF[3] - 30;
                } else if (Y == 6) {
                    at = Main.a("/bg/sun5" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    au = Main.a("/bg/sun6" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    aw = GameScr.d - GameScr.d / 3;
                    ax = aF[4];
                    ay = aw - 100;
                    az = aF[4] + 20;
                } else if (var0 == 5) {
                    at = Main.a("/bg/sun8" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    au = Main.a("/bg/sun7" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    aw = GameScr.d / 2 - 50;
                    ax = aF[3] + 20;
                    ay = GameScr.d / 2 + 20;
                    az = aF[3] - 30;
                } else if (Y == 8 && TileMap.l < 90) {
                    at = Main.a("/bg/sun9" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    au = Main.a("/bg/sun10" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    aw = GameScr.d / 2 - 30;
                    ax = aF[3] + 60;
                    ay = GameScr.d / 2 + 20;
                    az = aF[3] + 10;
                } else if (var0 == 9) {
                    at = Main.a("/bg/sun11" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    au = Main.a("/bg/sun12" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    aw = GameScr.d - GameScr.d / 3;
                    ax = aF[4] + 20;
                    ay = aw - 80;
                    az = aF[4] + 40;
                } else if (var0 == 10) {
                    at = Main.a("/bg/sun13" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    au = Main.a("/bg/sun14" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    aw = GameScr.d - GameScr.d / 3;
                    ax = aF[1] - 30;
                    ay = aw - 80;
                    az = aF[1];
                } else if (var0 == 11) {
                    at = Main.a("/bg/sun15" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    au = Main.a("/bg/b113" + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    aw = GameScr.d / 2 - 30;
                    ax = aF[2] - 30;
                } else if (var0 == 12) {
                    W = new int[]{200, 170, 220, 150, 250};
                } else if (var0 == 16) {
                    V = new int[]{90, 170, 250, 320, 400, 450, 500};
                    W = new int[]{aF[2] + 5, aF[2] - 20, aF[2] - 50, aF[2] - 30, aF[2] - 50, aF[2], aF[2] - 40};
                    av = new Image[7];

                    for (var6 = 0; var6 < av.length; ++var6) {
                        short var9 = 160;
                        if (var6 == 1 || var6 == 3) {
                            var9 = 161;
                        }

                        av[var6] = Main.a("/bg/sun" + var9 + ".png");
                    }
                } else {
                    at = null;
                    au = null;
                    at = Main.a("/bg/sun" + var0 + (TileMap.p == 0 ? "" : "-" + TileMap.p) + ".png");
                    aw = GameScr.d - GameScr.d / 3;
                    ax = aF[2] - 30;
                }
            }

            as = false;
            if (true) {
                as = true;
                return;
            }
        } catch (Exception var5) {
            aL = false;
        }

    }

    private static void c(int var0) {
        for (int var1 = 0; var1 < aI.length; ++var1) {
            if (var0 == aI[var1] && Res.b(0, 2) == 0) {
                nr_dw.a(0);
                return;
            }
        }

    }

    public final void keyPressed(int var1) {
        aM = System.currentTimeMillis();
        if (var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 122 || var1 == 10 || var1 == 8 || var1 == 13 || var1 == 32 || var1 == 31) {
            ab = var1;
        }

        if (J != null) {
            J.a(var1);
            ab = 0;
        } else {
            currentScreen.a(var1);
            switch (var1) {
                case -39:
                case -2:
                    if (currentScreen instanceof GameScr || currentScreen instanceof nr_ap) {
                        Char.myCharz();
                    }

                    j[8] = true;
                    i[8] = true;
                    return;
                case -38:
                case -1:
                    if (currentScreen instanceof GameScr || currentScreen instanceof nr_ap) {
                        Char.myCharz();
                    }

                    j[2] = true;
                    i[2] = true;
                    return;
                case -22:
                case -7:
                    j[13] = true;
                    i[13] = true;
                    return;
                case -21:
                case -6:
                    j[12] = true;
                    i[12] = true;
                    return;
                case -5:
                case 10:
                    if (currentScreen instanceof GameScr || currentScreen instanceof nr_ap) {
                        Char.myCharz();
                    }

                    j[5] = true;
                    i[5] = true;
                    return;
                case -4:
                    if (currentScreen instanceof GameScr || currentScreen instanceof nr_ap) {
                        Char.myCharz();
                    }

                    j[6] = true;
                    i[6] = true;
                    return;
                case -3:
                    if (currentScreen instanceof GameScr || currentScreen instanceof nr_ap) {
                        Char.myCharz();
                    }

                    j[4] = true;
                    i[4] = true;
                    return;
                case 35:
                    j[11] = true;
                    i[11] = true;
                    return;
                case 42:
                    j[10] = true;
                    i[10] = true;
                    return;
                case 48:
                    j[0] = true;
                    i[0] = true;
                    return;
                case 49:
                    if (currentScreen == nr_ap.a || currentScreen == GameScr.c && c && !nr_cm.b().b) {
                        j[1] = true;
                        i[1] = true;
                    }

                    return;
                case 50:
                    if (currentScreen == nr_ap.a || currentScreen == GameScr.c && c && !nr_cm.b().b) {
                        j[2] = true;
                        i[2] = true;
                    }

                    return;
                case 51:
                    if (currentScreen == nr_ap.a || currentScreen == GameScr.c && c && !nr_cm.b().b) {
                        j[3] = true;
                        i[3] = true;
                    }

                    return;
                case 52:
                    if (currentScreen == nr_ap.a || currentScreen == GameScr.c && c && !nr_cm.b().b) {
                        j[4] = true;
                        i[4] = true;
                    }

                    return;
                case 53:
                    if (currentScreen == nr_ap.a || currentScreen == GameScr.c && c && !nr_cm.b().b) {
                        j[5] = true;
                        i[5] = true;
                    }
                case 54:
                    if (currentScreen == nr_ap.a || currentScreen == GameScr.c && c && !nr_cm.b().b) {
                        j[6] = true;
                        i[6] = true;
                    }

                    return;
                case 55:
                    j[7] = true;
                    i[7] = true;
                    return;
                case 56:
                    if (currentScreen == nr_ap.a || currentScreen == GameScr.c && c && !nr_cm.b().b) {
                        j[8] = true;
                        i[8] = true;
                    }

                    return;
                case 57:
                    j[9] = true;
                    i[9] = true;
                    return;
                default:
            }
        }
    }

    public final void keyReleased(int var1) {
        ab = 0;
        switch (var1) {
            case -39:
            case -2:
                j[8] = false;
                return;
            case -38:
            case -1:
                j[2] = false;
                return;
            case -22:
            case -7:
                j[13] = false;
                aj[13] = true;
                return;
            case -21:
            case -6:
                j[12] = false;
                aj[12] = true;
                return;
            case -5:
            case 10:
                j[5] = false;
                aj[5] = true;
                return;
            case -4:
                j[6] = false;
                return;
            case -3:
                j[4] = false;
                return;
            case 35:
                j[11] = false;
                aj[11] = true;
                return;
            case 42:
                j[10] = false;
                aj[10] = true;
                return;
            case 48:
                j[0] = false;
                aj[0] = true;
                return;
            case 49:
                if (currentScreen == GameScr.c && c && !nr_cm.b().b) {
                    j[1] = false;
                    aj[1] = true;
                }

                return;
            case 50:
                if (currentScreen == GameScr.c && c && !nr_cm.b().b) {
                    j[2] = false;
                    aj[2] = true;
                }

                return;
            case 51:
                if (currentScreen == GameScr.c && c && !nr_cm.b().b) {
                    j[3] = false;
                    aj[3] = true;
                }

                return;
            case 52:
                if (currentScreen == GameScr.c && c && !nr_cm.b().b) {
                    j[4] = false;
                    aj[4] = true;
                }

                return;
            case 53:
                if (currentScreen == GameScr.c && c && !nr_cm.b().b) {
                    j[5] = false;
                    aj[5] = true;
                }
            case 54:
                if (currentScreen == GameScr.c && c && !nr_cm.b().b) {
                    j[6] = false;
                    aj[6] = true;
                }

                return;
            case 55:
                j[7] = false;
                aj[7] = true;
                return;
            case 56:
                if (currentScreen == GameScr.c && c && !nr_cm.b().b) {
                    j[8] = false;
                    aj[8] = true;
                }

                return;
            case 57:
                j[9] = false;
                aj[9] = true;
                return;
            default:
        }
    }

    public final void a(int var1, int var2) {
        if (Res.g(var1 - s) >= 10 || Res.g(var2 - t) >= 10) {
            l = false;
            k = true;
            n = true;
        }

        o = var1;
        p = var2;
        if (++an > 3) {
            an = 0;
        }

        u[an] = new nr_bc(var1, var2);
    }

    public final void b(int var1, int var2) {
        m = false;
        ad = true;
        k = true;
        l = true;
        n = false;
        aM = System.currentTimeMillis();
        q = var1;
        r = var2;
        s = var1;
        t = var2;
        o = var1;
        p = var2;
    }

    public final void c(int var1, int var2) {
        k = false;
        m = true;
        n = false;
        mScreen.cg = -1;
        o = var1;
        p = var2;
    }

    public static boolean a(int var0, int var1, int var2, int var3) {
        return !k && !m ? false : o >= var0 && o <= var0 + var2 && p >= var1 && p <= var1 + var3;
    }

    public static void e() {
        for (int var0 = 0; var0 < 14; ++var0) {
            i[var0] = false;
        }

        m = false;
    }

    public static void f() {
        for (int var0 = 0; var0 < 14; ++var0) {
            j[var0] = false;
        }

    }

    public final void paint(Graphics var1) {
        this.ao.a = var1;
        aq.removeAllElements();
        if (currentScreen != null) {
            currentScreen.a(this.ao);
        }

        this.ao.a(-this.ao.a(), -this.ao.b());
        this.ao.e(0, 0, z, A);
        if (panel.a) {
            panel.a(this.ao);
            if (panel2 != null && panel2.a) {
                panel2.a(this.ao);
            }

            if (panel.o != null && panel.o.b) {
                panel.o.a(this.ao);
            }

            if (panel2 != null && panel2.o != null && panel2.o.b) {
                panel2.o.a(this.ao);
            }
        }

        if (GameScr.bP) {
            Res.a(this.ao);
        }

        InfoDlg.a(this.ao);
        if (J != null) {
            J.a(this.ao);
        } else if (menu.a) {
            menu.a(this.ao);
        }

        GameScr.aC.a(this.ao);
        GameScr.aD.a(this.ao);
        if (GameScr.gI().bQ != null) {
            GameScr.gI().bQ.a(this.ao);
        }

        if (ChatPopup.m != null) {
            ChatPopup.m.a(this.ao);
        }

        mGraphics var9 = this.ao;
        if (ChatPopup.n == null && !Char.myCharz().t && !Char.myCharz().s) {
            mGraphics var2 = var9;

            try {
                if (nr_v.m && (nr_v.a <= GameScr.j || nr_v.a >= GameScr.j + GameScr.d || nr_v.b <= GameScr.k || nr_v.b >= GameScr.k + GameScr.e) && gameTick % 10 >= 5 && ChatPopup.m == null && ChatPopup.n == null && !panel.a && nr_v.j) {
                    int var3 = nr_v.a - Char.myCharz().cx;
                    int var4 = nr_v.b - Char.myCharz().cy;
                    int var5 = 0;
                    int var6 = 0;
                    byte var7 = 0;
                    if (var3 > 0 && var4 >= 0) {
                        if (Res.g(var3) >= Res.g(var4)) {
                            var5 = GameScr.d - 10;
                            var6 = GameScr.e / 2 + 30;
                            if (isTouch) {
                                var6 = GameScr.e / 2 + 10;
                            }

                            var7 = 0;
                        } else {
                            var5 = GameScr.d / 2;
                            var6 = GameScr.e - 10;
                            var7 = 5;
                        }
                    } else if (var3 >= 0 && var4 < 0) {
                        if (Res.g(var3) >= Res.g(var4)) {
                            var5 = GameScr.d - 10;
                            var6 = GameScr.e / 2 + 30;
                            if (isTouch) {
                                var6 = GameScr.e / 2 + 10;
                            }

                            var7 = 0;
                        } else {
                            var5 = GameScr.d / 2;
                            var6 = 10;
                            var7 = 6;
                        }
                    }

                    if (var3 < 0 && var4 >= 0) {
                        if (Res.g(var3) >= Res.g(var4)) {
                            var5 = 10;
                            var6 = GameScr.e / 2 + 30;
                            if (isTouch) {
                                var6 = GameScr.e / 2 + 10;
                            }

                            var7 = 3;
                        } else {
                            var5 = GameScr.d / 2;
                            var6 = GameScr.e - 10;
                            var7 = 5;
                        }
                    } else if (var3 <= 0 && var4 < 0) {
                        if (Res.g(var3) >= Res.g(var4)) {
                            var5 = 10;
                            var6 = GameScr.e / 2 + 30;
                            if (isTouch) {
                                var6 = GameScr.e / 2 + 10;
                            }

                            var7 = 3;
                        } else {
                            var5 = GameScr.d / 2;
                            var6 = 10;
                            var7 = 6;
                        }
                    }

                    GameScr.c(var2);
                    var2.drawRegion(GameScr.bw, 0, 0, 13, 16, var7, var5, var6, nr_cf.f);
                }
            } catch (Exception var8) {
                ;
            }

            if (menu.e == 0 && nr_v.i && ChatPopup.q == null && !Char.bF && currentScreen == GameScr.gI() && (!panel.a || panel.h == 0)) {
                if (nr_v.j) {
                    var9.a(-GameScr.j, -GameScr.k);
                }

                if (nr_v.k == 0) {
                    var9.drawImage(Panel.i, nr_v.a - 15, nr_v.b, 0);
                }

                if (nr_v.k == 1) {
                    var9.drawRegion(Panel.i, 0, 0, 14, 16, 2, nr_v.a + 15, nr_v.b, nr_cf.b);
                }

                if (nr_v.l) {
                    var9.drawImage(ItemMap.imageFlare, nr_v.a, nr_v.b, 3);
                }

                var9.a(-var9.a(), -var9.b());
            }
        }

        if (ChatPopup.n != null) {
            ChatPopup.n.a(this.ao);
        }

        int var10;
        for (var10 = 0; var10 < nr_cw.w.size(); ++var10) {
            nr_cw var11;
            if ((var11 = (nr_cw) nr_cw.w.elementAt(var10)) instanceof ChatPopup && !var11.equals(ChatPopup.m) && !var11.equals(ChatPopup.n)) {
                var11.a(this.ao);
            }
        }

        if (Char.bH || nr_x.c || nr_bo.k) {
            var9 = this.ao;
            a(this.ao);
            var9.a(0);
            var9.d(0, 0, z, A);
            var9.drawImage(nr_x.j, z / 2, A / 2 - 24, nr_cf.c);
            a(B, A / 2 + 24, var9);
            mFont.c.drawString(var9, mResources.aw + (nr_x.k > 0 ? " " + nr_x.k + "s" : ""), z / 2, A / 2, 2);
        }

        a(this.ao);
        EffecMn.d(this.ao);
        if (ah && !d) {
            if (currentScreen == loginScr || currentScreen == af || currentScreen == ag) {
                this.ao.drawImage(ac, 5, 5, 0);
            }

            if (currentScreen == nr_cq.a) {
                this.ao.drawImage(ac, 5, 20, 0);
            }
        }

        for (var10 = 0; var10 < aP.size(); ++var10) {
            String var12 = (String) aP.elementAt(var10);
            mFont.a.drawString(this.ao, var12, z, A - this.aQ - var10 * this.aQ, 1);
            mFont.c.drawString(this.ao, var12, z - 1, A - this.aQ - var10 * this.aQ - 1, 1);
        }

    }

    public static void g() {
        J = null;
        InfoDlg.hide();
    }

    public static void a(String var0) {
        K.a(var0, (Command) null, new Command(mResources.bo, h, 8882, (Object) null), (Command) null);
        J = K;
    }

    public static void b(String var0) {
        K.a(var0, (Command) null, new Command(mResources.br, h, 8882, (Object) null), (Command) null);
        J = K;
        K.a = true;
    }

    private static void c(String var0) {
        K.a(var0, (Command) null, new Command(mResources.br, h, 8882, (Object) null), (Command) null);
        J = K;
        K.a = true;
    }

    public static void h() {
        Char.bH = true;
    }

    public static void startOK(String var0, int var1, Object var2) {
        K.a(var0, (Command) null, new Command(mResources.bo, h, var1, (Object) null), (Command) null);
        K.c();
    }

    public static void a(String var0, Command var1, Command var2) {
        K.a(var0, var1, (Command) null, var2);
        K.c();
    }

    public final void sizeChanged(int var1, int var2) {
    }

    public final boolean a(int var1, int var2, int var3) {
        if (lowGraphic) {
            return false;
        } else {
            var1 = var1 == 1 ? 0 : 1;
            if (this.aT[var1] != -1) {
                return false;
            } else {
                this.aT[var1] = 0;
                this.aR[var1] = var2;
                this.aS[var1] = var3;
                return true;
            }
        }
    }

    private static void n() {
        if (!lowGraphic) {
            aV = new Image[3];

            for (int var0 = 0; var0 < 3; ++var0) {
                aV[var0] = Main.loadImage("/e/w" + var0 + ".png");
            }

            (aU = new int[2])[0] = aU[1] = -1;
        }
    }

    public final void i() {
        if (!lowGraphic) {
            try {
                for (int var1 = 0; var1 < 2; ++var1) {
                    if (this.aT[var1] != -1) {
                        ++this.aT[var1];
                        if (this.aT[var1] >= 5) {
                            this.aT[var1] = -1;
                        }

                        if (var1 == 0) {
                            --this.aR[var1];
                        } else {
                            ++this.aR[var1];
                        }

                        --this.aS[var1];
                    }
                }

            } catch (Exception var2) {
                ;
            }
        }
    }

    public static boolean d(int var0, int var1) {
        return var0 < GameScr.j ? false : (var0 > GameScr.j + GameScr.d ? false : (var1 < GameScr.k ? false : var1 <= GameScr.k + GameScr.e + 30));
    }

    public static void a(int var0, int var1, mGraphics var2) {
        int var3 = ak % (Main.typeClient == 7 ? 8 : 9);
        if (++ak == 1000) {
            ak = 0;
        }

        var2.drawRegion(aW, 0, var3 << 4, 16, 16, 0, var0, var1, 3);
    }

    public final void j() {
        this.aY = true;
    }

    public static boolean b(int var0, int var1, int var2, int var3) {
        return !k && !m ? false : o >= var0 && o <= var0 + var2 && p >= var1 && p <= var1 + var3;
    }

    public final void perform(int var1, Object var2) {
        String var9;
        short var15;
        switch (var1) {
            case 999:
                J = null;
                InfoDlg.hide();
                return;
            case 8881:
                var9 = (String) var2;

                try {
                    GameMidlet.instance.platformRequest(var9);
                } catch (Exception var8) {
                    var8.printStackTrace();
                }

                J = null;
                return;
            case 8882:
                InfoDlg.hide();
                J = null;
                return;
            case 8884:
                J = null;
                InfoDlg.hide();
                loginScr.b();
                return;
            case 8885:
                GameMidlet.instance.a();
                return;
            case 8886:
                J = null;
                InfoDlg.hide();
                var9 = (String) var2;
                Service.gI().addFriend(var9);
                return;
            case 8887:
                J = null;
                InfoDlg.hide();
                var1 = ((Integer) var2).intValue();
                Service.gI().addPartyAccept(var1);
                return;
            case 8888:
                var1 = ((Integer) var2).intValue();
                Service.gI().addPartyCancel(var1);
                J = null;
                InfoDlg.hide();
                return;
            case 8889:
                var9 = (String) var2;
                J = null;
                InfoDlg.hide();
                Service.gI().acceptPleaseParty(var9);
                return;
            case 9000:
                J = null;
                InfoDlg.hide();
                SplashScr.b = null;
                SmallImage.a();
                System.gc();
                nr_bo.n = true;
                nr_bo.t = true;
                GameScr.gI().o();
                if (currentScreen != loginScr) {
                    af.g();
                    return;
                }
                break;
            case 9999:
                J = null;
                InfoDlg.hide();
                b();
                Service.gI().setClientType();
                loginScr.a();
                return;
            case 10000:
                J = null;
                InfoDlg.hide();
                return;
            case 10001:
                J = null;
                InfoDlg.hide();
                return;
            case 88810:
                var1 = ((Integer) var2).intValue();
                J = null;
                InfoDlg.hide();
                Service.gI().acceptInviteTrade(var1);
                return;
            case 88811:
                J = null;
                InfoDlg.hide();
                Service.gI().cancelInviteTrade();
                return;
            case 88814:
                Item[] var17 = (Item[]) var2;
                J = null;
                InfoDlg.hide();
                Service.gI().crystalCollectLock(var17);
                return;
            case 88815:
                return;
            case 88817:
                ChatPopup.c("", 1, Char.myCharz().aS);
                Service.gI().menu(Char.myCharz().aS.cW.a, menu.b, (int) 0);
                return;
            case 88818:
                var15 = ((Short) var2).shortValue();
                Service.gI().textBoxId(var15, dialog.a.getText());
                J = null;
                InfoDlg.hide();
                return;
            case 88819:
                var15 = ((Short) var2).shortValue();
                Service.gI().menuId(var15);
                return;
            case 88820:
                String[] var14 = (String[]) var2;
                if (Char.myCharz().aS == null) {
                    return;
                }

                Integer var11 = new Integer(menu.b);
                if (var14.length <= 1) {
                    ChatPopup.c("", 1, Char.myCharz().aS);
                    Service.gI().menu(Char.myCharz().aS.cW.a, var11.intValue(), (int) 0);
                    return;
                }

                MyVector var13 = new MyVector("vSub");

                for (int var16 = 0; var16 < var14.length - 1; ++var16) {
                    var13.addElement(new Command(var14[var16 + 1], h, 88821, var11));
                }

                menu.a(var13);
                return;
            case 88821:
                int var3 = ((Integer) var2).intValue();
                ChatPopup.c("", 1, Char.myCharz().aS);
                Service.gI().menu(Char.myCharz().aS.cW.a, var3, menu.b);
                return;
            case 88822:
                ChatPopup.c("", 1, Char.myCharz().aS);
                Service.gI().menu(Char.myCharz().aS.cW.a, menu.b, (int) 0);
                return;
            case 88823:
                a(mResources.G);
                return;
            case 88824:
                a(mResources.H);
                return;
            case 88825:
                c(mResources.I);
                return;
            case 88826:
                c(mResources.J);
                return;
            case 88827:
                a(mResources.K);
                return;
            case 88828:
                a(mResources.L);
                return;
            case 88829:
                String var4;
                if ((var4 = dialog.a.getText()).equals("")) {
                    return;
                }

                Service.gI().changeName(var4, ((Integer) var2).intValue());
                InfoDlg.a();
                return;
            case 88836:
                dialog.a.b(6);
                dialog.a(mResources.O, new Command(mResources.bq, h, 888361, (Object) null), 1);
                return;
            case 88837:
                var9 = dialog.a.getText();
                J = null;
                InfoDlg.hide();

                try {
                    Service.gI().s(Integer.parseInt(var9.trim()));
                    return;
                } catch (Exception var7) {
                    return;
                }
            case 88839:
                var9 = dialog.a.getText();
                J = null;
                InfoDlg.hide();
                if (var9.length() >= 6 && !var9.equals("")) {
                    try {
                        String var10002 = var9;
                        var9 = null;
                        boolean var12 = true;
                        String var10 = var10002;
                        var1 = 888391;
                        var9 = mResources.ac;
                        K.a(var9, new Command(mResources.bj, h, 888391, var10), new Command("", h, 888391, var10), new Command(mResources.bk, h, 8882, (Object) null));
                        K.c();
                        return;
                    } catch (Exception var6) {
                        a(mResources.N);
                        return;
                    }
                }

                a(mResources.M);
                return;
            case 101024:
                J = null;
                InfoDlg.hide();
            case 101025:
            default:
                break;
            case 888361:
                var9 = dialog.a.getText();
                J = null;
                InfoDlg.hide();
                if (var9.length() >= 6 && !var9.equals("")) {
                    try {
                        Service.gI().q(Integer.parseInt(var9));
                        return;
                    } catch (Exception var5) {
                        a(mResources.N);
                        return;
                    }
                }

                a(mResources.M);
                return;
            case 888391:
                var9 = (String) var2;
                J = null;
                InfoDlg.hide();
                Service.gI().r(Integer.parseInt(var9));
                return;
            case 888392:
                Service.gI().menu((int) 4, menu.b, (int) 0);
                return;
            case 888393:
                loginScr.a();
                return;
            case 888394:
                J = null;
                InfoDlg.hide();
                return;
            case 888395:
                if (!currentScreen.equals(SplashScr.a) && !currentScreen.equals(af)) {
                    loginScr.b();
                } else {
                    af.b();
                }

                J = null;
                InfoDlg.hide();
                return;
            case 888396:
                J = null;
                InfoDlg.hide();
                return;
            case 888397:
                J = null;
                InfoDlg.hide();
                return;
        }

    }

    public static void clearAllPointerEvent() {
        l = false;
        k = false;
        ad = false;
        m = false;
        GameScr.gI().aT = 0L;
        GameScr.gI().aS = false;
    }
}
