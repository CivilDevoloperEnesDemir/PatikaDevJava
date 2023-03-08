import java.util.Scanner;
public class example {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        /*

          Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
          3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        */

        int sayi,k=0;
        System.out.print("Lütfen bir sayı giriniz :");
        sayi=inp.nextInt();

        System.out.println("\nFor Kodu İle sonuç;");

        for(int i=0;i<sayi;i++){
            if(i%3==0 && i%4==0){
                System.out.print(i+",");
            }
        }

        System.out.println("\nWhile Kodu ile sonuç;");

        while(k<sayi){

            if(k%3==0 && k%4==0){
                System.out.print(k+",");
            }
            ++k;
        }



    }
}
