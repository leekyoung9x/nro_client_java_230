package nro;

import main.GameCanvas;
import nro.ItemTemplate;
import nro.ItemOption;
import nro.MyVector;

public final class Item {

    public ItemOption[] itemOption;
    public ItemTemplate template;
    public MyVector options;
    public int itemId;
    public boolean isSelect;
    public int indexUI;
    public int quantity;
    public int quantilyToBuy;
    public long powerRequire;
    public int j;
    public int k;
    public int l;
    public int m;
    public short iconSpec = -1;
    public byte buyType = -1;
    public boolean p = false;
    public String reason = "";
    public int compare;
    public byte isMe;
    public boolean newItem;
    public int headTemp = -1;
    public int bodyTemp = -1;
    public int legTemp = -1;
    public int bagTemp = -1;

    public Item() {
        int[] color = new int[]{0, 0, 0, 0, 600841, 600841, 667658, 667658, 3346944, 3346688, 4199680, 5052928, 3276851, 3932211, 4587571, 5046280, 6684682, 3359744};
        int[][] colorBorder = new int[][]{{18687, 16869, 15052, 13235, 11161, 9344}, {'\ub300', '\u9900', '\u8000', 26112, 19712, 13056}, {16744192, 15037184, 13395456, 11753728, 10046464, 8404992}, {13500671, 12058853, 10682572, 9371827, 7995545, 6684800}, {16711705, 15007767, 13369364, 11730962, 10027023, 8388621}};
        color = new int[]{2, 1, 1, 1, 1, 1};
    }

    public final void getCompare() {
        this.compare = GameCanvas.panel.getCompare(this);
    }

    public final boolean isHaveOption(int id) {
        for (int i = 0; i < this.itemOption.length; i++) {
            ItemOption itOption = this.itemOption[i];
            if (itOption != null && itOption.optionTemplate.id == id) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTypeBody() {
        return this.template.type >= 0 && this.template.type < 6 || this.template.type == 32 || this.template.type == 35 || this.template.type == 11 || this.template.type == 23;
    }

    public final void setPartTemp(int var1, int var2, int var3, int var4) {
        this.headTemp = var1;
        this.bodyTemp = var2;
        this.legTemp = var3;
        this.bagTemp = var4;
    }
}
