import java.util.Scanner;
public class ProjectDeneme {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        /*
         N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
         sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
         Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
         Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
         */

        // Kullanıcıdan bir sayı alalım.

        int number,fakeNumber,result=0;

        System.out.print("Bir sayı giriniz:");
        number=inp.nextInt();

        // Sayı değerini sonraki işlemlerde kullanbilmek için yeni bir değere atadım.
        fakeNumber=number;

        // Sayının kaç basamaklı olduğunu bulalım.

        int basamakSayisi=0;

        while(fakeNumber!=0) {
            fakeNumber=fakeNumber/10;
            basamakSayisi++;
        }

        // Kaç kere üst alınması gerektiğini bulduk.
        // Şimdi girilen sayıyı basamaklarına ayırıp üstlerini alalım.
        fakeNumber=number;

        while(fakeNumber!=0) {
            // Son basamaktaki rakamı bulduk.Şimdi bu rakamın üstünü alalım.
            int basamak;
            basamak=fakeNumber%10;
            int basamakUsSonucu=1;
            for(int i=1;i<=basamakSayisi;i++){
                basamakUsSonucu=basamakUsSonucu*basamak;
            }

            // Her seferde bir basamak azaltmak için bu işlemi yapıyorum.
            fakeNumber=fakeNumber/10;
            result=result+basamakUsSonucu;
        }

        if (result==number){
            System.out.print(number+" Sayısı bir armstrong sayıdır.");
        }else
            System.out.print(number+" Sayısı bir armstrong sayı değildir.");










    }
}
