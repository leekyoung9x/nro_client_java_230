/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmap;

import java.util.Vector;
/**
 *
 * @author FPTShop
 */
public class XmapAlgorithim {

    public static Vector findWay(int mapStart, int mapEnd) {
        int length = XmapData.gI().links.length;
        MapNext[] prev = new MapNext[length];
        boolean[] visited = new boolean[length];
        int[] dist = new int[length];
        for (int i = 0; i < length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[mapStart] = 0;
        for (int var = 0; var < length; var++) {
            int cmap = -1;
            for (int i = 0; i < length; i++) {
                if (!visited[i] && (cmap == -1 || dist[i] < dist[cmap])) {
                    cmap = i;
                }
            }
            if (cmap == -1) {
                break;
            }

            Vector neighbors = XmapData.gI().links[cmap];
            int count = neighbors.size();
            for (int i = 0; i < count; i++) {
                MapNext mapNext = (MapNext) neighbors.elementAt(i);
                int cost = 1;
                if (mapNext.type == TypeMapNext.NpcMenu && mapNext.info[0] == 38) {
                    cost = 100;
                }
                int tentative = dist[cmap] + cost;
                if (tentative < dist[mapNext.to]) {
                    dist[mapNext.to] = tentative;
                    prev[mapNext.to] = mapNext;
                }
            }
            visited[cmap] = true;
        }
        Vector way = new Vector();
        int index = mapEnd;
        while (index != mapStart) {
            way.addElement(prev[index]);
            index = prev[index].mapStart;
        }
        way = Utils.reverseVector(way);
        if (((MapNext) way.firstElement()).mapStart == mapStart) {
            return way;
        }
        return null;
    }
}
