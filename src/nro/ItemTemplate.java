package nro;

import nro.Res;

public final class ItemTemplate {

    public short id;
    public byte type;
    public byte gender;
    public String name;
    public String description;
    public short iconID;
    public short part;
    public boolean isUpToUp;
    public int strRequire;

    public ItemTemplate(short var1, byte var2, byte var3, String var4, String var5, byte var6, int var7, short var8, short var9, boolean var10) {
        this.id = var1;
        this.type = var2;
        this.gender = var3;
        this.name = var4;
        this.name = Res.changeString(this.name);
        this.description = var5;
        this.description = Res.changeString(this.description);
        this.strRequire = var7;
        this.iconID = var8;
        this.part = var9;
        this.isUpToUp = var10;
    }
}
