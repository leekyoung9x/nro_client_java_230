package nro;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.GameCanvas;
import main.GamePad;

public final class GameScr extends mScreen implements nr_bt {

   public static boolean a = false;
   public static boolean b = false;
   public static GameScr c;
   public static int d;
   public static int e;
   public static int f;
   private static int ch;
   private static int ci;
   public static int g;
   private static int cj;
   private static int ck;
   private static int cl;
   public static int h;
   public static int i;
   public static int j;
   public static int k;
   private static int cm;
   private static int cn;
   private static int co;
   private static int cp;
   public static int l;
   public static int m;
   public static int n;
   private static int cq;
   public static int o;
   public static int p;
   public static int q;
   public static int r;
   public Command s;
   public static int t;
   public static nr_ce[] u;
   public static nr_cp[] v;
   public static nr_bu[] w;
   public static Rms[] x;
   public static nr_cj[] y;
   public static int z;
   public static MyVector A = new MyVector("vClan");
   public static MyVector B;
   public static MyVector C;
   public static MyVector D;
   public static MyVector vItemMap;
   private static MyVector cr;
   public static MyVector vMob;
   public static MyVector G;
   public static MyVector H;
   public static nr_cu[] I;
   private static int cs;
   public static int J;
   private static int ct;
   public nr_ee[] K;
   private static nr_do cu;
   private static nr_do cv;
   public static int L;
   public static boolean M;
   private static boolean cw;
   private static boolean cx;
   private static boolean cy;
   private static boolean cz;
   private static boolean cA;
   private static boolean cB;
   public static boolean N;
   public static boolean O;
   private static boolean cC;
   private static boolean cD;
   private static boolean cE;
   private static boolean cF;
   private static boolean cG;
   private static boolean cH;
   private static boolean cI;
   private static boolean cJ;
   private static boolean cK;
   private static boolean cL;
   private static boolean cM;
   private static boolean cN;
   private static boolean cO;
   private static boolean cP;
   private static boolean cQ;
   private static boolean cR;
   private static boolean cS;
   private static boolean cT;
   private static boolean cU;
   private static boolean cV;
   private static boolean cW;
   private static boolean cX;
   private static boolean cY;
   private static boolean cZ;
   private static boolean da;
   private static boolean db;
   private static boolean dc;
   private static boolean dd;
   private static boolean de;
   private static boolean df;
   public static Char P;
   public static long[] exps;
   private int dg = 0;
   public int[] R;
   public int[] S;
   public int[] T;
   public int[] U;
   public int[] V;
   public int[] W;
   public String[] X;
   public String[] Y;
   public int Z = 0;
   public int aa = 0;
   private int dh = -1;
   private boolean di;
   public static int[] ab;
   public static int[] ac;
   public static Image ad;
   public static Image ae;
   public static Image af;
   public static Image ag;
   public static Image ah;
   public static Image ai;
   public static Image aj;
   public static byte ak;
   public static byte al;
   public static byte am;
   public static byte an;
   public static byte ao;
   public static byte ap;
   public static byte aq;
   public static byte ar;
   private static Image dj;
   private static Image dk;
   public static Image imgMenu;
   private static Image dl;
   private static Image dm;
   public static Image at;
   public static Image au;
   private static Image dn;
   private static Image fd_Image_3;
   private static Image dp;
   private static Image dq;
   private static Image dr;
   private static Image ds;
   public static Image av;
   public static Image aw;
   public static Image ax;
   public static Image ay;
   public static Image az;
   public static Image aA;
   public static byte aB;
   public static nr_ei aC;
   public static nr_ei aD;
   private static Image dt;
   private static Image du;
   private static Image dv;
   public static Image arrItemBag;
   private static Image dw;
   private static Image dx;
   public static Image aF;
   public static Image aG;
   public static Image aH;
   public static Image aI;
   public static Image aJ;
   public Mob aK;
   public nr_k aL;
   private int dy;
   public static int aM;
   private static GamePad dz;
   public static int isAnalog;
   public static Skill[] aO;
   public static Skill[] aP;
   public Command aQ;
   private static int dA;
   public static long aR;
   public boolean aS;
   private boolean dB;
   private int dC;
   private int dD;
   private int dE;
   private int dF;
   private int dG;
   private boolean dH;
   public long aT;
   boolean aU;
   private boolean dI;
   private int dJ;
   private int dK;
   private int dL;
   private int dM;
   public static boolean aV;
   private long dN;
   private long dO;
   public int aW;
   int aX;
   public boolean aY;
   public boolean aZ;
   private static Image dP;
   public boolean ba = false;
   public boolean bb = false;
   private boolean dQ = false;
   private int dR;
   private int dS;
   private int dT;
   private int dU;
   public boolean bc;
   private boolean dV;
   public int bd;
   public int be;
   public int bf;
   public int bg;
   public int bh;
   private static int dW;
   public static boolean bi;
   public static boolean bj;
   public static boolean bk;
   private int dX;
   public static int bl;
   private int dY = 0;
   private int dZ = -1;
   private Skill ea;
   public String bm;
   private boolean eb;
   private int ec;
   private int ed = -1;
   private static long ee;
   private static long ef;
   private static long eg;
   private static long eh;
   private static int ei;
   private int ej = 0;
   public static int bn;
   public static Image bo;
   public static Image bp;
   public int[] bq;
   public static Image br;
   public String bs;
   private static int ek;
   public static boolean bt;
   public static int bu;
   private static int[] el;
   private static int[] em;
   public static MyVector bv;
   private int en = 0;
   public static Image bw;
   private static int eo;
   private static int ep;
   private static int eq;
   private static int er;
   private static int es;
   public static int bx;
   public static int by;
   private static int et;
   private static int eu;
   private static int[] ev;
   private static int[] ew;
   private static int ex;
   private static int ey;
   public int bz;
   public int bA;
   public boolean bB;
   public int bC;
   public int bD;
   public boolean bE;
   private long ez;
   private long eA;
   private int eB;
   public static String[] bF;
   public static int[] bG;
   public static int[] bH;
   private static int[] eC;
   private static int[] eD;
   private static int[] eE;
   public static int[] bI;
   public static int[] bJ;
   private static int[] eF;
   private static int[] eG;
   private static int[] eH;
   private static int[] eI;
   private static int[] eJ;
   private static int[] eK;
   private static Image[] eL;
   private static int eM;
   private static int eN;
   private static int eO;
   private int eP;
   public static int bK;
   public static int bL;
   public static int bM;
   public static int bN;
   private static int eQ;
   private static int eR;
   private static int eS;
   private static int eT;
   private Command eU;
   public static boolean bO;
   public static boolean bP;
   public nr_ds bQ;
   private static Vector eV;
   public boolean bR;
   private int[] eW;
   private int[] eX;
   private int[] eY;
   private int[] eZ;
   private int[] fa;
   private int fb;
   private String fc;
   private int fd;
   private int fe;
   private int ff;
   private boolean fg;
   public byte bS;
   public boolean bT;
   public int bU;
   public static boolean isPaintChatVip;
   public static byte bW;
   public static byte bX;
   private String fh;
   private String[] fi;
   public ItemOptionTemplate[] optionTemplateId;
   private static Image fj;
   public static nr_cc bZ;
   private static nr_cz fk;
   private static nr_cz fl;
   private static Image fm;
   private static Image fn;
   private static Image fo;
   public static boolean anNhat ; // Mặc định tắt auto nhặt
   public static boolean isCheckFuture;
   public static boolean isChangeZone;
   public static int tocdochay = 4;


   static {
      new MyVector("vPtMap");
      B = new MyVector("vFriend");
      C = new MyVector("vEnemies");
      D = new MyVector("vCharInMap");
      vItemMap = new MyVector("vItemMap");
      cr = new MyVector("vMobAttack");
      new MyVector("vSet");
      vMob = new MyVector("vMob");
      G = new MyVector("vNpc");
      H = new MyVector("vFlag");
      cs = 0;
      J = -1;
      ct = 0;
      cu = new nr_do();
      cv = new nr_do();
      new MyVector("vItemUpGrade");
      M = false;
      cw = false;
      cx = false;
      cy = false;
      cz = false;
      cA = false;
      cB = false;
      N = false;
      O = false;
      cC = false;
      cD = false;
      cE = false;
      cF = false;
      cG = false;
      cH = false;
      cI = false;
      cJ = false;
      cK = false;
      cL = false;
      cM = false;
      cN = false;
      cO = false;
      cP = false;
      cQ = false;
      cR = false;
      cS = false;
      cT = false;
      cU = false;
      cV = false;
      cW = false;
      cX = false;
      cY = false;
      cZ = false;
      da = false;
      db = false;
      dc = false;
      dd = false;
      de = false;
      df = false;
      ad = Main.loadImage("/mainImage/myTexture2dstat.png");
      ae = Main.loadImage("/mainImage/myTexture2dlineColor20.png");
      af = Main.loadImage("/mainImage/myTexture2dlineColor21.png");
      ag = Main.loadImage("/mainImage/myTexture2dlineColor22.png");
      ah = Main.loadImage("/mainImage/myTexture2dlineColor00.png");
      ai = Main.loadImage("/mainImage/myTexture2dlineColor01.png");
      aj = Main.loadImage("/mainImage/myTexture2dlineColor02.png");
      aB = 0;
      aC = new nr_ei();
      aD = new nr_ei();
      dz = new GamePad();
      isAnalog = 0;
      fk = new nr_cz(Main.loadImage("/mainImage/i_pve_bar_0.png"), 6, 15);
      fl = new nr_cz(Main.loadImage("/mainImage/i_pve_bar_1.png"), 38, 21);
      fm = Main.loadImage("/mainImage/i_vs.png");
      fn = Main.loadImage("/mainImage/i_charlife.png");
      fj = Main.loadImage("/mainImage/i_hp.png");
      fo = Main.loadImage("/mainImage/i_khung.png");
      av = Main.loadImage("/mainImage/myTexture2dbtnl.png");
      aw = Main.loadImage("/mainImage/myTexture2dbtnlf.png");
      ax = Main.loadImage("/mainImage/myTexture2dbtnl2.png");
      ay = Main.loadImage("/mainImage/myTexture2dbtnlf2.png");
      dt = Main.loadImage("/mainImage/myTexture2dpanel.png");
      du = Main.loadImage("/mainImage/panel2.png");
      dv = Main.loadImage("/mainImage/myTexture2dHP.png");
      dw = Main.loadImage("/mainImage/SP.png");
      dx = Main.loadImage("/mainImage/myTexture2dhpLost.png");
      aF = Main.loadImage("/mainImage/myTexture2dmpLost.png");
      arrItemBag = Main.loadImage("/mainImage/myTexture2dMP.png");
      at = Main.loadImage("/mainImage/myTexture2dskill.png");
      au = Main.loadImage("/mainImage/myTexture2dskill2.png");
      imgMenu = Main.loadImage("/mainImage/myTexture2dmenu.png");
      dl = Main.loadImage("/mainImage/myTexture2dfocus.png");
      aG = Main.loadImage("/mainImage/tm-do.png");
      aH = Main.loadImage("/mainImage/tm-vang.png");
      aI = Main.loadImage("/mainImage/tm-xam.png");
      aJ = Main.loadImage("/mainImage/tm-xanh.png");
      if(GameCanvas.isTouch) {
         Main.loadImage("/mainImage/myTexture2darrow.png");
         Main.loadImage("/mainImage/myTexture2darrow2.png");
         dj = Main.loadImage("/mainImage/myTexture2dchat.png");
         dk = Main.loadImage("/mainImage/myTexture2dchat2.png");
         dm = Main.loadImage("/mainImage/myTexture2dfocus2.png");
         dn = Main.loadImage("/mainImage/myTexture2dPea0.png");
         fd_Image_3 = Main.loadImage("/mainImage/myTexture2dPea1.png");
         az = Main.loadImage("/mainImage/myTexture2danalog1.png");
         aA = Main.loadImage("/mainImage/myTexture2danalog2.png");
         dp = Main.loadImage("/mainImage/myTexture2dPea2.png");
         dq = Main.loadImage("/mainImage/myTexture2dPea3.png");
         dr = Main.loadImage("/mainImage/myTexture2dfirebtn0.png");
         ds = Main.loadImage("/mainImage/myTexture2dfirebtn1.png");
      }

      isAnalog = Rms.loadRmsInt("analog") == 1?1:0;
      dz = new GamePad();
      byte[] var0 = Rms.b("NRdataVersion");
      byte[] var1 = Rms.b("NRmapVersion");
      byte[] var2 = Rms.b("NRskillVersion");
      byte[] var3 = Rms.b("NRitemVersion");
      if(var0 != null) {
         ak = var0[0];
      }

      if(var1 != null) {
         al = var1[0];
      }

      if(var2 != null) {
         am = var2[0];
      }

      if(var3 != null) {
         an = var3[0];
      }

      aO = new Skill[10];
      aP = new Skill[10];
      dP = Main.loadImage("/bg/trans.png");
      dW = 0;
      bo = Main.loadImage("/mainImage/myTexture2dnut.png");
      bp = Main.loadImage("/mainImage/myTexture2dnutF.png");
      bt = true;
      el = new int[]{1, -1, 1, -1};
      em = new int[]{1, -1, -1, 1};
      bv = new MyVector("");
      bw = Main.loadImage("/mainImage/myTexture2darrow3.png");
      bG = new int[5];
      bH = new int[5];
      eD = new int[5];
      eE = new int[5];
      bI = new int[5];
      bF = new String[5];
      eC = new int[5];
      eF = new int[5];
      bJ = new int[8];

      for(int var4 = 0; var4 < 5; ++var4) {
         bI[var4] = -1;
      }

      bM = 140;
      bN = 160;
      bO = false;
      bP = false;
      eV = new Vector();
   }

   public final void a() {
      DataInputStream var1 = null;

      try {
         short var2;
         x = new Rms[var2 = (var1 = new DataInputStream(new ByteArrayInputStream(Rms.b("NR_part")))).readShort()];

         for(int var3 = 0; var3 < var2; ++var3) {
            byte var4 = var1.readByte();
            x[var3] = new Rms(var4);

            for(int var13 = 0; var13 < x[var3].a.length; ++var13) {
               x[var3].a[var13] = new nr_w();
               x[var3].a[var13].a = var1.readShort();
               x[var3].a[var13].b = var1.readByte();
               x[var3].a[var13].c = var1.readByte();
            }
         }
      } catch (Exception var11) {
         var11.printStackTrace();
      } finally {
         try {
            var1.close();
         } catch (IOException var10) {
            var10.printStackTrace();
         }

      }

      SmallImage.c();
   }

   public static void a(Image var0, Image var1, Image var2, float var3, float var4, int var5, float var6, mGraphics var7) {
      var5 = var7.c();
      int var8 = var7.d();
      int var9 = var7.e();
      int var10 = var7.f();
      var7.e((int)var3, (int)var4, (int)var6, 13);

      for(int var11 = 0; var11 < 4; ++var11) {
         var7.a(var1, var3 + (float)((var11 + 1) * 15), var4, 0);
      }

      var7.a(var0, var3, var4, 0);
      var7.a(var1, var3 + 100.0F - 30.0F, var4, 0);
      var7.a(var2, var3 + 100.0F - 15.0F, var4, 0);
      var7.e(var5, var8, var9, var10);
   }

   public static boolean e() {
      return TileMap.l >= 53 && TileMap.l <= 62;
   }

   public static boolean f() {
      return TileMap.l >= 63;
   }

   public final void b() {
      nr_bo.f = false;
      if(nr_dw.b()) {
         SoundMn.gI();
      }

      nr_x.c = false;
      Char.bH = false;
      if(!a) {
         Service.gI().s();
      }

      if(TileMap.b() && nr_cq.b) {
         nr_cq.b = false;
         super.cc = null;
      }

      aC.f = true;
      aD.f = true;
      b = true;
      this.dy = 0;
      a = false;
      super.b();
   }
   public void tsV3() {
    if (!GameScr.isChangeZone &&
        Char.myCharz().statusMe != 14 &&
        Char.myCharz().statusMe != 5 &&
        !Char.myCharz().bk &&
        !Char.myCharz().cg &&
        !Char.myCharz().y()) {

        if (Char.myCharz().aP == null || (Char.myCharz().aP != null && Char.myCharz().aP.isMobMe)) {
            for (int i = 0; i < GameScr.vMob.size(); i++) {
                Mob mob = (Mob) GameScr.vMob.elementAt(i);
                if (mob.p != 0 && mob.p != 1 && mob.k > 0 && !mob.isMobMe && !mob.j()) {
                    Char.myCharz().cx = mob.x;
                    Char.myCharz().cy = mob.y;
                    Char.myCharz().aP = mob;
                    Service.gI().g();

                    Char.myCharz().cx = mob.x;
                    Char.myCharz().cy = mob.y + 1;
                    Service.gI().g();

                    Char.myCharz().cx = mob.x;
                    Char.myCharz().cy = mob.y;
                    Service.gI().g();

                   
                    break;
                }
            }
        } else if (Char.myCharz().aP.k <= 0 || Char.myCharz().aP.p == 1 || Char.myCharz().aP.p == 0) {
            Char.myCharz().aP = null;
        }

        if (Char.myCharz().aP == null) {
            Mob mob2 = (Mob) GameScr.vMob.elementAt(0);
            for (int j = 0; j < GameScr.vMob.size(); j++) {
                Mob mob3 = (Mob) GameScr.vMob.elementAt(j);
                if (mob3.timeDie < mob2.timeDie) {
                    mob2 = mob3;
                }
            }

            if (mob2 != null) {
                Char.myCharz().cx = mob2.t;
                Char.myCharz().cy = mob2.u;
                Char.myCharz().aP = mob2;
                Service.gI().g();

                Char.myCharz().cx = mob2.t;
                Char.myCharz().cy = mob2.u + 1;
                Service.gI().g();

                Char.myCharz().cx = mob2.t;
                Char.myCharz().cy = mob2.u;
                Service.gI().g();
            }
        }

        Skill skill = null;
        if (GameCanvas.isTouch) {
            for (int k = 0; k < GameScr.aP.length; k++) {
                Skill s = GameScr.aP[k];
                if (s != null &&
                    !s.j &&
                    s.a.a != 10 &&
                    s.a.a != 11 &&
                    s.a.a != 14 &&
                    s.a.a != 23 &&
                    s.a.a != 7 &&
                    Char.myCharz().C() == null) {

                    int manaUse = (s.a.d == 2) ? 1
                                 : (s.a.d == 1) ? (s.i * Char.myCharz().cMPFull / 100)
                                 : s.i;

                    if (Char.myCharz().cMP >= manaUse) {
                        if (skill == null || skill.e < s.e) {
                            skill = s;
                        }
                    }
                }
            }

            if (skill != null) {
                this.a(skill, true);
                this.b(Char.myCharz().aP);
                return;
            }
        } else {
            for (int l = 0; l < GameScr.aP.length; l++) {
                Skill s = GameScr.aP[l];
                if (s != null &&
                    !s.j &&
                    s.a.a != 10 &&
                    s.a.a != 11 &&
                    s.a.a != 14 &&
                    s.a.a != 23 &&
                    s.a.a != 7 &&
                    Char.myCharz().C() == null) {

                    int manaUse = (s.a.d == 2) ? 1
                                 : (s.a.d == 1) ? (s.i * Char.myCharz().cMPFull / 100)
                                 : s.i;

                    if (Char.myCharz().cMP >= manaUse) {
                        if (skill == null || skill.e < s.e) {
                            skill = s;
                        }
                    }
                }
            }

            if (skill != null) {
                this.a(skill, true);
                this.b(Char.myCharz().aP);
            }
        }
    }
}

   public static void g() {
      nr_ci.a.removeAllElements();
      D.removeAllElements();
      vItemMap.removeAllElements();
      nr_cw.w.removeAllElements();
      nr_cw.z.removeAllElements();
      nr_cw.y.removeAllElements();
      nr_cw.A.removeAllElements();
      nr_cw.v.removeAllElements();
      cr.removeAllElements();
      vMob.removeAllElements();
      G.removeAllElements();
      Char.myCharz().bE.removeAllElements();
   }

   public final void a(byte[] var1) {
      Res.out("GET ONSCREENSKILL!");
      aP = new Skill[10];
      if(var1 == null) {
         Res.out("null");
         Res.out("LOAD DEFAULT ONSCREEN SKILL");

         for(int var5 = 0; var5 < aP.length && var5 < Char.myCharz().az.size(); ++var5) {
            Skill var6 = (Skill)Char.myCharz().az.elementAt(var5);
            aP[var5] = var6;
         }

         B();
      } else {
         int var2 = 0;

         while(var2 < var1.length) {
            int var3 = 0;

            while(true) {
               if(var3 < Char.myCharz().az.size()) {
                  Skill var4;
                  if((var4 = (Skill)Char.myCharz().az.elementAt(var3)).a.a != var1[var2]) {
                     ++var3;
                     continue;
                  }

                  aP[var2] = var4;
               }

               ++var2;
               break;
            }
         }

      }
   }

   public final void b(byte[] var1) {
      Res.out("GET KEYSKILL!");
      aO = new Skill[10];
      if(var1 == null) {
         Res.out("LOAD DEFAULT KEY SKILL");

         for(int var5 = 0; var5 < aO.length && var5 < Char.myCharz().az.size(); ++var5) {
            Skill var6 = (Skill)Char.myCharz().az.elementAt(var5);
            aO[var5] = var6;
         }

         C();
      } else {
         int var2 = 0;

         while(var2 < var1.length) {
            int var3 = 0;

            while(true) {
               if(var3 < Char.myCharz().az.size()) {
                  Skill var4;
                  if((var4 = (Skill)Char.myCharz().az.elementAt(var3)).a.a != var1[var2]) {
                     ++var3;
                     continue;
                  }

                  aO[var2] = var4;
               }

               ++var2;
               break;
            }
         }

      }
   }

   public final void c(byte[] var1) {
      Res.out("GET CURRENTSKILL!");
      if(var1 != null && var1.length != 0) {
         for(int var2 = 0; var2 < Char.myCharz().az.size(); ++var2) {
            Skill var3;
            if((var3 = (Skill)Char.myCharz().az.elementAt(var2)).a.a == var1[0]) {
               Char.myCharz().aB = var3;
               break;
            }
         }
      } else if(Char.myCharz().az.size() > 0) {
         Char.myCharz().aB = (Skill)Char.myCharz().az.elementAt(0);
      }

      if(Char.myCharz().aB != null) {
         Service.gI().i((int)Char.myCharz().aB.a.a);
         Char.myCharz();
      }

   }

   protected static void a(nr_en var0) {
      Res.out("DO SET ONSCREEN SKILL");
      Skill var4 = Char.myCharz().a(var0);
      MyVector var1 = new MyVector("");

      for(int var2 = 0; var2 < (GameCanvas.isTouch?10:5); ++var2) {
         Object[] var3;
         (var3 = new Object[2])[0] = var4;
         var3[1] = String.valueOf(var2);
         var1.addElement(new Command(mResources.cx + (var2 + 1), 11120, var3));
      }

      GameCanvas.menu.a(var1);
   }

   protected static void b(nr_en var0) {
      Res.out("DO SET KEY SKILL");
      Skill var5 = Char.myCharz().a(var0);
      String[] var1 = TField.isQwerty?mResources.aN:mResources.aO;
      MyVector var2 = new MyVector("");

      for(int var3 = 0; var3 < (GameCanvas.isTouch?10:5); ++var3) {
         Object[] var4;
         (var4 = new Object[2])[0] = var5;
         var4[1] = String.valueOf(var3);
         var2.addElement(new Command(var1[var3], 11121, var4));
      }

      GameCanvas.menu.a(var2);
   }

   private static void B() {
      byte[] var0 = new byte[aP.length];

      for(int var1 = 0; var1 < aP.length; ++var1) {
         if(aP[var1] == null) {
            var0[var1] = -1;
         } else {
            var0[var1] = aP[var1].a.a;
         }
      }

      Service.gI().changeOnKeyScr(var0);
   }

   private static void C() {
      byte[] var0 = new byte[aO.length];

      for(int var1 = 0; var1 < aO.length; ++var1) {
         if(aO[var1] == null) {
            var0[var1] = -1;
         } else {
            var0[var1] = aO[var1].a.a;
         }
      }

      Service.gI().changeOnKeyScr(var0);
   }

   public static boolean h() {
      for(int var0 = Char.myCharz().arrItemBag.length - 1; var0 >= 0; --var0) {
         if(Char.myCharz().arrItemBag[var0] == null) {
            return false;
         }
      }

      return true;
   }

   public static void a(String[] var0, Npc var1) {
      MyVector var2 = new MyVector("");

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var2.addElement(new Command(var0[var3], 11057, var1));
      }

      GameCanvas.menu.a(var2);
   }

   public static void i() {
      DataInputStream var0 = null;

      try {
         short var1;
         y = new nr_cj[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(Rms.b("NR_effect")))).readShort()];

         for(int var2 = 0; var2 < var1; ++var2) {
            y[var2] = new nr_cj();
            var0.readShort();
            y[var2].a = new nr_ek[var0.readByte()];

            for(int var3 = 0; var3 < y[var2].a.length; ++var3) {
               y[var2].a[var3] = new nr_ek();
               y[var2].a[var3].c = var0.readShort();
               y[var2].a[var3].a = var0.readByte();
               y[var2].a[var3].b = var0.readByte();
            }
         }

         return;
      } catch (Exception var10) {
         var10.printStackTrace();
      } finally {
         try {
            var0.close();
         } catch (IOException var9) {
            var9.printStackTrace();
         }

      }

   }

   public static void j() {
      DataInputStream var0 = null;

      try {
         short var1;
         v = new nr_cp[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(Rms.b("NR_arrow")))).readShort()];

         for(int var2 = 0; var2 < var1; ++var2) {
            v[var2] = new nr_cp();
            var0.readShort();
            v[var2].a[0] = var0.readShort();
            v[var2].a[1] = var0.readShort();
            v[var2].a[2] = var0.readShort();
         }

         return;
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         try {
            var0.close();
         } catch (IOException var8) {
            var8.printStackTrace();
         }

      }

   }

   public static void k() {
      DataInputStream var0 = null;

      try {
         short var1;
         w = new nr_bu[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(Rms.b("NR_dart")))).readShort()];

         for(int var2 = 0; var2 < var1; ++var2) {
            w[var2] = new nr_bu();
            var0.readShort();
            w[var2].h = var0.readShort();
            w[var2].i = var0.readShort() << 8;
            w[var2].g = var0.readShort();
            short var3 = var0.readShort();
            w[var2].c = new short[var3];

            int var4;
            for(var4 = 0; var4 < var3; ++var4) {
               w[var2].c[var4] = var0.readShort();
            }

            var3 = var0.readShort();
            w[var2].d = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               w[var2].d[var4] = var0.readShort();
            }

            var3 = var0.readShort();
            w[var2].e = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               w[var2].e[var4] = var0.readShort();
            }

            var3 = var0.readShort();
            w[var2].f = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               w[var2].f[var4] = var0.readShort();
            }

            var3 = var0.readShort();
            w[var2].a = new short[var3][];

            short var5;
            int var6;
            for(var4 = 0; var4 < var3; ++var4) {
               var5 = var0.readShort();
               w[var2].a[var4] = new short[var5];

               for(var6 = 0; var6 < var5; ++var6) {
                  w[var2].a[var4][var6] = var0.readShort();
               }
            }

            var3 = var0.readShort();
            w[var2].b = new short[var3][];

            for(var4 = 0; var4 < var3; ++var4) {
               var5 = var0.readShort();
               w[var2].b[var4] = new short[var5];

               for(var6 = 0; var6 < var5; ++var6) {
                  w[var2].b[var4][var6] = var0.readShort();
               }
            }
         }

         return;
      } catch (Exception var13) {
         var13.printStackTrace();
      } finally {
         try {
            var0.close();
         } catch (IOException var12) {
            var12.printStackTrace();
         }

      }

   }

   public static void l() {
      DataInputStream var0 = null;

      try {
         short var1 = (var0 = new DataInputStream(new ByteArrayInputStream(Rms.b("NR_skill")))).readShort();
         u = new nr_ce[Skills.a.size()];

         for(int var2 = 0; var2 < var1; ++var2) {
            short var3;
            if((var3 = var0.readShort()) == 1111) {
               var3 = (short)(var1 - 1);
            }

            u[var3] = new nr_ce();
            u[var3].a = var3;
            u[var3].b = var0.readShort();
            if(u[var3].b <= 0) {
               u[var3].b = 80;
            }

            var0.readByte();
            u[var3].c = new nr_f[var0.readByte()];

            int var4;
            for(var4 = 0; var4 < u[var3].c.length; ++var4) {
               u[var3].c[var4] = new nr_f();
               u[var3].c[var4].a = var0.readByte();
               u[var3].c[var4].b = var0.readShort();
               u[var3].c[var4].c = var0.readShort();
               u[var3].c[var4].d = var0.readShort();
               u[var3].c[var4].e = var0.readShort();
               u[var3].c[var4].f = var0.readShort();
               u[var3].c[var4].g = var0.readShort();
               u[var3].c[var4].h = var0.readShort();
               u[var3].c[var4].i = var0.readShort();
               u[var3].c[var4].j = var0.readShort();
               u[var3].c[var4].k = var0.readShort();
               u[var3].c[var4].l = var0.readShort();
               u[var3].c[var4].m = var0.readShort();
            }

            u[var3].d = new nr_f[var0.readByte()];

            for(var4 = 0; var4 < u[var3].d.length; ++var4) {
               u[var3].d[var4] = new nr_f();
               u[var3].d[var4].a = var0.readByte();
               u[var3].d[var4].b = var0.readShort();
               u[var3].d[var4].c = var0.readShort();
               u[var3].d[var4].d = var0.readShort();
               u[var3].d[var4].e = var0.readShort();
               u[var3].d[var4].f = var0.readShort();
               u[var3].d[var4].g = var0.readShort();
               u[var3].d[var4].h = var0.readShort();
               u[var3].d[var4].i = var0.readShort();
               u[var3].d[var4].j = var0.readShort();
               u[var3].d[var4].k = var0.readShort();
               u[var3].d[var4].l = var0.readShort();
               u[var3].d[var4].m = var0.readShort();
            }
         }
      } catch (Exception var11) {
         var11.printStackTrace();
      } finally {
         try {
            var0.close();
         } catch (IOException var10) {
            var10.printStackTrace();
         }

      }

      Res.out("READ SKILL DONE");
   }

   public static GameScr gI() {
      if(c == null) {
         c = new GameScr();
      }

      return c;
   }

   public static void n() {
      c = null;
   }

   public final void o() {
      if(eL == null) {
         eL = new Image[3];

         for(int var1 = 0; var1 < 3; ++var1) {
            eL[var1] = Main.loadImage("/e/sp" + var1 + ".png");
         }
      }

      eG = new int[2];
      eH = new int[2];
      eI = new int[2];
      eJ = new int[2];
      eK = new int[2];
      eI[0] = eI[1] = -1;
      this.eP = 84;
      eM = 66;
      eO = 59;
      eN = 61;
   }

   public GameScr() {
      int[] var10000 = new int[]{-1, -1};
      this.bR = false;
      this.fh = "";
      new Command("", 11021);
      this.aQ = new Command("  ", 11000);
      this.s = new Command("", 11001);
      this.aQ.img = imgMenu;
      this.aQ.w = mGraphics.getImageWidth(this.aQ.img) + 20;
      this.aQ.isPlaySoundButton = false;
      this.s.img = dl;
      if(GameCanvas.isTouch) {
         this.aQ.x = 0;
         this.aQ.y = 50;
         this.s = null;
      } else {
         this.aQ.x = 0;
         this.aQ.y = e - 30;
         this.s.x = d - 32;
         this.s.y = e - 32;
      }

      super.cc = this.s;
      bn = 1;
      if(GameCanvas.isTouch) {
         N = true;
      }

   }

   public static final void a(int var0, int var1) {
      d = GameCanvas.z;
      h = 39;
      e = GameCanvas.A;
      if((cl = GameCanvas.A / 6) < 48) {
         cl = 48;
      }

      f = d >> 1;
      ck = e >> 1;
      cj = e - 120;
      g = (e << 1) / 3;
      i = d / 6;
      ch = d / TileMap.i + 2;
      ci = e / TileMap.i + 2;
      if(d % 24 != 0) {
         ++ch;
      }

      n = (TileMap.a - 1) * TileMap.i - d;
      cq = (TileMap.b - 1) * TileMap.i - e;
      if(var0 == -1 && var1 == -1) {
         j = l = Char.myCharz().cx - f + i * Char.myCharz().I;
         k = m = Char.myCharz().cy - g - 1;
      } else {
         j = l = var0 - cj + i * Char.myCharz().I;
         k = m = var1 - g - 1;
      }

      if(j < 24) {
         l = 24;
         j = 24;
      }

      if(j > n) {
         j = l = n;
      }

      if(k < 0) {
         m = 0;
         k = 0;
      }

      if(k > cq) {
         k = m = cq;
      }

      if((o = j / TileMap.i - 1) < 0) {
         o = 0;
      }

      p = k / TileMap.i;
      q = o + ch;
      r = p + ci;
      if(p < 0) {
         p = 0;
      }

      if(r > TileMap.b - 1) {
         r = TileMap.b - 1;
      }

      if((TileMap.F = q - o << 2) > TileMap.a) {
         TileMap.F = TileMap.a;
      }

      if((TileMap.G = r - p << 2) > TileMap.b) {
         TileMap.G = TileMap.b;
      }

      if((TileMap.B = (Char.myCharz().cx - 2 * d) / TileMap.i) < 0) {
         TileMap.B = 0;
      }

      if((TileMap.C = TileMap.B + TileMap.F) > TileMap.a) {
         TileMap.C = TileMap.a;
      }

      if((TileMap.D = (Char.myCharz().cy - 2 * e) / TileMap.i) < 0) {
         TileMap.D = 0;
      }

      if((TileMap.E = TileMap.D + TileMap.G) > TileMap.b) {
         TileMap.E = TileMap.b;
      }

      nr_cm.b().c = c;
      nr_cm.b().a.b = GameCanvas.A - 35 - nr_cm.b().a.d;
      nr_cm.b().a();
      if(GameCanvas.isTouch) {
         eo = e - 88;
         ep = d - 40;
         eq = 2;
         if(GameCanvas.z <= 240) {
            ep = d - 35;
            eq = 5;
         }

         er = d - 55;
         es = eo + 35;
         et = d - 37;
         eu = eo - 1;
         if(GameCanvas.z >= 450) {
            eu -= 12;
            by -= 7;
            er -= 10;
            es -= 5;
            et -= 10;
         }
      }

      setSkillBarPostion();
      ek = GameCanvas.z > 200?40:30;
      GameCanvas.panel.ar = true;
   }

   public static void setSkillBarPostion() {
      Skill[] var0;
      ev = new int[(var0 = GameCanvas.isTouch?aP:aO).length];
      ew = new int[var0.length];
      dA = 30;
      if(GameCanvas.z <= 320) {
         ey = e - dA - 6;
         ex = f - var0.length * dA / 2 - 25;
      } else {
         dA = 40;
         ex = 10;
         ey = GameCanvas.A - dA + 7;
      }

      int var1;
      for(var1 = 0; var1 < ev.length; ++var1) {
         ev[var1] = var1 * dA;
         ew[var1] = ey;
         if(ev.length > 5 && var1 >= ev.length / 2) {
            ev[var1] = (var1 - ev.length / 2) * dA;
            ew[var1] = ey - 32;
         }
      }

      bx = var0.length * dA;
      by = ey;
      if(GameCanvas.isTouch) {
         ex = 17;
         ey = GameCanvas.A - 40;
         if(dz.b && isAnalog == 1) {
            bx = var0.length * dA;
            by = ey;
         } else {
            bx = GameCanvas.z - 45;
            by = GameCanvas.A - 45;
         }

         if(isAnalog != 0) {
            et = er = GameCanvas.z - 45;
            if(dz.d) {
               ex = dz.a + 20;
               dA = 35;
               bx = er - 45;
            } else if(dz.c) {
               bx = er - 45;
            }

            eu = (es = GameCanvas.A - 45) - 45;
         }

         for(var1 = 0; var1 < ev.length; ++var1) {
            ev[var1] = var1 * dA;
            ew[var1] = ey;
            if(ev.length > 5 && var1 >= ev.length / 2) {
               ev[var1] = (var1 - ev.length / 2) * dA;
               ew[var1] = ey - 32;
            }
         }
      }

   }

   public final void a(String var1, int var2, int var3) {
      nr_i var4;
      (var4 = new nr_i()).b = var3;
      var4.a = var2;
      this.a(var1, new Command(mResources.bj, 12002, var4), new Command(mResources.bk, 12003, var4));
   }

   private void E() {
      this.aW = 0;
      GameCanvas.f();
      if(Char.myCharz().aT.charID >= 0) {
         if(Char.myCharz().charID >= 0) {
            MyVector var1 = GameCanvas.panel.Q;
            if(GameCanvas.panel.Q.size() <= 0) {
               if(Char.myCharz().taskMaint != null && Char.myCharz().taskMaint.taskId > 1) {
                  var1.addElement(new Command(mResources.cL, 11112, Char.myCharz().aT));
                  var1.addElement(new Command(mResources.dH, 11113, Char.myCharz().aT));
               }

               if(Char.myCharz().ai != null && Char.myCharz().aj < 2 && Char.myCharz().aT.ah == -1) {
                  var1.addElement(new Command(mResources.aI[4], 110391));
               }

               if(Char.myCharz().aT.statusMe != 14 && Char.myCharz().aT.statusMe != 5) {
                  if(Char.myCharz().taskMaint != null && Char.myCharz().taskMaint.taskId >= 14) {
                     var1.addElement(new Command(mResources.aI[0], 2003));
                  }
               } else {
                  Char.myCharz().aB.a.getClass();
               }

               if(Char.myCharz().ai != null && Char.myCharz().ai.a == Char.myCharz().aT.ah && Char.myCharz().aT.statusMe != 14 && Char.myCharz().taskMaint != null && Char.myCharz().taskMaint.taskId >= 14) {
                  var1.addElement(new Command(mResources.aI[1], 2004));
               }

               int var2 = Char.myCharz().aw.b.length;

               for(int var3 = 0; var3 < var2; ++var3) {
                  nr_en var4 = Char.myCharz().aw.b[var3];
                  Skill var5;
                  if((var5 = Char.myCharz().a(var4)) != null && var4.a() && var5.c > 0) {
                     var1.addElement(new Command(var4.b, 12004, var5));
                  }
               }

            }
         }
      }
   }

   public static boolean a(Mob var0) {
      Char var1;
      return var0 == null?false:(Char.myCharz().aM == 5?true:(Char.myCharz().H() && !var0.isMobMe?false:(Char.myCharz().mobMe != null && var0.equals(Char.myCharz().mobMe)?false:((var1 = findCharInMap(var0.y)) == null?true:(var1.aM == 5?true:Char.myCharz().c(var1))))));
   }

   private boolean F() {
      if(Char.myCharz().aB != null && (Char.myCharz().aB.a.d != 1 && Char.myCharz().cMP < Char.myCharz().aB.i || Char.myCharz().aB.a.d == 1 && Char.myCharz().cMP < Char.myCharz().cMPFull * Char.myCharz().aB.i / 100)) {
         aC.a(mResources.bE, 0);
         this.aW = 0;
         return false;
      } else if(Char.myCharz().aB != null && (Char.myCharz().aB.a.c <= 0 || Char.myCharz().aB.c != 0)) {
         return true;
      } else {
         GameCanvas.a(mResources.aP);
         return false;
      }
   }

   public final void q() {
      GameCanvas.menu.a = false;
      nr_cm var1;
      (var1 = nr_cm.b()).a.a("");
      var1.b = false;
      nr_cm.b().f = null;
      this.di = false;
      this.Z = 0;
      ct = 0;
      cs = 0;
      this.dh = -1;
      J = -1;
      this.Z = this.aa = 0;
      if(Char.myCharz().cHP > 0 && Char.myCharz().statusMe != 14 && Char.myCharz().statusMe != 5) {
         N = true;
      } else {
         if(Char.myCharz().meDead) {
            this.eU = new Command(mResources.aT[0], 11038);
            super.cb = this.eU;
            Char.myCharz().cHP = 0;
         }

         N = false;
      }

      nr_do var2 = cv;
      cv.a = 0;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.f = 0;
      var2.g = 0;
      var2.h = 0;
      var2.k = 0;
      var2.l = 0;
      var2.i = 0;
      var2.j = 0;
   }

   public final void a(int var1) {
      super.a(var1);
   }

   public final void d() {  // update key
       Char.myCharz().O = GameScr.tocdochay;
      if(!Controller.b && !Char.myCharz().s) {
         if(!InfoDlg.b) {
            int var1;
            int var2;
            int var4;
            int var5;
            int var7;
            int var8;
            char[] var9;
            MyVector var11;
            if(GameCanvas.isTouch && !nr_cm.b().b && !GameCanvas.menu.a && !this.L()) {
               label1046: {
                  mScreen.cg = -1;
                  if(GameCanvas.f) {
                     label1047: {
                        if(GameCanvas.a(0, 0, 60, 50) && GameCanvas.l && GameCanvas.m) {
                           if(Char.myCharz().am != null) {
                              Char.myCharz().am.performAction();
                           }

                           Char.myCharz().bO = null;
                           GameCanvas.clearAllPointerEvent();
                           this.eb = true;
                           this.ec = 5;
                           break label1046;
                        }

                        if(!TileMap.d() && GameCanvas.a(ep, eq, 34, 34)) {
                           mScreen.cg = 15;
                           GameCanvas.ad = false;
                           this.aS = false;
                           nr_cm.b().h = mResources.bm;
                           if(GameCanvas.l && GameCanvas.m) {
                              nr_cm.b().a("");
                              SoundMn.gI();
                              Char.myCharz().bO = null;
                              GameCanvas.clearAllPointerEvent();
                              break label1046;
                           }
                        }

                        if(Char.myCharz().am != null && GameCanvas.a(Char.myCharz().am.x - 17, Char.myCharz().am.y - 17, 34, 34)) {
                           mScreen.cg = 20;
                           GameCanvas.ad = false;
                           this.aS = false;
                           if(GameCanvas.l && GameCanvas.m) {
                              GameCanvas.clearAllPointerEvent();
                              Char.myCharz().am.performAction();
                              break label1046;
                           }
                        }

                        if(isAnalog != 0 && Char.myCharz().statusMe != 14) {
                           if(GameCanvas.a(er, es, 40, 40)) {
                              mScreen.cg = 5;
                              if(GameCanvas.m) {
                                 GameCanvas.i[5] = true;
                                 GameCanvas.m = false;
                                 GameCanvas.ad = false;
                                 GameCanvas.l = false;
                              }
                           }

                           dz.a();
                           if(GameCanvas.a(et, eu, 34, 34)) {
                              mScreen.cg = 13;
                              GameCanvas.ad = false;
                              this.aS = false;
                              if(GameCanvas.l && GameCanvas.m) {
                                 Char.myCharz().I();
                                 GameCanvas.m = false;
                                 GameCanvas.ad = false;
                                 GameCanvas.l = false;
                              }
                           }
                        }

                        if(isAnalog == 0) {
                           if(!GameCanvas.a(bx, by, 40, 40)) {
                              break label1047;
                           }
                        } else if(!GameCanvas.a(bx, by, 34, 34)) {
                           break label1047;
                        }

                        if(Char.myCharz().statusMe != 14 && this.aK == null) {
                           mScreen.cg = 10;
                           GameCanvas.ad = false;
                           this.aS = false;
                           if(GameCanvas.l && GameCanvas.m) {
                              GameCanvas.i[10] = true;
                              GameCanvas.m = false;
                              GameCanvas.ad = false;
                              GameCanvas.l = false;
                           }
                        }
                     }
                  }

                  if(this.aK != null) {
                     GameScr var3 = this;
                     if(!this.L()) {
                        for(var4 = 0; var4 < var3.bm.length(); ++var4) {
                           var3.bq[var4] = -1;
                           if(GameCanvas.f) {
                              var5 = (GameCanvas.z - var3.bm.length() * ek) / 2;
                              var8 = var3.bm.length() * ek;
                              var1 = GameCanvas.A - 40;
                              var2 = ek;
                              if(GameCanvas.a(var5, var1, var8, var2)) {
                                 var1 = (GameCanvas.o - var5) / ek;
                                 if(var4 == var1) {
                                    var3.bq[var4] = 1;
                                 }

                                 if(GameCanvas.l && GameCanvas.m && var4 == var1) {
                                    var9 = var3.bs.toCharArray();
                                    var11 = new MyVector("");

                                    for(var5 = 0; var5 < var9.length; ++var5) {
                                       var11.addElement(String.valueOf(var9[var5]));
                                    }

                                    var11.removeElementAt(0);
                                    var11.insertElementAt(String.valueOf(var3.bm.charAt(var4)), var11.size());
                                    var3.bs = "";

                                    for(var5 = 0; var5 < var11.size(); ++var5) {
                                       var3.bs = var3.bs + ((String)var11.elementAt(var5)).toUpperCase();
                                    }

                                    Service.gI().mobCaptcha(var3.bm.charAt(var4));
                                 }
                              }
                           }
                        }
                     }
                  } else if(N) {
                     if(this.I()) {
                        break label1046;
                     }

                     this.ed = -1;
                     boolean var6 = false;
                     if(aP.length > 5 && (GameCanvas.a(ex + ev[0] - dA / 2 + 12, ew[0] - dA / 2 + 12, 5 * dA, dA) || GameCanvas.a(ex + ev[5] - dA / 2 + 12, ew[5] - dA / 2 + 12, 5 * dA, dA))) {
                        var6 = true;
                     }

                     if(var6 || GameCanvas.a(ex + ev[0] - dA / 2 + 12, ew[0] - dA / 2 + 12, 5 * dA, dA) || !GameCanvas.f && GameCanvas.a(ex + ev[0] - dA / 2 + 12, ew[0] - dA / 2 + 12, dA, aP.length * dA)) {
                        GameCanvas.ad = false;
                        this.aS = false;
                        var7 = (GameCanvas.s - (ex + ev[0] - dA / 2 + 12)) / dA;
                        if(var6 && GameCanvas.t < ew[0]) {
                           var7 += 5;
                        }

                        this.ed = var7;
                        if(GameCanvas.l && GameCanvas.m) {
                           GameCanvas.m = false;
                           GameCanvas.ad = false;
                           GameCanvas.l = false;
                           this.dZ = var7;
                           if(this.dZ > aP.length - 1) {
                              this.dZ = aP.length - 1;
                           }

                           Skill var12;
                           if((var12 = aP[this.dZ]) != null) {
                              this.a(var12, true);
                           }
                        }
                     }
                  }

                  if(GameCanvas.m) {
                     if(GameCanvas.j[1] || GameCanvas.j[2] || GameCanvas.j[3] || GameCanvas.j[4] || GameCanvas.j[6]) {
                        GameCanvas.m = false;
                     }

                     GameCanvas.j[1] = false;
                     GameCanvas.j[2] = false;
                     GameCanvas.j[3] = false;
                     GameCanvas.j[4] = false;
                     GameCanvas.j[6] = false;
                  }
               }
            }

            long var18 = System.currentTimeMillis();
            if(GameCanvas.i[2] || GameCanvas.i[4] || GameCanvas.i[6] || GameCanvas.i[1] || GameCanvas.i[3]) {
               this.aW = 0;
               bi = false;
            }

            if(GameCanvas.i[5]) {
               if(this.aW == 0) {
                  if(var18 - this.dN < 800L && (Char.myCharz().aB != null && (Char.myCharz().aB.a.d != 1 && Char.myCharz().cMP < Char.myCharz().aB.i || Char.myCharz().aB.a.d == 1 && Char.myCharz().cMP < Char.myCharz().cMPFull * Char.myCharz().aB.i / 100)?false:Char.myCharz().aB != null && (Char.myCharz().aB.a.c <= 0 || Char.myCharz().aB.c != 0)) && (Char.myCharz().aP != null || Char.myCharz().aT != null && Char.myCharz().c(Char.myCharz().aT))) {
                     this.aW = 10;
                     GameCanvas.i[5] = false;
                  }
               } else {
                  this.aW = 0;
                  GameCanvas.i[4] = GameCanvas.i[6] = false;
               }

               this.dN = var18;
            }

            label918: {
               if(GameCanvas.gameTick % 5 == 0 && this.aW > 0 && Char.myCharz().bO == null) {
                  if(Char.myCharz().aB != null && (Char.myCharz().aB.a.b() || Char.myCharz().aB.j)) {
                     break label918;
                  }

                  if(Char.myCharz().aP != null && Char.myCharz().aP.p != 1 && Char.myCharz().aP.p != 0 && Char.myCharz().aT == null || Char.myCharz().aT != null && Char.myCharz().c(Char.myCharz().aT)) {
                     if(Char.myCharz().aB.j) {
                        break label918;
                     }

                     this.a(false, true);
                  }
               }

               if(this.aW > 1) {
                  --this.aW;
               }
            }

            if(ChatPopup.m != null) {
               Command var10 = ChatPopup.m.j;
               if((GameCanvas.i[5] || mScreen.a(var10)) && var10 != null) {
                  GameCanvas.m = false;
                  GameCanvas.i[5] = false;
                  mScreen.cg = -1;
                  if(var10 != null) {
                     var10.performAction();
                  }
               }
            } else if(!nr_cm.b().b) {
               if((GameCanvas.i[12] || mScreen.a(GameCanvas.currentScreen.ca)) && super.ca != null) {
                  GameCanvas.m = false;
                  GameCanvas.l = false;
                  GameCanvas.i[12] = false;
                  mScreen.cg = -1;
                  if(super.ca != null) {
                     super.ca.performAction();
                  }
               }

               if((GameCanvas.i[13] || mScreen.a(GameCanvas.currentScreen.cc)) && super.cc != null) {
                  GameCanvas.m = false;
                  GameCanvas.l = false;
                  GameCanvas.i[13] = false;
                  mScreen.cg = -1;
                  if(super.cc != null) {
                     super.cc.performAction();
                  }
               }

               if((GameCanvas.i[5] || mScreen.a(GameCanvas.currentScreen.cb)) && super.cb != null) {
                  GameCanvas.m = false;
                  GameCanvas.i[5] = false;
                  mScreen.cg = -1;
                  if(super.cb != null) {
                     super.cb.performAction();
                  }
               }
            } else {
               if(nr_cm.b().d != null && (GameCanvas.i[12] || mScreen.a(nr_cm.b().d)) && nr_cm.b().d != null) {
                  nr_cm.b().d.performAction();
               }

               if(nr_cm.b().e != null && (GameCanvas.i[13] || mScreen.a(nr_cm.b().e)) && nr_cm.b().e != null) {
                  nr_cm.b().e.performAction();
               }

               if(nr_cm.b().f != null && (GameCanvas.i[5] || mScreen.a(nr_cm.b().f)) && nr_cm.b().f != null) {
                  nr_cm.b().f.performAction();
               }
            }

            if(Char.myCharz().bO != null) {
               for(var1 = 0; var1 < GameCanvas.i.length; ++var1) {
                  if(GameCanvas.i[var1]) {
                     Char.myCharz().bO = null;
                     break;
                  }
               }
            }

            if(nr_cm.b().b && GameCanvas.ab != 0) {
               nr_cm.b().a(GameCanvas.ab);
               GameCanvas.ab = 0;
            } else if(!GameCanvas.menu.a && !Char.bG) {
               if(GameCanvas.i[10]) {
                  GameCanvas.i[10] = false;
                  this.G();
                  GameCanvas.e();
               }

               if(GameCanvas.i[11] && this.aK == null) {
                  if(this.bQ != null) {
                     this.bQ.a.performAction();
                  } else if(aD.b.b != null && aD.b.b.c != null) {
                     GameCanvas.panel.l();
                     GameCanvas.panel.show();
                  }

                  GameCanvas.i[11] = false;
                  GameCanvas.e();
               }

               if(GameCanvas.ab != 0 && TField.isQwerty && GameCanvas.ab == 32) {
                  this.G();
                  GameCanvas.ab = 0;
                  GameCanvas.e();
               }

               if(GameCanvas.ab != 0 && this.aK == null && TField.isQwerty && GameCanvas.ab == 121) {
                  if(this.bQ != null) {
                     this.bQ.a.performAction();
                     GameCanvas.ab = 0;
                     GameCanvas.e();
                  } else if(aD.b.b != null && aD.b.b.c != null) {
                     GameCanvas.panel.l();
                     GameCanvas.panel.show();
                     GameCanvas.ab = 0;
                     GameCanvas.e();
                  }
               }

               boolean var13;
               if(GameCanvas.i[10] && this.aK == null) {
                  GameCanvas.i[10] = false;
                  var13 = true;
                  nr_ei var14 = aD;
                  aD.g = 10;
                  GameCanvas.e();
               }

               if(!dz.b() && isAnalog != 1) {
                  Char.myCharz().ao = true;
                  if(GameCanvas.ad) {
                     GameCanvas.ad = false;
                     this.aS = true;
                     this.dG = 0;
                     this.dC = this.dE = GameCanvas.o;
                     this.dD = this.dF = GameCanvas.p;
                  }

                  if(this.aS) {
                     int var20 = GameCanvas.o - this.dC;
                     var7 = GameCanvas.p - this.dD;
                     if(!this.dB && (Res.g(GameCanvas.o - this.dE) > 15 || Res.g(GameCanvas.p - this.dF) > 15)) {
                        this.dB = true;
                     }

                     this.dC = GameCanvas.o;
                     this.dD = GameCanvas.p;
                     ++this.dG;
                     if(this.dB) {
                        Char.myCharz().ao = false;
                        j -= var20;
                        k -= var7;
                        if(j < 24 && (var2 = (24 - j) / 3) != 0) {
                           j += var20 - var20 / var2;
                        }

                        if(j < 24) {
                           j = 24;
                        }

                        if(j > n && (var2 = (j - n) / 3) != 0) {
                           j += var20 - var20 / var2;
                        }

                        if(j > n) {
                           j = n;
                        }

                        if(k < 0 && (var2 = (0 - k) / 3) != 0) {
                           k += var7 - var7 / var2;
                        }

                        if(k < 0) {
                           k = 0;
                        }

                        if(k > cq) {
                           k = cq;
                        }

                        l = j;
                        m = k;
                     }
                  }

                  if(this.aS && GameCanvas.m) {
                     this.aS = false;
                     this.dB = false;
                     if(Res.g(GameCanvas.o - this.dE) > 15 || Res.g(GameCanvas.p - this.dF) > 15) {
                        GameCanvas.m = false;
                     }
                  }
               }

               int var15;
               if(!Char.myCharz().cg && !this.I()) {
                  if(this.bQ != null && this.bQ.a != null && this.bQ.a.isPointerPressInside()) {
                     this.bQ.a.performAction();
                  } else {
                     boolean var10000;
                     label810: {
                        if(this.aK != null) {
                           var15 = (GameCanvas.z - 5 * ek) / 2;
                           var4 = 5 * ek;
                           var5 = GameCanvas.A - 40;
                           var8 = ek;
                           if(GameCanvas.a(var15, var5, var4, var8)) {
                              var10000 = true;
                              break label810;
                           }
                        }

                        var10000 = false;
                     }

                     if(!var10000) {
                        var18 = System.currentTimeMillis();
                        if(this.aT != 0L && var18 - this.aT > 300L) {
                           this.aT = 0L;
                           GameCanvas.ad = false;
                           if(!this.dH) {
                              var15 = GameCanvas.o + this.dL;
                              var4 = GameCanvas.p + this.dM;
                              if(!this.g(var15, var4) && !this.f(var15, var4)) {
                                 this.h(var15, var4);
                              }

                              GameCanvas.m = false;
                           }
                        }

                        if(GameCanvas.m) {
                           boolean var10001;
                           label802: {
                              var15 = GameCanvas.o + j;
                              var4 = GameCanvas.p + k;
                              Char.myCharz();
                              nr_bm var19;
                              if((var19 = this.e(var15, var4)) != null) {
                                 Char var21;
                                 if(Char.myCharz().H() && Char.myCharz().aT != null && !var19.equals(Char.myCharz().aT) && !var19.equals(Char.myCharz().aT.mobMe) && var19 instanceof Char && (var21 = (Char)var19).aM != 5 && !var21.H()) {
                                    this.h(var15, var4);
                                 } else {
                                    if(Char.myCharz().aP == var19 || Char.myCharz().itemFocus == var19) {
                                       this.b(var19);
                                       var10001 = true;
                                       break label802;
                                    }

                                    if(TileMap.l == 51 && var19.equals(Char.myCharz().aS)) {
                                       this.h(var15, var4);
                                    } else {
                                       if(Char.myCharz().cd != null || Char.myCharz().ca != null || Char.myCharz().cb != null || Char.myCharz().C() != null) {
                                          var10001 = false;
                                          break label802;
                                       }

                                       Char.myCharz().a((Object)var19);
                                       var19.stopMoving();
                                    }
                                 }
                              }

                              var10001 = false;
                           }

                           this.dH = var10001;
                           if(var18 - this.aT < 300L) {
                              label772: {
                                 this.aT = 0L;
                                 var15 = GameCanvas.o + this.dL;
                                 var4 = GameCanvas.p + this.dM;
                                 Char.myCharz();
                                 nr_bm var22;
                                 if((var22 = this.e(var15, var4)) != null) {
                                    if(!(var22 instanceof Mob) || a((Mob)var22)) {
                                       if(this.a(var22) || !var22.equals(Char.myCharz().aS) && this.aK != null) {
                                          break label772;
                                       }

                                       Char var16;
                                       if((!Char.myCharz().H() || Char.myCharz().aT == null || var22.equals(Char.myCharz().aT) || var22.equals(Char.myCharz().aT.mobMe) || !(var22 instanceof Char) || (var16 = (Char)var22).aM == 5 || var16.H()) && (TileMap.l != 51 || !var22.equals(Char.myCharz().aS))) {
                                          this.b(var22);
                                          break label772;
                                       }
                                    }
                                 } else if(this.g(var15, var4) || this.f(var15, var4)) {
                                    break label772;
                                 }

                                 this.h(var15, var4);
                              }
                           } else {
                              this.aT = var18;
                              this.dL = j;
                              this.dM = k;
                           }

                           GameCanvas.m = false;
                        }
                     }
                  }
               }

               if(Char.myCharz().am != null && Char.myCharz().am.isPointerPressInside()) {
                  Char.myCharz().am.performAction();
               }

               if(Char.myCharz().cd == null) {
                  if(Char.myCharz().statusMe == 1) {
                     if(GameCanvas.i[5]) {
                        GameCanvas.i[5] = false;
                        this.a(false, false);
                     } else if(GameCanvas.j[2]) {
                        if(!Char.myCharz().bI) {
                           var13 = false;
                           if(Char.myCharz().cx - Char.myCharz().bC != 0 || Char.myCharz().cy - Char.myCharz().bD != 0) {
                              Service.gI().g();
                           }

                           Char.myCharz().E = -10;
                           Char.myCharz().D = 0;
                           Char.myCharz().statusMe = 3;
                           Char.myCharz().F = 0;
                        }
                     } else if(GameCanvas.j[4]) {
                        bi = false;
                        Char.myCharz().aq = false;
                        if(Char.myCharz().I == 1) {
                           Char.myCharz().I = -1;
                        } else if(!Char.myCharz().bI) {
                           if(Char.myCharz().cx - Char.myCharz().bC != 0) {
                              Service.gI().g();
                           }

                           Char.myCharz().statusMe = 2;
                           Char.myCharz().D = -Char.myCharz().O;
                        }

                        Char.myCharz().cF = false;
                     } else if(GameCanvas.j[6]) {
                        bi = false;
                        Char.myCharz().aq = false;
                        if(Char.myCharz().I == -1) {
                           Char.myCharz().I = 1;
                        } else if(!Char.myCharz().bI) {
                           if(Char.myCharz().cx - Char.myCharz().bC != 0) {
                              Service.gI().g();
                           }

                           Char.myCharz().statusMe = 2;
                           Char.myCharz().D = Char.myCharz().O;
                        }

                        Char.myCharz().cF = false;
                     }
                  } else if(Char.myCharz().statusMe == 2) {
                     if(GameCanvas.i[5]) {
                        GameCanvas.i[5] = false;
                        this.a(false, true);
                     } else if(GameCanvas.j[2]) {
                        if(Char.myCharz().cx - Char.myCharz().bC != 0 || Char.myCharz().cy - Char.myCharz().bD != 0) {
                           Service.gI().g();
                        }

                        Char.myCharz().E = -10;
                        Char.myCharz().statusMe = 3;
                        Char.myCharz().F = 0;
                     } else {
                        Char var23;
                        int var24;
                        if(GameCanvas.j[4]) {
                           bi = false;
                           if(Char.myCharz().I == 1) {
                              Char.myCharz().I = -1;
                           } else {
                              var23 = Char.myCharz();
                              var24 = -Char.myCharz().O;
                              Char.myCharz();
                              var23.D = var24;
                           }
                        } else if(GameCanvas.j[6]) {
                           bi = false;
                           if(Char.myCharz().I == -1) {
                              Char.myCharz().I = 1;
                           } else {
                              var23 = Char.myCharz();
                              var24 = Char.myCharz().O;
                              Char.myCharz();
                              var23.D = var24;
                           }
                        }
                     }
                  } else if(Char.myCharz().statusMe == 3) {
                     bi = false;
                     if(GameCanvas.i[5]) {
                        GameCanvas.i[5] = false;
                        this.a(false, true);
                     }

                     if(!GameCanvas.j[4] && (!GameCanvas.j[1] || this.aK != null)) {
                        if(GameCanvas.j[6] || GameCanvas.j[3] && this.aK == null) {
                           if(Char.myCharz().I == -1) {
                              Char.myCharz().I = 1;
                           } else {
                              Char.myCharz().D = Char.myCharz().O;
                           }
                        }
                     } else if(Char.myCharz().I == 1) {
                        Char.myCharz().I = -1;
                     } else {
                        Char.myCharz().D = -Char.myCharz().O;
                     }

                     if((GameCanvas.j[2] || (GameCanvas.j[1] || GameCanvas.j[3]) && this.aK == null) && Char.myCharz().an && Char.myCharz().cMP > 0 && Char.myCharz().F < 8 && Char.myCharz().E > -4) {
                        ++Char.myCharz().F;
                        Char.myCharz().E = -7;
                     }
                  } else if(Char.myCharz().statusMe == 4) {
                     if(GameCanvas.i[5]) {
                        GameCanvas.i[5] = false;
                        this.a(false, true);
                     }

                     if(GameCanvas.j[2] && Char.myCharz().cMP > 0 && Char.myCharz().an) {
                        bi = false;
                        if((Char.myCharz().cx - Char.myCharz().bC != 0 || Char.myCharz().cy - Char.myCharz().bD != 0) && (Res.g(Char.myCharz().cx - Char.myCharz().bC) > 96 || Res.g(Char.myCharz().cy - Char.myCharz().bD) > 24)) {
                           Service.gI().g();
                        }

                        Char.myCharz().E = -10;
                        Char.myCharz().statusMe = 3;
                        Char.myCharz().F = 0;
                     }

                     if(GameCanvas.j[4]) {
                        bi = false;
                        if(Char.myCharz().I == 1) {
                           Char.myCharz().I = -1;
                        } else {
                           ++Char.myCharz().F;
                           Char.myCharz().D = -Char.myCharz().O;
                           if(Char.myCharz().F > 5 && Char.myCharz().E > 6) {
                              Char.myCharz().statusMe = 10;
                              Char.myCharz().F = 0;
                              Char.myCharz().E = 0;
                           }
                        }
                     } else if(GameCanvas.j[6]) {
                        bi = false;
                        if(Char.myCharz().I == -1) {
                           Char.myCharz().I = 1;
                        } else {
                           ++Char.myCharz().F;
                           Char.myCharz().D = Char.myCharz().O;
                           if(Char.myCharz().F > 5 && Char.myCharz().E > 6) {
                              Char.myCharz().statusMe = 10;
                              Char.myCharz().F = 0;
                              Char.myCharz().E = 0;
                           }
                        }
                     }
                  } else if(Char.myCharz().statusMe == 10) {
                     if(GameCanvas.i[5]) {
                        GameCanvas.i[5] = false;
                        this.a(false, true);
                     }

                     if(Char.myCharz().an && Char.myCharz().cMP > 0) {
                        if(GameCanvas.j[2]) {
                           bi = false;
                           if((Char.myCharz().cx - Char.myCharz().bC != 0 || Char.myCharz().cy - Char.myCharz().bD != 0) && (Res.g(Char.myCharz().cx - Char.myCharz().bC) > 96 || Res.g(Char.myCharz().cy - Char.myCharz().bD) > 24)) {
                              Service.gI().g();
                           }

                           Char.myCharz().E = -10;
                           Char.myCharz().statusMe = 3;
                           Char.myCharz().F = 0;
                        } else if(GameCanvas.j[4]) {
                           bi = false;
                           if(Char.myCharz().I == 1) {
                              Char.myCharz().I = -1;
                           } else {
                              Char.myCharz().D = -(Char.myCharz().O + 1);
                           }
                        } else if(GameCanvas.j[6]) {
                           if(Char.myCharz().I == -1) {
                              Char.myCharz().I = 1;
                           } else {
                              Char.myCharz().D = Char.myCharz().O + 1;
                           }
                        }
                     }
                  } else if(Char.myCharz().statusMe == 7) {
                     if(GameCanvas.i[5]) {
                        GameCanvas.i[5] = false;
                     }

                     if(GameCanvas.j[4]) {
                        bi = false;
                        if(Char.myCharz().I == 1) {
                           Char.myCharz().I = -1;
                        } else {
                           Char.myCharz().D = -Char.myCharz().O + 2;
                        }
                     } else if(GameCanvas.j[6]) {
                        bi = false;
                        if(Char.myCharz().I == -1) {
                           Char.myCharz().I = 1;
                        } else {
                           Char.myCharz().D = Char.myCharz().O - 2;
                        }
                     }
                  }

                  if(GameCanvas.i[8] && GameCanvas.ab != 56) {
                     GameCanvas.i[8] = false;
                     Char.myCharz().bP = 0;
                  }

                  if(GameCanvas.i[10]) {
                     GameCanvas.i[10] = false;
                     this.G();
                  }

                  if(GameCanvas.ab != 0) {
                     if(this.aK == null) {
                        if(TField.isQwerty) {
                           if(GameCanvas.ab == 113) {
                              if(aO[0] != null) {
                                 this.a(aO[0], true);
                              }
                           } else if(GameCanvas.ab == 119) {
                              if(aO[1] != null) {
                                 this.a(aO[1], true);
                              }
                           } else if(GameCanvas.ab == 101) {
                              if(aO[2] != null) {
                                 this.a(aO[2], true);
                              }
                           } else if(GameCanvas.ab == 114) {
                              if(aO[3] != null) {
                                 this.a(aO[3], true);
                              }
                           } else if(GameCanvas.ab == 116) {
                              if(aO[4] != null) {
                                 this.a(aO[4], true);
                              }
                           } else if(GameCanvas.ab != 50 && GameCanvas.ab != 53) {
                              nr_cm.b().a(GameCanvas.ab, this, "");
                           }
                        } else if(!GameCanvas.c) {
                           nr_cm.b().a(GameCanvas.ab, this, "");
                        } else if(GameCanvas.ab == 55) {
                           if(aO[0] != null) {
                              this.a(aO[0], true);
                           }
                        } else if(GameCanvas.ab == 56) {
                           if(aO[1] != null) {
                              this.a(aO[1], true);
                           }
                        } else if(GameCanvas.ab == 57) {
                           if(aO[2] != null) {
                              this.a(aO[2], true);
                           }
                        } else if(GameCanvas.ab == 49) {
                           if(aO[3] != null) {
                              this.a(aO[3], true);
                           }
                        } else if(GameCanvas.ab == 51) {
                           if(aO[4] != null) {
                              this.a(aO[4], true);
                           }
                        } else if(GameCanvas.ab == 48) {
                           nr_cm.b().a("");
                        }
                     } else {
                        var9 = this.bs.toCharArray();
                        var11 = new MyVector("");

                        for(var15 = 0; var15 < var9.length; ++var15) {
                           var11.addElement(String.valueOf(var9[var15]));
                        }

                        var11.removeElementAt(0);
                        String var17;
                        if((var17 = String.valueOf((char)GameCanvas.ab)).equals("") || var17 == null || var17.equals("\n")) {
                           var17 = "-";
                        }

                        var11.insertElementAt(var17, var11.size());
                        this.bs = "";

                        for(var1 = 0; var1 < var11.size(); ++var1) {
                           this.bs = this.bs + ((String)var11.elementAt(var1)).toUpperCase();
                        }

                        Service.gI().mobCaptcha((char)GameCanvas.ab);
                     }

                     GameCanvas.ab = 0;
                  }

                  GameCanvas.e();
               }
            }
         }
      }
   }

   private nr_bm e(int var1, int var2) {
      nr_bm var3 = null;
      int var4 = 0;
      MyVector[] var5 = new MyVector[]{vMob, G, vItemMap, D};

      for(int var6 = 0; var6 < var5.length; ++var6) {
         for(int var7 = 0; var7 < var5[var6].size(); ++var7) {
            nr_bm var8;
            Mob var9;
            if(!(var8 = (nr_bm)var5[var6].elementAt(var7)).isInvisible() && (!(var8 instanceof Mob) || !(var9 = (Mob)var8).isMobMe || !var9.equals(Char.myCharz().mobMe))) {
               int var13 = var8.getX();
               int var10 = var8.getY();
               int var11 = var8.getW();
               int var12 = var8.getH();
               if(b(var1, var2, var13 - var11 / 2 - 30, var10 - var12 - 30, var11 + 60, var12 + 60)) {
                  if(var3 == null) {
                     var3 = var8;
                     var4 = Res.g(var1 - var13) + Res.g(var2 - var10);
                     if(var6 == 1) {
                        return var8;
                     }
                  } else if((var13 = Res.g(var1 - var13) + Res.g(var2 - var10)) < var4) {
                     var3 = var8;
                     var4 = var13;
                  }
               }
            }
         }
      }

      return var3;
   }

   private static boolean b(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 >= var2 && var0 <= var2 + var4 && var1 >= var3 && var1 <= var3 + var5;
   }

   private boolean a(nr_bm var1) {
      if(var1 == null) {
         return false;
      } else {
         int var3 = var1.getY();
         int var2 = Char.myCharz().cy;
         if(var3 < var2) {
            while(var3 < var2) {
               var2 -= 5;
               if(TileMap.a(Char.myCharz().cx, var2, 8192)) {
                  this.aW = 0;
                  Char.myCharz();
                  Char.myCharz().bO = null;
                  return true;
               }
            }
         }

         return false;
      }
   }

   private void b(nr_bm var1) {
      if(var1.equals(Char.myCharz().aS) || this.aK == null) {
         if(!this.a(var1)) {
            if(var1 != null && this.en <= 0) {
               this.en = 10;
               int var2 = var1.getX();
               byte var4;
               if((var2 = Res.g(Char.myCharz().cx - var2)) <= 80) {
                  var4 = 1;
               } else if(var2 > 80 && var2 <= 200) {
                  var4 = 2;
               } else if(var2 > 200 && var2 <= 400) {
                  var4 = 3;
               } else {
                  var4 = 4;
               }

               if(!var1.equals(Char.myCharz().aP) && (!var1.equals(Char.myCharz().aT) || !Char.myCharz().c(Char.myCharz().aT))) {
                  if(var1.equals(Char.myCharz().aS) || var1.equals(Char.myCharz().itemFocus) || var1.equals(Char.myCharz().aT)) {
                     ServerEffect.addServerEffect(136, var1.getX(), var1.getY(), var4);
                  }
               } else {
                  ServerEffect.addServerEffect(135, var1.getX(), var1.getY(), var4);
               }
            }

            Char.myCharz();
            Char.myCharz().bO = null;
            Char.myCharz().D = Char.myCharz().E = 0;
            var1.stopMoving();
            this.aW = 10;
            this.a(false, true);
            this.dJ = var1.getX();
            this.dK = var1.getY();
            this.dI = false;
            this.aU = true;
         }
      }
   }

   private boolean f(int var1, int var2) {
      if(this.equals(aD) && gI().bQ != null) {
         return false;
      } else {
         if(aD.b.b != null && aD.b.b.c != null) {
            int var3 = Res.g(aD.d) + aD.b.g - 40;
            int var4 = Res.g(aD.c) + aD.b.h;
            if(b(var1 - j, var2 - k, var3, var4, 200, aD.b.j)) {
               boolean var5 = true;
               nr_ei var6 = aD;
               aD.g = 10;
               return true;
            }
         }

         return false;
      }
   }

   private boolean g(int var1, int var2) {
      for(int var3 = 0; var3 < PopUp.a.size(); ++var3) {
         PopUp var4 = (PopUp)PopUp.a.elementAt(var3);
         if(b(var1, var2, var4.d, var4.e, var4.f, var4.g)) {
            if(var4.e <= 24 && TileMap.f() && Char.myCharz().aM != 0) {
               return false;
            }

            if(var4.j) {
               var4.a(10);
               return true;
            }
         }
      }

      return false;
   }

   private void h(int var1, int var2) {
      if(!dz.c()) {
         Char.myCharz();
         if(var1 < TileMap.c && var1 > TileMap.c - 32) {
            Char.myCharz().bO = new nr_df(TileMap.c, var2);
         } else if(var1 < 32 && var1 > 0) {
            Char.myCharz().bO = new nr_df(0, var2);
         } else {
            this.dJ = var1;
            this.dK = var2;
            this.dI = false;
            Char.myCharz().bP = 0;
            var1 = Char.myCharz().an && Char.myCharz().cMP > 0?0:1000;
            if(this.dK <= Char.myCharz().cy || Res.g(this.dJ - Char.myCharz().cx) >= 12) {
               for(var2 = 0; var2 < var1 + 60 && this.dK + var2 < TileMap.d - 24; var2 += 24) {
                  if(TileMap.a(this.dJ, this.dK + var2, 2)) {
                     this.dK = TileMap.e(this.dK + var2);
                     this.dI = true;
                     break;
                  }
               }

               for(var2 = 0; var2 < var1 + 40; var2 += 24) {
                  if(TileMap.a(this.dJ, this.dK - var2, 2)) {
                     this.dK = TileMap.e(this.dK - var2);
                     this.dI = true;
                     break;
                  }
               }

               this.aU = true;
               Char.myCharz().bP = 0;
               if(!this.dI && this.dK < Char.myCharz().cy - 50) {
                  Char.myCharz().bP = 20;
               }

               this.aW = 0;
               if(Char.myCharz().cF) {
                  Char.myCharz().O();
               }

               Char.myCharz().bO = new nr_df(this.dJ, this.dK);
               Char.myCharz().I = Char.myCharz().cx - Char.myCharz().bO.a > 0?-1:1;
               Char.myCharz().ax = null;
               bi = false;
            }
         }
      }
   }

   public void G() {
      if(!Char.myCharz().cN) {
         if(!Char.myCharz().cK) {
            if(Char.myCharz().cE <= 0) {
               long var1;
               if((var1 = System.currentTimeMillis()) - this.dO >= 10000L) {
                  if(!Char.myCharz().L()) {
                     aC.a(mResources.aQ, 0);
                  } else {
                     ServerEffect.a(11, Char.myCharz(), 5);
                     ServerEffect.a(104, Char.myCharz(), 4);
                     this.dO = var1;
                     SoundMn.gI();
                  }
               }
            }
         }
      }
   }

   public final void b(int var1, int var2) {
      if(!this.dQ) {
         SoundMn.gI();
         Res.out("ACTIVE SUPER POWER");
         this.dQ = true;
         this.dR = 0;
         this.dU = 0;
         this.dS = var1 - j;
         this.dT = var2 - k;
      }

   }

   public final void a(boolean var1) {
      this.bc = true;
      this.aZ = true;
      this.dV = true;
      if(var1) {
         EffecMn.addEff(new Effect(20, Char.myCharz().cx, Char.myCharz().cy - 77, 2, 8, 1));
      }

   }

   public final void r() {
      this.bc = false;
      this.aZ = true;
      this.dV = false;
   }

   public final void s() {
      this.ba = true;
      this.bd = mGraphics.a(0.4F, 0, GameCanvas.aa[GameCanvas.aa.length - 1]);
   }

   public final void c(int var1, int var2) {
      Res.out("VE RONG THAN O VI TRI x= " + var1 + " y=" + var2);
      this.s();
      EffecMn.addEff(new Effect(this.bb?25:17, var1, var2 - 77, 2, -1, 1));
   }

   private void a(boolean var1, boolean var2) {
      if(Char.myCharz().aT != null && Char.myCharz().aT.cy >= Char.myCharz().cy + 48 && TileMap.a(Char.myCharz().cx, Char.myCharz().cy, 2)) {
         this.aW = 0;
         Char.myCharz().bO = null;
         Char.bG = false;
         Char.myCharz().bI = false;
      } else {
         Res.out("do fire");
         ++dW;
         Waypoint var6 = Char.myCharz().i();
         Waypoint var3 = Char.myCharz().j();
         if(!var2 && var6 != null && (Char.myCharz().aP == null || Char.myCharz().aP != null && Char.myCharz().aP.C == 0)) {
            var6.popup.i.performAction();
         } else if(!var2 && var3 != null && (Char.myCharz().aP == null || Char.myCharz().aP != null && Char.myCharz().aP.C == 0)) {
            var3.popup.i.performAction();
         } else if(TileMap.l != 51 || Char.myCharz().aS == null) {
            if(Char.myCharz().statusMe != 14) {
               Char.myCharz().D = Char.myCharz().E = 0;
               if(Char.myCharz().w() && Char.myCharz().N()) {
                  if(this.F()) {
                     Char.myCharz();
                     Char.myCharz();
                     Char.z();
                  }
               } else {
                  boolean var10000;
                  if(this.a((nr_bm)Char.myCharz().aT)) {
                     var10000 = false;
                  } else if(this.a((nr_bm)Char.myCharz().aP)) {
                     var10000 = false;
                  } else if(this.a((nr_bm)Char.myCharz().aS)) {
                     var10000 = false;
                  } else if(nr_cm.b().b) {
                     var10000 = false;
                  } else {
                     label413: {
                        if(!InfoDlg.b) {
                           Char.myCharz();
                           if(!Char.bG) {
                              if(Char.myCharz().aB != null && Char.myCharz().aB.a.a == 6 && Char.myCharz().itemFocus != null) {
                                 this.H();
                                 var10000 = false;
                              } else if(Char.myCharz().aB != null && Char.myCharz().aB.a.e == 2 && Char.myCharz().aS == null && Char.myCharz().aB.a.a != 6) {
                                 var10000 = this.F();
                              } else if(Char.myCharz().cd == null && (Char.myCharz().aP != null || Char.myCharz().aS != null || Char.myCharz().aT != null || Char.myCharz().itemFocus != null)) {
                                 byte var7;
                                 int var8;
                                 int var9;
                                 boolean var10;
                                 if(Char.myCharz().aP != null) {
                                    if(Char.myCharz().aP.u() && Char.myCharz().aP.p == 4) {
                                       Char.myCharz().aP = null;
                                       Char.myCharz().bO = null;
                                    }

                                    bi = true;
                                    if(!a(Char.myCharz().aP)) {
                                       var10000 = false;
                                       break label413;
                                    }

                                    if(this.aK != null) {
                                       var10000 = false;
                                       break label413;
                                    }

                                    if(Char.myCharz().aB == null) {
                                       var10000 = false;
                                       break label413;
                                    }

                                    if(Char.myCharz().w()) {
                                       var10000 = false;
                                       break label413;
                                    }

                                    if(Char.myCharz().aP.p == 1 || Char.myCharz().aP.p == 0 || Char.myCharz().aB.a.e == 4) {
                                       var10000 = false;
                                       break label413;
                                    }

                                    if(!this.F()) {
                                       var10000 = false;
                                       break label413;
                                    }

                                    if(Char.myCharz().cx < Char.myCharz().aP.getX()) {
                                       Char.myCharz().I = 1;
                                    } else {
                                       Char.myCharz().I = -1;
                                    }

                                    var8 = Math.abs(Char.myCharz().cx - Char.myCharz().aP.getX());
                                    var9 = Math.abs(Char.myCharz().cy - Char.myCharz().aP.getY());
                                    Char.myCharz().D = 0;
                                    if(var8 > Char.myCharz().aB.g || var9 > Char.myCharz().aB.h) {
                                       var1 = false;
                                       if(Char.myCharz().aP instanceof nr_by || Char.myCharz().aP instanceof nr_d) {
                                          var1 = true;
                                       }

                                       var9 = (Char.myCharz().aB.g - (var1?50:20)) * (Char.myCharz().cx > Char.myCharz().aP.getX()?1:-1);
                                       if(var8 <= Char.myCharz().aB.g) {
                                          var9 = 0;
                                       }

                                       Char.myCharz().bO = new nr_df(Char.myCharz().aP.getX() + var9, Char.myCharz().aP.getY());
                                       Char.myCharz().ax = new Command((String)null, (IActionListener)null, 8002, (Object)null);
                                       GameCanvas.f();
                                       GameCanvas.e();
                                       var10000 = false;
                                       break label413;
                                    }

                                    if(Char.myCharz().aB.a.a != 20) {
                                       if(var9 > var8 && Res.g(Char.myCharz().cy - Char.myCharz().aP.getY()) > 30 && Char.myCharz().aP.z().c == 4) {
                                          Char.myCharz().bO = new nr_df(Char.myCharz().cx + Char.myCharz().I, Char.myCharz().aP.getY());
                                          Char.myCharz().ax = new Command((String)null, (IActionListener)null, 8002, (Object)null);
                                          GameCanvas.f();
                                          GameCanvas.e();
                                          var10000 = false;
                                          break label413;
                                       }

                                       var7 = 20;
                                       var10 = false;
                                       if(Char.myCharz().aP instanceof nr_by || Char.myCharz().aP instanceof nr_d) {
                                          var10 = true;
                                       }

                                       if(Char.myCharz().aB.g > 100) {
                                          var7 = 60;
                                          if(var8 < 20) {
                                             Char.myCharz().a(Char.myCharz().cx, Char.myCharz().cy, (int)10);
                                          }
                                       }

                                       Res.out("dt= " + var7);
                                       boolean var4 = false;
                                       int var5;
                                       if((TileMap.b(Char.myCharz().cx, Char.myCharz().cy + 3) & 2) == 2) {
                                          var5 = Char.myCharz().cx > Char.myCharz().aP.getX()?1:-1;
                                          if((TileMap.b(Char.myCharz().aP.getX() + var7 * var5, Char.myCharz().cy + 3) & 2) != 2) {
                                             var4 = true;
                                          }
                                       }

                                       if(var8 <= var7 && !var4) {
                                          if(var8 >= 30) {
                                             var5 = Char.myCharz().cx > Char.myCharz().aP.getX()?var7:-var7;
                                             Char.myCharz().bO = new nr_df(Char.myCharz().cx + var5, Char.myCharz().cy);
                                             Char.myCharz().ax = new Command((String)null, (IActionListener)null, 8002, (Object)null);
                                             GameCanvas.f();
                                             GameCanvas.e();
                                             var10000 = false;
                                             break label413;
                                          }

                                          if(Char.myCharz().cx > Char.myCharz().aP.getX()) {
                                             Char.myCharz().cx = Char.myCharz().aP.getX() + var7 + (var10?30:0);
                                             Char.myCharz().I = -1;
                                          } else {
                                             Char.myCharz().cx = Char.myCharz().aP.getX() - var7 - (var10?30:0);
                                             Char.myCharz().I = 1;
                                          }

                                          Service.gI().g();
                                       }

                                       GameCanvas.f();
                                       GameCanvas.e();
                                    }
                                 } else {
                                    int var11;
                                    if(Char.myCharz().aS != null) {
                                       if(Char.myCharz().aS.cY) {
                                          var10000 = false;
                                       } else {
                                          if(Char.myCharz().cx < Char.myCharz().aS.cx) {
                                             Char.myCharz().I = 1;
                                          } else {
                                             Char.myCharz().I = -1;
                                          }

                                          if(Char.myCharz().cx < Char.myCharz().aS.cx) {
                                             Char.myCharz().aS.I = -1;
                                          } else {
                                             Char.myCharz().aS.I = 1;
                                          }

                                          var8 = Math.abs(Char.myCharz().cx - Char.myCharz().aS.cx);
                                          if(Math.abs(Char.myCharz().cy - Char.myCharz().aS.cy) > 40) {
                                             Char.myCharz().cy = Char.myCharz().aS.cy - 40;
                                          }

                                          if(var8 < 60) {
                                             GameCanvas.f();
                                             GameCanvas.e();
                                             if(this.dg == 0) {
                                                if(Char.myCharz().taskMaint != null && Char.myCharz().taskMaint.taskId == 0) {
                                                   if(Char.myCharz().taskMaint.a < 4 && Char.myCharz().aS.cW.a == 4) {
                                                      var10000 = false;
                                                      break label413;
                                                   }

                                                   if(Char.myCharz().taskMaint.a < 3 && Char.myCharz().aS.cW.a == 3) {
                                                      var10000 = false;
                                                      break label413;
                                                   }
                                                }

                                                this.dg = 50;
                                                InfoDlg.a();
                                                Service.gI().g();
                                                Service.gI().openMenu(Char.myCharz().aS.cW.a);
                                             }
                                          } else {
                                             var11 = (20 + Res.a.nextInt(20)) * (Char.myCharz().cx > Char.myCharz().aS.cx?1:-1);
                                             Char.myCharz().bO = new nr_df(Char.myCharz().aS.cx + var11, Char.myCharz().cy);
                                             Char.myCharz().ax = new Command((String)null, (IActionListener)null, 8002, (Object)null);
                                             GameCanvas.f();
                                             GameCanvas.e();
                                          }

                                          var10000 = false;
                                       }
                                       break label413;
                                    }

                                    if(Char.myCharz().aT != null) {
                                       if(this.aK != null) {
                                          var10000 = false;
                                          break label413;
                                       }

                                       if(Char.myCharz().cx < Char.myCharz().aT.cx) {
                                          Char.myCharz().I = 1;
                                       } else {
                                          Char.myCharz().I = -1;
                                       }

                                       var8 = Math.abs(Char.myCharz().cx - Char.myCharz().aT.cx);
                                       var9 = Math.abs(Char.myCharz().cy - Char.myCharz().aT.cy);
                                       if(!Char.myCharz().c(Char.myCharz().aT) && !Char.myCharz().x()) {
                                          if(var8 < 60 && var9 < 40) {
                                             Char.myCharz();
                                             this.E();
                                             if(!GameCanvas.isTouch && Char.myCharz().aT.charID >= 0 && TileMap.l != 51 && TileMap.l != 52 && this.bQ == null) {
                                                GameCanvas.panel.a(Char.myCharz().aT);
                                                GameCanvas.panel.show();
                                                Service.gI().getPlayerMenu(Char.myCharz().aT.charID);
                                                Service.gI().w(Char.myCharz().aT.charID);
                                             }
                                          } else {
                                             var11 = (20 + Res.a.nextInt(20)) * (Char.myCharz().cx > Char.myCharz().aT.cx?1:-1);
                                             Char.myCharz().bO = new nr_df(Char.myCharz().aT.cx + var11, Char.myCharz().aT.cy);
                                             Char.myCharz().ax = new Command((String)null, (IActionListener)null, 8002, (Object)null);
                                             GameCanvas.f();
                                             GameCanvas.e();
                                          }

                                          var10000 = false;
                                          break label413;
                                       }

                                       if(Char.myCharz().aB == null) {
                                          var10000 = false;
                                          break label413;
                                       }

                                       if(!this.F()) {
                                          var10000 = false;
                                          break label413;
                                       }

                                       if(Char.myCharz().cx < Char.myCharz().aT.cx) {
                                          Char.myCharz().I = 1;
                                       } else {
                                          Char.myCharz().I = -1;
                                       }

                                       Char.myCharz().D = 0;
                                       if(var8 > Char.myCharz().aB.g || var9 > Char.myCharz().aB.h) {
                                          var11 = (Char.myCharz().aB.g - 20) * (Char.myCharz().cx > Char.myCharz().aT.cx?1:-1);
                                          if(var8 <= Char.myCharz().aB.g) {
                                             var11 = 0;
                                          }

                                          Char.myCharz().bO = new nr_df(Char.myCharz().aT.cx + var11, Char.myCharz().aT.cy);
                                          Char.myCharz().ax = new Command((String)null, (IActionListener)null, 8002, (Object)null);
                                          GameCanvas.f();
                                          GameCanvas.e();
                                          var10000 = false;
                                          break label413;
                                       }

                                       if(Char.myCharz().aB.a.a != 20) {
                                          var7 = 20;
                                          if(Char.myCharz().aB.g > 60) {
                                             var7 = 60;
                                             if(var8 < 20) {
                                                Char.myCharz().a(Char.myCharz().cx, Char.myCharz().cy, (int)10);
                                             }
                                          }

                                          var10 = false;
                                          if((TileMap.b(Char.myCharz().cx, Char.myCharz().cy + 3) & 2) == 2) {
                                             int var12 = Char.myCharz().cx > Char.myCharz().aT.cx?1:-1;
                                             if((TileMap.b(Char.myCharz().aT.cx + var7 * var12, Char.myCharz().cy + 3) & 2) != 2) {
                                                var10 = true;
                                             }
                                          }

                                          if(var8 <= var7 && !var10) {
                                             if(Char.myCharz().cx > Char.myCharz().aT.cx) {
                                                Char.myCharz().cx = Char.myCharz().aT.cx + var7;
                                                Char.myCharz().I = -1;
                                             } else {
                                                Char.myCharz().cx = Char.myCharz().aT.cx - var7;
                                                Char.myCharz().I = 1;
                                             }

                                             Service.gI().g();
                                          }

                                          GameCanvas.f();
                                          GameCanvas.e();
                                       }
                                    } else if(Char.myCharz().itemFocus != null) {
                                       this.H();
                                       var10000 = false;
                                       break label413;
                                    }
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }
                              break label413;
                           }
                        }

                        var10000 = false;
                     }
                  }

                  if(var10000) {
                     if(Char.myCharz().y() && Char.myCharz().N()) {
                        if(this.F()) {
                           Char.myCharz();
                           Char.myCharz().A();
                        } else {
                           Char.myCharz().B();
                        }
                     } else {
                        var1 = TileMap.a(Char.myCharz().cx, Char.myCharz().cy, 2);
                        Char.myCharz().a(u[Char.myCharz().aB.b], var1?0:1);
                        if(var1) {
                           Char.myCharz().bP = 20;
                        }

                        Char.myCharz();
                     }
                  }
               }

               if(Char.myCharz().x()) {
                  this.aW = 0;
               }
            }

         }
      }
   }

   private void H() {
      if(Char.myCharz().itemFocus != null) {
         if(Char.myCharz().cx < Char.myCharz().itemFocus.x) {
            Char.myCharz().I = 1;
         } else {
            Char.myCharz().I = -1;
         }

         int var1 = Math.abs(Char.myCharz().cx - Char.myCharz().itemFocus.x);
         int var2 = Math.abs(Char.myCharz().cy - Char.myCharz().itemFocus.y);
         if(var1 <= 40 && var2 < 40) {
            GameCanvas.f();
            GameCanvas.e();
            if(Char.myCharz().itemFocus.template.id != 673) {
               Service.gI().l(Char.myCharz().itemFocus.itemMapID);
               return;
            }

            Npc var4 = new Npc(5, 0, -100, 100, 5, aC.a[Char.myCharz().cgender][2]);
            Res.out(Char.myCharz().aS != null?"!null":"null");
            String var5 = mResources.av;
            String[] var3 = new String[]{mResources.bj, mResources.bk};
            Res.out(Char.myCharz().aS != null?"!null":"null");
            var4.db = 673;
            gI();
            a(var3, var4);
            ChatPopup.a(var5, 100000, var4, 5820);
            return;
         }

         Char.myCharz().bO = new nr_df(Char.myCharz().itemFocus.x, Char.myCharz().itemFocus.y);
         Char.myCharz().ax = new Command((String)null, (IActionListener)null, 8002, (Object)null);
         GameCanvas.f();
         GameCanvas.e();
      }

   }

   private boolean I() {
      return Char.myCharz().cg || Char.myCharz().cf || Char.myCharz().ch || Char.myCharz().cC || this.dQ || Char.myCharz().bj;
   }

   private void a(Skill var1, boolean var2) {
      if(!Char.myCharz().cc) {
         if(!this.I()) {
            if(Char.myCharz().taskMaint.taskId > 1) {
               Char.myCharz().aB = var1;
               if(this.ea != var1 && this.ea != null) {
                  Service.gI().i((int)var1.a.a);
                  this.q();
                  this.ea = var1;
                  this.dZ = -1;
                  gI().aW = 0;
               } else if(Char.myCharz().w()) {
                  Res.out("use skill not focus");
                  this.a(var1);
                  this.ea = var1;
               } else {
                  this.dZ = -1;
                  if(var1 != null) {
                     Res.out("only select skill");
                     if(this.ea != var1) {
                        Service.gI().i((int)var1.a.a);
                        this.q();
                     }

                     if(Char.myCharz().aT == null && Char.myCharz().x()) {
                        Res.out("return o day");
                        return;
                     }

                     if(Char.myCharz().N()) {
                        this.a(true, true);
                     }

                     this.ea = var1;
                  }

               }
            }
         }
      }
   }
   public static void autoNhat() {
            while (GameScr.anNhat) {
                Char.myCharz().as();

                if (Char.myCharz().itemFocus != null) {
                    GameScr.gI().H();
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
}

   private void b(Skill var1, boolean var2) {
      if(TileMap.l != 112 && TileMap.l != 113 || Char.myCharz().aM != 0) {
         if(Char.myCharz().w()) {
            this.a(var1);
         } else {
            this.dZ = -1;
            if(var1 != null) {
               Service.gI().i((int)var1.a.a);
               this.q();
               Char.myCharz().aB = var1;
               this.a(var2, true);
            }

         }
      }
   }

   private void a(Skill var1) {
      if(TileMap.l != 112 && TileMap.l != 113 || Char.myCharz().aM != 0) {
         if(this.F()) {
            this.dZ = -1;
            if(var1 != null) {
               Service.gI().i((int)var1.a.a);
               this.q();
               Char.myCharz().aB = var1;
               Char.myCharz();
               Char.z();
               Char.myCharz();
               this.aW = 0;
            }
         }

      }
   }

   public static void t() {
      for(int var0 = 0; var0 < Char.myCharz().az.size() - 1; ++var0) {
         Skill var1 = (Skill)Char.myCharz().az.elementAt(var0);

         for(int var2 = var0 + 1; var2 < Char.myCharz().az.size(); ++var2) {
            Skill var3;
            if((var3 = (Skill)Char.myCharz().az.elementAt(var2)).a.a < var1.a.a) {
               Skill var4 = var3;
               var3 = var1;
               var1 = var4;
               Char.myCharz().az.setElementAt(var4, var0);
               Char.myCharz().az.setElementAt(var3, var2);
            }
         }
      }

   }

   public final void c() {  //update
       if ( GameScr.isCheckFuture)
		{
			this.tsV3();
		}
       if(bl > 0) {
         --bl;
      }

      if(GameCanvas.gameTick % 100 == 0 && TileMap.l == 137) {
         bu = 30;
      }

      int var9;
      if(bi && GameCanvas.gameTick % 20 == 0) {
         if(this.dX > 0) {
            --this.dX;
         }

         if(bj && !bk && Char.myCharz().statusMe != 14 && Char.myCharz().statusMe != 5 && !Char.myCharz().bk && !Char.myCharz().cg && !Char.myCharz().y()) {
            boolean var2 = false;

            int var3;
            for(var3 = 0; var3 < vMob.size(); ++var3) {
               Mob var4;
               if((var4 = (Mob)vMob.elementAt(var3)).p != 0 && var4.p != 1) {
                  var2 = true;
               }
            }

            if(var2) {
               boolean var10 = false;

               int var11;
               for(var11 = 0; var11 < Char.myCharz().arrItemBag.length; ++var11) {
                  Item var7;
                  if((var7 = Char.myCharz().arrItemBag[var11]) != null && var7.template.type == 6) {
                     var10 = true;
                     break;
                  }
               }

               if(!var10 && GameCanvas.gameTick % 150 == 0) {
                  Service.gI().v();
               }

               if(Char.myCharz().cHP <= Char.myCharz().cHPFull * 20 / 100 || Char.myCharz().cMP <= Char.myCharz().cMPFull * 20 / 100) {
                  this.G();
               }

               if(Char.myCharz().aP != null && (Char.myCharz().aP == null || !Char.myCharz().aP.isMobMe)) {
                  if(Char.myCharz().aP.k <= 0 || Char.myCharz().aP.p == 1 || Char.myCharz().aP.p == 0) {
                     Char.myCharz().aP = null;
                  }
               } else {
                  for(var11 = 0; var11 < vMob.size(); ++var11) {
                     Mob var8;
                     if((var8 = (Mob)vMob.elementAt(var11)).p != 0 && var8.p != 1 && var8.k > 0 && !var8.isMobMe) {
                        Char.myCharz().cx = var8.m;
                        Char.myCharz().cy = var8.n;
                        Char.myCharz().aP = var8;
                        Service.gI().g();
                        Res.out("focus 1 con bossssssssssssssssssssssssssssssssssssssssssssssssss");
                        break;
                     }
                  }
               }

               if(Char.myCharz().aP != null && this.dX == 0 && (Char.myCharz().C() == null || Char.myCharz().bZ >= Char.myCharz().C().length || Char.myCharz().cb == null || Char.myCharz().ca == null)) {
                  Skill var12 = null;
                  if(GameCanvas.isTouch) { // ap
                     for(var9 = 0; var9 < aP.length; ++var9) {
                        if(aP[var9] != null && !aP[var9].j && aP[var9].a.a != 10 && aP[var9].a.a != 11 && aP[var9].a.a != 14 && aP[var9].a.a != 23 && aP[var9].a.a != 7 && Char.myCharz().C() == null) {
                           if(aP[var9].a.d == 2) {
                              var3 = 1;
                           } else if(aP[var9].a.d != 1) {
                              var3 = aP[var9].i;
                           } else {
                              var3 = aP[var9].i * Char.myCharz().cMPFull / 100;
                           }

                           if(Char.myCharz().cMP >= var3) {
                              if(var12 == null) {
                                 var12 = aP[var9];
                              } else if(var12.e < aP[var9].e) {
                                 var12 = aP[var9];
                              }
                           }
                        }
                     }

                     if(var12 != null) {
                        this.a(var12, true);
                        this.b((nr_bm)Char.myCharz().aP);
                     }
                  } else {
                     for(var9 = 0; var9 < aO.length; ++var9) {
                        if(aO[var9] != null && !aO[var9].j && aO[var9].a.a != 10 && aO[var9].a.a != 11 && aO[var9].a.a != 14 && aO[var9].a.a != 23 && aO[var9].a.a != 7 && Char.myCharz().C() == null) {
                           if(aO[var9].a.d == 2) {
                              var3 = 1;
                           } else if(aO[var9].a.d != 1) {
                              var3 = aO[var9].i;
                           } else {
                              var3 = aO[var9].i * Char.myCharz().cMPFull / 100;
                           }

                           if(Char.myCharz().cMP >= var3) {
                              if(var12 == null) {
                                 var12 = aO[var9];
                              } else if(var12.e < aO[var9].e) {
                                 var12 = aO[var9];
                              }
                           }
                        }
                     }

                     if(var12 != null) {
                        this.a(var12, true);
                        this.b((nr_bm)Char.myCharz().aP);
                     }
                  }
               }
            }
         }
      }

      GameScr var1 = this;
      if(this.fd != 0) {
         if((eh = System.currentTimeMillis()) - eg > 1000L) {
            eg = System.currentTimeMillis();
            ++ei;
         }

         if(ei > 20) {
            for(var9 = 0; var9 < var1.eW.length; ++var9) {
               var1.eX[var9] = var1.eW[var9];
            }

            --var1.fd;
            if(var1.fd == 0) {
               var1.fh = "";
               aC.a(var1.fc, 0);
               ei = 0;
            }
         } else if(this.fb > this.eW.length - 1) {
            --this.fd;
            if(this.fd == 0) {
               this.fh = "";
               aC.a(this.fc, 0);
            }
         } else {
            if(this.fb < this.eX.length) {
               if(this.eY[this.fb] == 15) {
                  if(this.eX[this.fb] == this.eW[this.fb] - 1) {
                     this.fa[this.fb] = 10;
                  }

                  if(this.eX[this.fb] == this.eW[this.fb]) {
                     this.eY[this.fb] = -1;
                     ++this.fb;
                  }
               } else if(GameCanvas.gameTick % 5 == 0) {
                  ++this.eY[this.fb];
               }
            }

            for(var9 = 0; var9 < var1.eW.length; ++var9) {
               if(var1.eY[var9] != -1) {
                  ++var1.eZ[var9];
                  if(var1.eZ[var9] > var1.eY[var9] + var1.fa[var9]) {
                     var1.eZ[var9] = 0;
                     ++var1.eX[var9];
                     if(var1.eX[var9] >= 10) {
                        var1.eX[var9] = 0;
                     }
                  }
               }
            }
         }
      }

      SmallImage.d();
      ++this.dy;
      if(this.dy == 100) {
         this.dy = 0;
      }

      int var6;
      try {
         if(nr_x.c) {
            nr_x.c = false;
         }

         if(L == 1) {
            ee = System.currentTimeMillis();
         }

         if(L == 100) {
            L = 0;
            var6 = (int)((ef = System.currentTimeMillis()) - ee) / 1000;
            Service.gI().g(var6);
         }

         if(z > 0 && --z == 0) {
            Controller.b = false;
         }

         if(!a) {
            if(j != l || k != m) {
               co = l - j << 2;
               cp = m - k << 2;
               cm += co;
               j += cm >> 4;
               cm &= 15;
               cn += cp;
               k += cn >> 4;
               cn &= 15;
               if(j < 24) {
                  j = 24;
               }

               if(j > n) {
                  j = n;
               }

               if(k < 0) {
                  k = 0;
               }

               if(k > cq) {
                  k = cq;
               }
            }

            if((o = j / TileMap.i - 1) < 0) {
               o = 0;
            }

            p = k / TileMap.i;
            q = o + ch;
            r = p + ci;
            if(p < 0) {
               p = 0;
            }

            if(r > TileMap.b - 1) {
               r = TileMap.b - 1;
            }

            if((TileMap.B = (Char.myCharz().cx - 2 * d) / TileMap.i) < 0) {
               TileMap.B = 0;
            }

            if((TileMap.C = TileMap.B + TileMap.F) > TileMap.a) {
               TileMap.B = (TileMap.C = TileMap.a) - TileMap.F;
            }

            if((TileMap.D = (Char.myCharz().cy - 2 * e) / TileMap.i) < 0) {
               TileMap.D = 0;
            }

            if((TileMap.E = TileMap.D + TileMap.G) > TileMap.b) {
               TileMap.D = (TileMap.E = TileMap.b) - TileMap.G;
            }

            cv.b();
            cu.b();
         }

         nr_cm.b().c();

         for(var6 = 0; var6 < D.size(); ++var6) {
            ((Char)D.elementAt(var6)).a();
         }

         for(var6 = 0; var6 < nr_ci.a.size(); ++var6) {
            ((nr_ci)nr_ci.a.elementAt(var6)).a();
         }

         Char.myCharz().a();
         if(Char.myCharz().statusMe == 1 && GameCanvas.gameTick % 100 == 0) {
            System.gc();
         }

         if(this.bQ != null) {
            this.bQ.a();
         }

         EffecMn.a();

         for(var6 = 0; var6 < vMob.size(); ++var6) {
            ((Mob)vMob.elementAt(var6)).c();
         }

         for(var6 = 0; var6 < G.size(); ++var6) {
            ((Npc)G.elementAt(var6)).a();
         }

         this.dY = aP.length;

         for(var6 = aP.length - 1; var6 >= 0; --var6) {
            if(aP[var6] != null) {
               this.dY = var6 + 1;
               break;
            }

            --this.dY;
         }

         if(this.dY == 1 && GameCanvas.isTouch) {
            ex = -200;
         } else if(ex < 0) {
            setSkillBarPostion();
         }

         GameCanvas.a().i();

         for(var6 = 0; var6 < 5; ++var6) {
            if(bI[var6] != -1) {
               if(bI[var6] > eC[var6]) {
                  ++eF[var6];
                  if(eF[var6] == 25) {
                     eF[var6] = 0;
                     bI[var6] = -1;
                     eC[var6] = 0;
                     eD[var6] = 0;
                     bG[var6] = 0;
                  }
               } else {
                  bI[var6] += Res.g(eE[var6]);
                  bG[var6] += eD[var6];
                  bH[var6] += eE[var6];
               }
            }
         }

         PopUp.b();

         for(var6 = 0; var6 < 2; ++var6) {
            if(eI[var6] != -1) {
               ++eI[var6];
               eG[var6] += eK[var6] << 2;
               --eH[var6];
               if(eI[var6] >= 6) {
                  eI[var6] = -1;
               } else {
                  eJ[var6] = (eI[var6] >> 1) % 3;
               }
            }
         }

         if(eQ != eR) {
            eT = eR - eQ << 2;
            eS += eT;
            eQ += eS >> 4;
            eS &= 15;
         }

         if(Math.abs(eR - eQ) < 15 && eQ < 0) {
            eR = 0;
         }

         if(Math.abs(eR - eQ) < 15 && eQ > 0) {
            eR = 0;
         }

         if(this.en > 0) {
            --this.en;
         }

         if(this.aU) {
            this.aU = false;
            nr_bm var13;
            if((var13 = this.e(this.dJ, this.dK)) == null || var13 != null && var13.equals(Char.myCharz().aS) && TileMap.l == 51) {
               ServerEffect.addServerEffect(134, this.dJ, this.dK + GameCanvas.Z / 2, 3);
            }
         }

         for(var6 = 0; var6 < vItemMap.size(); ++var6) {
            ((ItemMap)vItemMap.elementAt(var6)).update();
         }

         for(var6 = nr_cw.x.size() - 1; var6 >= 0; --var6) {
            nr_cw.w.removeElement(nr_cw.x.elementAt(var6));
            nr_cw.x.removeElementAt(var6);
         }

         for(var6 = 0; var6 < nr_cw.w.size(); ++var6) {
            ((nr_cw)nr_cw.w.elementAt(var6)).a();
         }

         for(var6 = 0; var6 < nr_cw.y.size(); ++var6) {
            ((nr_cw)nr_cw.y.elementAt(var6)).a();
         }

         for(var6 = 0; var6 < nr_cw.z.size(); ++var6) {
            ((nr_cw)nr_cw.z.elementAt(var6)).a();
         }

         for(var6 = 0; var6 < nr_cw.A.size(); ++var6) {
            ((nr_cw)nr_cw.A.elementAt(var6)).a();
         }

         for(var6 = 0; var6 < nr_cw.v.size(); ++var6) {
            ((nr_cw)nr_cw.v.elementAt(var6)).a();
         }

         nr_dw.c();
         aC.a();
         aD.a();
         if(P != null && !P.equals(Char.myCharz())) {
            P.a();
         }

         ++this.ej;
         if(this.ej > 3) {
            this.ej = 0;
         }

         if(this.bE) {
            ++this.bD;
            if(this.bD == 20) {
               this.bD = 0;
               this.bE = false;
            }
         } else if(this.bC > Char.myCharz().cHP) {
            if((var9 = this.bC - Char.myCharz().cHP >> 1) <= 0) {
               var9 = 1;
            }

            this.bC -= var9;
         } else {
            this.bC = Char.myCharz().cHP;
         }

         if(this.bB) {
            ++this.bA;
            if(this.bA == 20) {
               this.bA = 0;
               this.bB = false;
            }
         } else if(this.bz > Char.myCharz().cMP) {
            if((var9 = this.bz - Char.myCharz().cMP >> 1) <= 0) {
               var9 = 1;
            }

            this.bz -= var9;
         } else {
            this.bz = Char.myCharz().cMP;
         }

         if(this.dg > 0) {
            --this.dg;
         }

         if(this.u()) {
            while(this.bf - 100 < k) {
               --k;
            }
         }

         for(var6 = 0; var6 < Char.bq.size(); ++var6) {
            ((nr_cs)Char.bq.elementAt(var6)).a();
         }

         for(var6 = 0; var6 < bv.size(); ++var6) {
            ((nr_cs)bv.elementAt(var6)).a();
         }

         if(this.fg) {
            this.fe -= 2;
            if(this.fe < -this.ff) {
               this.fe = GameCanvas.z;
               eV.removeElementAt(0);
               if(eV.size() == 0) {
                  this.bR = false;
                  this.fg = false;
               } else {
                  this.ff = mFont.c.a((String)eV.elementAt(0));
               }
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      if((var6 = GameCanvas.gameTick % 4000) == 1000) {
         nr_aq.a(nr_aq.a, 10);
      }

      nr_db.a();
   }

   public final boolean u() {
      return this.dV;
   }

   public static void a(mGraphics var0, int var1) {
      int var2;
      for(var2 = 0; var2 < TileMap.v.size(); ++var2) {
         nr_ct var3;
         if((var3 = (nr_ct)TileMap.v.elementAt(var2)).c != -1 && var3.h == var1) {
            var3.a(var0);
         }
      }

      if(TileMap.l == 48 && var1 == 3 && GameCanvas.O != null && GameCanvas.O[0] != 0) {
         for(var2 = 0; var2 < TileMap.c / GameCanvas.O[0] + 1; ++var2) {
            var0.drawImage(GameCanvas.M[0], var2 * GameCanvas.O[0], TileMap.d - GameCanvas.P[0] - 70, 0);
         }
      }

   }

   public static void b(mGraphics var0) {
      if(!GameCanvas.lowGraphic) {
         var0.a(dP, 0, 0, GameCanvas.z, GameCanvas.A);
      }
   }

   public final void a(mGraphics var1) {   //paint
      aM = 0;
      if(bt) {
         if(this.aY || this.aZ && ChatPopup.m == null) {
            ++this.aX;
            if(this.aX < 30 && this.aX >= 0 && GameCanvas.gameTick % 4 == 0 || this.aX >= 30 && this.aX <= 50 && GameCanvas.gameTick % 3 == 0 || this.aX > 50) {
               var1.a(16777215);
               var1.d(0, 0, GameCanvas.z, GameCanvas.A);
               if(this.aX > 50) {
                  if(this.aZ) {
                     this.aZ = false;
                     this.aX = 0;
                     if(this.bc) {
                        this.c(this.be, this.bf);
                     } else {
                        this.ba = false;
                        EffecMn.a(17);
                        if(this.bb) {
                           this.bb = false;
                           EffecMn.a(25);
                        }
                     }
                  }

                  this.e(var1);
                  var1.a(-j, -k);
                  var1.a(0, GameCanvas.Z);
                  Char.myCharz().a(var1);
                  Main.a(var1);
                  c(var1);
                  this.f(var1);
                  return;
               }

               return;
            }
         }

         GameCanvas.b(var1);
         if((this.ba || this.bR) && TileMap.o != 3) {
            b(var1);
         }

         if(bu > 0) {
            var1.a(-j + el[bu % el.length], -k + em[bu % em.length]);
            --bu;
         } else {
            var1.a(-j, -k);
         }

         int var3;
         if(this.dQ) {
            var3 = GameCanvas.gameTick % 3 == 0?3:-3;
            var1.a(var3, 0);
         }

         nr_dw.c(var1);
         EffecMn.a(var1);
         TileMap.a(var1);
         TileMap.b(var1);

         int var2;
         Char var18;
         for(var2 = 0; var2 < D.size(); ++var2) {
            if((var18 = (Char)D.elementAt(var2)).ci && TileMap.l == 128) {
               var18.b(var1, var18.cx, var18.cy, 0);
            }
         }

         if(Char.myCharz().ci && TileMap.l == 128) {
            Char.myCharz().b(var1, Char.myCharz().cx, Char.myCharz().cy, 0);
         }

         a(var1, 2);
         if(Char.myCharz().am != null && GameCanvas.isTouch) {
            if(mScreen.cg == 20) {
               var1.drawImage(dk, Char.myCharz().am.x + j, Char.myCharz().am.y + k, 3);
            } else {
               var1.drawImage(dj, Char.myCharz().am.x + j, Char.myCharz().am.y + k, 3);
            }
         }

         nr_dw.f(var1);
         nr_db.a.a(var1);

         for(var2 = 0; var2 < nr_cw.A.size(); ++var2) {
            ((nr_cw)nr_cw.A.elementAt(var2)).a(var1);
         }

         for(var2 = 0; var2 < nr_ci.a.size(); ++var2) {
            ((nr_ci)nr_ci.a.elementAt(var2)).a(var1);
         }

         Npc var19;
         for(var2 = 0; var2 < G.size(); ++var2) {
            if((var19 = (Npc)G.elementAt(var2)).cHP > 0) {
               var19.c(var1);
            }
         }

         for(var2 = 0; var2 < G.size(); ++var2) {
            ((Npc)G.elementAt(var2)).a(var1);
         }

         var1.a(0, GameCanvas.Z);

         for(var2 = 0; var2 < D.size(); ++var2) {
            var18 = null;

            try {
               var18 = (Char)D.elementAt(var2);
            } catch (Exception var16) {
               ;
            }

            if(var18 != null && (!GameCanvas.panel.a || !GameCanvas.panel.F()) && var18.bc) {
               var18.c(var1);
            }
         }

         Char.myCharz().c(var1);
         EffecMn.b(var1);

         for(var2 = 0; var2 < vMob.size(); ++var2) {
            ((Mob)vMob.elementAt(var2)).a(var1);
         }

         for(var2 = 0; var2 < nr_ci.a.size(); ++var2) {
            ((nr_ci)nr_ci.a.elementAt(var2)).b(var1);
         }

         for(var2 = 0; var2 < D.size(); ++var2) {
            var18 = null;

            try {
               var18 = (Char)D.elementAt(var2);
            } catch (Exception var15) {
               ;
            }

            if(var18 != null && (!GameCanvas.panel.a || !GameCanvas.panel.F())) {
               var18.a(var1);
            }
         }

         Char.myCharz().a(var1);
         if(Char.myCharz().cd != null && Char.myCharz().C() != null && Char.myCharz().bZ < Char.myCharz().C().length) {
            Char.myCharz().d(var1);
            Char.myCharz().b(var1);
         }

         for(var2 = 0; var2 < D.size(); ++var2) {
            var18 = null;

            try {
               var18 = (Char)D.elementAt(var2);
            } catch (Exception var14) {
               ;
            }

            if(var18 != null && (!GameCanvas.panel.a || !GameCanvas.panel.F()) && var18.cd != null && var18.C() != null && var18.bZ < var18.C().length) {
               var18.d(var1);
               var18.b(var1);
            }
         }

         for(var2 = 0; var2 < vItemMap.size(); ++var2) {
            ((ItemMap)vItemMap.elementAt(var2)).paint(var1);
         }

         var1.a(0, -GameCanvas.Z);
         mGraphics var10 = var1;

         for(int var11 = 0; var11 < 2; ++var11) {
            if(eI[var11] != -1) {
               if(eK[var11] == 1) {
                  var10.drawImage(eL[eJ[var11]], eG[var11], eH[var11], 3);
               } else {
                  var10.drawRegion(eL[eJ[var11]], 0, 0, mGraphics.getImageWidth(eL[eJ[var11]]), mGraphics.getImageHeight(eL[eJ[var11]]), 2, eG[var11], eH[var11], 3);
               }
            }
         }

         var10 = var1;

         for(var3 = 0; var3 < nr_cw.w.size(); ++var3) {
            nr_cw var4;
            if(!((var4 = (nr_cw)nr_cw.w.elementAt(var3)) instanceof ChatPopup)) {
               var4.a(var10);
            }
         }

         if(!GameCanvas.lowGraphic) {
            for(var3 = 0; var3 < nr_cw.z.size(); ++var3) {
               ((nr_cw)nr_cw.z.elementAt(var3)).a(var10);
            }
         }

         for(var3 = 0; var3 < nr_cw.y.size(); ++var3) {
            ((nr_cw)nr_cw.y.elementAt(var3)).a(var10);
         }

         nr_db.b.a(var1);
         a(var1, 3);

         for(var2 = 0; var2 < G.size(); ++var2) {
            ((Npc)G.elementAt(var2)).e(var1);
         }

         EffecMn.c(var1);

         for(var2 = 0; var2 < G.size(); ++var2) {
            if((var19 = (Npc)G.elementAt(var2)) != null && var19.z != null) {
               var19.z.a(var1, var19.cx, var19.cy - var19.al - GameCanvas.Z, var19.I);
            }
         }

         for(var2 = 0; var2 < D.size(); ++var2) {
            var18 = null;

            try {
               var18 = (Char)D.elementAt(var2);
            } catch (Exception var13) {
               ;
            }

            if(var18 != null && var18.z != null) {
               var18.z.a(var1, var18.cx, var18.cy - var18.al, var18.I);
            }
         }

         if(Char.myCharz().z != null) {
            Char.myCharz().z.a(var1, Char.myCharz().cx, Char.myCharz().cy - Char.myCharz().al, Char.myCharz().I);
         }

         nr_dw.d(var1);

         for(var3 = 0; var3 < TileMap.v.size(); ++var3) {
            nr_ct var20;
            if((var20 = (nr_ct)TileMap.v.elementAt(var3)).c != -1 && var20.h > 3) {
               var20.a(var1);
            }
         }

         PopUp.a(var1);
         if(TileMap.l == 120) {
            if(this.bS != 100) {
               var3 = this.bS * mGraphics.getImageWidth(dx) / 100;
               var1.drawImage(dx, TileMap.c / 2 - mGraphics.getImageWidth(dx) / 2, 220, 0);
               var1.e(TileMap.c / 2 - mGraphics.getImageWidth(dx) / 2, 220, var3, 10);
               var1.drawImage(dv, TileMap.c / 2 - mGraphics.getImageWidth(dx) / 2, 220, 0);
               var1.e(0, 0, GameCanvas.z, GameCanvas.A);
            }

            if(this.bT) {
               ++this.bU;
               if(GameCanvas.gameTick % 3 == 0) {
                  EffecMn.addEff(new Effect(19, Res.b(TileMap.c / 2 - 50, TileMap.c / 2 + 50), 340, 2, 1, -1));
               }

               if(GameCanvas.gameTick % 15 == 0) {
                  EffecMn.addEff(new Effect(18, Res.b(TileMap.c / 2 - 5, TileMap.c / 2 + 5), Res.b(300, 320), 2, 1, -1));
               }

               if(this.bU == 100) {
                  this.b(TileMap.c / 2, 300);
               }

               if(this.bU == 110) {
                  this.bU = 0;
                  this.bT = false;
               }
            }
         }

         nr_dw.a(var1);
         boolean var26 = true;

         for(var2 = 0; var2 < nr_dw.a.size(); ++var2) {
            if(((nr_dw)nr_dw.a.elementAt(var2)).b == 0) {
               var26 = false;
               break;
            }
         }

         if(mGraphics.zoomLevel <= 1) {
            var26 = false;
         }

         int var5;
         int var21;
         if(var26 && !this.ba) {
            if((var21 = TileMap.c / (mGraphics.getImageWidth(TileMap.A) + 50)) <= 0) {
               var21 = 1;
            }

            if(TileMap.e != 28) {
               for(var2 = 0; var2 < var21; ++var2) {
                  var5 = 100 + var2 * (mGraphics.getImageWidth(TileMap.A) + 50) - j / 2;
                  var3 = mGraphics.getImageWidth(TileMap.A);
                  if(var5 + var3 >= j && var5 <= j + GameCanvas.z && -20 + mGraphics.getImageHeight(TileMap.A) >= k && -20 <= k + GameCanvas.A) {
                     var1.drawImage(TileMap.A, 100 + var2 * (mGraphics.getImageWidth(TileMap.A) + 50) - j / 2, -20, 0);
                  }
               }
            }
         }

         Main.a(var1);
         var10 = var1;

         try {
            byte var30;
            if(ChatPopup.m == null && (var30 = A()) != -1) {
               Npc var22 = null;

               for(var5 = 0; var5 < G.size(); ++var5) {
                  Npc var29;
                  if((var29 = (Npc)G.elementAt(var5)).cW.a == var30) {
                     if(var22 == null) {
                        var22 = var29;
                     } else if(Res.g(var29.cx - Char.myCharz().cx) < Res.g(var22.cx - Char.myCharz().cx)) {
                        var22 = var29;
                     }
                  }
               }

               if(var22 != null && var22.statusMe != 15 && (var22.cx <= j || var22.cx >= j + d || var22.cy <= k || var22.cy >= k + e) && GameCanvas.gameTick % 10 >= 5) {
                  var5 = var22.cx - Char.myCharz().cx;
                  var2 = var22.cy - Char.myCharz().cy;
                  var3 = 0;
                  var21 = 0;
                  byte var6 = 0;
                  if(var5 > 0 && var2 >= 0) {
                     if(Res.g(var5) >= Res.g(var2)) {
                        var3 = d - 10;
                        var21 = e / 2 + 30;
                        if(GameCanvas.isTouch) {
                           var21 = e / 2 + 10;
                        }

                        var6 = 0;
                     } else {
                        var3 = d / 2;
                        var21 = e - 10;
                        var6 = 5;
                     }
                  } else if(var5 >= 0 && var2 < 0) {
                     if(Res.g(var5) >= Res.g(var2)) {
                        var3 = d - 10;
                        var21 = e / 2 + 30;
                        if(GameCanvas.isTouch) {
                           var21 = e / 2 + 10;
                        }

                        var6 = 0;
                     } else {
                        var3 = d / 2;
                        var21 = 10;
                        var6 = 6;
                     }
                  }

                  if(var5 < 0 && var2 >= 0) {
                     if(Res.g(var5) >= Res.g(var2)) {
                        var3 = 10;
                        var21 = e / 2 + 30;
                        if(GameCanvas.isTouch) {
                           var21 = e / 2 + 10;
                        }

                        var6 = 3;
                     } else {
                        var3 = d / 2;
                        var21 = e - 10;
                        var6 = 5;
                     }
                  } else if(var5 <= 0 && var2 < 0) {
                     if(Res.g(var5) >= Res.g(var2)) {
                        var3 = 10;
                        var21 = e / 2 + 30;
                        if(GameCanvas.isTouch) {
                           var21 = e / 2 + 10;
                        }

                        var6 = 3;
                     } else {
                        var3 = d / 2;
                        var21 = 10;
                        var6 = 6;
                     }
                  }

                  c(var10);
                  var10.drawRegion(bw, 0, 0, 13, 16, var6, var3, var21, nr_cf.f);
               }
            }
         } catch (Exception var17) {
            ;
         }

         if(!a && bn == 1 && !GameCanvas.panel.a) {
            this.e(var1);
         }

         c(var1);
         var10 = var1;
         var1.a(8421504);
         var1.d(0, GameCanvas.A - 2, GameCanvas.z, 2);
         var3 = (int)(Char.myCharz().cLevelPercent * (long)GameCanvas.z / 10000L);
         var1.a(16777215);
         var1.d(0, GameCanvas.A - 2, var3, 2);
         var1.a(0);
         var3 = GameCanvas.z / 10;

         for(var21 = 1; var21 < 10; ++var21) {
            var10.d(var21 * var3, GameCanvas.A - 2, 1, 2);
         }

         if(!a) {
            if(GameCanvas.ah) {
               if(GameCanvas.z > 250) {
                  var1.drawImage(GameCanvas.ac, 160, 6, 0);
                  mFont.s.drawString(var1, "Dành cho người chơi trên 12 tuổi.", 180, 2, 0);
                  mFont.s.drawString(var1, "Chơi quá 180 phút mỗi ngày ", 180, 12, 0);
                  mFont.s.drawString(var1, "sẽ hại sức khỏe.", 180, 22, 0);
               } else {
                  var1.drawImage(GameCanvas.ac, 5, GameCanvas.A - 67, 0);
                  mFont.s.drawString(var1, "Dành cho người chơi trên 12 tuổi.", 25, GameCanvas.A - 70, 0);
                  mFont.s.drawString(var1, "Chơi quá 180 phút mỗi ngày sẽ hại sức khỏe.", 25, GameCanvas.A - 60, 0);
               }
            }

            var1.a(-var1.a(), -var1.b());
            if((TileMap.l == 128 || TileMap.l == 127) && bW != 0) {
               var1.a(0);
               var1.d(3, 88, 54, 8);
               var1.a(16711680);
               var1.e(5, 90, bW, 4);
               var1.d(5, 90, 50, 4);
               var1.e(0, 0, 3000, 3000);
               mFont.c.a(var1, "Mabu", 30, 98, 2, mFont.tahoma_7b_dark);
            }

            if(Char.myCharz().cH) {
               ++Char.myCharz().cI;
               if(GameCanvas.gameTick % 3 == 0) {
                  var1.a(16777215);
                  var1.d(0, 0, GameCanvas.z, GameCanvas.A);
               }

               if(Char.myCharz().cI >= 100) {
                  Char.myCharz().T();
               }
            }

            for(var2 = 0; var2 < D.size(); ++var2) {
               Char var28 = null;

               try {
                  var28 = (Char)D.elementAt(var2);
               } catch (Exception var12) {
                  ;
               }

               if(var28 != null && var28.cH && Char.a(var28)) {
                  ++var28.cI;
                  if(GameCanvas.gameTick % 3 == 0) {
                     var1.a(16777215);
                     var1.d(0, 0, GameCanvas.z, GameCanvas.A);
                  }

                  if(var28.cI >= 100) {
                     var28.T();
                  }
               }
            }

            c(var1);
            this.f(var1);
            c(var1);
            if(GameCanvas.isTouch && GameCanvas.f && !this.L()) {
               c(var1);
               if(!TileMap.d() && !this.x()) {
                  if(mScreen.cg == 15) {
                     var1.drawImage(dk, ep + 17, eq + 17, 3);
                  } else {
                     var1.drawImage(dj, ep + 17, eq + 17, 3);
                  }
               }
            }

            c(var1);
            if(eV.size() != 0 && isPaintChatVip) {
               var1.e(0, GameCanvas.A - 13, GameCanvas.z, 15);
               var1.a(0, GameCanvas.A - 13, GameCanvas.z, 15, 0);
               String var32 = (String)eV.elementAt(0);
               mFont.e.drawString(var1, var32, this.fe, GameCanvas.A - 12, 0);
            }

            if(!GameCanvas.panel.a && GameCanvas.J == null && ChatPopup.m == null && ChatPopup.n == null && GameCanvas.currentScreen.equals(c)) {
               super.a(var1);
            }

            c(var1);
            var21 = 100 + (Char.bq.size() != 0?bv.size() * 12:0);
            if(Char.myCharz().ai != null) {
               var5 = 0;
               int var25 = 0;
               var3 = (GameCanvas.A - 100 - 60) / 12;

               for(var2 = 0; var2 < D.size(); ++var2) {
                  Char var7;
                  if((var7 = (Char)D.elementAt(var2)).ah != -1 && var7.ah == Char.myCharz().ai.a) {
                     if(var7.E() && var7.cx < Char.myCharz().cx) {
                        int var8 = var3;
                        if(Char.bq.size() != 0) {
                           var8 = var3 - bv.size();
                        }

                        if(var5 <= var8) {
                           mFont.r.a(var1, var7.cName, 20, var21 - 12 + var5 * 12, 0, mFont.o);
                           var7.a(var1, 10, var21 + var5 * 12 - 5);
                           ++var5;
                        }
                     } else if(var7.E() && var7.cx > Char.myCharz().cx && var25 <= var3) {
                        mFont.r.a(var1, var7.cName, GameCanvas.z - 25, var21 - 12 + var25 * 12, 1, mFont.o);
                        var7.a(var1, GameCanvas.z - 15, var21 + var25 * 12 - 5);
                        ++var25;
                     }
                  }
               }
            }

            nr_cm.b().a(var1);
            if(aV && !GameCanvas.panel.a && GameCanvas.gameTick % 4 == 0) {
               var1.drawImage(ItemMap.imageFlare, this.aQ.x + 15, this.aQ.y + 30, 33);
            }

            if(this.dQ) {
               this.dU += 5;
               if(this.dR >= 0) {
                  this.dR += this.dU;
               }

               if(this.dR < 0) {
                  --this.dR;
                  if(this.dR == -20) {
                     this.dQ = false;
                     this.dR = 0;
                     this.dU = 0;
                  }
               } else if((this.dS - this.dR > 0 || this.dR < TileMap.c) && this.dR > 0) {
                  var1.a(16777215);
                  if(!GameCanvas.lowGraphic && Main.typeClient != 3 && Main.typeClient != 5) {
                     var1.a(this.dS - this.dR, this.dT - this.dR, 2 * this.dR, 2 * this.dR, 0, 360);
                  } else {
                     var1.d(0, 0, GameCanvas.z, GameCanvas.A);
                  }
               } else {
                  this.dR = -1;
               }
            }

            for(var2 = 0; var2 < Char.bq.size(); ++var2) {
               nr_cs var34 = (nr_cs)Char.bq.elementAt(var2);
               int var10002 = this.aQ.x + 32 + var2 * 24;
               boolean var31 = true;
               var3 = var10002;
               nr_cs var27 = var34;
               SmallImage.drawSmallImage(var1, var27.a, var3, 55, 0, 3);
               String var23 = var27.c + "\'";
               if(var27.c == 0) {
                  var23 = var27.b + "s";
               }

               mFont.c.a(var1, var23, var3, 70, 2, mFont.tahoma_7b_dark);
            }

            for(var2 = 0; var2 < bv.size(); ++var2) {
               ((nr_cs)bv.elementAt(var2)).a(var1, this.aQ.x + (Char.bq.size() != 0?5:25), (Char.bq.size() != 0?90:45) + var2 * 12);
            }

            this.d(var1);
            if(mResources.fw == 1) {
               long var24 = Main.c() + aR;
               mFont var35 = mFont.c;
               Calendar var33;
               (var33 = Calendar.getInstance()).setTime(new Date(var24 + 25200000L));
               var21 = var33.get(11);
               var5 = var33.get(12);
               var35.a(var1, var21 + "h" + var5 + "m", 10, GameCanvas.A - 65, 0, mFont.tahoma_7b_dark);
            }

            if(!this.fh.equals("")) {
               for(var2 = 0; var2 < this.fi.length; ++var2) {
                  mFont.c.a(var1, this.fi[var2], 5, 85 + var2 * 18, 0, mFont.tahoma_7b_dark);
               }
            }
         }

         var5 = GameCanvas.B;
         if(GameCanvas.B > 200) {
            var5 = 200;
         }

         a(var1, 0 + GameCanvas.z / 2, 0, var5);
         nr_db.c.a(var1);
      }
   }

   private void d(mGraphics var1) {
      if(this.fd != 0) {
         String var2 = "";

         for(int var3 = 0; var3 < this.eW.length; ++var3) {
            var2 = var2 + this.eX[var3] + " ";
         }

         PopUp.a(var1, 20, 45, 95, 35, 16777215, false);
         mFont.tahoma_7b_dark.drawString(var1, mResources.j, 68, 50, 2);
         mFont.tahoma_7b_dark.drawString(var1, var2, 68, 65, 2);
      }

   }

   public static Npc a(short var0) {
      for(int var1 = 0; var1 < G.size(); ++var1) {
         Npc var2;
         if((var2 = (Npc)G.elementAt(var1)).cW.a == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Char findCharInMap(int var0) {
      for(int var1 = 0; var1 < D.size(); ++var1) {
         Char var2;
         if((var2 = (Char)D.elementAt(var1)).charID == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Mob c(int var0) {
      for(int var1 = 0; var1 < vMob.size(); ++var1) {
         Mob var2;
         if((var2 = (Mob)vMob.elementAt(var1)).y == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Mob findMobInMap(byte var0) {
      return (Mob)vMob.elementAt(var0);
   }

   public static Npc v() {
      for(int var0 = 0; var0 < G.size(); ++var0) {
         Npc var1;
         if((var1 = (Npc)G.elementAt(var0)).cW.a == A()) {
            return var1;
         }
      }

      return null;
   }

   public static void c(mGraphics var0) {
      var0.a(-var0.a(), -var0.b());
      var0.e(0, -200, GameCanvas.z, 200 + GameCanvas.A);
   }

   private void a(mGraphics var1, Char var2) {
      int var3 = var2.cHP * eM / var2.cHPFull;
      int var4 = var2.cMP * eO;
      int var6 = this.bC * eM / var2.cHPFull;
      int var5 = this.bz * eO;
      var1.e(GameCanvas.z / 2 + 58 - mGraphics.getImageWidth(dt), 0, 95, 100);
      var1.b(dt, 0, 0, mGraphics.getImageWidth(dt), mGraphics.getImageHeight(dt), 2, GameCanvas.z / 2 + 60, 0, 24);
      var1.e(GameCanvas.z / 2 + 60 - 83 - eM + eM - var6, 5, var6, 10);
      var1.drawImage(dx, GameCanvas.z / 2 + 60 - 83, 5, 24);
      var1.e(0, 0, GameCanvas.z, GameCanvas.A);
      var1.e(GameCanvas.z / 2 + 60 - 83 - eM + eM - var3, 5, var3, 10);
      var1.drawImage(dv, GameCanvas.z / 2 + 60 - 83, 5, 24);
      var1.e(0, 0, GameCanvas.z, GameCanvas.A);
      var1.e(GameCanvas.z / 2 + 60 - 83 - eO + eM - var5, 20, var5, 6);
      var1.drawImage(aF, GameCanvas.z / 2 + 60 - 83, 20, 24);
      var1.e(0, 0, GameCanvas.z, GameCanvas.A);
      var1.e(GameCanvas.z / 2 + 60 - 83 - eO + eM - var4, 20, var4, 6);
      var1.drawImage(arrItemBag, GameCanvas.z / 2 + 60 - 83, 20, 24);
      var1.e(0, 0, GameCanvas.z, GameCanvas.A);
   }

   private void a(mGraphics var1, boolean var2, Char var3) {
      if(var3 != null) {
         int var4;
         int var5;
         int var7;
         if(var3.charID == Char.myCharz().charID) {
            var7 = this.bC * eM / var3.cHPFull;
            var4 = this.bz * eO / var3.cMPFull;
            var5 = var3.cHP * eM / var3.cHPFull;
         } else {
            var7 = var3.cP * eM / var3.cHPFull;
            var4 = var3.cO * eO / 100;
            var5 = var3.cHP * eM / var3.cHPFull;
         }

         if(Char.myCharz().bM > 0) {
            int var6 = Char.myCharz().bK * eN / Char.myCharz().bL;
            var1.drawImage(du, 58, 29, 0);
            var1.e(83, 31, var6, 10);
            var1.drawImage(dw, 83, 31, 0);
            var1.e(0, 0, GameCanvas.z, GameCanvas.A);
            mFont.s.drawString(var1, Char.myCharz().bJ + ":" + Char.myCharz().bK + "/" + Char.myCharz().bL, 115, 29, 2);
         }

         if(var3.charID != Char.myCharz().charID) {
            var1.e(mGraphics.getImageWidth(dt) - 95, 0, 95, 100);
         }

         var1.drawImage(dt, 0, 0, 0);
         var1.e(83, 5, var7, 10);
         var1.drawImage(dx, 83, 5, 0);
         var1.e(0, 0, GameCanvas.z, GameCanvas.A);
         var1.e(83, 5, var5, 10);
         var1.drawImage(dv, 83, 5, 0);
         var1.e(0, 0, GameCanvas.z, GameCanvas.A);
         var1.e(83, 20, var4, 6);
         var1.drawImage(aF, 83, 20, 0);
         var1.e(0, 0, GameCanvas.z, GameCanvas.A);
         var1.e(83, 20, var4, 6);
         var1.drawImage(arrItemBag, 83, 20, 0);
         var1.e(0, 0, GameCanvas.z, GameCanvas.A);
         if(Char.myCharz().cMP == 0 && GameCanvas.gameTick % 10 > 5) {
            var1.e(83, 20, 2, 6);
            var1.drawImage(aF, 83, 20, 0);
            var1.e(0, 0, GameCanvas.z, GameCanvas.A);
         }

      }
   }

   public final void w() {
      this.ez = this.eA = System.currentTimeMillis();
      this.eB = 180;
   }

   private static Char J() {
      for(int var0 = 0; var0 < D.size(); ++var0) {
         Char var1;
         if((var1 = (Char)D.elementAt(var0)).aM != 0) {
            return var1;
         }
      }

      return null;
   }

   private Char K() {
      for(int var1 = 0; var1 < D.size(); ++var1) {
         Char var2;
         if((var2 = (Char)D.elementAt(var1)).aM != 0 && var2 != J()) {
            return var2;
         }
      }

      return null;
   }

   private void e(mGraphics var1) {
      if(!Char.bH) {
         c(var1);
         if(TileMap.l == 130 && J() != null && this.K() != null) {
            var1.a(GameCanvas.z / 2 - 62, 0);
            this.a(var1, true, J());
            var1.a(-(GameCanvas.z / 2 - 65), 0);
            this.a(var1, this.K());
            J().b(var1, 15, 20, 0);
            this.K().b(var1, GameCanvas.z - 15, 20, 2);
         } else if(this.x() && Char.myCharz().aT != null) {
            var1.a(GameCanvas.z / 2 - 62, 0);
            this.a(var1, true, Char.myCharz().aT);
            var1.a(-(GameCanvas.z / 2 - 65), 0);
            this.a(var1, Char.myCharz());
            Char.myCharz().b(var1, 15, 20, 0);
            int var10002 = GameCanvas.z - 15;
            Char.myCharz().aT.b(var1, var10002, 20, 2);
         } else if(M() && GameCanvas.z <= 320) {
            Char var3 = Char.myCharz();
            boolean var2 = true;
            var2 = true;
            var1.drawImage(fo, 1, 1, 0);
            int var5 = fj.getWidth();
            int var6 = fj.getHeight() / 2;
            int var4;
            if((var4 = var3.cHP * var5 / var3.cHPFull) <= 0) {
               var4 = 1;
            } else if(var4 > var5) {
               var4 = var5;
            }

            var1.drawRegion(fj, 0, var6, var4, var6, 0, 4, 20, 0);
            if((var4 = var3.cMP * var5 / var3.cMPFull) <= 0) {
               var4 = 1;
            } else if(var4 > var5) {
               var4 = var5;
            }

            var1.drawRegion(fj, 0, 0, var4, var6, 0, 4, 26, 0);
            var4 = 1 + fo.getWidth() / 2 + 1;
            mFont.m.drawString(var1, var3.cName, var4, 5, 2);
            if(var3.aP != null) {
               if(var3.aP.z() != null) {
                  mFont.m.drawString(var1, var3.aP.z().e, var4, 33, 2);
               }
            } else if(var3.aS != null) {
               mFont.m.drawString(var1, var3.aS.cW.b, var4, 33, 2);
            } else if(var3.aT != null) {
               mFont.m.drawString(var1, var3.aT.cName, var4, 33, 2);
            }
         } else {
            this.a(var1, true, Char.myCharz());
            if(Char.myCharz().i() == null && Char.myCharz().j() == null) {
               int var10003;
               if(Char.myCharz().aP != null) {
                  if(Char.myCharz().aP.z() != null) {
                     var10003 = this.eP / 2;
                     mFont.m.drawString(var1, Char.myCharz().aP.z().e, var10003, 9, 2);
                  }

                  if(Char.myCharz().aP.C != 0) {
                     mFont.m.drawString(var1, NinjaUtil.a((long)Char.myCharz().aP.k), this.eP / 2, 22, 2);
                  }
               } else if(Char.myCharz().aS != null) {
                  var10003 = this.eP / 2;
                  mFont.m.drawString(var1, Char.myCharz().aS.cW.b, var10003, 9, 2);
                  if(Char.myCharz().aS.cW.a == 4) {
                     mFont.m.drawString(var1, gI().aL.b + "/" + gI().aL.d, this.eP / 2, 22, 2);
                  }
               } else if(Char.myCharz().aT != null) {
                  var10003 = this.eP / 2;
                  mFont.m.drawString(var1, Char.myCharz().aT.cName, var10003, 9, 2);
                  mFont.m.drawString(var1, NinjaUtil.a((long)Char.myCharz().aT.cHP), this.eP / 2, 22, 2);
               } else {
                  var10003 = this.eP / 2;
                  mFont.m.drawString(var1, Char.myCharz().cName, var10003, 9, 2);
                  mFont.m.drawString(var1, NinjaUtil.a(Char.myCharz().cPower), this.eP / 2, 22, 2);
               }
            } else {
               mFont.m.drawString(var1, mResources.bt, this.eP / 2, 8, 2);
            }
         }

         var1.a(-var1.a(), -var1.b());
         if(this.x() && this.eB > 0) {
            this.ez = System.currentTimeMillis();
            if(this.ez - this.eA >= 1000L) {
               this.eA = System.currentTimeMillis();
               --this.eB;
            }

            mFont.c.a(var1, String.valueOf(this.eB), GameCanvas.z / 2, 13, 2, mFont.tahoma_7b_dark);
         }

         if(this.eb) {
            var1.drawImage(ItemMap.imageFlare, 40, 35, 33);
            --this.ec;
            if(this.ec < 0) {
               this.ec = 0;
               this.eb = false;
            }
         }

      }
   }

   public final boolean x() {
      return TileMap.a() && (Char.myCharz().aM != 0 || TileMap.l == 130 && J() != null && this.K() != null);
   }

   private void f(mGraphics var1) {
      int var7;
      if(this.aK != null) {
         mGraphics var24 = var1;
         GameScr var23 = this;
         nr_em.a(var1, Char.myCharz().cx, Char.myCharz().cy);
         var1.a(-var1.a(), -var1.b());
         if(!GameCanvas.menu.a && !GameCanvas.panel.a && ChatPopup.m == null && GameCanvas.isTouch) {
            for(var7 = 0; var7 < var23.bm.length(); ++var7) {
               int var8 = (GameCanvas.z - var23.bm.length() * ek) / 2 + var7 * ek + ek / 2;
               if(var23.bq[var7] == -1) {
                  var24.drawImage(bo, var8, GameCanvas.A - 25, 3);
                  mFont.tahoma_7b_dark.drawString(var24, String.valueOf(var23.bm.charAt(var7)), var8, GameCanvas.A - 30, 2);
               } else {
                  var24.drawImage(bp, var8, GameCanvas.A - 25, 3);
                  mFont.tahoma_7b_green2.drawString(var24, String.valueOf(var23.bm.charAt(var7)), var8, GameCanvas.A - 30, 2);
               }
            }
         }

      } else if(GameCanvas.J == null && ChatPopup.m == null && !GameCanvas.menu.a && !GameCanvas.panel.a && Char.myCharz().taskMaint.taskId != 0 && !nr_cm.b().b && GameCanvas.currentScreen != ClientInput.a) {
         long var4 = System.currentTimeMillis() - this.dO;
         int var2 = 0;
         if(var4 < 10000L) {
            var2 = (int)(var4 * 20L / 10000L);
         }

         if(!GameCanvas.isTouch) {
            var1.drawImage(mScreen.cg == 10?au:at, ex + bx - 1, by - 1, 0);
            SmallImage.drawSmallImage(var1, 542, ex + bx + 3, by + 3, 0, 0);
            mFont.u.drawString(var1, "" + t, ex + bx + 22, by + 15, 1);
            if(var4 < 10000L) {
               var1.a(2721889);
               var2 = (int)(var4 * 20L / 10000L);
               var1.d(ex + bx + 3, by + 3 + var2, 20, 20 - var2);
            }
         } else if(Char.myCharz().statusMe != 14) {
            if(dz.b) {
               if(isAnalog != 1) {
                  var1.a(9670800);
                  var1.d(bx + 9, by + 10, 22, 20);
                  var1.a(16777215);
                  var1.d(bx + 9, by + 10 + (var2 != 0?20 - var2:0), 22, var2 != 0?var2:20);
                  var1.drawImage(mScreen.cg == 10?fd_Image_3:dn, bx, by, 0);
                  mFont.p.drawString(var1, "" + t, bx + 20, by + 15, 2);
               } else if(isAnalog == 1) {
                  var1.drawImage(mScreen.cg == 10?au:at, ex + bx - 1, by - 1, 0);
                  SmallImage.drawSmallImage(var1, 542, ex + bx + 3, by + 3, 0, 0);
                  mFont.u.drawString(var1, "" + t, ex + bx + 22, by + 13, 1);
                  if(var4 < 10000L) {
                     var1.a(2721889);
                     var2 = (int)(var4 * 20L / 10000L);
                     var1.d(ex + bx + 3, by + 3 + var2, 20, 20 - var2);
                  }
               }
            } else if(isAnalog != 1) {
               var1.a(9670800);
               var1.d(bx + 9, by + 10 - 6, 22, 20);
               var1.a(16777215);
               var1.d(bx + 9, by + 10 + (var2 != 0?20 - var2:0) - 6, 22, var2 != 0?var2:20);
               var1.drawImage(mScreen.cg == 10?fd_Image_3:dn, bx, by - 6, 0);
               mFont.p.drawString(var1, "" + t, bx + 20, by + 15 - 6, 2);
            } else {
               var1.a(9670800);
               var1.d(bx + 10, by + 10 - 6, 20, 18);
               var1.a(16777215);
               var1.d(bx + 10, by + 10 + (var2 != 0?20 - var2:0) - 6, 20, var2 != 0?var2:18);
               var1.drawImage(mScreen.cg == 10?dq:dp, bx + 20, by + 20 - 6, 3);
               mFont.p.drawString(var1, "" + t, bx + 20, by + 15 - 6, 2);
            }
         }

         if(N) {
            Skill[] var19 = GameCanvas.isTouch?aP:aO;
            if(!GameCanvas.isTouch) {
               var1.a(11152401);
               var1.d(ex + bx + 2, by - 10 + 6, 20, 10);
               mFont.s.drawString(var1, "*", ex + bx + 12, by - 8 + 6, 2);
            }

            int var3 = GameCanvas.isTouch?this.dY:var19.length;

            for(int var20 = 0; var20 < var3; ++var20) {
               if(!GameCanvas.isTouch) {
                  String[] var5 = TField.isQwerty?new String[]{"Q", "W", "E", "R", "T"}:new String[]{"7", "8", "9", "1", "3"};
                  var1.a(11152401);
                  var1.d(ex + ev[var20] + 2, ew[var20] - 10 + 8, 20, 10);
                  mFont.s.drawString(var1, var5[var20], ex + ev[var20] + 12, ew[var20] - 10 + 6, 2);
               }

               Skill var21;
               if((var21 = var19[var20]) != Char.myCharz().aB) {
                  var1.drawImage(at, ex + ev[var20] - 1, ew[var20] - 1, 0);
               }

               if(var21 != null) {
                  if(var21 == Char.myCharz().aB) {
                     var1.drawImage(au, ex + ev[var20] - 1, ew[var20] - 1, 0);
                     if(GameCanvas.isTouch) {
                        var1.drawRegion(Mob.imgHP, 0, 12, 9, 6, 0, ex + ev[var20] + 8, ew[var20] - 7, 0);
                     }
                  }

                  int var10001 = ex + ev[var20] + 13;
                  var7 = ew[var20] + 13;
                  int var6 = var10001;
                  SmallImage.drawSmallImage(var1, var21.a.f, var6, var7, 0, nr_cf.f);
                  long var17;
                  if((var17 = System.currentTimeMillis() - var21.f) < (long)var21.e) {
                     var1.a(2721889);
                     if(var21.j && GameCanvas.gameTick % 6 > 2) {
                        var1.a(876862);
                     }

                     int var22 = (int)(var17 * 20L / (long)var21.e);
                     var1.d(var6 - 10, var7 - 10 + var22, 20, 20 - var22);
                  } else {
                     var21.j = false;
                  }

                  if(var20 == this.dZ && GameCanvas.gameTick % 10 > 5 || var20 == this.ed) {
                     var1.drawImage(ItemMap.imageFlare, ex + ev[var20] + 13, ew[var20] + 14, 3);
                  }
               }
            }
         }

         if(isAnalog != 0 && Char.myCharz().statusMe != 14) {
            var1.drawImage(mScreen.cg == 5?ds:dr, er + 20, es + 20, 3);
            dz.a(var1);
            var1.drawImage(mScreen.cg == 13?dm:dl, et + 20, eu + 20, 3);
         }

      }
   }

   public static final void a(String var0, int var1, int var2, int var3, int var4, int var5) {
      var3 = -1;

      int var6;
      for(var6 = 0; var6 < 5; ++var6) {
         if(bI[var6] == -1) {
            var3 = var6;
            break;
         }
      }

      if(var3 != -1) {
         bJ[var3] = var5;
         bF[var3] = var0;
         bG[var3] = var1;
         bH[var3] = var2;
         eD[var3] = 0;
         eE[var3] = var4 < 0?-5:5;
         bI[var3] = 0;
         eF[var3] = 0;
         eC[var3] = 10;

         for(var6 = 0; var6 < 5; ++var6) {
            if(bI[var6] != -1 && var3 != var6 && eE[var3] < 0 && Res.g(bG[var3] - bG[var6]) <= 20 && eC[var3] == eC[var6]) {
               eC[var3] += 10;
            }
         }

      }
   }

   public static final boolean a(int var0, int var1, int var2) {
      int var3 = eI[0] == -1?0:1;
      if(eI[var3] != -1) {
         return false;
      } else {
         eI[var3] = 0;
         eK[var3] = var2;
         eG[var3] = var0;
         eH[var3] = var1;
         return true;
      }
   }

   private boolean L() {
      return !GameCanvas.f && GameCanvas.currentScreen == gI()?true:(!GameCanvas.isTouch?true:(nr_cm.b().b?true:(InfoDlg.a?true:GameCanvas.J != null || ChatPopup.m != null || GameCanvas.menu.a || GameCanvas.panel.a)));
   }

   public static void d(int var0, int var1) {
      if(GameCanvas.z == 128 || GameCanvas.A <= 208) {
         var0 = 126;
         var1 = 160;
      }

      bM = var0;
      bN = var1;
      bL = f - var0 / 2;
      bK = ck - var1 / 2;
      if(GameCanvas.isTouch) {
         if(GameCanvas.A <= 240) {
            bK -= 10;
         }

         if(GameCanvas.isTouch && !GameCanvas.g && GameCanvas.currentScreen instanceof GameScr) {
            bM = 310;
            bL = d / 2 - bM / 2;
         }
      }

      if(bK < -10) {
         bK = -10;
      }

      if(GameCanvas.A > 208 && bK < 0) {
         bK = 0;
      }

      if(GameCanvas.A == 208 && bK < 10) {
         bK = 10;
      }

   }

   public static void y() {
      TileMap.e();
   }

   public static int z() {
      int var0;
      if(Char.myCharz().taskMaint == null) {
         var0 = -1;
      } else {
         var0 = ac[Char.myCharz().taskMaint.a];
      }

      return var0;
   }

   public static byte A() {
      byte var0 = 0;
      if(Char.myCharz().taskMaint == null) {
         var0 = -1;
      } else {
         int var10001 = ab.length;
         if(Char.myCharz().taskMaint.a <= var10001 - 1) {
            var0 = (byte)ab[Char.myCharz().taskMaint.a];
         }
      }

      return var0;
   }

   public final void a(String var1, String var2) {
      nr_cm.b().b = false;
      if(var2.equals(mResources.cM)) {
         if(aD.h != Char.myCharz().charID) {
            Service.gI().chatPlayer(var1, aD.h);
         }
      } else if(!var1.equals("")) {
         if(var1.equals("pingABCD")) {
            Service.gI().sendCheckController();
            Service.gI().sendCheckMap();
            bP = !bP;
         }

         if(var1.equals("icon")) {
            Res.b = !Res.b;
         }

         if(var1.equals("big")) {
            Res.c = !Res.c;
         }

         Service.gI().chat(var1);
      }
   }

   public final void D() {}

   public final void a(Message var1) {
      InfoDlg.hide();

      try {
         this.R = new int[var1.reader().readByte()];
         this.S = new int[this.R.length];
         this.T = new int[this.R.length];
         this.U = new int[this.R.length];
         this.V = new int[this.R.length];
         this.X = new String[this.R.length];
         this.W = new int[this.R.length];
         this.Y = new String[this.R.length];

         for(int var2 = 0; var2 < this.R.length; ++var2) {
            this.R[var2] = var1.reader().readByte();
            this.S[var2] = var1.reader().readByte();
            this.T[var2] = var1.reader().readByte();
            this.U[var2] = var1.reader().readByte();
            if(var1.reader().readByte() == 1) {
               this.X[var2] = var1.reader().readUTF();
               this.V[var2] = var1.reader().readInt();
               this.Y[var2] = var1.reader().readUTF();
               this.W[var2] = var1.reader().readInt();
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      GameCanvas.panel.r();
      GameCanvas.panel.show();
   }

   private void a(String var1, Command var2, Command var3) {
      this.bQ = new nr_ds();
      this.bQ.a(var1, var2, var3);
   }

   public final void a(int var1, String var2, byte var3) {
      Char var4;
      if((var4 = findCharInMap(var1)) != null) {
         if(var3 == 3) {
            this.a(var2, new Command(mResources.bo, 2000, var4), new Command(mResources.bf, 2009, var4));
         }

         if(var3 == 4) {
            this.a(var2, new Command(mResources.bo, 2005, var4), new Command(mResources.bf, 2009, var4));
         }
      }

   }

   public final void d(int var1) {
      Char var2;
      if((var2 = findCharInMap(var1)) != null) {
         this.a(var2.cName + mResources.ey, new Command(mResources.bj, 11114, var2), new Command(mResources.bk, 2009, var2));
      }

   }

   public static void a(int var0, byte var1) {
      if(H.size() == 0) {
         Service.gI().getFlag((byte)2, var1);
         Res.out("getFlag1");
      } else {
         int var2;
         nr_ej var3;
         if(var0 == Char.myCharz().charID) {
            Res.out("my cflag: isme");
            Char.myCharz();
            if(Char.a(var1)) {
               Res.out("my cflag: true");

               for(var2 = 0; var2 < H.size(); ++var2) {
                  if((var3 = (nr_ej)H.elementAt(var2)) != null && var3.a == var1) {
                     Res.out("my cflag: cflag==");
                     Char.myCharz().by = var3.b;
                  }
               }

               return;
            }

            Char.myCharz();
            if(!Char.a(var1)) {
               Res.out("my cflag: false");
               Service.gI().getFlag((byte)2, var1);
               return;
            }
         } else {
            Res.out("my cflag: not me");
            if(findCharInMap(var0) != null) {
               findCharInMap(var0);
               if(Char.a(var1)) {
                  Res.out("my cflag: true");

                  for(var2 = 0; var2 < H.size(); ++var2) {
                     if((var3 = (nr_ej)H.elementAt(var2)) != null && var3.a == var1) {
                        Res.out("my cflag: cflag==");
                        findCharInMap(var0).by = var3.b;
                     }
                  }

                  return;
               }

               findCharInMap(var0);
               if(!Char.a(var1)) {
                  Res.out("my cflag: false");
                  Service.gI().getFlag((byte)2, var1);
               }
            }
         }

      }
   }

   public final void actionPerform(int var1, Object var2) {
      Res.out("PERFORM WITH ID = " + var1);
      Skill var4;
      nr_i var5;
      int var9;
      Char var10;
      switch(var1) {
      case 1:
         GameCanvas.g();
         return;
      case 2:
         GameCanvas.menu.a = false;
         return;
      case 2000:
         this.bQ = null;
         if((Char)var2 == null) {
            Service.gI().player_vs_player((byte)1, (byte)3, (int)-1);
            return;
         }

         Service.gI().player_vs_player((byte)1, (byte)3, ((Char)var2).charID);
         Service.gI().g();
         return;
      case 2001:
         GameCanvas.g();
         return;
      case 2003:
         GameCanvas.g();
         InfoDlg.a();
         Service.gI().player_vs_player((byte)0, (byte)3, Char.myCharz().aT.charID);
         return;
      case 2004:
         GameCanvas.g();
         Service.gI().player_vs_player((byte)0, (byte)4, Char.myCharz().aT.charID);
         return;
      case 2005:
         GameCanvas.g();
         this.bQ = null;
         if((Char)var2 == null) {
            Service.gI().player_vs_player((byte)1, (byte)4, (int)-1);
            return;
         }

         Service.gI().player_vs_player((byte)1, (byte)4, ((Char)var2).charID);
         return;
      case 2006:
         GameCanvas.g();
         Service.gI().player_vs_player((byte)2, (byte)4, Char.myCharz().aT.charID);
         return;
      case 2007:
         GameCanvas.g();
         GameMidlet.instance.a();
         return;
      case 2009:
         this.bQ = null;
         return;
      case 8002:
         this.a(false, true);
         GameCanvas.f();
         GameCanvas.e();
         return;
      case 11000:
         GameCanvas.panel.q();
         GameCanvas.panel.show();
         return;
      case 11001:
         Char.myCharz().I();
         return;
      case 11002:
         GameCanvas.panel.A();
         return;
      case 11038:
         MyVector var12;
         (var12 = new MyVector("")).addElement(new Command(mResources.aT[1], 110381));
         var12.addElement(new Command(mResources.aT[2], 110382));
         var12.addElement(new Command(mResources.aT[3], 110383));
         GameCanvas.menu.a(var12);
         return;
      case 11057:
         nr_cw.y.removeAllElements();
         nr_cw.w.removeAllElements();
         Npc var11;
         if((var11 = (Npc)var2).db == 0) {
            Service.gI().confirmMenu((short)var11.cW.a, (byte)GameCanvas.menu.b);
            return;
         }

         if(GameCanvas.menu.b == 0) {
            Service.gI().l(var11.db);
            return;
         }
         break;
      case 11059:
         Skill var13 = aP[this.dZ];
         this.b(var13, false);
         super.cb = null;
         return;
      case 11067:
         if(TileMap.n != 0) {
            Service.gI().f((int)0);
            InfoDlg.a();
            return;
         }

         aC.a(mResources.aR, 0);
         return;
      case 11111:
         if(Char.myCharz().aT == null) {
            return;
         }

         InfoDlg.a();
         if(GameCanvas.panel.Q.size() <= 0) {
            Char.myCharz();
            this.E();
         }

         GameCanvas.panel.a(Char.myCharz().aT);
         GameCanvas.panel.show();
         Service.gI().getPlayerMenu(Char.myCharz().aT.charID);
         Service.gI().w(Char.myCharz().aT.charID);
         return;
      case 11112:
         var10 = (Char)var2;
         Service.gI().friend((byte)1, var10.charID);
         return;
      case 11113:
         if((var10 = (Char)var2) != null) {
            Service.gI().giaodich((byte)0, var10.charID, (byte)-1, (int)-1);
            return;
         }
         break;
      case 11114:
         this.bQ = null;
         if((var10 = (Char)var2) == null) {
            return;
         }

         Service.gI().giaodich((byte)1, var10.charID, (byte)-1, (int)-1);
         return;
      case 11115:
         if(Char.myCharz().aT == null) {
            return;
         }

         InfoDlg.a();
         Service.gI().playerMenuAction(Char.myCharz().aT.charID, (short)Char.myCharz().aT.M);
         return;
      case 11120:
         Object[] var7;
         Skill var8 = (Skill)(var7 = (Object[])var2)[0];
         var1 = Integer.parseInt((String)var7[1]);

         for(var9 = 0; var9 < aP.length; ++var9) {
            if(aP[var9] == var8) {
               aP[var9] = null;
            }
         }

         aP[var1] = var8;
         B();
         return;
      case 11121:
         Object[] var3;
         var4 = (Skill)(var3 = (Object[])var2)[0];
         int var6 = Integer.parseInt((String)var3[1]);

         for(var9 = 0; var9 < aO.length; ++var9) {
            if(aO[var9] == var4) {
               aO[var9] = null;
            }
         }

         aO[var6] = var4;
         C();
         return;
      case 12000:
         Service.gI().getClan((byte)1, (byte)-1, (String)null);
         return;
      case 12001:
         GameCanvas.g();
         return;
      case 12002:
         GameCanvas.g();
         var5 = (nr_i)var2;
         Service.gI().clanInvite((byte)1, (int)-1, var5.a, var5.b);
         this.bQ = null;
         return;
      case 12003:
         var5 = (nr_i)var2;
         GameCanvas.g();
         Service.gI().clanInvite((byte)2, (int)-1, var5.a, var5.b);
         this.bQ = null;
         return;
      case 12004:
         var4 = (Skill)var2;
         this.b(var4, true);
         Char.myCharz();
         return;
      case 12005:
         if(GameCanvas.ag == null) {
            GameCanvas.ag = new nr_eo();
         }

         GameCanvas.ag.b();
         GameCanvas.g();
         return;
      case 12006:
         Main.a(false);
         GameCanvas.g();
         break;
      case 110001:
         GameCanvas.panel.q();
         GameCanvas.panel.show();
         return;
      case 110004:
         GameCanvas.menu.a = false;
         return;
      case 110382:
         Service.gI().j();
         return;
      case 110383:
         Service.gI().k();
         return;
      case 110391:
         Service.gI().clanInvite((byte)0, Char.myCharz().aT.charID, (int)-1, (int)-1);
         return;
      case 888351:
         Service.gI().h((byte)5);
         GameCanvas.g();
         return;
      }

   }

   public final void b(String var1, String var2) {
      var1 = var1;
      this.eW = new int[var1.length()];
      this.eX = new int[var1.length()];
      this.eY = new int[var1.length()];
      this.eZ = new int[var1.length()];
      this.fa = new int[var1.length()];

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         this.eW[var3] = Short.parseShort(var1.substring(var3, var3 + 1));
         this.eX[var3] = Res.b(0, 11);
         this.eY[var3] = 1;
         this.fa[var3] = 0;
      }

      this.fd = 100;
      this.fb = 0;
      this.fc = var2;
      eg = eh = Main.c();
   }

   public final void a(String var1) {
      if(!this.fg) {
         this.ff = mFont.e.a(var1);
         this.fe = GameCanvas.z;
         this.fg = true;
      }

      if(var1.startsWith("!")) {
         var1 = var1.substring(1, var1.length());
         this.bR = true;
      }

      eV.addElement(var1);
   }

   public final void b(String var1) {
      this.fh = var1;
      this.fi = mFont.k.a(this.fh, 500);
   }

   private static boolean M() {
      return TileMap.c() && bZ.a == 0;
   }

   private static void a(mGraphics var0, int var1, int var2, int var3) {
      if(bZ != null) {
         if(!a && bn == 1 && !GameCanvas.panel.a && M()) {
            if(var3 < fl.a + (fk.a << 2)) {
               var3 = fl.a + (fk.a << 2);
            }

            if(var1 > GameCanvas.z - var3 / 2) {
               var1 = GameCanvas.z - var3 / 2;
            }

            if(var1 < mGraphics.getImageWidth(fo) + var3 / 2 + 10) {
               var1 = mGraphics.getImageWidth(fo) + var3 / 2 + 10;
            }

            var2 = fk.b;
            int var4 = var2 + 0 + mGraphics.getImageHeight(fn) / 2 + 2;
            int var5 = fl.a;
            int var6 = var3 / 2 - var5 / 2;
            var3 = var1 - var3 / 2;
            int var7 = var1 + var5 / 2;
            int var8;
            int var9 = (var8 = var6 - fk.a) / fk.a;
            if(var8 % fk.a > 0) {
               ++var9;
            }

            for(int var10 = 0; var10 < var9; ++var10) {
               if(var10 < var9 - 1) {
                  fk.a(1, var3 + fk.a + var10 * fk.a, 3, 0, 0, var0);
               } else {
                  fk.a(1, var3 + var8, 3, 0, 0, var0);
               }

               if(var10 < var9 - 1) {
                  fk.a(1, var7 + var10 * fk.a, 3, 0, 0, var0);
               } else {
                  fk.a(1, var7 + var8 - fk.a, 3, 0, 0, var0);
               }
            }

            fk.a(0, var3, 3, 2, 0, var0);
            fk.a(0, var7 + var8, 3, 0, 0, var0);
            byte var11;
            int var12;
            byte var13;
            if(bZ.c > 0) {
               var13 = 2;
               var11 = 3;
               if(bZ.e == 4) {
                  var13 = 4;
                  var11 = 5;
               }

               if((var12 = bZ.c * var6 / bZ.b) < 0) {
                  var12 = 0;
               }

               if(var12 > var6) {
                  var12 = var6;
               }

               var0.e(var3 + var6 - var12, 3, var12, var2);

               for(var12 = 0; var12 < var9; ++var12) {
                  if(var12 < var9 - 1) {
                     fk.a(var11, var3 + fk.a + var12 * fk.a, 3, 0, 0, var0);
                  } else {
                     fk.a(var11, var3 + var8, 3, 0, 0, var0);
                  }
               }

               fk.a(var13, var3, 3, 2, 0, var0);
               GameCanvas.a(var0);
            }

            if(bZ.d > 0) {
               var13 = 2;
               var11 = 3;
               if(bZ.f == 4) {
                  var13 = 4;
                  var11 = 5;
               }

               if((var12 = bZ.d * var6 / bZ.b) < 0) {
                  var12 = 0;
               }

               if(var12 > var6) {
                  var12 = var6;
               }

               var0.e(var7, 3, var12, var2);

               for(var12 = 0; var12 < var9; ++var12) {
                  if(var12 < var9 - 1) {
                     fk.a(var11, var7 + var12 * fk.a, 3, 0, 0, var0);
                  } else {
                     fk.a(var11, var7 + var8 - fk.a, 3, 0, 0, var0);
                  }
               }

               fk.a(var13, var7 + var8, 3, 0, 0, var0);
               GameCanvas.a(var0);
            }

            fl.a(0, var1 - var5 / 2, 0, 0, 0, var0);
            String var14 = Main.a(bZ.n, bZ.m, true, false);
            mFont.d.drawString(var0, var14, var1 + 1, 0 + fl.b / 2 - mFont.tahoma_7b_green2.a() / 2, 2);
            Panel.b(bZ.e, 1).b(var0, bZ.j, var1 - 5, var4 + 5, 1, mFont.tahoma_7b_dark);
            Panel.b(bZ.f, 1).b(var0, bZ.k, var1 + 5, var4 + 5, 0, mFont.tahoma_7b_dark);
            if(bZ.a != 0) {
               int var15 = 0 + var2 / 2 - 2;
               mFont.w.drawString(var0, "" + bZ.c, var3 + var6 / 2, var15, 2);
               mFont.w.drawString(var0, "" + bZ.d, var7 + var6 / 2, var15, 2);
            }

            var0.drawImage(fm, var1, 0 + fl.b + 2, 3);
            if(bZ.a == 0) {
               a(var0, bZ.g, bZ.h, var1 - 13, bZ.i, var1 + 13, var4);
            }
         }

      }
   }

   private static void a(mGraphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(fn != null) {
         int var7 = mGraphics.getImageHeight(fn) / 2;

         int var8;
         byte var9;
         for(var8 = 0; var8 < var1; ++var8) {
            var9 = 0;
            if(var8 < var2) {
               var9 = 1;
            }

            var0.drawRegion(fn, 0, var9 * var7, mGraphics.getImageWidth(fn), var7, 0, var3 - var8 * (var7 + 1), var6, 3);
         }

         for(var8 = 0; var8 < var1; ++var8) {
            var9 = 0;
            if(var8 < var4) {
               var9 = 1;
            }

            var0.drawRegion(fn, 0, var9 * var7, mGraphics.getImageWidth(fn), var7, 0, var5 + var8 * (var7 + 1), var6, 3);
         }
      }

   }

   public static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      nr_cd var6;
      if((var6 = new nr_cd(var0, var1, var2, var3, var4, 0)).a == 0) {
         nr_db.a(var6);
      } else if(var6.a == 1) {
         nr_db.b(var6);
      } else {
         nr_db.c(var6);
      }
   }
}
