package Collections_Maps;
import java.util.*;
import java.util.Map.Entry;

public class Map03 {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ali", 15);
        map.put("Akif", 52);
        map.put("Asim", 5);
        System.out.println(map);
        System.out.println(map.get("Akif")); // sadece 52 getirdi
        System.out.println(map.keySet()); // tüm keyleri getirdi

        //for döngüsü ile kullanim
        for (Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry);
        }
        //iterator ile yazim
        HashMap it = new HashMap();

        it.put(1, "Ankara");
        it.put(2, "Paris");
        it.put(3, "London");
        System.out.println(it.get(2));


        Set set = it.entrySet();
        Iterator ite = set.iterator();


        while (ite.hasNext()) {
            Map.Entry item = (Map.Entry) ite.next();

            System.out.println(item.getKey() + "=>" + item.getValue());

        }
        // Verilen bir String’deki harfleri
        // ve harflerin kacar kez kullanildigini return eden bir METHOD yaziniz
        // Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3
        //bana map donmesini istedigim icin voidi degiostip map turunden yaziyorum
        // ikinci adimda da döndürmesini istedigim map i olusturuyorum
        // 3. adimda oyle bir baglanti kururuyorumki strdan gelen deger harf harf bölunmus oluyor
        //4. adimda artik harflerin tekrar sayilarini yazdirmaya calismak icin method yaziyorum
        // harflere tek tek ugrasin istiyorum dolayisiyla foreach daha hos duruyor
        //herbir each im arr arrayinde gezsin
        //o harf tekrar etmiyorsa map ime key olarak each, value olarak 1 eklerim
        //zaten varsa  harfsayilarimapi.get(each)+1 girilen harfin valuesini bulur ve 1 artirir
        //ama artirsa bile benim bunu put ile ekleyip her bir each imi yine key olarak alip, valuesini bir artirmam lazim
        // artik yazdirmak yada atamak lazim
        // atamak icin main methodda bir map olusturmam lazim ve data türleri de ayni olmali



        String ifade="Hallooooo";
        Map<String,Integer> saydirdilan=hangiharfkackere(ifade);
        System.out.println(saydirdilan);


    }

    private static Map<String, Integer> hangiharfkackere(String ifade) {
        Map<String,Integer> harfsayilari=new HashMap<>();
        String [] arr=ifade.split("");
        System.out.println(Arrays.toString(arr));
        for (String harf: arr) {
           if (!harfsayilari.containsKey(harf)){
               harfsayilari.put(harf,1);
           }else{
               harfsayilari.put(harf,harfsayilari.get(harf)+1);
           }
        }






        return harfsayilari;
    }
}