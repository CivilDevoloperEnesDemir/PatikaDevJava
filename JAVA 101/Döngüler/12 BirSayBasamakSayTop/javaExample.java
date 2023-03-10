import java.util.Scanner;
public class javaExample {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int tempNumber,number,total=0;

        System.out.print("Bir sayı giriniz :");
        number = inp.nextInt();

        tempNumber = number;
        /*

            Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
            Örnek : 1643 = 1 + 6 + 4 + 3 = 14

         */


        while ( number!=0 ) {

            int basValue = 0;
            basValue = number%10;

            /*
                Örn:213 sayısı
                1.Adımda basValue=213/10   ---> basValue=3
                2.Adımda basValue=21/10    ---> basValue=1
                3.Adımda basValue=2/10     ---> basValue=2
             */

            total = total+basValue;

            /*
                Örn:213
                1.Adımda Total=0+3
                2.Adımda Total=3+1
                3.Adımda Total=4+3 ---> Total=7
             */

            number = number/10;

            /*
                Örn:213
                1.Adımda Number=213/10  ---> Number=21
                2.Adımda Number=21/10   ---> Number=2
                3.Adımda Number=2/10    ---> Number=0
             */

        }

        System.out.println(tempNumber+" sayısının basamak değerleri toplamı :"+total);

    }
}
