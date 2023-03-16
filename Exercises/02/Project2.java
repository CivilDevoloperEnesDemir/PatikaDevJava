
// Kullanıcıdan 0-100 arasında bir tamsayıyı okuyan
// ve bu tamsayının rakamları toplamını ekranda gösteren
// programı yazınız. Örneğin:93 Rakamlar Toplamı=9+3=12
// Sayı 0-100 arasında değilse program uyarı versin.

import java.util.Scanner;
public class Project2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num,birler,onlar,total;

        System.out.print("0-100 aralığında bir sayı giriniz : ");
        num = s.nextInt();

        if(num>0 && num<100){
            birler = num % 10;
            onlar = num / 10;
            total = birler + onlar;
            System.out.println("Sayının rakamları toplamı : "+total);
        }

        else
            System.out.print("Hatalı veri girişi !");



    }
}
