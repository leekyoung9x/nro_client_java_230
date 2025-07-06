package nro;

import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;

public final class Panel implements IActionListener, nr_bt {

    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int aA;
    private int aB;
    private int aC;
    public int f;
    public int g;
    private int aD;
    private int arrItemBag;
    private int aF;
    private int[] aG;
    private int aH;
    public int h;
    private int aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    public static Image i = Main.loadImage("/mainImage/myTexture2dbantay.png");
    private static Image aN = Main.loadImage("/img/map" + TileMap.r + ".png");
    public nr_dk j;
    public MyVector k = new MyVector("");
    private int aO;
    public int l;
    private boolean aP;
    public boolean m;
    private boolean aQ;
    public String n;
    public nr_cm o;
    public static String p;
    public static short q;
    public static Image r;
    public static Image s;
    public static Image t;
    private static Image aR;
    public static Image u;
    public static Image v;
    public static Image w;
    public static Image x;
    private static Image aS;
    private static Image aT;
    private Command aU;
    public int y;
    public int z;
    public int A;
    private int[] aV;
    private String[][] aW;
    private int[] aX;
    public String[][] B;
    public String[] C;
    public String[] D;
    public static String[] strTool;
    public static String[] F;
    private static String[] aY;
    private static String[] aZ;
    public static int G;
    public String[][] H;
    public int[] I;
    public int[] J;
    private static String[][] ba;
    private static String[][] bb;
    private static String[][] bc;
    private static String[][] bd;
    private static String[][] be;
    private static String[][] bf;
    public String[][][] tabName;
    private static byte bg;
    private static byte bh;
    private static byte bi;
    private static byte bj;
    private static byte bk;
    private static byte bl;
    private static byte bm;
    public int L;
    public int M;
    private int[] bn;
    private static int[] bo;
    private static int[] bp;
    private static int[] bq;
    private static int[] br;
    private static int[] bs;
    private static int[] bt;
    private static int[] bu;
    private static int[] bv;
    private static int[] bw;
    private static int[][] bx;
    private static int[][] by;
    private static int[][] bz;
    private Item bA;
    private nr_eb bB;
    private nr_bx bC;
    private nr_e bD;
    public nr_eb[] N;
    public MyVector O;
    public MyVector P;
    private MyVector bE;
    public MyVector Q;
    public MyVector R;
    public MyVector S;
    public MyVector T;
    public MyVector U;
    public MyVector vEnemy;
    public MyVector W;
    public Command X;
    public static int WIDTH_PANEL;
    private int bF;
    public Char Z;
    private boolean bG;
    private int bH;
    public static boolean aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public ChatPopup af;
    private int bI;
    private int[] bJ;
    private int bK;
    public boolean ag;
    public int ah;
    private int bL;
    private int bM;
    private boolean bN;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    private int bO;
    private int bP;
    private int[] bQ;
    private boolean bR;
    private boolean bS;
    private int bT;
    private int bU;
    private int bV;
    private int bW;
    private boolean bX;
    private int bY;
    private int bZ;
    private int ca;
    private int cb;
    private boolean cc;
    private int cd;
    private String[][] ce;
    private String cf;
    public String al;
    private nr_do cg;
    private int ch;
    private int ci;
    private boolean cj;
    private String[] ck;
    private static long[] cl;
    private int[] cm;
    public String[] am;
    public String[] an;
    public static String ao;
    private int cn;
    private int co;
    private int cp;
    private int cq;
    private int cr;
    private int cs;
    private int ct;
    private int cu;
    private int cv;
    private int cw;
    private int cx;
    public static boolean ap;
    private boolean cy;
    private int cz;
    public static MyVector aq;
    private static String[] cA;
    public boolean ar;
    private int cB;
    private Char cC;
    private boolean cD;
    private boolean cE;
    private boolean cF;
    private int cG;
    public byte as;
    public int at;
    public int au;
    public int av;
    private int cH;
    private int cI;
    private int cJ;
    private int cK;
    private int cL;
    private int cM;
    private int[] cN;
    private int[] cO;
    private int[] cP;
    private int[] cQ;
    private int cR;
    private int cS;
    private int cT;
    private int cU;
    private int cV;
    private boolean cW;
    private boolean cX;
    private boolean cY;
    public boolean aw;
    public short ax;
    private short cZ;
    public short ay;
    private short[] da;
    public String[][] az;
    private static int[] db;
    private static int dc;
    private static int[][] dd;
    private Image de;
    private Image df;
    private Image dg;
    private Image dh;
    private byte di;

    static {
        Main.loadImage("/mainImage/myTexture2dbtX.png");
        u = Main.loadImage("/mainImage/myTexture2dimgMoney.png");
        w = Main.loadImage("/mainImage/myTexture2dimgDiamond.png");
        x = Main.loadImage("/mainImage/luongkhoa.png");
        aS = Main.loadImage("/mainImage/myTexture2dup.png");
        aT = Main.loadImage("/mainImage/myTexture2ddown.png");
        r = Main.loadImage("/mainImage/star.png");
        s = Main.loadImage("/mainImage/starE.png");
        t = Main.loadImage("/mainImage/star8.png");
        aR = Main.loadImage("/mainImage/new.png");
        v = Main.loadImage("/mainImage/ticket12.png");
        strTool = new String[]{mResources.bO, mResources.bN, mResources.aC, mResources.bM, mResources.al, mResources.bQ, mResources.P};
        F = new String[]{GameCanvas.ae ? mResources.fx : mResources.fy, mResources.bR, mResources.D, mGraphics.zoomLevel > 1 ? mResources.bV : mResources.bU};
        aY = new String[]{mResources.fS, mResources.bJ, mResources.bK, mResources.Z, mResources.fO};
        aZ = new String[]{mResources.k};
        G = 0;
        ba = new String[][]{mResources.ca, mResources.cb};
        bb = new String[][]{mResources.cc, mResources.cb};
        bc = new String[][]{mResources.cg};
        bd = new String[][]{mResources.cd};
        be = new String[][]{mResources.cb, mResources.ce, mResources.cf};
        bf = mResources.aL;
        bg = 0;
        bh = 1;
        bi = 3;
        bj = 4;
        bk = 5;
        bl = 6;
        bm = 7;
        bo = new int[]{21, 0, 1, 2, 24, 3, 4, 5, 6, 27, 28, 29, 30, 42, 47, 46};
        bp = new int[]{39, 42, 105, 93, 61, 93, 142, 165, 210, 100, 165, 220, 233, 10, 125, 125};
        bq = new int[]{28, 60, 48, 96, 88, 131, 136, 95, 32, 200, 189, 167, 120, 110, 20, 20};
        br = new int[]{22, 7, 8, 9, 25, 11, 12, 13, 10, 31, 32, 33, 34, 43};
        bs = new int[]{55, 30, 93, 80, 24, 149, 219, 220, 233, 170, 148, 195, 148, 10};
        bt = new int[]{136, 84, 69, 34, 25, 42, 32, 110, 192, 70, 106, 156, 210, 57};
        bu = new int[]{23, 14, 15, 16, 26, 17, 18, 20, 19, 35, 36, 37, 38, 44};
        bv = new int[]{90, 95, 144, 234, 231, 122, 176, 158, 205, 54, 105, 159, 231, 27};
        bw = new int[]{10, 43, 20, 36, 69, 87, 112, 167, 160, 151, 173, 207, 194, 29};
        bx = new int[][]{bo, br, bu};
        by = new int[][]{bp, bs, bv};
        bz = new int[][]{bq, bt, bw};
        WIDTH_PANEL = 240;
        aa = false;
        cl = new long[]{50000000L, 250000000L, 1250000000L, 5000000000L, 15000000000L, 30000000000L, 45000000000L, 60000000000L, 75000000000L, 90000000000L, 110000000000L, 130000000000L, 150000000000L, 170000000000L};
        int[] var10000 = new int[]{2327248, 8982199, 16713222};
        var10000 = new int[]{4583423, 16719103, 16714764};
        ao = "";
        ap = true;
        aq = new MyVector("");
        db = new int[]{2, 1, 1};
        dc = 1;
        dd = new int[][]{{16777215, 15000805, 13487823, 11711155, 9671828, 7895160}, {'\uf200', '\ue500', '\ucc00', '\ub300', '\u9900', '\u8000'}, {13500671, 12058853, 10682572, 9371827, 7995545, 6684800}, {16744192, 15037184, 13395456, 11753728, 10046464, 8404992}, {'\u90ff', '\u82e5', 28108, 24499, 21145, 17536}, {16776192, 15063040, 12635136, 11776256, 10063872, 8290304}, {16711680, 15007744, 13369344, 11730944, 10027008, 8388608}};
    }

    public Panel() {
        this.aU = new Command(mResources.bs, 0);
        this.tabName = new String[][][]{null, null, ba, bc, bd, null, null, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}, bb, be, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}, bf, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}};
        this.bE = new MyVector("");
        this.Q = new MyVector("");
        this.R = new MyVector("");
        this.S = new MyVector("");
        this.T = new MyVector("");
        this.U = new MyVector("");
        this.vEnemy = new MyVector("");
        this.W = new MyVector("");
        this.bF = 0;
        this.bH = -1;
        this.bK = 0;
        this.ag = false;
        this.bQ = new int[3];
        this.bW = 0;
        this.bX = false;
        this.bY = GameCanvas.s + this.aI;
        this.bZ = GameCanvas.t + this.aJ;
        this.ca = -1;
        this.cb = -1;
        this.cd = -1;
        this.ce = new String[][]{mResources.dg, mResources.df};
        this.cf = "";
        this.al = "";
        this.ck = new String[]{mResources.q, mResources.p, mResources.o, mResources.s, mResources.gg, mResources.gh};
        this.cm = new int[]{'\uaa00', 14743570, 14155776};
        this.cp = 140;
        this.cq = -1;
        this.cs = 0;
        this.ct = 0;
        this.as = -1;
        this.cX = true;
        this.cY = false;
        this.aw = true;
        this.di = 0;
        this.a();
        this.X = new Command("", this, 1003, (Object) null);
        this.X.img = Main.loadImage("/mainImage/myTexture2dbtX.png");
        this.X.cmdClosePanel = true;
    }

    public final void a() {
        this.bY = GameCanvas.s + this.aI;
        this.bZ = GameCanvas.t + this.aJ;
        this.aV = new int[this.tabName.length];

        for (int var1 = 0; var1 < this.aV.length; ++var1) {
            this.aV[var1] = -1;
        }

    }

    private static int G() {
        for (int var0 = 0; var0 < bx[TileMap.r].length; ++var0) {
            if (TileMap.l == bx[TileMap.r][var0]) {
                return by[TileMap.r][var0];
            }
        }

        return -1;
    }

    private static int H() {
        for (int var0 = 0; var0 < bx[TileMap.r].length; ++var0) {
            if (TileMap.l == bx[TileMap.r][var0]) {
                return bz[TileMap.r][var0];
            }
        }

        return -1;
    }

    private static int I() {
        if (Char.myCharz().taskMaint == null) {
            return -1;
        } else {
            for (int var0 = 0; var0 < bx[TileMap.r].length; ++var0) {
                if (GameScr.ac[Char.myCharz().taskMaint.a] == bx[TileMap.r][var0]) {
                    return by[TileMap.r][var0];
                }
            }

            return -1;
        }
    }

    private static int J() {
        if (Char.myCharz().taskMaint == null) {
            return -1;
        } else {
            for (int var0 = 0; var0 < bx[TileMap.r].length; ++var0) {
                if (GameScr.ac[Char.myCharz().taskMaint.a] == bx[TileMap.r][var0]) {
                    return bz[TileMap.r][var0];
                }
            }

            return -1;
        }
    }

    private void c(int var1) {
        this.bH = -1;
        this.d = WIDTH_PANEL;
        this.e = GameCanvas.A;
        this.b = 0;
        this.c = 0;
        this.aA = 24;
        this.bF = var1;
        if (var1 == 0) {
            this.ab = 2;
            this.ac = 80;
            this.ad = this.d - 4;
            this.ae = this.e - 96;
            this.h = this.ad;
            this.aH = 0;
            this.b = 0;
        } else if (var1 == 1) {
            this.ad = this.d - 4;
            this.ab = GameCanvas.z - this.ad;
            this.ac = 80;
            this.ae = this.e - 96;
            this.b = this.ab - 2;
            this.h = -(GameCanvas.z + this.d);
            this.aH = GameCanvas.z - this.d;
        }

        this.aB = this.d / 5 - 1;
        this.z = 0;
        this.aW = this.tabName[this.y];
        if (this.aW.length < 5) {
            this.aB += 5;
        }

        this.A = this.ab + this.ad / 2 - this.aW.length * this.aB / 2;
        this.bn = new int[this.aW.length];
        this.aG = new int[this.aW.length];

        for (var1 = 0; var1 < this.aW.length; ++var1) {
            this.bn[var1] = GameCanvas.isTouch ? -1 : 0;
        }

        if (this.aV[this.y] != -1) {
            this.z = this.aV[this.y];
        }

        if (this.z < 0) {
            this.z = 0;
        }

        if (this.z > this.aW.length - 1) {
            this.z = this.aW.length - 1;
        }

        this.cg = null;
    }

    public final void b() {
        this.y = 14;
        this.c(0);
        this.aA = 24;
        this.M = this.C.length;
        this.aF = this.M * this.aA - this.ae;
        this.g = this.f = 0;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.h = this.aH = 0;
    }

    private void K() {
        GameScr.gI();
        if (!GameScr.f()) {
            if (ap) {
                if (nr_v.a(2, 0)) {
                    nr_v.f = true;
                    GameScr.aC.a(mResources.cm, 0);
                }

                if (nr_v.a(3, 0)) {
                    nr_v.h = true;
                }

                this.y = 4;
                this.aW = this.tabName[this.y];
                this.A = this.ab + this.ad / 2 - this.aW.length * this.aB / 2;
                this.h = this.aH = 0;
                if (ap) {
                    if (TileMap.s != TileMap.r) {
                        Res.out("LOAD TAM HINH");
                        if (mGraphics.zoomLevel == 1) {
                            SmallImage.b = null;
                            GameScr.bt = false;
                            System.gc();
                        }

                        aN = Main.a("/img/map" + TileMap.r + ".png");
                        TileMap.s = TileMap.r;
                    }

                    this.aI = G() - this.ad / 2;
                    this.aJ = H() + this.ac - (this.ac + this.ae / 2);
                    this.bV = this.aI;
                    this.bW = this.aJ;
                    this.aK = 250 - this.ad;
                    this.aL = 220 - this.ae;
                    if (this.aK < 0) {
                        this.aK = 0;
                    }

                    if (this.aL < 0) {
                        this.aL = 0;
                    }

                    for (int var2 = 0; var2 < bx[TileMap.r].length; ++var2) {
                        if (TileMap.l == bx[TileMap.r][var2]) {
                            this.cw = by[TileMap.r][var2] + this.ab;
                            this.cx = bz[TileMap.r][var2] + this.ac + 5;
                            break;
                        }
                    }

                    this.cu = G() + this.ab;
                    this.cv = H() + this.ac;
                    I();
                    J();
                }

            }
        }
    }

    public final void c() {
        this.M = Char.myCharz().aD.length;
        this.c(0);
        this.y = 9;
        this.aF = this.M * this.aA - this.ae;
        this.g = this.f = this.aG[this.z];
        if (this.aF < 0) {
            this.aF = 0;
        }

        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = 0;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    public final void d() {
        this.y = 17;
        this.c(1);
        this.e();
        this.bH = 2;
        this.z = 0;
    }

    public final void e() {
        this.aA = 24;
        this.M = Char.myCharz().aI[4].length;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    public final void setTypeBodyOnly() {
        this.y = 7;
        this.c(1);
        this.b(true);
        this.z = 0;
    }

    public final void a(nr_r var1) {
        this.bE.insertElementAt(var1, 0);
        if (this.bE.size() > 20) {
            this.bE.removeElementAt(this.bE.size() - 1);
        }

    }

    public final void g() {
        this.aA = 24;
        this.M = this.Q.size();
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    public final void h() {
        this.y = 18;
        this.c(0);
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.M = this.W.size();
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        if (this.ah > this.M - 1) {
            this.ah = this.M - 1;
        }

        this.h = this.aH = 0;
    }

    public final void a(Char var1) {
        this.y = 10;
        this.c(0);
        this.g();
        this.Z = var1;
    }

    public final void i() {
        this.y = 11;
        this.c(0);
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.k();
    }

    public final void j() {
        this.y = 16;
        this.c(0);
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.M = this.vEnemy.size();
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        if (this.ah > this.M - 1) {
            this.ah = this.M - 1;
        }

        this.h = this.aH = 0;
    }

    public final void a(byte var1) {
        this.y = 15;
        this.c(0);
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.M = this.U.size();
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        if (this.ah > this.M - 1) {
            this.ah = this.M - 1;
        }

        this.h = this.aH = 0;
        this.bG = var1 != 0;
    }

    public final void k() {
        this.M = this.R.size();
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        if (this.ah > this.M - 1) {
            this.ah = this.M - 1;
        }

        this.h = this.aH = 0;
    }

    public final void l() {
        this.y = 8;
        this.c(0);
        this.aA = 24;
        this.x();
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.z = 0;
    }

    public final void a(int var1) {
        this.y = 1;
        this.c(0);
        this.y();
        this.z = 0;
        this.bH = var1;
    }

    public final void m() {
        this.y = 2;
        if (GameCanvas.z > 2 * WIDTH_PANEL) {
            ba = new String[][]{mResources.ca};
        } else {
            ba = new String[][]{mResources.ca, mResources.cb};
        }

        this.tabName[2] = ba;
        this.c(0);
        if (this.z == 0) {
            this.T();
        }

        if (this.z == 1) {
            this.b(true);
        }

        if (GameCanvas.z > 2 * WIDTH_PANEL) {
            (GameCanvas.panel2 = new Panel()).tabName[7] = new String[][]{{""}};
            GameCanvas.panel2.setTypeBodyOnly();
            GameCanvas.panel2.show();
        }

    }

    public final void n() {
        this.y = 12;
        if (GameCanvas.z > 2 * WIDTH_PANEL) {
            bb = new String[][]{mResources.cc};
        } else {
            bb = new String[][]{mResources.cc, mResources.cb};
        }

        this.tabName[this.y] = bb;
        this.c(0);
        if (this.z == 0) {
            this.o();
        }

        if (this.z == 1) {
            this.b(true);
        }

        if (GameCanvas.z > 2 * WIDTH_PANEL) {
            (GameCanvas.panel2 = new Panel()).tabName[7] = new String[][]{{""}};
            GameCanvas.panel2.setTypeBodyOnly();
            GameCanvas.panel2.show();
        }

        this.as = -1;
        this.aw = true;
    }

    public final void o() {
        this.M = this.k.size() + 1;
        this.aA = 24;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 9;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    private void L() {
        this.y = 22;
        this.c(0);
        this.M = aZ.length;
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.h = this.aH = 0;
    }

    public final void setTypePetMain() {
        this.y = 21;
        if (GameCanvas.panel2 != null) {
            bf = mResources.aM;
        } else {
            bf = mResources.aL;
        }

        this.tabName[21] = bf;
        if (Char.myCharz().cgender == 1) {
            this.ck = new String[]{mResources.q, mResources.p, mResources.o, mResources.s, mResources.gg, mResources.gh};
        } else {
            this.ck = new String[]{mResources.q, mResources.p, mResources.o, mResources.s, mResources.gg};
        }

        this.c(2);
        if (this.z == 0) {
            this.U();
        }

        if (this.z == 1) {
            this.P();
        }

        if (this.z == 2) {
            this.b(true);
        }

    }

    public final void q() {
        this.y = 0;
        this.c(0);
        if (this.z == 1) {
            this.b(true);
        }

        if (this.z == 2) {
            this.R();
        }

        if (this.z == 3) {
            if (this.B.length == 4) {
                this.Q();
            } else {
                this.w();
            }
        }

        if (this.z == 4) {
            this.Q();
        }

    }

    public final void r() {
        this.y = 3;
        this.c(0);
        this.S();
        this.h = this.aH = 0;
    }

    private void b(Item var1) {
        this.af = new ChatPopup();
        String var3 = "";
        if (var1.template.gender != Char.myCharz().cgender) {
            if (var1.template.gender == 0) {
                var3 = var3 + "\n|7|1|" + mResources.cn;
            } else if (var1.template.gender == 1) {
                var3 = var3 + "\n|7|1|" + mResources.co;
            } else if (var1.template.gender == 2) {
                var3 = var3 + "\n|7|1|" + mResources.cp;
            }
        }

        String var2 = "";
        if (var1.itemOption != null) {
            for (int var4 = 0; var4 < var1.itemOption.length; ++var4) {
                if (var1.itemOption[var4].optionTemplate.id == 72) {
                    var2 = " [+" + var1.itemOption[var4].param + "]";
                }
            }
        }

        boolean var6 = false;
        int var5;
        if (var1.itemOption != null) {
            for (var5 = 0; var5 < var1.itemOption.length; ++var5) {
                if (var1.itemOption[var5].optionTemplate.id == 41) {
                    var6 = true;
                    if (var1.itemOption[var5].param == 1) {
                        var3 = var3 + "|0|1|" + var1.template.name + var2;
                    }

                    if (var1.itemOption[var5].param == 2) {
                        var3 = var3 + "|2|1|" + var1.template.name + var2;
                    }

                    if (var1.itemOption[var5].param == 3) {
                        var3 = var3 + "|8|1|" + var1.template.name + var2;
                    }

                    if (var1.itemOption[var5].param == 4) {
                        var3 = var3 + "|7|1|" + var1.template.name + var2;
                    }
                }
            }
        }

        if (!var6) {
            var3 = var3 + "|0|1|" + var1.template.name + var2;
        }

        if (var1.itemOption != null) {
            for (var5 = 0; var5 < var1.itemOption.length; ++var5) {
                if (var1.itemOption[var5].optionTemplate.name.startsWith("$")) {
                    var2 = NinjaUtil.replace(var1.itemOption[var5].optionTemplate.name, "$", "");
                    if (var1.itemOption[var5].param == 1) {
                        var3 = var3 + "\n|1|1|" + var2;
                    }

                    if (var1.itemOption[var5].param == 0) {
                        var3 = var3 + "\n|0|1|" + var2;
                    }
                } else if (!(var2 = var1.itemOption[var5].getOptionString()).equals("") && var1.itemOption[var5].optionTemplate.id != 72) {
                    if (var1.itemOption[var5].optionTemplate.id == 102) {
                        this.af.o = (byte) var1.itemOption[var5].param;
                        Res.out("STAR SLOT= " + this.af.o);
                    } else if (var1.itemOption[var5].optionTemplate.id == 107) {
                        this.af.p = (byte) var1.itemOption[var5].param;
                        Res.out("STAR SLOT= " + this.af.p);
                    } else {
                        var3 = var3 + "\n|1|1|" + var2;
                    }
                }
            }
        }

        if (this.bA.template.strRequire > 1) {
            String var7 = mResources.cq + ": " + this.bA.template.strRequire;
            if ((long) this.bA.template.strRequire > Char.myCharz().cPower) {
                var3 = var3 + "\n|3|1|" + var7;
                var3 = var3 + "\n|3|1|" + mResources.cr + ": " + Char.myCharz().cPower;
            } else {
                var3 = var3 + "\n|6|1|" + var7;
            }
        } else {
            var3 = var3 + "\n|6|1|";
        }

        this.bA.compare = this.getCompare(this.bA);
        var3 = var3 + "\n--";
        var3 = var3 + "\n|6|" + var1.template.description;
        if (!var1.reason.equals("")) {
            if (!var1.template.description.equals("")) {
                var3 = var3 + "\n--";
            }

            var3 = var3 + "\n|2|" + var1.reason;
        }

        if (this.af.p > 0) {
            var3 = var3 + "\n\n";
        }

        this.a(this.af, var3);
        this.bI = var1.template.iconID;
        this.bJ = null;
        this.cC = null;
    }

    private void a(ChatPopup var1, String var2) {
        var1.t = false;
        var1.a = 180;
        var1.e = 3 + this.b - (this.b == 0 ? 0 : Res.g(var1.a - this.d) + 8);
        var1.d = mFont.p.a(var2, var1.a - 10);
        var1.b = 10000000;
        var1.i = null;
        var1.c = 7;
        var1.g = 15 - var1.c + var1.d.length * 12 + 10;
        if (var1.g > GameCanvas.A - 80) {
            var1.g = GameCanvas.A - 80;
            var1.h = var1.d.length * 12 - var1.g + 17;
            if (var1.h < 0) {
                var1.h = 0;
            }

            ChatPopup.u = 0;
            var1.t = true;
        }

        for (var1.f = GameCanvas.menu.d - var1.g; var1.f < 10; ++GameCanvas.menu.d) {
            ++var1.f;
        }

        var1.s = 10;
    }

    private void a(nr_bx var1) {
        this.af = new ChatPopup();
        String var2 = "|0|" + var1.d;
        var2 = var2 + "\n|1|" + nr_e.a(var1.h);

        int var3;
        for (var3 = 0; var3 < this.P.size(); ++var3) {
            nr_e var4 = (nr_e) this.P.elementAt(var3);
            if (var1.c == var4.a) {
                var2 = var2 + "\n|5|" + mResources.cO + ": " + var4.l;
                var2 = var2 + "\n|5|" + mResources.cP + ": " + var4.k;
                var2 = var2 + "\n|4|" + mResources.cR + ": " + var4.i + mResources.cU;
                var2 = var2 + "\n|4|" + mResources.cS + ": " + var4.j + mResources.cU;
                this.bJ = new int[]{var4.b, var4.d, var4.e};
                break;
            }
        }

        var2 = var2 + "\n--";

        for (var3 = 0; var3 < var1.f.length; ++var3) {
            var2 = var2 + "\n" + var1.f[var3];
        }

        if (var1.b == 1) {
            var2 = var2 + "\n|6|" + mResources.cV + " " + var1.i + "/" + var1.j;
        }

        this.a(this.af, var2);
        this.cC = null;
    }

    private void a(nr_e var1) {
        String var2 = "|0|1|" + var1.f;
        String var3 = "\n|2|1|";
        if (var1.g == 0) {
            var3 = "\n|7|1|";
        }

        if (var1.g == 1) {
            var3 = "\n|1|1|";
        }

        if (var1.g == 2) {
            var3 = "\n|0|1|";
        }

        var2 = var2 + var3 + nr_e.a(var1.g);
        var2 = var2 + "\n|2|1|" + mResources.cW + ": " + var1.h;
        var2 = var2 + "\n--";
        var2 = var2 + "\n|5|" + mResources.cO + ": " + var1.l;
        var2 = var2 + "\n|5|" + mResources.cP + ": " + var1.k;
        var2 = var2 + "\n|4|" + mResources.cR + ": " + var1.i + mResources.cU;
        var2 = var2 + "\n|4|" + mResources.cS + ": " + var1.j + mResources.cU;
        var2 = var2 + "\n|6|" + mResources.cX + ": " + var1.m;
        this.af = new ChatPopup();
        this.a(this.af, var2);
        this.bJ = new int[]{var1.b, var1.d, var1.e};
        this.bA = null;
        this.cC = null;
    }

    private void a(nr_eb var1) {
        try {
            String var2 = "|0|" + var1.c;
            String[] var3 = mFont.r.a(var1.d, this.ad - 60);

            for (int var4 = 0; var4 < var3.length; ++var4) {
                var2 = var2 + "\n|2|" + var3[var4];
            }

            var2 = var2 + "\n--";
            var2 = var2 + "\n|7|" + mResources.cY + ": " + var1.i;
            var2 = var2 + "\n|1|" + mResources.da + ": " + var1.f;
            var2 = var2 + "\n|4|" + mResources.db + ": " + var1.g + "/" + var1.h;
            var2 = var2 + "\n|4|" + mResources.dk + ": " + var1.j;
            var2 = var2 + "\n|4|" + mResources.dl + ": " + NinjaUtil.a(var1.e);
            this.af = new ChatPopup();
            this.a(this.af, var2);
            this.bI = nr_aj.a((short) var1.b).c[0];
            this.bA = null;
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    private void a(nr_en var1, Skill var2, Skill var3) {
        String var4 = "|0|" + var1.b;

        for (int var5 = 0; var5 < var1.g.length; ++var5) {
            var4 = var4 + "\n|4|" + var1.g[var5];
        }

        var4 = var4 + "\n--";
        if (var2 != null) {
            var4 = var4 + "\n|2|" + mResources.eX + ": " + var2.c;
            var4 = var4 + "\n|5|" + NinjaUtil.replace(var1.i, "#", String.valueOf(var2.k));
            var4 = var4 + "\n|5|" + mResources.eY + var2.i + (var1.d == 1 ? "%" : "");
            var4 = var4 + "\n|5|" + mResources.eZ + ": " + var2.e + mResources.fa;
            var4 = var4 + "\n--";
            if (var2.c == var1.c) {
                var4 = var4 + "\n|0|" + mResources.fb;
            } else {
                var4 = var4 + "\n|1|" + mResources.fc + Res.a(var3.d) + " " + mResources.fd;
                var4 = var4 + "\n|4|" + NinjaUtil.replace(var1.i, "#", String.valueOf(var3.k));
            }
        } else {
            var4 = var4 + "\n|2|" + mResources.fe;
            var4 = var4 + "\n|1|" + mResources.ff + Res.a(var3.d) + " " + mResources.fd;
            var4 = var4 + "\n|4|" + NinjaUtil.replace(var1.i, "#", String.valueOf(var3.k));
            var4 = var4 + "\n|4|" + mResources.eY + var3.i + (var1.d == 1 ? "%" : "");
            var4 = var4 + "\n|4|" + mResources.eZ + ": " + var3.e + mResources.fa;
        }

        this.bA = null;
        this.bJ = null;
        this.cC = null;
        this.af = new ChatPopup();
        this.a(this.af, var4);
        this.bI = 0;
    }

    public final void show() {
        if (GameCanvas.isTouch) {
            this.X.x = 156;
            this.X.y = 3;
        } else {
            this.X.x = GameCanvas.z - 19;
            this.X.y = GameCanvas.A - 19;
        }

        this.X.isPlaySoundButton = false;
        ChatPopup.m = null;
        InfoDlg.hide();
        this.bK = 20;
        this.a = true;
        this.cy = false;
        SoundMn.gI();
        if (this.F()) {
            Char.myCharz().V();
        }

    }

    public final void t() {
        if (this.o != null && this.o.b) {
            if (this.o.d != null && (GameCanvas.i[12] || mScreen.a(this.o.d)) && this.o.d != null) {
                this.o.d.performAction();
            }

            if (this.o.e != null && (GameCanvas.i[13] || mScreen.a(this.o.e)) && this.o.e != null) {
                this.o.e.performAction();
            }

            if (this.o.f != null && (GameCanvas.i[5] || mScreen.a(this.o.f)) && this.o.f != null) {
                this.o.f.performAction();
            }

            if (this.o.b && GameCanvas.ab != 0) {
                this.o.a(GameCanvas.ab);
                GameCanvas.ab = 0;
            }

            GameCanvas.f();
            GameCanvas.e();
        }
    }

    public final void u() {
        if (this.o == null || !this.o.b) {
            if (GameCanvas.panel.aw) {
                if (!InfoDlg.a) {
                    if (this.j != null && this.j.k) {
                        nr_dk var7 = this.j;
                        if (this.j.c != null && (GameCanvas.i[12] || mScreen.a(var7.c))) {
                            var7.c.performAction();
                        }

                        if (var7.d != null && (GameCanvas.i[13] || mScreen.a(var7.d))) {
                            var7.d.performAction();
                        }

                        if (!var7.l) {
                            if (nr_dk.f == null) {
                                return;
                            }

                            if (GameCanvas.isTouch) {
                                nr_dk.f.a();
                                var7.n = nr_dk.f.n;
                            }

                            if (GameCanvas.i[2]) {
                                GameCanvas.i[2] = false;
                                --var7.n;
                                if (var7.n < 0) {
                                    var7.n = var7.e - 1;
                                }

                                nr_dk.f.a(var7.n * nr_dk.f.o);
                            }

                            if (GameCanvas.i[8]) {
                                GameCanvas.i[8] = false;
                                ++var7.n;
                                if (var7.n > var7.e - 1) {
                                    var7.n = 0;
                                }

                                nr_dk.f.a(var7.n * nr_dk.f.o);
                            }

                            if (var7.n != -1) {
                                var7.o = var7.n;
                            }
                        }

                        GameCanvas.f();
                        GameCanvas.e();
                    } else if (!this.cy) {
                        if (this.a) {
                            if (this.X.isPointerPressInside()) {
                                this.X.performAction();
                            } else {
                                if (GameCanvas.i[13]) {
                                    if (this.y != 4) {
                                        this.A();
                                        return;
                                    }

                                    this.q();
                                    this.h = this.aH = 0;
                                }

                                if (GameCanvas.i[12] || GameCanvas.i[5]) {
                                    if (this.aU.idAction > 0) {
                                        this.perform(this.aU.idAction, this.aU.p);
                                    } else {
                                        this.bT = 2;
                                    }
                                }

                                if (this.equals(GameCanvas.panel) && GameCanvas.panel2 == null && GameCanvas.m && !GameCanvas.b(this.b, 0, this.d, this.e) && !this.bR) {
                                    this.A();
                                } else {
                                    int var2;
                                    int var3;
                                    if (!this.bN) {
                                        Panel var1 = this;
                                        if ((this.cg == null || !this.cg.m) && !this.bR) {
                                            boolean var10000;
                                            label515:
                                            {
                                                var2 = this.z;
                                                if (this.di > 0) {
                                                    if (this.aW.length > 1) {
                                                        if (this.ah == 0) {
                                                            var10000 = true;
                                                            break label515;
                                                        }
                                                    } else if (this.ah >= 0) {
                                                        var10000 = true;
                                                        break label515;
                                                    }
                                                }

                                                var10000 = false;
                                            }

                                            if (!var10000) {
                                                if (GameCanvas.i[6]) {
                                                    if (this.aw()) {
                                                        if (this.ah >= 0) {
                                                            this.ax();
                                                        } else {
                                                            ++this.z;
                                                            if (this.z >= this.aW.length) {
                                                                if (GameCanvas.panel2 != null) {
                                                                    this.z = this.aW.length - 1;
                                                                    GameCanvas.T = true;
                                                                } else {
                                                                    this.z = 0;
                                                                }
                                                            }

                                                            this.ah = this.bn[this.z];
                                                            this.aV[this.y] = this.z;
                                                        }
                                                    } else {
                                                        ++this.z;
                                                        if (this.z >= this.aW.length) {
                                                            if (GameCanvas.panel2 != null) {
                                                                this.z = this.aW.length - 1;
                                                                GameCanvas.T = true;
                                                            } else {
                                                                this.z = 0;
                                                            }
                                                        }

                                                        this.ah = this.bn[this.z];
                                                        this.aV[this.y] = this.z;
                                                    }
                                                }

                                                if (GameCanvas.i[4]) {
                                                    --this.z;
                                                    if (this.z < 0) {
                                                        this.z = this.aW.length - 1;
                                                    }

                                                    if (GameCanvas.T) {
                                                        GameCanvas.T = false;
                                                    }

                                                    this.ah = this.bn[this.z];
                                                    this.aV[this.y] = this.z;
                                                }
                                            }

                                            this.cd = -1;

                                            for (var3 = 0; var3 < var1.aW.length; ++var3) {
                                                if (GameCanvas.b(var1.A + var3 * var1.aB, 52, var1.aB - 1, 25)) {
                                                    var1.cd = var3;
                                                    if (GameCanvas.m) {
                                                        var1.z = var3;
                                                        var1.aV[var1.y] = var3;
                                                        GameCanvas.m = false;
                                                        var1.ah = var1.bn[var1.z];
                                                        if (var2 == var1.z && var1.bU == 0) {
                                                            var1.f = 0;
                                                            var1.ah = GameCanvas.isTouch ? -1 : 0;
                                                        }
                                                        break;
                                                    }
                                                }
                                            }

                                            if (var2 != var1.z) {
                                                var1.di = 0;
                                                SoundMn.gI();
                                                switch (var1.y) {
                                                    case 0:
                                                        if (var1.z == 0) {
                                                            var1.aM = 0;
                                                        }

                                                        if (var1.z == 1) {
                                                            var1.b(true);
                                                        }

                                                        if (var1.z == 2) {
                                                            var1.R();
                                                        }

                                                        if (var1.z == 3) {
                                                            if (var1.B.length > 4) {
                                                                var1.w();
                                                            } else {
                                                                var1.Q();
                                                            }
                                                        }

                                                        if (var1.z == 4) {
                                                            var1.Q();
                                                        }
                                                        break;
                                                    case 1:
                                                        var1.y();
                                                        break;
                                                    case 2:
                                                        if (var1.z == 0) {
                                                            var1.T();
                                                        }

                                                        if (var1.z == 1) {
                                                            var1.b(true);
                                                        }
                                                        break;
                                                    case 3:
                                                        var1.S();
                                                        break;
                                                    case 12:
                                                        if (var1.z == 0) {
                                                            var1.o();
                                                        }

                                                        if (var1.z == 1) {
                                                            var1.b(true);
                                                        }
                                                        break;
                                                    case 13:
                                                        if (var1.z == 0) {
                                                            if (var1.equals(GameCanvas.panel)) {
                                                                var1.b(true);
                                                            } else if (var1.equals(GameCanvas.panel2)) {
                                                                var1.a(false);
                                                            }
                                                        }

                                                        if (var1.z == 1) {
                                                            var1.a(true);
                                                        }

                                                        if (var1.z == 2) {
                                                            var1.a(false);
                                                        }
                                                        break;
                                                    case 21:
                                                        if (var1.z == 0) {
                                                            var1.U();
                                                        }

                                                        if (var1.z == 1) {
                                                            var1.P();
                                                        }

                                                        if (var1.z == 2) {
                                                            var1.b(true);
                                                        }
                                                        break;
                                                    case 25:
                                                        var1.av();
                                                }

                                                var1.ah = var1.bn[var1.z];
                                            }
                                        }
                                    }

                                    switch (this.y) {
                                        case 0:
                                            if (this.z == 0) {
                                                if (GameCanvas.j[2]) {
                                                    this.aM -= 5;
                                                }

                                                if (GameCanvas.j[8]) {
                                                    this.aM += 5;
                                                }

                                                if (this.aM < 0) {
                                                    this.aM = 0;
                                                }

                                                if ((var2 = this.cr * 12 - (this.ae - 60)) < 0) {
                                                    var2 = 0;
                                                }

                                                if (this.aM > var2) {
                                                    this.aM = var2;
                                                }

                                                if (this.cg != null) {
                                                    if (!GameCanvas.isTouch) {
                                                        this.cg.d = this.aM;
                                                    }

                                                    this.cg.a();
                                                }

                                                var3 = this.ab + this.ad / 2 - 35;
                                                int var4 = GameCanvas.A > 300 ? 20 : 15;
                                                var2 = this.ac + this.ae - var4 - 15;
                                                var4 = GameCanvas.o;
                                                int var5 = GameCanvas.p;
                                                this.cb = -1;
                                                if (ap) {
                                                    GameScr.gI();
                                                    if (!GameScr.e() && var4 >= var3 && var4 <= var3 + 70 && var5 >= var2 && var5 <= var2 + 30 && (this.cg == null || !this.cg.m)) {
                                                        this.cb = 1;
                                                        if (GameCanvas.m) {
                                                            SoundMn.gI();
                                                            this.bT = 2;
                                                            GameCanvas.clearAllPointerEvent();
                                                        }
                                                    }
                                                }

                                                GameCanvas.e();
                                                return;
                                            }

                                            if (this.z == 1) {
                                                this.ay();
                                            }

                                            if (this.z == 2) {
                                                this.O();
                                            }

                                            if (this.z == 3) {
                                                if (this.B.length == 4) {
                                                    this.O();
                                                } else {
                                                    this.O();
                                                    if (this.aX != null) {
                                                        if (GameCanvas.i[4]) {
                                                            this.bC = this.X();
                                                            --this.bL;
                                                            if (this.ah == 0 && this.bL < 0) {
                                                                this.bL = this.aX.length - 1;
                                                            }

                                                            if (this.ah > 1 && this.aj && this.bC.k != null && this.bL < 0) {
                                                                this.bL = this.bC.k.length - 1;
                                                            }
                                                        } else if (GameCanvas.i[6]) {
                                                            this.bC = this.X();
                                                            ++this.bL;
                                                            if (this.ah == 0 && this.bL > this.aX.length - 1) {
                                                                this.bL = 0;
                                                            }

                                                            if (this.ah > 1 && this.aj && this.bC.k != null && this.bL > this.bC.k.length - 1) {
                                                                this.bL = 0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                            if (this.z != 4) {
                                                break;
                                            }
                                        case 1:
                                        case 17:
                                        case 25:
                                            if (this.z < this.aW.length - (GameCanvas.panel2 != null ? 0 : 1) && this.y != 17) {
                                                this.O();
                                            } else if (this.bH == 0) {
                                                this.ay();
                                            } else {
                                                this.O();
                                            }
                                            break;
                                        case 2:
                                            this.ay();
                                            break;
                                        case 3:
                                        case 26:
                                            this.O();
                                            break;
                                        case 4:
                                            if (GameCanvas.j[2]) {
                                                this.cx -= 5;
                                                this.aJ = this.cx - (this.ac + this.ae / 2);
                                                if (this.cx < this.ac) {
                                                    this.cx = this.ac;
                                                }
                                            }

                                            if (GameCanvas.j[8]) {
                                                this.cx += 5;
                                                this.aJ = this.cx - (this.ac + this.ae / 2);
                                                if (this.cx > this.ac + 200) {
                                                    this.cx = this.ac + 200;
                                                }
                                            }

                                            if (GameCanvas.j[4]) {
                                                this.cw -= 5;
                                                this.aI = this.cw - this.ad / 2;
                                                if (this.cw < 16) {
                                                    this.cw = 16;
                                                }
                                            }

                                            if (GameCanvas.j[6]) {
                                                this.cw += 5;
                                                this.aI = this.cw - this.ad / 2;
                                                if (this.cw > 250) {
                                                    this.cw = 250;
                                                }
                                            }

                                            if (GameCanvas.k) {
                                                this.bR = true;
                                                if (!this.bX) {
                                                    this.bV = this.aI;
                                                    this.bW = this.aJ;
                                                    this.bX = true;
                                                }

                                                this.aI = this.bV + (GameCanvas.s - GameCanvas.o);
                                                this.aJ = this.bW + (GameCanvas.t - GameCanvas.p);
                                            }

                                            if (GameCanvas.m) {
                                                this.bX = false;
                                                GameCanvas.s = GameCanvas.o;
                                                GameCanvas.t = GameCanvas.p;
                                                this.bY = GameCanvas.s + this.aI;
                                                this.bZ = GameCanvas.t + this.aJ;
                                            }

                                            if (GameCanvas.l) {
                                                this.bR = false;
                                            }

                                            if (this.aI < 0) {
                                                this.aI = 0;
                                            }

                                            if (this.aI > this.aK) {
                                                this.aI = this.aK;
                                            }

                                            if (this.aJ < 0) {
                                                this.aJ = 0;
                                            }

                                            if (this.aJ > this.aL) {
                                                this.aJ = this.aL;
                                            }

                                            GameCanvas.e();
                                            return;
                                        case 5:
                                        case 6:
                                        case 22:
                                        default:
                                            break;
                                        case 7:
                                            this.ay();
                                            break;
                                        case 8:
                                            this.O();
                                            break;
                                        case 9:
                                            this.O();
                                            break;
                                        case 10:
                                            this.O();
                                            break;
                                        case 11:
                                        case 16:
                                            this.O();
                                            break;
                                        case 12:
                                            if (this.z == 0) {
                                                this.O();
                                                this.ca = -1;
                                                if (this.ah == this.k.size() && GameCanvas.l) {
                                                    GameCanvas.l = false;
                                                    this.ca = 1;
                                                }
                                            }

                                            if (this.z == 1) {
                                                this.O();
                                            }
                                            break;
                                        case 13:
                                            if (this.z == 0) {
                                                if (this.equals(GameCanvas.panel)) {
                                                    this.ay();
                                                }

                                                if (this.equals(GameCanvas.panel2)) {
                                                    this.O();
                                                }
                                            }

                                            if (this.z == 1 || this.z == 2) {
                                                this.O();
                                            }
                                            break;
                                        case 14:
                                            this.O();
                                            break;
                                        case 15:
                                            this.O();
                                            break;
                                        case 18:
                                            this.O();
                                            break;
                                        case 19:
                                            this.O();
                                            break;
                                        case 20:
                                            this.O();
                                            break;
                                        case 21:
                                            if (this.z == 0) {
                                                this.O();
                                            }

                                            if (this.z == 1) {
                                                this.O();
                                            }

                                            if (this.z == 2) {
                                                this.O();
                                            }
                                            break;
                                        case 23:
                                        case 24:
                                            this.O();
                                    }

                                    GameCanvas.f();

                                    for (int var6 = 0; var6 < GameCanvas.i.length; ++var6) {
                                        GameCanvas.i[var6] = false;
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(boolean var1) {
        this.M = var1 ? this.S.size() + 3 : this.T.size() + 3;
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

    }

    public final void b(Char var1) {
        this.y = 13;
        this.tabName[this.y] = be;
        this.aQ = false;
        this.aP = false;
        this.m = false;
        this.S.removeAllElements();
        this.T.removeAllElements();
        this.aO = 0;
        this.l = 0;
        if (GameCanvas.z > 2 * WIDTH_PANEL) {
            (GameCanvas.panel2 = new Panel()).y = 13;
            GameCanvas.panel2.tabName[this.y] = new String[][]{mResources.cf};
            GameCanvas.panel2.c(1);
            GameCanvas.panel2.a(false);
            GameCanvas.panel.tabName[this.y] = new String[][]{mResources.cb, mResources.ce};
            GameCanvas.panel2.show();
            GameCanvas.panel2.Z = var1;
        }

        if (this.equals(GameCanvas.panel)) {
            this.c(0);
        }

        if (this.z == 0) {
            this.b(true);
        }

        if (this.z == 1) {
            this.a(true);
        }

        if (this.z == 2) {
            this.a(false);
        }

        this.Z = var1;
    }

    private void a(final mGraphics nr_eh, final boolean b) {
        nr_eh.a(16711680);
        nr_eh.e(this.ab, this.ac, this.ad, this.ae);
        nr_eh.a(0, -this.g);
        final MyVector nr_ef = b ? this.S : this.T;
        for (int i = 0; i < this.M; ++i) {
            final int n = this.ab + 36;
            final int n2 = this.ac + i * this.aA;
            final int n3 = this.ad - 36;
            final int n4 = this.aA - 1;
            final int ab = this.ab;
            final int n5 = this.ac + i * this.aA;
            final int n6 = this.aA - 1;
            if (n2 - this.g <= this.ac + this.ae && n2 - this.g >= this.ac - this.aA) {
                if (i == this.M - 1) {
                    if (b) {
                        nr_eh.a(15196114);
                        nr_eh.b(ab, n2, this.ad, n4);
                        if (!this.aP) {
                            if (!this.m) {
                                mFont.o.drawString(nr_eh, String.valueOf(mResources.dQ) + mResources.dI, this.ab + this.ad / 2, n2 + n4 / 2 - 4, 2);
                            } else {
                                mFont.o.drawString(nr_eh, String.valueOf(mResources.dQ) + mResources.dK, this.ab + this.ad / 2, n2 + n4 / 2 - 4, 2);
                            }
                        } else if (this.m) {
                            nr_eh.a(15196114);
                            nr_eh.b(ab, n2, this.ad, n4);
                            nr_eh.drawImage((i == this.ah) ? GameScr.ay : GameScr.ax, this.ab + this.ad - 5, n2 + 2, nr_cf.b);
                            ((i == this.ah) ? mFont.tahoma_7b_green2 : mFont.tahoma_7b_dark).drawString(nr_eh, mResources.dP, this.ab + this.ad - 22, n2 + 7, 2);
                            mFont.o.drawString(nr_eh, String.valueOf(mResources.dQ) + mResources.dK, this.ab + 5, n2 + n4 / 2 - 4, 0);
                        } else {
                            mFont.o.drawString(nr_eh, String.valueOf(mResources.dQ) + mResources.dI, this.ab + this.ad / 2, n2 + n4 / 2 - 4, 2);
                        }
                    }
                } else if (i == this.M - 2) {
                    if (b) {
                        nr_eh.a(15196114);
                        nr_eh.b(ab, n2, this.ad, n4);
                        if (!this.aQ) {
                            if (!this.aP) {
                                nr_eh.drawImage((i == this.ah) ? GameScr.ay : GameScr.ax, this.ab + this.ad - 5, n2 + 2, nr_cf.b);
                                ((i == this.ah) ? mFont.tahoma_7b_green2 : mFont.tahoma_7b_dark).drawString(nr_eh, mResources.dS, this.ab + this.ad - 22, n2 + 7, 2);
                                mFont.o.drawString(nr_eh, String.valueOf(mResources.dR) + mResources.dI, this.ab + 5, n2 + n4 / 2 - 4, 0);
                            } else {
                                nr_eh.drawImage((i == this.ah) ? GameScr.ay : GameScr.ax, this.ab + this.ad - 5, n2 + 2, nr_cf.b);
                                ((i == this.ah) ? mFont.tahoma_7b_green2 : mFont.tahoma_7b_dark).drawString(nr_eh, mResources.br, this.ab + this.ad - 22, n2 + 7, 2);
                                mFont.o.drawString(nr_eh, String.valueOf(mResources.dR) + mResources.dK, this.ab + 5, n2 + n4 / 2 - 4, 0);
                            }
                        }
                    } else if (!this.m) {
                        mFont.tahoma_7b_dark.drawString(nr_eh, mResources.dJ, this.ab + this.ad / 2, n2 + n4 / 2 - 4, 2);
                    } else {
                        mFont.tahoma_7b_dark.drawString(nr_eh, mResources.dL, this.ab + this.ad / 2, n2 + n4 / 2 - 4, 2);
                    }
                } else if (i == this.M - 3) {
                    mGraphics nr_eh2;
                    int n7;
                    if (this.aP) {
                        nr_eh2 = nr_eh;
                        n7 = 13748667;
                    } else {
                        nr_eh2 = nr_eh;
                        n7 = ((i == this.ah) ? 16383818 : 15196114);
                    }
                    nr_eh2.a(n7);
                    nr_eh.b(n, n2, n3, n4);
                    mGraphics nr_eh3;
                    int n8;
                    if (this.aP) {
                        nr_eh3 = nr_eh;
                        n8 = 13748667;
                    } else {
                        nr_eh3 = nr_eh;
                        n8 = ((i == this.ah) ? 7300181 : 9993045);
                    }
                    nr_eh3.a(n8);
                    nr_eh.b(ab, n5, 34, n6);
                    nr_eh.drawImage(Panel.u, ab + 17, n5 + n6 / 2, 3);
                    mFont.m.drawString(nr_eh, String.valueOf(NinjaUtil.a((long) (b ? this.aO : this.l))) + " " + mResources.bz, n + 5, n2 + 11, 0);
                    mFont.r.drawString(nr_eh, mResources.dT, n + 5, n2, 0);
                } else {
                    if (nr_ef.size() == 0) {
                        return;
                    }
                    mGraphics nr_eh4;
                    int n9;
                    if (this.aP) {
                        nr_eh4 = nr_eh;
                        n9 = 13748667;
                    } else {
                        nr_eh4 = nr_eh;
                        n9 = ((i == this.ah) ? 16383818 : 15196114);
                    }
                    nr_eh4.a(n9);
                    nr_eh.b(n, n2, n3, n4);
                    mGraphics nr_eh5;
                    int n10;
                    if (this.aP) {
                        nr_eh5 = nr_eh;
                        n10 = 13748667;
                    } else {
                        nr_eh5 = nr_eh;
                        n10 = ((i == this.ah) ? 9541120 : 9993045);
                    }
                    nr_eh5.a(n10);
                    final Item h1;
                    if ((h1 = (Item) nr_ef.elementAt(i)) != null) {
                        for (int j = 0; j < h1.itemOption.length; ++j) {
                            final byte g;
                            final int f;
                            if (h1.itemOption[j].optionTemplate.id == 72 && h1.itemOption[j].param > 0 && (f = f(g = g(h1.itemOption[j].param))) != -1) {
                                mGraphics nr_eh6;
                                int f2;
                                if (this.aP) {
                                    nr_eh6 = nr_eh;
                                    f2 = 13748667;
                                } else {
                                    nr_eh6 = nr_eh;
                                    final int ah = this.ah;
                                    f2 = f(g);
                                }
                                nr_eh6.a(f2);
                            }
                        }
                    }
                    nr_eh.b(ab, n5, 34, n6);
                    if (h1 != null) {
                        String string = "";
                        mFont nr_dc = nro.mFont.m;
                        if (h1.itemOption != null) {
                            for (int k = 0; k < h1.itemOption.length; ++k) {
                                if (h1.itemOption[k].optionTemplate.id == 72) {
                                    string = " [+" + h1.itemOption[k].param + "]";
                                }
                                if (h1.itemOption[k].optionTemplate.id == 41) {
                                    if (h1.itemOption[k].param == 1) {
                                        nr_dc = h(0);
                                    } else if (h1.itemOption[k].param == 2) {
                                        nr_dc = h(2);
                                    } else if (h1.itemOption[k].param == 3) {
                                        nr_dc = h(8);
                                    } else if (h1.itemOption[k].param == 4) {
                                        nr_dc = h(7);
                                    }
                                }
                            }
                        }
                        nr_dc.drawString(nr_eh, String.valueOf(h1.template.name) + string, n + 5, n2 + 1, 0);
                        String s = "";
                        if (h1.itemOption != null) {
                            if (h1.itemOption.length > 0 && h1.itemOption[0] != null) {
                                s = String.valueOf(s) + h1.itemOption[0].getOptionString();
                            }
                            mFont nr_dc2 = nro.mFont.q;
                            if (h1.compare < 0 && h1.template.type != 5) {
                                nr_dc2 = nro.mFont.p;
                            }
                            if (h1.itemOption.length > 1) {
                                for (int l = 1; l < h1.itemOption.length; ++l) {
                                    if (h1.itemOption[l] != null && h1.itemOption[l].optionTemplate.id != 102 && h1.itemOption[l].optionTemplate.id != 107) {
                                        s = String.valueOf(s) + "," + h1.itemOption[l].getOptionString();
                                    }
                                }
                            }
                            nr_dc2.drawString(nr_eh, s, n + 5, n2 + 11, 0);
                        }
                        SmallImage.drawSmallImage(nr_eh, h1.template.iconID, ab + 17, n5 + n6 / 2, 0, 3);
                        if (h1.itemOption != null) {
                            for (int n11 = 0; n11 < h1.itemOption.length; ++n11) {
                                this.a(nr_eh, h1.itemOption[n11].optionTemplate.id, ab, n5, n6);
                            }
                            for (int n12 = 0; n12 < h1.itemOption.length; ++n12) {
                                a(nr_eh, h1.itemOption[n12].optionTemplate.id, h1.itemOption[n12].param, ab, n5, 34, n6);
                            }
                        }
                        if (h1.quantity > 1) {
                            nro.mFont.n.drawString(nr_eh, new StringBuffer().append(h1.quantity).toString(), ab + 34, n5 + n6 - nro.mFont.n.a(), 1);
                        }
                    }
                }
            }
        }
        this.f(nr_eh);
    }

    private void M() {
        this.bN = false;
        if (this.y == 0 && this.B.length == 5 && this.z == 3) {
            this.bN = false;
            int var1;
            if (this.ah == 0) {
                this.aX = new int[this.ce.length];

                for (var1 = 0; var1 < this.aX.length; this.aX[var1] = var1++) {
                    ;
                }

                if (!this.ak) {
                    this.bN = true;
                    return;
                }
            } else if (this.ah != 1) {
                if (this.ai) {
                    return;
                }

                if (this.ah > 0) {
                    this.aX = new int[1];

                    for (var1 = 0; var1 < this.aX.length; this.aX[var1] = var1++) {
                        ;
                    }

                    this.bN = true;
                }
            }
        }

    }

    private void N() {
        try {
            if (this.y == 0 && this.z == 3 && this.B.length == 5) {
                if (this.ah == -1) {
                    return;
                }

                int var1 = 0;
                if (this.ah == 0) {
                    var1 = this.ab + this.ad / 2 - this.ce.length * this.aB / 2;
                    this.bL = (GameCanvas.o - var1) / this.aB;
                } else {
                    this.bC = this.X();
                    if (this.bC != null && this.bC.k != null) {
                        var1 = this.ab + this.ad - 2 - this.bC.k.length * 40;
                        this.bL = (GameCanvas.o - var1) / 40;
                    }
                }

                if (GameCanvas.o < var1) {
                    this.bL = -1;
                    return;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    private void O() {
        if (this.M > 0) {
            boolean var1 = false;
            if (GameCanvas.i[2]) {
                var1 = true;
                --this.ah;
                if (this.y == 24) {
                    this.ah -= 2;
                    if (this.ah < 0) {
                        this.ah = 0;
                    }
                } else if (this.ah < 0) {
                    if (this.equals(GameCanvas.panel) && this.bH == 2 && this.z <= 3 && this.I[this.z] > 1) {
                        InfoDlg.a();
                        if (this.J[this.z] <= 0) {
                            Service.gI().kigui((byte) 4, -1, (byte) this.z, this.I[this.z] - 1, -1);
                            return;
                        }

                        Service.gI().kigui((byte) 4, -1, (byte) this.z, this.J[this.z] - 1, -1);
                        return;
                    }

                    this.ah = this.M - 1;
                    if (this.bN) {
                        this.ah = -1;
                    }

                    if (this.di > 0) {
                        this.ah = -1;
                    }
                }

                this.bn[this.z] = this.ah;
                this.bL = 0;
                this.M();
            } else if (GameCanvas.i[8]) {
                var1 = true;
                ++this.ah;
                if (this.y == 24) {
                    this.ah += 2;
                    if (this.ah > this.M - 1) {
                        this.ah = this.M - 1;
                    }
                } else if (this.ah > this.M - 1) {
                    if (this.equals(GameCanvas.panel) && this.bH == 2 && this.z <= 3 && this.I[this.z] > 1) {
                        InfoDlg.a();
                        if (this.J[this.z] >= this.I[this.z] - 1) {
                            Service.gI().kigui((byte) 4, -1, (byte) this.z, 0, -1);
                            return;
                        }

                        Service.gI().kigui((byte) 4, -1, (byte) this.z, this.J[this.z] + 1, -1);
                        return;
                    }

                    this.ah = 0;
                }

                this.bn[this.z] = this.ah;
                this.bL = 0;
                this.M();
            }

            if (var1) {
                this.f = this.ah * this.aA - this.ae / 2;
                if (this.f > this.aF) {
                    this.f = this.aF;
                }

                if (this.f < 0) {
                    this.f = 0;
                }

                this.g = this.f;
            }

            int var2;
            int var3;
            if (GameCanvas.k) {
                this.cc = false;
                if (!this.bR && GameCanvas.b(this.ab, this.ac, this.ad, this.ae)) {
                    for (var3 = 0; var3 < this.bQ.length; ++var3) {
                        this.bQ[0] = GameCanvas.p;
                    }

                    this.bP = GameCanvas.p;
                    this.bR = true;
                    this.bS = this.bU != 0;
                    this.bU = 0;
                } else if (this.bR) {
                    ++this.bO;
                    if (this.bO > 5 && this.bP == GameCanvas.p && !this.bS) {
                        this.bP = -1000;
                        this.ah = (this.f + GameCanvas.p - this.ac) / this.aA;
                        if (this.ah >= this.M) {
                            this.ah = -1;
                        }

                        this.N();
                    }

                    if ((var3 = GameCanvas.p - this.bQ[0]) != 0 && this.ah != -1) {
                        this.ah = -1;
                        this.bL = -1;
                    }

                    for (var2 = this.bQ.length - 1; var2 > 0; --var2) {
                        this.bQ[var2] = this.bQ[var2 - 1];
                    }

                    this.bQ[0] = GameCanvas.p;
                    this.f -= var3;
                    if (this.f < 0) {
                        this.f = 0;
                    }

                    if (this.f > this.aF) {
                        this.f = this.aF;
                    }

                    if (this.g < 0 || this.g > this.aF) {
                        var3 /= 2;
                    }

                    this.g -= var3;
                }
            }

            if (GameCanvas.m && this.bR) {
                this.cc = true;
                var3 = GameCanvas.p - this.bQ[0];
                GameCanvas.m = false;
                if (Res.g(var3) < 20 && Res.g(GameCanvas.p - this.bP) < 20 && !this.bS) {
                    this.bU = 0;
                    this.f = this.g;
                    this.bP = -1000;
                    this.ah = (this.f + GameCanvas.p - this.ac) / this.aA;
                    if (this.ah >= this.M) {
                        this.ah = -1;
                    }

                    this.N();
                    this.bO = 0;
                    this.bT = 10;
                    SoundMn.gI();
                } else if (this.ah != -1 && this.bO > 5) {
                    this.bO = 0;
                    this.bT = 1;
                } else if (this.ah == -1 && !this.bS) {
                    if (this.g < 0) {
                        this.f = 0;
                    } else if (this.g > this.aF) {
                        this.f = this.aF;
                    } else {
                        byte var4;
                        if ((var2 = GameCanvas.p - this.bQ[0] + (this.bQ[0] - this.bQ[1]) + (this.bQ[1] - this.bQ[2])) > 10) {
                            var4 = 10;
                        } else if (var2 < -10) {
                            var4 = -10;
                        } else {
                            var4 = 0;
                        }

                        this.bU = -var4 * 100;
                    }
                }

                if (this.aw() && GameCanvas.p < this.ac + 21) {
                    this.ah = 0;
                    this.ax();
                }

                this.bR = false;
                this.bO = 0;
                GameCanvas.m = false;
            }

        }
    }

    private void P() {
        this.M = this.ck.length;
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

    }

    private void Q() {
        SoundMn.gI();
        SoundMn.getSoundOption();
        this.M = strTool.length;
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

    }

    public final void v() {
        if (this.ai) {
            this.M = this.N == null ? 2 : this.N.length + 2;
            this.cf = mResources.dm;
        } else if (this.ak) {
            this.al = "";
            this.M = (this.O == null ? this.P.size() : this.O.size()) + 2;
            this.cf = mResources.db + " " + (this.bB != null ? this.bB.c : Char.myCharz().ai.c);
        } else if (this.aj) {
            this.M = nr_bx.l.size() + 2;
            this.cf = mResources.Z;
            this.al = "";
        }

        if (Char.myCharz().ai == null) {
            this.ce = new String[][]{mResources.dg, mResources.df};
        } else if (!this.ak) {
            if (this.P.size() > 1) {
                this.ce = new String[][]{mResources.dd, mResources.dj, mResources.dc};
            } else {
                this.ce = new String[][]{mResources.dc};
            }
        } else if (Char.myCharz().aj > 0) {
            this.ce = new String[][]{mResources.aa, mResources.de};
        } else if (this.P.size() > 1) {
            this.ce = new String[][]{mResources.aa, mResources.de, mResources.dh, mResources.di};
        } else {
            this.ce = new String[][]{mResources.aa, mResources.dh, mResources.di};
        }

        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

    }

    public final void w() {
        GameScr.aV = false;
        this.aA = 24;
        if (this.bn != null && this.bn[3] == 0) {
            this.bn[3] = -1;
        }

        this.M = 2;
        if (Char.myCharz().ai != null) {
            this.aj = true;
            this.ak = false;
            this.ai = false;
        } else {
            this.aj = false;
            this.ak = false;
            this.ai = true;
        }

        if (Char.myCharz().ai != null) {
            this.M = nr_bx.l.size() + 2;
        }

        this.v();
        this.bL = -1;
        if (this.o == null) {
            this.o = new nr_cm();
            this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
            this.o.a();
            this.o.c = GameCanvas.panel;
        }

        if (Char.myCharz().ai == null) {
            this.al = mResources.dG;
            Service.gI().searchClan("");
        }

        this.ah = this.bn[this.z];
        if (GameCanvas.isTouch) {
            this.ah = -1;
        }

    }

    public final void x() {
        this.M = this.bE.size() + 1;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.h = this.aH = 0;
    }

    public final void y() {
        this.aA = 24;
        if (this.z == this.aW.length - 1 && GameCanvas.panel2 == null && this.bH != 2) {
            this.M = this.i(Char.myCharz().arrItemBody.length + Char.myCharz().arrItemBag.length);
        } else {
            this.M = Char.myCharz().aI[this.z].length;
        }

        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    private void R() {
        this.aA = 30;
        this.M = Char.myCharz().aw.b.length + 6;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.aF;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    private void S() {
        this.aA = 24;
        this.M = GameScr.gI().R.length;
        this.aF = this.M * this.aA - this.ae;
        this.g = this.f = 0;
        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    private void T() {
        this.M = this.i(Char.myCharz().aF.length);
        this.aA = 24;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 9;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    private void U() {
        this.aA = 30;
        Item[] var1 = Char.myPetz().arrItemBody;
        Skill[] var2 = Char.myPetz().arrPetSkill;
        this.M = var1.length + var2.length;
        this.aF = this.M * this.aA - this.ae;
        this.g = this.f = this.aG[this.z];
        if (this.aF < 0) {
            this.aF = 0;
        }

        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = 0;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    private void b(boolean var1) {
        this.M = this.i(Char.myCharz().arrItemBody.length + Char.myCharz().arrItemBag.length);
        this.aA = 24;
        this.aF = this.M * this.aA - this.ae;
        this.g = this.f = this.aG[this.z];
        if (this.aF < 0) {
            this.aF = 0;
        }

        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = 0;
        }

        if (var1) {
            this.ah = GameCanvas.isTouch ? -1 : 0;
        }

    }

    private void V() {
        if (this.bK > 0) {
            --this.bK;
        }

        if (this.cc && this.equals(GameCanvas.panel) && this.bH == 2 && this.I[this.z] > 1) {
            if (this.g < -50) {
                InfoDlg.a();
                this.cc = false;
                if (this.J[this.z] <= 0) {
                    Service.gI().kigui((byte) 4, -1, (byte) this.z, this.I[this.z] - 1, -1);
                } else {
                    Service.gI().kigui((byte) 4, -1, (byte) this.z, this.J[this.z] - 1, -1);
                }
            } else if (this.g > this.aF + 50) {
                this.cc = false;
                InfoDlg.a();
                if (this.J[this.z] >= this.I[this.z] - 1) {
                    Service.gI().kigui((byte) 4, -1, (byte) this.z, 0, -1);
                } else {
                    Service.gI().kigui((byte) 4, -1, (byte) this.z, this.J[this.z] + 1, -1);
                }
            }
        }

        if (this.h != this.aH && !this.bR) {
            this.ch = this.aH - this.h << 2;
            this.ci += this.ch;
            this.h += this.ci >> 3;
            this.ci &= 15;
        }

        if (Math.abs(this.aH - this.h) < 10) {
            this.h = this.aH;
        }

        if (this.cy) {
            this.cy = false;
            this.aH = this.ad;
        }

        if (this.aH >= this.ad - 10 && this.h >= this.ad - 10 && this.bF == 0) {
            this.a = false;
            this.Z();
            if (this.cD) {
                this.cD = false;
                if (Char.myCharz().cHP > 0 && Char.myCharz().statusMe != 14) {
                    InfoDlg.a();
                    if (this.y == 3) {
                        Service.gI().f(this.ah);
                    } else if (this.y == 14) {
                        Service.gI().requestMapSelect(this.ah);
                    }
                }
            }

            if (this.cj) {
                this.cj = false;
                ((Command) this.Q.elementAt(this.ah)).performAction();
            }

            this.Q.removeAllElements();
            this.Z = null;
        }

        if (this.bU != 0 && !this.bR) {
            this.f += this.bU / 100;
            if (this.f < 0) {
                this.f = 0;
            } else if (this.f > this.aF) {
                this.f = this.aF;
            } else {
                this.g = this.f;
            }

            this.bU = this.bU * 9 / 10;
            if (this.bU < 100 && this.bU > -100) {
                this.bU = 0;
            }
        }

        if (this.g != this.f && !this.bR) {
            this.arrItemBag = this.f - this.g << 2;
            this.aD += this.arrItemBag;
            this.g += this.aD >> 4;
            this.aD &= 15;
        }

        this.aG[this.z] = this.g;
    }

    private void b(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        var1.a(0);
        if (this.M != 0) {
            int var2;
            if ((var2 = (this.g + this.ae) / 24 + 1) < this.ae / 24 + 1) {
                var2 = this.ae / 24 + 1;
            }

            if (var2 > this.M) {
                var2 = this.M;
            }

            int var3;
            if ((var3 = this.g / 24) >= var2) {
                var3 = var2 - 1;
            }

            if (var3 < 0) {
                var3 = 0;
            }

            for (var3 = var3; var3 < var2; ++var3) {
                int var4 = this.ab;
                int var5 = this.ac + var3 * this.aA;
                int var6 = this.aA - 1;
                int var7 = this.ab + 24;
                int var8 = this.ac + var3 * this.aA;
                int var9 = this.ad - 24;
                int var10 = this.aA - 1;
                var1.a(var3 == this.ah ? 16383818 : 15196114);
                var1.d(var7, var8, var9, var10);
                var1.a(var3 == this.ah ? 9541120 : 9993045);
                var1.d(var4, var5, 24, var6);
                TopInfo var12;
                if ((var12 = (TopInfo) this.U.elementAt(var3)).b != -1) {
                    SmallImage.drawSmallImage(var1, var12.b, var4, var5, 0, 0);
                } else {
                    Rms var11 = GameScr.x[var12.a];
                    SmallImage.drawSmallImage(var1, var11.a[Char.bB[0][0][0]].a, var4 + var11.a[Char.bB[0][0][0]].b, var5 + var10 - 1, 0, 36);
                }

                var1.e(this.ab, this.ac + this.g, this.ad, this.ae);
                if (var12.g != Char.myCharz().charID) {
                    mFont.h.drawString(var1, var12.e, var7 + 5, var8, 0);
                } else {
                    mFont.a.drawString(var1, var12.e, var7 + 5, var8, 0);
                }

                mFont.q.drawString(var1, var12.f, var7 + var9 - 5, var8 + 11, 1);
                mFont.m.drawString(var1, mResources.bH + ": " + var12.h, var7 + 5, var8 + 11, 0);
            }

            this.f(var1);
        }
    }

    public final void a(mGraphics var1) {
        var1.a(-var1.a(), -var1.b());
        var1.a(-this.h, 0);
        var1.a(this.b, 0);
        Panel var2;
        int var4;
        if (GameCanvas.panel.as != -1) {
            if (this.equals(GameCanvas.panel)) {
                mGraphics var3 = var1;
                var2 = this;
                GameScr.gI();
                GameScr.b(var1);
                mGraphics var6 = var1;
                Panel var5 = this;
                var1.a(-GameScr.j, -GameScr.k);
                int var7;
                if (this.cS < 3) {
                    for (var7 = 0; var7 < GameScr.G.size(); ++var7) {
                        Npc var8;
                        if ((var8 = (Npc) GameScr.G.elementAt(var7)).cW.a == var5.at) {
                            var8.a(var6);
                            if (var8.z != null) {
                                var8.z.a(var6, var8.cx, var8.cy - var8.al - GameCanvas.Z, var8.I);
                            }
                        }
                    }
                }

                GameCanvas.a(var6);
                if (GameCanvas.gameTick % 4 == 0) {
                    var6.drawImage(ItemMap.imageFlare, var5.au - 5, var5.av + 15, 33);
                    var6.drawImage(ItemMap.imageFlare, var5.au + 5, var5.av + 15, 33);
                    var6.drawImage(ItemMap.imageFlare, var5.au, var5.av + 15, 33);
                }

                for (var7 = 0; var7 < nr_cw.v.size(); ++var7) {
                    ((nr_cw) nr_cw.v.elementAt(var7)).a(var6);
                }

                if (this.cS == 0) {
                    for (var4 = 0; var4 < var2.cO.length; ++var4) {
                        SmallImage.drawSmallImage(var3, var2.ax, var2.au, var2.av, 0, 3);
                        if (var2.cY) {
                            SmallImage.drawSmallImage(var3, var2.cZ, var2.cP[var4], var2.cQ[var4], 0, 3);
                        }
                    }
                } else if (this.cS == 1) {
                    if (!this.cY) {
                        SmallImage.drawSmallImage(var1, this.ay, this.au, this.av, 0, 3);
                    } else {
                        for (var4 = 0; var4 < var2.cO.length; ++var4) {
                            SmallImage.drawSmallImage(var3, var2.ax, var2.cP[0], var2.cQ[0], 0, 3);
                            SmallImage.drawSmallImage(var3, var2.cZ, var2.cP[1], var2.cQ[1], 0, 3);
                        }
                    }
                } else if (this.cS == 2) {
                    if (!this.cY) {
                        SmallImage.drawSmallImage(var1, this.ay, this.au, this.av, 0, 3);
                    } else {
                        for (var4 = 0; var4 < var2.cO.length; ++var4) {
                            SmallImage.drawSmallImage(var3, var2.ax, var2.cP[var4], var2.cQ[var4], 0, 3);
                        }
                    }
                } else if (this.cS == 3) {
                    if (!this.cY) {
                        SmallImage.drawSmallImage(var1, this.ay, this.au, this.av, 0, 3);
                    } else {
                        SmallImage.drawSmallImage(var1, this.ax, this.au, this.av, 0, 3);
                    }
                } else {
                    if (this.cS == 4) {
                        if (!this.cY) {
                            if (this.ay != -1) {
                                SmallImage.drawSmallImage(var1, this.ay, this.au, this.av, 0, 3);
                                return;
                            }
                        } else {
                            for (var4 = 0; var4 < var2.da.length; ++var4) {
                                SmallImage.drawSmallImage(var3, var2.da[var4], var2.cP[var4], var2.cQ[var4], 0, 3);
                            }
                        }
                    }

                    return;
                }
            }
        } else {
            nr_cr.c(this.b, 0, this.d, this.e, var1);
            var2 = this;
            var1.e(this.b + 1, 0, this.d - 2, this.ac - 2);
            var1.a(9993045);
            var1.d(this.b, 0, this.d - 2, 50);
            int var10;
            switch (this.y) {
                case 0:
                    if (this.z == 0) {
                        SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                        this.A(var1);
                    }

                    if (this.z == 1) {
                        SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                        this.C(var1);
                    }

                    if (this.z == 2) {
                        SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                        mFont.s.drawString(var1, "Top " + Char.myCharz().w, this.b + 45 + (this.d - 50) / 2, 2, 2);
                        mFont.n.drawString(var1, mResources.eC, this.b + 45 + (this.d - 50) / 2, 14, 2);
                        mFont.s.drawString(var1, NinjaUtil.a(Char.myCharz().cTiemNang), this.b + (GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0) + 45 + (this.d - 50) / 2, 26, 2);
                        mFont.n.drawString(var1, mResources.bI + ": " + NinjaUtil.a(Char.myCharz().cNangdong), this.b + (GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0) + 45 + (this.d - 50) / 2, 38, 2);
                    }

                    if (this.z == 3) {
                        if (this.B.length == 5) {
                            if (Char.myCharz().ai == null) {
                                SmallImage.drawSmallImage(var1, Char.myCharz().d(), 25, 50, 0, 33);
                                mFont.c.drawString(var1, mResources.dn, (this.ad - 50) / 2 + 50, 20, 2);
                            } else {
                                nr_eb var19;
                                if (!this.ak) {
                                    if ((var19 = Char.myCharz().ai) != null) {
                                        SmallImage.drawSmallImage(var1, Char.myCharz().d(), 25, 50, 0, 33);
                                        mFont.c.a(var1, var19.c, 60, 4, 0, mFont.tahoma_7b_dark);
                                        mFont.n.a(var1, mResources.eD + ": " + var19.f, 60, 16, 0, mFont.o);
                                        mFont.n.a(var1, mResources.cQ + ": " + var19.k, 60, 27, 0, mFont.o);
                                        mFont.n.a(var1, mResources.dk + ": " + var19.j, 60, 38, 0, mFont.o);
                                        nr_af.a(var1, var19.d, 60, 38, this.ad - 70, this.aA, mFont.n);
                                    }
                                } else {
                                    var19 = this.bB != null ? this.bB : Char.myCharz().ai;
                                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), 25, 51, 0, 33);
                                    mFont.c.a(var1, var19.c, 60, 4, 0, mFont.tahoma_7b_dark);
                                    mFont.n.a(var1, mResources.db + ": " + var19.g + "/" + var19.h, 60, 16, 0, mFont.o);
                                    mFont.n.a(var1, mResources.cY + ": " + var19.i, 60, 27, 0, mFont.o);
                                    nr_af.a(var1, var19.d, 60, 38, this.ad - 70, this.aA, mFont.n);
                                }
                            }
                        } else {
                            SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                            z(var1);
                        }
                    }

                    if (this.z != 4) {
                        break;
                    }
                case 1:
                    if (this.z == this.aW.length - 1 && GameCanvas.panel2 == null) {
                        SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    } else {
                        int var10002 = this.b + 25;
                        SmallImage.drawSmallImage(var1, Char.myCharz().aS.aN, var10002, 50, 0, 33);
                    }

                    if (this.z == this.aW.length - 1 && GameCanvas.panel2 == null) {
                        this.A(var1);
                    } else if (this.ah < 0) {
                        if (this.bH != 2) {
                            mFont.s.drawString(var1, mResources.en, this.b + 60, 14, 0);
                            mFont.s.drawString(var1, ao, this.b + 60, 26, 0);
                        } else {
                            mFont.s.drawString(var1, mResources.en, this.b + 60, 5, 0);
                            mFont.s.drawString(var1, ao, this.b + 60, 17, 0);
                            mFont.s.drawString(var1, mResources.fK + " " + (this.J[this.z] + 1) + "/" + this.I[this.z], this.b + 60, 29, 0);
                        }
                    } else {
                        Item var16;
                        if (this.z >= 0 && this.z <= Char.myCharz().aI.length - 1 && this.ah >= 0 && this.ah <= Char.myCharz().aI[this.z].length - 1 && (var16 = Char.myCharz().aI[this.z][this.ah]) != null) {
                            if (this.equals(GameCanvas.panel) && this.z <= 3 && this.bH == 2) {
                                mFont.c.drawString(var1, mResources.fK + " " + (this.J[this.z] + 1) + "/" + this.I[this.z], this.b + 55, 4, 0);
                            }

                            mFont.c.drawString(var1, var16.template.name, this.b + 55, 24, 0);
                            String var9 = mResources.cq + " " + Res.a((long) var16.template.strRequire);
                            if ((long) var16.template.strRequire > Char.myCharz().cPower) {
                                mFont.n.drawString(var1, var9, this.b + 55, 35, 0);
                            } else {
                                mFont.r.drawString(var1, var9, this.b + 55, 35, 0);
                            }
                        }
                    }
                    break;
                case 2:
                    if (this.z == 0) {
                        SmallImage.drawSmallImage(var1, 526, this.b + 25, 50, 0, 33);
                        String var13 = mResources.cs + ": " + this.L + "/" + Char.myCharz().aF.length + " " + mResources.ct;
                        mFont.c.drawString(var1, mResources.bZ, 60, 4, 0);
                        mFont.n.drawString(var1, var13, 60, 16, 0);
                    }

                    if (this.z == 1) {
                        SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                        this.C(var1);
                    }
                    break;
                case 3:
                    SmallImage.drawSmallImage(var1, 561, this.b + 25, 50, 0, 33);
                    mFont.c.a(var1, mResources.ch + " " + TileMap.n, 60, 4, 0, mFont.tahoma_7b_dark);
                    mFont.n.a(var1, TileMap.k, 60, 16, 0, mFont.o);
                    mFont.c.drawString(var1, String.valueOf(TileMap.n), 25, 27, 2);
                    break;
                case 4:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    B(var1);
                case 5:
                case 6:
                default:
                    break;
                case 7:
                case 17:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    this.A(var1);
                    break;
                case 8:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    this.A(var1);
                    break;
                case 9:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    this.A(var1);
                    break;
                case 10:
                    if (this.Z != null) {
                        SmallImage.drawSmallImage(var1, this.Z.d(), this.b + 25, 50, 0, 33);
                        this.a(var1, this.Z);
                    }
                    break;
                case 11:
                case 16:
                case 23:
                case 24:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    this.A(var1);
                    break;
                case 12:
                    if (this.z == 0) {
                        var4 = 1410;

                        for (var10 = 0; var10 < GameScr.G.size(); ++var10) {
                            Npc var11;
                            if ((var11 = (Npc) GameScr.G.elementAt(var10)).cW.a == var2.at) {
                                var4 = var11.aN;
                            }
                        }

                        SmallImage.drawSmallImage(var1, var4, var2.b + 25, 50, 0, 33);
                        mGraphics var14 = var1;
                        Panel var15 = var2;
                        if (var2.an != null) {
                            for (var4 = 0; var4 < var15.an.length; ++var4) {
                                mFont.s.drawString(var14, var15.an[var4], var15.b + 45 + (var15.d - 50) / 2, 5 + var4 * 14, 2);
                            }
                        }
                    }

                    if (var2.z == 1) {
                        SmallImage.drawSmallImage(var1, Char.myCharz().d(), var2.b + 25, 50, 0, 33);
                        var2.A(var1);
                    }
                    break;
                case 13:
                    if (this.z == 0 || this.z == 1) {
                        if (this.equals(GameCanvas.panel)) {
                            SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                            mFont.n.a(var1, mResources.el, 60, 4, 0, mFont.o);
                            mFont.n.a(var1, mResources.dM, 60, 16, 0, mFont.o);
                            mFont.n.a(var1, mResources.dN, 60, 27, 0, mFont.o);
                            mFont.n.a(var1, mResources.dO, 60, 38, 0, mFont.o);
                        }

                        if (this.equals(GameCanvas.panel2) && this.Z != null) {
                            SmallImage.drawSmallImage(var1, this.Z.d(), this.b + 25, 50, 0, 33);
                            this.a(var1, this.Z);
                        }
                    }

                    if (this.z == 2 && this.Z != null) {
                        SmallImage.drawSmallImage(var1, this.Z.d(), this.b + 25, 50, 0, 33);
                        this.a(var1, this.Z);
                    }
                    break;
                case 14:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    B(var1);
                    break;
                case 15:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    this.A(var1);
                    break;
                case 18:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    this.A(var1);
                    break;
                case 19:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    z(var1);
                    break;
                case 20:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    z(var1);
                    break;
                case 21:
                    if (this.z == 0) {
                        SmallImage.drawSmallImage(var1, Char.myPetz().d(), this.b + 25, 50, 0, 33);
                        mFont.n.a(var1, mResources.cW + ": " + NinjaUtil.a(Char.myPetz().cPower), this.b + 60, 4, 0, mFont.o);
                        if (Char.myPetz().cPower > 0L) {
                            mFont.n.a(var1, Char.myPetz().me ? Char.myPetz().c() : Char.myPetz().currStrLevel, this.b + 60, 16, 0, mFont.o);
                        }

                        if (Char.myPetz().cDamFull > 0) {
                            mFont.n.a(var1, mResources.eT + " :" + Char.myPetz().cDamFull, this.b + 60, 27, 0, mFont.o);
                        }

                        if (Char.myPetz().cMaxStamina > 0) {
                            mFont.n.a(var1, mResources.eV, this.b + 60, 38, 0, mFont.o);
                            var1.drawImage(GameScr.aF, this.b + 100, 41, 0);
                            var4 = Char.myPetz().cStamina * mGraphics.getImageWidth(GameScr.arrItemBag) / Char.myPetz().cMaxStamina;
                            var1.e(100, this.b + 41, var4, 20);
                            var1.drawImage(GameScr.arrItemBag, this.b + 100, 41, 0);
                        }

                        var1.e(0, 0, GameCanvas.z, GameCanvas.A);
                    }

                    if (this.z == 1) {
                        SmallImage.drawSmallImage(var1, Char.myPetz().d(), this.b + 25, 50, 0, 33);
                        mFont.c.a(var1, "HP: " + Char.myPetz().cHP + "/" + Char.myPetz().cHPFull, this.b + 60, 4, 0, mFont.tahoma_7b_dark);
                        mFont.c.a(var1, "MP: " + Char.myPetz().cMP + "/" + Char.myPetz().cMPFull, this.b + 60, 16, 0, mFont.tahoma_7b_dark);
                        mFont.n.a(var1, mResources.eW + ": " + Char.myPetz().cCriticalFull + "   " + mResources.eU + ": " + Char.myPetz().cDefull, this.b + 60, 27, 0, mFont.o);
                        mFont.n.a(var1, mResources.r + " :" + this.ck[Char.myPetz().petStatus], this.b + 60, 38, 0, mFont.o);
                    }

                    if (this.z == 2) {
                        SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                        this.C(var1);
                    }
                    break;
                case 22:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    z(var1);
                    break;
                case 25:
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    this.A(var1);
                    break;
                case 26:
                    SmallImage.drawSmallImage(var1, 561, this.b + 25, 50, 0, 33);
                    SmallImage.drawSmallImage(var1, Char.myCharz().d(), this.b + 25, 50, 0, 33);
                    this.A(var1);
            }

            if (this.y != 13 || this.z != 2 && !this.equals(GameCanvas.panel2)) {
                var1.e(0, 0, GameCanvas.z, GameCanvas.A);
                var1.a(11837316);
                var1.d(this.b + 1, this.e - 15, this.d - 2, 14);
                var1.a(13524492);
                var1.d(this.b + 1, this.e - 15, this.d - 2, 1);
                var1.drawImage(u, this.b + 11, this.e - 7, 3);
                var1.drawImage(w, this.b + 75, this.e - 8, 3);
                mFont.n.a(var1, Char.myCharz().xuStr, this.b + 24, this.e - 13, 0, mFont.o);
                mFont.n.a(var1, Char.myCharz().luongStr, this.b + 85, this.e - 13, 0, mFont.o);
                var1.drawImage(x, this.b + 130, this.e - 8, 3);
                mFont.n.a(var1, Char.myCharz().luongKhoaStr, this.b + 140, this.e - 13, 0, mFont.o);
            }

            this.y(var1);
            switch (this.y) {
                case 0:
                    if (this.z == 0) {
                        this.E(var1);
                    }

                    if (this.z == 1) {
                        this.x(var1);
                    }

                    if (this.z == 2) {
                        this.j(var1);
                    }

                    if (this.z == 3) {
                        if (this.B.length == 4) {
                            this.g(var1);
                        } else {
                            this.u(var1);
                        }
                    }

                    if (this.z == 4) {
                        this.g(var1);
                    }
                    break;
                case 1:
                    this.c(var1);
                    break;
                case 2:
                    if (this.z == 0) {
                        this.o(var1);
                    }

                    if (this.z == 1) {
                        this.x(var1);
                    }
                    break;
                case 3:
                    this.m(var1);
                    break;
                case 4:
                    this.D(var1);
                case 5:
                case 6:
                case 22:
                default:
                    break;
                case 7:
                    this.x(var1);
                    break;
                case 8:
                    this.p(var1);
                    break;
                case 9:
                    this.v(var1);
                    break;
                case 10:
                    this.t(var1);
                    break;
                case 11:
                    this.s(var1);
                    break;
                case 12:
                    if (this.z == 0) {
                        this.w(var1);
                    }

                    if (this.z == 1) {
                        this.x(var1);
                    }
                    break;
                case 13:
                    if (this.z == 0) {
                        if (this.equals(GameCanvas.panel)) {
                            this.x(var1);
                        } else {
                            this.a(var1, false);
                        }
                    }

                    if (this.z == 1) {
                        this.a(var1, true);
                    }

                    if (this.z == 2) {
                        this.a(var1, false);
                    }
                    break;
                case 14:
                    this.k(var1);
                    break;
                case 15:
                    this.b(var1);
                    break;
                case 16:
                    this.r(var1);
                    break;
                case 17:
                    this.c(var1);
                    break;
                case 18:
                    this.q(var1);
                    break;
                case 19:
                    this.F(var1);
                    break;
                case 20:
                    this.G(var1);
                    break;
                case 21:
                    if (this.z == 0) {
                        this.e(var1);
                    }

                    if (this.z == 1) {
                        this.d(var1);
                    }

                    if (this.z == 2) {
                        this.x(var1);
                    }
                    break;
                case 23:
                    this.i(var1);
                    break;
                case 24:
                    this.h(var1);
                    break;
                case 25:
                    this.n(var1);
                    break;
                case 26:
                    this.l(var1);
            }

            GameScr.c(var1);
            if (this.af != null && this.af.d != null) {
                this.af.a(var1);
                var4 = this.af.e + 13;
                var10 = this.af.f + 11;
                if (this.y == 15) {
                    var4 += 5;
                    var10 += 26;
                }

                if (this.y == 0 && this.z == 3) {
                    if (this.ai) {
                        var4 -= 5;
                    } else if (this.bJ != null || this.cC != null) {
                        var4 = this.af.e + 21;
                        var10 = this.af.f + 40;
                    }
                }

                if (this.bJ != null) {
                    Rms var12 = GameScr.x[this.bJ[0]];
                    Rms var17 = GameScr.x[this.bJ[1]];
                    Rms var18 = GameScr.x[this.bJ[2]];
                    SmallImage.drawSmallImage(var1, var12.a[Char.bB[0][0][0]].a, var4 + Char.bB[0][0][1] + var12.a[Char.bB[0][0][0]].b, var10 - Char.bB[0][0][2] + var12.a[Char.bB[0][0][0]].c, 0, 0);
                    SmallImage.drawSmallImage(var1, var17.a[Char.bB[0][1][0]].a, var4 + Char.bB[0][1][1] + var17.a[Char.bB[0][1][0]].b, var10 - Char.bB[0][1][2] + var17.a[Char.bB[0][1][0]].c, 0, 0);
                    SmallImage.drawSmallImage(var1, var18.a[Char.bB[0][2][0]].a, var4 + Char.bB[0][2][1] + var18.a[Char.bB[0][2][0]].b, var10 - Char.bB[0][2][2] + var18.a[Char.bB[0][2][0]].c, 0, 0);
                } else if (this.cC != null) {
                    this.cC.a(var1, var4 + 5, var10 + 25, 1, 0, true);
                } else if (this.bI != -1) {
                    SmallImage.drawSmallImage(var1, this.bI, var4, var10, 0, 3);
                }

                if (this.bA != null && this.bA.template.type != 5) {
                    if (this.bA.compare > 0) {
                        var1.drawImage(aS, var4 - 7, var10 + 13, 3);
                        mFont.h.drawString(var1, String.valueOf(Res.g(this.bA.compare)), var4 + 1, var10 + 8, 0);
                    } else if (this.bA.compare < 0 && this.bA.compare != -1) {
                        var1.drawImage(aT, var4 - 7, var10 + 13, 3);
                        mFont.a.drawString(var1, String.valueOf(Res.g(this.bA.compare)), var4 + 1, var10 + 8, 0);
                    }
                }
            }

            if (this.h == this.aH) {
                this.X.paint(var1);
            }

            if (this.j != null && this.j.k) {
                nr_dk var10001 = this.j;
                this.j.a(var1);
            }
        }

    }

    private void c(mGraphics var1) {
        if (this.y == 1 && this.z == this.aW.length - 1 && GameCanvas.panel2 == null && this.bH != 2) {
            this.x(var1);
        } else {
            var1.a(16711680);
            var1.e(this.ab, this.ac, this.ad, this.ae);
            if (this.bH == 2 && this.equals(GameCanvas.panel)) {
                if (this.z <= 3 && GameCanvas.isTouch) {
                    if (this.g < -50) {
                        GameCanvas.a(this.ab + this.ad / 2, this.ac + 30, var1);
                    } else if (this.g < 0) {
                        mFont.o.drawString(var1, mResources.fL, this.ab + this.ad / 2, this.ac + 15, 2);
                    } else if (this.aF >= 0) {
                        if (this.g > this.aF + 50) {
                            GameCanvas.a(this.ab + this.ad / 2, this.ac + this.ae - 30, var1);
                        } else if (this.g > this.aF) {
                            mFont.o.drawString(var1, mResources.fM, this.ab + this.ad / 2, this.ac + this.ae - 25, 2);
                        }
                    }
                }

                if (Char.myCharz().aI[this.z].length == 0 && this.y != 17) {
                    mFont.o.drawString(var1, mResources.fN, this.ab + this.ad / 2, this.ac + this.ae / 2 - 10, 2);
                    return;
                }
            }

            var1.a(0, -this.g);
            Item[] var2 = Char.myCharz().aI[this.z];
            if (this.bH == 2 && (this.z == 4 || this.y == 17) && (var2 = Char.myCharz().aI[4]).length == 0) {
                mFont.o.drawString(var1, mResources.fN, this.ab + this.ad / 2, this.ac + this.ae / 2 - 10, 2);
            } else {
                int var3 = var2.length;

                for (int var4 = 0; var4 < var3; ++var4) {
                    int var5 = this.ab + 26;
                    int var6 = this.ac + var4 * this.aA;
                    int var7 = this.ad - 26;
                    int var8 = this.aA - 1;
                    int var9 = this.ab;
                    int var10 = this.ac + var4 * this.aA;
                    int var11 = this.aA - 1;
                    if (var6 - this.g <= this.ac + this.ae && var6 - this.g >= this.ac - this.aA) {
                        var1.a(var4 == this.ah ? 16383818 : 15196114);
                        var1.b(var5, var6, var7, var8);
                        var1.a(var4 == this.ah ? 9541120 : 9993045);
                        var1.b(var9, var10, 24, var11);
                        Item var15;
                        if ((var15 = var2[var4]) != null) {
                            String var12 = "";
                            mFont var13 = mFont.m;
                            if (var15.isMe != 0 && this.bH == 2 && this.z <= 3 && !this.equals(GameCanvas.panel2)) {
                                var13 = mFont.h;
                            }

                            if (var15.itemOption != null) {
                                for (int var14 = 0; var14 < var15.itemOption.length; ++var14) {
                                    if (var15.itemOption[var14].optionTemplate.id == 72) {
                                        var12 = " [+" + var15.itemOption[var14].param + "]";
                                    }

                                    if (var15.itemOption[var14].optionTemplate.id == 41) {
                                        if (var15.itemOption[var14].param == 1) {
                                            var13 = h(0);
                                        } else if (var15.itemOption[var14].param == 2) {
                                            var13 = h(2);
                                        } else if (var15.itemOption[var14].param == 3) {
                                            var13 = h(8);
                                        } else if (var15.itemOption[var14].param == 4) {
                                            var13 = h(7);
                                        }
                                    }
                                }
                            }

                            var13.drawString(var1, var15.template.name + var12, var5 + 5, var6 + 1, 0);
                            String var17 = "";
                            if (var15.itemOption != null && var15.itemOption.length > 0) {
                                if (var15.itemOption[0] != null && var15.itemOption[0].optionTemplate.id != 102 && var15.itemOption[0].optionTemplate.id != 107) {
                                    var17 = var17 + var15.itemOption[0].getOptionString();
                                }

                                mFont var16 = mFont.q;
                                if (var15.compare < 0 && var15.template.type != 5) {
                                    var16 = mFont.p;
                                }

                                if (this.bH == 2 && var15.itemOption.length > 1 && var15.buyType != -1) {
                                    var17 = var17;
                                }

                                if (this.bH != 2 || this.bH == 2 && var15.buyType <= 1) {
                                    var16.drawString(var1, var17, var5 + 5, var6 + 11, 0);
                                }
                            }

                            if (var15.l > 0) {
                                SmallImage.drawSmallImage(var1, var15.iconSpec, var5 + var7 - 7, var6 + 9, 0, 3);
                                mFont.b.drawString(var1, Res.a((long) var15.l), var5 + var7 - 15, var6 + 1, 1);
                            }

                            if (var15.j != 0 || var15.k != 0) {
                                if (this.bH != 2 && var15.powerRequire == 0L) {
                                    if (var15.j > 0 && var15.k > 0) {
                                        if (var15.j > 0) {
                                            var1.drawImage(u, var5 + var7 - 7, var6 + 7, 3);
                                            mFont.d.drawString(var1, Res.a((long) var15.j), var5 + var7 - 15, var6 + 1, 1);
                                        }

                                        if (var15.k > 0) {
                                            var1.drawImage(w, var5 + var7 - 7, var6 + 7 + 11, 3);
                                            mFont.h.drawString(var1, Res.a((long) var15.k), var5 + var7 - 15, var6 + 12, 1);
                                        }
                                    } else {
                                        if (var15.j > 0) {
                                            var1.drawImage(u, var5 + var7 - 7, var6 + 7, 3);
                                            mFont.d.drawString(var1, Res.a((long) var15.j), var5 + var7 - 15, var6 + 1, 1);
                                        }

                                        if (var15.k > 0) {
                                            var1.drawImage(w, var5 + var7 - 7, var6 + 7, 3);
                                            mFont.h.drawString(var1, Res.a((long) var15.k), var5 + var7 - 15, var6 + 1, 1);
                                        }
                                    }
                                }

                                if (this.bH == 2 && this.z <= 3 && !this.equals(GameCanvas.panel2)) {
                                    if (var15.j > 0 && var15.k > 0) {
                                        if (var15.j > 0) {
                                            var1.drawImage(u, var5 + var7 - 7, var6 + 7, 3);
                                            mFont.d.drawString(var1, Res.b((long) var15.j), var5 + var7 - 15, var6 + 1, 1);
                                        }

                                        if (var15.k > 0) {
                                            var1.drawImage(w, var5 + var7 - 7, var6 + 7 + 11, 3);
                                            mFont.h.drawString(var1, Res.b((long) var15.k), var5 + var7 - 15, var6 + 12, 1);
                                        }
                                    } else {
                                        if (var15.j > 0) {
                                            var1.drawImage(u, var5 + var7 - 7, var6 + 7, 3);
                                            mFont.d.drawString(var1, Res.b((long) var15.j), var5 + var7 - 15, var6 + 1, 1);
                                        }

                                        if (var15.k > 0) {
                                            var1.drawImage(w, var5 + var7 - 7, var6 + 7, 3);
                                            mFont.h.drawString(var1, Res.b((long) var15.k), var5 + var7 - 15, var6 + 1, 1);
                                        }
                                    }
                                }
                            }

                            SmallImage.drawSmallImage(var1, var15.template.iconID, var9 + 12, var10 + var11 / 2, 0, 3);
                            if (var15.quantity > 1) {
                                mFont.n.drawString(var1, "" + var15.quantity, var9 + 24, var10 + var11 - mFont.n.a(), 1);
                            }

                            if (var15.newItem && GameCanvas.gameTick % 10 > 5) {
                                var1.drawImage(aR, var9 + 12, var6 + 19, 3);
                            }
                        }

                        if (this.bH == 2 && (this.equals(GameCanvas.panel2) || this.z == 4) && var15.buyType != 0) {
                            if (var15.buyType == 1) {
                                mFont.r.drawString(var1, mResources.fH, var5 + var7 - 5, var6 + 1, 1);
                                if (var15.j != -1) {
                                    var1.drawImage(u, var5 + var7 - 7, var6 + 19, 3);
                                    mFont.d.drawString(var1, Res.b((long) var15.j), var5 + var7 - 15, var6 + 13, 1);
                                } else if (var15.k != -1) {
                                    var1.drawImage(x, var5 + var7 - 7, var6 + 17, 3);
                                    mFont.a.drawString(var1, Res.b((long) var15.k), var5 + var7 - 15, var6 + 11, 1);
                                }
                            } else if (var15.buyType == 2) {
                                mFont.b.drawString(var1, mResources.fI, var5 + var7 - 5, var6 + 1, 1);
                                if (var15.j != -1) {
                                    var1.drawImage(u, var5 + var7 - 7, var6 + 17, 3);
                                    mFont.d.drawString(var1, Res.b((long) var15.j), var5 + var7 - 15, var6 + 11, 1);
                                } else if (var15.k != -1) {
                                    var1.drawImage(x, var5 + var7 - 7, var6 + 17, 3);
                                    mFont.a.drawString(var1, Res.b((long) var15.k), var5 + var7 - 15, var6 + 11, 1);
                                }
                            }
                        }
                    }
                }

                this.f(var1);
            }
        }
    }

    private void d(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);

        for (int var2 = 0; var2 < this.ck.length; ++var2) {
            int var3 = this.ab;
            int var4 = this.ac + var2 * this.aA;
            int var5 = this.ad - 1;
            int var6 = this.aA - 1;
            if (var4 - this.g <= this.ac + this.ae && var4 - this.g >= this.ac - this.aA) {
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.d(var3, var4, var5, var6);
                mFont.tahoma_7b_dark.drawString(var1, this.ck[var2], this.ad / 2, var4 + 6, 2);
            }
        }

        this.f(var1);
    }

    private void e(final mGraphics nr_eh) {
        nr_eh.a(16711680);
        nr_eh.e(this.ab, this.ac, this.ad, this.ae);
        nr_eh.a(0, -this.g);
        final Item[] ag = Char.myPetz().arrItemBody;
        final Skill[] ah = Char.myPetz().arrPetSkill;
        for (int i = 0; i < ag.length + ah.length; ++i) {
            final boolean b = i < ag.length;
            final int n = i;
            final int n2 = i - ag.length;
            final int n3 = this.ab + 36;
            final int n4 = this.ac + i * this.aA;
            final int n5 = this.ad - 36;
            final int n6 = this.aA - 1;
            final int ab = this.ab;
            final int n7 = this.ac + i * this.aA;
            final int n8 = this.aA - 1;
            if (n4 - this.g <= this.ac + this.ae && n4 - this.g >= this.ac - this.aA) {
                final Item nr_h = b ? ag[n] : null;
                nr_eh.a((i == this.ah) ? 16383818 : (b ? 15196114 : 15723751));
                nr_eh.b(n3, n4, n5, n6);
                nr_eh.a((i == this.ah) ? 9541120 : (b ? 9993045 : 11837316));
                if (nr_h != null) {
                    for (int j = 0; j < nr_h.itemOption.length; ++j) {
                        final byte g;
                        final int f;
                        if (nr_h.itemOption[j].optionTemplate.id == 72 && nr_h.itemOption[j].param > 0 && (f = f(g = g(nr_h.itemOption[j].param))) != -1) {
                            final int ah2 = this.ah;
                            nr_eh.a(f(g));
                        }
                    }
                }
                nr_eh.b(ab, n7, 34, n8);
                if (nr_h != null && nr_h.isSelect && GameCanvas.panel.y == 12) {
                    nr_eh.a((i == this.ah) ? 7040779 : 6047789);
                    nr_eh.b(ab, n7, 34, n8);
                }
                if (nr_h != null) {
                    String string = "";
                    mFont nr_dc = nro.mFont.m;
                    if (nr_h.itemOption != null) {
                        for (int k = 0; k < nr_h.itemOption.length; ++k) {
                            if (nr_h.itemOption[k].optionTemplate.id == 72) {
                                string = " [+" + nr_h.itemOption[k].param + "]";
                            }
                            if (nr_h.itemOption[k].optionTemplate.id == 41) {
                                if (nr_h.itemOption[k].param == 1) {
                                    nr_dc = h(0);
                                } else if (nr_h.itemOption[k].param == 2) {
                                    nr_dc = h(2);
                                } else if (nr_h.itemOption[k].param == 3) {
                                    nr_dc = h(8);
                                } else if (nr_h.itemOption[k].param == 4) {
                                    nr_dc = h(7);
                                }
                            }
                        }
                    }
                    nr_dc.drawString(nr_eh, String.valueOf(nr_h.template.name) + string, n3 + 5, n4 + 1, 0);
                    String s = "";
                    if (nr_h.itemOption != null) {
                        if (nr_h.itemOption.length > 0 && nr_h.itemOption[0] != null && nr_h.itemOption[0].optionTemplate.id != 102 && nr_h.itemOption[0].optionTemplate.id != 107) {
                            s = String.valueOf(s) + nr_h.itemOption[0].getOptionString();
                        }
                        mFont nr_dc2 = nro.mFont.q;
                        if (nr_h.compare < 0 && nr_h.template.type != 5) {
                            nr_dc2 = nro.mFont.p;
                        }
                        if (nr_h.itemOption.length > 1) {
                            for (int l = 1; l < 2; ++l) {
                                if (nr_h.itemOption[l] != null && nr_h.itemOption[l].optionTemplate.id != 102 && nr_h.itemOption[l].optionTemplate.id != 107) {
                                    s = String.valueOf(s) + "," + nr_h.itemOption[l].getOptionString();
                                }
                            }
                        }
                        nr_dc2.drawString(nr_eh, s, n3 + 5, n4 + 11, 0);
                    }
                    SmallImage.drawSmallImage(nr_eh, nr_h.template.iconID, ab + 17, n7 + n8 / 2, 0, 3);
                    if (nr_h.itemOption != null) {
                        for (int n9 = 0; n9 < nr_h.itemOption.length; ++n9) {
                            this.a(nr_eh, nr_h.itemOption[n9].optionTemplate.id, ab, n7, n8);
                        }
                        for (int n10 = 0; n10 < nr_h.itemOption.length; ++n10) {
                            a(nr_eh, nr_h.itemOption[n10].optionTemplate.id, nr_h.itemOption[n10].param, ab, n7, 34, n8);
                        }
                    }
                    if (nr_h.quantity > 1) {
                        nro.mFont.n.drawString(nr_eh, new StringBuffer().append(nr_h.quantity).toString(), ab + 34, n7 + n8 - nro.mFont.n.a(), 1);
                    }
                } else if (!b) {
                    final Skill nr_bd = ah[n2];
                    nr_eh.drawImage(GameScr.at, ab + 17, n7 + n8 / 2, 3);
                    if (nr_bd.a != null) {
                        mFont.q.drawString(nr_eh, nr_bd.a.b, n3 + 5, n4 + 1, 0);
                        mFont.m.drawString(nr_eh, String.valueOf(mResources.dk) + ": " + nr_bd.c, n3 + 5, n4 + 11, 0);
                        SmallImage.drawSmallImage(nr_eh, nr_bd.a.f, ab + 17, n7 + n8 / 2, 0, 3);
                    } else {
                        mFont.m.drawString(nr_eh, nr_bd.l, n3 + 5, n4 + 5, 0);
                        SmallImage.drawSmallImage(nr_eh, GameScr.y[98].a[0].c, ab + 17, n7 + n8 / 2, 0, 3);
                    }
                }
            }
        }
        this.f(nr_eh);
    }

    private void f(mGraphics var1) {
        var1.a(-var1.a(), -var1.b());
        if (this.g > 24 && this.M > 0 || this.equals(GameCanvas.panel) && this.bH == 2 && this.I[this.z] > 1) {
            var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 1, this.ab + this.ad - 12, this.ac + 3, 0);
        }

        if (this.g < this.aF && this.M > 0 || this.equals(GameCanvas.panel) && this.bH == 2 && this.I[this.z] > 1) {
            var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 0, this.ab + this.ad - 12, this.ac + this.ae - 8, 0);
        }

    }

    private void g(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);

        for (int var2 = 0; var2 < strTool.length; ++var2) {
            int var3 = this.ab;
            int var4 = this.ac + var2 * this.aA;
            int var5 = this.ad - 1;
            int var6 = this.aA - 1;
            if (var4 - this.g <= this.ac + this.ae && var4 - this.g >= this.ac - this.aA) {
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.d(var3, var4, var5, var6);
                mFont.tahoma_7b_dark.drawString(var1, strTool[var2], this.ab + this.ad / 2, var4 + 6, 2);
                if (strTool[var2].equals(mResources.bO)) {
                    for (var5 = 0; var5 < aq.size(); ++var5) {
                        if (!((nr_ay) aq.elementAt(var5)).d) {
                            if (GameCanvas.gameTick % 20 > 10) {
                                var1.drawImage(aR, var3 + 10, var4 + 10, 3);
                            }
                            break;
                        }
                    }
                }
            }
        }

        this.f(var1);
    }

    private void h(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);

        for (int var2 = 0; var2 < cA.length; ++var2) {
            int var3;
            if ((var3 = this.ac + var2 * 15) - this.g <= this.ac + this.ae && var3 - this.g >= this.ac - this.aA) {
                mFont.tahoma_7b_dark.drawString(var1, cA[var2], this.ab + 5, var3 + 6, 0);
            }
        }

        this.f(var1);
    }

    private void i(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);

        for (int var2 = 0; var2 < aq.size(); ++var2) {
            nr_ay var3 = (nr_ay) aq.elementAt(var2);
            int var4 = this.ab;
            int var5 = this.ac + var2 * this.aA;
            int var6 = this.ad - 1;
            int var7 = this.aA - 1;
            if (var5 - this.g <= this.ac + this.ae && var5 - this.g >= this.ac - this.aA) {
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.d(var4, var5, var6, var7);
                mFont.tahoma_7b_dark.drawString(var1, var3.a, this.ab + this.ad / 2, var5 + 6, 2);
                if (!var3.d && GameCanvas.gameTick % 20 > 10) {
                    var1.drawImage(aR, var4 + 10, var5 + 10, 3);
                }
            }
        }

        this.f(var1);
    }

    private void j(mGraphics var1) {
        var1.a(16711680);
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        int var2 = Char.myCharz().aw.b.length;

        for (int var3 = 0; var3 < var2 + 6; ++var3) {
            int var4 = this.ab + 30;
            int var5 = this.ac + var3 * this.aA;
            int var6 = this.ad - 30;
            int var7 = this.aA - 1;
            int var8 = this.ab;
            int var9 = this.ac + var3 * this.aA;
            if (var5 - this.g <= this.ac + this.ae && var5 - this.g >= this.ac - this.aA) {
                var1.a(var3 == this.ah ? 16383818 : 15196114);
                if (var3 == 5) {
                    var1.a(var3 == this.ah ? 16776068 : 16765060);
                }

                var1.d(var4, var5, var6, var7);
                var1.drawImage(GameScr.at, var8, var9, 0);
                String var16;
                if (var3 == 0) {
                    SmallImage.drawSmallImage(var1, 567, var8 + 4, var9 + 4, 0, 0);
                    var16 = mResources.eR + " " + mResources.eh + ": " + NinjaUtil.a((long) Char.myCharz().cp);
                    mFont.b.drawString(var1, var16, var4 + 5, var5 + 3, 0);
                    mFont.m.drawString(var1, NinjaUtil.a((long) (Char.myCharz().cp + 1000)) + " " + mResources.fd + ": " + mResources.eE + " " + Char.myCharz().ct, var4 + 5, var5 + 15, 0);
                }

                if (var3 == 1) {
                    SmallImage.drawSmallImage(var1, 569, var8 + 4, var9 + 4, 0, 0);
                    var16 = mResources.eS + " " + mResources.eh + ": " + NinjaUtil.a((long) Char.myCharz().cq);
                    mFont.b.drawString(var1, var16, var4 + 5, var5 + 3, 0);
                    mFont.m.drawString(var1, NinjaUtil.a((long) (Char.myCharz().cq + 1000)) + " " + mResources.fd + ": " + mResources.eE + " " + Char.myCharz().cu, var4 + 5, var5 + 15, 0);
                }

                if (var3 == 2) {
                    SmallImage.drawSmallImage(var1, 568, var8 + 4, var9 + 4, 0, 0);
                    var16 = mResources.eT + " " + mResources.eh + ": " + NinjaUtil.a((long) Char.myCharz().co);
                    mFont.b.drawString(var1, var16, var4 + 5, var5 + 3, 0);
                    mFont.m.drawString(var1, NinjaUtil.a((long) (Char.myCharz().co * 100)) + " " + mResources.fd + ": " + mResources.eE + " " + Char.myCharz().cv, var4 + 5, var5 + 15, 0);
                }

                if (var3 == 3) {
                    SmallImage.drawSmallImage(var1, 721, var8 + 4, var9 + 4, 0, 0);
                    var16 = mResources.eU + " " + mResources.eh + ": " + NinjaUtil.a((long) Char.myCharz().cr);
                    mFont.b.drawString(var1, var16, var4 + 5, var5 + 3, 0);
                    mFont.m.drawString(var1, NinjaUtil.a((long) (500000 + Char.myCharz().cr * 100000)) + " " + mResources.fd + ": " + mResources.eE + " " + Char.myCharz().cw, var4 + 5, var5 + 15, 0);
                }

                if (var3 == 4) {
                    SmallImage.drawSmallImage(var1, 719, var8 + 4, var9 + 4, 0, 0);
                    var16 = mResources.eW + " " + mResources.eh + ": " + Char.myCharz().cs + "%";
                    int var10;
                    if ((var10 = Char.myCharz().cs) > cl.length - 1) {
                        var10 = cl.length - 1;
                    }

                    long var11 = cl[var10];
                    mFont.b.drawString(var1, var16, var4 + 5, var5 + 3, 0);
                    mFont.m.drawString(var1, Res.b(var11) + " " + mResources.fd + ": " + mResources.eE + " " + Char.myCharz().cxx, var4 + 5, var5 + 15, 0);
                }

                if (var3 == 5) {
                    if (p != null) {
                        SmallImage.drawSmallImage(var1, q, var8 + 4, var9 + 4, 0, 0);
                        String[] var17 = mFont.k.a(p, 120);

                        for (int var19 = 0; var19 < var17.length; ++var19) {
                            mFont.m.drawString(var1, var17[var19], var4 + 5, var5 + 3 + var19 * 12, 0);
                        }
                    } else {
                        mFont.m.drawString(var1, "", var4 + 5, var5 + 9, 0);
                    }
                }

                if (var3 >= 6) {
                    var7 = var3 - 6;
                    nr_en var20 = Char.myCharz().aw.b[var7];
                    SmallImage.drawSmallImage(var1, var20.f, var8 + 4, var9 + 4, 0, 0);
                    Skill var12;
                    Skill var18;
                    if ((var12 = Char.myCharz().a(var20)) != null) {
                        mFont.b.drawString(var1, var20.b, var4 + 5, var5 + 3, 0);
                        mFont.q.drawString(var1, mResources.dk + ": " + var12.c, var4 + var6 - 5, var5 + 3, 1);
                        if (var12.c == var20.c) {
                            mFont.m.drawString(var1, mResources.fb, var4 + 5, var5 + 15, 0);
                        } else {
                            var18 = var20.h[var12.c];
                            mFont.m.drawString(var1, mResources.dk + " " + (var12.c + 1) + " " + mResources.ei + " " + Res.b(var18.d) + " " + mResources.fd, var4 + 5, var5 + 15, 0);
                        }
                    } else {
                        var18 = var20.h[0];
                        mFont.h.drawString(var1, var20.b, var4 + 5, var5 + 3, 0);
                        mFont.m.drawString(var1, mResources.ej + " " + Res.b(var18.d) + " " + mResources.eB, var4 + 5, var5 + 15, 0);
                    }
                }
            }
        }

        this.f(var1);
    }

    private void k(mGraphics var1) {
        var1.a(16711680);
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);

        for (int var2 = 0; var2 < this.C.length; ++var2) {
            int var3 = this.ac + var2 * this.aA;
            int var4 = this.aA - 1;
            if (var3 - this.g <= this.ac + this.ae && var3 - this.g >= this.ac - this.aA) {
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.d(this.ab, var3, this.ad, var4);
                mFont.b.drawString(var1, this.C[var2], 5, var3 + 1, 0);
                mFont.o.drawString(var1, this.D[var2], 5, var3 + 11, 0);
            }
        }

        this.f(var1);
    }

    private void l(mGraphics var1) {
        var1.a(16711680);
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        String[] var2 = nr_c.b;
        String[] var3 = nr_c.c;

        for (int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = this.ab;
            int var6 = this.ac + var4 * this.aA;
            int var7 = this.ad;
            int var8 = this.aA - 1;
            int var9 = this.ab;
            if (var6 - this.g <= this.ac + this.ae && var6 - this.g >= this.ac - this.aA) {
                var1.a(var4 == this.ah ? 16383818 : 15196114);
                var1.b(var5, var6, var7, var8);
                mFont.o.drawString(var1, var2[var4], var9 + 5, var6 + 6, 0);
                mFont.o.drawString(var1, var3[var4], var5 + var7 - 2, var6 + 6, 1);
            }
        }

        this.f(var1);
    }

    private void m(mGraphics var1) {
        var1.a(16711680);
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        int[] var2 = GameScr.gI().R;
        int[] var3 = GameScr.gI().S;

        for (int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = this.ab + 36;
            int var6 = this.ac + var4 * this.aA;
            int var7 = this.ad - 36;
            int var8 = this.aA - 1;
            int var9 = this.ab;
            int var10 = this.ac + var4 * this.aA;
            int var11 = this.aA - 1;
            if (var6 - this.g <= this.ac + this.ae && var6 - this.g >= this.ac - this.aA) {
                var1.a(var4 == this.ah ? 16383818 : 15196114);
                var1.b(var5, var6, var7, var8);
                var1.a(this.cm[var3[var4]]);
                var1.b(var9, var10, 34, var11);
                if (var2[var4] != -1) {
                    if (var3[var4] != 1) {
                        mFont.n.drawString(var1, String.valueOf(var2[var4]), var9 + 17, var6 + 6, 2);
                    } else {
                        mFont.o.drawString(var1, String.valueOf(var2[var4]), var9 + 17, var6 + 6, 2);
                    }

                    mFont.m.drawString(var1, GameScr.gI().T[var4] + "/" + GameScr.gI().U[var4], var5 + 5, var6 + 6, 0);
                }

                if (GameScr.gI().X[var4] != null) {
                    mFont.o.drawString(var1, GameScr.gI().X[var4] + "(Top " + GameScr.gI().V[var4] + ")", var5 + var7 - 2, var6 + 1, 1);
                    mFont.o.drawString(var1, GameScr.gI().Y[var4] + "(Top " + GameScr.gI().W[var4] + ")", var5 + var7 - 2, var6 + 11, 1);
                }
            }
        }

        this.f(var1);
    }

    private void n(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        var1.a(0);
        if (this.M != 0) {
            int var2;
            if ((var2 = (this.g + this.ae) / 24 + 1) < this.ae / 24 + 1) {
                var2 = this.ae / 24 + 1;
            }

            if (var2 > this.M) {
                var2 = this.M;
            }

            int var3;
            if ((var3 = this.g / 24) >= var2) {
                var3 = var2 - 1;
            }

            if (var3 < 0) {
                var3 = 0;
            }

            for (var3 = var3; var3 < var2; ++var3) {
                int var4 = this.ab;
                int var5 = this.ac + var3 * this.aA;
                int var6 = this.aA - 1;
                int var7 = this.ab + 24;
                int var8 = this.ac + var3 * this.aA;
                int var9 = this.ad - 24;
                int var10 = this.aA - 1;
                var1.a(var3 == this.ah ? 16383818 : 15196114);
                var1.b(var7, var8, var9, var10);
                var1.a(var3 == this.ah ? 9541120 : 9993045);
                var1.b(var4, var5, 24, var6);
                SmallImage.drawSmallImage(var1, Char.myCharz().aK[this.z][var3], var4 + 12, var5 + var6 / 2, 0, 3);
                String[] var11 = mFont.o.a(Char.myCharz().aJ[this.z][var3], 140);

                for (var5 = 0; var5 < var11.length; ++var5) {
                    mFont.o.drawString(var1, var11[var5], var7 + 5, var8 + 1 + var5 * 11, 0);
                }
            }

            this.f(var1);
        }
    }

    private void o(final mGraphics nr_eh) {
        nr_eh.a(16711680);
        nr_eh.e(this.ab, this.ac, this.ad, this.ae);
        nr_eh.a(0, -this.g);
        try {
            final Item[] af = Char.myCharz().aF;
            this.M = this.i(af.length);
            final int n = af.length / 20 + ((af.length % 20 > 0) ? 1 : 0);
            this.aC = this.ad / n;
            for (int i = 0; i < this.M; ++i) {
                final int n2 = this.ab + 36;
                final int n3 = this.ac + i * this.aA;
                final int n4 = this.ad - 36;
                final int n5 = this.aA - 1;
                final int ab = this.ab;
                final int n6 = this.ac + i * this.aA;
                final int n7 = this.aA - 1;
                if (n3 - this.g <= this.ac + this.ae && n3 - this.g >= this.ac - this.aA) {
                    if (i == 0) {
                        for (int j = 0; j < n; ++j) {
                            final int n8 = (j == this.bM && this.ah == 0) ? ((GameCanvas.gameTick % 10 < 7) ? -1 : 0) : 0;
                            nr_eh.a((j == this.bM) ? 16383818 : 15723751);
                            nr_eh.d(this.ab + j * this.aC, n3 + 9 + n8, this.aC - 1, 14);
                            mFont.o.drawString(nr_eh, new StringBuffer().append(j).toString(), this.ab + j * this.aC + this.aC / 2, this.ac + 11 + n8, 2);
                        }
                    } else {
                        nr_eh.a((i == this.ah) ? 16383818 : 15196114);
                        nr_eh.d(n2, n3, n4, n5);
                        nr_eh.a((i == this.ah) ? 9541120 : 9993045);
                        final Item nr_h;
                        if ((nr_h = af[c(i, this.bM)]) != null) {
                            for (int k = 0; k < nr_h.itemOption.length; ++k) {
                                final byte g;
                                final int f;
                                if (nr_h.itemOption[k].optionTemplate.id == 72 && nr_h.itemOption[k].param > 0 && (f = f(g = g(nr_h.itemOption[k].param))) != -1) {
                                    final int ah = this.ah;
                                    nr_eh.a(f(g));
                                }
                            }
                        }
                        nr_eh.b(ab, n6, 34, n7);
                        if (nr_h != null) {
                            String string = "";
                            mFont nr_dc = nro.mFont.m;
                            if (nr_h.itemOption != null) {
                                for (int l = 0; l < nr_h.itemOption.length; ++l) {
                                    if (nr_h.itemOption[l].optionTemplate.id == 72) {
                                        string = " [+" + nr_h.itemOption[l].getOptionString() + "]";
                                    }
                                    if (nr_h.itemOption[l].optionTemplate.id == 41) {
                                        if (nr_h.itemOption[l].param == 1) {
                                            nr_dc = h(0);
                                        } else if (nr_h.itemOption[l].param == 2) {
                                            nr_dc = h(2);
                                        } else if (nr_h.itemOption[l].param == 3) {
                                            nr_dc = h(8);
                                        } else if (nr_h.itemOption[l].param == 4) {
                                            nr_dc = h(7);
                                        }
                                    }
                                }
                            }
                            nr_dc.drawString(nr_eh, String.valueOf(nr_h.template.name) + string, n2 + 5, n3 + 1, 0);
                            String s = "";
                            if (nr_h.itemOption != null) {
                                if (nr_h.itemOption.length > 0 && nr_h.itemOption[0] != null) {
                                    s = String.valueOf(s) + nr_h.itemOption[0].getOptionString();
                                }
                                mFont nr_dc2 = nro.mFont.q;
                                if (nr_h.compare < 0 && nr_h.template.type != 5) {
                                    nr_dc2 = nro.mFont.p;
                                }
                                if (nr_h.itemOption.length > 1) {
                                    for (int n9 = 1; n9 < nr_h.itemOption.length; ++n9) {
                                        if (nr_h.itemOption[n9] != null && nr_h.itemOption[n9].optionTemplate.id != 102 && nr_h.itemOption[n9].optionTemplate.id != 107) {
                                            s = String.valueOf(s) + "," + nr_h.itemOption[n9].getOptionString();
                                        }
                                    }
                                }
                                nr_dc2.drawString(nr_eh, s, n2 + 5, n3 + 11, 0);
                            }
                            SmallImage.drawSmallImage(nr_eh, nr_h.template.iconID, ab + 17, n6 + n7 / 2, 0, 3);
                            if (nr_h.itemOption != null) {
                                for (int n10 = 0; n10 < nr_h.itemOption.length; ++n10) {
                                    this.a(nr_eh, nr_h.itemOption[n10].optionTemplate.id, ab, n6, n7);
                                }
                                for (int n11 = 0; n11 < nr_h.itemOption.length; ++n11) {
                                    a(nr_eh, nr_h.itemOption[n11].optionTemplate.id, nr_h.itemOption[n11].param, ab, n6, 34, n7);
                                }
                            }
                            if (nr_h.quantity > 1) {
                                nro.mFont.n.drawString(nr_eh, new StringBuffer().append(nr_h.quantity).toString(), ab + 34, n6 + n7 - nro.mFont.n.a(), 1);
                            }
                        }
                    }
                }
            }
        } catch (final Exception ex) {
        }
        this.f(nr_eh);
    }

    private nr_e W() {
        return this.ah < 2 ? null : (this.ah > (this.O != null ? this.O.size() : this.P.size()) + 1 ? null : (this.O != null ? (nr_e) this.O.elementAt(this.ah - 2) : (nr_e) this.P.elementAt(this.ah - 2)));
    }

    private nr_bx X() {
        return this.ah < 2 ? null : (this.ah > nr_bx.l.size() + 1 ? null : (nr_bx) nr_bx.l.elementAt(this.ah - 2));
    }

    private nr_eb Y() {
        return this.ah < 2 ? null : (this.ah > this.N.length + 1 ? null : this.N[this.ah - 2]);
    }

    private void p(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        var1.a(0);
        if (this.bE.size() == 0) {
            mFont.m.drawString(var1, mResources.ab, this.ab + this.ad / 2, this.ac + this.ae / 2 - mFont.k.a() / 2 + 24, 2);
        }

        for (int var2 = 0; var2 < this.M; ++var2) {
            int var3 = this.ab;
            int var4 = this.ac + var2 * this.aA;
            int var5 = this.aA - 1;
            int var6 = this.ab + 24;
            int var7 = this.ac + var2 * this.aA;
            int var8 = this.ad - 24;
            int var9 = this.aA - 1;
            if (var2 == 0) {
                var1.a(15196114);
                var1.b(var3, var7, this.ad, var9);
                var1.drawImage(var2 == this.ah ? GameScr.ay : GameScr.ax, this.ab + this.ad - 5, var7 + 2, nr_cf.b);
                (var2 == this.ah ? mFont.tahoma_7b_green2 : mFont.tahoma_7b_dark).drawString(var1, this.ar ? mResources.fr : mResources.fs, this.ab + this.ad - 22, var7 + 7, 2);
                mFont.o.drawString(var1, this.ar ? mResources.fu : mResources.fv, this.ab + 5, var7 + var9 / 2 - 4, 0);
            } else {
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.b(var6, var7, var8, var9);
                var1.a(var2 == this.ah ? 9541120 : 9993045);
                var1.b(var3, var4, 24, var5);
                nr_r var10;
                if ((var10 = (nr_r) this.bE.elementAt(var2 - 1)).c.headICON != -1) {
                    SmallImage.drawSmallImage(var1, var10.c.headICON, var3, var4, 0, 0);
                } else {
                    Rms var11 = GameScr.x[var10.c.head];
                    SmallImage.drawSmallImage(var1, var11.a[Char.bB[0][0][0]].a, var3 + var11.a[Char.bB[0][0][0]].b, var4 + var11.a[Char.bB[0][0][0]].c, 0, 0);
                }

                var1.e(this.ab, this.ac + this.g, this.ad, this.ae);
                mFont var12 = mFont.tahoma_7b_green2;
                mFont.tahoma_7b_green2.drawString(var1, var10.c.cName, var6 + 5, var7, 0);
                if (!var10.d) {
                    mFont.q.drawString(var1, Res.a(var10.a, "|", 0)[2], var6 + 5, var7 + 11, 0);
                } else {
                    mFont.p.drawString(var1, Res.a(var10.a, "|", 0)[2], var6 + 5, var7 + 11, 0);
                }
            }
        }

        this.f(var1);
    }

    private void q(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        var1.a(0);

        for (int var2 = 0; var2 < this.M; ++var2) {
            int var3 = this.ab + 26;
            int var4 = this.ac + var2 * this.aA;
            int var5 = this.ad - 26;
            int var6 = this.aA - 1;
            int var7 = this.ab;
            int var8 = this.ac + var2 * this.aA;
            int var9 = this.aA - 1;
            if (var4 - this.g <= this.ac + this.ae && var4 - this.g >= this.ac - this.aA) {
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.b(var3, var4, var5, var6);
                var1.a(var2 == this.ah ? 9541120 : 9993045);
                var1.b(var7, var8, 24, var9);
                Item var11;
                if ((var11 = (Item) this.W.elementAt(var2)) != null) {
                    mFont.m.drawString(var1, var11.template.name, var3 + 5, var4 + 1, 0);
                    String var12 = "";
                    if (var11.itemOption != null && var11.itemOption.length > 0) {
                        if (var11.itemOption[0] != null && var11.itemOption[0].optionTemplate.id != 102 && var11.itemOption[0].optionTemplate.id != 107) {
                            var12 = var12 + var11.itemOption[0].getOptionString();
                        }

                        mFont var10 = mFont.q;
                        mFont.q.drawString(var1, var12, var3 + 5, var4 + 11, 0);
                        SmallImage.drawSmallImage(var1, var11.template.iconID, var7 + 12, var8 + var9 / 2, 0, 3);
                    }
                }
            }
        }

        this.f(var1);
    }

    private void r(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        var1.a(0);
        if (this.M == 0) {
            mFont.m.drawString(var1, mResources.fz, this.ab + this.ad / 2, this.ac + this.ae / 2 - mFont.k.a() / 2, 2);
        } else {
            for (int var2 = 0; var2 < this.M; ++var2) {
                int var3 = this.ab;
                int var4 = this.ac + var2 * this.aA;
                int var5 = this.aA - 1;
                int var6 = this.ab + 24;
                int var7 = this.ac + var2 * this.aA;
                int var8 = this.ad - 24;
                int var9 = this.aA - 1;
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.b(var6, var7, var8, var9);
                var1.a(var2 == this.ah ? 9541120 : 9993045);
                var1.b(var3, var4, 24, var5);
                nr_r var10;
                if ((var10 = (nr_r) this.vEnemy.elementAt(var2)).c.headICON != -1) {
                    SmallImage.drawSmallImage(var1, var10.c.headICON, var3, var4, 0, 0);
                } else {
                    Rms var11 = GameScr.x[var10.c.head];
                    SmallImage.drawSmallImage(var1, var11.a[Char.bB[0][0][0]].a, var3 + var11.a[Char.bB[0][0][0]].b, var4 + 3 + var11.a[Char.bB[0][0][0]].c, 0, 0);
                }

                var1.e(this.ab, this.ac + this.g, this.ad, this.ae);
                if (var10.e) {
                    mFont.h.drawString(var1, var10.c.cName, var6 + 5, var7, 0);
                    mFont.q.drawString(var1, var10.a, var6 + 5, var7 + 11, 0);
                } else {
                    mFont.o.drawString(var1, var10.c.cName, var6 + 5, var7, 0);
                    mFont.o.drawString(var1, var10.a, var6 + 5, var7 + 11, 0);
                }
            }

            this.f(var1);
        }
    }

    private void s(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        var1.a(0);
        if (this.M == 0) {
            mFont.m.drawString(var1, mResources.bL, this.ab + this.ad / 2, this.ac + this.ae / 2 - mFont.k.a() / 2, 2);
        } else {
            for (int var2 = 0; var2 < this.M; ++var2) {
                int var3 = this.ab;
                int var4 = this.ac + var2 * this.aA;
                int var5 = this.aA - 1;
                int var6 = this.ab + 24;
                int var7 = this.ac + var2 * this.aA;
                int var8 = this.ad - 24;
                int var9 = this.aA - 1;
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.b(var6, var7, var8, var9);
                var1.a(var2 == this.ah ? 9541120 : 9993045);
                var1.b(var3, var4, 24, var5);
                nr_r var10;
                if ((var10 = (nr_r) this.R.elementAt(var2)).c.headICON != -1) {
                    SmallImage.drawSmallImage(var1, var10.c.headICON, var3, var4, 0, 0);
                } else {
                    Rms var11 = GameScr.x[var10.c.head];
                    SmallImage.drawSmallImage(var1, var11.a[Char.bB[0][0][0]].a, var3 + var11.a[Char.bB[0][0][0]].b, var4 + 3 + var11.a[Char.bB[0][0][0]].c, 0, 0);
                }

                var1.e(this.ab, this.ac + this.g, this.ad, this.ae);
                if (var10.e) {
                    mFont.h.drawString(var1, var10.c.cName, var6 + 5, var7, 0);
                    mFont.q.drawString(var1, var10.a, var6 + 5, var7 + 11, 0);
                } else {
                    mFont.o.drawString(var1, var10.c.cName, var6 + 5, var7, 0);
                    mFont.o.drawString(var1, var10.a, var6 + 5, var7 + 11, 0);
                }
            }

            this.f(var1);
        }
    }

    private void t(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);

        for (int var2 = 0; var2 < this.Q.size(); ++var2) {
            int var3 = this.ab;
            int var4 = this.ac + var2 * this.aA;
            int var5 = this.ad - 1;
            int var6 = this.aA - 1;
            if (var4 - this.g <= this.ac + this.ae && var4 - this.g >= this.ac - this.aA) {
                Command var7 = (Command) this.Q.elementAt(var2);
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.b(var3, var4, var5, var6);
                if (var7.caption2.equals("")) {
                    mFont.tahoma_7b_dark.drawString(var1, var7.caption, this.ab + this.ad / 2, var4 + 6, 2);
                } else {
                    mFont.tahoma_7b_dark.drawString(var1, var7.caption, this.ab + this.ad / 2, var4 + 1, 2);
                    mFont.tahoma_7b_dark.drawString(var1, var7.caption2, this.ab + this.ad / 2, var4 + 11, 2);
                }
            }
        }

        this.f(var1);
    }

    private void u(final mGraphics nr_eh) {
        try {
            nr_eh.e(this.ab, this.ac, this.ad, this.ae);
            nr_eh.a(-this.h, -this.g);
            nr_eh.a(0);
            final int n = this.ab + this.ad / 2 - this.ce.length * this.aB / 2;
            if (this.M == 2) {
                mFont.m.drawString(nr_eh, this.al, this.ab + this.ad / 2, this.ac + 24 + this.ae / 2 - mFont.k.a() / 2, 2);
                if (this.aj && this.P.size() == 1) {
                    for (int i = 0; i < mResources.fd_array_2.length; ++i) {
                        mFont.tahoma_7b_dark.drawString(nr_eh, mResources.fd_array_2[i], this.ab + this.ad / 2, this.ac + 24 + this.ae / 2 - mResources.fd_array_2.length * 12 / 2 + i * 12, 2);
                    }
                }
            }
            if (this.aj) {
                this.M = nr_bx.l.size() + 2;
            }
            for (int j = 0; j < this.M; ++j) {
                final int ab = this.ab;
                final int n2 = this.ac + j * this.aA;
                final int n3 = this.aA - 1;
                final int n4 = this.ab + 24;
                final int n5 = this.ac + j * this.aA;
                final int n6 = this.ad - 24;
                final int n7 = this.aA - 1;
                if (n5 - this.g <= this.ac + this.ae && n5 - this.g >= this.ac - this.aA) {
                    if (j == 0) {
                        for (int k = 0; k < this.ce.length; ++k) {
                            nr_eh.a((k == this.bL && j == this.ah) ? 16383818 : 15723751);
                            nr_eh.b(n + k * this.aB, n5, this.aB - 1, 23);
                            for (int l = 0; l < this.ce[k].length; ++l) {
                                mFont.o.drawString(nr_eh, this.ce[k][l], n + k * this.aB + this.aB / 2, this.ac + l * 11, 2);
                            }
                        }
                    } else if (j == 1) {
                        nr_eh.a((j == this.ah) ? 16383818 : 15196114);
                        nr_eh.b(this.ab, n5, this.ad, n7);
                        if (this.cf != null) {
                            mFont.tahoma_7b_dark.drawString(nr_eh, this.cf, this.ab + this.ad / 2, n5 + 6, 2);
                        }
                    } else if (this.ai) {
                        if (this.N != null && this.N.length != 0) {
                            nr_eh.a((j == this.ah) ? 16383818 : 15196114);
                            nr_eh.b(n4, n5, n6, n7);
                            nr_eh.a((j == this.ah) ? 9541120 : 9993045);
                            nr_eh.b(ab, n2, 24, n3);
                            if (nr_aj.a(this.N[j - 2].b)) {
                                if (nr_aj.a((short) this.N[j - 2].b).c != null) {
                                    SmallImage.a(nr_eh, nr_aj.a((short) this.N[j - 2].b).c[0], ab + 12, n2 + n3 / 2, 0, nr_cf.f);
                                }
                            } else {
                                final nr_aj nr_aj;
                                (nr_aj = new nr_aj()).a = this.N[j - 2].b;
                                if (!nro.nr_aj.a(nr_aj.a)) {
                                    nro.nr_aj.a(nr_aj);
                                }
                            }
                            mFont.tahoma_7b_green2.drawString(nr_eh, (this.N[j - 2].c.length() > 17) ? (String.valueOf(this.N[j - 2].c.substring(0, 17)) + "...") : this.N[j - 2].c, n4 + 5, n5, 0);
                            mFont.q.drawString(nr_eh, this.N[j - 2].d, n4 + 5, n5 + 11, 0);
                            mFont.m.drawString(nr_eh, String.valueOf(this.N[j - 2].g) + "/" + this.N[j - 2].h, n4 + n6 - 5, n5, 1);
                        }
                    } else if (this.ak) {
                        nr_eh.a((j == this.ah) ? 16383818 : 15196114);
                        nr_eh.b(n4, n5, n6, n7);
                        nr_eh.a((j == this.ah) ? 9541120 : 9993045);
                        nr_eh.b(ab, n2, 24, n3);
                        final nr_e e2;
                        if ((e2 = (nr_e) ((this.O != null) ? this.O.elementAt(j - 2) : this.P.elementAt(j - 2))).c != -1) {
                            SmallImage.drawSmallImage(nr_eh, e2.c, ab, n2, 0, 0);
                        } else {
                            final Rms nr_at = GameScr.x[e2.b];
                            SmallImage.drawSmallImage(nr_eh, nr_at.a[Char.bB[0][0][0]].a, ab + nr_at.a[Char.bB[0][0][0]].b, n2 + 3 + nr_at.a[Char.bB[0][0][0]].c, 0, 0);
                        }
                        nr_eh.e(this.ab, this.ac + this.g, this.ad, this.ae);
                        mFont nr_dc = nro.mFont.tahoma_7b_dark;
                        if (e2.g == 0) {
                            nr_dc = nro.mFont.a;
                        } else if (e2.g == 1) {
                            nr_dc = nro.mFont.h;
                        } else if (e2.g == 2) {
                            nr_dc = nro.mFont.tahoma_7b_green2;
                        }
                        nr_dc.drawString(nr_eh, e2.f, n4 + 5, n5, 0);
                        nro.mFont.q.drawString(nr_eh, String.valueOf(mResources.cW) + ": " + e2.h, n4 + 5, n5 + 11, 0);
                        SmallImage.drawSmallImage(nr_eh, 7223, n4 + n6 - 7, n5 + 12, 0, 3);
                        nro.mFont.m.drawString(nr_eh, new StringBuffer().append(e2.l).toString(), n4 + n6 - 15, n5 + 6, 1);
                    } else if (this.aj && nr_bx.l.size() != 0) {
                        final nr_bx bx2 = (nr_bx) nro.nr_bx.l.elementAt(j - 2);
                        nr_eh.a((j == this.ah && bx2.k == null) ? 16383818 : 15196114);
                        nr_eh.b(ab, n2, n6 + 24, n7);
                        bx2.a(nr_eh, ab, n2);
                        if (bx2.k != null) {
                            final int n8 = this.ab + this.ad - 2 - bx2.k.length * 40;
                            for (int n9 = 0; n9 < bx2.k.length; ++n9) {
                                if (n9 == this.bL && j == this.ah) {
                                    nr_eh.drawImage(GameScr.ay, n8 + n9 * 40 + 20, n5 + n7 / 2, nr_cf.f);
                                    mFont.tahoma_7b_green2.drawString(nr_eh, bx2.k[n9], n8 + n9 * 40 + 20, n5 + 6, 2);
                                } else {
                                    nr_eh.drawImage(GameScr.ax, n8 + n9 * 40 + 20, n5 + n7 / 2, nr_cf.f);
                                    mFont.tahoma_7b_dark.drawString(nr_eh, bx2.k[n9], n8 + n9 * 40 + 20, n5 + 6, 2);
                                }
                            }
                        }
                    }
                }
            }
            this.f(nr_eh);
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
    }

    private void v(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);
        var1.a(0);
        if (this.M == 0) {
            mFont.m.drawString(var1, mResources.fm, this.ab + this.ad / 2, this.ac + this.ae / 2 - mFont.k.a() / 2, 2);
        } else if (Char.myCharz().aD != null) {
            if (Char.myCharz().aD.length == this.M) {
                for (int var2 = 0; var2 < this.M; ++var2) {
                    int var3 = this.ab;
                    int var4 = this.ac + var2 * this.aA;
                    int var5 = this.ad;
                    int var6 = this.aA - 1;
                    nr_am var7 = Char.myCharz().aD[var2];
                    var1.a(var2 == this.ah && (!var7.e && !var7.d || var7.e && var7.d) ? 16383818 : 15196114);
                    var1.b(var3, var4, var5, var6);
                    if (var7 != null) {
                        if (!var7.d) {
                            mFont.k.drawString(var1, var7.a, var3 + 5, var4, 0);
                            mFont.r.drawString(var1, var7.c + " " + mResources.bB, var3 + var5 - 5, var4, 1);
                            mFont.p.drawString(var1, var7.b, var3 + 5, var4 + 11, 0);
                        } else if (var7.d && !var7.e) {
                            mFont.k.drawString(var1, var7.a, var3 + 5, var4, 0);
                            mFont.q.drawString(var1, mResources.fn + var7.c + " " + mResources.bB, var3 + 5, var4 + 11, 0);
                            if (var2 == this.ah) {
                                mFont.tahoma_7b_green2.drawString(var1, mResources.ck, var3 + var5 - 20, var4 + 6, 2);
                                mFont.tahoma_7b_dark.drawString(var1, mResources.ck, var3 + var5 - 20, var4 + 6, 2);
                            } else {
                                var1.drawImage(GameScr.ax, var3 + var5 - 20, var4 + var6 / 2, nr_cf.f);
                                mFont.tahoma_7b_dark.drawString(var1, mResources.ck, var3 + var5 - 20, var4 + 6, 2);
                            }
                        } else if (var7.d && var7.e) {
                            mFont.r.drawString(var1, var7.a, var3 + 5, var4, 0);
                            mFont.r.drawString(var1, var7.b, var3 + 5, var4 + 11, 0);
                        }
                    }
                }

                this.f(var1);
            }
        }
    }

    private void w(final mGraphics nr_eh) {
        nr_eh.a(16711680);
        nr_eh.e(this.ab, this.ac, this.ad, this.ae);
        nr_eh.a(0, -this.g);
        if (this.k.size() == 0) {
            if (this.am != null) {
                for (int i = 0; i < this.am.length; ++i) {
                    mFont.tahoma_7b_dark.drawString(nr_eh, this.am[i], this.ab + this.ad / 2, this.ac + this.ae / 2 - this.am.length * 14 / 2 + i * 14 + 5, 2);
                }
            }
            return;
        }
        for (int j = 0; j < this.k.size() + 1; ++j) {
            final int n = this.ab + 36;
            final int n2 = this.ac + j * this.aA;
            final int n3 = this.ad - 36;
            final int n4 = this.aA - 1;
            final int ab = this.ab;
            final int n5 = this.ac + j * this.aA;
            final int n6 = this.aA - 1;
            if (n2 - this.g <= this.ac + this.ae && n2 - this.g >= this.ac - this.aA) {
                if (j == this.k.size()) {
                    if (this.k.size() > 0) {
                        if (!GameCanvas.isTouch && j == this.ah) {
                            nr_eh.a(16383818);
                            nr_eh.b(ab, n2, this.ad, n4 + 2);
                        }
                        if ((j == this.ah && this.ca == 1) || (!GameCanvas.isTouch && j == this.ah)) {
                            nr_eh.drawImage(GameScr.aw, this.ab + this.ad / 2, n2 + n4 / 2 + 1, nr_cf.f);
                            mFont.tahoma_7b_green2.drawString(nr_eh, mResources.cu, this.ab + this.ad / 2, n2 + n4 / 2 - 4, 2);
                        } else {
                            nr_eh.drawImage(GameScr.av, this.ab + this.ad / 2, n2 + n4 / 2 + 1, nr_cf.f);
                            mFont.tahoma_7b_dark.drawString(nr_eh, mResources.cu, this.ab + this.ad / 2, n2 + n4 / 2 - 4, 2);
                        }
                    }
                } else {
                    nr_eh.a((j == this.ah) ? 16383818 : 15196114);
                    nr_eh.b(n, n2, n3, n4);
                    nr_eh.a((j == this.ah) ? 9541120 : 9993045);
                    final Item h2;
                    if ((h2 = (Item) this.k.elementAt(j)) != null) {
                        for (int k = 0; k < h2.itemOption.length; ++k) {
                            final byte g;
                            final int f;
                            if (h2.itemOption[k].optionTemplate.id == 72 && h2.itemOption[k].param > 0 && (f = f(g = g(h2.itemOption[k].param))) != -1) {
                                final int ah = this.ah;
                                nr_eh.a(f(g));
                            }
                        }
                    }
                    nr_eh.b(ab, n5, 34, n6);
                    if (h2 != null) {
                        String string = "";
                        mFont nr_dc = nro.mFont.m;
                        if (h2.itemOption != null) {
                            for (int l = 0; l < h2.itemOption.length; ++l) {
                                if (h2.itemOption[l].optionTemplate.id == 72) {
                                    string = " [+" + h2.itemOption[l].param + "]";
                                }
                                if (h2.itemOption[l].optionTemplate.id == 41) {
                                    if (h2.itemOption[l].param == 1) {
                                        nr_dc = h(0);
                                    } else if (h2.itemOption[l].param == 2) {
                                        nr_dc = h(2);
                                    } else if (h2.itemOption[l].param == 3) {
                                        nr_dc = h(8);
                                    } else if (h2.itemOption[l].param == 4) {
                                        nr_dc = h(7);
                                    }
                                }
                            }
                        }
                        nr_dc.drawString(nr_eh, String.valueOf(h2.template.name) + string, n + 5, n2 + 1, 0);
                        String s = "";
                        if (h2.itemOption != null) {
                            if (h2.itemOption.length > 0 && h2.itemOption[0] != null && h2.itemOption[0].optionTemplate.id != 102 && h2.itemOption[0].optionTemplate.id != 107) {
                                s = String.valueOf(s) + h2.itemOption[0].getOptionString();
                            }
                            mFont nr_dc2 = nro.mFont.q;
                            if (h2.compare < 0 && h2.template.type != 5) {
                                nr_dc2 = nro.mFont.p;
                            }
                            if (h2.itemOption.length > 1) {
                                for (int n7 = 1; n7 < h2.itemOption.length; ++n7) {
                                    if (h2.itemOption[n7] != null && h2.itemOption[n7].optionTemplate.id != 102 && h2.itemOption[n7].optionTemplate.id != 107) {
                                        s = String.valueOf(s) + "," + h2.itemOption[n7].getOptionString();
                                    }
                                }
                            }
                            nr_dc2.drawString(nr_eh, s, n + 5, n2 + 11, 0);
                        }
                        SmallImage.drawSmallImage(nr_eh, h2.template.iconID, ab + 17, n5 + n6 / 2, 0, 3);
                        if (h2.itemOption != null) {
                            for (int n8 = 0; n8 < h2.itemOption.length; ++n8) {
                                this.a(nr_eh, h2.itemOption[n8].optionTemplate.id, ab, n5, n6);
                            }
                            for (int n9 = 0; n9 < h2.itemOption.length; ++n9) {
                                a(nr_eh, h2.itemOption[n9].optionTemplate.id, h2.itemOption[n9].param, ab, n5, 34, n6);
                            }
                        }
                        if (h2.quantity > 1) {
                            nro.mFont.n.drawString(nr_eh, new StringBuffer().append(h2.quantity).toString(), ab + 34, n5 + n6 - nro.mFont.n.a(), 1);
                        }
                    }
                }
            }
        }
        this.f(nr_eh);
    }

   private void x(final mGraphics g) {
    final Item[] ag = Char.myCharz().arrItemBody;
    final Item[] ae = Char.myCharz().arrItemBag;

    int bodyLines = ag.length;
    int gridCols = 6;
    int gridCellSize = 28;
    int gridGap = 2;

    this.M = bodyLines + ae.length;
    if (this.ah > this.M) this.ah = this.M;
    if (this.ah < 1) this.ah = 1;

    g.e(this.ab, this.ac, this.ad, this.ae);
    g.a(0, -this.g);

    try {
        // Vẽ item body
        for (int i = 0; i < ag.length; i++) {
            Item item = ag[i];
            int n3 = this.ab + 36;
            int n4 = this.ac + i * this.aA;
            int n5 = this.ad - 36;
            int n6 = this.aA - 1;
            int ab = this.ab;
            int n7 = this.ac + i * this.aA;
            int n8 = this.aA - 1;

            int displayIndex = i + 1;
            if (n4 - this.g <= this.ac + this.ae && n4 - this.g >= this.ac - this.aA) {
                boolean isSelected = (displayIndex == this.ah);
                g.a(isSelected ? 16383818 : 15723751);
                g.b(n3, n4, n5, n6);
                g.a(isSelected ? 9541120 : 11837316);
                g.b(ab, n7, 34, n8);

                if (item == null) continue;

                // Vẽ tên item + icon
                String name = item.template.name;
                String suffix = "";
                for (int m = 0; m < item.itemOption.length; m++) {
                    ItemOption opt = item.itemOption[m];
                    if (opt.optionTemplate.id == 72) {
                        suffix = " [+" + opt.param + "]";
                        break;
                    }
                }
                nro.mFont.m.drawString(g, name + suffix, n3 + 5, n4 + 1, 0);

                // Vẽ option chính (1 hoặc 2 option)
                String options = "";
                if (item.itemOption.length > 0) {
                    ItemOption opt0 = item.itemOption[0];
                    if (opt0.optionTemplate.id != 102 && opt0.optionTemplate.id != 107) {
                        options += opt0.getOptionString();
                    }
                    if (item.itemOption.length > 1) {
                        ItemOption opt1 = item.itemOption[1];
                        if (opt1.optionTemplate.id != 102 && opt1.optionTemplate.id != 107) {
                            options += ", " + opt1.getOptionString();
                        }
                    }
                }
                nro.mFont.q.drawString(g, options, n3 + 5, n4 + 11, 0);

                SmallImage.drawSmallImage(g, item.template.iconID, ab + 17, n7 + n8 / 2, 0, 3);

                if (item.quantity > 1) {
                    nro.mFont.n.drawString(g, String.valueOf(item.quantity), ab + 34, n7 + n8 - nro.mFont.n.a(), 1);
                }
            }
        }

        // Vẽ item bag dạng lưới
        int startY = this.ac + ag.length * this.aA + gridGap;
        int baseX = this.ab + (this.ad - (gridCols * gridCellSize + (gridCols - 1) * gridGap)) / 2;

        for (int i = 0; i < ae.length; i++) {
            int col = i % gridCols;
            int row = i / gridCols;
            int x = baseX + col * (gridCellSize + gridGap);
            int y = startY + row * (gridCellSize + gridGap);

            int displayIndex = ag.length + i + 1;

            if (y - this.g <= this.ac + this.ae && y - this.g + gridCellSize >= this.ac) {
                g.a(displayIndex == this.ah ? 9541120 : 11837316);
                g.b(x, y, gridCellSize, gridCellSize);

                Item item = ae[i];
                if (item != null) {
                    SmallImage.drawSmallImage(g, item.template.iconID, x + gridCellSize / 2, y + gridCellSize / 2, 0, 3);
                    if (item.quantity > 1) {
                        mFont.s.drawString(g, String.valueOf(item.quantity), x + gridCellSize - 1, y + gridCellSize - mFont.s.getHeight(), 1);
                    }
                }
            }
        }

    } catch (Exception ex) {
        // ignore
    }

    this.f(g);
}

    private void y(mGraphics var1) {
        if (this.y != 23 && this.y != 24) {
            if (this.y == 20) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.al, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 22) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.l, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 19) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.bQ, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 18) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.bN, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 13 && this.equals(GameCanvas.panel2)) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.cj, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 12 && GameCanvas.panel2 != null) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.cu, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 11) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.bJ, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 16) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.bK, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 15) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, this.n, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 2 && GameCanvas.panel2 != null) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.bZ, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 9) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.fo, this.ab + this.ad / 2, 59, 2);
            } else if (this.y == 3) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.aD, this.A + this.aB / 2, 59, 2);
            } else if (this.y == 26) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.z, this.A + this.aB / 2, 59, 2);
            } else if (this.y == 14) {
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
                mFont.tahoma_7b_dark.drawString(var1, mResources.ft, this.A + this.aB / 2, 59, 2);
            } else if (this.y == 4) {
                mFont.tahoma_7b_dark.drawString(var1, mResources.ci, this.A + this.aB / 2, 59, 2);
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
            } else if (this.y == 7) {
                mFont.tahoma_7b_dark.drawString(var1, mResources.fp, this.A + this.aB / 2, 59, 2);
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
            } else if (this.y == 17) {
                mFont.tahoma_7b_dark.drawString(var1, mResources.fA, this.A + this.aB / 2, 59, 2);
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
            } else if (this.y == 8) {
                mFont.tahoma_7b_dark.drawString(var1, mResources.Z, this.A + this.aB / 2, 59, 2);
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
            } else if (this.y == 10) {
                mFont.tahoma_7b_dark.drawString(var1, mResources.fq, this.A + this.aB / 2, 59, 2);
                var1.a(13524492);
                var1.d(this.b + 1, 78, this.d - 2, 1);
            } else {
                if (this.z == 3 && this.B.length != 4) {
                    var1.a(-this.h, 0);
                }

                for (int var2 = 0; var2 < this.aW.length; ++var2) {
                    var1.a(var2 == this.z ? 6805896 : 16773296);
                    PopUp.a(var1, this.A + var2 * this.aB, 52, this.aB - 1, 25, var2 == this.z ? 1 : 0, true);
                    if (var2 == this.cd) {
                        var1.drawImage(ItemMap.imageFlare, this.A + var2 * this.aB + this.aB / 2, 62, 3);
                    }

                    mFont var3 = var2 == this.z ? mFont.m : mFont.o;
                    if (!this.aW[var2][1].equals("")) {
                        var3.drawString(var1, this.aW[var2][0], this.A + var2 * this.aB + this.aB / 2, 53, 2);
                        var3.drawString(var1, this.aW[var2][1], this.A + var2 * this.aB + this.aB / 2, 64, 2);
                    } else {
                        var3.drawString(var1, this.aW[var2][0], this.A + var2 * this.aB + this.aB / 2, 59, 2);
                    }

                    if (this.y == 0 && this.aW.length == 5 && GameScr.aV && GameCanvas.gameTick % 4 == 0) {
                        var1.drawImage(ItemMap.imageFlare, this.A + 3 * this.aB + this.aB / 2, 77, 33);
                    }
                }

                var1.a(13524492);
                var1.d(1, 78, this.d - 2, 1);
            }
        } else {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            mFont.tahoma_7b_dark.drawString(var1, mResources.bO, this.ab + this.ad / 2, 59, 2);
        }
    }

    private static void z(mGraphics var0) {
        mFont.c.a(var0, mResources.aj + " " + "2.3.0", 60, 4, 0, mFont.tahoma_7b_dark);
        mFont.n.a(var0, mResources.ak + ": " + Char.myCharz().cName, 60, 16, 0, mFont.o);
        mFont.n.a(var0, mResources.am + " " + nr_bo.a[nr_bo.m] + ":", 60, 27, 0, mFont.o);
        mFont.n.a(var0, GameCanvas.loginScr.a.getText().equals("") ? mResources.gf : GameCanvas.loginScr.a.getText(), 60, 39, 0, mFont.o);
    }

    private void A(mGraphics var1) {
        this.a(var1, Char.myCharz());
    }

    private void a(mGraphics var1, Char var2) {
        mFont.c.a(var1, (GameScr.bX != 1 ? "" : "       ") + var2.cName, this.b + 60, 4, 0, mFont.tahoma_7b_dark);
        if (GameScr.bX == 1) {
            SmallImage.drawSmallImage(var1, 5427, this.b + 55, 4, 0, 0);
        }

        if (var2.cMaxStamina > 0) {
            mFont.n.a(var1, mResources.eV, this.b + 60, 16, 0, mFont.o);
            var1.drawImage(GameScr.aF, this.b + 95, 19, 0);
            int var3 = var2.cStamina * mGraphics.getImageWidth(GameScr.arrItemBag) / var2.cMaxStamina;
            var1.e(95, this.b + 19, var3, 20);
            var1.drawImage(GameScr.arrItemBag, this.b + 95, 19, 0);
        }

        var1.e(0, 0, GameCanvas.z, GameCanvas.A);
        if (var2.cPower > 0L) {
            mFont.n.a(var1, var2.me ? var2.c() : var2.currStrLevel, this.b + 60, 27, 0, mFont.o);
        }

        mFont.n.a(var1, mResources.cW + ": " + NinjaUtil.a(var2.cPower), this.b + 60, 38, 0, mFont.o);
    }

    public final int getCompare(Item var1) {
        if (var1 == null) {
            return -1;
        } else if (!var1.isTypeBody()) {
            return 0;
        } else if (var1.itemOption == null) {
            return -1;
        } else {
            ItemOption var2;
            if ((var2 = var1.itemOption[0]).optionTemplate.id == 22) {
                var2.optionTemplate = GameScr.gI().optionTemplateId[6];
                var2.param *= 1000;
            }

            if (var2.optionTemplate.id == 23) {
                var2.optionTemplate = GameScr.gI().optionTemplateId[7];
                var2.param *= 1000;
            }

            Item var3 = null;

            int var4;
            for (var4 = 0; var4 < Char.myCharz().arrItemBody.length; ++var4) {
                Item var5 = Char.myCharz().arrItemBody[var4];
                if (var2.optionTemplate.id == 22) {
                    var2.optionTemplate = GameScr.gI().optionTemplateId[6];
                    var2.param *= 1000;
                }

                if (var2.optionTemplate.id == 23) {
                    var2.optionTemplate = GameScr.gI().optionTemplateId[7];
                    var2.param *= 1000;
                }

                if (var5 != null && var5.itemOption != null && var5.template.type == var1.template.type) {
                    var3 = var5;
                    break;
                }
            }

            if (var3 == null) {
                Res.out("5");
                return var2.param;
            } else {
                if (var3 != null && var3.itemOption != null) {
                    var4 = var2.param - var3.itemOption[0].param;
                } else {
                    var4 = var2.param;
                }

                return var4;
            }
        }
    }

    private static void B(mGraphics var0) {
        mFont.c.drawString(var0, mResources.aH[TileMap.r], 60, 4, 0);
        String var1 = "";
        if (TileMap.l >= 135 && TileMap.l <= 138) {
            var1 = " " + mResources.i + TileMap.n;
        }

        mFont.n.drawString(var0, TileMap.k + var1, 60, 16, 0);
        mFont.c.drawString(var0, mResources.fl + ": ", 60, 27, 0);
        if (GameScr.z() >= 0 && GameScr.z() <= TileMap.w.length - 1) {
            mFont.n.drawString(var0, TileMap.w[GameScr.z()], 60, 38, 0);
        } else {
            mFont.n.drawString(var0, mResources.em, 60, 38, 0);
        }
    }

    private void C(mGraphics var1) {
        mFont.n.a(var1, mResources.eR + ": " + Char.myCharz().cHP + " / " + Char.myCharz().cHPFull, this.b + 60, 2, 0, mFont.o);
        mFont.n.a(var1, mResources.eS + ": " + Char.myCharz().cMP + " / " + Char.myCharz().cMPFull, this.b + 60, 14, 0, mFont.o);
        mFont.n.a(var1, mResources.eT + ": " + Char.myCharz().cDamFull, this.b + 60, 26, 0, mFont.o);
        mFont.n.a(var1, mResources.eU + ": " + Char.myCharz().cDefull + ", " + mResources.eW + ": " + Char.myCharz().cCriticalFull + "%", this.b + 60, 38, 0, mFont.o);
    }

    private void D(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(-this.aI, -this.aJ);
        var1.drawImage(aN, this.ab, this.ac, 0);
        int var2 = Char.myCharz().head;
        Rms var7 = GameScr.x[var2];
        SmallImage.drawSmallImage(var1, var7.a[Char.bB[0][0][0]].a, this.cu, this.cv + 5, 0, 3);
        byte var8 = 2;
        if (this.cu <= 40) {
            var8 = 0;
        }

        if (this.cu >= 220) {
            var8 = 1;
        }

        mFont.d.a(var1, TileMap.k, this.cu, this.cv - 12, var8, mFont.o);
        int var3 = -1;
        int var4;
        if (GameScr.z() != -1) {
            for (var4 = 0; var4 < bx[TileMap.r].length; ++var4) {
                if (bx[TileMap.r][var4] == GameScr.z()) {
                    var3 = var4;
                    break;
                }

                var3 = 4;
            }

            if (GameCanvas.gameTick % 4 > 0) {
                var1.drawImage(ItemMap.imageFlare, this.ab + by[TileMap.r][var3], this.ac + bz[TileMap.r][var3], 3);
            }
        }

        int var5;
        int var6;
        if (!GameCanvas.isTouch) {
            var1.drawImage(i, this.cw, this.cx, nr_cf.b);

            for (var4 = 0; var4 < by[TileMap.r].length; ++var4) {
                var5 = by[TileMap.r][var4] + this.ab;
                var6 = bz[TileMap.r][var4] + this.ac;
                if (Res.a(var5 - 15, var6 - 15, 30, 30, this.cw, this.cx)) {
                    var8 = 2;
                    if (var5 <= 20) {
                        var8 = 0;
                    }

                    if (var5 >= 220) {
                        var8 = 1;
                    }

                    mFont.d.a(var1, TileMap.w[bx[TileMap.r][var4]], var5, var6 - 12, var8, mFont.o);
                    break;
                }
            }
        } else if (!this.bX) {
            for (var4 = 0; var4 < by[TileMap.r].length; ++var4) {
                var5 = by[TileMap.r][var4] + this.ab;
                var6 = bz[TileMap.r][var4] + this.ac;
                if (Res.a(var5 - 15, var6 - 15, 30, 30, this.bY, this.bZ)) {
                    var8 = 2;
                    if (var5 <= 30) {
                        var8 = 0;
                    }

                    if (var5 >= 220) {
                        var8 = 1;
                    }

                    var1.drawImage(i, var5, var6, nr_cf.b);
                    mFont.d.a(var1, TileMap.w[bx[TileMap.r][var4]], var5, var6 - 12, var8, mFont.o);
                    break;
                }
            }
        }

        var1.a(-var1.a(), -var1.b());
        if (var3 != -1) {
            if (by[TileMap.r][var3] + this.ab < this.aI) {
                var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 5, this.ab + 5, this.ac + this.ae / 2 - 4, 0);
            }

            if (this.aI + this.ad < by[TileMap.r][var3] + this.ab) {
                var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 6, this.ab + this.ad - 5, this.ac + this.ae / 2 - 4, nr_cf.b);
            }

            if (bz[TileMap.r][var3] < this.aJ) {
                var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 1, this.ab + this.ad / 2, this.ac + 5, nr_cf.a);
            }

            if (bz[TileMap.r][var3] > this.aJ + this.ae) {
                var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 0, this.ab + this.ad / 2, this.ac + this.ae - 5, nr_cf.c);
            }
        }

    }

    private void E(mGraphics var1) {
        int var2 = GameCanvas.A > 300 ? 20 : 15;
        if (ap) {
            GameScr.gI();
            if (!GameScr.e()) {
                GameScr.gI();
                if (!GameScr.f()) {
                    var1.drawImage(this.cb == 1 ? GameScr.aw : GameScr.av, this.ab + this.ad / 2, this.ac + this.ae - var2, 3);
                    mFont.tahoma_7b_dark.drawString(var1, mResources.ci, this.ab + this.ad / 2, this.ac + this.ae - (var2 + 5), 2);
                }
            }
        }

        this.cn = this.ab + 5;
        this.co = this.ac + 14;
        this.ct = this.co;
        var1.e(this.ab, this.ac, this.ad, this.ae - 35);
        if (this.cg != null) {
            if (this.cg.d > 0) {
                var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 1, this.ab + this.ad - 12, this.ac + 3, 0);
            }

            if (this.cg.d < this.cg.l) {
                var1.drawRegion(Mob.imgHP, 0, 0, 9, 6, 0, this.ab + this.ad - 12, this.ac + this.ae - 45, 0);
            }

            var1.a(0, -this.cg.d);
        }

        this.cr = 0;
        boolean var3 = false;
        int var4;
        if (Char.myCharz().taskMaint != null) {
            for (var4 = 0; var4 < Char.myCharz().taskMaint.d.length; ++var4) {
                mFont.o.drawString(var1, Char.myCharz().taskMaint.d[var4], this.ab + this.ad / 2, this.ct - 5 + var4 * 12, 2);
                ++this.cr;
            }

            this.ct += (Char.myCharz().taskMaint.d.length - 1) * 12;
            var4 = 0;

            int var6;
            for (var6 = 0; var6 < Char.myCharz().taskMaint.f.length; ++var6) {
                String var5;
                mFont var7;
                if (Char.myCharz().taskMaint.f[var6] != null) {
                    label189:
                    {
                        var4 = var6;
                        var5 = "- " + Char.myCharz().taskMaint.f[var6];
                        mFont var10000;
                        mGraphics var10001;
                        String var10002;
                        int var10003;
                        int var10004;
                        if (Char.myCharz().taskMaint.b[var6] != -1) {
                            if (Char.myCharz().taskMaint.a == var6) {
                                if (Char.myCharz().taskMaint.b[var6] != 1) {
                                    var5 = var5 + " (" + Char.myCharz().taskMaint.h + "/" + Char.myCharz().taskMaint.b[var6] + ")";
                                }

                                if (Char.myCharz().taskMaint.h != Char.myCharz().taskMaint.b[var6]) {
                                    var7 = mFont.o;
                                    if (!var3) {
                                        var3 = true;
                                        (var7 = mFont.q).drawString(var1, var5, this.cn + 5 + (var7 == mFont.q && GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0), this.ct += 12, 0);
                                    } else {
                                        var7.drawString(var1, "- ...", this.cn + 5 + (var7 == mFont.q && GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0), this.ct += 12, 0);
                                    }
                                    break label189;
                                }

                                var10000 = mFont.k;
                                var10001 = var1;
                                var10002 = var5;
                                var10003 = this.cn;
                                var10004 = 5;
                            } else {
                                if (Char.myCharz().taskMaint.a <= var6) {
                                    if (Char.myCharz().taskMaint.b[var6] != 1) {
                                        var5 = var5 + " 0/" + Char.myCharz().taskMaint.b[var6];
                                    }

                                    var7 = mFont.o;
                                    if (!var3) {
                                        var3 = true;
                                        (var7 = mFont.q).drawString(var1, var5, this.cn + 5 + (var7 == mFont.q && GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0), this.ct += 12, 0);
                                    } else {
                                        var7.drawString(var1, "- ...", this.cn + 5 + (var7 == mFont.q && GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0), this.ct += 12, 0);
                                    }
                                    break label189;
                                }

                                if (Char.myCharz().taskMaint.b[var6] != 1) {
                                    var5 = var5 + " (" + Char.myCharz().taskMaint.b[var6] + "/" + Char.myCharz().taskMaint.b[var6] + ")";
                                }

                                var10000 = mFont.s;
                                var10001 = var1;
                                var10002 = var5;
                                var10003 = this.cn;
                                var10004 = 5;
                            }
                        } else if (Char.myCharz().taskMaint.a > var6) {
                            var10000 = mFont.s;
                            var10001 = var1;
                            var10002 = var5;
                            var10003 = this.cn;
                            var10004 = 5;
                        } else {
                            var7 = mFont.o;
                            if (!var3) {
                                var3 = true;
                                (var7 = mFont.q).drawString(var1, var5, this.cn + 5 + (var7 == mFont.q && GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0), this.ct += 12, 0);
                                break label189;
                            }

                            var10000 = var7;
                            var10001 = var1;
                            var10002 = "- ...";
                            var10003 = this.cn + 5;
                            var10004 = var7 == mFont.q && GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0;
                        }

                        var10000.drawString(var10001, var10002, var10003 + var10004, this.ct += 12, 0);
                    }

                    ++this.cr;
                } else if (Char.myCharz().taskMaint.a <= var6) {
                    var5 = "- " + Char.myCharz().taskMaint.f[var4];
                    var7 = mFont.o;
                    if (!var3) {
                        var3 = true;
                        var7 = mFont.q;
                    }

                    var7.drawString(var1, var5, this.cn + 5 + (var7 == mFont.q && GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0), this.ct += 12, 0);
                }
            }

            this.ct += 5;

            for (var6 = 0; var6 < Char.myCharz().taskMaint.e.length; ++var6) {
                mFont.m.drawString(var1, Char.myCharz().taskMaint.e[var6], this.cn + 5, this.ct += 12, 0);
                ++this.cr;
            }
        } else {
            var4 = GameScr.z();
            byte var10 = GameScr.A();
            String var9;
            if (var4 != -3 && var10 != -3) {
                if (Char.myCharz().taskMaint != null || Char.myCharz().ctaskId != 9 || Char.myCharz().aw.a != 0) {
                    if (var10 < 0 || var4 < 0) {
                        return;
                    }

                    var9 = mResources.aS[0] + Npc.cX[var10].b + mResources.aS[1] + TileMap.w[var4] + mResources.aS[2];
                } else {
                    var9 = mResources.aV;
                }
            } else {
                var9 = mResources.aS[3];
            }

            String[] var11 = mFont.s.a(var9, 150);

            for (int var8 = 0; var8 < var11.length; ++var8) {
                if (var8 == 0) {
                    mFont.s.drawString(var1, var11[var8], this.cn + 5, this.ct = this.co, 0);
                } else {
                    mFont.s.drawString(var1, var11[var8], this.cn + 5, this.ct += 12, 0);
                }
            }
        }

        if (this.cg == null) {
            this.cg = new nr_do();
            this.cg.a(this.cr, 12, this.ab, this.ac, this.ad, this.ae - var2 - 40, true, 1);
        }

    }

    private void Z() {
        for (int var1 = 0; var1 < this.k.size(); ++var1) {
            ((Item) this.k.elementAt(var1)).isSelect = false;
        }

        this.k.removeAllElements();
    }

    public final void z() {
        if (this.bK > 0) {
            this.cy = false;
        } else {
            if (this.F()) {
                Char.myCharz().W();
            }

            if (this.o != null && this.y == 13 && this.o.b) {
                this.o = null;
            }

            if (this.y == 13 && !this.aQ) {
                Service.gI().giaodich((byte) 3, (int) -1, (byte) -1, (int) -1);
            }

            Res.out("HIDE PANELLLLLLLLLLLLLLLLLLLLLL");
            SoundMn.gI();
            GameScr.bt = true;
            TileMap.s = -1;
            aN = null;
            System.gc();
            this.bN = false;
            this.cy = true;
            this.Z();
            nr_v.a();
            GameCanvas.panel2 = null;
            GameCanvas.clearAllPointerEvent();
            GameCanvas.e();
            this.bO = this.bP = 0;
            this.bR = false;
            this.a = false;
            if ((Char.myCharz().cHP <= 0 || Char.myCharz().statusMe == 14 || Char.myCharz().statusMe == 5) && Char.myCharz().meDead) {
                Command var1 = new Command(mResources.aT[0], 11038, GameScr.gI());
                GameScr.gI().cb = var1;
                Char.myCharz().cHP = 0;
            }

        }
    }

    public final void A() {
        if (this.bK > 0) {
            this.cy = false;
        } else {
            if (this.F()) {
                Char.myCharz().W();
            }

            if (this.o != null && this.y == 13 && this.o.b) {
                this.o = null;
            }

            if (this.y == 13 && !this.aQ) {
                Service.gI().giaodich((byte) 3, (int) -1, (byte) -1, (int) -1);
            }

            if (this.y == 15) {
                Service.gI().u(-1);
            }

            SoundMn.gI();
            GameScr.bt = true;
            TileMap.s = -1;
            if (aN != null) {
                aN = null;
            }

            System.gc();
            this.bN = false;
            if (this.y != 4) {
                if (this.y == 24) {
                    this.ah();
                } else if (this.y == 23) {
                    this.q();
                } else if (this.y != 3 && this.y != 14) {
                    if (this.y != 18 && this.y != 19 && this.y != 20 && this.y != 21) {
                        if (this.y != 8 && this.y != 11 && this.y != 16) {
                            this.cy = true;
                        } else {
                            this.at();
                            this.h = this.aH = 0;
                        }
                    } else {
                        this.q();
                        this.h = this.aH = 0;
                    }
                } else if (this.cD) {
                    this.cy = true;
                } else {
                    this.q();
                    this.h = this.aH = 0;
                }
            } else {
                this.q();
                this.h = this.aH = 0;
            }

            nr_v.a();
            GameCanvas.panel2 = null;
            GameCanvas.clearAllPointerEvent();
            GameCanvas.e();
            GameCanvas.T = false;
            this.bO = this.bP = 0;
            this.bR = false;
            if ((Char.myCharz().cHP <= 0 || Char.myCharz().statusMe == 14 || Char.myCharz().statusMe == 5) && Char.myCharz().meDead) {
                Command var1 = new Command(mResources.aT[0], 11038, GameScr.gI());
                GameScr.gI().cb = var1;
                Char.myCharz().cHP = 0;
            }

        }
    }

    public final void B() {
        if (this.o != null && this.o.b) {
            this.o.c();
        } else if (this.cE) {
            ++this.cG;
            if (this.cG == 10) {
                this.cG = 0;
                this.cE = false;
                this.o.a.a("");
                this.o.h = mResources.fD + " ";
                this.o.a.i = mResources.dZ;
                this.o.g = "";
                this.o.b = true;
                this.o.a.c(1);
                this.o.a.b(9);
                if (GameCanvas.isTouch) {
                    this.o.a.a();
                }
            }

        } else if (this.cF) {
            ++this.cG;
            if (this.cG == 10) {
                this.cG = 0;
                this.cF = false;
                this.o.a.a("");
                this.o.h = mResources.fE + "  ";
                this.o.a.i = mResources.dZ;
                this.o.g = "";
                this.o.b = true;
                this.o.a.c(1);
                this.o.a.b(9);
                if (GameCanvas.isTouch) {
                    this.o.a.a();
                }
            }

        } else {
            if (this.cg != null) {
                this.cg.b();
            }

            if (this.j != null && this.j.k) {
                nr_dk var19 = this.j;
                if (nr_dk.f != null) {
                    nr_dk.f.b();
                }

                if (var19.h != var19.g) {
                    var19.i = var19.g - var19.h << 2;
                    var19.j += var19.i;
                    var19.h += var19.j >> 3;
                    var19.j &= 15;
                }

                if (Math.abs(var19.g - var19.h) < 10) {
                    var19.h = var19.g;
                }

                if (var19.h >= var19.a + var19.b - 10 && var19.g >= var19.a + var19.b - 10) {
                    var19.k = false;
                }

            } else {
                this.V();
                if (this.bT > 0) {
                    --this.bT;
                    if (this.bT == 0) {
                        this.bn[this.z] = this.ah;
                        MyVector var2;
                        Item var21;
                        switch (this.y) {
                            case 0:
                                Panel var1 = this;

                                try {
                                    if (var1.z == 0) {
                                        var1.K();
                                    }

                                    if (var1.z == 1) {
                                        var1.ae();
                                    }

                                    if (var1.z == 2 && var1.ah >= 0) {
                                        if (Char.myCharz().statusMe == 14) {
                                            GameCanvas.a(mResources.et);
                                        } else if (var1.ah != 0 && var1.ah != 1 && var1.ah != 2 && var1.ah != 3 && var1.ah != 4 && var1.ah != 5) {
                                            int var24 = var1.ah - 6;
                                            nr_en var6 = Char.myCharz().aw.b[var24];
                                            Skill var22 = Char.myCharz().a(var6);
                                            Skill var23 = null;
                                            MyVector var26 = new MyVector("");
                                            if (var22 != null) {
                                                if (var22.c == var6.c) {
                                                    var26.addElement(new Command(mResources.cw, var1, 9003, var22.a));
                                                    var26.addElement(new Command(mResources.bf, 2));
                                                } else {
                                                    var23 = var6.h[var22.c];
                                                    var26.addElement(new Command(mResources.cu, var1, 9002, var23));
                                                    var26.addElement(new Command(mResources.cw, var1, 9003, var22.a));
                                                }
                                            } else {
                                                var23 = var6.h[0];
                                                var26.addElement(new Command(mResources.fg, var1, 9004, var23));
                                            }

                                            GameCanvas.menu.a(var26, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                            var1.a(var6, var22, var23);
                                        } else {
                                            label594:
                                            {
                                                long var5 = Char.myCharz().cTiemNang;
                                                int var20 = Char.myCharz().cp;
                                                int var4 = Char.myCharz().cq;
                                                int var7 = Char.myCharz().co;
                                                int var8 = Char.myCharz().cr;
                                                Char.myCharz();
                                                MyVector var11;
                                                if (var1.ah == 0) {
                                                    if (var5 < (long) (Char.myCharz().cp + 1000)) {
                                                        GameCanvas.a(mResources.eG + Char.myCharz().cTiemNang + mResources.eH + (Char.myCharz().cp + 1000));
                                                        break label594;
                                                    }

                                                    if (var5 > (long) var20 && var5 < (long) (10 * (2 * (var20 + 1000) + 180) / 2)) {
                                                        GameCanvas.a(mResources.eI + (var20 + 1000) + mResources.eJ + Char.myCharz().ct + mResources.eK, new Command(mResources.eF, var1, 9000, (Object) null), new Command(mResources.br, var1, 4007, (Object) null));
                                                        break label594;
                                                    }

                                                    if (var5 >= (long) (10 * (2 * (var20 + 1000) + 180) / 2) && var5 < (long) (100 * (2 * (var20 + 1000) + 1980) / 2)) {
                                                        (var11 = new MyVector("")).addElement(new Command(mResources.eF + "\n" + Char.myCharz().ct + mResources.eR + "\n" + "-" + Res.b((long) (var20 + 1000)), var1, 9000, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 10 * Char.myCharz().ct + mResources.eR + "\n" + "-" + Res.b((long) (10 * (2 * (var20 + 1000) + 180) / 2)), var1, 9006, (Object) null));
                                                        GameCanvas.menu.a(var11, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.d(var1.ah);
                                                    }

                                                    if (var5 >= (long) (100 * (2 * (var20 + 1000) + 1980) / 2)) {
                                                        (var11 = new MyVector("")).addElement(new Command(mResources.eF + "\n" + Char.myCharz().ct + mResources.eR + "\n" + "-" + Res.b((long) (var20 + 1000)), var1, 9000, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 10 * Char.myCharz().ct + mResources.eR + "\n" + "-" + Res.b((long) (10 * (2 * (var20 + 1000) + 180) / 2)), var1, 9006, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 100 * Char.myCharz().ct + mResources.eR + "\n" + "-" + Res.b((long) (100 * (2 * (var20 + 1000) + 1980) / 2)), var1, 9007, (Object) null));
                                                        GameCanvas.menu.a(var11, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.d(var1.ah);
                                                    }
                                                }

                                                if (var1.ah == 1) {
                                                    if (Char.myCharz().cTiemNang < (long) (Char.myCharz().cq + 1000)) {
                                                        GameCanvas.a(mResources.eG + Char.myCharz().cTiemNang + mResources.eH + (Char.myCharz().cq + 1000));
                                                        break label594;
                                                    }

                                                    if (var5 > (long) var4 && var5 < (long) (10 * (2 * (var4 + 1000) + 180) / 2)) {
                                                        GameCanvas.a(mResources.eI + (var4 + 1000) + mResources.eJ + Char.myCharz().cu + mResources.eL, new Command(mResources.eF, var1, 9000, (Object) null), new Command(mResources.br, var1, 4007, (Object) null));
                                                        break label594;
                                                    }

                                                    if (var5 >= (long) (10 * (2 * (var4 + 1000) + 180) / 2) && var5 < (long) (100 * (2 * (var4 + 1000) + 1980) / 2)) {
                                                        (var11 = new MyVector("")).addElement(new Command(mResources.eF + "\n" + Char.myCharz().cu + mResources.eS + "\n" + "-" + Res.b((long) (var20 + 1000)), var1, 9000, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 10 * Char.myCharz().cu + mResources.eS + "\n" + "-" + Res.b((long) (10 * (2 * (var20 + 1000) + 180) / 2)), var1, 9006, (Object) null));
                                                        GameCanvas.menu.a(var11, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.d(var1.ah);
                                                    }

                                                    if (var5 >= (long) (100 * (2 * (var4 + 1000) + 1980) / 2)) {
                                                        (var11 = new MyVector("")).addElement(new Command(mResources.eF + "\n" + Char.myCharz().cu + mResources.eS + "\n" + "-" + Res.b((long) (var4 + 1000)), var1, 9000, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 10 * Char.myCharz().cu + mResources.eS + "\n" + "-" + Res.b((long) (10 * (2 * (var4 + 1000) + 180) / 2)), var1, 9006, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 100 * Char.myCharz().cu + mResources.eS + "\n" + "-" + Res.b((long) (100 * (2 * (var4 + 1000) + 1980) / 2)), var1, 9007, (Object) null));
                                                        GameCanvas.menu.a(var11, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.d(var1.ah);
                                                    }
                                                }

                                                if (var1.ah == 2) {
                                                    if (Char.myCharz().cTiemNang < (long) (Char.myCharz().co * Char.myCharz().cz)) {
                                                        GameCanvas.a(mResources.eG + Char.myCharz().cTiemNang + mResources.eH + var7 * 100);
                                                        break label594;
                                                    }

                                                    if (var5 > (long) var7 && var5 < (long) (10 * (var7 * 2 + 9) / 2 * Char.myCharz().cz)) {
                                                        GameCanvas.a(mResources.eI + var7 * 100 + mResources.eJ + Char.myCharz().cv + mResources.eM, new Command(mResources.eF, var1, 9000, (Object) null), new Command(mResources.br, var1, 4007, (Object) null));
                                                        break label594;
                                                    }

                                                    if (var5 >= (long) (10 * (var7 * 2 + 9) / 2 * Char.myCharz().cz) && var5 < (long) (100 * (var7 * 2 + 99) / 2 * Char.myCharz().cz)) {
                                                        (var11 = new MyVector("")).addElement(new Command(mResources.eF + "\n" + Char.myCharz().cv + "\n" + mResources.eT + "\n" + "-" + Res.b((long) (var7 * 100)), var1, 9000, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 10 * Char.myCharz().cv + "\n" + mResources.eT + "\n" + "-" + Res.b((long) (10 * (var7 * 2 + 9) / 2 * Char.myCharz().cz)), var1, 9006, (Object) null));
                                                        GameCanvas.menu.a(var11, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.d(var1.ah);
                                                    }

                                                    if (var5 >= (long) (100 * (var7 * 2 + 99) / 2 * Char.myCharz().cz)) {
                                                        (var11 = new MyVector("")).addElement(new Command(mResources.eF + "\n" + Char.myCharz().cv + "\n" + mResources.eT + "\n" + "-" + Res.b((long) (var7 * 100)), var1, 9000, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 10 * Char.myCharz().cv + "\n" + mResources.eT + "\n" + "-" + Res.b((long) (10 * (var7 * 2 + 9) / 2 * Char.myCharz().cz)), var1, 9006, (Object) null));
                                                        var11.addElement(new Command(mResources.eF + "\n" + 100 * Char.myCharz().cv + "\n" + mResources.eT + "\n" + "-" + Res.b((long) (100 * (var7 * 2 + 99) / 2 * Char.myCharz().cz)), var1, 9007, (Object) null));
                                                        GameCanvas.menu.a(var11, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.d(var1.ah);
                                                    }
                                                }

                                                long var27;
                                                if (var1.ah == 3) {
                                                    if (Char.myCharz().cTiemNang < (long) ('\uc350' + Char.myCharz().cr * 1000)) {
                                                        GameCanvas.a(mResources.eG + NinjaUtil.a(Char.myCharz().cTiemNang) + mResources.eH + NinjaUtil.a((long) ('\uc350' + Char.myCharz().cr * 1000)));
                                                    } else {
                                                        var27 = 1L * (long) (2 * (var8 + 5)) / 2L * 100000L;
                                                        long var13 = 10L * (long) (2 * (var8 + 5) + 9) / 2L * 100000L;
                                                        long var15 = 100L * (long) (2 * (var8 + 5) + 99) / 2L * 100000L;
                                                        mResources.eI = mResources.eF;
                                                        (var2 = new MyVector("")).addElement(new Command(mResources.eI + "\n" + "1 " + mResources.eU + "\n" + Res.b(var27), var1, 9000, (Object) null));
                                                        var2.addElement(new Command(mResources.eI + "\n" + "10 " + mResources.eU + "\n" + Res.b(var13), var1, 9006, (Object) null));
                                                        var2.addElement(new Command(mResources.eI + "\n" + "100 " + mResources.eU + "\n" + Res.b(var15), var1, 9007, (Object) null));
                                                        GameCanvas.menu.a(var2, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.d(var1.ah);
                                                    }
                                                } else if (var1.ah == 4) {
                                                    int var28;
                                                    if ((var28 = Char.myCharz().cs) > cl.length - 1) {
                                                        var28 = cl.length - 1;
                                                    }

                                                    var27 = cl[var28];
                                                    if (Char.myCharz().cTiemNang < var27) {
                                                        GameCanvas.a(mResources.eG + Res.b(Char.myCharz().cTiemNang) + mResources.eH + Res.b(var27));
                                                    } else {
                                                        GameCanvas.a(mResources.eI + Res.a(var27) + mResources.eJ + Char.myCharz().cxx + mResources.eN, new Command(mResources.eF, var1, 9000, (Object) null), new Command(mResources.br, var1, 4007, (Object) null));
                                                    }
                                                } else if (var1.ah == 5) {
                                                    Service.gI().speacialSkill((byte) 0);
                                                }
                                            }
                                        }
                                    }

                                    if (var1.z == 3) {
                                        if (var1.B.length == 4) {
                                            var1.ag();
                                        } else {
                                            var1.bJ = null;
                                            var1.cC = null;
                                            if (var1.ah < 0) {
                                                var1.bL = -1;
                                            } else {
                                                MyVector var25;
                                                if (Char.myCharz().ai == null) {
                                                    if (var1.ah == 0) {
                                                        if (var1.bL == 0) {
                                                            var1.o.h = mResources.dp;
                                                            var1.o.a.i = mResources.dq;
                                                            var1.o.g = "";
                                                            var1.o.b = true;
                                                            var1.o.a.e = true;
                                                            var1.o.a.c(0);
                                                            if (GameCanvas.isTouch) {
                                                                var1.o.a.a();
                                                            }
                                                        } else if (var1.bL == 1) {
                                                            InfoDlg.a();
                                                            var1.o.h = mResources.ds;
                                                            var1.o.a.i = mResources.dp;
                                                            var1.o.g = "";
                                                            var1.o.b = true;
                                                            var1.o.a.c(0);
                                                            if (GameCanvas.isTouch) {
                                                                var1.o.a.a();
                                                            }

                                                            Service.gI().getClan((byte) 1, (byte) -1, (String) null);
                                                        }
                                                    } else if (var1.ah != -1) {
                                                        if (var1.ah == 1) {
                                                            if (var1.ai) {
                                                                Service.gI().searchClan("");
                                                            } else if (var1.ak && var1.bB != null) {
                                                                GameCanvas.a(mResources.du + var1.bB.c, new Command(mResources.bj, var1, 4000, var1.bB), new Command(mResources.bk, var1, 4005, var1.bB));
                                                            }
                                                        } else if (var1.ai) {
                                                            var1.bB = var1.Y();
                                                            if (var1.bB != null) {
                                                                (var25 = new MyVector("")).addElement(new Command(mResources.dw, var1, 4000, var1.bB));
                                                                var25.addElement(new Command(mResources.dx, var1, 4001, var1.bB));
                                                                GameCanvas.menu.a(var25, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                                var1.a(var1.Y());
                                                            }
                                                        } else if (var1.ak) {
                                                            var1.bD = var1.W();
                                                            if (var1.bD != null) {
                                                                (var25 = new MyVector("")).addElement(new Command(mResources.bf, var1, 8000, var1.bB));
                                                                GameCanvas.menu.a(var25, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                                GameCanvas.menu.a(var25, 0, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                                var1.a(var1.bD);
                                                            }
                                                        }
                                                    }
                                                } else if (var1.ah == 0) {
                                                    if (var1.aj) {
                                                        if (var1.bL == 0) {
                                                            if (var1.P.size() > 1) {
                                                                var1.o.h = mResources.dr;
                                                                var1.o.a.i = mResources.bm;
                                                                var1.o.g = "";
                                                                var1.o.b = true;
                                                                var1.o.a.e = true;
                                                                var1.o.a.c(0);
                                                                if (GameCanvas.isTouch) {
                                                                    var1.o.a.a();
                                                                }
                                                            } else {
                                                                var1.O = null;
                                                                var1.ai = false;
                                                                var1.ak = true;
                                                                var1.aj = false;
                                                                var1.M = var1.P.size() + 2;
                                                                var1.v();
                                                            }
                                                        }

                                                        if (var1.bL == 1) {
                                                            Service.gI().clanMessage(1, (String) null, -1);
                                                        }

                                                        if (var1.bL == 2) {
                                                            var1.O = null;
                                                            var1.ai = false;
                                                            var1.ak = true;
                                                            var1.aj = false;
                                                            var1.M = var1.P.size() + 2;
                                                            var1.v();
                                                            var1.M();
                                                        }
                                                    } else if (var1.ak) {
                                                        if (var1.bL == 0) {
                                                            var1.ai = false;
                                                            var1.ak = false;
                                                            var1.aj = true;
                                                            var1.M = nr_bx.l.size() + 2;
                                                            var1.v();
                                                        }

                                                        if (var1.bL == 1) {
                                                            if (var1.P.size() > 1) {
                                                                Service.gI().leaveClan();
                                                            } else {
                                                                var1.ai();
                                                            }
                                                        }

                                                        if (var1.bL == 2) {
                                                            if (var1.P.size() > 1) {
                                                                var1.ai();
                                                            } else {
                                                                Service.gI().getClan((byte) 3, (byte) -1, (String) null);
                                                            }
                                                        }

                                                        if (var1.bL == 3) {
                                                            Service.gI().getClan((byte) 3, (byte) -1, (String) null);
                                                        }
                                                    }
                                                } else if (var1.ah == 1) {
                                                    if (var1.ai) {
                                                        Service.gI().searchClan("");
                                                    }
                                                } else if (var1.ai) {
                                                    var1.bB = var1.Y();
                                                    if (var1.bB != null) {
                                                        (var25 = new MyVector("")).addElement(new Command(mResources.dx, var1, 4001, var1.bB));
                                                        GameCanvas.menu.a(var25, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.a(var1.Y());
                                                    }
                                                } else if (var1.ak) {
                                                    Res.out("TOI DAY 1");
                                                    var1.bD = var1.W();
                                                    if (var1.bD != null) {
                                                        var25 = new MyVector("");
                                                        Res.out("TOI DAY 2");
                                                        if (var1.O != null) {
                                                            var25.addElement(new Command(mResources.bf, var1, 8000, (Object) null));
                                                            Res.out("TOI DAY 3");
                                                        } else if (var1.P != null) {
                                                            Res.out("TOI DAY 4");
                                                            Res.out("my role= " + Char.myCharz().aj);
                                                            if (Char.myCharz().charID == var1.bD.a || Char.myCharz().aj == 2) {
                                                                var25.addElement(new Command(mResources.bf, var1, 8000, var1.bD));
                                                            }

                                                            if (Char.myCharz().aj < 2 && Char.myCharz().charID != var1.bD.a) {
                                                                Res.out("TOI DAY");
                                                                if (var1.bD.g == 0 || var1.bD.g == 1) {
                                                                    var25.addElement(new Command(mResources.bf, var1, 8000, var1.bD));
                                                                }

                                                                if (var1.bD.g == 2) {
                                                                    var25.addElement(new Command(mResources.dy, var1, 5002, var1.bD));
                                                                }

                                                                if (Char.myCharz().aj == 0) {
                                                                    var25.addElement(new Command(mResources.dz, var1, 5001, var1.bD));
                                                                    if (var1.bD.g == 1) {
                                                                        var25.addElement(new Command(mResources.dA, var1, 5003, var1.bD));
                                                                    }
                                                                }
                                                            }

                                                            if (Char.myCharz().aj < var1.bD.g) {
                                                                var25.addElement(new Command(mResources.dB, var1, 5004, var1.bD));
                                                            }
                                                        }

                                                        GameCanvas.menu.a(var25, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                        var1.a(var1.bD);
                                                    }
                                                } else if (var1.aj) {
                                                    var1.bC = var1.X();
                                                    if (var1.bC != null) {
                                                        if (var1.bC.b == 0) {
                                                            (var25 = new MyVector("")).addElement(new Command(mResources.bf, var1, 8000, var1.bC));
                                                            GameCanvas.menu.a(var25, var1.b, (var1.ah + 1) * var1.aA - var1.g + var1.ac);
                                                            var1.a(var1.bC);
                                                        } else if (var1.bC.b == 1) {
                                                            if (var1.bC.c != Char.myCharz().charID && var1.bL != -1) {
                                                                Service.gI().clanDonate(var1.bC.a);
                                                            }
                                                        } else if (var1.bC.b == 2 && var1.bC.k != null) {
                                                            if (var1.bL == 0) {
                                                                Service.gI().joinClan(var1.bC.a, (byte) 1);
                                                            } else if (var1.bL == 1) {
                                                                Service.gI().joinClan(var1.bC.a, (byte) 0);
                                                            }
                                                        }
                                                    }
                                                }

                                                if (GameCanvas.isTouch) {
                                                    var1.bL = -1;
                                                    var1.ah = -1;
                                                }
                                            }
                                        }
                                    }

                                    if (var1.z == 4) {
                                        var1.ag();
                                    }
                                } catch (Exception var17) {
                                    var17.printStackTrace();
                                }
                                break;
                            case 1:
                            case 17:
                                this.bA = null;
                                if (this.ah >= 0) {
                                    var2 = new MyVector("");
                                    if (this.z < this.aW.length - (GameCanvas.panel2 != null ? 0 : 1) && this.y != 17) {
                                        this.bA = Char.myCharz().aI[this.z][this.ah];
                                        if (this.bA != null) {
                                            if (this.bA.p) {
                                                if (this.bA.l > 0) {
                                                    var2.addElement(new Command(mResources.es + "\n" + Res.b((long) this.bA.l), this, 3005, this.bA));
                                                }
                                            } else if (this.bH == 4) {
                                                var2.addElement(new Command(mResources.ck, this, 30001, this.bA));
                                                var2.addElement(new Command(mResources.bg, this, 30002, this.bA));
                                                var2.addElement(new Command(mResources.cl, this, 30003, this.bA));
                                            } else if (this.bA.j == 0 && this.bA.k == 0) {
                                                if (this.bA.powerRequire != 0L) {
                                                    var2.addElement(new Command(mResources.er + "\n" + Res.a(this.bA.powerRequire) + " \n" + mResources.fd, this, 3004, this.bA));
                                                } else {
                                                    var2.addElement(new Command(mResources.ck + "\n" + mResources.ek, this, 3000, this.bA));
                                                }
                                            } else if (this.bH == 8) {
                                                if (this.bA.j > 0) {
                                                    var2.addElement(new Command(mResources.es + "\n" + Res.b((long) this.bA.j) + "\n" + mResources.bz, this, 30001, this.bA));
                                                }

                                                if (this.bA.k > 0) {
                                                    var2.addElement(new Command(mResources.es + "\n" + Res.b((long) this.bA.k) + "\n" + mResources.bA, this, 30002, this.bA));
                                                }
                                            } else if (this.bH != 2) {
                                                if (this.bA.j > 0) {
                                                    var2.addElement(new Command(mResources.es + "\n" + Res.b((long) this.bA.j) + "\n" + mResources.bz, this, 3000, this.bA));
                                                }

                                                if (this.bA.k > 0) {
                                                    var2.addElement(new Command(mResources.es + "\n" + Res.b((long) this.bA.k) + "\n" + mResources.bA, this, 3001, this.bA));
                                                }
                                            } else {
                                                if (this.bA.j != -1) {
                                                    var2.addElement(new Command(mResources.es + "\n" + Res.b((long) this.bA.j) + "\n" + mResources.bz, this, 10016, this.bA));
                                                }

                                                if (this.bA.k != -1) {
                                                    var2.addElement(new Command(mResources.es + "\n" + Res.b((long) this.bA.k) + "\n" + mResources.bA, this, 10017, this.bA));
                                                }
                                            }
                                        }
                                    } else if (this.bH == 0) {
                                        if (this.ah == 0) {
                                            this.a(Char.myCharz().arrItemBody.length + Char.myCharz().arrItemBag.length, false);
                                        } else {
                                            this.bA = null;
                                            if (!a(this.ah, this.bM, Char.myCharz().arrItemBody)) {
                                                if ((var21 = Char.myCharz().arrItemBag[b(this.ah, this.bM, Char.myCharz().arrItemBody)]) != null) {
                                                    this.bA = var21;
                                                }
                                            } else if ((var21 = Char.myCharz().arrItemBody[c(this.ah, this.bM)]) != null) {
                                                this.bA = var21;
                                            }

                                            if (this.bA != null) {
                                                var2.addElement(new Command(mResources.dX, this, 3002, this.bA));
                                            }
                                        }
                                    } else {
                                        if (this.y == 17) {
                                            this.bA = Char.myCharz().aI[4][this.ah];
                                        } else {
                                            this.bA = Char.myCharz().aI[this.z][this.ah];
                                        }

                                        if (this.bA.buyType == 0) {
                                            if (this.bA.isHaveOption(87)) {
                                                var2.addElement(new Command(mResources.fC, this, 10013, this.bA));
                                            } else {
                                                var2.addElement(new Command(mResources.fB, this, 10012, this.bA));
                                            }
                                        } else if (this.bA.buyType == 1) {
                                            var2.addElement(new Command(mResources.fF, this, 10014, this.bA));
                                            var2.addElement(new Command(mResources.fJ, this, 10018, this.bA));
                                        } else if (this.bA.buyType == 2) {
                                            var2.addElement(new Command(mResources.fG, this, 10015, this.bA));
                                        }
                                    }

                                    if (this.bA != null) {
                                        Char.myCharz().a(this.bA.headTemp, this.bA.bodyTemp, this.bA.legTemp, this.bA.bagTemp);
                                        GameCanvas.menu.a(var2, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                                        this.b(this.bA);
                                    } else {
                                        this.af = null;
                                    }
                                }
                                break;
                            case 2:
                                this.ao();
                                break;
                            case 3:
                                this.an();
                                break;
                            case 4:
                                if (aN != null) {
                                    aN = null;
                                }

                                TileMap.s = -1;
                                System.gc();
                                SmallImage.a();
                                this.q();
                                this.h = this.aH = 0;
                            case 5:
                            case 6:
                            case 22:
                            case 24:
                            case 25:
                            default:
                                break;
                            case 7:
                                if (this.equals(GameCanvas.panel2) && GameCanvas.panel.y == 2) {
                                    this.ao();
                                    return;
                                }

                                this.ae();
                                break;
                            case 8:
                                this.am();
                                break;
                            case 9:
                                this.ad();
                                break;
                            case 10:
                                if (this.ah != -1) {
                                    this.cj = true;
                                    this.A();
                                }
                                break;
                            case 11:
                                this.ak();
                                break;
                            case 12:
                                this.ac();
                                break;
                            case 13:
                                this.ab();
                                break;
                            case 14:
                                this.an();
                                break;
                            case 15:
                                this.aa();
                                break;
                            case 16:
                                this.aj();
                                break;
                            case 18:
                                this.al();
                                break;
                            case 19:
                                this.as();
                                break;
                            case 20:
                                this.au();
                                break;
                            case 21:
                                if (this.z == 0) {
                                    if (this.ah == -1 || this.ah > Char.myPetz().arrItemBody.length - 1) {
                                        break;
                                    }

                                    var2 = new MyVector("");
                                    var21 = Char.myPetz().arrItemBody[this.ah];
                                    this.bA = var21;
                                    if (this.bA != null) {
                                        var2.addElement(new Command(mResources.dV, this, 2006, this.bA));
                                        GameCanvas.menu.a(var2, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                                        this.b(this.bA);
                                    } else {
                                        this.af = null;
                                    }
                                }

                                if (this.z == 1 && this.ah != -1) {
                                    if (this.ah == 5) {
                                        GameCanvas.a(mResources.m, new Command(mResources.bj, 888351), new Command(mResources.bk, 2001));
                                    } else {
                                        Service.gI().h((byte) this.ah);
                                        if (this.ah < 4) {
                                            Char.myPetz().petStatus = (byte) this.ah;
                                        }
                                    }
                                }

                                if (this.z == 2) {
                                    this.ae();
                                }
                                break;
                            case 23:
                                if (this.ah != -1) {
                                    this.cz = this.ah;
                                    ((nr_ay) aq.elementAt(this.cz)).d = true;
                                    Rms.saveRMSInt(String.valueOf(((nr_ay) aq.elementAt(this.cz)).c), 1);
                                    String var3 = ((nr_ay) aq.elementAt(this.cz)).b;
                                    cA = mFont.o.a(var3, this.ad - 40);
                                    this.M = cA.length;
                                    this.aA = 16;
                                    this.ah = GameCanvas.isTouch ? -1 : 0;
                                    this.aF = this.M * this.aA - this.ae;
                                    if (this.aF < 0) {
                                        this.aF = 0;
                                    }

                                    if (this.g < 0) {
                                        this.g = this.f = 0;
                                    }

                                    if (this.g > this.aF) {
                                        this.g = this.f = this.aF;
                                    }

                                    this.y = 24;
                                    this.c(0);
                                }
                                break;
                            case 26:
                                if (this.ah != -1) {
                                    GameCanvas.panel.A();
                                }
                        }
                    }
                }

                for (int var18 = 0; var18 < nr_bx.l.size(); ++var18) {
                    ((nr_bx) nr_bx.l.elementAt(var18)).a();
                }

                this.ap();
            }
        }
    }

    private void aa() {
        if (this.ah >= -1) {
            if (this.bG) {
                Service.gI().sendTop(this.n, (byte) this.ah);
            } else {
                MyVector var1;
                (var1 = new MyVector("")).addElement(new Command(mResources.aI[0], this, 9999, (TopInfo) this.U.elementAt(this.ah)));
                GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                TopInfo var2 = (TopInfo) this.U.elementAt(this.ah);
                String var3 = "|0|1|" + var2.e;
                var3 = var3 + "\n|1|Top " + var2.h;
                var3 = var3 + "\n|1|" + var2.f;
                var3 = var3 + "\n|2|" + var2.i;
                this.af = new ChatPopup();
                this.a(this.af, var3);
                this.bJ = new int[]{var2.a, var2.d, var2.c};
                this.bA = null;
                this.cC = null;
            }
        }
    }

    private void ab() {
        if (this.z == 0 && this.equals(GameCanvas.panel)) {
            this.ae();
        } else {
            MyVector var1;
            if (this.z == 0 && this.equals(GameCanvas.panel2) || this.z == 2) {
                if (this.equals(GameCanvas.panel2)) {
                    this.bA = (Item) GameCanvas.panel2.T.elementAt(this.ah);
                } else {
                    this.bA = (Item) GameCanvas.panel.T.elementAt(this.ah);
                }

                Res.out("toi day select= " + this.ah);
                (var1 = new MyVector("")).addElement(new Command(mResources.bf, this, 8000, this.bA));
                if (this.bA != null) {
                    GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                    this.b(this.bA);
                } else {
                    this.af = null;
                }
            }

            if (this.z == 1) {
                if (this.ah == this.M - 3) {
                    if (this.aP) {
                        return;
                    }

                    if (this.o == null) {
                        this.o = new nr_cm();
                        this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                        this.o.a();
                        this.o.c = GameCanvas.panel;
                    }

                    this.o.h = mResources.dY;
                    this.o.a.i = mResources.dZ;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.a.c(1);
                    this.o.a.b(9);
                    if (GameCanvas.isTouch) {
                        this.o.a.a();
                    }
                } else if (this.ah == this.M - 2) {
                    if (!this.aQ) {
                        this.aP = !this.aP;
                        if (this.aP) {
                            Service.gI().giaodich((byte) 5, (int) -1, (byte) -1, (int) -1);
                        } else {
                            this.A();
                            InfoDlg.a();
                            Service.gI().giaodich((byte) 3, (int) -1, (byte) -1, (int) -1);
                        }
                    } else {
                        this.aQ = false;
                    }
                } else if (this.ah == this.M - 1) {
                    if (this.aP && !this.aQ && this.m) {
                        GameCanvas.a(mResources.eq, new Command(mResources.bj, this, 7002, (Object) null), new Command(mResources.bk, this, 4005, (Object) null));
                    }
                } else {
                    if (this.aP) {
                        return;
                    }

                    this.bA = (Item) GameCanvas.panel.S.elementAt(this.ah);
                    (var1 = new MyVector("")).addElement(new Command(mResources.bf, this, 8000, this.bA));
                    if (this.bA != null) {
                        GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                        this.b(this.bA);
                    } else {
                        this.af = null;
                    }
                }
            }

            if (GameCanvas.isTouch) {
                this.ah = -1;
            }

        }
    }

    private void ac() {
        if (this.z == 0) {
            if (this.ah == -1) {
                return;
            }

            if (this.k.size() == 0) {
                return;
            }

            if (this.ah == this.k.size()) {
                this.ca = -1;
                this.ah = GameCanvas.isTouch ? -1 : 0;
                InfoDlg.a();
                Service.gI().combine((byte) 1, this.k);
                return;
            }

            if (this.ah > this.k.size() - 1) {
                return;
            }

            this.bA = (Item) GameCanvas.panel.k.elementAt(this.ah);
            MyVector var1;
            (var1 = new MyVector("")).addElement(new Command(mResources.dU, this, 6001, this.bA));
            if (this.bA != null) {
                GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                this.b(this.bA);
            } else {
                this.af = null;
            }
        }

        if (this.z == 1) {
            this.ae();
        }

    }

    private void ad() {
        if (this.ah >= 0) {
            if (Char.myCharz().aD[this.ah].d && !Char.myCharz().aD[this.ah].e) {
                if (!GameCanvas.isTouch) {
                    Service.gI().getArchivemnt(this.ah);
                    return;
                }

                if (GameCanvas.o > this.ab + this.ad - 40) {
                    Service.gI().getArchivemnt(this.ah);
                }
            }

        }
    }

    private void ae() {
        Res.out("fire inventory");
        if (Char.myCharz().statusMe == 14) {
            GameCanvas.a(mResources.et);
        } else if (this.ah != -1) {
            if (this.ah == 0) {
                this.a(Char.myCharz().arrItemBody.length + Char.myCharz().arrItemBag.length, false);
            } else {
                this.bA = null;
                MyVector var1 = new MyVector("");
                Item var2;
                if (!a(this.ah, this.bM, Char.myCharz().arrItemBody)) {
                    if ((var2 = Char.myCharz().arrItemBag[b(this.ah, this.bM, Char.myCharz().arrItemBody)]) != null) {
                        this.bA = var2;
                        if (GameCanvas.panel.y == 12) {
                            var1.addElement(new Command(mResources.eu, this, 6000, this.bA));
                        } else if (GameCanvas.panel.y == 13) {
                            var1.addElement(new Command(mResources.ev, this, 7000, this.bA));
                        } else if (var2.isTypeBody()) {
                            var1.addElement(new Command(mResources.bi, this, 2000, this.bA));
                            if (Char.myCharz().havePet) {
                                var1.addElement(new Command(mResources.dW, this, 2005, this.bA));
                            }
                        } else {
                            var1.addElement(new Command(mResources.bi, this, 2001, this.bA));
                        }
                    }
                } else if ((var2 = Char.myCharz().arrItemBody[c(this.ah, this.bM)]) != null) {
                    this.bA = var2;
                    var1.addElement(new Command(mResources.dU, this, 2002, this.bA));
                }

                if (this.bA != null) {
                    Char.myCharz().a(this.bA.headTemp, this.bA.bodyTemp, this.bA.legTemp, this.bA.bagTemp);
                    if (GameCanvas.panel.y != 12 && GameCanvas.panel.y != 13) {
                        if (this.bF == 0) {
                            var1.addElement(new Command(mResources.dV, this, 2003, this.bA));
                        }

                        if (this.bF == 1) {
                            var1.addElement(new Command(mResources.dX, this, 3002, this.bA));
                        }
                    }

                    GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                    this.b(this.bA);
                } else {
                    this.af = null;
                }
            }
        }
    }

    private void af() {
        this.A();
        if (nr_ao.f == null || nr_ao.f.size() == 0) {
            Service.gI().SendRada((int) 0, (int) -1);
        }

        nr_ao.a().b();
    }

    private void ag() {
        if (this.ah >= 0) {
            if (SoundMn.a && this.ah == strTool.length - 1) {
                Service.gI().w();
            } else {
                if (!Char.myCharz().havePet) {
                    switch (this.ah) {
                        case 0:
                            this.af();
                            return;
                        case 1:
                            this.A();
                            Service.gI().openMenu((int) 54);
                            return;
                        case 2:
                            this.ah();
                            return;
                        case 3:
                            Service.gI().getFlag((byte) 0, (byte) -1);
                            InfoDlg.a();
                            return;
                        case 4:
                            if (Char.myCharz().statusMe == 14) {
                                GameCanvas.a(mResources.et);
                                return;
                            }

                            Service.gI().openUIZone();
                            return;
                        case 5:
                            GameCanvas.g();
                            if (Char.myCharz().X() < 5) {
                                GameCanvas.a(mResources.ew);
                                return;
                            }

                            if (this.o == null) {
                                this.o = new nr_cm();
                                this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                                this.o.a();
                                this.o.c = GameCanvas.panel;
                            }

                            this.o.h = mResources.ex;
                            this.o.a.i = mResources.bm;
                            this.o.g = "";
                            this.o.b = true;
                            this.o.a.c(0);
                            if (GameCanvas.isTouch) {
                                this.o.a.a();
                                return;
                            }
                            break;
                        case 6:
                            this.at();
                            return;
                        case 7:
                            this.ar();
                            return;
                        case 8:
                            nr_x.g();
                            return;
                        case 9:
                            if (GameCanvas.loginScr.isLogin2) {
                                SoundMn.gI();
                                SoundMn.h();
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                } else {
                    switch (this.ah) {
                        case 0:
                            this.af();
                            return;
                        case 1:
                            this.A();
                            Service.gI().openMenu((int) 54);
                            return;
                        case 2:
                            this.ah();
                            return;
                        case 3:
                            InfoDlg.a();
                            Service.gI().t();
                            this.bK = 20;
                            return;
                        case 4:
                            Service.gI().getFlag((byte) 0, (byte) -1);
                            InfoDlg.a();
                            return;
                        case 5:
                            if (Char.myCharz().statusMe == 14) {
                                GameCanvas.a(mResources.et);
                                return;
                            }

                            Service.gI().openUIZone();
                            return;
                        case 6:
                            GameCanvas.g();
                            if (Char.myCharz().X() < 5) {
                                GameCanvas.a(mResources.ew);
                                return;
                            }

                            if (this.o == null) {
                                this.o = new nr_cm();
                                this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                                this.o.a();
                                this.o.c = GameCanvas.panel;
                            }

                            this.o.h = mResources.ex;
                            this.o.a.i = mResources.bm;
                            this.o.g = "";
                            this.o.b = true;
                            this.o.a.c(0);
                            if (GameCanvas.isTouch) {
                                this.o.a.a();
                                return;
                            }
                            break;
                        case 7:
                            this.at();
                            return;
                        case 8:
                            this.ar();
                            return;
                        case 9:
                            nr_x.g();
                            return;
                        case 10:
                            if (GameCanvas.loginScr.isLogin2) {
                                SoundMn.gI();
                                SoundMn.h();
                            }
                    }
                }

            }
        }
    }

    private void ah() {
        this.M = aq.size();
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.y = 23;
        this.c(0);
    }

    private void ai() {
        this.o.h = mResources.dt;
        this.o.a.i = mResources.dt;
        this.o.g = "";
        this.o.b = true;
        this.o.a.e = true;
        this.o.a.c(0);
        if (GameCanvas.isTouch) {
            this.o.a.a();
        }

    }

    public final void C() {
        if (this.j == null) {
            this.j = new nr_dk();
        }

        this.j.m = this.o.a.getText();
        this.j.a(false);
        this.o.b = false;
    }

    private void b(nr_r var1) {
        String var2 = "|0|1|" + var1.c.cName;
        var2 = var2 + "\n";
        if (var1.e) {
            var2 = var2 + "|4|1|" + mResources.cJ;
        } else {
            var2 = var2 + "|3|1|" + mResources.cK;
        }

        var2 = var2 + "\n--";
        var2 = var2 + "\n|5|" + mResources.cW + ": " + var1.a;
        this.af = new ChatPopup();
        this.a(this.af, var2);
        this.cC = var1.c;
        this.bA = null;
    }

    private void aj() {
        if (this.ah >= 0) {
            if (this.vEnemy.size() != 0) {
                MyVector var1 = new MyVector("");
                this.cB = this.ah;
                var1.addElement(new Command(mResources.bn, this, 10000, (nr_r) this.vEnemy.elementAt(this.cB)));
                var1.addElement(new Command(mResources.bg, this, 10001, (nr_r) this.vEnemy.elementAt(this.cB)));
                GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                this.b((nr_r) this.vEnemy.elementAt(this.ah));
            }
        }
    }

    private void ak() {
        if (this.ah >= 0) {
            if (this.R.size() != 0) {
                MyVector var1 = new MyVector("");
                this.cB = this.ah;
                var1.addElement(new Command(mResources.bm, this, 8001, (nr_r) this.R.elementAt(this.cB)));
                var1.addElement(new Command(mResources.bg, this, 8002, (nr_r) this.R.elementAt(this.cB)));
                var1.addElement(new Command(mResources.gi, this, 8004, (nr_r) this.R.elementAt(this.cB)));
                GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                this.b((nr_r) this.R.elementAt(this.ah));
            }
        }
    }

    private void al() {
        if (this.ah >= 0) {
            MyVector var1 = new MyVector("");
            this.cB = this.ah;
            var1.addElement(new Command(mResources.bN, this, 10030, (Object) null));
            var1.addElement(new Command(mResources.bw, this, 10031, (Object) null));
            GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
        }
    }

    private void am() {
        if (this.ah == 0) {
            this.ar = !this.ar;
            Rms.saveRMSInt("viewchat", this.ar ? 1 : 0);
            if (GameCanvas.isTouch) {
                this.ah = -1;
            }

        } else if (this.ah >= 0) {
            if (this.bE.size() != 0) {
                MyVector var1 = new MyVector("");
                this.cB = this.ah - 1;
                var1.addElement(new Command(mResources.bm, this, 8001, (nr_r) this.bE.elementAt(this.cB)));
                var1.addElement(new Command(mResources.cL, this, 8003, (nr_r) this.bE.elementAt(this.cB)));
                GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                nr_r var2 = (nr_r) this.bE.elementAt(this.ah - 1);
                String var3 = "|0|1|" + var2.c.cName;
                var3 = var3 + "\n";
                var3 = var3 + "\n--";
                var3 = var3 + "\n|5|" + Res.a(var2.a, "|", 0)[2];
                this.af = new ChatPopup();
                this.a(this.af, var3);
                this.cC = var2.c;
                this.bA = null;
            }
        }
    }

    private void d(int var1) {
        String var2 = "";
        int var3 = 0;
        if (this.ah == 0) {
            var3 = Char.myCharz().cp + 1000;
        }

        if (this.ah == 1) {
            var3 = Char.myCharz().cq + 1000;
        }

        if (this.ah == 2) {
            var3 = Char.myCharz().co * Char.myCharz().cz;
        }

        if (this.ah == 3) {
            var3 = 500000 + Char.myCharz().cr * 100000;
        }

        var2 = var2 + "|5|2|" + mResources.bi + " " + var3 + " " + mResources.fd;
        if (var1 == 0) {
            var2 = var2 + "\n|5|2|" + mResources.fh;
        }

        if (var1 == 1) {
            var2 = var2 + "\n|5|2|" + mResources.fi;
        }

        if (var1 == 2) {
            var2 = var2 + "\n|5|2|" + mResources.fj;
        }

        if (var1 == 3) {
            var2 = var2 + "\n|5|2|" + mResources.fj;
        }

        this.bA = null;
        this.bJ = null;
        this.cC = null;
        this.bI = -1;
        this.af = new ChatPopup();
        this.a(this.af, var2);
    }

    private void an() {
        if (this.ah != -1) {
            Res.out("FIRE ZONE");
            this.cD = true;
            GameCanvas.panel.A();
        }
    }

    public final void a(int var1, int var2) {
        this.af.d[this.af.d.length - 1] = mResources.cV + " " + var1 + "/" + var2;
    }

    private void ao() {
        if (this.ah >= 0) {
            this.bA = null;
            MyVector var1 = new MyVector("");
            byte var2;
            if (this.z == 0 && !this.equals(GameCanvas.panel2)) {
                if (this.ah == 0) {
                    this.a(Char.myCharz().aF.length, false);
                } else {
                    var2 = (byte) c(this.ah, this.bM);
                    Item var3;
                    if ((var3 = Char.myCharz().aF[var2]) != null) {
                        if (this.ag) {
                            var1.addElement(new Command(mResources.dU, this, 1000, var3));
                            var1.addElement(new Command(mResources.bi, this, 2010, var3));
                        } else if (var3.isTypeBody()) {
                            var1.addElement(new Command(mResources.dU, this, 1000, var3));
                        } else {
                            var1.addElement(new Command(mResources.dU, this, 1000, var3));
                        }

                        this.bA = var3;
                    }
                }
            }

            if (this.z == 1 || this.equals(GameCanvas.panel2)) {
                if (this.ah == 0) {
                    this.a(Char.myCharz().arrItemBody.length + Char.myCharz().arrItemBag.length, true);
                } else {
                    Item[] var4 = Char.myCharz().arrItemBody;
                    Item var5;
                    if (!a(this.ah, this.bM, var4)) {
                        var2 = (byte) b(this.ah, this.bM, var4);
                        if ((var5 = Char.myCharz().arrItemBag[var2]) != null) {
                            var1.addElement(new Command(mResources.cy, this, 1001, var5));
                            if (var5.isTypeBody()) {
                                var1.addElement(new Command(mResources.bi, this, 2000, var5));
                            } else {
                                var1.addElement(new Command(mResources.bi, this, 2001, var5));
                            }

                            this.bA = var5;
                        }
                    } else if ((var5 = Char.myCharz().arrItemBody[c(this.ah, this.bM)]) != null) {
                        var1.addElement(new Command(mResources.cz, this, 1002, var5));
                        this.bA = var5;
                    }
                }
            }

            if (this.bA != null) {
                Char.myCharz().a(this.bA.headTemp, this.bA.bodyTemp, this.bA.legTemp, this.bA.bagTemp);
                if (this.ag) {
                    var1.addElement(new Command(mResources.dV, this, 2011, this.bA));
                }

                GameCanvas.menu.a(var1, this.b, (this.ah + 1) * this.aA - this.g + this.ac);
                this.b(this.bA);
            } else {
                this.af = null;
            }
        }
    }

    public final void a(byte var1, String var2, byte var3, byte var4) {
        GameCanvas.g();
        nr_ck var5;
        (var5 = new nr_ck()).c = var1;
        var5.a = var4;
        var5.b = var3;
        GameCanvas.a(var2, new Command(mResources.bj, this, 2004, var5), new Command(mResources.bk, this, 4005, (Object) null));
    }

    public final void a(byte var1, String var2, short var3) {
        nr_ck var4;
        (var4 = new nr_ck()).c = var1;
        var4.a = var3;
        GameCanvas.a(var2, new Command(mResources.bj, this, 3003, var4), new Command(mResources.bk, this, 4005, (Object) null));
    }

    public final void perform(int var1, Object var2) {
        if (var1 == 9999) {
            TopInfo var3 = (TopInfo) var2;
            Service.gI().u(var3.g);
        }

        if (var1 == 170391) {
            Rms.a();
            if (mGraphics.zoomLevel > 1) {
                Rms.saveRMSInt("levelScreenKN", 1);
            } else {
                Rms.saveRMSInt("levelScreenKN", 0);
            }

            GameMidlet.instance.a();
        }

        Item var6;
        if (var1 == 6001) {
            (var6 = (Item) var2).isSelect = false;
            GameCanvas.panel.k.removeElement(var6);
            if (GameCanvas.panel.z == 0) {
                GameCanvas.panel.o();
            }
        }

        int var4;
        if (var1 == 6000) {
            var6 = (Item) var2;

            for (var4 = 0; var4 < GameCanvas.panel.k.size(); ++var4) {
                if (((Item) GameCanvas.panel.k.elementAt(var4)).template.id == var6.template.id) {
                    GameCanvas.a(mResources.ef);
                    return;
                }
            }

            var6.isSelect = true;
            GameCanvas.panel.k.addElement(var6);
            if (GameCanvas.panel.z == 0) {
                GameCanvas.panel.o();
            }
        }

        if (var1 == 7000) {
            if (this.aP) {
                GameCanvas.a(mResources.eg);
                return;
            }

            var6 = (Item) var2;

            for (var4 = 0; var4 < GameCanvas.panel.S.size(); ++var4) {
                if (((Item) GameCanvas.panel.S.elementAt(var4)).indexUI == var6.indexUI) {
                    GameCanvas.a(mResources.ef);
                    return;
                }
            }

            if (var6.quantity > 1) {
                if (this.o == null) {
                    this.o = new nr_cm();
                    this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                    this.o.a();
                    this.o.c = GameCanvas.panel;
                }

                this.o.h = mResources.ec;
                this.o.a.i = mResources.ed;
                this.o.g = "";
                this.o.b = true;
                this.o.a.c(1);
                if (GameCanvas.isTouch) {
                    this.o.a.a();
                }

                return;
            }

            var6.isSelect = true;
            Item var8;
            (var8 = new Item()).template = var6.template;
            var8.itemOption = var6.itemOption;
            var8.indexUI = var6.indexUI;
            GameCanvas.panel.S.addElement(var8);
            Service.gI().giaodich((byte) 2, (int) -1, (byte) var8.indexUI, var8.quantity);
        }

        if (var1 == 7001) {
            (var6 = (Item) var2).isSelect = false;
            GameCanvas.panel.S.removeElement(var6);
            if (GameCanvas.panel.z == 1) {
                GameCanvas.panel.a(true);
            }

            Service.gI().giaodich((byte) 4, (int) -1, (byte) var6.indexUI, (int) -1);
        }

        if (var1 == 7002) {
            this.aQ = true;
            GameCanvas.g();
            Service.gI().giaodich((byte) 7, (int) -1, (byte) -1, (int) -1);
            this.A();
        }

        nr_r var7;
        if (var1 == 8003) {
            var7 = (nr_r) var2;
            Service.gI().friend((byte) 1, var7.c.charID);
        }

        if (var1 == 8002) {
            var7 = (nr_r) var2;
            Service.gI().friend((byte) 2, var7.c.charID);
        }

        if (var1 == 8004) {
            var7 = (nr_r) var2;
            Service.gI().gotoPlayer(var7.c.charID);
        }

        if (var1 == 8001) {
            Res.out("chat player");
            var7 = (nr_r) var2;
            if (this.o == null) {
                this.o = new nr_cm();
                this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                this.o.a();
                this.o.c = GameCanvas.panel;
            }

            this.o.h = mResources.cM;
            this.o.a.i = mResources.cN + " " + var7.c.cName;
            this.o.g = "";
            this.o.b = true;
            this.o.a.e = true;
            this.o.a.c(0);
            if (GameCanvas.isTouch) {
                this.o.a.a();
            }
        }

        if (var1 == 1000) {
            Service.gI().getItem((byte) 0, (byte) c(this.ah, this.bM));
        }

        byte var10;
        if (var1 == 1001) {
            var10 = (byte) b(this.ah, this.bM, Char.myCharz().arrItemBody);
            Service.gI().getItem(bh, var10);
        }

        if (var1 == 1003) {
            this.A();
        }

        if (var1 == 1002) {
            Service.gI().getItem(bi, (byte) c(this.ah, this.bM));
        }

        if (var1 == 2011) {
            Service.gI().useItem((byte) 1, (byte) 2, (byte) c(this.ah, this.bM), (short) -1);
        }

        if (var1 == 2010) {
            Service.gI().useItem((byte) 0, (byte) 2, (byte) c(this.ah, this.bM), (short) -1);
            if ((var6 = (Item) var2) != null && (var6.template.id == 193 || var6.template.id == 194)) {
                GameCanvas.panel.A();
            }
        }

        byte var9;
        if (var1 == 2000) {
            Item[] var12 = Char.myCharz().arrItemBody;
            var9 = (byte) b(this.ah, this.bM, var12);
            Service.gI().getItem(bj, var9);
        }

        byte var5;
        if (var1 == 2001) {
            Res.out("use item");
            var6 = (Item) var2;
            boolean var11;
            if (!(var11 = a(this.ah, this.bM, Char.myCharz().arrItemBody))) {
                var5 = (byte) b(this.ah, this.bM, Char.myCharz().arrItemBody);
            } else {
                var5 = (byte) c(this.ah, this.bM);
            }

            Service.gI().useItem((byte) 0, (byte) (var11 ? 0 : 1), var5, (short) -1);
            if (var6.template.id == 193 || var6.template.id == 194) {
                GameCanvas.panel.A();
            }
        }

        if (var1 == 2002) {
            Service.gI().getItem(bk, (byte) c(this.ah, this.bM));
        }

        boolean var13;
        if (var1 == 2003) {
            Res.out("remove item");
            if (!(var13 = a(this.ah, this.bM, Char.myCharz().arrItemBody))) {
                var9 = (byte) b(this.ah, this.bM, Char.myCharz().arrItemBody);
            } else {
                var9 = (byte) c(this.ah, this.bM);
            }

            Service.gI().useItem((byte) 1, (byte) (var13 ? 0 : 1), var9, (short) -1);
        }

        nr_ck var14;
        if (var1 == 2004) {
            GameCanvas.g();
            var9 = (byte) (var14 = (nr_ck) var2).b;
            var5 = (byte) var14.a;
            Service.gI().useItem((byte) (var14.c == 0 ? 3 : 2), var9, var5, (short) -1);
        }

        if (var1 == 2005) {
            var10 = (byte) b(this.ah, this.bM, Char.myCharz().arrItemBody);
            Service.gI().getItem(bl, var10);
        }

        if (var1 == 2006) {
            Char.myPetz();
            var9 = (byte) this.ah;
            Service.gI().getItem(bm, var9);
        }

        if (var1 == 30001) {
            Res.out("nhan do");
            Service.gI().buyitem((byte) 0, this.ah, (int) 0);
        }

        if (var1 == 30002) {
            Res.out("xoa do");
            Service.gI().buyitem((byte) 1, this.ah, (int) 0);
        }

        if (var1 == 30003) {
            Res.out("nhan tat");
            Service.gI().buyitem((byte) 2, this.ah, (int) 0);
        }

        if (var1 == 3000) {
            Res.out("mua do");
            var6 = (Item) var2;
            Service.gI().buyitem((byte) 0, (int) var6.template.id, (int) 0);
        }

        if (var1 == 3001) {
            var6 = (Item) var2;
            GameCanvas.K.b();
            Service.gI().buyitem((byte) 1, (int) var6.template.id, (int) 0);
        }

        if (var1 == 3002) {
            GameCanvas.g();
            if (!(var13 = a(this.ah, this.bM, Char.myCharz().arrItemBody))) {
                var9 = (byte) b(this.ah, this.bM, Char.myCharz().arrItemBody);
            } else {
                var9 = (byte) c(this.ah, this.bM);
            }

            Service.gI().saleItem((byte) 0, (byte) (var13 ? 0 : 1), (short) var9);
        }

        if (var1 == 3003) {
            GameCanvas.g();
            var14 = (nr_ck) var2;
            Service.gI().saleItem((byte) 1, (byte) var14.c, (short) var14.a);
        }

        if (var1 == 3004) {
            var6 = (Item) var2;
            Service.gI().buyitem((byte) 3, (int) var6.template.id, (int) 0);
        }

        if (var1 == 3005) {
            Res.out("mua do");
            var6 = (Item) var2;
            Service.gI().buyitem((byte) 3, (int) var6.template.id, (int) 0);
        }

        nr_eb var15;
        if (var1 == 4000 && (var15 = (nr_eb) var2) != null) {
            GameCanvas.g();
            Service.gI().clanMessage(2, (String) null, var15.a);
        }

        if (var1 == 4001 && (var15 = (nr_eb) var2) != null) {
            InfoDlg.a();
            this.al = mResources.aw;
            Service.gI().clanMember(var15.a);
        }

        if (var1 == 4005) {
            GameCanvas.g();
        }

        if (var1 == 4007) {
            GameCanvas.g();
        }

        if (var1 == 4006) {
            nr_bx var16 = (nr_bx) var2;
            Service.gI().clanDonate(var16.a);
        }

        nr_e var17;
        if (var1 == 5001) {
            var17 = (nr_e) var2;
            Service.gI().clanRemote(var17.a, (byte) 0);
        }

        if (var1 == 5002) {
            var17 = (nr_e) var2;
            Service.gI().clanRemote(var17.a, (byte) 1);
        }

        if (var1 == 5003) {
            var17 = (nr_e) var2;
            Service.gI().clanRemote(var17.a, (byte) 2);
        }

        if (var1 == 5004) {
            var17 = (nr_e) var2;
            Service.gI().clanRemote(var17.a, (byte) -1);
        }

        if (var1 == 9000) {
            Service.gI().upPotential(this.ah, (int) 1);
            GameCanvas.g();
            InfoDlg.a();
        }

        if (var1 == 9006) {
            Service.gI().upPotential(this.ah, (int) 10);
            GameCanvas.g();
            InfoDlg.a();
        }

        if (var1 == 9007) {
            Service.gI().upPotential(this.ah, (int) 100);
            GameCanvas.g();
            InfoDlg.a();
        }

        Skill var18;
        if (var1 == 9002) {
            var18 = (Skill) var2;
            GameCanvas.a(mResources.eO + var18.d + mResources.eP + var18.l + mResources.eQ);
        }

        if (var1 == 9003) {
            if (GameCanvas.isTouch) {
                GameScr.gI();
                GameScr.a((nr_en) var2);
            } else {
                GameScr.gI();
                GameScr.b((nr_en) var2);
            }
        }

        if (var1 == 9004) {
            var18 = (Skill) var2;
            GameCanvas.a(mResources.eO + var18.d + mResources.eP + var18.l + mResources.eQ);
        }

        if (var1 == 10000) {
            var7 = (nr_r) var2;
            Service.gI().enemy((byte) 1, var7.c.charID);
            GameCanvas.panel.z();
        }

        if (var1 == 10001) {
            var7 = (nr_r) var2;
            Service.gI().enemy((byte) 2, var7.c.charID);
            InfoDlg.a();
        }

        if (var1 == 10012) {
            if (this.o == null) {
                this.o = new nr_cm();
                this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                this.o.a();
                this.o.c = GameCanvas.panel2 == null ? GameCanvas.panel : GameCanvas.panel2;
            }

            if (this.bA.quantity == 1) {
                this.o.h = mResources.fD;
                this.o.a.i = mResources.dZ;
            } else {
                this.o.h = mResources.ed + " ";
                this.o.a.i = mResources.ed;
            }

            this.o.a.b(9);
            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            if (GameCanvas.isTouch) {
                this.o.a.a();
            }
        }

        if (var1 == 10013) {
            if (this.o == null) {
                this.o = new nr_cm();
                this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                this.o.a();
                this.o.c = GameCanvas.panel2 == null ? GameCanvas.panel : GameCanvas.panel2;
            }

            if (this.bA.quantity == 1) {
                this.o.h = mResources.fE;
                this.o.a.i = mResources.dZ;
            } else {
                this.o.h = mResources.ed + "  ";
                this.o.a.i = mResources.ed;
            }

            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            if (GameCanvas.isTouch) {
                this.o.a.a();
            }
        }

        if (var1 == 10014) {
            var6 = (Item) var2;
            Service.gI().kigui((byte) 1, var6.itemId, (byte) -1, -1, -1);
            InfoDlg.a();
        }

        if (var1 == 10015) {
            var6 = (Item) var2;
            Service.gI().kigui((byte) 2, var6.itemId, (byte) -1, -1, -1);
            InfoDlg.a();
        }

        if (var1 == 10016) {
            var6 = (Item) var2;
            Service.gI().kigui((byte) 3, var6.itemId, (byte) 0, var6.j, -1);
            InfoDlg.a();
        }

        if (var1 == 10017) {
            var6 = (Item) var2;
            Service.gI().kigui((byte) 3, var6.itemId, (byte) 1, var6.k, -1);
            InfoDlg.a();
        }

        if (var1 == 10018) {
            var6 = (Item) var2;
            Service.gI().kigui((byte) 5, var6.itemId, (byte) -1, -1, -1);
            InfoDlg.a();
        }

        if (var1 == 10019) {
            Session_ME.gI().e();
            Rms.a("acc", "");
            Rms.a("pass", "");
            GameCanvas.loginScr.b.a("");
            GameCanvas.loginScr.a.a("");
            GameCanvas.loginScr.isLogin2 = false;
            GameCanvas.loginScr.b();
            GameCanvas.g();
            this.A();
        }

        if (var1 == 10020) {
            GameCanvas.g();
        }

        if (var1 == 10030) {
            Service.gI().getFlag((byte) 1, (byte) this.ah);
            GameCanvas.panel.z();
        }

        if (var1 == 10031) {
            Session_ME.gI().e();
        }

        if (var1 == 11000) {
            Service.gI().kigui((byte) 0, this.bA.itemId, (byte) 1, this.bA.m, 1);
            GameCanvas.g();
        }

        if (var1 == 11001) {
            Service.gI().kigui((byte) 0, this.bA.itemId, (byte) 1, this.bA.m, this.bA.quantilyToBuy);
            GameCanvas.g();
        }

        if (var1 == 11002) {
            this.o.b = false;
            GameCanvas.g();
        }

    }

    public final void a(String var1, String var2) {
        if (this.o.a.getText() != null && !this.o.a.getText().equals("") && !var1.equals("") && var1 != null) {
            if (this.o.h.equals(mResources.dp)) {
                InfoDlg.a();
                this.o.b = false;
                Service.gI().searchClan(var1);
            } else if (this.o.h.equals(mResources.dr)) {
                InfoDlg.a();
                this.o.b = false;
                Service.gI().clanMessage(0, var1, -1);
            } else if (this.o.h.equals(mResources.ds)) {
                if (this.o.a.getText() == "") {
                    GameScr.aC.a(mResources.dC, 0);
                } else {
                    if (this.j == null) {
                        this.j = new nr_dk();
                    }

                    this.j.m = this.o.a.getText();
                    this.j.a(false);
                    this.o.b = false;
                }
            } else if (this.o.h.equals(mResources.dt)) {
                if (this.o.a.getText() == "") {
                    GameScr.aC.a(mResources.dD, 0);
                } else {
                    Service.gI().getClan((byte) 4, (byte) Char.myCharz().ai.b, this.o.a.getText());
                    this.o.b = false;
                }
            } else {
                int var7;
                if (this.o.h.equals(mResources.fT)) {
                    try {
                        var7 = Integer.parseInt(this.o.a.getText());
                        if (this.o.a.getText().length() == 6 && !this.o.a.getText().equals("")) {
                            Service.gI().v(var7);
                            this.o.b = false;
                            this.o.a.c(0);
                            this.A();
                        } else {
                            GameCanvas.a(mResources.fU);
                        }
                    } catch (Exception var3) {
                        GameCanvas.a(mResources.N);
                    }
                } else if (this.o.h.equals(mResources.ex)) {
                    if (!this.o.a.getText().equals("")) {
                        Service.gI().chatGlobal(this.o.a.getText());
                        this.o.b = false;
                        this.A();
                    }
                } else if (this.o.h.equals(mResources.cM)) {
                    this.o.b = false;
                    nr_r var8 = null;
                    if (this.y == 8) {
                        var8 = (nr_r) this.bE.elementAt(this.cB);
                    } else if (this.y == 11) {
                        var8 = (nr_r) this.R.elementAt(this.cB);
                    }

                    if (var8.c.charID != Char.myCharz().charID) {
                        Service.gI().chatPlayer(var1, var8.c.charID);
                    }
                } else if (this.o.h.equals(mResources.ec)) {
                    try {
                        var7 = Integer.parseInt(this.o.a.getText());
                    } catch (Exception var4) {
                        GameCanvas.a(mResources.ee);
                        this.o.b = false;
                        this.o.a.c(0);
                        return;
                    }

                    if (var7 > 0 && var7 <= this.bA.quantity) {
                        this.bA.isSelect = true;
                        Item var6;
                        (var6 = new Item()).template = this.bA.template;
                        var6.quantity = var7;
                        var6.indexUI = this.bA.indexUI;
                        var6.itemOption = this.bA.itemOption;
                        GameCanvas.panel.S.addElement(var6);
                        Service.gI().giaodich((byte) 2, (int) -1, (byte) var6.indexUI, var6.quantity);
                        this.o.b = false;
                        this.o.a.c(0);
                    } else {
                        GameCanvas.a(mResources.ee);
                        this.o.b = false;
                        this.o.a.c(0);
                    }
                } else if (this.o.h == mResources.dY) {
                    try {
                        var7 = Integer.parseInt(this.o.a.getText());
                    } catch (Exception var5) {
                        GameCanvas.a(mResources.ea);
                        this.o.b = false;
                        this.o.a.c(0);
                        return;
                    }

                    if ((long) var7 > Char.myCharz().as) {
                        GameCanvas.a(mResources.eb);
                        this.o.b = false;
                        this.o.a.c(0);
                    } else {
                        this.aO = var7;
                        Service.gI().giaodich((byte) 2, (int) -1, (byte) -1, var7);
                        this.o.b = false;
                        this.o.a.c(0);
                    }
                } else if (this.o.h.equals(mResources.fD)) {
                    Service.gI().kigui((byte) 0, this.bA.itemId, (byte) 0, Integer.parseInt(this.o.a.getText()), 1);
                    this.o.b = false;
                } else if (this.o.h.equals(mResources.fD + " ")) {
                    Service.gI().kigui((byte) 0, this.bA.itemId, (byte) 0, Integer.parseInt(this.o.a.getText()), this.bA.quantilyToBuy);
                    this.o.b = false;
                } else if (this.o.h.equals(mResources.fE)) {
                    this.e(0);
                    this.o.b = false;
                } else if (this.o.h.equals(mResources.fE + "  ")) {
                    this.e(1);
                    this.o.b = false;
                } else if (this.o.h.equals(mResources.ed + " ")) {
                    this.bA.quantilyToBuy = Integer.parseInt(this.o.a.getText());
                    if (this.bA.quantilyToBuy > this.bA.quantity) {
                        GameCanvas.a(mResources.ee);
                    } else {
                        this.cE = true;
                        this.o.b = false;
                    }
                } else {
                    if (this.o.h.equals(mResources.ed + "  ")) {
                        this.bA.quantilyToBuy = Integer.parseInt(this.o.a.getText());
                        if (this.bA.quantilyToBuy > this.bA.quantity) {
                            GameCanvas.a(mResources.ee);
                            return;
                        }

                        this.cF = true;
                        this.o.b = false;
                    }

                }
            }
        } else {
            this.o.b = false;
        }
    }

    public final void D() {
        this.o.a.c(0);
    }

    public final void b(int var1) {
        this.cS = var1;
        this.cH = 90;
        Item var2;
        if (this.cS == 0) {
            this.cL = 5;
            this.cI = this.cJ = 90;
            this.cR = 2;

            for (var1 = 0; var1 < this.k.size(); ++var1) {
                if ((var2 = (Item) this.k.elementAt(var1)) != null) {
                    if (var2.template.type == 14) {
                        this.cZ = var2.template.iconID;
                    } else {
                        this.ax = var2.template.iconID;
                    }
                }
            }
        } else if (this.cS == 1) {
            this.cL = 2;
            this.cI = this.cJ = 0;
            this.cR = 1;

            for (var1 = 0; var1 < this.k.size(); ++var1) {
                if ((var2 = (Item) this.k.elementAt(var1)) != null) {
                    if (var1 == 0) {
                        this.ax = var2.template.iconID;
                    } else {
                        this.cZ = var2.template.iconID;
                    }
                }
            }
        } else if (this.cS == 2) {
            this.cL = 7;
            this.cI = this.cJ = 25;
            this.cR = 1;

            for (var1 = 0; var1 < this.k.size(); ++var1) {
                if ((var2 = (Item) this.k.elementAt(var1)) != null) {
                    this.ax = var2.template.iconID;
                }
            }
        } else if (this.cS == 3) {
            this.au = GameCanvas.B;
            this.av = GameCanvas.C;
            this.cL = 1;
            this.cI = this.cJ = 1;
            this.cR = 4;

            for (var1 = 0; var1 < this.k.size(); ++var1) {
                if ((var2 = (Item) this.k.elementAt(var1)) != null) {
                    this.ax = var2.template.iconID;
                }
            }
        } else if (this.cS == 4) {
            this.cL = this.k.size();
            this.da = new short[this.cL];
            this.cI = this.cJ = 25;
            this.cR = 1;

            for (var1 = 0; var1 < this.k.size(); ++var1) {
                if ((var2 = (Item) this.k.elementAt(var1)) != null) {
                    this.da[var1] = var2.template.iconID;
                }
            }
        }

        this.cM = 1;
        this.cW = true;
        this.aw = false;
        this.cX = false;
        this.cK = 360 / this.cL;
        this.cN = new int[this.cL];
        this.cO = new int[this.cL];
        this.cP = new int[this.cL];
        this.cQ = new int[this.cL];
        this.aq();
        this.cY = true;
        this.cT = 10;
        this.cU = 30;
        this.cV = 10;
        this.a(this.at, mResources.x);
    }

    private void ap() {
        --this.cT;
        if (this.cT < 0) {
            this.cT = 0;
        }

        --this.cU;
        if (this.cU < 0) {
            this.cU = 0;
        }

        if (this.cT == 0) {
            if (!this.cX) {
                if (this.cR > 0) {
                    if (this.as != -1) {
                        if (this.cS == 3) {
                            if (GameCanvas.gameTick % 10 == 0) {
                                EffecMn.addEff(new Effect(21, this.au - 10, this.av + 25, 4, 1, 1));
                                --this.cR;
                            }
                        } else {
                            if (GameCanvas.gameTick % 2 == 0) {
                                if (this.cW) {
                                    if (this.cM < 40) {
                                        this.cM += 2;
                                    }
                                } else if (this.cM > 10) {
                                    this.cM -= 2;
                                }
                            }

                            if (this.cU == 0) {
                                if (this.cW) {
                                    if (this.cH > 0) {
                                        this.cH -= 5;
                                    } else if (GameCanvas.gameTick % 10 == 0) {
                                        this.cW = false;
                                        --this.cR;
                                        this.cU = 5;
                                        this.cV = 10;
                                    }
                                } else if (this.cH < 90) {
                                    this.cH += 5;
                                } else if (GameCanvas.gameTick % 10 == 0) {
                                    this.cW = true;
                                    this.cU = 10;
                                }
                            }

                            this.cI = this.cJ;
                            this.cI -= this.cM;
                            if (this.cI >= 360) {
                                this.cI -= 360;
                            }

                            if (this.cI < 0) {
                                this.cI += 360;
                            }

                            this.cJ = this.cI;
                            this.aq();
                        }
                    }
                } else if (GameCanvas.gameTick % 20 == 0) {
                    this.cX = true;
                }

                if (GameCanvas.gameTick % 20 == 0) {
                    if (this.cS != 3) {
                        nr_au.a(132, this.au, this.av, 2);
                    }

                    nr_au.a(114, this.au, this.av + 20, 2);
                    return;
                }
            } else if (this.cX) {
                if (this.as == 1) {
                    if (this.cV == 10) {
                        EffecMn.addEff(new Effect(22, this.au - 3, this.av + 25, 4, 1, 1));
                    }

                    --this.cV;
                    if (this.cV < 0) {
                        this.cV = 0;
                    }

                    if (this.cH < 300) {
                        this.cH = Res.g(this.cH + 10);
                        if (this.cH == 20) {
                            this.a(this.at, mResources.y);
                        }
                    } else if (GameCanvas.gameTick % 20 == 0) {
                        if (GameCanvas.z > 2 * WIDTH_PANEL) {
                            (GameCanvas.panel2 = new Panel()).tabName[7] = new String[][]{{""}};
                            GameCanvas.panel2.setTypeBodyOnly();
                            GameCanvas.panel2.show();
                        }

                        this.as = -1;
                        this.aw = true;
                        if (this.cS == 4) {
                            GameCanvas.panel.z();
                        }
                    }

                    this.aq();
                    return;
                }

                if (this.as == 0) {
                    if (this.cV == 10) {
                        if (this.cS == 2) {
                            EffecMn.addEff(new Effect(20, this.au - 3, this.av + 15, 4, 2, 1));
                        } else {
                            EffecMn.addEff(new Effect(21, this.au - 10, this.av + 25, 4, 1, 1));
                        }

                        this.a(this.at, mResources.A);
                        this.cY = false;
                    }

                    if (!this.cY) {
                        --this.cV;
                        if (this.cV < -50) {
                            this.cV = -50;
                            if (this.cS < 3 && GameCanvas.z > 2 * WIDTH_PANEL) {
                                (GameCanvas.panel2 = new Panel()).tabName[7] = new String[][]{{""}};
                                GameCanvas.panel2.setTypeBodyOnly();
                                GameCanvas.panel2.show();
                            }

                            this.as = -1;
                            this.aw = true;
                            if (this.cS == 4) {
                                GameCanvas.panel.z();
                            }
                        }
                    }
                }
            }
        }

    }

    private void aq() {
        for (int var1 = 0; var1 < this.cO.length; ++var1) {
            if (this.cI >= 360) {
                this.cI -= 360;
            }

            if (this.cI < 0) {
                this.cI += 360;
            }

            this.cO[var1] = Res.g(this.cH * Res.a(this.cI) / 1024);
            this.cN[var1] = Res.g(this.cH * Res.b(this.cI) / 1024);
            if (this.cI < 90) {
                this.cP[var1] = this.au + this.cN[var1];
                this.cQ[var1] = this.av - this.cO[var1];
            } else if (this.cI >= 90 && this.cI < 180) {
                this.cP[var1] = this.au - this.cN[var1];
                this.cQ[var1] = this.av - this.cO[var1];
            } else if (this.cI >= 180 && this.cI < 270) {
                this.cP[var1] = this.au - this.cN[var1];
                this.cQ[var1] = this.av + this.cO[var1];
            } else {
                this.cP[var1] = this.au + this.cN[var1];
                this.cQ[var1] = this.av + this.cO[var1];
            }

            this.cI -= this.cK;
        }

    }

    private void a(int var1, String var2) {
        if (this.cS < 3) {
            for (int var3 = 0; var3 < GameScr.G.size(); ++var3) {
                Npc var4;
                if ((var4 = (Npc) GameScr.G.elementAt(var3)).cW.a == var1) {
                    var4.a(var2);
                }
            }
        }

    }

    private void ar() {
        this.y = 19;
        this.c(0);
        SoundMn.gI();
        SoundMn.getStrOption();
        this.M = F.length;
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.h = this.aH = 0;
    }

    private void F(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);

        for (int var2 = 0; var2 < F.length; ++var2) {
            int var3 = this.ab;
            int var4 = this.ac + var2 * this.aA;
            int var5 = this.ad - 1;
            int var6 = this.aA - 1;
            if (var4 - this.g <= this.ac + this.ae && var4 - this.g >= this.ac - this.aA) {
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.d(var3, var4, var5, var6);
                mFont.tahoma_7b_dark.drawString(var1, F[var2], this.ab + 10, var4 + 6, 0);
            }
        }

        this.f(var1);
    }

    private void as() {
        if (this.ah >= 0) {
            switch (this.ah) {
                case 0:
                    SoundMn.gI().AuraToolOption();
                    return;
                case 1:
                    SoundMn.gI().AuraToolOption2();
                    return;
                case 2:
                    return;
                case 3:
                    SoundMn.gI().d();
                    return;
                case 4:
                    SoundMn.gI().CaseAnalog();
                case 5:
                default:
            }
        }
    }

    private void at() {
        this.y = 20;
        this.c(0);
        if (Main.typeClient == 5) {
            aY = new String[]{mResources.fS, mResources.bJ, mResources.bK, mResources.Z};
            if (GameScr.bj) {
                aY = new String[]{mResources.fS, mResources.bJ, mResources.bK, mResources.Z, mResources.l};
            }
        } else {
            aY = new String[]{mResources.fS, mResources.bJ, mResources.bK, mResources.Z, mResources.fO};
            if (GameScr.bj) {
                aY = new String[]{mResources.fS, mResources.bJ, mResources.bK, mResources.Z, mResources.fO, mResources.l};
            }

            if ((Main.typeClient == 2 || Main.typeClient == 7) && mResources.fw != 2) {
                aY = new String[]{mResources.fS, mResources.bJ, mResources.bK, mResources.Z, mResources.fO};
                if (GameScr.bj) {
                    aY = new String[]{mResources.fS, mResources.bJ, mResources.bK, mResources.Z, mResources.fO, mResources.l};
                }
            }
        }

        this.M = aY.length;
        this.aA = 24;
        this.ah = GameCanvas.isTouch ? -1 : 0;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.h = this.aH = 0;
    }

    private void G(mGraphics var1) {
        var1.e(this.ab, this.ac, this.ad, this.ae);
        var1.a(0, -this.g);

        for (int var2 = 0; var2 < aY.length; ++var2) {
            int var3 = this.ab;
            int var4 = this.ac + var2 * this.aA;
            int var5 = this.ad - 1;
            int var6 = this.aA - 1;
            if (var4 - this.g <= this.ac + this.ae && var4 - this.g >= this.ac - this.aA) {
                var1.a(var2 == this.ah ? 16383818 : 15196114);
                var1.d(var3, var4, var5, var6);
                mFont.tahoma_7b_dark.drawString(var1, aY[var2], this.ab + this.ad / 2, var4 + 6, 2);
            }
        }

        this.f(var1);
    }

    private void au() {
        if (this.ah >= 0) {
            switch (this.ah) {
                case 0:
                    GameCanvas.g();
                    if (this.o == null) {
                        this.o = new nr_cm();
                        this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                        this.o.a();
                        this.o.c = GameCanvas.panel;
                    }

                    this.o.a.a("");
                    this.o.h = mResources.fT;
                    this.o.a.i = mResources.fT;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.a.e = true;
                    this.o.a.c(1);
                    if (GameCanvas.isTouch) {
                        this.o.a.a();
                        return;
                    }
                    break;
                case 1:
                    Service.gI().friend((byte) 0, (int) -1);
                    InfoDlg.a();
                    return;
                case 2:
                    Service.gI().enemy((byte) 0, (int) -1);
                    InfoDlg.a();
                    return;
                case 3:
                    this.l();
                    if (this.o == null) {
                        this.o = new nr_cm();
                        this.o.a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
                        this.o.a();
                        this.o.c = GameCanvas.panel;
                        return;
                    }
                    break;
                case 4:
                    if (mResources.fw == 2) {
                        String var1 = "http://dragonball.indonaga.com/coda/?username=" + GameCanvas.loginScr.a.getText();
                        this.z();

                        try {
                            GameMidlet.instance.platformRequest(var1);
                            return;
                        } catch (Exception var2) {
                            var2.toString();
                            return;
                        }
                    }

                    this.z();
                    if (Char.myCharz().taskMaint.taskId <= 10) {
                        GameCanvas.a(mResources.fP);
                        return;
                    }

                    ClientInput.a().b();
                    return;
                case 5:
                    this.L();
            }

        }
    }

    public final void E() {
        this.y = 25;
        this.c(0);
        this.av();
        this.z = 0;
    }

    private void av() {
        this.aA = 24;
        this.M = Char.myCharz().aJ[this.z].length;
        this.aF = this.M * this.aA - this.ae;
        if (this.aF < 0) {
            this.aF = 0;
        }

        this.g = this.f = this.aG[this.z];
        if (this.g < 0) {
            this.g = this.f = 0;
        }

        if (this.g > this.aF) {
            this.g = this.f = this.aF;
        }

        this.ah = GameCanvas.isTouch ? -1 : 0;
    }

    public final boolean F() {
        return this.y == 1;
    }

    private void e(int var1) {
        try {
            this.bA.m = Integer.parseInt(this.o.a.getText());
        } catch (Exception var3) {
            GameCanvas.a(mResources.ea);
            this.o.b = false;
            return;
        }

        Command var4 = new Command(mResources.bj, this, var1 == 0 ? 11000 : 11001, (Object) null);
        Command var2 = new Command(mResources.bk, this, 11002, (Object) null);
        GameCanvas.a(mResources.c, var4, var2);
    }

    private static int f(int var0) {
        switch (var0) {
            case 1:
                return 2786816;
            case 2:
                return 7078041;
            case 3:
                return 12537346;
            case 4:
                return 1269146;
            case 5:
                return 13279744;
            case 6:
                return 11599872;
            default:
                return -1;
        }
    }

    private static byte g(int var0) {
        if (var0 < 0) {
            return (byte) 0;
        } else {
            switch (var0) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return (byte) 0;
                case 9:
                    return (byte) 4;
                case 10:
                    return (byte) 1;
                case 11:
                    return (byte) 5;
                case 12:
                    return (byte) 3;
                case 13:
                    return (byte) 2;
                default:
                    return (byte) 6;
            }
        }
    }

    private static mFont h(int var0) {
        mFont var1 = mFont.k;
        switch (var0) {
            case -1:
                var1 = mFont.k;
                break;
            case 0:
                var1 = mFont.tahoma_7b_dark;
                break;
            case 1:
                var1 = mFont.h;
                break;
            case 2:
                var1 = mFont.b;
                break;
            case 3:
                var1 = mFont.p;
                break;
            case 4:
                var1 = mFont.r;
                break;
            case 5:
                var1 = mFont.q;
            case 6:
            default:
                break;
            case 7:
                var1 = mFont.a;
                break;
            case 8:
                var1 = mFont.d;
        }

        return var1;
    }

    private void a(mGraphics var1, int var2, int var3, int var4, int var5) {
        if (var2 == 34) {
            if (this.de != null) {
                var1.drawImage(this.de, var3, var4 + var5 - this.de.getHeight(), 0);
            } else {
                this.de = Main.loadImage("/mainImage/o_0.png");
            }

            if (this.df != null) {
                var1.drawImage(this.df, var3, var4 + var5 - this.df.getHeight(), 0);
            } else {
                this.df = Main.loadImage("/mainImage/o_1.png");
            }
        } else if (var2 == 35) {
            if (this.de != null) {
                var1.drawImage(this.de, var3, var4 + var5 - this.de.getHeight(), 0);
            } else {
                this.de = Main.loadImage("/mainImage/o_0.png");
            }

            if (this.dg != null) {
                var1.drawImage(this.dg, var3, var4 + var5 - this.dg.getHeight(), 0);
            } else {
                this.dg = Main.loadImage("/mainImage/o_2.png");
            }
        } else {
            if (var2 == 36) {
                if (this.de != null) {
                    var1.drawImage(this.de, var3, var4 + var5 - this.de.getHeight(), 0);
                } else {
                    this.de = Main.loadImage("/mainImage/o_0.png");
                }

                if (this.dh != null) {
                    var1.drawImage(this.dh, var3, var4 + var5 - this.dh.getHeight(), 0);
                    return;
                }

                this.dh = Main.loadImage("/mainImage/o_3.png");
            }

        }
    }

    private static void a(mGraphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 == 102 && var2 > ChatPopup.r) {
            byte var19 = g(var2);
            var2 -= ChatPopup.r;
            int var10000 = var3;
            int var10001 = var4;
            mGraphics var22 = var0;
            byte var21 = var19;
            var4 = var2;
            var3 = var6;
            byte var20 = 34;
            var1 = var10001;
            int var18 = var10000;

            try {
                int var7 = ((var20 << 1) + (var3 << 1)) / var4;
                dc = db.length;
                if (var4 > 4) {
                    dc = 2;
                }

                for (int var8 = 0; var8 < var4; ++var8) {
                    for (int var9 = 0; var9 < dc; ++var9) {
                        int var10 = db[var9] > 1 ? (db[var9] >> 1) + 1 : 1;
                        var10001 = var7 * var8;
                        int var13 = GameCanvas.gameTick - (var9 << 2);
                        int var12 = var10001;
                        int var11 = var18 + ((var12 = (var13 + var12) % ((var20 << 1) + (var3 << 1))) >= 0 && var12 < var20 ? var12 % var20 : (var20 <= var12 && var12 < var20 + var3 ? var20 - var10 : (var20 + var3 <= var12 && var12 < (var20 << 1) + var3 ? var20 - (var12 - var3) % var20 - var10 : 0)));
                        var10001 = var7 * var8;
                        var13 = GameCanvas.gameTick - (var9 << 2);
                        var12 = var10001;
                        var10 = var1 + ((var12 = (var13 + var12) % ((var20 << 1) + (var3 << 1))) >= 0 && var12 < var20 ? 0 : (var20 <= var12 && var12 < var20 + var3 ? var12 % var20 : (var20 + var3 <= var12 && var12 < (var20 << 1) + var3 ? var3 - var10 : var3 - (var12 - (var20 << 1)) % var3 - var10)));
                        var22.a(dd[var21][var9]);
                        var22.d(var11, var10, db[var9], db[var9]);
                    }
                }

                return;
            } catch (Exception var17) {
                ;
            }
        }

    }

    public static mFont b(int var0, int var1) {
        switch (var0) {
            case 0:
                return mFont.c;
            case 1:
                return mFont.h;
            case 2:
            default:
                return mFont.c;
            case 3:
                return mFont.F;
            case 4:
                return mFont.b;
            case 5:
                return mFont.d;
            case 6:
                return mFont.a;
            case 7:
                return mFont.tahoma_7b_dark;
        }
    }

    private static boolean a(int var0, int var1, Item[] var2) {
        var0 = var0 - 1 + var1 * 20;
        return var1 == 0 ? var0 < var2.length : false;
    }

    private static int c(int var0, int var1) {
        return var0 - 1 + var1 * 20;
    }

    private static int b(int var0, int var1, Item[] var2) {
        return var0 - 1 + var1 * 20 - var2.length;
    }

    private boolean aw() {
        return this.y == 0 && this.z == 1 || this.y == 7 && this.z == 0;
    }

    private void ax() {
        if (this.ah >= 0) {
            if (GameCanvas.i[4]) {
                --this.bM;
                if (this.bM < 0) {
                    this.bM = 0;
                    if (GameCanvas.T) {
                        GameCanvas.T = false;
                        GameCanvas.panel.ah = 0;
                        return;
                    }
                }
            } else if (GameCanvas.i[6]) {
                ++this.bM;
                if (this.bM > this.di - 1) {
                    this.bM = this.di - 1;
                    if (GameCanvas.panel2 != null) {
                        GameCanvas.T = true;
                        GameCanvas.panel2.ah = 0;
                    }
                }
            }
        }

    }

    private void ay() {
        this.O();
        if (this.ah == 0) {
            this.ax();
        }

    }

    private int i(int var1) {
        int var2 = 20;
        int var3 = var1 / 20 + (var1 % 20 > 0 ? 1 : 0);
        this.di = (byte) var3;
        if (this.bM > var3 - 1) {
            this.bM = var3 - 1;
        }

        if (var1 % 20 > 0 && this.bM == var3 - 1) {
            var2 = var1 % 20;
        }

        ++var2;
        return var2;
    }

    private void a(int var1, boolean var2) {
        var1 = var1 / 20 + (var1 % 20 > 0 ? 1 : 0);
        int var3 = this.ab;
        this.bM = (GameCanvas.o - var3) / this.aC;
        if (this.bM > var1 - 1) {
            this.bM = var1 - 1;
        }

        if (GameCanvas.o < var3) {
            this.bM = 0;
        }

        this.b(var2);
    }
}
