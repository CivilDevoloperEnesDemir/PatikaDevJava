import java.util.Scanner;

public class project{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int sayi1 = 0, sayi2 = 0, sayi3=0, toplam = 0;

        System.out.print("Sayı giriniz : ");
        sayi3 = inp.nextInt();

        while (sayi3 != sayi1+sayi2){
            toplam = toplam + sayi3;
            sayi1 = sayi2;
            sayi2 = sayi3;
            System.out.print("Sayıyı giriniz : ");
            sayi3 = inp.nextInt();
        }
        System.out.print("Toplam : "+toplam);
    }
}