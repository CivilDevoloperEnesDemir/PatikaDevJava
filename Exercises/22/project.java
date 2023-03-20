import java.util.Scanner;
public class project {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int sayi,basamak,toplam=0;
        System.out.print("Bir sayı giriniz : ");
        sayi = inp.nextInt();

        while(sayi>0){
            basamak = sayi%10;
            sayi = sayi/10;
            toplam = toplam + basamak;
        }

        System.out.print("Toplam : "+toplam);

    }
}
