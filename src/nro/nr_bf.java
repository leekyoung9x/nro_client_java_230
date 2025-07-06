package nro;

import main.GameCanvas;
import nro.Char;
import nro.nr_ag;
import nro.SmallImage;
import nro.nr_bm;
import nro.SoundMn;
import nro.nr_bu;
import nro.nr_ce;
import nro.Res;
import nro.nr_dq;
import nro.MyVector;
import nro.mGraphics;
import nro.GameScr;

public final class nr_bf {

    private Char b;
    private nr_bu c;
    private MyVector d = new MyVector("vDARTS");
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = 0;
    private int m = 0;
    private boolean n = false;
    private boolean o = true;
    public nr_ce a;

    public nr_bf(Char var1, int var2, nr_ce var3, int var4, int var5) {
        this.a = var3;
        this.b = var1;
        this.c = GameScr.w[var2];
        this.h = this.c.i;
        this.i = var4;
        this.j = var5;
        nr_bm var6;
        if (var1.aP == null) {
            var6 = var1.aT;
        } else {
            var6 = var1.aP;
        }
        var2 = Res.a(((nr_bm) var6).getX() - var4, ((nr_bm) var6).getY() - var5);
        this.e = var2;
        this.f = this.h * Res.b(var2) >> 10;
        this.g = this.h * Res.a(var2) >> 10;
    }

    public final void a() {
        if (this.o) {
            if (this.b.aP == null && this.b.aT == null) {
                this.b();
            } else {
                nr_bm var1;
                if(this.b.aP == null) {
                    var1 = this.b.aT;
                }
                else {
                    var1 = this.b.aP;
                }
                int var2;
                for (var2 = 0; var2 < this.c.h; ++var2) {
                    if (this.c.c.length > 0) {
                        this.d.addElement(new nr_dq(this.i, this.j));
                    }

                    int var3 = this.b.getX() > ((nr_bm) var1).getX() ? 10 : -10;
                    this.l = ((nr_bm) var1).getX() + var3 - this.i;
                    this.m = ((nr_bm) var1).getY() - ((nr_bm) var1).getH() / 2 - this.j;
                    ++this.k;
                    if (Res.g(this.l) < 20 && Res.g(this.m) < 20) {
                        if (this.b.aT != null && this.b.aT.me) {
                            this.b.aT.doInjure(this.b.aT.ac, 0, this.b.aT.ae, this.b.aT.ad);
                        }

                        this.b();
                        return;
                    }

                    if (Math.abs((var3 = Res.a(this.l, this.m)) - this.e) < 90 || this.l * this.l + this.m * this.m > 4096) {
                        if (Math.abs(var3 - this.e) < 15) {
                            this.e = var3;
                        } else if ((var3 - this.e < 0 || var3 - this.e >= 180) && var3 - this.e >= -180) {
                            this.e = Res.c(this.e - 15);
                        } else {
                            this.e = Res.c(this.e + 15);
                        }
                    }

                    if (this.h < 8192) {
                        this.h += 1024;
                    }

                    this.f = this.h * Res.b(this.e) >> 10;
                    this.g = this.h * Res.a(this.e) >> 10;
                    this.l += this.f;
                    var3 = this.l >> 10;
                    this.i += var3;
                    this.l &= 1023;
                    this.m += this.g;
                    var3 = this.m >> 10;
                    this.j += var3;
                    this.m &= 1023;
                }

                for (var2 = 0; var2 < this.d.size(); ++var2) {
                    nr_dq var4;
                    ++(var4 = (nr_dq) this.d.elementAt(var2)).a;
                    if (var4.a >= this.c.c.length) {
                        this.d.removeElementAt(var2);
                    }
                }

            }
        }
    }

    private void b() {
        Res.out("END ME!");
        if (!this.b.cf && this.i >= GameScr.j && this.i <= GameScr.j + GameCanvas.z) {
            SoundMn.gI();
        }

        this.b.D();
        if (this.b.cf) {
            this.b.cf = false;
            if (this.b.bI && this.b.me && this.b.statusMe != 14 && this.b.statusMe != 5) {
                this.b.bI = false;
            }

            GameScr.gI().b(this.i, this.j);
        }

        this.b.cb = null;
        this.b.cc = false;
        this.b.cd = null;
        this.b.ce = null;
    }

    public final void a(mGraphics var1) {
        if (this.o) {
            int var2 = nr_ag.a(360 - this.e);
            byte var3 = nr_ag.c[var2];
            var2 = nr_ag.b[var2];

            int var4;
            for (var4 = this.d.size() / 2; var4 < this.d.size(); ++var4) {
                nr_dq var5 = (nr_dq) this.d.elementAt(var4);
                SmallImage.drawSmallImage(var1, this.c.d[var5.a], var5.b, var5.c, 0, 3);
            }

            var4 = GameCanvas.gameTick % this.c.b.length;
            SmallImage.drawSmallImage(var1, this.c.b[var4][var3], this.i, this.j, var2, 3);

            nr_dq var6;
            int var7;
            for (var7 = 0; var7 < this.d.size(); ++var7) {
                var6 = (nr_dq) this.d.elementAt(var7);
                SmallImage.drawSmallImage(var1, this.c.c[var6.a], var6.b, var6.c, 0, 3);
            }

            SmallImage.drawSmallImage(var1, this.c.a[var4][var3], this.i, this.j, var2, 3);

            for (var7 = 0; var7 < this.d.size(); ++var7) {
                var6 = (nr_dq) this.d.elementAt(var7);
                if (Res.g(nr_ag.a.nextInt(100)) < this.c.g) {
                    SmallImage.drawSmallImage(var1, GameCanvas.gameTick % 2 == 0 ? this.c.e[var6.a] : this.c.f[var6.a], var6.b, var6.c, 0, 3);
                }
            }

            var1.a(16711680);
        }
    }
}
