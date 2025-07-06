/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmap;

import java.util.Vector;
import nro.Char;
import nro.Service;
import nro.TileMap;
import nro.Waypoint;

/**
 *
 * @author FPTShop
 */
public class XmapController {

    public int mapEnd;
    public Vector way;
    public int indexWay;
    public boolean isNextMapFailed;
    private static XmapController instance;
    public Timer timer;
    public static int interval = 100;

    public XmapController() {
        init();
    }

    private void init() {
        timer = new Timer();
    }

    public static XmapController gI() {
        if (instance == null) {
            instance = new XmapController();
        }
        return instance;
    }

    public void update() {
        if (timer.isWaiting()) {
            return;
        }
        timer.wait(100);
        if (way == null) {
            if (mapEnd >= TileMap.mapNames().length) {
                finishXmap();
                addNoti("Không thể tới địa điểm này!");
                return;
            }
            String mapName = TileMap.mapNames()[mapEnd];
            if (!isNextMapFailed) {
                addNoti("Đi tới: " + mapName);
            }
            if (XmapData.gI().links == null) {
                XmapData.gI().loadLinksMap();
                return;
            }
            try {
                way = XmapAlgorithim.findWay(TileMap.mapID(), mapEnd);
                if (way != null) {
                    Utils.writeLog("Tìm được đường đi qua " + way.size() + " map");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            indexWay = 0;
            if (way == null) {
                addNoti("Không tìm thấy đường đi!");
                finishXmap();
                return;
            }
        }
        if (TileMap.mapID() == ((MapNext) this.way.lastElement()).to && !charDie()) {
            addNoti("Đã tới: " + TileMap.mapNames()[this.mapEnd]);
            finishXmap();
            return;
        }
        MapNext mapNext = (MapNext) this.way.elementAt(this.indexWay);
        if (TileMap.mapID() == mapNext.mapStart) {
            if (charDie()) {
                finishXmap();
                return;
            }
            if (XmapUtils.canNextMap()) {
                nextMap(mapNext);
                addNoti("Next map: " + TileMap.mapNames()[mapNext.to]);
            }
            this.timer.wait(500);
            return;
        }
        if (TileMap.mapID() == mapNext.to) {
            this.indexWay++;
            return;
        }
        isNextMapFailed = true;
        way = null;
    }

    public void finishXmap() {
        this.way = null;
        this.isNextMapFailed = false;
        Xmap.gI().isRunning = false;
        Utils.writeLog("Finish xmap");
    }

    private boolean charDie() {
        return Char.myCharz().statusMe == 14;
    }
    
    public void addNoti(String s) {
    }

    public void nextMap(MapNext mapNext) {
        switch (mapNext.type) {
            case 0:
                NextMapAutoWaypoint(mapNext);
                break;
            case 1:
                NextMapNpcMenu(mapNext);
                break;
            case 2:
                NextMapNpcPanel(mapNext);
                break;
            case 3:
                NextMapPosition(mapNext);
                break;
            case 4:
                NextMapCapsule(mapNext);
                break;
        }
    }

    private void NextMapAutoWaypoint(MapNext mapNext) {
        XmapUtils.changeMap(XmapUtils.findWaypoint(mapNext.to));
    }

    private void NextMapNpcMenu(MapNext mapNext) {
        int num = mapNext.info[0];
        if (num == 38) {
            boolean flag = (XmapUtils.findNpc(num) != null);
            if (!flag) {
                System.out.println("Khong co npc");
                Waypoint waypoint;
                if (TileMap.mapID() == 27 || TileMap.mapID() == 29) {
                    waypoint = XmapUtils.findWaypoint(28);
                } else if (Utils.randomInt(27, 29) == 27) {
                    waypoint = XmapUtils.findWaypoint(27);
                } else {
                    waypoint = XmapUtils.findWaypoint(29);
                }
                XmapUtils.changeMap(waypoint);
                return;
            }
        }
        Service.gI().openMenu(num);
        for (int j = 1; j < mapNext.info.length; j++) {
            int num3 = mapNext.info[j];
            Service.gI().confirmMenu((short) num, (byte) num3);
        }
    }

    private void NextMapNpcPanel(MapNext mapNext) {
        int num = mapNext.info[0];
        int num2 = mapNext.info[1];
        int selected = mapNext.info[2];
        Service.gI().openMenu(num);
        Service.gI().confirmMenu((short) num, (byte) num2);
        Service.gI().requestMapSelect(selected);
    }

    private void NextMapPosition(MapNext mapNext) {
        int x = mapNext.info[0];
        int y = mapNext.info[1];
        XmapUtils.teleportMyChar(x, y);
        Service.gI().requestChangeMap();
        Service.gI().getMapOffline();
    }

    private void NextMapCapsule(MapNext mapNext) {
        XmapUtils.idMapCapsuleReturn = TileMap.mapID();
        int selected = mapNext.info[0];
        Service.gI().requestMapSelect(selected);
    }
}
