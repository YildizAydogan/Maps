package Collections_Maps;

import java.util.ArrayList;
import java.util.List;

public class BasicMap {
    public static void main(String[] args) {
        //Biz herhangi bir SET yapisinda verileri duzensiz olarak tutabiliriz
        //Yada bir LIST icerisinde ekleme sirasina göre verilerimizi duzenli olarak tutabiliyoruz.
        //Fakat MAP yapisinda biz, datalari bu ikisinden farkli olarak key ve value seklinde tutuyoruz.
        //Maplerde unique key ve degisken olacabilecek valuelarimiz vardir.
        //Ve biz bir yerden desimeyen keyimizi cagirdigimizda bize valuesini tertemiz getirir
        //Bizim Map interface yardimiyla kullanabilcegimiz iki stardart yapi var :1-HashMap  2-TreeMap
        //HashMap yapisinda eklenme siralamasi diye birsey yok. Kendi algoritmasi var ve kendince bir duzen olusturuyor
        //Fakat TreeMapte hic olmazsa istememiz durumunda anahtarlara gore bir siralama yapabiliriz. Ama tabi bunda eklenme sirasi yine onemli degil.
        //Yani ben rastgele bir liste olusturuyorum ve bu liste 1_Hashmapte jabvanin kendi algoritmasina gore kendince bir siralamayla konsolda görülüyor
        //2-TreeMapte ise istersem buyukten kucuge, kucukten buyuge bir siralama olusturtabilirim. Istemezsemde canim sagolsun :)
        //Kullanim Amaci :
        //1-Elinizdeki datalarin bir referansi varsa Map kullanmak isteyebilirsiniz
        //Mesela elimde calisanlarin maaslarini tutabilecegim bir liste var:



     //*****************List ile yazim neden funktionel degildir!!*******************
        List<String> isimler1 = new ArrayList<>();
        isimler1.add("Apo");
        isimler1.add("Dilo");
        isimler1.add("Ibo");
        isimler1.add("Bilo");

        List<Integer> maaslar1 = new ArrayList<>();
        maaslar1.add(4000);
        maaslar1.add(5000);
        maaslar1.add(3500);
        maaslar1.add(6000);

        System.out.println(isimler1);
        System.out.println(maaslar1);
    //*****************List ile yazim neden funktionel degildir!!*******************
       List<String> maaslar = new ArrayList<>();
        maaslar.add("4000");  //
        maaslar.add("5000");   //
        maaslar.add("3500");  //
        maaslar.add("6000");   //
        //Peki biz bu listede yazan maaslarin kime ait oldugunu nerden bilcez. Ya elimizde bir baska liste olcak
        List<String> isimler = new ArrayList<>();
        isimler.add("Apo");
        isimler.add("Dilo");
        isimler.add("Ibo");
        isimler.add("Bilo");

        isimler.addAll(maaslar);
        System.out.println(isimler);





    }

}
