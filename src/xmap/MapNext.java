/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmap;

/**
 *
 * @author FPTShop
 */
public class MapNext {

    public int mapStart;
    public int to;
    public int type;
    public int[] info;

    public MapNext(int mapStart, int to, int type, int[] info) {
        this.mapStart = mapStart;
        this.to = to;
        this.type = type;
        this.info = info;
    }
}
