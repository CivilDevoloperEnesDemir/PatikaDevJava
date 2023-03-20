import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,geciciSayi,basamakSayisi=0,basamak;
        System.out.print("Bir sayı giriniz :");
        sayi = inp.nextInt();
        geciciSayi = sayi;
        while (geciciSayi>0) {
            basamakSayisi++;
            geciciSayi = geciciSayi/10;
        }
        System.out.println("Basamak Sayısı : "+basamakSayisi);
        geciciSayi = sayi;

        while (geciciSayi>0) {
            basamak = geciciSayi%10;
            geciciSayi = geciciSayi/10;
            System.out.print(basamak+" ");
        }
    }
}
