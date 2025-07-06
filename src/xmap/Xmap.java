/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmap;

import main.GameCanvas;
import nro.GameScr;

/**
 *
 * @author FPTShop
 */
public class Xmap {

    public boolean isRunning;
    public static Xmap instance;
    public static boolean isUseCapsuleNormal;
    public static boolean isUseCapsuleVip;

    public Xmap() {
        this.init();
    }

    private void init() {

    }

    public static Xmap gI() {
        if (instance == null) {
            instance = new Xmap();
        }
        return instance;
    }

    public void update() {
        if (XmapData.gI().isLoading) {
            XmapData.gI().update();
        } else if (isRunning) {
            XmapController.gI().update();
        }
    }

    public void start(int mapId) {
        if (isRunning) {
            XmapController.gI().finishXmap();
        }
        XmapController.gI().mapEnd = mapId;
        isRunning = true;
    }
}
