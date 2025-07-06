package nro;

import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.GameScr;

public class Char implements nr_bm {

    public String xuStr;
    public String luongStr;
    public String luongKhoaStr;
    public boolean r;
    public boolean s;
    public boolean t;
    private int a;
    private int b;
    private int c;
    public boolean u;
    public PetFollow petFollow  ;
    public int w = 0;
    public static ChatPopup chatPopup;
    public long cPower;
    public Info z;
    public byte petStatus;
    public int cx = 24;
    public int cy = 24;
    public int D;
    public int E;
    public int F;
    private int d;
    public int G;
    public int statusMe = 5;
    public int I = 1;
    public int charID;
    public int cgender;
    public int ctaskId;
    public int M;
    public int N;
    public int O = 4;
    public int cDamFull;
    public int cDefull;
    public int cCriticalFull;
    public int clevel;
    public int cMP;
    public int cHP;
    private int e;
    public int V;
    public int W;
    public int cHPFull;
    public int cMPFull;
    public long cLevelPercent;
    public long cTiemNang;
    public long cNangdong;
    public int ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public String cName = "";
    public int ah;
    public nr_eb ai;
    public byte aj;
    public int ak = 22;
    public int al = 32;
    private int f = 11;
    private int g = 16;
    public Command am;
    public boolean an = true;
    public boolean ao;
    public boolean me;
    public boolean aq;
    private boolean h;
    public int ar;
    private int i;
    public long as;
    public int at;
    public int au;
    public int av;
    public nr_cu aw;
    public Command ax;
    public MyVector ay = new MyVector("vSkill");
    public MyVector az = new MyVector("vSkillFight");
    public MyVector aA = new MyVector("vEff char");
    public Skill aB;
    public NinjaUtil taskMaint;
    private boolean j = true;
    public nr_am[] aD;
    public Item[] arrItemBag;
    public Item[] aF;
    public Item[] arrItemBody;
    public Skill[] arrPetSkill;
    public Item[][] aI;
    public String[][] aJ;
    public short[][] aK;
    public byte aL;
    public byte aM;
    public int aN;
    public int aO;
    public Mob aP;
    public Mob mobMe;
    public int tMobMeBorn;
    public Npc aS;
    public Char aT;
    public ItemMap itemFocus;
    public MyVector aV = new MyVector("focus");
    public Mob[] aW;
    public Char[] aX;
    public short[] aY;
    public int aZ = -9999;
    public int ba = -9999;
    private byte k;
    public boolean bb;
    public boolean bc = true;
    public MyVector bd = new MyVector("taskOrders");
    public int cStamina;
    public static short[] bf;
    public static short[] bg;
    public String[] bh;
    public String currStrLevel;
    private static Image l = Main.loadImage("/mainImage/myTexture2dat-trai-dat.png");
    private static Image m = Main.loadImage("/mainImage/myTexture2dmat-namek.png");
    public boolean bj = false;
    public boolean bk;
    public int bl;
    public int bm;
    public long bn;
    private long n;
    public long bo;
    public boolean bp;
    public static Vector bq = new Vector();
    public static short br = 30000;
    public short bs = 0;
    public boolean bt;
    public boolean bu;
    public boolean bv;
    public boolean bw;
    private static Image cW = Main.loadImage("/mainImage/myTexture2dthucuoi10.png");
    private static Image cX = Main.loadImage("/mainImage/myTexture2dthucuoi20.png");
    private static Image cY = Main.loadImage("/mainImage/myTexture2dthucuoi21.png");
    private static Image cZ = Main.loadImage("/mainImage/myTexture2dthucuoi30.png");
    private static Image da = Main.loadImage("/mainImage/myTexture2dthucuoi11.png");
    private static Image db = Main.loadImage("/mainImage/myTexture2dthucuoi22.png");
    private static Image dc = Main.loadImage("/mainImage/myTexture2dthucuoi23.png");
    private static Image dd = Main.loadImage("/mainImage/myTexture2dthucuoi31.png");
    private static Image de = Main.loadImage("/mainImage/myTexture2drong.png");
    private static Image df = Main.loadImage("/mainImage/myTexture2dcanhrong.png");
    private byte[] dg = new byte[]{(byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 1, (byte) 1};
    private int dh;
    private int di;
    private int dj;
    private int dk;
    private int dl;
    private int dm;
    private int dn;
    private int fd_int_1;
    private int dp;
    private int dq;
    private int dr;
    private boolean ds;
    private boolean dt;
    private boolean du;
    public byte bx;
    public int by;
    public short bz;
    public short bA;
    public static final int[][][] bB;
    private static Char myChar;
    private static Char myPet;
    private int dx;
    public int bC;
    public int bD;
    public MyVector bE = new MyVector("vMovePoints");
    public static boolean bF;
    public static boolean bG;
    public static boolean bH;
    public boolean bI;
    String bJ;
    short bK;
    short bL;
    short bM;
    private long dy;
    private long dz;
    public boolean havePet = true;
    public nr_df bO;
    public int bP;
    private Effect dA = null;
    private int dB;
    private boolean dC;
    private boolean dD;
    private boolean dE;
    private boolean dF;
    private int dG;
    int bQ;
    private int dH;
    private int dI;
    private int dJ;
    private int[] dK = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
    private String dL = "mount_";
    public int headICON = -1;
    public int head;
    public int leg;
    public int body;
    public int bag;
    public int bW;
    private int dM = -1;
    public int bX = -1;
    private nr_cj dN;
    public nr_cj bY;
    public int bZ;
    private int dO;
    private int dP;
    private int dQ;
    private int dR;
    private int dS;
    private int dT;
    private int dU;
    private int dV;
    private int dW;
    private nr_cj dX = null;
    private nr_cj dY = null;
    private nr_cj dZ = null;
    public nr_dj ca = null;
    public nr_bf cb = null;
    public boolean cc = false;
    public nr_ce cd;
    public nr_ce ce;
    private nr_co[] ea;
    private int eb;
    private byte ec;
    public boolean cf = false;
    public boolean cg = false;
    public boolean ch = false;
    private int ed;
    private int ee = 0;
    private boolean ef;
    boolean ci;
    private long eg = 0L;
    private int eh;
    private boolean ei;
    private boolean ej;
    private int ek = 24;
    private int el = 24;
    private Image em;
    private boolean en;
    private boolean eo;
    public int cj;
    public int ck;
    private int ep = 0;
    private Rms eq;
    private Rms er;
    private Rms es;
    private int et = 32;
    private int eu;
    private int ev = 0;
    public static boolean cl;
    private Char ew;
    private Mob ex;
    public short cm;
    public short cn;
    public int co;
    public int cp;
    public int cq;
    public int cr;
    public int cs;
    public byte ct;
    public byte cu;
    public byte cv;
    public byte cw = 1;
    public byte cxx = 1;
    public short cMaxStamina;
    public short cz;
    public byte cA;
    public boolean cB;
    public boolean cC = false;
    public boolean meDead;
    public int cE;
    public boolean cF;
    public boolean cG;
    private boolean ey = false;
    private int ez = 0;
    private short eA;
    private short eB;
    private byte eC;
    boolean cH;
    int cI;
    public boolean cJ;
    public boolean cK;
    public boolean cL;
    public boolean cM;
    public boolean cN;
    public int cO = 100;
    public int cP;
    private int eD = -1;
    private int eE = -1;
    private int eF = -1;
    private int eG = -1;
    private MyVector eH = new MyVector("vEff");
    private static nr_cz eI;
    private int eJ = 0;
    private long eK;
    private int[] eL = new int[]{-1, -1, -1, -1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, -1, -1, -1, -1};
    private int[] eM = new int[]{-1, -1, -1, -1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, -1, -1, -1, -1};
    private int[] eN = new int[]{-1, -1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, -1, -1};
    public static int[][] cQ;
    private int eO = 0;
    private String eP = "aura_";
    public short cR = -1;
    public static boolean cS;
    public static boolean isPaintAura2;
    private nr_cz eQ;
    private nr_cz eR;
    private String eS = "set_eff_";
    public short cU = -1;
    private nr_cz eT;
    private nr_cz eU;
    private nr_cz eV;
    private nr_cz eW;
    private String eX = "hat_sau_";
    private String eY = "hat_truoc_";
    private String eZ = "ngang_";
    public short cV = -1;
    private static int[][] fa;

    static {
        Main.c("/mainImage/glass0.png");
        Main.c("/mainImage/glass1.png");
        bB = new int[][][]{{{0, -13, 34}, {1, -8, 10}, {1, -9, 16}, {1, -9, 45}}, {{0, -13, 35}, {1, -8, 10}, {1, -9, 17}, {1, -9, 46}}, {{1, -10, 33}, {2, -10, 11}, {2, -8, 16}, {1, -12, 49}}, {{1, -10, 32}, {3, -12, 10}, {3, -11, 15}, {1, -13, 47}}, {{1, -10, 34}, {4, -8, 11}, {4, -7, 17}, {1, -12, 47}}, {{1, -10, 34}, {5, -12, 11}, {5, -9, 17}, {1, -13, 49}}, {{1, -10, 33}, {6, -10, 10}, {6, -8, 16}, {1, -12, 47}}, {{0, -9, 36}, {7, -5, 17}, {7, -11, 25}, {1, -8, 49}}, {{0, -7, 35}, {0, -18, 22}, {7, -10, 25}, {1, -7, 48}}, {{1, -11, 35}, {10, -3, 25}, {12, -10, 26}, new int[3]}, {{1, -11, 37}, {11, -3, 25}, {12, -11, 27}, new int[3]}, {{0, -14, 34}, {12, -8, 21}, {9, -7, 31}, new int[3]}, {{0, -12, 35}, {8, -5, 14}, {8, -15, 29}, {1, -9, 49}}, {{1, -9, 34}, {9, -12, 9}, {10, -7, 19}, new int[3]}, {{1, -13, 34}, {9, -12, 9}, {11, -10, 19}, new int[3]}, {{1, -8, 32}, {9, -12, 9}, {2, -6, 15}, new int[3]}, {{1, -8, 32}, {9, -12, 9}, {13, -12, 16}, new int[3]}, {{0, -10, 31}, {9, -12, 9}, {7, -13, 20}, new int[3]}, {{0, -11, 32}, {9, -12, 9}, {8, -15, 26}, new int[3]}, {{0, -9, 33}, {9, -12, 9}, {14, -8, 18}, new int[3]}, {{0, -11, 33}, {9, -12, 9}, {15, -6, 19}, new int[3]}, {{0, -16, 31}, {9, -12, 9}, {9, -8, 28}, new int[3]}, {{0, -14, 34}, {1, -8, 10}, {8, -16, 28}, new int[3]}, {{0, -8, 36}, {7, -5, 17}, {0, -5, 25}, new int[3]}, {{0, -9, 31}, {9, -12, 9}, {0, -6, 20}, new int[3]}, {{2, -9, 36}, {13, -5, 17}, {16, -11, 25}, new int[3]}, {{1, -9, 34}, {8, -5, 13}, {10, -7, 19}, new int[3]}, {{1, -13, 34}, {8, -5, 13}, {11, -10, 19}, new int[3]}, {{1, -8, 32}, {8, -5, 13}, {2, -6, 15}, new int[3]}, {{1, -8, 32}, {8, -5, 13}, {13, -12, 16}, new int[3]}, {{0, -9, 33}, {8, -5, 13}, {14, -8, 18}, new int[3]}, {{0, -11, 33}, {8, -5, 13}, {15, -6, 19}, new int[3]}, {{0, -16, 32}, {8, -5, 13}, {9, -8, 29}, new int[3]}};
        int[] var10000 = new int[]{-2, -6, 22, 21, 19, 22, 10, -2, -2, 5, 19};
        var10000 = new int[]{9, 22, 25, 17, 26, 37, 36, 49, 50, 52, 36};
        String[][] var0 = new String[][]{{"1", "1", "chiêu 1", "0"}, {"2", "2", "chiêu 2", "5"}};
        int[][] var1 = new int[][]{{1, 0, 1, 1000, 40, 1, 0, 20, 0, 0, 0, 0}, {2, 1, 10, 1000, 100, 1, 0, 40, 0, 0, 0, 0}, {2, 2, 11, 800, 100, 1, 0, 45, 0, 0, 0, 0}, {2, 3, 12, 600, 100, 1, 0, 50, 0, 0, 0, 0}, {2, 4, 13, 500, 100, 1, 0, 55, 0, 0, 0, 0}, {3, 1, 14, 500, 100, 1, 0, 60, 0, 0, 0, 0}, {3, 2, 14, 500, 100, 1, 0, 60, 0, 0, 0, 0}, {3, 3, 14, 500, 100, 1, 0, 60, 0, 0, 0, 0}, {3, 4, 14, 500, 100, 1, 0, 60, 0, 0, 0, 0}, {3, 5, 14, 500, 100, 1, 0, 60, 0, 0, 0, 0}};
        cl = false;
        cQ = new int[][]{{542, 543}};
        cS = true;
        isPaintAura2 = true;
        fa = new int[][]{{5, -7}, {5, -7}, {5, -8}, {5, -7}, {5, -6}, {5, -8}, {5, -7}, {9, 0}, {11, 1}, {4, 0}, {4, -1}, {4, 8}, {6, 5}, {6, -6}, {2, -5}, {7, -8}, {7, -6}, {8, 0}, {7, 5}, {9, -7}, {7, -3}, {2, 8}, {4, 5}, {10, -5}, {9, -5}, {9, -5}, {6, -6}, {2, -5}, {7, -8}, {7, -6}, {9, -7}, {7, -3}};
    }

    public final void applyCharLevelPercent() {
        try {
            long var1 = 1L;
            long var3 = 0L;
            int var5 = 0;

            for (int var6 = GameScr.exps.length - 1; var6 >= 0; --var6) {
                if (this.cPower >= GameScr.exps[var6]) {
                    if (var6 == GameScr.exps.length - 1) {
                        var1 = 1L;
                    } else {
                        var1 = GameScr.exps[var6 + 1] - GameScr.exps[var6];
                    }

                    var3 = this.cPower - GameScr.exps[var6];
                    var5 = var6;
                    break;
                }
            }

            this.clevel = var5;
            this.cLevelPercent = (long) ((int) (var3 * 10000L / var1));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private int Y() {
        return this.aB != null ? this.aB.g : 0;
    }

    private int Z() {
        return this.aB != null ? this.aB.h : 0;
    }

    public static void taskAction(boolean var0) {
        NinjaUtil var1; 
        String var2;
        if ((var2 = (var1 = myCharz().taskMaint).g[var1.a]) != null && !var2.equals("")) {
            if (var2.startsWith("#")) {
                var2 = NinjaUtil.replace(var2, "#", "");
                Npc var3;
                (var3 = new Npc(5, 0, -100, -100, 5, GameScr.aC.a[myCharz().cgender][2])).cx = var3.cy = -100;
                var3.aN = GameScr.aC.a[myCharz().cgender][2];
                var3.charID = 5;
                if (GameCanvas.currentScreen == GameScr.c) {
                    ChatPopup.a(var2, var3);
                }
            } else if (var0) {
                GameScr.aC.a(var2, 0);
            }
        }

        GameScr.N = true;
        Res.out("TASKx " + myCharz().taskMaint.taskId);
        if (myCharz().taskMaint.taskId <= 2) {
            myCharz().an = false;
        } else {
            myCharz().an = true;
        }

        GameScr.gI().ca = null;
        if (var1.taskId == 0) {
            nr_v.f = false;
            nr_v.h = false;
            GameScr.gI().cc = null;
            GameScr.N = false;
            GameScr.gI().ca = null;
            if (var1.a < 4) {
                nr_k.j = false;
                GameScr.bn = -1;
            }

            if (var1.a == 4) {
                GameScr.bn = 1;
                nr_k.j = true;
            }

            if (var1.a >= 5) {
                GameScr.gI().cc = GameScr.gI().s;
            }
        }

        if (var1.taskId == 1) {
            GameScr.N = true;
        }

        if (var1.taskId > 0) {
            GameScr.gI().cc = GameScr.gI().s;
            GameScr.gI().ca = GameScr.gI().aQ;
        }

        if (var1.taskId >= 0) {
            Panel.ap = true;
        } else {
            Panel.ap = false;
        }

        if (var1.taskId < 12) {
            GameCanvas.panel.B = mResources.aJ;
        } else {
            GameCanvas.panel.B = mResources.aK;
        }

        GameCanvas.panel.tabName[0] = GameCanvas.panel.B;
        if (myChar.taskMaint.taskId > 10) {
            Rms.a("fake", "aa");
        }

    }

    public final String c() {
        return this.bh[this.clevel] + "+" + this.cLevelPercent / 100L + "." + this.cLevelPercent % 100L + "%";
    }

    public final int d() {
        int var1 = this.head;

        for (int var2 = 0; var2 < bf.length; ++var2) {
            if (var1 == bf[var2]) {
                return bg[var2];
            }
        }

        return -1;
    }

    public final void a(String var1, short var2, short var3, short var4) {
        this.bK = var2;
        this.bJ = var1;
        this.bL = var3;
        this.bM = var4;
        Res.out("sc= " + var4 + " max= " + var3);
        this.dy = this.dz = System.currentTimeMillis();
    }

    public final void a(String var1) {
    if ("Sư phụ ơi cho con đậu thần".equals(var1)) {
        GameScr.gI().G(); // Gọi hàm G như bạn mong muốn
    }

    if (this.z == null) {
        this.z = new Info();
    }

    this.z.a(var1, 0, (Char) null, false);
    Res.out("ad info");
}

    public Char() {
        this.statusMe = 6;
    }

    public static Char myCharz() {
        if (myChar == null) {
            (myChar = new Char()).me = true;
            myChar.ao = true;
        }

        return myChar;
    }

    public static Char myPetz() {
        if (myPet == null) {
            (myPet = new Char()).me = false;
        }

        return myPet;
    }

    public static void g() {
        myChar = null;
    }

    public final void h() {
        try {
            MyVector var1 = new MyVector("items");

            int var2;
            Item var3;
            for (var2 = 0; var2 < this.aF.length; ++var2) {
                if ((var3 = this.aF[var2]) != null && var3.template.isUpToUp) {
                    var1.addElement(var3);
                }
            }

            for (var2 = 0; var2 < var1.size(); ++var2) {
                if ((var3 = (Item) var1.elementAt(var2)) != null) {
                    for (int var4 = var2 + 1; var4 < var1.size(); ++var4) {
                        Item var5;
                        if ((var5 = (Item) var1.elementAt(var4)) != null && var3.template.equals(var5.template)) {
                            var3.quantity += var5.quantity;
                            this.aF[var5.indexUI] = null;
                            var1.setElementAt((Object) null, var4);
                        }
                    }
                }
            }

            for (var2 = 0; var2 < this.aF.length; ++var2) {
                if (this.aF[var2] != null) {
                    for (int var7 = 0; var7 <= var2; ++var7) {
                        if (this.aF[var7] == null) {
                            this.aF[var7] = this.aF[var2];
                            this.aF[var7].indexUI = var7;
                            this.aF[var2] = null;
                            break;
                        }
                    }
                }
            }

        } catch (Exception var6) {
            var6.printStackTrace();
            Res.out("Char.boxSort()");
        }
    }

    public final Skill a(nr_en var1) {
        for (int var2 = 0; var2 < this.ay.size(); ++var2) {
            if (((Skill) this.ay.elementAt(var2)).a.a == var1.a) {
                return (Skill) this.ay.elementAt(var2);
            }
        }

        return null;
    }

    public final Waypoint i() {
        NinjaUtil var1 = myChar.taskMaint;
        if (myChar.taskMaint != null && var1.taskId == 0 && var1.a < 6) {
            return null;
        } else {
            int var5 = TileMap.t.size();

            for (byte var2 = 0; var2 < var5; ++var2) {
                Waypoint var3 = (Waypoint) TileMap.t.elementAt(var2);
                if (PopUp.a.size() >= var5 && !((PopUp) PopUp.a.elementAt(var2)).j) {
                    return null;
                }

                if (this.cx >= var3.minX && this.cx <= var3.maxX && this.cy >= var3.minY && this.cy <= var3.maxY && var3.isEnter && var3.isOffline) {
                    return var3;
                }
            }

            return null;
        }
    }

    public final Waypoint j() {
        NinjaUtil var1 = myChar.taskMaint;
        if (myChar.taskMaint != null && var1.taskId == 0 && var1.a < 6) {
            return null;
        } else {
            int var5 = TileMap.t.size();

            for (byte var2 = 0; var2 < var5; ++var2) {
                Waypoint var3 = (Waypoint) TileMap.t.elementAt(var2);
                if (PopUp.a.size() >= var5 && !((PopUp) PopUp.a.elementAt(var2)).j) {
                    return null;
                }

                if (this.cx >= var3.minX && this.cx <= var3.maxX && this.cy >= var3.minY && this.cy <= var3.maxY && var3.isEnter && !var3.isOffline) {
                    return var3;
                }
            }

            return null;
        }
    }

    private boolean aa() {
        if (TileMap.f() && this.cy >= TileMap.d - 48) {
            return true;
        } else if (!this.s && !this.t) {
            int var1 = TileMap.t.size();

            for (byte var2 = 0; var2 < var1; ++var2) {
                Waypoint var3 = (Waypoint) TileMap.t.elementAt(var2);
                if ((TileMap.l == 47 || TileMap.f()) && this.cy <= var3.minY + var3.maxY && this.cx > var3.minX && this.cx < var3.maxX) {
                    if (TileMap.f() && this.aM != 0) {
                        return false;
                    }

                    return true;
                }

                if (this.cx >= var3.minX && this.cx <= var3.maxX && this.cy >= var3.minY && this.cy <= var3.maxY && !var3.isEnter) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public void a() {
        if (!this.dE) {
            if (!this.ci) {
                if (this.petFollow != null) {
                    if (GameCanvas.gameTick % 3 == 0) {
                        if (myCharz().I == 1) {
                            this.petFollow.h = this.cx - 20;
                        }

                        if (myCharz().I == -1) {
                            this.petFollow.h = this.cx + 20;
                        }

                        this.petFollow.d = this.cy - 40;
                        if (this.petFollow.i > this.cx) {
                            this.petFollow.b = -1;
                        } else {
                            this.petFollow.b = 1;
                        }

                        if (this.petFollow.h < 100) {
                            this.petFollow.h = 100;
                        }

                        if (this.petFollow.h > TileMap.c - 100) {
                            this.petFollow.h = TileMap.c - 100;
                        }
                    }

                    PetFollow var1 = this.petFollow;
                    PetFollow var2 = this.petFollow;
                    if (this.petFollow.e != var2.d) {
                        var2.g = var2.d - var2.e << 2;
                        var2.f += var2.g;
                        var2.e += var2.f >> 4;
                        var2.f &= 15;
                    }

                    if (var2.i != var2.h) {
                        var2.k = var2.h - var2.i << 2;
                        var2.j += var2.k;
                        var2.i += var2.j >> 4;
                        var2.j &= 15;
                    }

                    if (GameCanvas.gameTick % 3 == 0) {
                        var1.c = var1.o[var1.p];
                        ++var1.p;
                    }

                    if (var1.p >= var1.o.length) {
                        var1.p = 0;
                    }
                }

                if (!this.me && this.cHP <= 0 && this.ah != -100 && this.statusMe != 14 && this.statusMe != 5) {
                    this.a((short) this.cx, (short) this.cy);
                }

                int var4;
                if (this.dC) {
                    ++this.dB;
                    if (this.dB == 20) {
                        this.dB = 0;
                        this.dC = false;
                    }
                } else if (this.cP > this.cHP) {
                    if ((var4 = this.cP - this.cHP >> 1) <= 0) {
                        var4 = 1;
                    }

                    this.cP -= var4;
                } else {
                    this.cP = this.cHP;
                }

                if (this.bM != 0) {
                    this.dz = System.currentTimeMillis();
                    if (this.dz - this.dy >= 1000L) {
                        this.dy = System.currentTimeMillis();
                        --this.bM;
                    }
                }

                if (this.cM && GameCanvas.gameTick % 10 == 0) {
                    EffecMn.addEff(new Effect(41, this.cx, this.cy, 3, 1, 1));
                }

                if (this.cJ) {
                    this.cJ = false;
                    EffecMn.addEff(new Effect(39, this.cx, this.cy, 3, 3, 1));
                }

                if (this.cK && GameCanvas.gameTick % 5 == 0) {
                    ServerEffect.a(113, this, 1);
                }

                if (this.cG) {
                    var4 = this.et + 73;
                    if (GameCanvas.gameTick % 5 == 0) {
                        this.dA = new Effect(33, this.cx, var4, 3, 3, 1);
                    }

                    if (this.dA != null) {
                        this.dA.a();
                        this.dA.f = this.cx;
                        this.dA.g = var4;
                    }
                }

                if (this.aT != null && this.aT.cy < 0) {
                    this.aT = null;
                }

                if (this.cH) {
                    ++this.cI;
                }

                if (this.u && GameCanvas.gameTick % 25 == 0) {
                    ServerEffect.a(114, this, 1);
                }

                if (this.ey) {
                    ++this.ez;
                    if (this.ez == 1) {
                        this.ez = 0;
                        this.ey = false;
                        this.cx = this.eA;
                        this.cy = this.eB;
                        this.F = this.d = this.G = 0;
                        Res.out("set pox x= " + this.eA + " y= " + this.eB);
                        if (this.eC == 1) {
                            if (this.me) {
                                this.bC = this.cx;
                                this.bD = this.cy;
                            }

                            this.bO = null;
                            this.cL = false;
                            ServerEffect.addServerEffect(173, this.cx, this.cy, 1);
                        } else {
                            ServerEffect.addServerEffect(60, this.cx, this.cy, 1);
                        }

                        if ((TileMap.b(this.cx, this.cy) & 2) == 2) {
                            this.statusMe = 1;
                            return;
                        }

                        this.statusMe = 4;
                    }

                } else {
                    if (this.me && this.statusMe == 10 && this.ar == 8 && this.dH > 20 && GameCanvas.gameTick % 20 == 0) {
                        SoundMn.gI();
                    }

                    if (this.cd != null && this.C() != null && this.bZ < this.C().length) {
                        boolean var10000;
                        label1088:
                        {
                            if (this.cd != null) {
                                if (this.cd.a >= 0 && this.cd.a <= 6) {
                                    var10000 = true;
                                    break label1088;
                                }

                                if (this.cd.a >= 14 && this.cd.a <= 20) {
                                    var10000 = true;
                                    break label1088;
                                }

                                if (this.cd.a >= 28 && this.cd.a <= 34) {
                                    var10000 = true;
                                    break label1088;
                                }

                                if (this.cd.a >= 63 && this.cd.a <= 69) {
                                    var10000 = true;
                                    break label1088;
                                }
                            }

                            var10000 = false;
                        }

                        if (var10000 && (this.me || !this.me && this.cx >= GameScr.j && this.cx <= GameScr.j + GameCanvas.z) && GameCanvas.gameTick % 5 == 0) {
                            if (this.ar != 9 && this.ar != 10 && this.ar != 11) {
                                SoundMn.gI();
                            } else {
                                SoundMn.gI();
                            }
                        }
                    }

                    if (!this.cN) {
                        long var10;
                        if (this.bj) {
                            if (GameCanvas.gameTick % 5 == 0) {
                                ServerEffect.addServerEffect(113, this.cx, this.cy, 1);
                            }

                            this.ar = 23;
                            if ((var10 = System.currentTimeMillis()) - this.bo >= 1000L) {
                                --this.bm;
                                this.bo = var10;
                                if (this.bm < 0) {
                                    this.bj = false;
                                    this.bl = 0;
                                    if (this.me) {
                                        myCharz().bI = false;
                                        GameScr.gI().aX = 0;
                                        GameScr.gI().aY = false;
                                    }
                                }
                            }

                            if (TileMap.a(this.cx / TileMap.i, this.cy / TileMap.i) == 0) {
                                ++this.dH;
                                ++this.dG;
                                this.bQ += !this.dF ? 1 : -1;
                                if (this.dG == 10) {
                                    this.dG = 0;
                                    this.dF = !this.dF;
                                }
                            }

                        } else if (this.cC) {
                            this.bI = true;
                            this.ar = 17;
                            if (GameCanvas.gameTick % 5 == 0) {
                                ServerEffect.addServerEffect(154, this.cx, this.cy - 10, 2);
                            }

                            if (GameCanvas.gameTick % 5 == 0) {
                                ServerEffect.addServerEffect(1, this.cx, this.cy + 10, 1);
                            }

                            ++this.ee;
                            if (this.ee == 500) {
                                this.cC = false;
                                this.bI = false;
                            }

                        } else {
                            boolean var8;
                            if (this.ch) {
                                ++this.ee;
                                var8 = !TileMap.a(myCharz().cx, myCharz().cy, 2);
                                this.ab();
                                this.ae();
                                this.aY = null;
                                this.bO = null;
                                this.ar = 17;
                                if (var8 && this.cgender != 2) {
                                    this.ar = 12;
                                }

                                if (this.cgender == 2) {
                                    if (GameCanvas.gameTick % 3 == 0) {
                                        ServerEffect.addServerEffect(154, this.cx, this.cy - this.al / 2 + 10, 1);
                                    }

                                    if (GameCanvas.gameTick % 5 == 0) {
                                        ServerEffect.addServerEffect(114, this.cx + Res.b(-20, 20), this.cy + Res.b(-20, 20), 1);
                                    }
                                }

                                if (this.cgender == 1 && GameCanvas.gameTick % 2 == 0) {
                                    if (this.I == 1) {
                                        ServerEffect.addServerEffect(70, this.cx - 18, this.cy - this.al / 2 + 8, 1);
                                        ServerEffect.addServerEffect(70, this.cx + 23, this.cy - this.al / 2 + 15, 1);
                                    } else {
                                        ServerEffect.addServerEffect(70, this.cx + 18, this.cy - this.al / 2 + 8, 1);
                                        ServerEffect.addServerEffect(70, this.cx - 23, this.cy - this.al / 2 + 15, 1);
                                    }
                                }

                                this.n = System.currentTimeMillis();
                                if (this.n - this.bn > (long) this.bl || this.n - this.bn > 10000L) {
                                    this.B();
                                    if (this.me) {
                                        GameScr.gI().aW = 0;
                                        if (this.cgender == 2) {
                                            myCharz().b(GameScr.u[myCharz().aB.b], !var8 ? 0 : 1);
                                            Service.gI().skill_not_focus((byte) 8);
                                        }

                                        if (this.cgender == 1) {
                                            this.cc = true;
                                            myCharz().a(GameScr.u[myCharz().aB.b], !var8 ? 0 : 1);
                                        }
                                    } else if (this.cgender == 2) {
                                        this.b(GameScr.u[this.aO], !var8 ? 0 : 1);
                                    }

                                    Res.out("24234234234 status= " + this.statusMe + " hp= " + this.cHP);
                                    if (this.cgender == 2 && this.statusMe != 14 && this.statusMe != 5) {
                                        Res.out("ASDSADSD");
                                        GameScr.gI().b(this.cx, this.cy);
                                    }
                                }

                                ++this.ee;
                                if (this.ee == 500) {
                                    this.B();
                                }

                            } else if (this.cg) {
                                this.ab();
                                this.ae();
                                this.aY = null;
                                this.bO = null;
                                ++this.ed;
                                if (TileMap.a(this.cx, this.cy - this.al, 8192)) {
                                    this.B();
                                } else {
                                    if (this.ed == 20) {
                                        this.bn = System.currentTimeMillis();
                                    }

                                    if (this.ed > 20) {
                                        this.n = System.currentTimeMillis();
                                        if (this.n - this.bn <= (long) this.bl && this.n - this.bn <= 10000L) {
                                            this.ar = 32;
                                            if (this.cgender == 0 && GameCanvas.gameTick % 3 == 0) {
                                                ServerEffect.addServerEffect(153, this.cx, this.cy - this.al, 2);
                                            }

                                            ++this.ee;
                                            if (this.ee == 500) {
                                                this.B();
                                            }

                                        } else {
                                            this.cg = false;
                                            if (this.me) {
                                                this.cc = true;
                                                var8 = TileMap.a(myCharz().cx, myCharz().cy, 2);
                                                this.cf = true;
                                                myCharz().a(GameScr.u[myCharz().aB.b], var8 ? 0 : 1);
                                            }

                                        }
                                    } else {
                                        if (this.statusMe != 14) {
                                            this.statusMe = 3;
                                        }

                                        this.E = -3;
                                        this.cy += this.E;
                                        this.ar = 7;
                                    }
                                }
                            } else {
                                int var5;
                                if (this.me && GameCanvas.isTouch) {
                                    if (this.aT != null && this.aT.charID >= 0 && this.aT.cx > 100 && this.aT.cx < TileMap.c - 100 && this.j() == null && this.i() == null && !this.H() && TileMap.l != 51 && TileMap.l != 52 && GameCanvas.panel.Q.size() > 0 && GameScr.gI().bQ == null) {
                                        var4 = Math.abs(this.cx - this.aT.cx);
                                        var5 = Math.abs(this.cy - this.aT.cy);
                                        if (var4 < 60 && var5 < 40) {
                                            if (this.am == null) {
                                                this.am = new Command(mResources.be, 11111);
                                                this.am.isPlaySoundButton = false;
                                            }

                                            this.am.x = this.aT.cx - GameScr.j;
                                            this.am.y = this.aT.cy - this.aT.al - 30 - GameScr.k;
                                        } else {
                                            this.am = null;
                                        }
                                    } else {
                                        this.am = null;
                                    }
                                }

                                if (this.bc) {
                                    this.G();
                                }

                                if (!this.s) {
                                    if (this.z != null) {
                                        this.z.b();
                                    }

                                    if (this.c > 0) {
                                        --this.c;
                                    }

                                    if (this.k > 0 && GameCanvas.gameTick % 2 == 0) {
                                        --this.k;
                                        if (this.k == 30 || this.k == 60) {
                                            this.k = 0;
                                        }
                                    }

                                    this.ae();
                                    int var3;
                                    if (this.mobMe != null) {
                                        if (this.tMobMeBorn != 0) {
                                            --this.tMobMeBorn;
                                        }

                                        if (this.tMobMeBorn == 0) {
                                            this.mobMe.t = this.I == 1 ? this.cx - 30 : this.cx + 30;
                                            this.mobMe.u = this.cy - 60;
                                            var5 = this.mobMe.t - this.mobMe.m;
                                            var3 = this.mobMe.u - this.mobMe.n;
                                            this.mobMe.m += var5 / 4;
                                            this.mobMe.n += var3 / 4;
                                            this.mobMe.o = this.I;
                                        }
                                    }

                                    if (this.ca != null) {
                                        this.ca.a();
                                    }

                                    if (this.cb != null) {
                                        this.cb.a();
                                    }

                                    this.ab();
                                    if (this.cE != 0) {
                                        if (GameCanvas.gameTick % 5 == 0) {
                                            EffecMn.addEff(new Effect(32, this.cx, this.cy + 24, 3, 5, 1));
                                        }

                                    } else if (!this.cK) {
                                        if (!this.cM) {
                                            if (this.cF) {
                                                if (this.ew != null && (this.ew.statusMe == 14 || this.ew.statusMe == 5)) {
                                                    this.O();
                                                }

                                                if (this.ex != null && this.ex.p == 1) {
                                                    this.O();
                                                }

                                                if (this.me && this.statusMe == 2 && this.bO != null) {
                                                    this.cF = false;
                                                    this.ew = null;
                                                    this.ex = null;
                                                }

                                                if (TileMap.a(this.cx, this.cy, 2)) {
                                                    this.ar = 16;
                                                } else {
                                                    this.ar = 31;
                                                }
                                            } else {
                                                if (this.cHP > 0) {
                                                    for (var4 = 0; var4 < this.aA.size(); ++var4) {
                                                        nr_dv var6 = (nr_dv) this.aA.elementAt(var4);
                                                        if (GameCanvas.x) {
                                                            this.cHP += var6.a;
                                                            this.cMP += var6.a;
                                                        }
                                                    }

                                                    if (this.V > 0 && GameCanvas.y) {
                                                        this.cHP += this.V;
                                                    }

                                                    if (this.W > 0 && GameCanvas.y) {
                                                        this.cMP += this.W;
                                                    }

                                                    if (this.cHP > this.cHPFull) {
                                                        this.cHP = this.cHPFull;
                                                    }

                                                    if (this.cMP > this.cMPFull) {
                                                        this.cMP = this.cMPFull;
                                                    }
                                                }

                                                if (this.ao) {
                                                    GameScr.l = this.cx - GameScr.f;
                                                    GameScr.m = this.cy - GameScr.g - 1;
                                                    if (!GameCanvas.f) {
                                                        GameScr.l += GameScr.i * this.I;
                                                    }
                                                }

                                                this.i = (this.i + 1) % 100;
                                                if (this.me) {
                                                    if (this.aT != null && !GameScr.D.contains(this.aT)) {
                                                        this.aT = null;
                                                    }

                                                    if (this.cx < 10) {
                                                        this.D = 0;
                                                        this.cx = 10;
                                                    } else if (this.cx > TileMap.c - 10) {
                                                        this.cx = TileMap.c - 10;
                                                        this.D = 0;
                                                    }

                                                    if (this.me && !bF && this.aa()) {
                                                        Service.gI().g();
                                                        if (TileMap.b()) {
                                                            Service.gI().getMapOffline();
                                                            bF = true;
                                                        } else {
                                                            Service.gI().requestChangeMap();
                                                        }

                                                        bG = true;
                                                        bF = true;
                                                        GameCanvas.f();
                                                        GameCanvas.e();
                                                        InfoDlg.a();
                                                        return;
                                                    }

                                                    if (this.statusMe != 4 && Res.g(this.cx - this.bC) + Res.g(this.cy - this.bD) >= 70 && this.cy - this.bD <= 0 && this.me) {
                                                        Service.gI().g();
                                                    }

                                                    if (this.bI) {
                                                        this.bO = null;
                                                    }

                                                    if (this.bO != null) {
                                                        if (b(this.cx - this.bO.a) <= 16 && b(this.cy - this.bO.b) <= 16) {
                                                            this.cx = (this.bO.a + this.cx) / 2;
                                                            this.cy = this.bO.b;
                                                            this.bO = null;
                                                            GameScr.c.aU = false;
                                                            this.ac();
                                                            this.D = this.E = 0;
                                                            if ((TileMap.b(this.cx, this.cy) & 2) == 2) {
                                                                this.statusMe = 1;
                                                            } else {
                                                                this.al();
                                                                this.ar();
                                                            }

                                                            Service.gI().g();
                                                        } else {
                                                            this.I = this.bO.a > this.cx ? 1 : -1;
                                                            if (TileMap.a(this.cx, this.cy, 2)) {
                                                                this.statusMe = 2;
                                                                if (this.bO != null) {
                                                                    this.D = this.O * this.I;
                                                                    this.E = 0;
                                                                }

                                                                if (b(this.cx - this.bO.a) <= 10) {
                                                                    if (this.bO.b > this.cy) {
                                                                        if (this.bO.b > this.cy) {
                                                                            var8 = false;
                                                                            byte var7;
                                                                            if (this.I == 1) {
                                                                                var7 = 1;
                                                                            } else {
                                                                                var7 = -1;
                                                                            }

                                                                            for (var3 = 0; var3 < 2; ++var3) {
                                                                                if (TileMap.a(this.bO.a + this.f * var7, this.cy + this.g * var3, 2)) {
                                                                                    var8 = true;
                                                                                    break;
                                                                                }
                                                                            }

                                                                            if (var8) {
                                                                                this.bO = null;
                                                                                GameScr.c.aU = false;
                                                                                this.statusMe = 1;
                                                                                this.D = this.E = 0;
                                                                                this.ac();
                                                                            } else {
                                                                                SoundMn.gI();
                                                                                this.cx = this.bO.a;
                                                                                this.statusMe = 10;
                                                                                this.E = -5;
                                                                                this.D = 0;
                                                                                Res.out("Jum lun");
                                                                            }
                                                                        }
                                                                    } else {
                                                                        SoundMn.gI();
                                                                        this.cx = this.bO.a;
                                                                        this.statusMe = 10;
                                                                        this.E = -5;
                                                                        this.D = 0;
                                                                    }
                                                                }

                                                                if (this.I == 1) {
                                                                    if (TileMap.a(this.cx + this.f, this.cy - this.g, 4)) {
                                                                        this.D = this.O * this.I;
                                                                        this.statusMe = 10;
                                                                        this.E = -5;
                                                                    }
                                                                } else if (TileMap.a(this.cx - this.f - 1, this.cy - this.g, 8)) {
                                                                    this.D = this.O * this.I;
                                                                    this.statusMe = 10;
                                                                    this.E = -5;
                                                                }
                                                            } else {
                                                                if (this.bO.b < this.cy + 10) {
                                                                    this.statusMe = 10;
                                                                    this.E = -5;
                                                                    if (b(this.cy - this.bO.b) <= 10) {
                                                                        this.cy = this.bO.b;
                                                                        this.E = 0;
                                                                    }

                                                                    if (b(this.cx - this.bO.a) <= 10) {
                                                                        this.D = 0;
                                                                    } else {
                                                                        this.D = this.O * this.I;
                                                                    }
                                                                } else if (TileMap.a(this.cx, this.cy, 2)) {
                                                                    this.bO = null;
                                                                    GameScr.c.aU = false;
                                                                    this.statusMe = 1;
                                                                    this.D = this.E = 0;
                                                                    this.ac();
                                                                } else {
                                                                    if (this.statusMe == 10 || this.statusMe == 2) {
                                                                        this.E = 0;
                                                                    }

                                                                    this.statusMe = 4;
                                                                }

                                                                if (this.bO.b > this.cy) {
                                                                    if (this.I == 1) {
                                                                        if (TileMap.a(this.cx + this.f, this.cy - this.g, 4)) {
                                                                            this.D = this.E = 0;
                                                                            this.statusMe = 4;
                                                                            this.bO = null;
                                                                            GameScr.c.aU = false;
                                                                            this.ac();
                                                                        }
                                                                    } else if (TileMap.a(this.cx - this.f - 1, this.cy - this.g, 8)) {
                                                                        this.D = this.E = 0;
                                                                        this.statusMe = 4;
                                                                        this.bO = null;
                                                                        GameScr.c.aU = false;
                                                                        this.ac();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                    this.as();
                                                } else {
                                                    this.ad();
                                                    if (this.statusMe == 1 || this.statusMe == 6) {
                                                        label959:
                                                        {
                                                            var8 = false;
                                                            if (this.bO != null) {
                                                                if (b(this.bO.a - this.cx) < 17 && b(this.bO.b - this.cy) < 25) {
                                                                    this.cx = this.bO.a;
                                                                    this.cy = this.bO.b;
                                                                    this.bO = null;
                                                                    if ((TileMap.b(this.cx, this.cy) & 2) == 2) {
                                                                        this.statusMe = 1;
                                                                        this.G = 0;
                                                                        GameCanvas.a().a(-1, this.cx - -8, this.cy);
                                                                        GameCanvas.a().a(1, this.cx - 8, this.cy);
                                                                    } else {
                                                                        this.statusMe = 4;
                                                                        this.E = 0;
                                                                        this.F = 0;
                                                                    }

                                                                    var8 = true;
                                                                    break label959;
                                                                }

                                                                if (this.eu != 10 && this.ar != 8 || this.bE.size() <= 0) {
                                                                    if (this.cy == this.bO.b) {
                                                                        if (this.cx != this.bO.a) {
                                                                            this.cx = (this.cx + this.bO.a) / 2;
                                                                            this.ar = GameCanvas.gameTick % 5 + 2;
                                                                        }
                                                                    } else if (this.cy < this.bO.b) {
                                                                        this.ar = 12;
                                                                        this.cx = (this.cx + this.bO.a) / 2;
                                                                        if (this.E < 0) {
                                                                            this.E = 0;
                                                                        }

                                                                        this.cy += this.E;
                                                                        if ((TileMap.b(this.cx, this.cy) & 2) == 2) {
                                                                            GameCanvas.a().a(-1, this.cx - -8, this.cy);
                                                                            GameCanvas.a().a(1, this.cx - 8, this.cy);
                                                                        }

                                                                        ++this.E;
                                                                        if (this.E > 16) {
                                                                            this.cy = (this.cy + this.bO.b) / 2;
                                                                        }
                                                                    } else {
                                                                        this.ar = 7;
                                                                        this.cx = (this.cx + this.bO.a) / 2;
                                                                        this.cy = (this.cy + this.bO.b) / 2;
                                                                    }
                                                                    break label959;
                                                                }
                                                            }

                                                            var8 = true;
                                                        }

                                                        if (var8 && this.bE.size() > 0) {
                                                            this.bO = (nr_df) this.bE.firstElement();
                                                            this.bE.removeElementAt(0);
                                                            if (this.bO.c == 2) {
                                                                if ((TileMap.b(this.cx, this.cy + 12) & 2) != 2) {
                                                                    this.statusMe = 10;
                                                                    this.F = 0;
                                                                    this.d = 0;
                                                                    this.D = -(this.cx - this.bO.a) / 10;
                                                                    this.E = -(this.cy - this.bO.b) / 10;
                                                                    if (this.cx - this.bO.a > 0) {
                                                                        this.I = -1;
                                                                    } else if (this.cx - this.bO.a < 0) {
                                                                        this.I = 1;
                                                                    }
                                                                } else {
                                                                    this.statusMe = 2;
                                                                    if (this.cx - this.bO.a > 0) {
                                                                        this.I = -1;
                                                                    } else if (this.cx - this.bO.a < 0) {
                                                                        this.I = 1;
                                                                    }

                                                                    this.D = this.O * this.I;
                                                                    this.E = 0;
                                                                }
                                                            } else if (this.bO.c == 3) {
                                                                if ((TileMap.b(this.cx, this.cy + 23) & 2) != 2) {
                                                                    this.statusMe = 10;
                                                                    this.F = 0;
                                                                    this.d = 0;
                                                                    this.D = -(this.cx - this.bO.a) / 10;
                                                                    this.E = -(this.cy - this.bO.b) / 10;
                                                                    if (this.cx - this.bO.a > 0) {
                                                                        this.I = -1;
                                                                    } else if (this.cx - this.bO.a < 0) {
                                                                        this.I = 1;
                                                                    }
                                                                } else {
                                                                    this.statusMe = 3;
                                                                    GameCanvas.a().a(-1, this.cx - -8, this.cy);
                                                                    GameCanvas.a().a(1, this.cx - 8, this.cy);
                                                                    if (this.cx - this.bO.a > 0) {
                                                                        this.I = -1;
                                                                    } else if (this.cx - this.bO.a < 0) {
                                                                        this.I = 1;
                                                                    }

                                                                    this.D = b(this.cx - this.bO.a) / 10 * this.I;
                                                                    this.E = -10;
                                                                }
                                                            } else if (this.bO.c == 4) {
                                                                this.statusMe = 4;
                                                                if (this.cx - this.bO.a > 0) {
                                                                    this.I = -1;
                                                                } else if (this.cx - this.bO.a < 0) {
                                                                    this.I = 1;
                                                                }

                                                                this.D = b(this.cx - this.bO.a) / 9 * this.I;
                                                                this.E = 0;
                                                            } else {
                                                                this.cx = this.bO.a;
                                                                this.cy = this.bO.b;
                                                                this.bO = null;
                                                            }
                                                        }
                                                    }
                                                }

                                                switch (this.statusMe) {
                                                    case 1:
                                                        this.aq = false;
                                                        this.h = false;
                                                        this.D = 0;
                                                        this.E = 0;
                                                        ++this.F;
                                                        if (this.F > 30) {
                                                            this.F = 0;
                                                        }

                                                        if (this.F % 15 < 5) {
                                                            this.ar = 0;
                                                        } else {
                                                            this.ar = 1;
                                                        }

                                                        this.au();
                                                        if (!this.me) {
                                                            ++this.G;
                                                            if (this.G > 50) {
                                                                this.G = 0;
                                                                this.bO = null;
                                                            }
                                                        }

                                                        this.ai();
                                                        if (this.me && GameScr.D.size() != 0 && TileMap.l == 50) {
                                                            Char var9;
                                                            if (!(var9 = (Char) GameScr.D.elementAt(0)).dD) {
                                                                if (var9.statusMe != 2) {
                                                                    var9.b(this.cx - 45, this.cy, 0);
                                                                }

                                                                System.currentTimeMillis();
                                                                if (Res.g(this.cx - 45 - var9.cx) <= 10) {
                                                                    var9.dD = true;
                                                                }
                                                            } else {
                                                                if (var9.statusMe != 2) {
                                                                    var9.b(this.cx + 45, this.cy, 0);
                                                                }

                                                                System.currentTimeMillis();
                                                                if (Res.g(this.cx + 45 - var9.cx) <= 10) {
                                                                    var9.dD = false;
                                                                }
                                                            }

                                                            if (GameCanvas.gameTick % 100 == 0) {
                                                                var9.a("Cắc cùm cum");
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        var5 = this.cA == 1 && !this.me ? 2 : 1;
                                                        if (this.cx >= GameScr.j && this.cx <= GameScr.j + GameCanvas.z) {
                                                            if (this.cA == 0) {
                                                                SoundMn.gI();
                                                            } else {
                                                                SoundMn.gI();
                                                            }
                                                        }

                                                        this.dH = 0;
                                                        this.bj = false;
                                                        if (this.bk) {
                                                            this.bk = false;
                                                            SoundMn.gI();
                                                            Service.gI().skill_not_focus((byte) 3);
                                                        }

                                                        var3 = 0;
                                                        if (!this.me && this.bO != null) {
                                                            var3 = b(this.cx - this.bO.a);
                                                        }

                                                        ++this.F;
                                                        if (this.F >= 10) {
                                                            this.F = 0;
                                                            this.N = 0;
                                                        }

                                                        this.ar = (this.F >> 1) + 2;
                                                        if ((TileMap.b(this.cx, this.cy - 1) & 64) == 64) {
                                                            this.cx += this.D * var5 >> 1;
                                                        } else {
                                                            this.cx += this.D * var5;
                                                        }

                                                        if (this.I == 1) {
                                                            if (TileMap.a(this.cx + this.f, this.cy - this.g, 4)) {
                                                                if (this.me) {
                                                                    this.D = 0;
                                                                    this.cx = TileMap.f(this.cx + this.f) - this.f;
                                                                } else {
                                                                    this.aj();
                                                                }
                                                            }
                                                        } else if (TileMap.a(this.cx - this.f - 1, this.cy - this.g, 8)) {
                                                            if (this.me) {
                                                                this.D = 0;
                                                                this.cx = TileMap.f(this.cx - this.f - 1) + TileMap.i + this.f;
                                                            } else {
                                                                this.aj();
                                                            }
                                                        }

                                                        if (this.me) {
                                                            if (this.D > 0) {
                                                                --this.D;
                                                            } else if (this.D < 0) {
                                                                ++this.D;
                                                            } else {
                                                                if (this.cx - this.bC != 0 && this.me) {
                                                                    Service.gI().g();
                                                                }

                                                                this.statusMe = 1;
                                                                this.N = 0;
                                                            }
                                                        }

                                                        if ((TileMap.b(this.cx, this.cy) & 2) != 2) {
                                                            if (this.me) {
                                                                if (this.cx - this.bC != 0 || this.cy - this.bD != 0) {
                                                                    Service.gI().g();
                                                                }

                                                                this.ar = 7;
                                                                this.statusMe = 4;
                                                                this.bP = 0;
                                                                this.D = 3 * this.I;
                                                                this.d = 0;
                                                            } else {
                                                                this.aj();
                                                            }
                                                        }

                                                        if (!this.me && this.bO != null && b(this.cx - this.bO.a) > var3) {
                                                            this.aj();
                                                        }

                                                        GameCanvas.a().a(this.I, this.cx - (this.I << 3), this.cy);
                                                        this.au();
                                                        this.d(2);
                                                        break;
                                                    case 3:
                                                        this.ak();
                                                        break;
                                                    case 4:
                                                        this.am();
                                                        break;
                                                    case 5:
                                                        this.bj = false;
                                                        if (this.bk) {
                                                            this.bk = false;
                                                            SoundMn.gI();
                                                            Service.gI().skill_not_focus((byte) 3);
                                                        }

                                                        ++this.F;
                                                        this.cx += (this.d - this.cx) / 4;
                                                        if (this.F > 7) {
                                                            this.cy += (this.G - this.cy) / 4;
                                                        } else {
                                                            this.cy += this.F - 10;
                                                        }

                                                        if (Res.g(this.d - this.cx) < 4 && Res.g(this.G - this.cy) < 10) {
                                                            this.cx = this.d;
                                                            this.cy = this.G;
                                                            this.statusMe = 14;
                                                            if (this.me) {
                                                                GameScr.gI().q();
                                                                Service.gI().g();
                                                            }
                                                        }

                                                        this.ar = 23;
                                                        break;
                                                    case 6:
                                                        if (this.ec <= 0) {
                                                            this.ar = 0;
                                                        } else if (this.eu == 10) {
                                                            this.cx += this.D;
                                                        } else if (this.ar <= 1) {
                                                            ++this.F;
                                                            if (this.F > 6) {
                                                                this.ar = 0;
                                                            } else {
                                                                this.ar = 1;
                                                            }

                                                            if (this.F > 10) {
                                                                this.F = 0;
                                                            }
                                                        }

                                                        if (this.ar != 7 && this.ar != 12 && (TileMap.b(this.cx, this.cy + 1) & 2) != 2) {
                                                            this.D = 0;
                                                            this.E = 0;
                                                            this.statusMe = 4;
                                                            this.ar = 7;
                                                        }

                                                        if (!this.me) {
                                                            ++this.G;
                                                            if (this.G > 10) {
                                                                if ((TileMap.b(this.cx, this.cy + 1) & 2) != 2) {
                                                                    this.cy += 5;
                                                                } else {
                                                                    this.ar = 0;
                                                                }
                                                            }

                                                            if (this.G > 50) {
                                                                this.G = 0;
                                                                this.bO = null;
                                                            }
                                                        }
                                                    case 7:
                                                    case 8:
                                                    case 11:
                                                    case 13:
                                                    case 15:
                                                    default:
                                                        break;
                                                    case 9:
                                                        this.ah();
                                                        break;
                                                    case 10:
                                                        this.an();
                                                        break;
                                                    case 12:
                                                        this.ag();
                                                        break;
                                                    case 14:
                                                        ++this.F;
                                                        if (this.F > 30) {
                                                            this.F = 0;
                                                        }

                                                        if (this.F % 15 < 5) {
                                                            this.ar = 0;
                                                        } else {
                                                            this.ar = 1;
                                                        }
                                                        break;
                                                    case 16:
                                                        this.af();
                                                }

                                                if (this.ec > 0) {
                                                    this.ar = 23;
                                                    --this.ec;
                                                }

                                                if (this.cm != 0 || this.cn != 0) {
                                                    this.a(this.cm, this.cn);
                                                    this.cm = 0;
                                                    this.cn = 0;
                                                }

                                                if (this.aY != null) {
                                                    if (this.aY[0] == 0) {
                                                        ++this.aY[0];
                                                        ServerEffect.a(60, this, 1);
                                                    } else if (this.aY[0] < 10) {
                                                        ++this.aY[0];
                                                    } else {
                                                        this.cx = this.aY[1];
                                                        this.cy = this.aY[2];
                                                        this.aY = null;
                                                        ServerEffect.a(60, this, 1);
                                                        if (this.me) {
                                                            if ((TileMap.b(this.cx, this.cy) & 2) != 2) {
                                                                this.statusMe = 4;
                                                                myCharz().b(GameScr.u[38], 1);
                                                            } else {
                                                                Service.gI().g();
                                                                myCharz().b(GameScr.u[38], 0);
                                                            }
                                                        }
                                                    }
                                                }

                                                if (this.statusMe != 10) {
                                                    this.bQ = 0;
                                                }

                                                if (this.bk) {
                                                    this.ar = 17;
                                                    if (GameCanvas.gameTick % 4 == 0) {
                                                        ServerEffect.addServerEffect(1, this.cx, this.cy + GameCanvas.Z, 1);
                                                    }

                                                    if (this.me && (var10 = System.currentTimeMillis()) - this.bn >= 1000L) {
                                                        Res.out("%= " + this.aB.k);
                                                        this.bn = var10;
                                                        this.cHP += this.cHPFull * this.aB.k / 100;
                                                        this.cMP += this.cMPFull * this.aB.k / 100;
                                                        if (this.cHP < this.cHPFull) {
                                                            GameScr.a("+" + this.cHPFull * this.aB.k / 100 + " " + mResources.eR, this.cx, this.cy - this.al - 20, 0, -1, 9);
                                                        }

                                                        if (this.cMP < this.cMPFull) {
                                                            GameScr.a("+" + this.cMPFull * this.aB.k / 100 + " " + mResources.eS, this.cx, this.cy - this.al - 20, 0, -2, 10);
                                                        }

                                                        Service.gI().skill_not_focus((byte) 2);
                                                    }
                                                }

                                                if (this.bp) {
                                                    if (this.me) {
                                                        bG = true;
                                                        this.statusMe = 3;
                                                        this.E = -8;
                                                        if (this.cy <= TileMap.d - 240) {
                                                            this.bp = false;
                                                            bG = false;
                                                            this.statusMe = 4;
                                                        }
                                                    } else {
                                                        this.statusMe = 3;
                                                        this.E = -8;
                                                        if (this.cy <= TileMap.d - 240) {
                                                            this.E = 0;
                                                            this.bp = false;
                                                            this.E = 0;
                                                            this.statusMe = 1;
                                                        }
                                                    }
                                                }

                                                this.ao();
                                                this.aw();
                                                if (this.head == 934) {
                                                    if (GameCanvas.b - this.eK > 0L) {
                                                        ++this.eJ;
                                                        if (this.eJ > this.eN.length - 1) {
                                                            this.eJ = 0;
                                                            this.eK = GameCanvas.b + (long) Res.b(2000, 3500);
                                                            this.eN = this.eM;
                                                            if (Res.d(2) == 0) {
                                                                this.eN = this.eL;
                                                            }
                                                        }
                                                    } else {
                                                        this.eJ = 0;
                                                    }
                                                }

                                                if (f(this.head)) {
                                                    ++this.eO;
                                                    if (this.eO <= 10000) {
                                                        return;
                                                    }
                                                }

                                                this.eO = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void ab() {
        if (this.ea != null) {
            for (int var1 = 0; var1 < this.ea.length; ++var1) {
                if (this.ea[var1] != null) {
                    if (this.ea[var1].b != null) {
                        if (!this.ea[var1].e) {
                            this.ea[var1].b.d();
                            this.ea[var1].b.U = this;
                            if (this.me) {
                                myCharz();
                                myCharz();
                                boolean var2 = true;
                                (new Random()).nextInt(11);
                            }

                            int var3 = this.ea[var1].b.w >> 1;
                            if (this.ea[var1].b.u()) {
                                var3 = this.ea[var1].b.getY() + 20;
                            }

                            GameScr.a(this.ea[var1].b.m, this.ea[var1].b.n - var3, this.I);
                            this.ea[var1].e = true;
                        }
                    } else if (this.ea[var1].c != null && !this.ea[var1].e) {
                        if (this.ea[var1].c.charID >= 0) {
                            this.ea[var1].c.J();
                        }

                        GameScr.a(this.ea[var1].c.cx, this.ea[var1].c.cy - (this.ea[var1].c.al >> 1), this.I);
                        this.ea[var1].e = true;
                    }

                    ++this.ea[var1].a;
                    if (this.ea[var1].a >= this.ea[var1].d.a.length) {
                        this.ea[var1] = null;
                    }
                }
            }
        }

        if (this.bX >= 0 && this.bY != null && GameCanvas.gameTick % 2 == 0) {
            ++this.bX;
            if (this.bX >= this.bY.a.length) {
                this.bX = -1;
                this.bY = null;
            }
        }

    }

    private void ac() {
        if (this.ax != null) {
            Command var1 = this.ax;
            this.ax = null;
            var1.performAction();
        }

    }

    private void ad() {
        if (GameCanvas.gameTick % 20 == 0 && this.charID >= 0) {
            this.j = true;

            int var1;
            for (var1 = 0; var1 < GameScr.D.size(); ++var1) {
                Char var2 = null;

                try {
                    var2 = (Char) GameScr.D.elementAt(var1);
                } catch (Exception var4) {
                    ;
                }

                if (var2 != null && !var2.equals(this) && (var2.cy == this.cy && Res.g(var2.cx - this.cx) < 35 || this.cy - var2.cy < 32 && this.cy - var2.cy > 0 && Res.g(var2.cx - this.cx) < 24)) {
                    this.j = false;
                }
            }

            for (var1 = 0; var1 < GameScr.G.size(); ++var1) {
                Npc var5 = null;

                try {
                    var5 = (Npc) GameScr.G.elementAt(var1);
                } catch (Exception var3) {
                    ;
                }

                if (var5 != null && var5.cy == this.cy && Res.g(var5.cx - this.cx) < 24) {
                    this.j = false;
                }
            }
        }

    }

    private void ae() {
        if (this.statusMe != 14 && this.statusMe != 5) {
            if (this.cd != null && (this.aT != null && this.c(this.aT) && this.aT.statusMe == 14 || this.aP != null && this.aP.p == 0)) {
                if (!this.me) {
                    if ((TileMap.b(this.cx, this.cy) & 2) == 2) {
                        this.statusMe = 1;
                    } else {
                        this.statusMe = 6;
                    }

                    this.G = 0;
                }

                this.bZ = 0;
                this.cd = null;
                this.ce = null;
                this.dX = this.dY = this.dZ = null;
                this.dO = this.dP = this.dQ = 0;
                this.aP = null;
                this.aT = null;
                this.ea = null;
                this.bO = null;
                this.ca = null;
                if ((TileMap.b(this.cx, this.cy) & 2) != 2) {
                    this.bP = 5;
                }
            }

            if (this.cd != null && this.ca == null && this.C() != null && this.bZ >= this.C().length) {
                if (!this.me) {
                    if ((TileMap.b(this.cx, this.cy) & 2) == 2) {
                        this.statusMe = 1;
                    } else {
                        this.statusMe = 6;
                    }

                    this.G = 0;
                }

                this.bZ = 0;
                this.cd = null;
                this.ce = null;
                this.dX = this.dY = this.dZ = null;
                this.dO = this.dP = this.dQ = 0;
                this.ca = null;
                if ((TileMap.b(this.cx, this.cy) & 2) != 2) {
                    this.bP = 5;
                }
            }

            nr_f[] var1;
            if ((var1 = this.C()) != null && this.bZ >= 0 && this.bZ <= var1.length - 1) {
                if (var1[this.bZ].b != 0) {
                    this.dX = GameScr.y[var1[this.bZ].b - 1];
                    this.dO = this.dR = this.dU = 0;
                }

                if (var1[this.bZ].e != 0) {
                    this.dY = GameScr.y[var1[this.bZ].e - 1];
                    this.dP = this.dS = this.dV = 0;
                }

                if (var1[this.bZ].h != 0) {
                    this.dZ = GameScr.y[var1[this.bZ].h - 1];
                    this.dQ = this.dT = this.dW = 0;
                }

                int var3 = this.bZ;
                if (var1 != null && var1[var3] != null && var3 >= 0 && var3 <= var1.length - 1 && var1[var3].k != 0) {
                    int var4;
                    if ((var4 = var1[var3].k) >= 100) {
                        nr_bm var5;
                        if(this.aP == null) {
                            var5 = this.aT;
                        }
                        else {
                            var5 = this.aP;
                        }
                        if (var5 != null) {
                            int var6 = Res.g(((nr_bm) var5).getX() - this.cx);
                            int var7 = Res.g(((nr_bm) var5).getY() - this.cy);
                            byte var10;
                            if (var6 > var7 * 4) {
                                var10 = 0;
                            } else {
                                if (((nr_bm) var5).getY() < this.cy) {
                                    var10 = -3;
                                } else {
                                    var10 = 3;
                                }

                                nr_by var9;
                                if (var5 instanceof nr_by && (var9 = (nr_by) var5).b) {
                                    var10 = -20;
                                }
                            }

                            this.cb = new nr_bf(this, var4 - 100, this.ce, this.cx + (var1[var3].l - 10) * this.I, this.cy + var1[var3].m + var10);
                            if (this.aB != null) {
                                if (this.aB.a.a == 1) {
                                    SoundMn.gI();
                                } else if (this.aB.a.a == 3) {
                                    SoundMn.gI();
                                } else if (this.aB.a.a == 5) {
                                    SoundMn.gI();
                                } else if (this.aB.a.a == 11) {
                                    SoundMn.gI();
                                }
                            }
                        } else if (this.cg || this.cf) {
                            this.B();
                        }
                    } else {
                        this.ca = new nr_dj(this, GameScr.v[var4 - 1]);
                        this.ca.a = 10;
                        this.ca.b = this.cx + var1[var3].l;
                        this.ca.c = this.cy + var1[var3].m;
                    }
                }

                if ((this.aP != null || !this.me && this.aT != null || this.me && this.aT != null && (this.c(this.aT) || this.x()) && this.ca == null && this.cb == null) && this.bZ == var1.length - 1) {
                    this.D();
                }

                if (!this.me) {
                    Object var8 = null;
                    if (this.aP != null) {
                        var8 = this.aP;
                    } else if (this.aT != null) {
                        var8 = this.aT;
                    }

                    if (var8 != null) {
                        if (Res.g(((nr_bm) var8).getX() - this.cx) < 10) {
                            if (((nr_bm) var8).getX() > this.cx) {
                                this.cx -= 10;
                            } else {
                                this.cx += 10;
                            }
                        }

                        if (((nr_bm) var8).getX() > this.cx) {
                            this.I = 1;
                            return;
                        }

                        this.I = -1;
                    }
                }
            }

        }
    }

    public final void a(int var1, int var2) {
        InfoDlg.hide();
        Res.out("REST POINT x= " + var1 + " y= " + var2);
        this.bO = null;
        if (this.cy - var2 == 0) {
            this.cx = var1;
            bF = false;
            bG = false;
        } else {
            this.statusMe = 16;
            this.d = var1;
            this.G = var2;
            this.F = 0;
            myCharz().bC = var1;
            myCharz().bD = var2;
        }
    }

    private void af() {
        InfoDlg.hide();
        GameCanvas.clearAllPointerEvent();
        this.bO = null;
        ++this.F;
        this.cx += (this.d - this.cx) / 4;
        if (this.F > 7) {
            this.cy += (this.G - this.cy) / 4;
        } else {
            this.cy += this.F - 10;
        }

        if (Res.g(this.d - this.cx) < 4 && Res.g(this.G - this.cy) < 10) {
            this.cx = this.d;
            this.cy = this.G;
            this.statusMe = 1;
            this.G = 0;
            bF = false;
            Service.gI().g();
        }

        this.ar = 23;
    }

    private void ag() {
        this.dH = 0;
        ++this.F;
        if (this.I == 1) {
            if ((TileMap.b(this.cx + this.f, this.cy - this.g) & 4) == 4) {
                this.D = 0;
            }
        } else if ((TileMap.b(this.cx - this.f, this.cy - this.g) & 8) == 8) {
            this.D = 0;
        }

        if (this.cy > this.al && TileMap.a(this.cx, this.cy - this.al + 24, 8192)) {
            if (!TileMap.a(this.cx, this.cy, 2)) {
                this.statusMe = 4;
                this.F = 0;
                this.d = 0;
                this.E = 1;
            } else {
                this.cy = TileMap.e(this.cy);
            }
        }

        this.cx += this.D;
        this.cy += this.E;
        if (this.cy < 0) {
            this.cy = this.E = 0;
        }

        if (this.E == 0) {
            if ((TileMap.b(this.cx, this.cy) & 2) != 2) {
                this.statusMe = 4;
                this.D = (this.O >> 1) * this.I;
                this.F = this.d = 0;
            }
        } else if (this.E < 0) {
            ++this.E;
            if (this.E == 0) {
                this.E = 1;
            }
        } else {
            if (this.E < 20 && this.F % 5 == 0) {
                ++this.E;
            }

            if (this.E > 3) {
                this.E = 3;
            }

            if ((TileMap.b(this.cx, this.cy + 3) & 2) == 2 && this.cy <= TileMap.f(this.cy + 3)) {
                this.D = this.E = 0;
                this.cy = TileMap.f(this.cy + 3);
            }
        }

        if (this.D > 0) {
            --this.D;
        } else {
            if (this.D < 0) {
                ++this.D;
            }

        }
    }

    private void ah() {
        this.bj = false;
        if (this.bk) {
            this.bk = false;
            SoundMn.gI();
            Service.gI().skill_not_focus((byte) 3);
        }

        this.cx += this.D * this.I;
        this.cy += this.dx;
        ++this.dx;
        if (this.F == 0) {
            this.ar = 7;
        } else {
            this.ar = 23;
        }

        if (this.dx == -3) {
            this.ar = 8;
        } else if (this.dx == -2) {
            this.ar = 9;
        } else if (this.dx == -1) {
            this.ar = 10;
        } else if (this.dx == 0) {
            this.ar = 11;
        }

        if (this.dx == 0) {
            this.statusMe = 6;
            this.G = 0;
            ((nr_df) this.bE.firstElement()).c = 4;
            this.F = 0;
            this.E = 1;
        }

    }

    public void k() {
        this.dE = true;
        EffecMn.addEff(new Effect(107, this.cx, this.cy + 25, 3, 15, 1));
    }

    public final void r() {
        this.dE = false;
        EffecMn.addEff(new Effect(107, this.cx, this.cy + 25, 3, 10, 1));
    }

    private void ai() {
        if (!GameCanvas.panel.a) {
            if (!this.cB) {
                if (!this.cH) {
                    if (!this.ey) {
                        if (!this.en && !this.eo) {
                            if (!GameCanvas.lowGraphic) {
                                if (this.cA != 1) {
                                    if (this.me) {
                                        if (!cS && this.cR >= 0) {
                                            return;
                                        }
                                    } else if (this.cR >= 0) {
                                        return;
                                    }

                                    ++this.dH;
                                    if (this.clevel < 14) {
                                        if (this.clevel >= 9 && !GameCanvas.lowGraphic && (this.dH == 40 || this.dH == 50)) {
                                            GameCanvas.a().a(-1, this.cx - -8, this.cy);
                                            GameCanvas.a().a(1, this.cx - 8, this.cy);
                                            this.d(1);
                                        }

                                        if (this.dH > 50 && this.clevel >= 9) {
                                            if (this.cgender == 0) {
                                                if (GameCanvas.gameTick % 25 == 0) {
                                                    ServerEffect.a(114, this, 1);
                                                }

                                                if (this.clevel >= 13 && GameCanvas.gameTick % 4 == 0) {
                                                    ServerEffect.a(132, this, 1);
                                                }
                                            }

                                            if (this.cgender == 1) {
                                                if (GameCanvas.gameTick % 4 == 0) {
                                                    ServerEffect.a(132, this, 1);
                                                }

                                                if (this.clevel >= 13 && GameCanvas.gameTick % 7 == 0) {
                                                    ServerEffect.a(131, this, 1);
                                                }
                                            }

                                            if (this.cgender == 2) {
                                                if (GameCanvas.gameTick % 7 == 0) {
                                                    ServerEffect.a(131, this, 1);
                                                }

                                                if (this.clevel >= 13 && GameCanvas.gameTick % 25 == 0) {
                                                    ServerEffect.a(114, this, 1);
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void aj() {
        this.statusMe = 6;
        this.G = 0;
        this.D = 0;
        this.E = 0;
        this.F = this.d = 0;
    }

    private static int b(int var0) {
        return var0 > 0 ? var0 : -var0;
    }

    private void ak() {
        this.aq();
        this.d(3);
        this.dH = 0;
        this.bj = false;
        if (this.bk) {
            this.bk = false;
            SoundMn.gI();
            Service.gI().skill_not_focus((byte) 3);
        }

        this.cx += this.D;
        this.cy += this.E;
        if (this.cy < 0) {
            this.cy = 0;
            this.E = -1;
        }

        ++this.E;
        if (this.E > 0) {
            this.E = 0;
        }

        if (!this.me && this.bO != null) {
            label93:
            {
                int var1;
                if ((var1 = this.bO.a - this.cx) > 0) {
                    if (this.D > var1) {
                        this.D = var1;
                    }

                    if (this.D >= 0) {
                        break label93;
                    }
                } else if (var1 < 0) {
                    if (this.D < var1) {
                        this.D = var1;
                    }

                    if (this.D <= 0) {
                        break label93;
                    }
                }

                this.D = var1;
            }
        }

        if (this.I == 1) {
            if ((TileMap.b(this.cx + this.f, this.cy - 1) & 4) == 4 && this.cx <= TileMap.f(this.cx + this.f) + 12) {
                this.cx = TileMap.f(this.cx + this.f) - this.f;
                this.D = 0;
            }
        } else if ((TileMap.b(this.cx - this.f, this.cy - 1) & 8) == 8 && this.cx >= TileMap.f(this.cx - this.f) + 12) {
            this.cx = TileMap.f(this.cx + 24 - this.f) + this.f;
            this.D = 0;
        }

        if (this.E == 0) {
            if (this.me) {
                this.al();
            } else {
                this.aj();
            }
        }

        if (this.me && !bF && this.aa()) {
            Service.gI().g();
            if (TileMap.b()) {
                bF = true;
                Service.gI().getMapOffline();
            } else {
                Service.gI().requestChangeMap();
            }

            bG = true;
            bF = true;
            GameCanvas.f();
            GameCanvas.e();
            InfoDlg.a();
        } else {
            if (this.statusMe != 16 && (TileMap.a(this.cx, this.cy - this.al + 24, 8192) || this.cy < 0)) {
                this.statusMe = 4;
                this.F = 0;
                this.d = 0;
                this.E = 1;
                this.bP = 0;
                if (this.cy < 0) {
                    this.cy = 0;
                }

                this.cy = TileMap.e(this.cy + 25);
                GameCanvas.f();
            }

            if (this.G < 0) {
                ++this.G;
            }

            this.ar = 7;
            if (!this.me && this.bO != null && this.cy < this.bO.b) {
                this.aj();
            }

        }
    }

    private void al() {
        this.e = this.cy;
        this.F = 0;
        this.d = 0;
        this.statusMe = 10;
        this.D = this.I << 2;
        this.E = 0;
        this.cy = TileMap.e(this.cy) + 12;
        if (this.me && (this.cx - this.bC != 0 || this.cy - this.bD != 0) && (Res.g(myCharz().cx - myCharz().bC) > 96 || Res.g(myCharz().cy - myCharz().bD) > 24)) {
            Service.gI().g();
        }

    }

    private void am() {
        if (!this.cF) {
            this.dH = 0;
            if (this.cy + 4 >= TileMap.d) {
                this.statusMe = 1;
                if (this.me) {
                    SoundMn.gI();
                }

                this.D = this.E = 0;
                this.G = 0;
            } else {
                if (this.cy % 24 == 0 && (TileMap.b(this.cx, this.cy) & 2) == 2) {
                    this.bP = 0;
                    if (this.me) {
                        if (this.cy - this.bD > 0 || this.cx - this.bC != 0 || this.cy - this.bD < 0) {
                            Service.gI().g();
                        }

                        this.D = this.E = 0;
                        this.F = this.d = 0;
                        this.statusMe = 1;
                        this.G = 0;
                        return;
                    }

                    this.aj();
                    this.ar = 0;
                    GameCanvas.a().a(-1, this.cx - -8, this.cy);
                    GameCanvas.a().a(1, this.cx - 8, this.cy);
                    this.d(1);
                }

                if (this.bP > 0) {
                    --this.bP;
                    if (this.bP % 10 > 5) {
                        ++this.cy;
                    } else {
                        --this.cy;
                    }
                } else {
                    if (this.E < -4) {
                        this.ar = 7;
                    } else {
                        this.ar = 12;
                    }

                    this.cx += this.D;
                    if (!this.me && this.bO != null) {
                        label132:
                        {
                            int var1;
                            if ((var1 = this.bO.a - this.cx) > 0) {
                                if (this.D > var1) {
                                    this.D = var1;
                                }

                                if (this.D >= 0) {
                                    break label132;
                                }
                            } else if (var1 < 0) {
                                if (this.D < var1) {
                                    this.D = var1;
                                }

                                if (this.D <= 0) {
                                    break label132;
                                }
                            }

                            this.D = var1;
                        }
                    }

                    ++this.E;
                    if (this.E > 8) {
                        this.E = 8;
                    }

                    if (this.ce == null) {
                        this.cy += this.E;
                    }

                    if (this.I == 1) {
                        if ((TileMap.b(this.cx + this.f, this.cy - 1) & 4) == 4 && this.cx <= TileMap.f(this.cx + this.f) + 12) {
                            this.cx = TileMap.f(this.cx + this.f) - this.f;
                            this.D = 0;
                        }
                    } else if ((TileMap.b(this.cx - this.f, this.cy - 1) & 8) == 8 && this.cx >= TileMap.f(this.cx - this.f) + 12) {
                        this.cx = TileMap.f(this.cx + 24 - this.f) + this.f;
                        this.D = 0;
                    }

                    if (this.E > 3 && (this.e == 0 || this.e <= TileMap.e(this.cy + 3)) && (TileMap.b(this.cx, this.cy + 3) & 2) == 2) {
                        if (this.me) {
                            this.e = 0;
                            this.D = this.E = 0;
                            this.F = this.d = 0;
                            this.cy = TileMap.f(this.cy + 3);
                            this.statusMe = 1;
                            if (this.me) {
                                SoundMn.gI();
                            }

                            this.G = 0;
                            GameCanvas.a().a(-1, this.cx - -8, this.cy);
                            GameCanvas.a().a(1, this.cx - 8, this.cy);
                            this.d(1);
                            if (this.cy - this.bD > 0) {
                                if (this.me) {
                                    Service.gI().g();
                                    return;
                                }
                            } else if ((this.cx - this.bC != 0 || this.cy - this.bD < 0) && this.me) {
                                Service.gI().g();
                                return;
                            }
                        } else {
                            this.aj();
                            this.cy = TileMap.f(this.cy + 3);
                            this.ar = 0;
                            GameCanvas.a().a(-1, this.cx - -8, this.cy);
                            GameCanvas.a().a(1, this.cx - 8, this.cy);
                            this.d(1);
                        }

                    } else {
                        this.ar = 12;
                        if (!this.me) {
                            if ((TileMap.b(this.cx, this.cy + 1) & 2) == 2) {
                                this.ar = 0;
                            }

                            if (this.bO != null && this.cy > this.bO.b) {
                                this.aj();
                            }
                        }

                    }
                }
            }
        }
    }

    private void an() {
        int var1 = this.cA == 1 && !this.me ? 2 : 1;
        this.aq();
        if (this.statusMe != 16 && (TileMap.a(this.cx, this.cy - this.al + 24, 8192) || this.cy < 0)) {
            if (this.cy - this.al < 0) {
                this.cy = this.al;
            }

            this.ar = 7;
            this.statusMe = 4;
            this.D = 0;
            this.d = 0;
            this.bO = null;
        } else {
            int var2 = this.cy;
            ++this.F;
            if (this.F >= 9) {
                this.F = 0;
                if (!this.me) {
                    this.D = this.E = 0;
                }

                this.N = 0;
            }

            this.ar = 8;
            if (Res.g(this.D) <= 4 && this.me) {
                if (this.bO != null) {
                    int var3 = b(this.cx - this.bO.a);
                    int var4 = b(this.cy - this.bO.b);
                    if (var3 > var4 * 10) {
                        this.ar = 8;
                    } else if (var3 > var4 && var3 > 48 && var4 > 32) {
                        this.ar = 8;
                    } else {
                        this.ar = 7;
                    }
                } else {
                    if (this.E < 0) {
                        this.E = 0;
                    }

                    if (this.E > 16) {
                        this.E = 16;
                    }

                    this.ar = 7;
                }
            }

            if (!this.me) {
                if (b(this.D) < 2) {
                    this.D = (this.I << 1) * var1;
                }

                if (this.E != 0) {
                    this.ar = 7;
                }

                if (b(this.D) <= 2) {
                    ++this.d;
                    if (this.d > 32) {
                        this.statusMe = 4;
                        this.D = 0;
                        this.E = 0;
                    }
                }
            }

            if (this.I == 1) {
                if (TileMap.a(this.cx + this.f, this.cy - 1, 4)) {
                    this.D = 0;
                    this.cx = TileMap.f(this.cx + this.f) - this.f;
                    if (this.E == 0) {
                        this.bO = null;
                    }
                }
            } else if (TileMap.a(this.cx - this.f - 1, this.cy - 1, 8)) {
                this.D = 0;
                this.cx = TileMap.f(this.cx - this.f - 1) + TileMap.i + this.f;
                if (this.E == 0) {
                    this.bO = null;
                }
            }

            this.cx += this.D * var1;
            this.cy += this.E * var1;
            if (!this.dt && var2 - this.cy == 0) {
                ++this.dH;
                ++this.dG;
                this.bQ += !this.dF ? 1 : -1;
                if (this.dG == 10) {
                    this.dG = 0;
                    this.dF = !this.dF;
                }

                if (this.dH > 20) {
                    this.bP = 10;
                    if (GameCanvas.gameTick % 3 == 0) {
                        ServerEffect.a(111, this.cx + (this.I == 1 ? -17 : 27), this.cy + this.bQ + 13, 1, this.I != 1 ? 2 : 0);
                    }
                }
            }

            if (this.me) {
                if (this.D > 0) {
                    --this.D;
                } else if (this.D < 0) {
                    ++this.D;
                } else if (this.E == 0) {
                    this.statusMe = 4;
                    this.ar();
                    Service.gI().g();
                }

                if ((TileMap.b(this.cx, this.cy + 20) & 2) == 2 || (TileMap.b(this.cx, this.cy + 40) & 2) == 2) {
                    if (this.E == 0) {
                        this.bP = 0;
                    }

                    this.e = 0;
                    this.D = this.E = 0;
                    this.F = this.d = 0;
                    this.statusMe = 4;
                    this.d(3);
                }

                if (b(this.cx - this.bC) > 96 || b(this.cy - this.bD) > 24) {
                    Service.gI().g();
                }
            }

        }
    }

    private void ao() {
        ++this.dh;
        if (this.dh > this.dg.length - 1) {
            this.dh = 0;
        }

        ++this.di;
        if (this.di > 1000) {
            this.di = 0;
        }

        if (this.ds && !this.dt) {
            this.dm = this.cy;
            if (this.dj == 0) {
                if (this.dl - this.cx >= this.dr) {
                    this.dl -= this.dr;
                    return;
                }

                this.dl = this.cx;
                this.dt = true;
                this.du = false;
                return;
            }

            if (this.dj == 2) {
                if (this.cx - this.dl >= this.dr) {
                    this.dl += this.dr;
                    return;
                }

                this.dl = this.cx;
                this.dt = true;
                this.du = false;
                return;
            }
        } else {
            if (this.dt) {
                if ((this.statusMe == 14 || this.ck - this.cy < 24) && this.ck - this.cy < 24 && !this.du) {
                    this.ds = false;
                    this.dt = false;
                    this.du = true;
                    this.dq = 0;
                }

                if (this.F % 15 < 5) {
                    this.ar = 0;
                } else {
                    this.ar = 1;
                }

                this.dj = this.I;
                this.ai();
                if (this.dj < 0) {
                    this.dj = 0;
                    this.dn = -20;
                } else if (this.dj == 1) {
                    this.dj = 2;
                    this.dn = -30;
                    if (this.bv) {
                        this.dn = -38;
                    }
                }

                if (this.C() != null) {
                    this.fd_int_1 = -15;
                } else {
                    this.fd_int_1 = -17;
                }

                this.dm = this.cy;
                this.dl = this.cx;
                return;
            }

            if (this.du) {
                if (this.dj == 0) {
                    if (this.dl > GameScr.j - 100) {
                        this.dl -= 20;
                        return;
                    }

                    this.ds = false;
                    this.dt = false;
                    this.du = false;
                    return;
                }

                if (this.dj == 2) {
                    if (this.dl < GameScr.j + GameCanvas.z + 50) {
                        this.dl += 20;
                        return;
                    }

                    this.ds = false;
                    this.dt = false;
                    this.du = false;
                    return;
                }
            } else if (!this.ds || !this.dt || !this.du) {
                this.dl = GameScr.j - 100;
                this.dm = GameScr.k - 100;
            }
        }

    }

    private static void ap() {
        if (Mob.c[50].f == null) {
            Mob.c[50].f = new nr_cg();
            String var0 = "/Mob/50";
            if ("".getClass().getResourceAsStream(var0) != null) {
                Mob.c[50].f.a(var0 + "/data");
                Mob.c[50].f.a = Main.loadImage(var0 + "/img.png");
            } else {
                Service.gI().requestModTemplate((int) 50);
            }

            Mob.K.addElement("50");
        }

    }

    public void a(int[] var1) {
        ++this.dI;
        if (this.dI > var1.length - 1) {
            this.dI = 0;
        }

        this.dJ = var1[this.dI];
    }

    public final void b(mGraphics var1) {
        if (this.dl > GameScr.j && this.dl < GameScr.j + GameCanvas.z) {
            nr_cz var2;
            if (this.me) {
                if (this.du || this.ds || this.dt) {
                    if (this.bs >= br) {
                        if ((var2 = Main.d(this.dL + (this.bs - br) + "_1")) != null) {
                            var2.a(this.di / 2 % var2.c, this.dl, this.dm + this.bQ, this.dj, 3, var1);
                        }

                        return;
                    }

                    if (this.bw) {
                        this.a(this.dK);
                        if (Mob.c[50] != null && Mob.c[50].f != null) {
                            Mob.c[50].f.a(var1, this.dJ, this.dl + (this.I == 1 ? -8 : 8), this.dm + 35, this.I == 1 ? 0 : 1, 0);
                            return;
                        }

                        ap();
                        return;
                    }

                    if (this.bv) {
                        var1.drawRegion(de, 0, this.dg[this.dh] * 60, 60, 60, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                        return;
                    }

                    if (this.dk == 0) {
                        if (!this.bu) {
                            var1.drawRegion(cW, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                            return;
                        }

                        var1.drawRegion(da, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                        return;
                    }

                    if (this.dk == 1) {
                        if (!this.bu) {
                            var1.drawRegion(cY, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                            return;
                        }

                        var1.drawRegion(dc, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                        return;
                    }
                }
            } else if (!this.me) {
                if (this.bs >= br) {
                    if ((var2 = Main.d(this.dL + (this.bs - br) + "_1")) != null) {
                        var2.a(this.di / 2 % var2.c, this.dl, this.dm + this.bQ, this.dj, 3, var1);
                    }

                    return;
                }

                if (this.bw) {
                    this.a(this.dK);
                    if (Mob.c[50] != null && Mob.c[50].f != null) {
                        Mob.c[50].f.a(var1, this.dJ, this.dl + (this.I == 1 ? -8 : 8), this.dm + 35, this.I == 1 ? 0 : 1, 0);
                        return;
                    }

                    ap();
                    return;
                }

                if (this.bv) {
                    var1.drawRegion(de, 0, this.dg[this.dh] * 60, 60, 60, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                    return;
                }

                if (this.dt) {
                    if (this.dk == 0) {
                        if (!this.bu) {
                            var1.drawRegion(cW, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                            return;
                        }

                        var1.drawRegion(da, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                        return;
                    }

                    if (this.dk == 1) {
                        if (!this.bu) {
                            var1.drawRegion(cY, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                            return;
                        }

                        var1.drawRegion(dc, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                    }
                }
            }
        }

    }

    private void aq() {
        if (this.me) {
            boolean var2 = false;
            short var3 = -1;
            Item[] var4 = this.arrItemBody;

            for (int var5 = 0; var5 < var4.length; ++var5) {
                if (var4[var5] != null && (var4[var5].template.type == 24 || var4[var5].template.type == 23)) {
                    if (var4[var5].template.part >= 0) {
                        var3 = (short) (br + var4[var5].template.part);
                    } else {
                        var3 = var4[var5].template.id;
                    }

                    var2 = true;
                    break;
                }
            }

            this.bu = false;
            this.bw = false;
            this.bv = false;
            this.bs = -1;
            if (var3 != 349 && var3 != 350 && var3 != 351) {
                if (var3 == 396) {
                    this.bv = true;
                } else if (var3 == 532) {
                    this.bw = true;
                } else if (var3 >= br) {
                    this.bs = var3;
                }
            } else {
                this.bu = true;
            }

            this.bt = var2;
            if (TileMap.a()) {
                this.bt = false;
            }
        }

        if (this.bt) {
            if (this.ck - this.cy <= 20) {
                this.dp = this.cx;
            }

            if (this.dq < 100) {
                this.dq = Res.g(this.dp - this.cx);
            }

            if (this.dq >= 70 && this.ck - this.cy > 30 && !this.ds && !this.du) {
                int var7 = this.cgender;
                int var8 = this.I;
                int var6 = this.charID;
                this.dj = var8;
                this.dk = var7;
                this.dr = 30;
                if (this.dj < 0) {
                    this.dj = 0;
                    this.dl = GameScr.j + GameCanvas.z + 50;
                    this.dn = -20;
                } else if (this.dj == 1) {
                    this.dj = 2;
                    this.dl = GameScr.j - 100;
                    this.dn = -30;
                }

                this.fd_int_1 = -17;
                this.dm = this.cy;
                this.dh = 0;
                this.di = 0;
                this.dt = false;
                this.du = false;
                this.ds = true;
            }
        }

    }

    private void ar() {
        boolean var1 = true;

        for (int var2 = 0; var2 < 150; var2 += 24) {
            if ((TileMap.b(this.cx, this.cy + var2) & 2) == 2 || this.cy + var2 > TileMap.b * TileMap.i - 24) {
                var1 = false;
                break;
            }
        }

        if (var1) {
            this.bP = 40;
        }

    }

    public final void setDefaultPart() {
        this.t();
        this.u();
        this.v();
    }

    public final void t() {
        if (this.cgender == 0) {
            this.bW = 0;
        }

    }

    public final void u() {
        if (this.cgender == 0) {
            this.body = 57;
        } else if (this.cgender == 1) {
            this.body = 59;
        } else {
            if (this.cgender == 2) {
                this.body = 57;
            }

        }
    }

    public final void v() {
        if (this.cgender == 0) {
            this.leg = 58;
        } else if (this.cgender == 1) {
            this.leg = 60;
        } else {
            if (this.cgender == 2) {
                this.leg = 58;
            }

        }
    }

    public final boolean w() {
        return this.aB != null && this.aB.a.b();
    }

    public final boolean x() {
        return this.aB != null && this.aB.a.a();
    }

    public final boolean y() {
        return !this.cf && this.aB != null && (this.aB.a.a == 10 || this.aB.a.a == 11);
    }

    public final void a(nr_ce var1, int var2) {
        this.ef = false;
        if (!this.cN) {
            if (!this.me || this.aB.a.a != 9 || this.cHP > this.cHPFull / 10) {
                if (this.me) {
                    if (this.aP == null && this.aT == null) {
                        this.B();
                    }

                    if (this.aP != null && (this.aP.p == 1 || this.aP.p == 0)) {
                        this.B();
                    }

                    if (this.aT != null && (this.aT.statusMe == 14 || this.aT.statusMe == 5)) {
                        this.B();
                    }

                    if (this.aB.a.a == 23) {
                        if (this.aT != null && this.aT.cE != 0) {
                            return;
                        }

                        if (this.aP != null && this.aP.j != 0) {
                            return;
                        }

                        if (this.cE != 0) {
                            return;
                        }
                    }

                    if (this.cM || this.cK) {
                        return;
                    }
                }

                if (!this.me || this.cb == null) {
                    if (!TileMap.d()) {
                        long var3 = System.currentTimeMillis();
                        if (this.me) {
                            if (this.x() && this.aT == null) {
                                return;
                            }

                            if (var3 - this.aB.f < (long) this.aB.e) {
                                this.aB.j = true;
                                return;
                            }

                            this.aB.f = var3;
                            if (this.aB.a.d == 2) {
                                this.cMP = 1;
                            } else if (this.aB.a.d != 1) {
                                this.cMP -= this.aB.i;
                            } else {
                                this.cMP -= this.aB.i * this.cMPFull / 100;
                            }

                            --myCharz().cStamina;
                            GameScr.gI().bB = true;
                            GameScr.gI().bA = 0;
                            if (this.cMP < 0) {
                                this.cMP = 0;
                            }
                        }

                        if (this.me) {
                            if (this.aB.a.a == 7) {
                                SoundMn.gI();
                            }

                            if (this.aB.a.a == 6) {
                                Service.gI().skill_not_focus((byte) 0);
                                GameScr.gI().aZ = true;
                                SoundMn.gI();
                            }

                            if (this.aB.a.a == 8) {
                                if (!this.bk) {
                                    SoundMn.gI();
                                    Service.gI().skill_not_focus((byte) 1);
                                    this.bk = true;
                                    this.bn = this.n = System.currentTimeMillis();
                                } else {
                                    Service.gI().skill_not_focus((byte) 3);
                                    this.bk = false;
                                    SoundMn.gI();
                                }
                            }

                            if (this.aB.a.a == 13) {
                                if (this.cA != 0) {
                                    GameScr.gI().aW = 0;
                                    return;
                                }

                                if (this.cc) {
                                    return;
                                }

                                SoundMn.gI();
                                Service.gI().skill_not_focus((byte) 6);
                                this.ee = 0;
                                this.cC = true;
                                return;
                            }

                            if (this.aB.a.a == 14) {
                                SoundMn.gI();
                                Service.gI().skill_not_focus((byte) 7);
                                this.b(true);
                            }

                            if (this.aB.a.a == 21) {
                                Service.gI().skill_not_focus((byte) 10);
                                return;
                            }

                            if (this.aB.a.a == 12) {
                                Service.gI().skill_not_focus((byte) 8);
                            }

                            if (this.aB.a.a == 19) {
                                Service.gI().skill_not_focus((byte) 9);
                                return;
                            }
                        }

                        if (this.cA == 1 && var1.a >= 35 && var1.a <= 41) {
                            var1 = GameScr.u[106];
                        }

                        if (var1.a >= 128 && var1.a <= 134) {
                            var1 = GameScr.u[var1.a - 65];
                            if (this.aT != null) {
                                this.cx = this.aT.cx;
                                this.cy = this.aT.cy;
                                this.bO = null;
                            }

                            if (this.aP != null) {
                                this.cx = this.aP.m;
                                this.cy = this.aP.n;
                                this.bO = null;
                            }

                            ServerEffect.addServerEffect(60, this.cx, this.cy, 1);
                            this.cL = true;
                        }

                        if (var1.a >= 107 && var1.a <= 113) {
                            var1 = GameScr.u[var1.a - 44];
                            EffecMn.addEff(new Effect(23, this.cx, this.cy + this.al / 2, 3, 2, 1));
                        }

                        this.b(var1, var2);
                    }
                }
            }
        }
    }

    public static void z() {
        GameScr.gI().aW = 0;
        myCharz().a(GameScr.u[myCharz().aB.b], TileMap.a(myCharz().cx, myCharz().cy, 2) ? 0 : 1);
    }

    public final void A() {
        if (this.me && (this.bj || this.t)) {
            GameScr.gI().aW = 0;
        } else {
            long var1 = System.currentTimeMillis();
            if (this.me && var1 - this.aB.f < (long) this.aB.e) {
                this.aB.j = true;
            } else {
                if (this.aB.a.a == 10) {
                    this.b(false);
                }

                if (this.aB.a.a == 11) {
                    this.b(true);
                }

            }
        }
    }

    public final void B() {
        this.cg = false;
        this.ch = false;
        this.cf = false;
        this.cc = false;
        if (this.me && this.statusMe != 14 && this.statusMe != 5) {
            this.bI = false;
        }

        GameScr.gI().aW = 0;
    }

    public final void b(boolean var1) {
        if (!this.cc) {
            GameScr.gI().aW = 0;
            if (var1) {
                if (!this.ch) {
                    this.ee = 0;
                    this.bl = '\uc350';
                    this.ed = 0;
                    this.bn = System.currentTimeMillis();
                    if (this.me) {
                        this.bI = true;
                        if (this.cgender == 1) {
                            Service.gI().skill_not_focus((byte) 4);
                        }
                    }

                    if (this.cgender == 1) {
                        SoundMn.gI();
                    }

                    this.ch = true;
                    return;
                }
            } else if (!this.cg) {
                if (this.me) {
                    GameScr.gI().aW = 0;
                    this.bI = true;
                    Service.gI().skill_not_focus((byte) 4);
                }

                this.cf = false;
                this.ee = 0;
                this.cg = true;
                this.ed = 0;
                this.bl = '\uc350';
            }

        }
    }

    public final void b(nr_ce var1, int var2) {
        this.cd = var1;
        int var3;
        if (var1.a >= 0 && var1.a <= 6) {
            if ((var3 = Res.b(0, var1.a + 4) - 1) < 0) {
                var3 = 0;
            }

            if (var3 > 6) {
                var3 = 6;
            }

            this.ce = GameScr.u[var3];
        } else if (var1.a >= 14 && var1.a <= 20) {
            if ((var3 = Res.b(0, var1.a - 14 + 4) - 1) < 0) {
                var3 = 0;
            }

            if (var3 > 6) {
                var3 = 6;
            }

            this.ce = GameScr.u[var3 + 14];
        } else if (var1.a >= 28 && var1.a <= 34) {
            if ((var3 = Res.b(0, (this.cA == 1 ? 105 : var1.a) - (this.cA == 1 ? 105 : 28) + 4) - 1) < 0) {
                var3 = 0;
            }

            if (var3 > 6) {
                var3 = 6;
            }

            if (this.cA == 1) {
                var3 = 0;
            }

            this.ce = GameScr.u[var3 + (this.cA == 1 ? 105 : 28)];
        } else if (var1.a >= 63 && var1.a <= 69) {
            if ((var3 = Res.b(0, var1.a - 63 + 4) - 1) < 0) {
                var3 = 0;
            }

            if (var3 > 6) {
                var3 = 6;
            }

            this.ce = GameScr.u[var3 + 63];
        } else if (var1.a >= 107 && var1.a <= 109) {
            if ((var3 = Res.b(0, var1.a - 107 + 4) - 1) < 0) {
                var3 = 0;
            }

            if (var3 > 6) {
                var3 = 6;
            }

            this.ce = GameScr.u[var3 + 107];
        } else {
            this.ce = var1;
        }

        this.eb = var2;
        this.bZ = 0;
        this.dO = this.dP = this.dQ = this.dR = this.dS = this.dT = this.dU = this.dV = this.dW = 0;
        this.dX = null;
        this.dY = null;
        this.dZ = null;
        this.E = 0;
    }

    public final nr_f[] C() {
        return this.cd == null ? null : (this.ce == null ? null : (this.eb == 0 ? this.ce.c : this.ce.d));
    }

    public final void D() {
        nr_ce var1;
        if (this.me) {
            var1 = this.ce;
            if (this.cb != null) {
                var1 = this.cb.a;
            }

            if (var1 != null) {
                MyVector var2 = new MyVector("vMob");
                MyVector var3 = new MyVector("vChar");
                if (this.aT != null) {
                    var3.addElement(this.aT);
                } else if (this.aP != null) {
                    var2.addElement(this.aP);
                }

                this.ea = new nr_co[var2.size() + var3.size()];

                int var4;
                for (var4 = 0; var4 < var2.size(); ++var4) {
                    this.ea[var4] = new nr_co();
                    this.ea[var4].d = GameScr.y[var1.b - 1];
                    if (!this.w()) {
                        this.ea[var4].b = (Mob) var2.elementAt(var4);
                    }
                }

                for (var4 = 0; var4 < var3.size(); ++var4) {
                    this.ea[var4 + var2.size()] = new nr_co();
                    this.ea[var4 + var2.size()].d = GameScr.y[var1.b - 1];
                    this.ea[var4 + var2.size()].c = (Char) var3.elementAt(var4);
                }

                byte var6 = 0;
                if (this.aP != null) {
                    var6 = 1;
                } else if (this.aT != null) {
                    var6 = 2;
                }

                if (var2.size() == 0 && var3.size() == 0) {
                    this.B();
                }

                if (this.me && !this.w() && !this.ef) {
                    Service.gI().sendPlayerAttack(var2, var3, var6);
                    this.ef = true;
                    return;
                }
            }
        } else {
            var1 = this.ce;
            if (this.cb != null) {
                var1 = this.cb.a;
            }

            if (var1 != null) {
                int var5;
                if (this.aW != null) {
                    this.ea = new nr_co[this.aW.length];

                    for (var5 = 0; var5 < this.aW.length; ++var5) {
                        this.ea[var5] = new nr_co();
                        this.ea[var5].d = GameScr.y[var1.b - 1];
                        this.ea[var5].b = this.aW[var5];
                    }

                    this.aW = null;
                    return;
                }

                if (this.aX != null) {
                    this.ea = new nr_co[this.aX.length];

                    for (var5 = 0; var5 < this.aX.length; ++var5) {
                        this.ea[var5] = new nr_co();
                        this.ea[var5].d = GameScr.y[var1.b - 1];
                        this.ea[var5].c = this.aX[var5];
                    }

                    this.aX = null;
                }
            }
        }

    }

    public final boolean E() {
        return this.cx < GameScr.j ? true : this.cx > GameScr.j + GameScr.d;
    }

    public final boolean F() {
        return this.cy < GameScr.k ? false : (this.cy > GameScr.k + GameScr.e + 30 ? false : (this.E() ? false : (this.ey ? false : !this.cH)));
    }

    public final void a(int var1, int var2, int var3) {
        this.a = var1;
        this.b = var2;
        this.c = 10;
    }

    public final void c(boolean var1) {
        this.ci = var1;
    }

    public void a(mGraphics var1) {
        if (!this.dE) {
            if (this.ci) {
                if (this.ao) {
                    GameScr.l = this.cx - GameScr.f;
                    GameScr.m = this.cy - GameScr.g - 1;
                    if (!GameCanvas.f) {
                        GameScr.l += GameScr.i * this.I;
                    }
                }

            } else if (this.F()) {
                int var4;
                int var5;
                int var6;
                if (this.petFollow != null) {
                    PetFollow var2 = this.petFollow;
                    var4 = 32;
                    var5 = 32;
                    var6 = GameCanvas.gameTick % 10 > 5 ? 1 : 0;
                    if (var2.l > 0) {
                        var4 = var2.m;
                        var5 = var2.n;
                        var6 = 0;
                    }

                    SmallImage.a(var1, var2.a, var2.c, var2.i, var2.e + 3 + var6, var4, var5, var2.b == 1 ? 0 : 2, nr_cf.f);
                }

                nr_cz var10;
                if (this.dl > GameScr.j && this.dl < GameScr.j + GameCanvas.z) {
                    if (this.me) {
                        if (this.du || this.ds || this.dt) {
                            if (this.bs >= br) {
                                if ((var10 = Main.d(this.dL + (this.bs - br) + "_0")) != null) {
                                    var10.a(this.di / 2 % var10.c, this.dl, this.dm + this.bQ, this.dj, 3, var1);
                                }
                            } else if (!this.bw) {
                                if (this.bv) {
                                    var1.drawRegion(df, 0, this.dg[this.dh] * 60, 60, 60, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                } else if (this.dk == 2) {
                                    if (!this.bu) {
                                        var1.drawRegion(cZ, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                    } else {
                                        var1.drawRegion(dd, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                    }
                                } else if (this.dk == 1) {
                                    if (!this.bu) {
                                        var1.drawRegion(cX, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                    } else {
                                        var1.drawRegion(db, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                    }
                                }
                            }
                        }
                    } else if (!this.me) {
                        if (this.bs >= br) {
                            if ((var10 = Main.d(this.dL + (this.bs - br) + "_0")) != null) {
                                var10.a(this.di / 2 % var10.c, this.dl, this.dm + this.bQ, this.dj, 3, var1);
                            }
                        } else if (!this.bw) {
                            if (this.bv) {
                                var1.drawRegion(df, 0, this.dg[this.dh] * 60, 60, 60, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                            } else if (this.dt) {
                                if (this.dk == 2) {
                                    if (!this.bu) {
                                        var1.drawRegion(cZ, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                    } else {
                                        var1.drawRegion(dd, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                    }
                                } else if (this.dk == 1) {
                                    if (!this.bu) {
                                        var1.drawRegion(cX, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                    } else {
                                        var1.drawRegion(db, 0, this.dg[this.dh] * 40, 50, 40, this.dj, this.dl + this.dn, this.dm + this.fd_int_1 + this.bQ, 0);
                                    }
                                }
                            }
                        }
                    }
                }

                if (!TileMap.f() || this.cy < TileMap.d - 48) {
                    if (!this.s) {
                        if (this.cF && GameCanvas.gameTick % 2 == 0) {
                            var1.a(16185600);
                            if (this.ew != null) {
                                var1.a(this.cx, this.cy - this.al / 2, this.ew.cx, this.ew.cy - this.ew.al / 2);
                            }

                            if (this.ex != null) {
                                var1.a(this.cx, this.cy - this.al / 2, this.ex.m, this.ex.n - this.ex.w / 2);
                            }
                        }

                        nr_dz var12;
                        label529:
                        {
                            if (this.me) {
                                if (!cS && this.cR >= 0) {
                                    break label529;
                                }
                            } else if (this.cR >= 0) {
                                break label529;
                            }

                            if (isPaintAura2 && (this.statusMe == 1 || this.statusMe == 6) && !GameCanvas.panel.a && Main.c() - this.eg > 0L && !this.cB && this.clevel >= 16) {
                                short var9 = 7598;
                                if (this.clevel >= 19) {
                                    var9 = 7676;
                                }

                                if (this.clevel >= 22) {
                                    var9 = 7677;
                                }

                                if (this.clevel >= 25) {
                                    var9 = 7678;
                                }

                                if (var9 != -1) {
                                    if ((var12 = SmallImage.c[var9]) == null) {
                                        SmallImage.a(var9);
                                    } else {
                                        var4 = GameCanvas.gameTick / 4 % 4 * (mGraphics.getImageHeight(var12.a) / 4);
                                        var1.drawRegion(var12.a, 0, var4, mGraphics.getImageWidth(var12.a), mGraphics.getImageHeight(var12.a) / 4, 0, this.cx, this.cy + 2, 33);
                                    }
                                }
                            }
                        }

                        if ((!this.me || !cS) && this.cR >= 0 && (this.statusMe == 1 || this.statusMe == 6) && !GameCanvas.panel.a && Main.c() - this.eg > 0L && (var10 = Main.d(this.eP + this.cR + "_0")) != null) {
                            var10.a(GameCanvas.gameTick / 4 % var10.c, this.cx, this.cy, this.I == 1 ? 0 : 2, 33, var1);
                        }

                        this.h(var1);
                        if (this.cU != -1) {
                            if (this.eQ != null) {
                                this.eQ.a(GameCanvas.gameTick / 4 % this.eQ.c, this.cx, this.cy + 3, this.I == 1 ? 0 : 2, 33, var1);
                            } else {
                                this.eQ = Main.d(this.eS + this.cU + "_0");
                            }
                        }

                        if (this.c > 0) {
                            if (GameCanvas.gameTick % 2 == 0) {
                                this.a(var1, this.a, this.b, this.I, 25, true);
                            } else if (this.c > 5) {
                                this.a(var1, this.a, this.b, this.I, 7, true);
                            }
                        }

                        if (!this.F() && this.cd != null && (this.cd.a < 70 || this.cd.a > 76) && (this.cd.a < 77 || this.cd.a > 83)) {
                            if (this.cd != null) {
                                this.bZ = this.C().length;
                                this.cd = null;
                            }

                            this.ea = null;
                            this.dN = null;
                            this.bY = null;
                            this.dM = -1;
                            this.bX = -1;
                        } else if (this.statusMe != 15 && (this.aY == null || this.aY[0] <= 0)) {
                            Rms var11 = GameScr.x[this.g(this.head)];
                            var5 = bB[this.ar][0][2] - var11.a[bB[this.ar][0][0]].c + 5;
                            boolean var14;
                            if ((!this.bb || this.me) && (this.me || TileMap.l != 113 || this.cy < 360) && !this.me) {
                                boolean var13 = myChar.ai != null && this.ah == myChar.ai.a;
                                var14 = this.aM == 3 || this.aM == 5;
                                boolean var7 = this.aM == 4;
                                if (this.cName.startsWith("$")) {
                                    this.cName = this.cName.substring(1);
                                    this.en = true;
                                }

                                if (this.cName.startsWith("#")) {
                                    this.cName = this.cName.substring(1);
                                    this.eo = true;
                                }

                                if (myCharz().aT != null && myCharz().aT.equals(this)) {
                                    var5 += 5;
                                    this.a(var1, this.cx, this.cy - var5 + 3);
                                }

                                var5 += mFont.k.a();
                                mFont var8 = mFont.H;
                                if (!this.en && !this.eo) {
                                    if (var14) {
                                        var8 = mFont.B;
                                    } else if (var7) {
                                        var8 = mFont.C;
                                    } else if (var13) {
                                        var8 = mFont.D;
                                    }
                                } else {
                                    var8 = mFont.J;
                                }

                                if ((this.j || var14 || var7) && !var13) {
                                    var8.a(var1, this.cName, this.cx, this.cy - var5, 2, mFont.E);
                                    var5 += mFont.k.a();
                                }

                                if (var13) {
                                    if (myCharz().aT != null && myCharz().aT.equals(this)) {
                                        var8.a(var1, this.cName, this.cx, this.cy - var5, 2, mFont.E);
                                    } else if (this.aT == null) {
                                        var8.a(var1, this.cName, this.cx - 10, this.cy - var5 + 3, 0, mFont.o);
                                        this.a(var1, this.cx - 16, this.cy - var5 + 10);
                                    }
                                }
                            }

                            if (this.cd == null || this.C() == null || this.bZ >= this.C().length) {
                                this.g(var1);
                            }

                            if (this.ca != null) {
                                this.ca.a(var1);
                            }

                            if (this.cb != null) {
                                this.cb.a(var1);
                            }

                            this.f(var1);
                            this.b(var1);
                            this.e(var1);
                            if (this.cU != -1) {
                                if (this.eR != null) {
                                    this.eR.a(GameCanvas.gameTick / 4 % this.eR.c, this.cx, this.cy + 8, this.I == 1 ? 0 : 2, 33, var1);
                                } else {
                                    this.eR = Main.d(this.eS + this.cU + "_1");
                                }
                            }

                            label434:
                            {
                                if (this.me) {
                                    if (!cS && this.cR >= 0) {
                                        break label434;
                                    }
                                } else if (this.cR >= 0) {
                                    break label434;
                                }

                                if (isPaintAura2) {
                                    if (this.statusMe != 1 && this.statusMe != 6) {
                                        this.eg = Main.c() + 1500L;
                                        this.ei = true;
                                        this.ej = true;
                                    } else if (!GameCanvas.panel.a && Main.c() - this.eg > 0L) {
                                        if (this.cB) {
                                            if (GameCanvas.gameTick % 2 == 0) {
                                                ++this.eh;
                                            }

                                            if (this.eh > 6) {
                                                this.eh = 0;
                                            }

                                            var1.drawImage(GameCanvas.R[this.eh], this.cx, this.cy + 9, 33);
                                        } else {
                                            if (this.clevel >= 14 && !GameCanvas.lowGraphic) {
                                                var14 = false;
                                                if (Main.c() - this.eg > -1000L && this.ei) {
                                                    var14 = true;
                                                    this.ei = false;
                                                }

                                                if (Main.c() - this.eg > -500L && this.ej) {
                                                    var14 = true;
                                                    this.ej = false;
                                                }

                                                if (var14) {
                                                    GameCanvas.a().a(-1, this.cx - -8, this.cy);
                                                    GameCanvas.a().a(1, this.cx - 8, this.cy);
                                                    this.d(1);
                                                }
                                            }

                                            if (this.clevel == 14) {
                                                if (GameCanvas.gameTick % 2 == 0) {
                                                    ++this.eh;
                                                }

                                                if (this.eh > 6) {
                                                    this.eh = 0;
                                                }

                                                var1.drawImage(GameCanvas.Q[this.eh], this.cx, this.cy + 9, 33);
                                            } else if (this.clevel == 15) {
                                                if (GameCanvas.gameTick % 2 == 0) {
                                                    ++this.eh;
                                                }

                                                if (this.eh > 6) {
                                                    this.eh = 0;
                                                }

                                                var1.drawImage(GameCanvas.R[this.eh], this.cx, this.cy + 9, 33);
                                            } else if (this.clevel >= 16) {
                                                short var16 = -1;
                                                if (this.clevel >= 16 && this.clevel < 22) {
                                                    var16 = 7599;
                                                }

                                                if (var16 != -1) {
                                                    if ((var12 = SmallImage.c[7599]) == null) {
                                                        SmallImage.a(7599);
                                                    } else {
                                                        var4 = GameCanvas.gameTick / 4 % 4 * (mGraphics.getImageHeight(var12.a) / 4);
                                                        var1.drawRegion(var12.a, 0, var4, mGraphics.getImageWidth(var12.a), mGraphics.getImageHeight(var12.a) / 4, 0, this.cx, this.cy + 2, 33);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            if ((!this.me || cS) && this.cR >= 0) {
                                if (this.statusMe != 1 && this.statusMe != 6) {
                                    this.eg = Main.c() + 1500L;
                                    this.ei = true;
                                    this.ej = true;
                                } else if (!GameCanvas.panel.a && !GameCanvas.lowGraphic) {
                                    var14 = false;
                                    if (Main.c() - this.eg > -1000L && this.ei) {
                                        var14 = true;
                                        this.ei = false;
                                    }

                                    if (Main.c() - this.eg > -500L && this.ej) {
                                        var14 = true;
                                        this.ej = false;
                                    }

                                    if (var14) {
                                        GameCanvas.a().a(-1, this.cx - -8, this.cy);
                                        GameCanvas.a().a(1, this.cx - 8, this.cy);
                                        this.d(1);
                                    }

                                    nr_cz var15;
                                    if (Main.c() - this.eg > 0L && (var15 = Main.d(this.eP + this.cR + "_1")) != null) {
                                        var15.a(GameCanvas.gameTick / 4 % var15.c, this.cx, this.cy + 2, this.I == 1 ? 0 : 2, 33, var1);
                                    }
                                }
                            }

                            this.i(var1);
                            if (this.bz != 0 && this.bA != 0 && this.statusMe != 14) {
                                byte var17 = 0;
                                var5 = this.cx - 30;
                                var6 = this.cy - 15;
                                if (Res.g(this.cy - this.bA) > 150) {
                                    if (this.cy > this.bA) {
                                        var17 = 7;
                                        var5 = this.cx;
                                        var6 = this.cy - 15 - 60;
                                    } else {
                                        var17 = 5;
                                        var5 = this.cx;
                                        var6 = this.cy - 15 + 60;
                                    }
                                } else if (this.cx > this.bz) {
                                    var17 = 2;
                                } else if (this.cx <= this.bz) {
                                    var5 = this.cx + 30;
                                }

                                if (GameCanvas.gameTick % 10 >= 5) {
                                    if (Res.g(this.cx - this.bz) > 100) {
                                        var1.drawRegion(GameScr.bw, 0, 0, 13, 16, var17, var5, var6, nr_cf.f);
                                        return;
                                    }

                                    var1.drawImage(Panel.i, this.bz, this.bA - 60 + -10, 0);
                                }
                            }

                        }
                    }
                }
            }
        }
    }

    private void e(mGraphics var1) {
        for (int var2 = 0; var2 < this.eH.size(); ++var2) {
            Effect var3;
            if ((var3 = (Effect) this.eH.elementAt(var2)).a >= 201) {
                var3.a(var1);
            }
        }

    }

    private void f(mGraphics var1) {
        if (this.ea != null) {
            for (int var2 = 0; var2 < this.ea.length; ++var2) {
                if (this.ea[var2] != null) {
                    if (this.ea[var2].b != null) {
                        int var3 = this.ea[var2].b.n;
                        if (this.ea[var2].b instanceof nr_by) {
                            var3 = this.ea[var2].b.n - 60;
                        }

                        if (this.ea[var2].b instanceof nr_d) {
                            var3 = this.ea[var2].b.n - 50;
                        }

                        if (this.ea[var2].b instanceof nr_al) {
                            var3 = this.ea[var2].b.n - 40;
                        }

                        SmallImage.drawSmallImage(var1, this.ea[var2].a(), this.ea[var2].b.m, var3, 0, 33);
                    } else if (this.ea[var2].c != null) {
                        SmallImage.drawSmallImage(var1, this.ea[var2].a(), this.ea[var2].c.cx, this.ea[var2].c.cy, 0, 33);
                    }
                }
            }
        }

        if (this.bX >= 0 && this.bY != null) {
            SmallImage.drawSmallImage(var1, this.bY.a[this.bX].c, this.cx + this.bY.a[this.bX].a, this.cy + this.bY.a[this.bX].b, 0, 3);
        }

    }

    public final void a(mGraphics var1, int var2, int var3) {
        int var4;
        if ((var4 = this.cHP * 100 / this.cHPFull / 10 - 1) < 0) {
            var4 = 0;
        }

        if (var4 > 9) {
            var4 = 9;
        }

        var1.drawRegion(Mob.imgHP, 0, 6 * (9 - var4), 9, 6, 0, var2, var3, 3);
        if (this.aM != 0 || myCharz().bx != 0 && this.bx != 0 && (this.bx == 8 || myCharz().bx == 8 || this.bx != myCharz().bx)) {
            this.ek = (int) ((long) this.cHP * 100L / (long) this.cHPFull * (long) this.el) / 100;
            if ((var4 = (int) ((long) this.cHP * 100L / (long) this.cHPFull)) < 30) {
                this.em = GameScr.aG;
            } else if (var4 < 60) {
                this.em = GameScr.aH;
            } else {
                this.em = GameScr.aJ;
            }

            int var5 = mGraphics.getImageWidth(GameScr.aG);
            int var6 = mGraphics.getImageHeight(GameScr.aG);
            var4 = var5 * var4 / 100;
            var1.drawImage(GameScr.aI, var2 - (var5 >> 1), var3 - 1, 20);
            if (this.ek >= 5 || GameCanvas.gameTick % 6 < 3) {
                var1.drawRegion(this.em, 0, 0, var4, var6, 0, var2 - (var5 >> 1), var3 - 1, 20);
            }
        }

    }

    public final void c(mGraphics var1) {
        if (!this.ci) {
            if (this.head != 377) {
                if (this.leg != 471) {
                    if (!this.s) {
                        if (!this.bp) {
                            byte var2 = TileMap.i;
                            if ((TileMap.l < 114 || TileMap.l > 120) && TileMap.l != 127 && TileMap.l != 128) {
                                if (TileMap.a(this.cj + var2 / 2, this.ck + 1, 4)) {
                                    var1.e(this.cj / var2 * var2, (this.ck - 30) / var2 * var2, var2, 100);
                                } else if (TileMap.a((this.cj - var2 / 2) / var2, (this.ck + 1) / var2) == 0) {
                                    var1.e(this.cj / var2 * var2, (this.ck - 30) / var2 * var2, 100, 100);
                                } else if (TileMap.a((this.cj + var2 / 2) / var2, (this.ck + 1) / var2) == 0) {
                                    var1.e(this.cj / var2 * var2, (this.ck - 30) / var2 * var2, var2, 100);
                                } else if (TileMap.a(this.cj - var2 / 2, this.ck + 1, 8)) {
                                    var1.e(this.cj / 24 * var2, (this.ck - 30) / var2 * var2, var2, 100);
                                }
                            }

                            var1.drawImage(TileMap.bong, this.cj, this.ck, 3);
                            var1.e(GameScr.j, GameScr.k - GameCanvas.Z, GameScr.d, GameScr.e + 2 * GameCanvas.Z);
                        }
                    }
                }
            }
        }
    }

    public final void G() {
        int var1 = 0;
        this.cj = this.cx;
        if (TileMap.a(this.cx, this.cy, 2)) {
            this.ck = this.cy;
        } else {
            this.ck = this.cy;

            while (var1 < 30) {
                ++var1;
                this.ck += 24;
                if (TileMap.a(this.cj, this.ck, 2)) {
                    if (this.ck % 24 != 0) {
                        this.ck -= this.ck % 24;
                        return;
                    }
                    break;
                }
            }

        }
    }

    private void g(mGraphics var1) {
        try {
            if (this.bb) {
                if (this.me) {
                    if (GameCanvas.gameTick % 50 != 48 && GameCanvas.gameTick % 50 != 90) {
                        SmallImage.drawSmallImage(var1, 1195, this.cx, this.cy - 18, 0, 3);
                    } else {
                        SmallImage.drawSmallImage(var1, 1196, this.cx, this.cy - 18, 0, 3);
                    }

                    return;
                }
            } else {
                this.a(var1, this.cx, this.cy + this.bQ, this.I, this.ar, true);
            }

        } catch (Exception var2) {
            ;
        }
    }
    public static int cgender()
    {
        return Char.myCharz().cgender;
    }
    public final void a(mGraphics var1, short[] var2, int var3, int var4, int var5, boolean var6) {
        byte var7 = 0;
        byte var8 = 0;
        if (this.statusMe == 6) {
            var7 = 8;
            var8 = 17;
        }

        if (this.statusMe == 1) {
            if (this.F % 15 < 5) {
                var7 = 8;
                var8 = 17;
            } else {
                var7 = 8;
                var8 = 18;
            }
        }

        if (this.statusMe == 2) {
            if (this.ar <= 3) {
                var7 = 7;
                var8 = 17;
            } else {
                var7 = 7;
                var8 = 18;
            }
        }

        if (this.statusMe == 3 || this.statusMe == 9) {
            var7 = 5;
            var8 = 20;
        }

        if (this.statusMe == 4) {
            if (this.ar == 8) {
                var7 = 5;
                var8 = 16;
            } else {
                var7 = 5;
                var8 = 20;
            }
        }

        if (this.statusMe == 10) {
            if (this.ar == 8) {
                var7 = 0;
                var8 = 23;
            } else {
                var7 = 5;
                var8 = 22;
            }
        }

        if (this.ec > 0) {
            var7 = 5;
            var8 = 18;
        }

        if (this.cd != null && this.C() != null && this.bZ < this.C().length) {
            var7 = -1;
            var8 = 17;
        }

        ++this.ep;
        if (this.ep > 10000) {
            this.ep = 0;
        }

        byte var9 = (byte) (this.ep / 4 % var2.length);
        if (!var6) {
            if (var2.length == 2) {
                var9 = 1;
            }

            if (var2.length == 3) {
                if (var2[2] >= 0) {
                    var9 = 2;
                    if (GameCanvas.gameTick % 10 > 5) {
                        var9 = 1;
                    }
                } else {
                    var9 = 1;
                }
            }
        } else if (var2.length > 1 && (var9 == 0 || var9 == 1) && this.statusMe != 1 && this.statusMe != 6) {
            this.ep = 0;
            var9 = 0;
            if (GameCanvas.gameTick % 10 > 5) {
                var9 = 1;
            }
        }

        SmallImage.drawSmallImage(var1, var2[var9], var3 + (var5 == 1 ? -var7 : var7), var4 - var8, var5 == 1 ? 0 : 2, nr_cf.f);
    }

    public final boolean a(int var1) {
        Rms var2 = GameScr.x[this.head];
        Rms var3 = GameScr.x[this.leg];
        Rms var4 = GameScr.x[this.body];

        for (int var5 = 0; var5 < bB.length; ++var5) {
            if (var1 == var2.a[bB[var5][0][0]].a) {
                return true;
            }

            if (var1 == var3.a[bB[var5][1][0]].a) {
                return true;
            }

            if (var1 == var4.a[bB[var5][2][0]].a) {
                return true;
            }
        }

        return false;
    }

    public final void a(mGraphics var1, int var2, int var3, int var4) {
        Rms var5 = GameScr.x[this.head];
        SmallImage.drawSmallImage(var1, var5.a[bB[0][0][0]].a, var2, var3, 0, 10);
    }

    public final void b(mGraphics var1, int var2, int var3, int var4) {
        Rms var5 = GameScr.x[this.head];
        SmallImage.drawSmallImage(var1, var5.a[bB[0][0][0]].a, var2 + bB[0][0][1] + var5.a[bB[0][0][0]].b - 3, var3 + 3, var4, 36);
    }

    public final void a(mGraphics var1, int var2, int var3, int var4, int var5, boolean var6) {
        this.eq = GameScr.x[this.head];
        this.er = GameScr.x[this.leg];
        this.es = GameScr.x[this.body];
        if (this.bag >= 0 && this.statusMe != 14) {
            if (!nr_aj.g.containsKey(String.valueOf(this.bag))) {
                nr_aj.g.put(String.valueOf(this.bag), new nr_aj());
                Service.gI().f((byte) this.bag);
            } else {
                nr_aj var7;
                if ((var7 = (nr_aj) nr_aj.g.get(String.valueOf(this.bag))).c != null && var6) {
                    this.a(var1, var7.c, var2, var3, var4, true);
                }
            }
        }

        byte var18 = 2;
        byte var17 = 24;
        int var8 = nr_cf.b;
        byte var9 = -1;
        if (var4 == 1) {
            var18 = 0;
            var17 = 0;
            var8 = 0;
            var9 = 1;
        }

        Rms var15;
        if (this.statusMe == 14) {
            if (GameCanvas.gameTick % 4 > 0) {
                var1.drawImage(ItemMap.imageFlare, var2, var3 - this.al - 11, 3);
            }

            byte var14 = 0;
            if (this.head == 89 || this.head == 457 || this.head == 460 || this.head == 461 || this.head == 462 || this.head == 463 || this.head == 464 || this.head == 465 || this.head == 466) {
                var14 = 15;
            }

            SmallImage.drawSmallImage(var1, 834, var2, var3 - bB[var5][2][2] + this.es.a[bB[var5][2][0]].c - 2 + var14, var18, nr_cf.a);
            SmallImage.drawSmallImage(var1, 79, var2, var3 - this.al - 8, 0, 33);
            SmallImage.drawSmallImage(var1, this.eq.a[bB[var5][0][0]].a, var2 + (bB[var5][0][1] + this.eq.a[bB[var5][0][0]].b) * var9, var3 - bB[var5][0][2] + this.eq.a[bB[var5][0][0]].c, var18, var17);
            this.b(var1, var5, var3 - bB[var5][2][2] + this.es.a[bB[var5][2][0]].c);
            if (f(this.head)) {
                var15 = GameScr.x[this.g(this.head)];
                SmallImage.drawSmallImage(var1, var15.a[bB[var5][0][0]].a, var2 + (bB[var5][0][1] + var15.a[bB[var5][0][0]].b) * var9, var3 - bB[var5][0][2] + var15.a[bB[var5][0][0]].c, var18, var17);
            } else {
                SmallImage.drawSmallImage(var1, this.eq.a[bB[var5][0][0]].a, var2 + (bB[var5][0][1] + this.eq.a[bB[var5][0][0]].b) * var9, var3 - bB[var5][0][2] + this.eq.a[bB[var5][0][0]].c, var18, var17);
            }

            int var12 = var3 - bB[var5][2][2] + this.es.a[bB[var5][2][0]].c;
            int var11 = var5;
            mGraphics var10 = var1;
            Char var16 = this;

            try {
                if (var16.cV != -1) {
                    if (h(var11)) {
                        if (var16.eW != null) {
                            var16.eW.a(GameCanvas.gameTick / 4 % var16.eW.c, var16.cx + fa[var11][0] * (var16.I == 1 ? 1 : -1), var12 + fa[var11][1], var16.I == 1 ? 0 : 2, 33, var10);
                        } else {
                            var16.eW = Main.d(var16.eY + var16.eZ + var16.cV);
                        }
                    } else if (var16.eU != null) {
                        var16.eU.a(GameCanvas.gameTick / 4 % var16.eU.c, var16.cx + fa[var11][0] * (var16.I == 1 ? 1 : -1), var12 + fa[var11][1], var16.I == 1 ? 0 : 2, 33, var10);
                    } else {
                        var16.eU = Main.d(var16.eY + var16.cV);
                    }
                }
            } catch (Exception var13) {
                ;
            }

            this.a(var1, var2 + (bB[var5][0][1] + this.eq.a[bB[var5][0][0]].b) * var9, var3 - bB[var5][0][2] + this.eq.a[bB[var5][0][0]].c, var18, var17);
        } else {
            this.b(var1, var5, var3 - bB[var5][2][2] + this.es.a[bB[var5][2][0]].c);
            if (f(this.head)) {
                var15 = GameScr.x[this.g(this.head)];
                SmallImage.drawSmallImage(var1, var15.a[bB[var5][0][0]].a, var2 + (bB[var5][0][1] + var15.a[bB[var5][0][0]].b) * var9, var3 - bB[var5][0][2] + var15.a[bB[var5][0][0]].c, var18, var17);
            } else {
                SmallImage.drawSmallImage(var1, this.eq.a[bB[var5][0][0]].a, var2 + (bB[var5][0][1] + this.eq.a[bB[var5][0][0]].b) * var9, var3 - bB[var5][0][2] + this.eq.a[bB[var5][0][0]].c, var18, var17);
            }

            SmallImage.drawSmallImage(var1, this.er.a[bB[var5][1][0]].a, var2 + (bB[var5][1][1] + this.er.a[bB[var5][1][0]].b) * var9, var3 - bB[var5][1][2] + this.er.a[bB[var5][1][0]].c, var18, var17);
            SmallImage.drawSmallImage(var1, this.es.a[bB[var5][2][0]].a, var2 + (bB[var5][2][1] + this.es.a[bB[var5][2][0]].b) * var9, var3 - bB[var5][2][2] + this.es.a[bB[var5][2][0]].c, var18, var17);
            this.a(var1, var2 + (bB[var5][0][1] + this.eq.a[bB[var5][0][0]].b) * var9, var3 - bB[var5][0][2] + this.eq.a[bB[var5][0][0]].c, var18, var17);
        }

        this.al = this.cA != 1 && !this.cH ? bB[0][0][2] + this.eq.a[bB[0][0][0]].c + 10 : 60;
        var4 = Res.g(this.eq.a[bB[var5][0][0]].c) >= 22 ? (this.eq.a[bB[var5][0][0]].c < 0 ? this.eq.a[bB[var5][0][0]].c + 5 : this.eq.a[bB[var5][0][0]].c - 5) : this.eq.a[bB[var5][0][0]].c;
        this.et = var3 - bB[var5][0][2] + var4;
        if (this.statusMe == 1 && this.charID > 0 && !this.r && !this.y() && !this.cC && this.cd == null && var5 != 23 && this.bag < 0 && ((GameCanvas.gameTick + this.charID) % 30 == 0 || this.bj)) {
            var1.drawImage(this.cgender == 1 ? m : l, var2 + var9 * -2, var3 - 32 + (this.cgender == 1 ? 10 : 11) - var5, var8);
        }

        if (this.dA != null) {
            this.dA.a(var1);
        }

        int var10003;
        boolean var10004;
        if (this.I == 1) {
            if (this.bx != 0 && this.bx != -1) {
                int var10002 = this.cx - 10;
                var10003 = this.cy - this.al;
                var10004 = this.me;
                SmallImage.drawSmallImage(var1, this.by, var10002, var10003 - 30 + (GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0), 2, 0);
                return;
            }
        } else if (this.bx != 0 && this.bx != -1) {
            var10003 = this.cy - this.al;
            var10004 = this.me;
            SmallImage.drawSmallImage(var1, this.by, this.cx, var10003 - 30 + (GameCanvas.gameTick % 20 > 10 ? GameCanvas.gameTick % 4 / 2 : 0), 0, 0);
        }

    }

    public final void d(mGraphics var1) {
        this.dH = 0;
        nr_f[] var2 = this.C();
        this.ar = var2[this.bZ].a;
        this.g(var1);
        if (this.I == 1) {
            if (this.dX != null) {
                if (this.dR == 0) {
                    this.dR = var2[this.bZ].c;
                }

                if (this.dU == 0) {
                    this.dU = var2[this.bZ].d;
                }

                SmallImage.drawSmallImage(var1, this.dX.a[this.dO].c, this.cx + this.dR + this.dX.a[this.dO].a, this.cy + this.dU + this.dX.a[this.dO].b, 0, 3);
                ++this.dO;
                if (this.dO >= this.dX.a.length) {
                    this.dX = null;
                    this.dO = this.dR = this.dU = 0;
                }
            }

            if (this.dY != null) {
                if (this.dS == 0) {
                    this.dS = var2[this.bZ].f;
                }

                if (this.dV == 0) {
                    this.dV = var2[this.bZ].g;
                }

                SmallImage.drawSmallImage(var1, this.dY.a[this.dP].c, this.cx + this.dS + this.dY.a[this.dP].a, this.cy + this.dV + this.dY.a[this.dP].b, 0, 3);
                ++this.dP;
                if (this.dP >= this.dY.a.length) {
                    this.dY = null;
                    this.dP = this.dS = this.dV = 0;
                }
            }

            if (this.dZ != null) {
                if (this.dT == 0) {
                    this.dT = var2[this.bZ].i;
                }

                if (this.dW == 0) {
                    this.dW = var2[this.bZ].j;
                }

                SmallImage.drawSmallImage(var1, this.dZ.a[this.dQ].c, this.cx + this.dT + this.dZ.a[this.dQ].a, this.cy + this.dW + this.dZ.a[this.dQ].b, 0, 3);
                ++this.dQ;
                if (this.dQ >= this.dZ.a.length) {
                    this.dZ = null;
                    this.dQ = this.dT = this.dW = 0;
                }
            }
        } else {
            if (this.dX != null) {
                if (this.dR == 0) {
                    this.dR = var2[this.bZ].c;
                }

                if (this.dU == 0) {
                    this.dU = var2[this.bZ].d;
                }

                SmallImage.drawSmallImage(var1, this.dX.a[this.dO].c, this.cx - this.dR - this.dX.a[this.dO].a, this.cy + this.dU + this.dX.a[this.dO].b, 2, 3);
                ++this.dO;
                if (this.dO >= this.dX.a.length) {
                    this.dX = null;
                    this.dO = 0;
                    this.dR = 0;
                    this.dU = 0;
                }
            }

            if (this.dY != null) {
                if (this.dS == 0) {
                    this.dS = var2[this.bZ].f;
                }

                if (this.dV == 0) {
                    this.dV = var2[this.bZ].g;
                }

                SmallImage.drawSmallImage(var1, this.dY.a[this.dP].c, this.cx - this.dS - this.dY.a[this.dP].a, this.cy + this.dV + this.dY.a[this.dP].b, 2, 3);
                ++this.dP;
                if (this.dP >= this.dY.a.length) {
                    this.dY = null;
                    this.dP = 0;
                    this.dS = 0;
                    this.dV = 0;
                }
            }

            if (this.dZ != null) {
                if (this.dT == 0) {
                    this.dT = var2[this.bZ].i;
                }

                if (this.dW == 0) {
                    this.dW = var2[this.bZ].j;
                }

                SmallImage.drawSmallImage(var1, this.dZ.a[this.dQ].c, this.cx - this.dT - this.dZ.a[this.dQ].a, this.cy + this.dW + this.dZ.a[this.dQ].b, 2, 3);
                ++this.dQ;
                if (this.dQ >= this.dZ.a.length) {
                    this.dZ = null;
                    this.dQ = 0;
                    this.dT = 0;
                    this.dW = 0;
                }
            }
        }

        ++this.bZ;
    }

    public final void b(int var1, int var2, int var3) {
        if (var3 != 1 && Res.g(var1 - this.cx) <= 100 && Res.g(var2 - this.cy) <= 300) {
            byte var7 = 0;
            byte var4 = 0;
            int var5 = var1 - this.cx;
            int var6 = var2 - this.cy;
            if (var5 == 0 && var6 == 0) {
                var4 = 1;
                this.G = 0;
            } else if (var6 == 0) {
                var4 = 2;
                if (var5 > 0) {
                    var7 = 1;
                }

                if (var5 < 0) {
                    var7 = -1;
                }
            } else if (var6 != 0) {
                if (var6 < 0) {
                    var4 = 3;
                }

                if (var6 > 0) {
                    var4 = 4;
                }

                if (var5 < 0) {
                    var7 = -1;
                }

                if (var5 > 0) {
                    var7 = 1;
                }
            }

            this.bE.addElement(new nr_df(var1, var2, var4, var7));
            if (this.statusMe != 6) {
                this.eu = this.statusMe;
            }

            this.statusMe = 6;
            this.G = 0;
        } else {
            this.a(this.cx, this.cy, (int) 10);
            this.cx = var1;
            this.cy = var2;
            this.bE.removeAllElements();
            this.statusMe = 6;
            this.G = 0;
            this.bO = null;
            this.ar = 25;
        }
    }

    public void as() {
        if (myCharz().cd == null && myCharz().ca == null && myCharz().cb == null) {
            if (this.ev > 0) {
                --this.ev;
            } else {
                if (cl && this.aT != null && (this.aT.statusMe == 15 || this.aT.bb)) {
                    this.aT = null;
                }

                if (GameCanvas.gameTick % 2 != 0) {
                    if (!this.c(this.aT)) {
                        byte var1 = 0;
                        if (this.aw.a == 0 || this.aw.a == 1 || this.aw.a == 3 || this.aw.a == 5) {
                            var1 = 40;
                        }

                        int[] var2 = new int[]{-1, -1, -1, -1};
                        int var3 = GameScr.j - 10;
                        int var4 = GameScr.j + GameCanvas.z + 10;
                        int var5 = GameScr.k;
                        int var6 = GameScr.k + GameCanvas.A - GameScr.h + 10;
                        if (cl) {
                            if (this.aP != null && this.aP.p != 1 && this.aP.p != 0 && var3 <= this.aP.m && this.aP.m <= var4 && var5 <= this.aP.n && this.aP.n <= var6 || this.aS != null && var3 <= this.aS.cx && this.aS.cx <= var4 && var5 <= this.aS.cy && this.aS.cy <= var6 || this.aT != null && var3 <= this.aT.cx && this.aT.cx <= var4 && var5 <= this.aT.cy && this.aT.cy <= var6 || this.itemFocus != null && var3 <= this.itemFocus.x && this.itemFocus.x <= var4 && var5 <= this.itemFocus.y && this.itemFocus.y <= var6) {
                                return;
                            }

                            cl = false;
                        }

                        var3 = myCharz().cx - 80;
                        var4 = myCharz().cx + 80;
                        var5 = myCharz().cy - 30;
                        var6 = myCharz().cy + 30;
                        if (this.aS != null && this.aS.cW.a == 6) {
                            var3 = myCharz().cx - 20;
                            var4 = myCharz().cx + 20;
                            var5 = myCharz().cy - 10;
                            var6 = myCharz().cy + 10;
                        }

                        int var7;
                        Npc var8;
                        int var9;
                        int var10;
                        int var11;
                        if (this.aS == null) {
                            for (var7 = 0; var7 < GameScr.G.size(); ++var7) {
                                if ((var8 = (Npc) GameScr.G.elementAt(var7)).statusMe != 15) {
                                    var9 = Math.abs(myCharz().cx - var8.cx);
                                    var10 = Math.abs(myCharz().cy - var8.cy);
                                    var11 = var9 > var10 ? var9 : var10;
                                    var3 = myCharz().cx - 80;
                                    var4 = myCharz().cx + 80;
                                    var5 = myCharz().cy - 30;
                                    var6 = myCharz().cy + 30;
                                    if (var8.cW.a == 6) {
                                        var3 = myCharz().cx - 20;
                                        var4 = myCharz().cx + 20;
                                        var5 = myCharz().cy - 10;
                                        var6 = myCharz().cy + 10;
                                    }

                                    if (var3 <= var8.cx && var8.cx <= var4 && var5 <= var8.cy && var8.cy <= var6 && (this.aS == null || var11 < var2[1])) {
                                        this.aS = var8;
                                        var2[1] = var11;
                                    }
                                }
                            }
                        } else {
                            if (var3 <= this.aS.cx && this.aS.cx <= var4 && var5 <= this.aS.cy && this.aS.cy <= var6) {
                                this.c(1);
                                return;
                            }

                            this.at();

                            for (var7 = 0; var7 < GameScr.G.size(); ++var7) {
                                if ((var8 = (Npc) GameScr.G.elementAt(var7)).statusMe != 15) {
                                    var9 = Math.abs(myCharz().cx - var8.cx);
                                    var10 = Math.abs(myCharz().cy - var8.cy);
                                    var11 = var9 > var10 ? var9 : var10;
                                    var3 = myCharz().cx - 80;
                                    var4 = myCharz().cx + 80;
                                    var5 = myCharz().cy - 30;
                                    var6 = myCharz().cy + 30;
                                    if (var8.cW.a == 6) {
                                        var3 = myCharz().cx - 20;
                                        var4 = myCharz().cx + 20;
                                        var5 = myCharz().cy - 10;
                                        var6 = myCharz().cy + 10;
                                    }

                                    if (var3 <= var8.cx && var8.cx <= var4 && var5 <= var8.cy && var8.cy <= var6 && (this.aS == null || var11 < var2[1])) {
                                        this.aS = var8;
                                        var2[1] = var11;
                                    }
                                }
                            }
                        }

                        ItemMap var12;
                        if (this.itemFocus == null) {
                            for (var7 = 0; var7 < GameScr.vItemMap.size(); ++var7) {
                                var12 = (ItemMap) GameScr.vItemMap.elementAt(var7);
                                var9 = Math.abs(myCharz().cx - var12.x);
                                var10 = Math.abs(myCharz().cy - var12.y);
                                var11 = var9 > var10 ? var9 : var10;
                                if (var9 <= 48 && var10 <= 48 && (this.itemFocus == null || var11 < var2[3])) {
                                    if (GameScr.gI().aW != 0) {
                                        GameScr.gI();
                                        if (GameScr.h() && var12.template.type != 9) {
                                            continue;
                                        }
                                    }

                                    this.itemFocus = var12;
                                    var2[3] = var11;
                                }
                            }
                        } else {
                            if (var3 <= this.itemFocus.x && this.itemFocus.x <= var4 && var5 <= this.itemFocus.y && this.itemFocus.y <= var6) {
                                this.c(3);
                                return;
                            }

                            this.itemFocus = null;

                            for (var7 = 0; var7 < GameScr.vItemMap.size(); ++var7) {
                                var12 = (ItemMap) GameScr.vItemMap.elementAt(var7);
                                var9 = Math.abs(myCharz().cx - var12.x);
                                var10 = Math.abs(myCharz().cy - var12.y);
                                var11 = var9 > var10 ? var9 : var10;
                                if (var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && (this.itemFocus == null || var11 < var2[3])) {
                                    if (GameScr.gI().aW != 0) {
                                        GameScr.gI();
                                        if (GameScr.h() && var12.template.type != 9) {
                                            continue;
                                        }
                                    }

                                    this.itemFocus = var12;
                                    var2[3] = var11;
                                }
                            }
                        }

                        var3 = myCharz().cx - myCharz().Y() - 10;
                        var4 = myCharz().cx + myCharz().Y() + 10;
                        var5 = myCharz().cy - myCharz().Z() - var1 - 20;
                        if ((var6 = myCharz().cy + myCharz().Z() + 20) > myCharz().cy + 30) {
                            var6 = myCharz().cy + 30;
                        }

                        Mob var13;
                        if (this.aP == null) {
                            for (var7 = 0; var7 < GameScr.vMob.size(); ++var7) {
                                var13 = (Mob) GameScr.vMob.elementAt(var7);
                                var9 = Math.abs(myCharz().cx - var13.m);
                                var10 = Math.abs(myCharz().cy - var13.n);
                                var11 = var9 > var10 ? var9 : var10;
                                if (var3 <= var13.m && var13.m <= var4 && var5 <= var13.n && var13.n <= var6 && (this.aP == null || var11 < var2[0])) {
                                    this.aP = var13;
                                    var2[0] = var11;
                                }
                            }
                        } else {
                            if (this.aP.p != 1 && this.aP.p != 0 && var3 <= this.aP.m && this.aP.m <= var4 && var5 <= this.aP.n && this.aP.n <= var6) {
                                this.c(0);
                                return;
                            }

                            this.aP = null;

                            for (var7 = 0; var7 < GameScr.vMob.size(); ++var7) {
                                var13 = (Mob) GameScr.vMob.elementAt(var7);
                                var9 = Math.abs(myCharz().cx - var13.m);
                                var10 = Math.abs(myCharz().cy - var13.n);
                                var11 = var9 > var10 ? var9 : var10;
                                if (var3 <= var13.m && var13.m <= var4 && var5 <= var13.n && var13.n <= var6 && (this.aP == null || var11 < var2[0])) {
                                    this.aP = var13;
                                    var2[0] = var11;
                                }
                            }
                        }

                        Char var14;
                        if (this.aT == null) {
                            for (var7 = 0; var7 < GameScr.D.size(); ++var7) {
                                if ((var14 = (Char) GameScr.D.elementAt(var7)).statusMe != 15 && !var14.bb && this.cm == 0 && this.cn == 0) {
                                    var9 = Math.abs(myCharz().cx - var14.cx);
                                    var10 = Math.abs(myCharz().cy - var14.cy);
                                    var11 = var9 > var10 ? var9 : var10;
                                    if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.aT == null || var11 < var2[2])) {
                                        this.aT = var14;
                                        var2[2] = var11;
                                    }
                                }
                            }
                        } else {
                            if (var3 <= this.aT.cx && this.aT.cx <= var4 && var5 <= this.aT.cy && this.aT.cy <= var6 && this.aT.statusMe != 15 && !this.aT.bb) {
                                this.c(2);
                                return;
                            }

                            this.aT = null;

                            for (var7 = 0; var7 < GameScr.D.size(); ++var7) {
                                if ((var14 = (Char) GameScr.D.elementAt(var7)).statusMe != 15 && !var14.bb && this.cm == 0 && this.cn == 0) {
                                    var9 = Math.abs(myCharz().cx - var14.cx);
                                    var10 = Math.abs(myCharz().cy - var14.cy);
                                    var11 = var9 > var10 ? var9 : var10;
                                    if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.aT == null || var11 < var2[2])) {
                                        this.aT = var14;
                                        var2[2] = var11;
                                    }
                                }
                            }
                        }

                        var7 = -1;

                        for (int var15 = 0; var15 < var2.length; ++var15) {
                            if (var7 == -1) {
                                if (var2[var15] != -1) {
                                    var7 = var15;
                                }
                            } else if (var2[var15] < var2[var7] && var2[var15] != -1) {
                                var7 = var15;
                            }
                        }

                        this.c(var7);
                        if (this.me && this.H()) {
                            if (this.aP != null && !this.aP.isMobMe) {
                                this.aP = null;
                            }

                            this.aS = null;
                            this.itemFocus = null;
                        }

                    }
                }
            }
        } else {
            this.ev = 200;
        }
    }

    private void c(int var1) {
        if (var1 == 0) {
            this.at();
            this.aT = null;
            this.itemFocus = null;
        } else if (var1 == 1) {
            this.aP = null;
            this.aT = null;
            this.itemFocus = null;
        } else if (var1 == 2) {
            this.aP = null;
            this.at();
            this.itemFocus = null;
        } else {
            if (var1 == 3) {
                this.aP = null;
                this.at();
                this.aT = null;
            }

        }
    }

    public static boolean a(Char var0) {
        int var1 = GameScr.j;
        int var2 = GameScr.j + GameCanvas.z;
        int var3 = GameScr.k + 10;
        int var4 = GameScr.k + GameScr.e;
        return var0.statusMe != 15 && !var0.bb && var1 <= var0.cx && var0.cx <= var2 && var3 <= var0.cy && var0.cy <= var4;
    }

    public final boolean H() {
        return this.aM == 4 || this.aM == 3;
    }

    public final void b(Char var1) {
        if (this.cx < var1.cx) {
            this.I = 1;
        } else {
            this.I = -1;
        }

        this.ew = var1;
        this.cF = true;
    }

    public final void a(Mob var1) {
        if (this.cx < var1.m) {
            this.I = 1;
        } else {
            this.I = -1;
        }

        this.ex = var1;
        this.cF = true;
    }

    public final void I() {
        if (myCharz().cd == null && myCharz().ca == null && myCharz().cb == null && myCharz().C() == null || this.aV.size() != 0) {
            this.aV.removeAllElements();
            int var1 = 0;
            int var2 = GameScr.j + 10;
            int var3 = GameScr.j + GameCanvas.z - 10;
            int var4 = GameScr.k + 10;
            int var5 = GameScr.k + GameScr.e;

            int var6;
            for (var6 = 0; var6 < GameScr.D.size(); ++var6) {
                Char var7;
                if ((var7 = (Char) GameScr.D.elementAt(var6)).statusMe != 15 && !var7.bb && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5 && var7.charID != -114 && (TileMap.l != 129 || TileMap.l == 129 && myCharz().cy > 264)) {
                    this.aV.addElement(var7);
                    if (this.aT != null && var7.equals(this.aT)) {
                        var1 = this.aV.size();
                    }
                }
            }

            Mob var9;
            if (this.me && this.H()) {
                Res.out("co the tan cong nguoi");

                for (var6 = 0; var6 < GameScr.vMob.size(); ++var6) {
                    var9 = (Mob) GameScr.vMob.elementAt(var6);
                    GameScr.gI();
                    if (!GameScr.a(var9)) {
                        Res.out("khong the tan cong quai");
                        this.aP = null;
                    } else {
                        Res.out("co the tan ong quai");
                        this.aV.addElement(var9);
                        if (this.aP != null) {
                            var1 = this.aV.size();
                        }
                    }
                }

                this.aS = null;
                this.itemFocus = null;
                if (this.aV.size() > 0) {
                    if (var1 >= this.aV.size()) {
                        var1 = 0;
                    }

                    this.a(this.aV.elementAt(var1));
                } else {
                    this.aP = null;
                    this.at();
                    this.aT = null;
                    this.itemFocus = null;
                    cl = false;
                }
            } else {
                for (var6 = 0; var6 < GameScr.vItemMap.size(); ++var6) {
                    ItemMap var8 = (ItemMap) GameScr.vItemMap.elementAt(var6);
                    if (var2 <= var8.x && var8.x <= var3 && var4 <= var8.y && var8.y <= var5) {
                        this.aV.addElement(var8);
                        if (this.itemFocus != null && var8.equals(this.itemFocus)) {
                            var1 = this.aV.size();
                        }
                    }
                }

                for (var6 = 0; var6 < GameScr.vMob.size(); ++var6) {
                    if ((var9 = (Mob) GameScr.vMob.elementAt(var6)).p != 1 && var9.p != 0 && var2 <= var9.m && var9.m <= var3 && var4 <= var9.n && var9.n <= var5) {
                        this.aV.addElement(var9);
                        if (this.aP != null && var9.equals(this.aP)) {
                            var1 = this.aV.size();
                        }
                    }
                }

                for (var6 = 0; var6 < GameScr.G.size(); ++var6) {
                    Npc var10;
                    if ((var10 = (Npc) GameScr.G.elementAt(var6)).statusMe != 15 && var2 <= var10.cx && var10.cx <= var3 && var4 <= var10.cy && var10.cy <= var5) {
                        this.aV.addElement(var10);
                        if (this.aS != null && var10.equals(this.aS)) {
                            var1 = this.aV.size();
                        }
                    }
                }

                if (this.aV.size() > 0) {
                    if (var1 >= this.aV.size()) {
                        var1 = 0;
                    }

                    this.a(this.aV.elementAt(var1));
                } else {
                    this.aP = null;
                    this.at();
                    this.aT = null;
                    this.itemFocus = null;
                    cl = false;
                }
            }
        }
    }

    private void at() {
        if (this.me && this.aS != null) {
            if (!GameCanvas.menu.a) {
                chatPopup = null;
            }

            this.aS = null;
        }

    }

    private void au() {
        if (!GameCanvas.lowGraphic) {
            if (TileMap.a(this.cx, this.cy + 1, 1024)) {
                TileMap.b(this.cx, this.cy + 1, 512);
                TileMap.b(this.cx, this.cy - 2, 512);
            }

            if (TileMap.a(this.cx - TileMap.i, this.cy + 1, 512)) {
                TileMap.c(this.cx - TileMap.i, this.cy + 1, 512);
                TileMap.c(this.cx - TileMap.i, this.cy - 2, 512);
            }

            if (TileMap.a(this.cx + TileMap.i, this.cy + 1, 512)) {
                TileMap.c(this.cx + TileMap.i, this.cy + 1, 512);
                TileMap.c(this.cx + TileMap.i, this.cy - 2, 512);
            }

        }
    }

    public final void doInjure(int var1, int var2, boolean var3, boolean var4) {
        this.ae = var3;
        this.ad = var4;
        this.cHP -= var1;
        this.cMP -= var2;
        GameScr.gI().bE = true;
        GameScr.gI().bD = 0;
        GameScr.gI().bB = true;
        GameScr.gI().bA = 0;
        if (this.cHP < 0) {
            this.cHP = 0;
        }

        if (this.cMP < 0) {
            this.cMP = 0;
        }

        if (var4 || !var4 && this.aM != 4) {
            String var10000;
            int var10001;
            int var10002;
            byte var10003;
            byte var10004;
            int var10005;
            if (var1 <= 0) {
                if (this.me) {
                    var10000 = mResources.cB;
                    var10001 = this.cx;
                    var10002 = this.cy - this.al;
                    var10003 = 0;
                    var10004 = -2;
                    var10005 = 7;
                } else {
                    var10000 = mResources.cB;
                    var10001 = this.cx;
                    var10002 = this.cy - this.al;
                    var10003 = 0;
                    var10004 = -2;
                    var10005 = 4;
                }
            } else {
                var10000 = "-" + var1;
                var10001 = this.cx;
                var10002 = this.cy - this.al;
                var10003 = 0;
                var10004 = -2;
                var10005 = !var3 ? 0 : 3;
            }

            GameScr.a(var10000, var10001, var10002, var10003, var10004, var10005);
        }

        if (var1 > 0) {
            this.ec = 6;
        }

        ServerEffect.a(80, this, 1);
        if (this.af) {
            this.af = false;
            bG = false;
            this.a((short) this.cj, (short) this.ck);
        }

    }

    public final void J() {
        GameScr.gI().bE = true;
        GameScr.gI().bD = 0;
        GameScr.gI().bB = true;
        GameScr.gI().bA = 0;
        this.ec = 6;
        ServerEffect.a(8, this, 1);
        this.dC = true;
        this.dB = 0;
    }

    public final void a(short var1, short var2) {
        this.cA = 0;
        this.cC = false;
        if (!this.me || !this.af) {
            if (this.me) {
                this.bI = true;

                for (int var3 = 0; var3 < GameScr.D.size(); ++var3) {
                    ((Char) GameScr.D.elementAt(var3)).ba = -9999;
                }

                if (GameCanvas.panel != null && GameCanvas.panel.af != null) {
                    GameCanvas.panel.af = null;
                }

                if (GameCanvas.panel2 != null && GameCanvas.panel2.af != null) {
                    GameCanvas.panel2.af = null;
                }
            }

            this.statusMe = 5;
            this.d = var1;
            this.G = var2;
            this.F = 0;
            this.cHP = 0;
            this.aZ = -9999;
            this.ba = -9999;
            if (this.me && this.aB != null && this.aB.a.a != 14) {
                this.B();
            }

            this.aM = 0;
        }
    }

    public final void b(short var1, short var2) {
        this.cm = var1;
        this.cn = var2;
    }

    public final void K() {
        this.cHP = this.cHPFull;
        this.cMP = this.cMPFull;
        this.statusMe = 1;
        this.F = this.d = this.G = 0;
        ServerEffect.a(109, this, 2);
        GameScr.gI().cb = null;
        GameScr.N = true;
    }

    public final boolean L() {
        if (this.arrItemBag == null) {
            return false;
        } else {
            for (int var1 = 0; var1 < this.arrItemBag.length; ++var1) {
                if (this.arrItemBag[var1] != null && this.arrItemBag[var1].template.type == 6) {
                    Service.gI().useItem((byte) 0, (byte) 1, (byte) -1, this.arrItemBag[var1].template.id);
                    return true;
                }
            }

            return false;
        }
    }

    private static boolean av() {
        return TileMap.l == 1 || TileMap.l == 27 || TileMap.l == 72 || TileMap.l == 10 || TileMap.l == 17 || TileMap.l == 22 || TileMap.l == 32 || TileMap.l == 38 || TileMap.l == 43 || TileMap.l == 48;
    }

    public final boolean c(Char var1) {
        return var1 != null && myCharz().aB != null && myCharz().aB.a.e != 2 && (myCharz().aB.a.e != 4 || var1.statusMe == 14 || var1.statusMe == 5) ? (var1.aM == 3 && myCharz().aM == 3 || myCharz().aM == 5 || var1.aM == 5 || myCharz().aM == 1 && var1.aM == 1 || myCharz().aM == 4 && var1.aM == 4 || myCharz().aZ >= 0 && myCharz().aZ == var1.charID || myCharz().ba >= 0 && myCharz().ba == var1.charID && !av() || var1.ba >= 0 && var1.ba == myCharz().charID && !av() || myCharz().bx == 8 && var1.bx != 0 || myCharz().bx != 0 && var1.bx == 8 || myCharz().bx != var1.bx && myCharz().bx != 0 && var1.bx != 0) && var1.statusMe != 14 && var1.statusMe != 5 : false;
    }

    public static void M() {
        myCharz().taskMaint = null;

        for (int var0 = 0; var0 < myCharz().arrItemBag.length; ++var0) {
            if (myCharz().arrItemBag[var0] != null && myCharz().arrItemBag[var0].template.type == 8) {
                myCharz().arrItemBag[var0] = null;
            }
        }

        Npc.Y();
    }

    public final int getX() {
        return this.cx;
    }

    public final int getY() {
        return this.cy;
    }

    public final int getH() {
        return 32;
    }

    public final int getW() {
        return 24;
    }

    public final void a(Object var1) {
        if (var1 instanceof Mob) {
            this.aP = (Mob) var1;
            this.at();
            this.aT = null;
            this.itemFocus = null;
        } else if (var1 instanceof Npc) {
            myCharz().aP = null;
            myCharz().at();
            myCharz().aS = (Npc) var1;
            myCharz().aT = null;
            myCharz().itemFocus = null;
        } else if (var1 instanceof Char) {
            myCharz().aP = null;
            myCharz().at();
            myCharz().aT = (Char) var1;
            myCharz().itemFocus = null;
        } else if (var1 instanceof ItemMap) {
            myCharz().aP = null;
            myCharz().at();
            myCharz().aT = null;
            myCharz().itemFocus = (ItemMap) var1;
        }

        cl = true;
    }

    public final void stopMoving() {
    }

    public final boolean isInvisible() {
        return false;
    }

    public final boolean N() {
        return this.aP != null || this.aT != null && this.c(this.aT);
    }

    private void d(int var1) {
        if (!GameCanvas.lowGraphic) {
            if (var1 == 1) {
                EffecMn.addEff(new Effect(19, this.cx - 5, this.cy + 20, 2, 1, -1));
                return;
            }

            if (var1 == 2) {
                if (this.me && this.cA == 1) {
                    return;
                }

                if (this.u && GameCanvas.gameTick % 5 == 0) {
                    EffecMn.addEff(new Effect(22, this.cx - 5, this.cy + 35, 2, 1, -1));
                    return;
                }
            } else if (var1 == 3 && this.ck - this.cy <= 5) {
                EffecMn.addEff(new Effect(19, this.cx - 5, this.ck + 20, 2, 1, -1));
            }
        }

    }

    public static boolean a(byte var0) {
        boolean var1 = true;

        for (int var2 = 0; var2 < GameScr.H.size(); ++var2) {
            nr_ej var3;
            if ((var3 = (nr_ej) GameScr.H.elementAt(var2)) != null) {
                if (var3.a == var0) {
                    return true;
                }

                var1 = false;
            }
        }

        return var1;
    }

    public final void O() {
        if (this.cF) {
            this.cF = false;
            this.ew = null;
            this.ex = null;
        } else {
            this.cE = 0;
            this.ew = null;
            this.ex = null;
        }
    }

    public final void P() {
        this.cG = false;
        this.dA = null;
    }

    public final void Q() {
        this.cK = false;
    }

    public final void R() {
        if (this.cE != 0) {
            this.cE = 0;
        }

        if (this.cF) {
            this.cF = false;
        }

        if (this.cG) {
            this.cG = false;
        }

        this.dA = null;
        this.ew = null;
        this.ex = null;
        this.cK = false;
        this.cM = false;
    }

    public final void a(short var1, short var2, byte var3) {
        this.ey = true;
        this.eA = var1;
        this.eB = var2;
        this.eC = var3;
        this.ez = 0;
        if (this.me) {
            if (GameCanvas.panel != null) {
                GameCanvas.panel.A();
            }

            if (GameCanvas.panel2 != null) {
                GameCanvas.panel2.A();
            }
        }

    }

    public final void S() {
        this.cJ = false;
    }

    public final void T() {
        this.cH = false;
        bG = false;
        this.cI = 0;
    }

    public final void b(byte var1) {
        this.cI = 0;
        if (var1 == 4 || var1 == 5) {
            if (this.me) {
                Service.gI().i(var1);
            }

            EffecMn.addEff(new Effect(34, this.cx, this.cy + 12, 2, 1, -1));
        }

        if (var1 == 6) {
            EffecMn.addEff(new Effect(38, this.cx, this.cy + 12, 2, 1, -1));
        }

        if (this.me) {
            GameCanvas.panel.z();
            bG = true;
        }

        this.cH = true;
        if (var1 == 1) {
            this.u = false;
        } else {
            this.u = true;
        }
    }

    public final void U() {
        this.cM = false;
    }

    public final void V() {
        this.eD = this.head;
        this.eE = this.body;
        this.eF = this.leg;
        this.eG = this.bag;
    }

    public final void a(int var1, int var2, int var3, int var4) {
        if (var1 != -1) {
            this.head = var1;
        }

        if (var2 != -1) {
            this.body = var2;
        }

        if (var3 != -1) {
            this.leg = var3;
        }

        if (var4 != -1) {
            this.bag = var4;
        }

    }

    public final void W() {
        if (this.eD != -1) {
            this.head = this.eD;
            this.eD = -1;
        }

        if (this.eE != -1) {
            this.body = this.eE;
            this.eE = -1;
        }

        if (this.eF != -1) {
            this.leg = this.eF;
            this.eF = -1;
        }

        if (this.eG != -1) {
            this.bag = this.eG;
            this.eG = -1;
        }

    }

    private Effect e(int var1) {
        for (int var2 = 0; var2 < this.eH.size(); ++var2) {
            Effect var3;
            if ((var3 = (Effect) this.eH.elementAt(var2)).a == var1) {
                return var3;
            }
        }

        return null;
    }

    public final void a(Effect var1) {
        this.b((int) 0, var1.a);
        this.eH.addElement(var1);
    }

    public final void b(int var1, int var2) {
        if (var1 == -1) {
            this.eH.removeAllElements();
        } else {
            if (this.e(var2) != null) {
                this.eH.removeElement(this.e(var2));
            }

        }
    }

    private void h(mGraphics var1) {
        for (int var2 = 0; var2 < this.eH.size(); ++var2) {
            Effect var3;
            if ((var3 = (Effect) this.eH.elementAt(var2)).h == 0) {
                boolean var4 = true;
                if (var3.i == 0) {
                    if (this.statusMe != 1 && this.statusMe != 6) {
                        var4 = false;
                    } else {
                        var4 = true;
                    }
                }

                if (var4) {
                    var3.a(var1);
                }
            }
        }

    }

    private void i(mGraphics var1) {
        for (int var2 = 0; var2 < this.eH.size(); ++var2) {
            Effect var3;
            if ((var3 = (Effect) this.eH.elementAt(var2)).h == 1) {
                boolean var4 = true;
                if (var3.i == 0) {
                    if (this.statusMe != 1 && this.statusMe != 6) {
                        var4 = false;
                    } else {
                        var4 = true;
                    }
                }

                if (var4) {
                    var3.a(var1);
                }
            }
        }

    }

    private void aw() {
        for (int var1 = 0; var1 < this.eH.size(); ++var1) {
            ((Effect) this.eH.elementAt(var1)).a();
        }

    }

    public final int X() {
        return this.au + this.av;
    }

    private void a(mGraphics var1, int var2, int var3, int var4, int var5) {
        if (this.head == 934 && (this.statusMe == 1 || this.statusMe == 6)) {
            if (eI == null || eI.d == null) {
                Image var7 = Main.loadImage("/redeye.png");
                eI = new nr_cz(var7, 14, 10);
                return;
            }

            if (this.eN[this.eJ] != -1) {
                byte var6 = 8;
                if (var4 == 2) {
                    var6 = -8;
                }

                eI.a(this.eN[this.eJ], var2 + var6, var3 + 15, var4, var5, var1);
            }
        }

    }

    private static boolean f(int var0) {
        for (int var1 = 0; var1 < cQ.length; ++var1) {
            if (cQ[var1][0] == var0) {
                return true;
            }
        }

        return false;
    }

    private int g(int var1) {
        for (int var2 = 0; var2 < cQ.length; ++var2) {
            if (cQ[var2][0] == var1) {
                return cQ[var2][this.eO / 4 % cQ[var2].length];
            }
        }

        return var1;
    }

    private void b(mGraphics var1, int var2, int var3) {
        try {
            if (this.cV != -1) {
                if (h(var2)) {
                    if (this.eV != null) {
                        this.eV.a(GameCanvas.gameTick / 4 % this.eV.c, this.cx + fa[var2][0] * (this.I == 1 ? 1 : -1), var3 + fa[var2][1], this.I == 1 ? 0 : 2, 33, var1);
                    } else {
                        this.eV = Main.d(this.eX + this.eZ + this.cV);
                    }
                } else if (this.eT != null) {
                    this.eT.a(GameCanvas.gameTick / 4 % this.eT.c, this.cx + fa[var2][0] * (this.I == 1 ? 1 : -1), var3 + fa[var2][1], this.I == 1 ? 0 : 2, 33, var1);
                } else {
                    this.eT = Main.d(this.eX + this.cV);
                }
            }
        } catch (Exception var4) {
            ;
        }
    }

    private static boolean h(int var0) {
        return var0 == 2 || var0 == 3 || var0 == 4 || var0 == 5 || var0 == 6 || var0 == 9 || var0 == 10 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 26 || var0 == 27 || var0 == 28 || var0 == 29;
    }
}
