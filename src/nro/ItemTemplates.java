package nro;

import nro.ItemTemplate;
import nro.MyHashTable;

public final class ItemTemplates {

    public static MyHashTable itemTemplates = new MyHashTable("item template");

    public static void add(ItemTemplate it) {
        itemTemplates.put(new Short(it.id), it);
    }

    public static ItemTemplate get(short itemTemplateID) {
        return (ItemTemplate) itemTemplates.get(new Short(itemTemplateID));
    }

    public static short getPart(short itemTemplateID) {
        return ItemTemplates.get(itemTemplateID).part;
    }

    public static short getIcon(short itemTemplateID) {
        return ItemTemplates.get(itemTemplateID).iconID;
    }

}
