package Collections_Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(1,"Ankara");
        map.put(2,"Paris");
        map.put(3,"London");
        System.out.println(map.get(3));


      Set set=map.entrySet();
      Iterator ite=set.iterator();


      while(ite.hasNext()) {
        Map.Entry item=(Map.Entry) ite.next();
          System.out.println(item.getKey()+"=>"+item.getValue());

      }


    }




}
