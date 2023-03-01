import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        int s1,s2,secim;

        System.out.print("Birinci sayıyı giriniz:");
        s1=in.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        s2=in.nextInt();

        System.out.print("Yapmak istediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz:");
        secim=in.nextInt();

        switch (secim) {
            case 1:
                System.out.print("Toplam:"+(s1+s2));
                break;
            case 2:
                System.out.print("Çıkarma:"+(s1-s2));
                break;
            case 3:
                System.out.print("Çarpma:"+(s1*s2));
                break;
            case 4:
                if(s2!=0) {
                    System.out.print("Bölme:" + (s1 / s2));
                }else
                    System.out.print("Bir sayı sıfıra bölünemez!");
                break;
            default:
                System.out.print("Hatalı seçim yaptınız!");
        }

    }
}
