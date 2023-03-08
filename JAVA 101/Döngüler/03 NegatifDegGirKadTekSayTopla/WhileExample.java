import java.util.Scanner;
public class WhileExample {
    public static void main(String[] args){

         /*

            Java döngüler ile negatif bir değer girilene kadar kullanıcıdan
            girişleri kabul eden ve girilen değerlerden tek sayıları
            toplayıp ekrana basan programı yazıyoruz.

         */

        Scanner input=new Scanner(System.in);
        int sayi, toplam = 0;
        boolean kosul=true;


       while(kosul) {

           System.out.print("Sayı girin:");
           sayi = input.nextInt();

           if (sayi >= 0) {

               if (sayi % 2 != 0) {
                   toplam = toplam + sayi;

               }

           }else {
               kosul = false;

           }


       }

        System.out.println("Girilen tek sayıların toplamı :"+toplam);


    }
}
