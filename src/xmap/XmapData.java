/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmap;

import java.util.Vector;
import nro.Char;
import nro.TileMap;

/**
 *
 * @author FPTShop
 */
public class XmapData {

    private static final int ID_MAP_SIEU_THI = 84;
    private static final int ID_MAP_TPVGT = 19;
    private static final int ID_MAP_TO_COLD = 109;

    public Vector groups = new Vector();

    public static XmapData instance;
    public Vector[] links;
    public boolean isLoading;
    public boolean isLoadingCapsule;
    public boolean isWaitInfoMapTrans;

    public static XmapData gI() {
        if (instance == null) {
            instance = new XmapData();
        }
        return instance;
    }
    
    public void loadLinksMap() {
        isLoading = true;
    }

    public void loadLinksMapBase() {
        try {
            links = new Vector[TileMap.mapNames().length];
            for (int i = 0; i < links.length; i++) {
                links[i] = new Vector();
            }
            loadLinksFromFile("/linkmaps/LinkMapsXmap.txt");
            loadLinksAutoWaypointFromFile("/linkmaps/AutoLinkMapsWaypoint.txt");
            addLinksHome();
            loadLinkSieuThi();
            loadLinkToCold();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadLinksFromFile(String path) {
        try {
            String text = Utils.readTextFromFile(path);
            String[] line = Utils.split(text, "\n");
            for (int i = 0; i < line.length; i++) {
                String textLine = line[i].trim();
                if (textLine.length() == 0 || textLine.indexOf("#") != -1) {
                    continue;
                }
                int[] data = Utils.toIntArray(Utils.split(textLine, " "));
                int mapStart = data[0];
                int to = data[1];
                int type = data[2];

                int lenInfo = data.length - 3;
                int[] info = new int[lenInfo];
                System.arraycopy(data, 3, info, 0, lenInfo);
                links[mapStart].addElement(new MapNext(mapStart, to, type, info));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void loadLinksAutoWaypointFromFile(String path) {
        try {
            String text = Utils.readTextFromFile(path);
            String[] line = Utils.split(text, "\n");
            for (int i = 0; i < line.length; i++) {
                String textLine = line[i].trim();
                if (textLine.length() == 0 || textLine.indexOf("#") != -1) {
                    continue;
                }
                int[] data = Utils.toIntArray(Utils.split(textLine, " "));
                int length = data.length;
                for (int j = 0; j < length; j++) {
                    int mapStart = data[j];
                    if (j != 0) {
                        links[mapStart].addElement(new MapNext(mapStart, data[j - 1], TypeMapNext.AutoWaypoint, new int[0]));
                    }
                    if (j != length - 1) {
                        links[mapStart].addElement(new MapNext(mapStart, data[j + 1], TypeMapNext.AutoWaypoint, new int[0]));
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addLinksHome() {
        int cgender = Char.cgender();
        int mapHome = Char.cgender() + 21;
        int mapLang = Char.cgender() * 7;
        links[mapHome].addElement(new MapNext(mapHome, mapLang, TypeMapNext.AutoWaypoint, new int[0]));
        links[mapLang].addElement(new MapNext(mapLang, mapHome, TypeMapNext.AutoWaypoint, new int[0]));
    }

    public void loadLinkSieuThi() {
        final int npcId = 10;
        final int select = 0;
        int offset = Char.cgender();
        int mapTTVT = 24 + offset;
        int[] info = new int[]{npcId, select};
        links[84].addElement(new MapNext(84, mapTTVT, TypeMapNext.NpcMenu, info));
    }

    public void loadLinkToCold() {
        if (Char.myCharz().taskMaint.taskId <= 30) {
            return;
        }
        final int npcId = 12;
        final int select = 0;
        int[] info = new int[]{npcId, select};
        links[19].addElement(new MapNext(19, 109, TypeMapNext.NpcMenu, info));
    }

    public void loadInfoCapsule() {
        this.loadLinkMapCapsule();
        isLoading = false;
        isLoadingCapsule = false;
    }

    public void loadLinkMapCapsule() {
    }

    public void update() {
        if (!isLoadingCapsule) {
            isWaitInfoMapTrans = true;
            this.loadLinksMapBase();
            if (XmapUtils.canUseCapsuleVip()) {
                XmapUtils.useCapsuleVip();
                isLoadingCapsule = true;
            } else if (XmapUtils.canUseCapsuleNormal()) {
                XmapUtils.useCapsuleNormal();
                isLoadingCapsule = true;
            } else {
                isLoading = false;
            }
        } else if (!isWaitInfoMapTrans) {
            loadInfoCapsule();
        }
    }
}
