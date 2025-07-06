package main;

import nro.*;

public final class GamePad
{
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    public int a;
    private int u;
    private boolean v;
    public boolean b;
    public boolean c;
    public boolean d;
    
    public GamePad() {
        this.v = false;
        this.k = 28;
        if (GameCanvas.z < 300) {
            this.b = true;
            this.c = false;
            this.d = false;
        }
        if (GameCanvas.z >= 300 && GameCanvas.z <= 380) {
            this.b = false;
            this.c = true;
            this.d = false;
        }
        if (GameCanvas.z > 380) {
            this.b = false;
            this.c = false;
            this.d = true;
        }
        if (!this.d) {
            this.s = 0;
            this.a = GameCanvas.B;
            this.t = GameCanvas.C >> 1;
            this.u = GameCanvas.A - 80;
            return;
        }
        this.s = 0;
        this.a = GameCanvas.B / 4 * 3 - 20;
        this.t = GameCanvas.C >> 1;
        this.u = GameCanvas.A;
    }
    
    public final void a() {
        try {
            if (GameScr.isAnalog == 0) {
                return;
            }
            if (!GameCanvas.k || GameCanvas.m) {
                final int n = 45;
                this.e = n;
                this.g = n;
                if (!this.d) {
                    final int n2 = GameCanvas.A - 90;
                    this.f = n2;
                    this.h = n2;
                }
                else {
                    final int n3 = GameCanvas.A - 45;
                    this.f = n3;
                    this.h = n3;
                }
                this.v = false;
                GameCanvas.f();
                return;
            }
            this.m = GameCanvas.q;
            this.n = GameCanvas.r;
            if (this.m >= 0 && this.m <= this.a && this.n >= this.t && this.n <= this.u) {
                if (!this.v) {
                    final int m = this.m;
                    this.g = m;
                    this.e = m;
                    final int n4 = this.n;
                    this.h = n4;
                    this.f = n4;
                }
                this.v = true;
                this.o = GameCanvas.o - this.e;
                this.p = GameCanvas.p - this.f;
                this.q = Res.c(this.o, 2) + Res.c(this.p, 2);
                this.l = Res.f(this.q);
                if (Res.g(this.o) > 4 || Res.g(this.p) > 4) {
                    this.r = Res.a(this.o, this.p);
                    if (!GameCanvas.a(this.e - this.k, this.f - this.k, 2 * this.k, 2 * this.k)) {
                        if (this.l != 0) {
                            this.h = this.p * this.k / this.l;
                            this.g = this.o * this.k / this.l;
                            this.g += this.e;
                            this.h += this.f;
                            if (!Res.a(this.e - this.k, this.f - this.k, 2 * this.k, 2 * this.k, this.g, this.h)) {
                                this.g = this.i;
                                this.h = this.j;
                            }
                            else {
                                this.i = this.g;
                                this.j = this.h;
                            }
                        }
                        else {
                            this.g = this.i;
                            this.h = this.j;
                        }
                    }
                    else {
                        this.g = GameCanvas.o;
                        this.h = GameCanvas.p;
                    }
                    GameCanvas.f();
                    boolean b = false;
                    Label_0526: {
                        if (GameScr.isAnalog == 0) {
                            b = false;
                        }
                        else if (Char.myCharz().statusMe == 3) {
                            b = true;
                        }
                        else {
                            for (int i = 2; i > 0; --i) {
                                final int n5 = GameCanvas.u[i].a - GameCanvas.u[i - 1].a;
                                final int n6 = GameCanvas.u[i].b - GameCanvas.u[i - 1].b;
                                if (Res.g(n5) > 2 && Res.g(n6) > 2) {
                                    b = false;
                                    break Label_0526;
                                }
                            }
                            b = true;
                        }
                    }
                    if (!b) {
                        GameCanvas.f();
                        return;
                    }
                    if ((this.r <= 360 && this.r >= 340) || (this.r >= 0 && this.r <= 20)) {
                        GameCanvas.j[6] = true;
                        GameCanvas.i[6] = true;
                        return;
                    }
                    if (this.r > 40 && this.r < 70) {
                        GameCanvas.j[6] = true;
                        GameCanvas.i[6] = true;
                        return;
                    }
                    if (this.r >= 70 && this.r <= 110) {
                        GameCanvas.j[8] = true;
                        GameCanvas.i[8] = true;
                        return;
                    }
                    if (this.r > 110 && this.r < 120) {
                        GameCanvas.j[4] = true;
                        GameCanvas.i[4] = true;
                        return;
                    }
                    if (this.r >= 120 && this.r <= 200) {
                        GameCanvas.j[4] = true;
                        GameCanvas.i[4] = true;
                        return;
                    }
                    if (this.r > 200 && this.r < 250) {
                        GameCanvas.j[2] = true;
                        GameCanvas.i[2] = true;
                        GameCanvas.j[4] = true;
                        GameCanvas.i[4] = true;
                        return;
                    }
                    if (this.r >= 250 && this.r <= 290) {
                        GameCanvas.j[2] = true;
                        GameCanvas.i[2] = true;
                        return;
                    }
                    if (this.r > 290 && this.r < 340) {
                        GameCanvas.j[2] = true;
                        GameCanvas.i[2] = true;
                        GameCanvas.j[6] = true;
                        GameCanvas.i[6] = true;
                    }
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public final void a(final mGraphics nr_eh) {
        if (GameScr.isAnalog == 0) {
            return;
        }
        nr_eh.drawImage(GameScr.az, this.e, this.f, 3);
        nr_eh.drawImage(GameScr.aA, this.g, this.h, 3);
    }
    
    public final boolean b() {
        return GameScr.isAnalog != 0 && this.v;
    }
    
    public final boolean c() {
        try {
            return GameScr.isAnalog != 0 && ((GameCanvas.o >= 0 && GameCanvas.o <= this.a && GameCanvas.p >= this.t && GameCanvas.p <= this.u) || GameCanvas.o >= GameCanvas.z - 50);
        }
        catch (Exception ex) {
            return false;
        }
    }
}
