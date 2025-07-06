package xmap;
import nro.*;

public class XmapUtils {

    public static final int ID_MAP_HOME_BASE = 21;
    public static final int ID_MAP_LANG_BASE = 7;
    public static final int ID_MAP_TTVT_BASE = 24;
    public static final int ID_MAP_SIEU_THI = 84;
    public static final int ID_MAP_TPVGT = 19;
    public static final int ID_MAP_TO_COLD = 109;
    public static final int ID_CAPSULE_NORMAL = 193;
    public static final int ID_CAPSULE_VIP = 194;
    public static int idMapCapsuleReturn;

    public static int getIdMapHome(int cgender) {
        return cgender + 21;
    }

    public static int getIdMapLang(int cgender) {
        return cgender * 7;
    }

    public static int getIdMapTTVT(int cgender) {
        return 24 + cgender;
    }

    public static boolean hasItemId(int id) {
        for (int i = 0; i < Char.myCharz().arrItemBag.length; i++) {
            Item item = Char.myCharz().arrItemBag[i];
            if (item != null && item.itemId == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean canNextMap() {
        return !Char.bG;
    }

    public static boolean canUseCapsuleVip() {
        return false;
    }

    public static boolean canUseCapsuleNormal() {
        return false;
    }

    public static void useCapsuleVip() {
    }

    public static void useCapsuleNormal() {
    }

    public static void changeMap(Waypoint waypoint) {
        teleportMyChar(getX(waypoint),waypoint.maxY);
        if (waypoint.isOffline) {
            Service.gI().getMapOffline();
        } else {
            Service.gI().requestChangeMap();
        }
    }

    public static Waypoint findWaypoint(int mapId) {
        for (int i = 0; i < TileMap.t.size(); i++) {
            Waypoint waypoint = (Waypoint) TileMap.t.elementAt(i);
            if (waypoint != null && getText(waypoint).equals(TileMap.mapNames()[mapId])) {
                return waypoint;
            }
        }
        return null;
    }
    
    public static String getText(Waypoint waypoint) {
        String text = "";
        String[] array = waypoint.popup.c;
        for (int i = 0; i < array.length; i++) {
            text += array[i] + " ";
        }
        return text.trim();
    }

    public static void teleportMyChar(int x, int y) {
        Char.myCharz().cx = x;
        Char.myCharz().cy = y;
        Service.gI().g();
        Char.myCharz().cx = x;
        Char.myCharz().cy = y + 1;
        Service.gI().g();
        Char.myCharz().cx = x;
        Char.myCharz().cy = y;
        Service.gI().g();
    }

    public static Npc findNpc(int tempId) {
        for (int i = 0; i < GameScr.G.size(); i++) {
            Npc npc = (Npc) GameScr.G.elementAt(i);
            if (npc != null && npc.cW.a == tempId) {
                return npc;
            }
        }
        return null;
    }

    public static int getX(Waypoint waypoint) {
        int x = (waypoint.minX + waypoint.maxX) / 2;
        if (x <= 60) {
            x = 18;
        } else if (x >= TileMap.c - 60) {
            x = TileMap.c - 18;
        }
        return x;
    }
}
