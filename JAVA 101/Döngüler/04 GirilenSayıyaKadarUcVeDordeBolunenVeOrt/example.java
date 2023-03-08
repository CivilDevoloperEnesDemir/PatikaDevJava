import java.util.Scanner;
public class example {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        /*

          Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
          3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        */

        int sayi,k=0,top=0,bol=0;

        System.out.print("Lütfen bir sayı giriniz :");
        sayi=inp.nextInt();
/*
        System.out.println("\nFor Kodu İle sonuç;");

        for(int i=0;i<sayi;i++){
            if(i%3==0 && i%4==0){
                System.out.print(i+",");
            }
        }

        System.out.println("\nWhile Kodu ile sonuç;");
*/
        while(k<sayi){
            k++;
            if(k%3==0 && k%4==0){
                top+=k;
                bol+=1;
                System.out.print(k+",");
            }

        }


        int ort=0;
        if(sayi==0){
            ort=0;

        }else if (bol==0){
            System.out.println("Bir sayı sıfıra bölünemez!");

        }else {
            ort=top/bol;

        }

        System.out.println("\nOrtalama:"+ort);



    }
}
