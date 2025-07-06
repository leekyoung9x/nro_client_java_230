package nro;

import javax.microedition.lcdui.Image;
import main.GameCanvas;
import nro.Mob;
import nro.Char;
import nro.ServerEffect;
import nro.SmallImage;
import nro.nr_bm;
import nro.TileMap;
import nro.ItemTemplate;
import nro.ItemTemplates;
import nro.Res;
import nro.mGraphics;
import nro.Main;
import nro.GameScr;

public final class ItemMap implements nr_bm {

    public int x;
    public int y;
    private int xEnd;
    private int yEnd;
    private int vx;
    private int vy;
    public int playerId;
    public int itemMapID;
    public ItemTemplate template;
    private byte status;
    private int r0;
    private int x0;
    private int y0;
    private int angle;
    private int iAngle;
    private int iDot;
    private int[] xArg;
    private int[] yArg;
    private int[] xDot;
    private int[] yDot;
    private int count;
    private int countAura;
    public static Image imageFlare = Main.loadImage("/mainImage/myTexture2dflare.png");
    private static Image imageAuraItem1 = Main.loadImage("/mainImage/myTexture2ditemaura1.png");
    private static Image imageAuraItem2 = Main.loadImage("/mainImage/myTexture2ditemaura2.png");
    private static Image imageAuraItem3 = Main.loadImage("/mainImage/myTexture2ditemaura3.png");

    public ItemMap(short itemMapID, short itemTemplateID, int x, int y, int xEnd, int yEnd) {
        this.itemMapID = itemMapID;
        this.template = ItemTemplates.get(itemTemplateID);
        this.x = xEnd;
        this.y = y;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.vx = xEnd - x >> 2;
        this.vy = 5;
    }

    public ItemMap(int var1, short var2, short var3, int var4, int var5, short var6) {
        this.itemMapID = var2;
        this.template = ItemTemplates.get(var3);
        this.x = this.xEnd = var4;
        this.y = this.yEnd = var5;
        this.status = 1;
        this.playerId = var1;
        if (this.isAuraItem()) {
            this.r0 = var6;
            this.setAuraItem();
        }
    }

    private void setAuraItem() {
        this.x0 = this.x;
        this.y0 = this.y;
        this.iDot = 120;
        this.angle = 0;
        if (!GameCanvas.lowGraphic) {
            this.iAngle = 360 / this.iDot;
            this.xArg = new int[this.iDot];
            this.yArg = new int[this.iDot];
            this.xDot = new int[this.iDot];
            this.yDot = new int[this.iDot];
            this.setDotPostion();
        }
    }

    public final void setPoint(int var1, int var2) {
        this.xEnd = var1;
        this.yEnd = var2;
        this.vx = var1 - this.x >> 2;
        this.vy = var2 - this.y >> 2;
        this.status = 2;
    }

    public final void update() {
        if (this.status == 2 && this.x == this.xEnd && this.y == this.yEnd) {
            GameScr.vItemMap.removeElement(this);
            if (Char.myCharz().itemFocus != null && Char.myCharz().itemFocus.equals(this)) {
                Char.myCharz().itemFocus = null;
            }

        } else {
            if (this.status > 0) {
                if (this.vx == 0) {
                    this.x = this.xEnd;
                }

                if (this.vy == 0) {
                    this.y = this.yEnd;
                }

                if (this.x != this.xEnd) {
                    this.x += this.vx;
                    if (this.vx > 0 && this.x > this.xEnd || this.vx < 0 && this.x < this.xEnd) {
                        this.x = this.xEnd;
                    }
                }

                if (this.y != this.yEnd) {
                    this.y += this.vy;
                    if (this.vy > 0 && this.y > this.yEnd || this.vy < 0 && this.y < this.yEnd) {
                        this.y = this.yEnd;
                    }
                }
            } else {
                this.status = (byte) (this.status - 4);
                if (this.status < -12) {
                    this.y -= 12;
                    this.status = 1;
                }
            }

            if (this.isAuraItem()) {
                this.updateAuraItemEff();
            }
        }
    }

    private void updateAuraItemEff() {
        this.count++;
        this.countAura++;
        if (this.countAura >= 40) {
            this.countAura = 0;
        }
        if (this.count >= this.iDot) {
            this.count = 0;
        }

        if (this.count % 10 == 0 && !GameCanvas.lowGraphic) {
            ServerEffect.addServerEffect(114, this.x - 5, this.y - 30, 1);
        }
    }

    public final void paint(mGraphics g) {
        if (this.isAuraItem()) {
            g.drawImage(TileMap.bong, this.x + 3, this.y, 3);
            if (this.status <= 0) {
                if (this.countAura < 10) {
                    g.drawImage(imageAuraItem1, this.x, this.y + this.status + 3, 33);
                } else {
                    g.drawImage(imageAuraItem2, this.x, this.y + this.status + 3, 33);
                }
            } else if (this.countAura < 10) {
                g.drawImage(imageAuraItem1, this.x, this.y + 3, 33);
            } else {
                g.drawImage(imageAuraItem2, this.x, this.y + 3, 33);
            }
            this.paintAuraItemEffect(g);

        } else {
            if (!this.isAuraItem()) {
                if (GameCanvas.gameTick % 4 == 0) {
                    g.drawImage(imageFlare, this.x, this.y + this.status + 13, 33);
                }

                if (this.status <= 0) {
                    SmallImage.drawSmallImage(g, this.template.iconID, this.x, this.y + this.status + 3, 0, 33);
                } else {
                    SmallImage.drawSmallImage(g, this.template.iconID, this.x, this.y + 3, 0, 33);
                }

                if (Char.myCharz().itemFocus != null && Char.myCharz().itemFocus.equals(this) && this.status != 2) {
                    g.drawRegion(Mob.imgHP, 0, 24, 9, 6, 0, this.x, this.y - 17, 3);
                }
            }

        }
    }

    public void paintAuraItemEffect(mGraphics g) {
        if (!GameCanvas.lowGraphic) {
            for (int i = 0; i < this.yArg.length; ++i) {
                if (this.count == i) {
                    if (this.countAura <= 20) {
                        g.drawImage(imageAuraItem3, this.xDot[i], this.yDot[i] + 3, 33);
                    } else {
                        SmallImage.drawSmallImage(g, this.template.iconID, this.xDot[i], this.yDot[i] + 3, 0, 33);
                    }
                }
            }
        }
    }

    private boolean isAuraItem() {
        boolean var1;
        if (this.template.type == 22) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    private void setDotPostion() {
        if (!GameCanvas.lowGraphic) {
            for (int var1 = 0; var1 < this.yArg.length; ++var1) {
                this.yArg[var1] = Res.g(this.r0 * Res.a(this.angle) / 1024);
                this.xArg[var1] = Res.g(this.r0 * Res.b(this.angle) / 1024);
                if (this.angle < 90) {
                    this.xDot[var1] = this.x0 + this.xArg[var1];
                    this.yDot[var1] = this.y0 - this.yArg[var1];
                } else if (this.angle >= 90 && this.angle < 180) {
                    this.xDot[var1] = this.x0 - this.xArg[var1];
                    this.yDot[var1] = this.y0 - this.yArg[var1];
                } else if (this.angle >= 180 && this.angle < 270) {
                    this.xDot[var1] = this.x0 - this.xArg[var1];
                    this.yDot[var1] = this.y0 + this.yArg[var1];
                } else {
                    this.xDot[var1] = this.x0 + this.xArg[var1];
                    this.yDot[var1] = this.y0 + this.yArg[var1];
                }

                this.angle += this.iAngle;
            }
        }

    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final int getH() {
        return 20;
    }

    public final int getW() {
        return 20;
    }

    public final void stopMoving() {
    }

    public final boolean isInvisible() {
        return false;
    }
}
