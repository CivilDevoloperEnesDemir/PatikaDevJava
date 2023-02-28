import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        /*
            Java ile kullanıcıların manavdan almış oldukları
            ürünlerin kilogram değerlerine göre toplam tutarını
            ekrana yazdıran programı yazın.

            Meyveler ve KG Fiyatları

            Armut : 2,14 TL
            Elma : 3,67 TL
            Domates : 1,11 TL
            Muz: 0,95 TL
            Patlıcan : 5,00 TL

         */
        double total,armut,elma,domates,muz,patlican,armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.0;

        System.out.print("Armut(Kg):");
        armut=inp.nextDouble();

        System.out.print("Elma(Kg):");
        elma=inp.nextDouble();

        System.out.print("Domates(Kg):");
        domates=inp.nextDouble();

        System.out.print("Muz(Kg):");
        muz=inp.nextDouble();

        System.out.print("Patlıcan(Kg):");
        patlican=inp.nextDouble();

        total=armut*armutFiyat+elma*elmaFiyat+domates*domatesFiyat+muz*muzFiyat+patlican*patlicanFiyat;
        System.out.print("Toplam Tutar\t:"+total+" TL");
    }
}
