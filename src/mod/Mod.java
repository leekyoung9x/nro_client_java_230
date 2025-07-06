package mod;

import nro.Service;
import nro.GameScr;
import nro.Time;

public class Mod {
     public static boolean isReadInt = false;// true = int
    
    public static boolean chat(String text) {
        if (text.startsWith("k")) {
            try {
                int zone = Integer.parseInt(text.substring(1));
                Service.gI().f(zone); // Gọi chuyển khu
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if ("anhat".equals(text)) {
            GameScr.anNhat = !GameScr.anNhat;
            new Thread(new Runnable() {
                public void run() {
                    GameScr.autoNhat();
                }
            }).start();
            String status = GameScr.anNhat ? "Bật" : "Tắt";
            GameScr.aC.a("Auto nhặt: " + status, 8);
            return true;
        }

        if ("ts".equals(text)) {
            GameScr.isCheckFuture = !GameScr.isCheckFuture;
            GameScr.aC.a("Tàn sát v3: " + (GameScr.isCheckFuture ? "Bật" : "Tắt"), 0);
            return true;
        }

        if (text != null && text.startsWith("speed")) {
            try {
                String numText = text.substring(5).trim(); // cắt từ sau "speed"
                float speed = Float.parseFloat(numText);
                Time.setTimeScale(speed);
                GameScr.aC.a("Tốc độ mới: " + speed, 8);
                return true;
            } catch (Exception e) {
                GameScr.aC.a("Lỗi tốc độ!", 8);
                e.printStackTrace();
                return true;
            }
        }
        if (text != null && text.startsWith("tdc ")) {
            try {
                String numText = text.substring(4).trim(); // cắt từ sau "tdc "
                int tocDo = Integer.parseInt(numText);
                GameScr.tocdochay = tocDo;
                GameScr.aC.a("Tốc độ chạy mới: " + tocDo, 8);
                return true;
            } catch (Exception e) {
                GameScr.aC.a("Lỗi tốc độ chạy!", 8);
                e.printStackTrace();
                return true;
            }
        }   
        return false; // không phải lệnh mod
    }
}