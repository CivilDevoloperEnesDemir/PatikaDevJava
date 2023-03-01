import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
        Scanner inp=new Scanner (System.in);

        int s1,s2,secim;

        System.out.print("Birinci sayıyı giriniz:");
        s1=inp.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        s2=inp.nextInt();

        System.out.print("Yapmak istediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz:");
        secim=inp.nextInt();

        if (secim==1) {
            System.out.print("Toplam:"+(s1+s2));

        } else if (secim==2) {
            System.out.print("Çıkarma:"+(s1-s2));

        } else if (secim==3) {
            System.out.print("Çarpım:"+(s1*s2));

        } else if (secim==4) {
            if(s2==0){
                System.out.print("Hata! Bir sayı sıfıra bölünemez!");
            }else{
                System.out.print("Bölme:"+(s1/s2));
            }

        }else {
            System.out.print("Lütfen geçerli bir işlem seçiniz!");
        }


    }
}
