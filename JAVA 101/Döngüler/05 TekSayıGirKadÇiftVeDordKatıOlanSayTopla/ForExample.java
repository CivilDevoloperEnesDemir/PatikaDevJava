import java.util.Scanner;
public class ForExample {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int sayi,toplam=0;
        boolean kosul=true;


        /*

            Java döngüler ile tek bir sayı girilene
            kadar kullanıcıdan girişleri kabul eden
            ve girilen değerlerden çift ve 4'ün kat
            ları   olan   sayıları  toplayıp ekrana
            basan programı yazıyoruz.

         */

        for(;kosul;){
            System.out.print("Sayı giriniz:");
            sayi=inp.nextInt();
            if(sayi%2==0){
                if(sayi%4==0){
                    toplam+=sayi;
                }

            }else{
                System.out.print("Tek sayı girdiğiniz için program sona ermiştir.");
                kosul=false;

            }
        }



        System.out.print("\n4'ün katlarının toplamı : "+toplam);









    }
}
