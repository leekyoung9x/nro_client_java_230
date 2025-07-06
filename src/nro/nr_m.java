package nro;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;
import main.GameCanvas;
import nro.mResources;
import nro.TField;
import nro.nr_da;

final class nr_m implements CommandListener {

   private TField a;
   private final TextBox b;


   nr_m(TField var1, TextBox var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if(var1.getLabel().equals(mResources.bo)) {
         this.a.a(this.b.getString());
      }

      nr_da.setCurrent(GameMidlet.instance);
      GameCanvas.h.setFullScreenMode(true);
      this.a.h = true;
   }
}
