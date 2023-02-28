import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        double KdvsizFiyat,KdvOrani,KdvliFiyat,deger1 =0.08,deger2=0.18;
        System.out.print("Fiyat giriniz:");
        KdvsizFiyat=inp.nextDouble();
        KdvOrani= KdvsizFiyat>1000 ? deger1 : deger2;

        KdvliFiyat=(KdvsizFiyat+(KdvsizFiyat*KdvOrani));

        System.out.println("Kdv'siz Fiyat:"+KdvsizFiyat);
        System.out.println("KDV Oranı:"+KdvOrani);
        System.out.println("KDV'li Fiyat:"+KdvliFiyat);

    }
}
