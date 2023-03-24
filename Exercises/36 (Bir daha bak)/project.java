import java.util.Scanner;
public class project {
    public static void main (String[] args) {

        Scanner inp = new Scanner (System.in);

        int sayi1 = 0, sayi2 = 1, sayi3 = 1, gecici, n, zibonacciSayisi = 2;
        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        while (sayi3 < n) {
            gecici = sayi3;
            sayi3 = sayi1 + sayi3;
            sayi1 = sayi2;
            sayi2 = gecici;
            zibonacciSayisi++;
        }

        System.out.println("Zibonacci Sayısı : " + zibonacciSayisi);

    }
}
