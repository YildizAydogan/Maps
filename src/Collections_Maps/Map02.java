package Collections_Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class Map02 {

    //Ben bir liste tutmak istiyorum. Ornegiun tc numarasina gore adam aratacagim. Tc sini key kismina, Isim-Soyisim vs ise value kismina eklerim
    //sonra keyden arama yaptirir kisi bilgilerine ulasirim
    //Ayni tc de oldugu gibi key benzersiz olmak zorunda
    //aksi takdirde altini cizer, kabul etmez

    public static <Char> void main(String[] args) {
        HashMap list = new HashMap();

        list.put(5, "Halo");
        list.put(2,"cano");
        list.put(7,"filo");
        System.out.println(list);
         //HashMaplerde Listteki gibi add olayi yok Bunun yerine PUT var.Eleman eklemek icin put methodu kullanilir
        //put() : key, value seklinde data eklenir
        //containsKey() :Bir anahtar in varligini kontrol etmek icin sorgulamak icin true/false döner
        //containsValue() :Bir degerin  varligini kontrol etmek icin sorgulamak icin true/false döner
        System.out.println(list.containsKey(5));  // true
        System.out.println(list.containsValue("filo"));   // true
        //EntrySet() : Eklenen datalarin listesini görürüz. Map’deki entry’leri bir Set olarak verir.
        //Entry : Map’de her bir elemani olusturan key-value ikilisidir
        System.out.println("Entry set : " + list.entrySet());
        System.out.println(list.keySet());
        //sadece anahtarlari görürüm. sadece anahtarlari, set yapisiyla olusturup aliyoruz
        //remove() : veriyi silmek icin kullanilir
        System.out.println(list.remove(9)); // sildi ve sildigini kanit olarak console da gösterdi
        System.out.println(list);  //{1236987=filo, 123456789=Halo}
        // hashmap icerisindeki data sayisini entry sayisini bize verir
        System.out.println(list.size()); // 2


        TreeMap lost = new TreeMap();
        lost.put(3, "Hasan");
        lost.put(1, "Emo");
        lost.put(4, "seda");

        System.out.println(lost);

        //Burda int yazamam vrapper class tan almaliyim int yazamam yani
        HashMap<String, Integer> neu =new HashMap<String,Integer>();
        neu.put("HAsan",12);
        neu.put("Cemal",12);
        neu.put("asim",12);
        neu.put("kerim",12);

        System.out.println(neu);

        HashMap<String, String> hay=new HashMap<>();
        HashMap<String, BasicMap> alt=new HashMap<>();
        HashMap<Integer,String> hasan=new HashMap< Integer,String>();

    }

}
