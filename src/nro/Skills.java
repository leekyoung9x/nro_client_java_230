package nro;

import nro.Skill;
import nro.MyHashTable;

public final class Skills {

   public static MyHashTable a = new MyHashTable("VSKILL");


   public static void a(Skill var0) {
      a.put(new Short(var0.b), var0);
   }

   public static Skill get(short var0) {
      return (Skill)a.get(new Short(var0));
   }
}
