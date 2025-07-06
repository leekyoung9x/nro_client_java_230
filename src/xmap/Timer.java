/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmap;

/**
 *
 * @author Admin
 */
public class Timer {
    private int timeWait;

    private long timeStartWait;

    private boolean isWait;

    public void wait(int milis) {
        this.isWait = true;
        this.timeWait = milis;
        this.timeStartWait = System.currentTimeMillis();
    }

    public boolean isWaiting() {
        boolean flag = (this.isWait && System.currentTimeMillis() - this.timeStartWait >= this.timeWait);
        if (flag) {
            this.isWait = false;
        }
        return this.isWait;
    }
}
