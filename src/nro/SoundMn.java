package nro;

import main.GameCanvas;

public final class SoundMn {

    public static boolean a = false;
    private static SoundMn d;
    public static float b = 0.5F;
    public static int c = 30;

    public static SoundMn gI() {
        if (d == null) {
            d = new SoundMn();
        }
        return d;
    }

    public final void AuraToolOption() {
        if (Char.cS) {
            Rms.saveRMSInt("isPaintAura", 0);
            Char.cS = false;
        } else {
            Rms.saveRMSInt("isPaintAura", 1);
            Char.cS = true;
        }

        getStrOption();
    }

    public final void CaseAnalog() {
        if (GameCanvas.isTouch) {
            if (GameScr.isAnalog == 0) {
                GameScr.isAnalog = 1;
                Rms.saveRMSInt("analog", GameScr.isAnalog);
                GameScr.setSkillBarPostion();
            } else {
                GameScr.isAnalog = 0;
                Rms.saveRMSInt("analog", GameScr.isAnalog);
                GameScr.setSkillBarPostion();
            }
        } else {
            if (GameScr.isPaintChatVip = !GameScr.isPaintChatVip) {
                Rms.saveRMSInt("serverchat", 0);
            } else {
                Rms.saveRMSInt("serverchat", 1);
            }
        }
        getStrOption();
    }

    public final void d() {
        if (GameCanvas.lowGraphic) {
            Rms.saveRMSInt("lowGraphic", 0);
            GameCanvas.startOK(mResources.plsRestartGame, 8885, (Object) null);
        } else {
            Rms.saveRMSInt("lowGraphic", 1);
            GameCanvas.startOK(mResources.plsRestartGame, 8885, (Object) null);
        }
        getStrOption();
    }

    public final void AuraToolOption2() {
        if (Char.isPaintAura2) {
            Rms.saveRMSInt("isPaintAura2", 0);
            Char.isPaintAura2 = false;
        } else {
            Rms.saveRMSInt("isPaintAura2", 1);
            Char.isPaintAura2 = true;
        }
        getStrOption();
    }

    public static void getSoundOption() {
        if (GameCanvas.loginScr.isLogin2 && Char.myCharz().taskMaint != null && Char.myCharz().taskMaint.taskId >= 2) {
            Panel.strTool = new String[]{mResources.f, mResources.bP, mResources.bO, mResources.bN, mResources.aC, mResources.bM, mResources.al, mResources.bQ, mResources.P, mResources.E};
            if (Char.myCharz().havePet) {
                Panel.strTool = new String[]{mResources.f, mResources.bP, mResources.bO, mResources.t, mResources.bN, mResources.aC, mResources.bM, mResources.al, mResources.bQ, mResources.P, mResources.E};
            }
        } else {
            Panel.strTool = new String[]{mResources.f, mResources.bP, mResources.bO, mResources.bN, mResources.aC, mResources.bM, mResources.al, mResources.bQ, mResources.P};
            if (Char.myCharz().havePet) {
                Panel.strTool = new String[]{mResources.f, mResources.bP, mResources.bO, mResources.t, mResources.bN, mResources.aC, mResources.bM, mResources.al, mResources.bQ, mResources.P};
            }
        }

        if (a) {
            String[] var0 = new String[Panel.strTool.length + 1];

            for (int var1 = 0; var1 < Panel.strTool.length; ++var1) {
                var0[var1] = Panel.strTool[var1];
            }

            var0[Panel.strTool.length] = mResources.a;
            Panel.strTool = var0;
        }

    }

    public static void getStrOption() {
        String var0 = "[ON]   ";
        String var1 = "[OFF]  ";
        String var2 = GameScr.isAnalog == 0 ? var1 + mResources.B : var0 + mResources.C;
        if (!GameCanvas.isTouch) {
            var2 = !GameScr.isPaintChatVip ? var1 + mResources.bT : var0 + mResources.bT;
        }
        Panel.F = new String[]{Char.cS ? var0 + mResources.bX.trim() : var1 + mResources.bX.trim(), Char.isPaintAura2 ? var0 + mResources.bY.trim() : var1 + mResources.bY.trim(), GameCanvas.ae ? var0 + mResources.fx.trim() : var1 + mResources.fx.trim(), GameCanvas.lowGraphic ? var0 + mResources.v.trim() : var1 + mResources.v.trim(), var2};
    }

    public static void h() {
        Session_ME.gI().e();
        GameCanvas.panel.A();
        GameCanvas.loginScr.f();
        GameCanvas.loginScr.b();
    }
}
