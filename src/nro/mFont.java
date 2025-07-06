package nro;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.nr_ac;
import nro.MyVector;
import nro.mGraphics;
import nro.Main;

public final class mFont {
    public static int LEFT = 0;
    private int K;
    private int L;
    private Image M;
    private String N;
    private int[][] O;
    private static String P = " 0123456789+-*=\'_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
    public static mFont a = new mFont(P, "/myfont/tahoma_7b_red.png", "/myfont/tahoma_7b", 0);
    public static mFont b = new mFont(P, "/myfont/tahoma_7b_blue.png", "/myfont/tahoma_7b", 0);
    public static mFont c = new mFont(P, "/myfont/tahoma_7b_white.png", "/myfont/tahoma_7b", 0);
    public static mFont d = new mFont(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
    public static mFont e = new mFont(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
    public static mFont tahoma_7b_dark = new mFont(P, "/myfont/tahoma_7b_brown.png", "/myfont/tahoma_7b", 0);
    public static mFont tahoma_7b_green2 = new mFont(P, "/myfont/tahoma_7b_green2.png", "/myfont/tahoma_7b", 0);
    public static mFont h = new mFont(P, "/myfont/tahoma_7b_green.png", "/myfont/tahoma_7b", 0);
    public static mFont i = new mFont(P, "/myfont/tahoma_7b_focus.png", "/myfont/tahoma_7b", 0);
    public static mFont j = new mFont(P, "/myfont/tahoma_7b_unfocus.png", "/myfont/tahoma_7b", 0);
    public static mFont k = new mFont(P, "/myfont/tahoma_7.png", "/myfont/tahoma_7", 0);
    public static mFont l = new mFont(P, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0);
    public static mFont m = new mFont(P, "/myfont/tahoma_7_green2.png", "/myfont/tahoma_7", 0);
    public static mFont n = new mFont(P, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0);
    public static mFont o = new mFont(P, "/myfont/tahoma_7_grey.png", "/myfont/tahoma_7", 0);
    public static mFont p = new mFont(P, "/myfont/tahoma_7_red.png", "/myfont/tahoma_7", 0);
    public static mFont q = new mFont(P, "/myfont/tahoma_7_blue.png", "/myfont/tahoma_7", 0);
    public static mFont r = new mFont(P, "/myfont/tahoma_7_green.png", "/myfont/tahoma_7", 0);
    public static mFont s = new mFont(P, "/myfont/tahoma_7_white.png", "/myfont/tahoma_7", 0);
    public static mFont t = new mFont(P, "/myfont/tahoma_8b.png", "/myfont/tahoma_8b", -1);
    private static mFont Q = new mFont(" 0123456789+-", "/myfont/number_yellow.png", "/myfont/number", 0);
    private static mFont R = new mFont(" 0123456789+-", "/myfont/number_red.png", "/myfont/number", 0);
    private static mFont S = new mFont(" 0123456789+-", "/myfont/number_green.png", "/myfont/number", 0);
    public static mFont u = new mFont(" 0123456789+-", "/myfont/number_gray.png", "/myfont/number", 0);
    private static mFont T = new mFont(" 0123456789+-", "/myfont/number_orange.png", "/myfont/number", 0);
    public static mFont v = R;
    public static mFont w = c;
    public static mFont x = Q;
    public static mFont y = S;
    public static mFont z = T;
    public static mFont A = l;
    public static mFont B = p;
    public static mFont C = n;
    public static mFont D = r;
    public static mFont E = o;
    public static mFont F = n;
    public static mFont G = tahoma_7b_green2;
    public static mFont H = s;
    public static mFont I = h;
    public static mFont J = l;
    private String U;
    private int height;

    private mFont(String var1, String var2, String var3, int var4) {
        try {
            this.N = var1;
            this.K = var4;
            this.U = var2;
            var1 = null;
            this.M = Main.loadImage(this.U);

            try {
                DataInputStream var9 = new DataInputStream(nr_ac.a(var3));
                this.O = new int[var9.readShort()][];

                for (int var10 = 0; var10 < this.O.length; ++var10) {
                    this.O[var10] = new int[4];
                    this.O[var10][0] = var9.readShort();
                    this.O[var10][1] = var9.readShort();
                    this.O[var10][2] = var9.readShort();
                    this.O[var10][3] = var9.readShort();
                    int var5 = this.O[var10][3];
                    this.L = var5;
                }

            } catch (Exception var7) {
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            System.out.println("paht data:" + var2);
        }
    }
    public int getHeight() {
    if (mGraphics.zoomLevel == 1) {
        return height;
    }

    if (height > 0) {
        return height / mGraphics.zoomLevel;
    }

   
        height = 20;

    return height / mGraphics.zoomLevel;
}


    public final int a() {
        return this.L;
    }

    public final int a(String var1) {
        int var3 = 0;

        for (int var4 = 0; var4 < var1.length(); ++var4) {
            int var2;
            if ((var2 = this.N.indexOf(var1.charAt(var4))) == -1) {
                var2 = 0;
            }

            var3 += this.O[var2][2] + this.K;
        }

        return var3;
    }

    public final void drawString(mGraphics var1, String var2, int var3, int var4, int var5) {
        int var6 = var2.length();
        if (var5 == 0) {
            var5 = var3;
        } else if (var5 == 1) {
            var5 = var3 - this.a(var2);
        } else {
            var5 = var3 - (this.a(var2) >> 1);
        }

        for (int var7 = 0; var7 < var6; ++var7) {
            if ((var3 = this.N.indexOf(var2.charAt(var7))) == -1) {
                var3 = 0;
            }

            if (var3 >= 0) {
                var1.drawRegion(this.M, this.O[var3][0], this.O[var3][1], this.O[var3][2], this.O[var3][3], 0, var5, var4, 20);
            }

            var5 += this.O[var3][2] + this.K;
        }

    }

    public final void a(mGraphics var1, String var2, int var3, int var4, int var5, mFont var6) {
        int var7 = var2.length();
        if (var5 == 0) {
            var5 = var3;
        } else if (var5 == 1) {
            var5 = var3 - this.a(var2);
        } else {
            var5 = var3 - (this.a(var2) >> 1);
        }

        for (int var8 = 0; var8 < var7; ++var8) {
            if ((var3 = this.N.indexOf(var2.charAt(var8))) == -1) {
                var3 = 0;
            }

            if (var3 >= 0) {
                if (!GameCanvas.lowGraphic) {
                    var1.drawRegion(var6.M, this.O[var3][0], this.O[var3][1], this.O[var3][2], this.O[var3][3], 0, var5 + 1, var4, 20);
                    var1.drawRegion(var6.M, this.O[var3][0], this.O[var3][1], this.O[var3][2], this.O[var3][3], 0, var5, var4 + 1, 20);
                }

                var1.drawRegion(this.M, this.O[var3][0], this.O[var3][1], this.O[var3][2], this.O[var3][3], 0, var5, var4, 20);
            }

            var5 += this.O[var3][2] + this.K;
        }

    }

    public final String[] a(String var1, int var2) {
        int var3 = var2;
        String var10 = var1;
        mFont var8 = this;
        MyVector var4 = new MyVector("vLine");
        String var5 = "";

        for (int var6 = 0; var6 < var10.length(); ++var6) {
            if (var10.charAt(var6) != 10 && var10.charAt(var6) != 8) {
                var5 = var5 + var10.charAt(var6);
                if (var8.a(var5) > var3) {
                    int var7;
                    for (var7 = var5.length() - 1; var7 >= 0 && var5.charAt(var7) != 32; --var7) {
                        ;
                    }

                    if (var7 < 0) {
                        var7 = var5.length() - 1;
                    }

                    var4.addElement(var5.substring(0, var7));
                    var6 = var6 - (var5.length() - var7) + 1;
                    var5 = "";
                }

                if (var6 == var10.length() - 1 && !var5.trim().equals("")) {
                    var4.addElement(var5);
                }
            } else {
                var4.addElement(var5);
                var5 = "";
            }
        }

        MyVector var9 = var4;
        String[] var11 = new String[var4.size()];

        for (var3 = 0; var3 < var9.size(); ++var3) {
            var11[var3] = var9.elementAt(var3).toString();
        }

        return var11;
    }

    public final void b(mGraphics var1, String var2, int var3, int var4, int var5) {
        this.drawString(var1, var2, var3, var4, 2);
    }

    public final void b(mGraphics var1, String var2, int var3, int var4, int var5, mFont var6) {
        this.a(var1, var2, var3, var4, var5, var6);
    }
}
