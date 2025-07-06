package nro;

public final class ItemOption {

   public int param;
   public byte active;
   public ItemOptionTemplate optionTemplate;


   public ItemOption() {}

   public ItemOption(int optionTemplateId, int param) {
      if(optionTemplateId == 22) {
         optionTemplateId = 6;
         param *= 1000;
      }

      if(optionTemplateId == 23) {
         optionTemplateId = 7;
         param *= 1000;
      }

      this.param = param;
      this.optionTemplate = GameScr.gI().optionTemplateId[optionTemplateId];
   }

    ItemOption(long var8, long var9) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public final String getOptionString() {
      return NinjaUtil.replace(this.optionTemplate.name, "#", String.valueOf(this.param));
   }
}
