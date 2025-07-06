package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;

public final class Command {

    public String caption;
    public String[] subCaption;
    public IActionListener actionListener;
    public int idAction;
    public boolean isPlaySoundButton = true;
    public Image img;
    public Image imgFocus;
    public int x = 0;
    public int y = 0;
    public int w;
    public int h;
    private int hw;
    public boolean isFocus;
    public Object p;
    private int type;
    public String caption2;
    private static Image btn0left = Main.loadImage("/mainImage/btn0left.png");
    private static Image btn0mid = Main.loadImage("/mainImage/btn0mid.png");
    private static Image btn0right = Main.loadImage("/mainImage/btn0right.png");
    private static Image btn1left = Main.loadImage("/mainImage/btn1left.png");
    private static Image btn1mid = Main.loadImage("/mainImage/btn1mid.png");
    private static Image btn1right = Main.loadImage("/mainImage/btn1right.png");
    public boolean cmdClosePanel;

    public Command(String caption, IActionListener IActionListener, int action, Object p, int x, int y) {
        this.w = mScreen.cmdW;
        this.h = mScreen.cmdH;
        this.isFocus = false;
        this.caption2 = "";
        this.caption = caption;
        this.idAction = action;
        this.actionListener = IActionListener;
        this.p = null;
        this.x = x;
        this.y = y;
    }

    public Command(String var1, IActionListener var2, int var3, Object var4) {
        this.w = mScreen.cmdW;
        this.h = mScreen.cmdH;
        this.isFocus = false;
        this.caption2 = "";
        this.caption = var1;
        this.idAction = var3;
        this.actionListener = var2;
        this.p = var4;
    }

    public Command(String var1, int var2, Object var3) {
        this.w = mScreen.cmdW;
        this.h = mScreen.cmdH;
        this.isFocus = false;
        this.caption2 = "";
        this.caption = var1;
        this.idAction = var2;
        this.p = var3;
    }

    public Command(String var1, int var2) {
        this.w = mScreen.cmdW;
        this.h = mScreen.cmdH;
        this.isFocus = false;
        this.caption2 = "";
        this.caption = var1;
        this.idAction = var2;
    }

    public Command(String var1, int var2, int var3, int var4) {
        this.w = mScreen.cmdW;
        this.h = mScreen.cmdH;
        this.isFocus = false;
        this.caption2 = "";
        this.caption = var1;
        this.idAction = 0;
        this.x = var3;
        this.y = var4;
    }

    public final void performAction() {
        GameCanvas.clearAllPointerEvent();
        if (this.isPlaySoundButton && (this.caption != null && !this.caption.equals("") && !this.caption.equals(mResources.cA) || this.img != null)) {
            SoundMn.gI();
        }

        if (this.idAction > 0) {
            if (this.actionListener != null) {
                this.actionListener.perform(this.idAction, this.p);
                return;
            }
            GameScr.gI().actionPerform(this.idAction, this.p);
        }

    }

    public final void setType() {
        this.type = 1;
        this.w = 160;
        this.hw = 80;
    }

    public final void paint(mGraphics g) {
        if (this.img != null) {
            g.drawImage(this.img, this.x, this.y, 0);
            if (this.isFocus) {
                if (this.imgFocus == null) {
                    if (this.cmdClosePanel) {
                        g.drawImage(ItemMap.imageFlare, this.x + 8, this.y + 8, 3);
                    } else {
                        g.drawImage(ItemMap.imageFlare, this.x - (this.img.equals(GameScr.imgMenu) ? 10 : 0), this.y, 0);
                    }
                } else {
                    g.drawImage(this.imgFocus, this.x, this.y, 0);
                }
            }

            if (this.caption != null && !this.caption.equals("menu")) {
                if (!this.isFocus) {
                    mFont.tahoma_7b_dark.drawString(g, this.caption, this.x + mGraphics.getImageWidth(this.img) / 2, this.y + mGraphics.getImageHeight(this.img) / 2 - 5, 2);
                    return;
                }
                mFont.tahoma_7b_green2.drawString(g, this.caption, this.x + mGraphics.getImageWidth(this.img) / 2, this.y + mGraphics.getImageHeight(this.img) / 2 - 5, 2);
            }

        } else {
            if (this.caption != null && this.caption.length() > 0) {
                if (this.type == 1) {
                    if (!this.isFocus) {
                        paintOngMau(btn0left, btn0mid, btn0right, this.x, this.y, 160, g);
                    } else {
                        paintOngMau(btn1left, btn1mid, btn1right, this.x, this.y, 160, g);
                    }
                } else if (!this.isFocus) {
                    paintOngMau(btn0left, btn0mid, btn0right, this.x, this.y, 76, g);
                } else {
                    paintOngMau(btn1left, btn1mid, btn1right, this.x, this.y, 76, g);
                }
            }

            int num;
            if (this.type == 1) {
                num = this.x + this.hw;
            } else {
                num = this.x + 38;
            }

            if (!this.isFocus) {
                mFont.tahoma_7b_dark.drawString(g, this.caption, num, this.y + 7, 2);
            } else {
                mFont.tahoma_7b_green2.drawString(g, this.caption, num, this.y + 7, 2);
            }
        }
    }

    private static void paintOngMau(Image img0, Image img1, Image img2, int x, int y, int size, mGraphics g) {
        for (int i = 10; i <= size - 20; i += 10) {
            g.drawImage(img1, x + i, y, 0);
        }
        int num = size % 10;
        if (num > 0) {
            g.drawRegion(img1, 0, 0, num, 24, 0, x + size - 10 - num, y, 0);
        }

        g.drawImage(img0, x, y, 0);
        g.drawImage(img2, x + size - 10, y, 0);
    }

    public final boolean isPointerPressInside() {
        this.isFocus = false;
        if (GameCanvas.a(this.x, this.y, this.w, this.h)) {
            if (GameCanvas.k) {
                this.isFocus = true;
            }

            if (GameCanvas.m && GameCanvas.l) {
                return true;
            }
        }

        return false;
    }
}
