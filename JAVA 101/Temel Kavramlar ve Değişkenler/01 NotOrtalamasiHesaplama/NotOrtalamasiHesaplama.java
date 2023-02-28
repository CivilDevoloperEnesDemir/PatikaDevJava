import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main (String[] args){

        Scanner input=new Scanner(System.in);

        int matematik,fizik,kimya,turkce,tarih,muzik;

        String sonuc;

        System.out.println("Sırasıyla sınav sonuçlarınızı giriniz.");

        System.out.print("Matematik:");
        matematik=input.nextInt();

        System.out.print("Fizik:");
        fizik=input.nextInt();

        System.out.print("Kimya:");
        kimya=input.nextInt();

        System.out.print("Türkçe:");
        turkce=input.nextInt();

        System.out.print("Tarih:");
        tarih=input.nextInt();

        System.out.print("Müzik:");
        muzik=input.nextInt();

        double ortalama = (matematik + fizik + kimya + tarih + turkce + muzik) / 6.0;

        System.out.print("Ortalamanız:"+ortalama);

        sonuc = (ortalama>60) ? "\nSınıfı Geçtiniz.":"\nSınıfta Kaldınız.";

        System.out.println(sonuc);



    }
}
