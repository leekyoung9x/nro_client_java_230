package main;

import javax.microedition.midlet.*;
import nro.*;

public class GameMidlet extends MIDlet {

    public static String IP;
    public static int PORT;
    public static String IP2;
    public static int PORT2;
    private static GameCanvas gameCanvas;
    public static GameMidlet instance;
    private static boolean init;
    public static boolean f;
    public static String VERSION = "2.3.0";

    static {
        GameMidlet.IP = "nrosuno.com";
        GameMidlet.PORT = 14445;
    }

    public GameMidlet() {
        instance = this;
    }

    protected void destroyApp(final boolean b) {
    }

    protected void pauseApp() {
    }

    public void startApp() {
        initGame();
    }

    public final void a() {
        nr_da.ai = false;
        System.gc();
        this.notifyDestroyed();
    }

    public void initGame() {
        if (!GameMidlet.init) {
            instance = this;
            GameMidlet.gameCanvas = new GameCanvas();
            new Thread((Runnable) (GameMidlet.gameCanvas)).start();
            Session_ME.gI().setHandler((IMessageHandler) Controller.gI());
            Session_ME.gI2().setHandler((IMessageHandler) Controller.gI());
            Session_ME.gI2().isMainSession = false;
            SplashScr.loadSplashScr();
            GameCanvas.currentScreen = (mScreen) new SplashScr();
            nr_da.setCurrent(GameMidlet.instance);
            GameMidlet.init = true;
        }
    }
}
