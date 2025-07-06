package nro;

import main.GameCanvas;
import nro.Char;
import nro.PopUp;
import nro.InfoDlg;
import nro.Service;
import nro.TileMap;
import nro.Command;
import nro.nr_df;
import nro.Res;
import nro.GameScr;
import nro.IActionListener;

public final class Waypoint implements IActionListener {

    public short minX;
    public short minY;
    public short maxX;
    public short maxY;
    public boolean isEnter;
    public boolean isOffline;
    public PopUp popup;

    public Waypoint(short minX, short minY, short maxX, short maxY, boolean inEnter, boolean inOffline, String name) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        name = Res.changeString(name);
        this.isEnter = inEnter;
        this.isOffline = inOffline;
        if (TileMap.l != 21 && TileMap.l != 22 && TileMap.l != 23 || this.minX < 0 || this.minX > 24) {
            if ((TileMap.l != 0 || Char.myCharz().cgender == 0) && (TileMap.l != 7 || Char.myCharz().cgender == 1) && (TileMap.l != 14 || Char.myCharz().cgender == 2) || !inOffline) {
                if (!TileMap.f() && TileMap.l != 47) {
                    if (!inEnter && !inOffline) {
                        this.popup = new PopUp(name, minX, minY - 24);
                        this.popup.i = new Command((String) null, this, 1, this);
                        this.popup.h = true;
                        this.popup.j = false;
                        PopUp.a(this.popup);
                    } else {
                        if (TileMap.b()) {
                            this.popup = new PopUp(name, minX, minY - 16);
                        } else {
                            int var8 = minX + (maxX - minX) / 2;
                            this.popup = new PopUp(name, var8, minY - (minY != 0 ? 16 : -32));
                        }

                        this.popup.i = new Command((String) null, this, 2, this);
                        this.popup.h = true;
                        this.popup.j = false;
                        PopUp.a(this.popup);
                    }

                    TileMap.t.addElement(this);
                } else if (minY <= 150 || !TileMap.f()) {
                    this.popup = new PopUp(name, minX + (maxX - minX) / 2, maxY - (minX > 100 ? 24 : 48));
                    this.popup.i = new Command((String) null, this, 1, this);
                    this.popup.h = true;
                    this.popup.j = false;
                    PopUp.a(this.popup);
                    TileMap.t.addElement(this);
                }
            }
        }
    }

    public final void perform(int var1, Object var2) {
        switch (var1) {
            case 1:
                var1 = (this.minX + this.maxX) / 2;
                int var4 = this.maxY;
                if (this.maxY > this.minY + 24) {
                    var4 = (this.minY + this.maxY) / 2;
                }

                GameScr.gI().aW = 0;
                Char.myCharz().bO = new nr_df(var1, var4);
                Char.myCharz().I = Char.myCharz().cx - Char.myCharz().bO.a > 0 ? -1 : 1;
                Service.gI().g();
                return;
            case 2:
                GameScr.gI().aW = 0;
                if (Char.myCharz().i() != null) {
                    Service.gI().g();
                    InfoDlg.a();
                    Service.gI().getMapOffline();
                    Char.bF = true;
                    return;
                }
                if (Char.myCharz().j() != null) {
                    Service.gI().g();
                    Service.gI().requestChangeMap();
                    Char.bG = true;
                    Char.bF = true;
                    GameCanvas.f();
                    GameCanvas.e();
                    InfoDlg.a();
                    return;
                }
                var1 = (this.minX + this.maxX) / 2;
                short var3 = this.maxY;
                Char.myCharz().bO = new nr_df(var1, var3);
                Char.myCharz().I = Char.myCharz().cx - Char.myCharz().bO.a > 0 ? -1 : 1;
                Char.myCharz().ax = new Command((String) null, this, 2, (Object) null);
            default:
        }
    }
}
